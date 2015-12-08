// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLException;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.leanplum:
//            aW, q, ba, p

final class aX
    implements Runnable
{

    private aW a;

    aX(aW aw)
    {
        a = aw;
        super();
    }

    public final void run()
    {
        if (aW.a(a).getPort() == -1) goto _L2; else goto _L1
_L1:
        int i = aW.a(a).getPort();
_L11:
        if (!TextUtils.isEmpty(aW.a(a).getPath())) goto _L4; else goto _L3
_L3:
        Object obj = "/";
_L12:
        if (!TextUtils.isEmpty(aW.a(a).getQuery()))
        {
            obj = (new StringBuilder(String.valueOf(obj))).append("?").append(aW.a(a).getQuery()).toString();
        }
        Object obj1;
        URI uri;
        if (aW.a(a).getScheme().equals("wss"))
        {
            obj1 = "https";
        } else
        {
            obj1 = "http";
        }
        uri = new URI(((String) (obj1)), (new StringBuilder("//")).append(aW.a(a).getHost()).toString(), null);
        if (!aW.a(a).getScheme().equals("wss")) goto _L6; else goto _L5
_L5:
        obj1 = aW.b(a);
_L13:
        aW.a(a, ((SocketFactory) (obj1)).createSocket(aW.a(a).getHost(), i));
        obj1 = new PrintWriter(aW.c(a).getOutputStream());
        ((PrintWriter) (obj1)).print((new StringBuilder("GET ")).append(((String) (obj))).append(" HTTP/1.1\r\n").toString());
        ((PrintWriter) (obj1)).print("Upgrade: websocket\r\n");
        ((PrintWriter) (obj1)).print("Connection: Upgrade\r\n");
        ((PrintWriter) (obj1)).print((new StringBuilder("Host: ")).append(aW.a(a).getHost()).append("\r\n").toString());
        ((PrintWriter) (obj1)).print((new StringBuilder("Origin: ")).append(uri.toString()).append("\r\n").toString());
        ((PrintWriter) (obj1)).print((new StringBuilder("Sec-WebSocket-Key: ")).append(aW.d(a)).append("\r\n").toString());
        ((PrintWriter) (obj1)).print("Sec-WebSocket-Version: 13\r\n");
        if (aW.e(a) == null) goto _L8; else goto _L7
_L7:
        obj = aW.e(a).iterator();
_L14:
        if (((Iterator) (obj)).hasNext()) goto _L9; else goto _L8
_L8:
        ((PrintWriter) (obj1)).print("\r\n");
        ((PrintWriter) (obj1)).flush();
        obj = new q(aW.c(a).getInputStream());
        obj1 = aW.a(a, aW.a(a, ((q) (obj))));
        if (obj1 == null)
        {
            NameValuePair namevaluepair;
            try
            {
                throw new HttpException("Received no reply from server.");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.d("WebSocketClient", "WebSocket EOF!", ((Throwable) (obj)));
                aW.f(a).a(0, "EOF");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.d("WebSocketClient", "Websocket SSL error!", ((Throwable) (obj)));
                aW.f(a).a(0, "SSL");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                aW.f(a).a(((Exception) (obj)));
            }
            return;
        }
          goto _L10
_L2:
        if (aW.a(a).getScheme().equals("wss"))
        {
            i = 443;
        } else
        {
            i = 80;
        }
          goto _L11
_L4:
        obj = aW.a(a).getPath();
          goto _L12
_L6:
        obj1 = SocketFactory.getDefault();
          goto _L13
_L9:
        namevaluepair = (NameValuePair)((Iterator) (obj)).next();
        ((PrintWriter) (obj1)).print(String.format("%s: %s\r\n", new Object[] {
            namevaluepair.getName(), namevaluepair.getValue()
        }));
          goto _L14
_L10:
        if (((StatusLine) (obj1)).getStatusCode() != 101)
        {
            throw new HttpResponseException(((StatusLine) (obj1)).getStatusCode(), ((StatusLine) (obj1)).getReasonPhrase());
        }
_L16:
        obj1 = aW.a(a, ((q) (obj)));
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break; /* Loop/switch isn't completed */
        }
        aW.b(a, ((String) (obj1))).getName();
        if (true) goto _L16; else goto _L15
_L15:
        aW.f(a).b();
        aW.g(a).a(((q) (obj)));
        return;
          goto _L11
    }
}
