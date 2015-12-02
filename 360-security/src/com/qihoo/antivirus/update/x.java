// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.qihoo.antivirus.update:
//            af

public class x
{
    public static interface a
    {

        public abstract void a(int i, String s);

        public abstract void a(long l, long l1)
            throws InterruptedException;

        public abstract void a(HttpResponse httpresponse);
    }


    private static final Object a = new Object();
    private static final Locale b = Locale.getDefault();
    private static String c = null;

    public static int a(HttpClient httpclient, String s, OutputStream outputstream, long l, a a1, long l1, 
            long l2)
    {
        try
        {
            s = new HttpGet(s);
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            if (a1 != null)
            {
                a1.a(-97, httpclient.getLocalizedMessage());
            }
            return -97;
        }
        if (l > 0L)
        {
            s.addHeader("Range", String.format("bytes=%d-", new Object[] {
                Long.valueOf(l)
            }));
        }
        return a(httpclient, ((HttpUriRequest) (s)), outputstream, a1, l1, l2);
    }

    private static int a(HttpClient httpclient, HttpUriRequest httpurirequest, OutputStream outputstream, a a1, long l, long l1)
    {
        Object obj;
        Object obj1;
        long l2;
        httpurirequest.setHeader("Accept", "*/*");
        httpurirequest.setHeader("Cache-Control", "no-cache");
        httpurirequest.setHeader("Pragma", "no-cache");
        int i;
        try
        {
            obj1 = httpclient.execute(httpurirequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            if (a1 != null)
            {
                a1.a(-1, httpclient.getLocalizedMessage());
            }
            return -1;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            if (a1 != null)
            {
                a1.a(-2, httpclient.getLocalizedMessage());
            }
            return -2;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            if (a1 != null)
            {
                a1.a(-2, httpclient.getLocalizedMessage());
            }
            return -2;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            if (a1 != null)
            {
                a1.a(-3, httpclient.getLocalizedMessage());
            }
            return -3;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            if (a1 != null)
            {
                a1.a(-4, httpclient.getLocalizedMessage());
            }
            return -4;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            if (a1 != null)
            {
                a1.a(-5, httpclient.getLocalizedMessage());
            }
            return -5;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            if (a1 != null)
            {
                a1.a(-99, httpclient.getLocalizedMessage());
            }
            return -99;
        }
        httpclient = null;
        httpurirequest = null;
        obj = ((HttpResponse) (obj1)).getStatusLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        a1.a(((HttpResponse) (obj1)));
        i = ((StatusLine) (obj)).getStatusCode();
        if (i < 200 || i >= 300) goto _L4; else goto _L3
_L3:
        obj = ((HttpResponse) (obj1)).getEntity();
        httpclient = ((HttpClient) (obj));
        obj = httpclient.getContent();
        httpurirequest = ((HttpUriRequest) (obj));
        obj1 = httpurirequest;
        obj = httpclient;
        l2 = httpclient.getContentLength();
        if (l <= 0L || l2 <= l) goto _L6; else goto _L5
_L5:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(-9, "invalidate data");
_L10:
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        httpurirequest.close();
        byte abyte0[];
        int j;
        int k;
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        k = -9;
        return k;
_L6:
        if (l1 <= 0L || l2 <= 0L || l2 == l1) goto _L8; else goto _L7
_L7:
        if (a1 == null) goto _L10; else goto _L9
_L9:
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(-9, "invalidate data");
          goto _L10
        outputstream;
_L29:
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        httpurirequest.close();
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        return -98;
_L8:
        if (httpurirequest == null) goto _L12; else goto _L11
_L11:
        obj1 = httpurirequest;
        obj = httpclient;
        abyte0 = new byte[4096];
        j = 0;
_L18:
        obj1 = httpurirequest;
        obj = httpclient;
        k = httpurirequest.read(abyte0);
        if (k > 0) goto _L14; else goto _L13
_L13:
        if (l1 <= 0L || (long)j == l1) goto _L16; else goto _L15
_L15:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_471;
        }
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(-9, "invalidate data");
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        httpurirequest.close();
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        return -9;
_L14:
        obj1 = httpurirequest;
        obj = httpclient;
        outputstream.write(abyte0, 0, k);
        k = j + k;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(k, l2);
        if (l <= 0L || (long)k <= l)
        {
            break MISSING_BLOCK_LABEL_592;
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(-9, "invalidate data");
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        httpurirequest.close();
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        return -9;
        j = k;
        if (l1 <= 0L) goto _L18; else goto _L17
_L17:
        j = k;
        if ((long)k <= l1) goto _L18; else goto _L19
_L19:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_636;
        }
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(-9, "invalidate data");
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_644;
        }
        httpurirequest.close();
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        return -9;
_L12:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_677;
        }
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(-7, "Empty body");
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_685;
        }
        httpurirequest.close();
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        return -7;
_L4:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        a1.a(-8, obj.toString());
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
            break MISSING_BLOCK_LABEL_739;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_739;
        }
        throw new NullPointerException();
        return -8;
_L2:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_756;
        }
        a1.a(-7, "Empty header");
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
            break MISSING_BLOCK_LABEL_780;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_780;
        }
        throw new NullPointerException();
        return -7;
        outputstream;
        httpclient = null;
        httpurirequest = null;
_L27:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_810;
        }
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(-6, outputstream.getLocalizedMessage());
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_818;
        }
        httpurirequest.close();
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        return -6;
        outputstream;
        httpclient = null;
        httpurirequest = null;
_L25:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_858;
        }
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(-10, outputstream.getLocalizedMessage());
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_866;
        }
        httpurirequest.close();
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        return -10;
        outputstream;
        httpclient = null;
        httpurirequest = null;
_L23:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_906;
        }
        obj1 = httpurirequest;
        obj = httpclient;
        a1.a(-99, outputstream.getLocalizedMessage());
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_914;
        }
        httpurirequest.close();
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        return -99;
        httpurirequest;
        httpclient = null;
        obj1 = null;
_L21:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_943;
        }
        ((InputStream) (obj1)).close();
        if (httpclient != null)
        {
            try
            {
                httpclient.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        throw httpurirequest;
_L16:
        if (httpurirequest != null)
        {
            try
            {
                httpurirequest.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return j;
            }
        }
        k = j;
        if (httpclient == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        httpclient.consumeContent();
        return j;
        httpurirequest;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        httpurirequest;
        httpclient = ((HttpClient) (obj));
        if (true) goto _L21; else goto _L20
_L20:
        outputstream;
        httpurirequest = null;
        continue; /* Loop/switch isn't completed */
        outputstream;
        if (true) goto _L23; else goto _L22
_L22:
        outputstream;
        httpurirequest = null;
        continue; /* Loop/switch isn't completed */
        outputstream;
        if (true) goto _L25; else goto _L24
_L24:
        outputstream;
        httpurirequest = null;
        continue; /* Loop/switch isn't completed */
        outputstream;
        if (true) goto _L27; else goto _L26
_L26:
        outputstream;
        continue; /* Loop/switch isn't completed */
        outputstream;
        if (true) goto _L29; else goto _L28
_L28:
    }

    public static String a()
    {
        int i = 0;
        com/qihoo/antivirus/update/x;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        obj = c;
_L13:
        com/qihoo/antivirus/update/x;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        synchronized (a)
        {
            obj = b;
        }
        String s;
        obj1 = new StringBuffer();
        s = Build.MODEL;
        if (s.length() > 0)
        {
            ((StringBuffer) (obj1)).append(s);
        }
        ((StringBuffer) (obj1)).append("; ");
        s = android.os.Build.VERSION.RELEASE;
        if (s.length() <= 0) goto _L4; else goto _L3
_L3:
        ((StringBuffer) (obj1)).append(s);
_L14:
        ((StringBuffer) (obj1)).append("; ");
        s = Build.DISPLAY;
        if (s.length() <= 0) goto _L6; else goto _L5
_L5:
        if (s.length() <= 48) goto _L8; else goto _L7
_L7:
        ((StringBuffer) (obj1)).append(s.substring(0, 48));
        ((StringBuffer) (obj1)).append("...");
_L6:
        ((StringBuffer) (obj1)).append("; ");
        s = ((Locale) (obj)).getLanguage();
        if (s == null) goto _L10; else goto _L9
_L9:
        ((StringBuffer) (obj1)).append(s.toLowerCase());
        obj = ((Locale) (obj)).getCountry();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        ((StringBuffer) (obj1)).append("-");
        ((StringBuffer) (obj1)).append(((String) (obj)).toLowerCase());
_L15:
        obj = ((StringBuffer) (obj1)).toString();
        obj1 = new StringBuilder();
_L16:
        if (i < ((String) (obj)).length()) goto _L12; else goto _L11
_L11:
        c = ((StringBuilder) (obj1)).toString();
        obj = c;
          goto _L13
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        com/qihoo/antivirus/update/x;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        ((StringBuffer) (obj1)).append("1.0");
          goto _L14
_L8:
        ((StringBuffer) (obj1)).append(s);
          goto _L6
_L10:
        ((StringBuffer) (obj1)).append("en");
          goto _L15
_L12:
        char c1 = ((String) (obj)).charAt(i);
        if (c1 < ' ' || c1 > '~')
        {
            break MISSING_BLOCK_LABEL_279;
        }
        ((StringBuilder) (obj1)).append(c1);
        i++;
          goto _L16
    }

    public static HttpClient a(HttpHost httphost, int i)
    {
        return a(httphost, null, 0, null, i);
    }

    private static HttpClient a(HttpHost httphost, String s, int i, SocketFactory socketfactory, int j)
    {
        BasicHttpParams basichttpparams;
        String s1;
        if (j / 1000 <= 0)
        {
            j = 30000;
        }
        s1 = a();
        basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUserAgent(basichttpparams, s1);
        ConnManagerParams.setMaxTotalConnections(basichttpparams, 10);
        ConnManagerParams.setTimeout(basichttpparams, 10000L);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 10000);
        HttpConnectionParams.setSoTimeout(basichttpparams, j);
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, true);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        ConnRouteParams.setDefaultProxy(basichttpparams, httphost);
        httphost = new SchemeRegistry();
        httphost.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        if (!TextUtils.isEmpty(s))
        {
            httphost.register(new Scheme(s, socketfactory, i));
        }
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, httphost), basichttpparams);
    }

    public static boolean a(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getAllNetworkInfo();
        if (context == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        j = context.length;
        i = 0;
_L6:
        if (i < j) goto _L4; else goto _L2
_L2:
        return false;
_L4:
        if (context[i].isConnected())
        {
            return true;
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean b(Context context)
    {
        context = (ConnectivityManager)context.getApplicationContext().getSystemService("connectivity");
        try
        {
            context = context.getNetworkInfo(1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null)
        {
            return context.isConnected();
        } else
        {
            return false;
        }
    }

    public static int c(Context context)
    {
        if (!a(context))
        {
            return 99;
        }
        if (b(context))
        {
            return 1;
        }
        context = (TelephonyManager)context.getSystemService("phone");
        if (context != null)
        {
            switch (context.getNetworkType())
            {
            default:
                return 0;

            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 7: // '\007'
            case 11: // '\013'
            case 16: // '\020'
                return 2;

            case 3: // '\003'
            case 5: // '\005'
            case 6: // '\006'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 12: // '\f'
            case 14: // '\016'
            case 15: // '\017'
                return 3;

            case 13: // '\r'
                return 4;
            }
        } else
        {
            return 0;
        }
    }

    public static String d(Context context)
    {
        Object obj = Uri.parse("content://telephony/carriers/preferapn");
        context = context.getContentResolver().query(((Uri) (obj)), null, null, null, null);
        if (context == null) goto _L2; else goto _L1
_L1:
        if (!context.moveToFirst()) goto _L2; else goto _L3
_L3:
        obj = context.getString(context.getColumnIndex("apn"));
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L4
_L4:
        obj = ((String) (obj)).toLowerCase();
_L9:
        af.a(context);
        return ((String) (obj));
        context;
        context = null;
_L7:
        af.a(context);
        return "UNKNOWN";
        obj;
        context = null;
_L6:
        af.a(context);
        throw obj;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L7; else goto _L2
_L2:
        obj = "UNKNOWN";
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static HttpHost e(Context context)
    {
        return f(context);
    }

    public static HttpHost f(Context context)
    {
        if (af.a(context))
        {
            context = Proxy.getDefaultHost();
            int i = Proxy.getDefaultPort();
            if (context != null && context.length() > 0)
            {
                return new HttpHost(context, i);
            }
        }
        return null;
    }

    public static String g(Context context)
    {
        Object obj;
        byte byte0;
        byte0 = 9;
        obj = null;
        if (!af.a(context)) goto _L2; else goto _L1
_L1:
        byte0 = 0;
        context = obj;
_L4:
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(byte0);
        stringbuilder.append(" ");
        if (byte0 > 8 && context != null)
        {
            stringbuilder.append(context);
        }
        context = Proxy.getDefaultHost();
        if (context != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(context);
            stringbuilder.append(" ");
            stringbuilder.append(Proxy.getDefaultPort());
        }
        return stringbuilder.toString();
_L2:
        String s = d(context);
        if (s.equals("cmwap"))
        {
            byte0 = 1;
            context = s;
        } else
        if (s.equals("cmnet"))
        {
            byte0 = 2;
            context = s;
        } else
        if (s.equals("uniwap"))
        {
            byte0 = 3;
            context = s;
        } else
        if (s.equals("uninet"))
        {
            byte0 = 4;
            context = s;
        } else
        if (s.equals("3gwap"))
        {
            byte0 = 5;
            context = s;
        } else
        if (s.equals("3gnet"))
        {
            byte0 = 6;
            context = s;
        } else
        if (s.equals("ctwap"))
        {
            byte0 = 7;
            context = s;
        } else
        {
            context = s;
            if (s.equals("ctnet"))
            {
                byte0 = 8;
                context = s;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
