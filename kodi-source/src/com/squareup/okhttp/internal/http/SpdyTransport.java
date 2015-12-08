// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.spdy.Header;
import com.squareup.okhttp.internal.spdy.SpdyConnection;
import com.squareup.okhttp.internal.spdy.SpdyStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import okio.Okio;
import okio.Sink;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            Transport, OkHeaders, StatusLine, RequestLine, 
//            HttpEngine, RealResponseBody, RetryableSink

public final class SpdyTransport
    implements Transport
{

    private static final List HTTP_2_PROHIBITED_HEADERS = Util.immutableList(new ByteString[] {
        ByteString.encodeUtf8("connection"), ByteString.encodeUtf8("host"), ByteString.encodeUtf8("keep-alive"), ByteString.encodeUtf8("proxy-connection"), ByteString.encodeUtf8("te"), ByteString.encodeUtf8("transfer-encoding"), ByteString.encodeUtf8("encoding"), ByteString.encodeUtf8("upgrade")
    });
    private static final List SPDY_3_PROHIBITED_HEADERS = Util.immutableList(new ByteString[] {
        ByteString.encodeUtf8("connection"), ByteString.encodeUtf8("host"), ByteString.encodeUtf8("keep-alive"), ByteString.encodeUtf8("proxy-connection"), ByteString.encodeUtf8("transfer-encoding")
    });
    private final HttpEngine httpEngine;
    private final SpdyConnection spdyConnection;
    private SpdyStream stream;

    public SpdyTransport(HttpEngine httpengine, SpdyConnection spdyconnection)
    {
        httpEngine = httpengine;
        spdyConnection = spdyconnection;
    }

    private static boolean isProhibitedHeader(Protocol protocol, ByteString bytestring)
    {
        if (protocol == Protocol.SPDY_3)
        {
            return SPDY_3_PROHIBITED_HEADERS.contains(bytestring);
        }
        if (protocol == Protocol.HTTP_2)
        {
            return HTTP_2_PROHIBITED_HEADERS.contains(bytestring);
        } else
        {
            throw new AssertionError(protocol);
        }
    }

    private static String joinOnNull(String s, String s1)
    {
        return (new StringBuilder(s)).append('\0').append(s1).toString();
    }

    public static com.squareup.okhttp.Response.Builder readNameValueBlock(List list, Protocol protocol)
        throws IOException
    {
        String s1 = null;
        String s = "HTTP/1.1";
        com.squareup.okhttp.Headers.Builder builder = new com.squareup.okhttp.Headers.Builder();
        builder.set(OkHeaders.SELECTED_PROTOCOL, protocol.toString());
        int i = 0;
        int i1 = list.size();
        do
        {
            if (i >= i1)
            {
                break;
            }
            ByteString bytestring = ((Header)list.get(i)).name;
            String s5 = ((Header)list.get(i)).value.utf8();
            int j = 0;
            while (j < s5.length()) 
            {
                int l = s5.indexOf('\0', j);
                int k = l;
                if (l == -1)
                {
                    k = s5.length();
                }
                String s4 = s5.substring(j, k);
                String s2;
                String s3;
                if (bytestring.equals(Header.RESPONSE_STATUS))
                {
                    s2 = s4;
                    s3 = s;
                } else
                if (bytestring.equals(Header.VERSION))
                {
                    s3 = s4;
                    s2 = s1;
                } else
                {
                    s2 = s1;
                    s3 = s;
                    if (!isProhibitedHeader(protocol, bytestring))
                    {
                        builder.add(bytestring.utf8(), s4);
                        s2 = s1;
                        s3 = s;
                    }
                }
                j = k + 1;
                s1 = s2;
                s = s3;
            }
            i++;
        } while (true);
        if (s1 == null)
        {
            throw new ProtocolException("Expected ':status' header not present");
        } else
        {
            list = StatusLine.parse((new StringBuilder()).append(s).append(" ").append(s1).toString());
            return (new com.squareup.okhttp.Response.Builder()).protocol(protocol).code(((StatusLine) (list)).code).message(((StatusLine) (list)).message).headers(builder.build());
        }
    }

    public static List writeNameValueBlock(Request request, Protocol protocol, String s)
    {
        ArrayList arraylist;
        String s1;
        Headers headers = request.headers();
        arraylist = new ArrayList(headers.size() + 10);
        arraylist.add(new Header(Header.TARGET_METHOD, request.method()));
        arraylist.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        s1 = HttpEngine.hostHeader(request.url());
        int i;
        int k;
        if (Protocol.SPDY_3 == protocol)
        {
            arraylist.add(new Header(Header.VERSION, s));
            arraylist.add(new Header(Header.TARGET_HOST, s1));
        } else
        if (Protocol.HTTP_2 == protocol)
        {
            arraylist.add(new Header(Header.TARGET_AUTHORITY, s1));
        } else
        {
            throw new AssertionError();
        }
        arraylist.add(new Header(Header.TARGET_SCHEME, request.url().getProtocol()));
        request = new LinkedHashSet();
        i = 0;
        k = headers.size();
        break MISSING_BLOCK_LABEL_165;
_L5:
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_165;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        s = ByteString.encodeUtf8(headers.name(i).toLowerCase(Locale.US));
        s1 = headers.value(i);
        if (!isProhibitedHeader(protocol, s) && !s.equals(Header.TARGET_METHOD) && !s.equals(Header.TARGET_PATH) && !s.equals(Header.TARGET_SCHEME) && !s.equals(Header.TARGET_AUTHORITY) && !s.equals(Header.TARGET_HOST) && !s.equals(Header.VERSION))
        {
label0:
            {
                if (!request.add(s))
                {
                    break label0;
                }
                arraylist.add(new Header(s, s1));
            }
        }
        break MISSING_BLOCK_LABEL_204;
        int j = 0;
_L3:
        if (j < arraylist.size())
        {
label1:
            {
                if (!((Header)arraylist.get(j)).name.equals(s))
                {
                    break label1;
                }
                arraylist.set(j, new Header(s, joinOnNull(((Header)arraylist.get(j)).value.utf8(), s1)));
            }
        }
        continue; /* Loop/switch isn't completed */
        j++;
        if (true) goto _L3; else goto _L1
_L1:
        return arraylist;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean canReuseConnection()
    {
        return true;
    }

    public Sink createRequestBody(Request request, long l)
        throws IOException
    {
        return stream.getSink();
    }

    public void finishRequest()
        throws IOException
    {
        stream.getSink().close();
    }

    public ResponseBody openResponseBody(Response response)
        throws IOException
    {
        return new RealResponseBody(response.headers(), Okio.buffer(stream.getSource()));
    }

    public com.squareup.okhttp.Response.Builder readResponseHeaders()
        throws IOException
    {
        return readNameValueBlock(stream.getResponseHeaders(), spdyConnection.getProtocol());
    }

    public void releaseConnectionOnIdle()
    {
    }

    public void writeRequestBody(RetryableSink retryablesink)
        throws IOException
    {
        retryablesink.writeToSocket(stream.getSink());
    }

    public void writeRequestHeaders(Request request)
        throws IOException
    {
        if (stream != null)
        {
            return;
        } else
        {
            httpEngine.writingRequestHeaders();
            boolean flag = httpEngine.permitsRequestBody();
            String s = RequestLine.version(httpEngine.getConnection().getProtocol());
            stream = spdyConnection.newStream(writeNameValueBlock(request, spdyConnection.getProtocol(), s), flag, true);
            stream.readTimeout().timeout(httpEngine.client.getReadTimeout(), TimeUnit.MILLISECONDS);
            return;
        }
    }

}
