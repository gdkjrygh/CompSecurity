// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.g;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Proxy;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

public class com.qihoo.security.g.a
{
    public static interface a
    {

        public abstract void a(int i, String s);

        public abstract void a(long l, long l1)
            throws InterruptedException;

        public abstract void a(HttpEntityEnclosingRequest httpentityenclosingrequest);

        public abstract void a(HttpResponse httpresponse);
    }


    private static final Object a = new Object();
    private static final Locale b = Locale.getDefault();
    private static String c = null;

    public static int a(HttpClient httpclient, String s, OutputStream outputstream, long l, a a1)
    {
        return a(httpclient, s, outputstream, l, a1, 0L, 0L);
    }

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
            s.addHeader("Range", String.format("bytes = %d-", new Object[] {
                Long.valueOf(l)
            }));
        }
        return a(httpclient, ((HttpUriRequest) (s)), outputstream, a1, l1, l2);
    }

    public static int a(HttpClient httpclient, String s, OutputStream outputstream, a a1)
    {
        return a(httpclient, s, outputstream, 0L, a1);
    }

    public static int a(HttpClient httpclient, String s, byte abyte0[], OutputStream outputstream, a a1)
    {
        s = new HttpPost(s);
        abyte0 = new ByteArrayEntity(abyte0);
        abyte0.setContentType("application/x-www-form-urlencoded");
        s.setEntity(abyte0);
        if (a1 != null)
        {
            a1.a(s);
        }
        return a(httpclient, ((HttpUriRequest) (s)), outputstream, a1);
    }

    private static int a(HttpClient httpclient, HttpUriRequest httpurirequest, OutputStream outputstream, a a1)
    {
        return a(httpclient, httpurirequest, outputstream, a1, 0L, 0L);
    }

    private static int a(HttpClient httpclient, HttpUriRequest httpurirequest, OutputStream outputstream, a a1, long l, long l1)
    {
        HttpEntity httpentity;
        InputStream inputstream;
        HttpEntity httpentity1;
        InputStream inputstream1;
        Object obj;
        HttpEntity httpentity2;
        InputStream inputstream2;
        HttpEntity httpentity3;
        HttpEntity httpentity4;
        InputStream inputstream3;
        byte abyte0[];
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        StatusLine statusline;
        int k;
        long l2;
        HttpResponse httpresponse;
        int i;
        try
        {
            httpresponse = httpclient.execute(httpurirequest);
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
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            if (a1 != null)
            {
                a1.a(-99, httpclient.getLocalizedMessage());
            }
            return -99;
        }
        obj5 = null;
        obj7 = null;
        obj4 = null;
        obj6 = null;
        httpentity = null;
        abyte0 = null;
        obj1 = null;
        obj3 = null;
        obj2 = null;
        inputstream = null;
        k = 0;
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = abyte0;
        httpentity2 = obj5;
        inputstream1 = obj1;
        httpentity1 = obj7;
        inputstream2 = obj3;
        httpentity3 = obj4;
        httpurirequest = obj2;
        httpclient = obj6;
        statusline = httpresponse.getStatusLine();
        if (statusline == null) goto _L2; else goto _L1
_L1:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = abyte0;
        httpentity2 = obj5;
        inputstream1 = obj1;
        httpentity1 = obj7;
        inputstream2 = obj3;
        httpentity3 = obj4;
        httpurirequest = obj2;
        httpclient = obj6;
        a1.a(httpresponse);
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = abyte0;
        httpentity2 = obj5;
        inputstream1 = obj1;
        httpentity1 = obj7;
        inputstream2 = obj3;
        httpentity3 = obj4;
        httpurirequest = obj2;
        httpclient = obj6;
        i = statusline.getStatusCode();
        if (i < 200 || i >= 300) goto _L4; else goto _L3
_L3:
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = abyte0;
        httpentity2 = obj5;
        inputstream1 = obj1;
        httpentity1 = obj7;
        inputstream2 = obj3;
        httpentity3 = obj4;
        httpurirequest = obj2;
        httpclient = obj6;
        httpentity = httpresponse.getEntity();
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = abyte0;
        httpentity2 = httpentity;
        inputstream1 = obj1;
        httpentity1 = httpentity;
        inputstream2 = obj3;
        httpentity3 = httpentity;
        httpurirequest = obj2;
        httpclient = httpentity;
        inputstream = httpentity.getContent();
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        l2 = httpentity.getContentLength();
        if (l <= 0L || l2 <= l) goto _L6; else goto _L5
_L5:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        a1.a(-9, "invalidate data");
        k = -9;
        int j;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -9;
            }
        }
        j = k;
        if (httpentity == null)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        httpentity.consumeContent();
        j = k;
_L8:
        return j;
_L6:
        if (l1 <= 0L || l2 <= 0L || l2 == l1)
        {
            break MISSING_BLOCK_LABEL_717;
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_684;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        a1.a(-9, "invalidate data");
        j = -9;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -9;
            }
        }
        if (httpentity == null) goto _L8; else goto _L7
_L7:
        httpentity.consumeContent();
        return -9;
        if (inputstream == null) goto _L10; else goto _L9
_L9:
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        abyte0 = new byte[4096];
_L13:
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        j = inputstream.read(abyte0);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_1136;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        outputstream.write(abyte0, 0, j);
        j = k + j;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_926;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        a1.a(j, l2);
        if (l <= 0L || (long)j <= l)
        {
            break MISSING_BLOCK_LABEL_1027;
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_994;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        a1.a(-9, "invalidate data");
        j = -9;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -9;
            }
        }
        if (httpentity == null) goto _L8; else goto _L11
_L11:
        httpentity.consumeContent();
        return -9;
        k = j;
        if (l1 <= 0L) goto _L13; else goto _L12
_L12:
        k = j;
        if ((long)j <= l1) goto _L13; else goto _L14
_L14:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_1103;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        a1.a(-9, "invalidate data");
        j = -9;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -9;
            }
        }
        if (httpentity == null) goto _L8; else goto _L15
_L15:
        httpentity.consumeContent();
        return -9;
        if (l1 <= 0L || (long)k == l1) goto _L17; else goto _L16
_L16:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_1204;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        a1.a(-9, "invalidate data");
        j = -9;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -9;
            }
        }
        if (httpentity == null) goto _L8; else goto _L18
_L18:
        httpentity.consumeContent();
        return -9;
_L10:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_1289;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = inputstream;
        httpentity2 = httpentity;
        inputstream1 = inputstream;
        httpentity1 = httpentity;
        inputstream2 = inputstream;
        httpentity3 = httpentity;
        httpurirequest = inputstream;
        httpclient = httpentity;
        a1.a(-7, "Empty body");
        j = -7;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -7;
            }
        }
        if (httpentity == null) goto _L8; else goto _L19
_L19:
        httpentity.consumeContent();
        return -7;
_L4:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_1377;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = abyte0;
        httpentity2 = obj5;
        inputstream1 = obj1;
        httpentity1 = obj7;
        inputstream2 = obj3;
        httpentity3 = obj4;
        httpurirequest = obj2;
        httpclient = obj6;
        a1.a(-8, statusline.toString());
        j = -8;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -8;
            }
        }
        if (true) goto _L8; else goto _L20
_L20:
        throw new NullPointerException();
_L2:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_1461;
        }
        inputstream3 = inputstream;
        httpentity4 = httpentity;
        obj = abyte0;
        httpentity2 = obj5;
        inputstream1 = obj1;
        httpentity1 = obj7;
        inputstream2 = obj3;
        httpentity3 = obj4;
        httpurirequest = obj2;
        httpclient = obj6;
        a1.a(-7, "Empty header");
        j = -7;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -7;
            }
        }
        if (true) goto _L8; else goto _L21
_L21:
        throw new NullPointerException();
_L17:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return k;
            }
        }
        j = k;
        if (httpentity == null) goto _L8; else goto _L22
_L22:
        httpentity.consumeContent();
        return k;
        httpclient;
        j = -98;
        if (inputstream3 != null)
        {
            try
            {
                inputstream3.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -98;
            }
        }
        if (httpentity4 == null) goto _L8; else goto _L23
_L23:
        httpentity4.consumeContent();
        return -98;
        outputstream;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_1583;
        }
        httpurirequest = ((HttpUriRequest) (obj));
        httpclient = httpentity2;
        a1.a(-6, outputstream.getLocalizedMessage());
        j = -6;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -6;
            }
        }
        if (httpentity2 == null) goto _L8; else goto _L24
_L24:
        httpentity2.consumeContent();
        return -6;
        outputstream;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_1639;
        }
        httpurirequest = inputstream1;
        httpclient = httpentity1;
        a1.a(-10, outputstream.getLocalizedMessage());
        j = -10;
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -10;
            }
        }
        if (httpentity1 == null) goto _L8; else goto _L25
_L25:
        httpentity1.consumeContent();
        return -10;
        outputstream;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_1695;
        }
        httpurirequest = inputstream2;
        httpclient = httpentity3;
        a1.a(-99, outputstream.getLocalizedMessage());
        j = -99;
        if (inputstream2 != null)
        {
            try
            {
                inputstream2.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient)
            {
                return -99;
            }
        }
        if (httpentity3 == null) goto _L8; else goto _L26
_L26:
        httpentity3.consumeContent();
        return -99;
        outputstream;
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_1737;
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
        throw outputstream;
    }

    public static String a()
    {
        int i = 0;
        com/qihoo/security/g/a;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        obj = c;
_L12:
        com/qihoo/security/g/a;
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
_L10:
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
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        ((StringBuffer) (obj1)).append(s.toLowerCase());
        obj = ((Locale) (obj)).getCountry();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        ((StringBuffer) (obj1)).append("-");
        ((StringBuffer) (obj1)).append(((String) (obj)).toLowerCase());
_L11:
        obj = ((StringBuffer) (obj1)).toString();
        obj1 = new StringBuilder();
_L9:
        char c1;
        if (i >= ((String) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_274;
        }
        c1 = ((String) (obj)).charAt(i);
        if (c1 < ' ' || c1 > '~')
        {
            break MISSING_BLOCK_LABEL_225;
        }
        ((StringBuilder) (obj1)).append(c1);
        i++;
          goto _L9
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        com/qihoo/security/g/a;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        ((StringBuffer) (obj1)).append("1.0");
          goto _L10
_L8:
        ((StringBuffer) (obj1)).append(s);
          goto _L6
        ((StringBuffer) (obj1)).append("en");
          goto _L11
        c = ((StringBuilder) (obj1)).toString();
        obj = c;
          goto _L12
    }

    public static String a(Context context)
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
        Utils.closeCursor(context);
        return ((String) (obj));
        context;
        context = null;
_L7:
        Utils.closeCursor(context);
        return "UNKNOWN";
        obj;
        context = null;
_L6:
        Utils.closeCursor(context);
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

    public static HttpHost a(Context context, com.qihoo.security.d.a a1)
    {
        if (!o.a(context))
        {
            return b(context, a1);
        } else
        {
            return null;
        }
    }

    public static HttpClient a(HttpHost httphost)
    {
        return a(httphost, ((String) (null)), 0, ((SocketFactory) (null)));
    }

    private static HttpClient a(HttpHost httphost, String s, int i, SocketFactory socketfactory)
    {
        String s1 = a();
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUserAgent(basichttpparams, s1);
        ConnManagerParams.setMaxTotalConnections(basichttpparams, 10);
        ConnManagerParams.setTimeout(basichttpparams, 5000L);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 5000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 30000);
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

    public static HttpHost b(Context context)
    {
        context = Proxy.getDefaultHost();
        int i = Proxy.getDefaultPort();
        if (context != null && context.length() > 0)
        {
            return new HttpHost(context, i);
        } else
        {
            return null;
        }
    }

    public static HttpHost b(Context context, com.qihoo.security.d.a a1)
    {
        Object obj = null;
        a1 = a1.a("apn", a(context));
        if (TextUtils.isEmpty(a1))
        {
            context = b(context);
        } else
        {
            context = obj;
            if (!"<none>".equals(a1))
            {
                a1 = a1.split(":", 2);
                context = obj;
                if (a1 != null)
                {
                    context = obj;
                    if (a1.length == 2)
                    {
                        try
                        {
                            context = new HttpHost(a1[0], Integer.parseInt(a1[1]));
                        }
                        // Misplaced declaration of an exception variable
                        catch (Context context)
                        {
                            Log.w("HttpEngine", "getOverridedApnProxy()", context);
                            return null;
                        }
                        return context;
                    }
                }
            }
        }
        return context;
    }

}
