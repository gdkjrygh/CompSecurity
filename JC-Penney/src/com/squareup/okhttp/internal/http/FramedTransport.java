// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import c.ac;
import c.ae;
import c.k;
import c.r;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.framed.FramedStream;
import com.squareup.okhttp.internal.framed.Header;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            Transport, OkHeaders, StatusLine, RequestLine, 
//            RealResponseBody, RetryableSink, HttpEngine

public final class FramedTransport
    implements Transport
{

    private static final List HTTP_2_PROHIBITED_HEADERS = Util.immutableList(new k[] {
        k.a("connection"), k.a("host"), k.a("keep-alive"), k.a("proxy-connection"), k.a("te"), k.a("transfer-encoding"), k.a("encoding"), k.a("upgrade")
    });
    private static final List SPDY_3_PROHIBITED_HEADERS = Util.immutableList(new k[] {
        k.a("connection"), k.a("host"), k.a("keep-alive"), k.a("proxy-connection"), k.a("transfer-encoding")
    });
    private final FramedConnection framedConnection;
    private final HttpEngine httpEngine;
    private FramedStream stream;

    public FramedTransport(HttpEngine httpengine, FramedConnection framedconnection)
    {
        httpEngine = httpengine;
        framedConnection = framedconnection;
    }

    private static boolean isProhibitedHeader(Protocol protocol, k k1)
    {
        if (protocol == Protocol.SPDY_3)
        {
            return SPDY_3_PROHIBITED_HEADERS.contains(k1);
        }
        if (protocol == Protocol.HTTP_2)
        {
            return HTTP_2_PROHIBITED_HEADERS.contains(k1);
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
    {
        String s = null;
        String s1 = "HTTP/1.1";
        com.squareup.okhttp.Headers.Builder builder = new com.squareup.okhttp.Headers.Builder();
        builder.set(OkHeaders.SELECTED_PROTOCOL, protocol.toString());
        int j1 = list.size();
        int i = 0;
        do
        {
            if (i >= j1)
            {
                break;
            }
            k k1 = ((Header)list.get(i)).name;
            String s3 = ((Header)list.get(i)).value.a();
            int j = 0;
            while (j < s3.length()) 
            {
                int i1 = s3.indexOf('\0', j);
                int l = i1;
                if (i1 == -1)
                {
                    l = s3.length();
                }
                String s2 = s3.substring(j, l);
                if (k1.equals(Header.RESPONSE_STATUS))
                {
                    s = s2;
                } else
                if (k1.equals(Header.VERSION))
                {
                    s1 = s2;
                } else
                if (!isProhibitedHeader(protocol, k1))
                {
                    builder.add(k1.a(), s2);
                }
                j = l + 1;
            }
            i++;
        } while (true);
        if (s == null)
        {
            throw new ProtocolException("Expected ':status' header not present");
        } else
        {
            list = StatusLine.parse((new StringBuilder()).append(s1).append(" ").append(s).toString());
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
        arraylist.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.httpUrl())));
        s1 = Util.hostHeader(request.httpUrl());
        int i;
        int l;
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
        arraylist.add(new Header(Header.TARGET_SCHEME, request.httpUrl().scheme()));
        request = new LinkedHashSet();
        l = headers.size();
        i = 0;
        break MISSING_BLOCK_LABEL_165;
_L5:
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_165;
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s = k.a(headers.name(i).toLowerCase(Locale.US));
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
                arraylist.set(j, new Header(s, joinOnNull(((Header)arraylist.get(j)).value.a(), s1)));
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

    public ac createRequestBody(Request request, long l)
    {
        return stream.getSink();
    }

    public void disconnect(HttpEngine httpengine)
    {
        if (stream != null)
        {
            stream.close(ErrorCode.CANCEL);
        }
    }

    public void finishRequest()
    {
        stream.getSink().close();
    }

    public ResponseBody openResponseBody(Response response)
    {
        return new RealResponseBody(response.headers(), r.a(stream.getSource()));
    }

    public com.squareup.okhttp.Response.Builder readResponseHeaders()
    {
        return readNameValueBlock(stream.getResponseHeaders(), framedConnection.getProtocol());
    }

    public void releaseConnectionOnIdle()
    {
    }

    public void writeRequestBody(RetryableSink retryablesink)
    {
        retryablesink.writeToSocket(stream.getSink());
    }

    public void writeRequestHeaders(Request request)
    {
        if (stream != null)
        {
            return;
        } else
        {
            httpEngine.writingRequestHeaders();
            boolean flag = httpEngine.permitsRequestBody();
            String s = RequestLine.version(httpEngine.getConnection().getProtocol());
            stream = framedConnection.newStream(writeNameValueBlock(request, framedConnection.getProtocol(), s), flag, true);
            stream.readTimeout().timeout(httpEngine.client.getReadTimeout(), TimeUnit.MILLISECONDS);
            return;
        }
    }

}
