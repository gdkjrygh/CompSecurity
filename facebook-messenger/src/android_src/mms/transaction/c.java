// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.debug.log.b;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package android_src.mms.transaction:
//            m

public class c
{

    private static final String a = a(Locale.getDefault());

    private c()
    {
    }

    private static AndroidHttpClient a(Context context)
    {
        String s = android_src.mms.c.d();
        context = AndroidHttpClient.newInstance(s, context);
        org.apache.http.params.HttpParams httpparams = context.getParams();
        HttpProtocolParams.setContentCharset(httpparams, "UTF-8");
        int i = android_src.mms.c.k();
        if (b.b(3))
        {
            b.b("fb-mms:HttpUtils", (new StringBuilder()).append("[HttpUtils] createHttpClient w/ socket timeout ").append(i).append(" ms, ").append(", UA=").append(s).toString());
        }
        HttpConnectionParams.setSoTimeout(httpparams, i);
        return context;
    }

    private static String a(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            if ("iw".equals(s))
            {
                return "he";
            }
            if ("in".equals(s))
            {
                return "id";
            }
            s1 = s;
            if ("ji".equals(s))
            {
                return "yi";
            }
        }
        return s1;
    }

    public static String a(Locale locale)
    {
        StringBuilder stringbuilder = new StringBuilder();
        a(stringbuilder, locale);
        if (!Locale.US.equals(locale))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("en-US");
        }
        return stringbuilder.toString();
    }

    private static void a(Exception exception, String s)
    {
        b.e("fb-mms:HttpUtils", (new StringBuilder()).append("Url: ").append(s).append("\n").append(exception.getMessage()).toString());
        s = new IOException(exception.getMessage());
        s.initCause(exception);
        throw s;
    }

    private static void a(StringBuilder stringbuilder, Locale locale)
    {
        String s = a(locale.getLanguage());
        if (s != null)
        {
            stringbuilder.append(s);
            locale = locale.getCountry();
            if (locale != null)
            {
                stringbuilder.append("-");
                stringbuilder.append(locale);
            }
        }
    }

    protected static byte[] a(Context context, long l, String s, byte abyte0[], int i, boolean flag, String s1, 
            int j)
    {
        Object obj;
        Object obj1;
        AndroidHttpClient androidhttpclient;
        AndroidHttpClient androidhttpclient1;
        AndroidHttpClient androidhttpclient2;
        AndroidHttpClient androidhttpclient3;
        AndroidHttpClient androidhttpclient4;
        Object obj8;
        if (s == null)
        {
            throw new IllegalArgumentException("URL must not be null.");
        }
        if (b.b(2))
        {
            b.a("fb-mms:HttpUtils", "httpConnection: params list");
            b.a("fb-mms:HttpUtils", (new StringBuilder()).append("\ttoken\t\t= ").append(l).toString());
            b.a("fb-mms:HttpUtils", (new StringBuilder()).append("\turl\t\t= ").append(s).toString());
            obj1 = (new StringBuilder()).append("\tmethod\t\t= ");
            Object obj2;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            if (i == 1)
            {
                obj = "POST";
            } else
            if (i == 2)
            {
                obj = "GET";
            } else
            {
                obj = "UNKNOWN";
            }
            b.a("fb-mms:HttpUtils", ((StringBuilder) (obj1)).append(((String) (obj))).toString());
            b.a("fb-mms:HttpUtils", (new StringBuilder()).append("\tisProxySet\t= ").append(flag).toString());
            b.a("fb-mms:HttpUtils", (new StringBuilder()).append("\tproxyHost\t= ").append(s1).toString());
            b.a("fb-mms:HttpUtils", (new StringBuilder()).append("\tproxyPort\t= ").append(j).toString());
        }
        obj2 = null;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj7 = null;
        obj1 = null;
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = obj2;
        androidhttpclient2 = obj4;
        androidhttpclient3 = obj5;
        androidhttpclient4 = obj6;
        obj = obj7;
        obj8 = new URI(s);
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = obj2;
        androidhttpclient2 = obj4;
        androidhttpclient3 = obj5;
        androidhttpclient4 = obj6;
        obj = obj7;
        obj8 = new HttpHost(((URI) (obj8)).getHost(), ((URI) (obj8)).getPort(), "http");
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = obj2;
        androidhttpclient2 = obj4;
        androidhttpclient3 = obj5;
        androidhttpclient4 = obj6;
        obj = obj7;
        obj1 = a(context);
        i;
        JVM INSTR tableswitch 1 2: default 2352
    //                   1 450
    //                   2 1356;
           goto _L1 _L2 _L3
_L1:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        b.e("fb-mms:HttpUtils", (new StringBuilder()).append("Unknown HTTP method: ").append(i).append(". Must be one of POST[").append(1).append("] or GET[").append(2).append("].").toString());
        context = null;
        s = context;
        if (obj1 != null)
        {
            ((AndroidHttpClient) (obj1)).close();
            s = context;
        }
_L27:
        return s;
_L2:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        Object obj3 = new m(context, l, abyte0);
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        ((m) (obj3)).setContentType("application/vnd.wap.mms-message");
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        abyte0 = new HttpPost(s);
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        abyte0.setEntity(((HttpEntity) (obj3)));
_L15:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        obj3 = ((AndroidHttpClient) (obj1)).getParams();
        if (!flag) goto _L5; else goto _L4
_L4:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        ConnRouteParams.setDefaultProxy(((org.apache.http.params.HttpParams) (obj3)), new HttpHost(s1, j));
_L5:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        abyte0.setParams(((org.apache.http.params.HttpParams) (obj3)));
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        abyte0.addHeader("Accept", "*/*, application/vnd.wap.mms-message, application/vnd.wap.sic");
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        s1 = android_src.mms.c.e();
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        obj3 = android_src.mms.c.f();
        if (obj3 == null) goto _L7; else goto _L6
_L6:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        if (!b.b(2)) goto _L9; else goto _L8
_L8:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        b.b("fb-mms:HttpUtils", (new StringBuilder()).append("[HttpUtils] httpConn: xWapProfUrl=").append(((String) (obj3))).toString());
_L9:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        abyte0.addHeader(s1, ((String) (obj3)));
_L7:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        s1 = android_src.mms.c.g();
        if (s1 == null) goto _L11; else goto _L10
_L10:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        obj3 = ((TelephonyManager)context.getSystemService("phone")).getLine1Number();
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        String s2 = android_src.mms.c.h();
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        String as[] = s1.split("\\|");
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        j = as.length;
        i = 0;
_L36:
        if (i >= j) goto _L11; else goto _L12
_L12:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        context = as[i].split(":", 2);
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        if (context.length != 2)
        {
            break MISSING_BLOCK_LABEL_2355;
        }
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        String s3 = context[0].trim();
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        s1 = context[1].trim();
        context = s1;
        if (s2 == null) goto _L14; else goto _L13
_L13:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        context = s1.replace(s2, ((CharSequence) (obj3)));
_L14:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        if (TextUtils.isEmpty(s3))
        {
            break MISSING_BLOCK_LABEL_2355;
        }
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        if (TextUtils.isEmpty(context))
        {
            break MISSING_BLOCK_LABEL_2355;
        }
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        abyte0.addHeader(s3, context);
        break MISSING_BLOCK_LABEL_2355;
_L3:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        abyte0 = new HttpGet(s);
          goto _L15
_L11:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        abyte0.addHeader("Accept-Language", a);
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        context = ((AndroidHttpClient) (obj1)).execute(((HttpHost) (obj8)), abyte0);
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        abyte0 = context.getStatusLine();
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        if (abyte0.getStatusCode() == 200) goto _L17; else goto _L16
_L16:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        throw new IOException((new StringBuilder()).append("HTTP error: ").append(abyte0.getReasonPhrase()).toString());
        context;
        obj = androidhttpclient;
        a(((Exception) (context)), s);
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
        }
_L31:
        return null;
_L17:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        s1 = context.getEntity();
        context = null;
        abyte0 = null;
        if (s1 == null) goto _L19; else goto _L18
_L18:
        context = abyte0;
        if (s1.getContentLength() <= 0L)
        {
            break MISSING_BLOCK_LABEL_1708;
        }
        context = new byte[(int)s1.getContentLength()];
        abyte0 = new DataInputStream(s1.getContent());
        abyte0.readFully(context);
        abyte0.close();
_L28:
        abyte0 = context;
        if (!s1.isChunked()) goto _L21; else goto _L20
_L20:
        int k1;
        b.a("fb-mms:HttpUtils", "httpConnection: transfer encoding is chunked");
        k1 = android_src.mms.c.b();
        obj = new byte[k1];
        abyte0 = new DataInputStream(s1.getContent());
        int k;
        boolean flag1;
        i = 0;
        k = 0;
        flag1 = false;
_L23:
        j = abyte0.read(((byte []) (obj)), k, k1);
        int i1;
        int j1;
        i1 = k;
        j1 = k1;
        if (j > 0)
        {
            j1 = k1 - j;
            i1 = k + j;
        }
        k1 = ((flag1) ? 1 : 0);
        k = i1;
        i = j;
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_1851;
        }
        k = i1;
        i = j;
        k1 = j1;
        if (j1 > 0) goto _L23; else goto _L22
_L22:
        i = j;
        k = i1;
        k1 = ((flag1) ? 1 : 0);
_L33:
        if (i != -1 || k <= 0 || k1 != 0) goto _L25; else goto _L24
_L24:
        context = new byte[k];
        System.arraycopy(obj, 0, context, 0, k);
        b.a("fb-mms:HttpUtils", (new StringBuilder()).append("httpConnection: Chunked response length [").append(Integer.toString(k)).append("]").toString());
_L34:
        abyte0.close();
        abyte0 = context;
_L21:
        context = abyte0;
        if (s1 == null) goto _L19; else goto _L26
_L26:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        s1.consumeContent();
        context = abyte0;
_L19:
        s = context;
        if (obj1 != null)
        {
            ((AndroidHttpClient) (obj1)).close();
            return context;
        }
          goto _L27
        abyte0;
        b.e("fb-mms:HttpUtils", (new StringBuilder()).append("Error closing input stream: ").append(abyte0.getMessage()).toString());
          goto _L28
        context;
        if (s1 == null) goto _L30; else goto _L29
_L29:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        s1.consumeContent();
_L30:
        androidhttpclient = ((AndroidHttpClient) (obj1));
        androidhttpclient1 = ((AndroidHttpClient) (obj1));
        androidhttpclient2 = ((AndroidHttpClient) (obj1));
        androidhttpclient3 = ((AndroidHttpClient) (obj1));
        androidhttpclient4 = ((AndroidHttpClient) (obj1));
        obj = obj1;
        throw context;
        context;
        obj = androidhttpclient1;
        a(((Exception) (context)), s);
        if (androidhttpclient1 != null)
        {
            androidhttpclient1.close();
        }
          goto _L31
        context;
        abyte0.close();
_L32:
        throw context;
        abyte0;
        b.e("fb-mms:HttpUtils", (new StringBuilder()).append("Error closing input stream: ").append(abyte0.getMessage()).toString());
          goto _L32
        IOException ioexception;
        ioexception;
        k1 = 1;
        b.e("fb-mms:HttpUtils", (new StringBuilder()).append("httpConnection: error reading input stream").append(ioexception.getMessage()).toString());
          goto _L33
        context;
        abyte0.close();
_L35:
        throw context;
_L25:
        b.e("fb-mms:HttpUtils", "httpConnection: Response entity too large or empty");
          goto _L34
        abyte0;
        b.e("fb-mms:HttpUtils", (new StringBuilder()).append("Error closing input stream: ").append(abyte0.getMessage()).toString());
        abyte0 = context;
          goto _L21
        abyte0;
        b.e("fb-mms:HttpUtils", (new StringBuilder()).append("Error closing input stream: ").append(abyte0.getMessage()).toString());
          goto _L35
        context;
        obj = androidhttpclient2;
        a(((Exception) (context)), s);
        if (androidhttpclient2 != null)
        {
            androidhttpclient2.close();
        }
          goto _L31
        context;
        obj = androidhttpclient3;
        a(((Exception) (context)), s);
        if (androidhttpclient3 != null)
        {
            androidhttpclient3.close();
        }
          goto _L31
        context;
        obj = androidhttpclient4;
        a(((Exception) (context)), s);
        if (androidhttpclient4 != null)
        {
            androidhttpclient4.close();
        }
          goto _L31
        context;
        if (obj != null)
        {
            ((AndroidHttpClient) (obj)).close();
        }
        throw context;
        i++;
          goto _L36
    }

}
