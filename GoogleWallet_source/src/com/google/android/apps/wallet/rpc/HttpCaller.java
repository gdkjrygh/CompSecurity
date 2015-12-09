// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Scanner;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            RpcException, PayloadSerializer

public class HttpCaller
{

    private static final String TAG = com/google/android/apps/wallet/rpc/HttpCaller.getSimpleName();
    private final PayloadSerializer payloadSerializer;

    public HttpCaller(PayloadSerializer payloadserializer)
    {
        payloadSerializer = payloadserializer;
    }

    private RpcException buildBadHttpResponseException(int i, boolean flag, HttpURLConnection httpurlconnection)
    {
        Object obj;
        Object obj1;
        obj1 = Optional.absent();
        obj = obj1;
        InputStream inputstream = httpurlconnection.getErrorStream();
        if (inputstream == null) goto _L2; else goto _L1
_L1:
        obj = Optional.of(readInputStreamToByteArray(inputstream));
        obj1 = obj;
        obj = obj1;
        closeQuietly(inputstream);
        if (!flag) goto _L4; else goto _L3
_L3:
        obj = obj1;
        WLog.dfmt(TAG, "non-OK status code with stack trace: %d %s\n%s", new Object[] {
            Integer.valueOf(i), httpurlconnection.getResponseMessage(), new String((byte[])((Optional) (obj1)).get(), Charsets.UTF_8)
        });
        obj = obj1;
        try
        {
            return new RpcException("non-OK status code, has stack trace");
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection) { }
        break MISSING_BLOCK_LABEL_129;
        httpurlconnection;
        obj = obj1;
        closeQuietly(inputstream);
        obj = obj1;
        throw httpurlconnection;
        if (!((Optional) (obj)).isPresent())
        {
            break MISSING_BLOCK_LABEL_291;
        }
        obj = new Scanner(new ByteArrayInputStream((byte[])((Optional) (obj)).get()));
        ((Scanner) (obj)).useDelimiter("\\A");
        if (!((Scanner) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        httpurlconnection = ((Scanner) (obj)).next();
_L8:
        WLog.dfmt(TAG, "Server exception: \n %s", new Object[] {
            httpurlconnection
        });
        closeQuietly(((Closeable) (obj)));
_L7:
        return new RpcException((new StringBuilder(31)).append("non-OK status code: ").append(i).toString());
_L4:
        obj = obj1;
        return payloadSerializer.getBadResponseRpcException(i, httpurlconnection, ((Optional) (obj1)));
_L2:
        obj = obj1;
        WLog.dfmt(TAG, "non-OK status code %d, no server output", new Object[] {
            Integer.valueOf(i)
        });
          goto _L7
_L6:
        httpurlconnection = "EMPTY RESPONSE";
          goto _L8
        httpurlconnection;
        closeQuietly(((Closeable) (obj)));
        throw httpurlconnection;
        WLog.dfmt(TAG, "non-OK status code %d, could not parse server output", new Object[] {
            Integer.valueOf(i)
        });
          goto _L7
    }

    private Object buildResponsePayload(HttpURLConnection httpurlconnection, Object obj)
        throws IOException
    {
        httpurlconnection = httpurlconnection.getInputStream();
        obj = payloadSerializer.getResponsePayload(httpurlconnection, obj);
        closeQuietly(httpurlconnection);
        return obj;
        obj;
        closeQuietly(httpurlconnection);
        throw obj;
    }

    private static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            return;
        }
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            WLog.w(TAG, "Swallowed IOException on close", closeable);
        }
    }

    private static byte[] readInputStreamToByteArray(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[16384];
        do
        {
            int i = inputstream.read(abyte0, 0, 16384);
            if (i != -1)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                bytearrayoutputstream.flush();
                return bytearrayoutputstream.toByteArray();
            }
        } while (true);
    }

    public final Object deserializeResponse(HttpURLConnection httpurlconnection, Object obj)
        throws IOException, RpcException
    {
        String s = httpurlconnection.getContentType();
        int i = httpurlconnection.getResponseCode();
        if (i == 200)
        {
            if ("application/octet-stream".equals(s))
            {
                return buildResponsePayload(httpurlconnection, obj);
            }
            httpurlconnection = String.valueOf("HTTP response had bad content type. Expecting: application/octet-stream but found: ");
            obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                httpurlconnection = httpurlconnection.concat(((String) (obj)));
            } else
            {
                httpurlconnection = new String(httpurlconnection);
            }
            throw new RpcException(httpurlconnection);
        }
        if ("application/octet-stream".equals(s) || "text/plain; charset=UTF-8".equals(s) || "text/html; charset=UTF-8".equals(s))
        {
            throw buildBadHttpResponseException(i, "text/plain; charset=UTF-8".equals(s), httpurlconnection);
        } else
        {
            httpurlconnection = String.valueOf("application/octet-stream");
            obj = String.valueOf("text/plain; charset=UTF-8");
            throw new RpcException((new StringBuilder(String.valueOf(httpurlconnection).length() + 88 + String.valueOf(obj).length() + String.valueOf(s).length())).append("HTTP response with status: ").append(i).append(" had bad content type. Expecting: ").append(httpurlconnection).append(" or ").append(((String) (obj))).append(" but found: ").append(s).toString());
        }
    }

}
