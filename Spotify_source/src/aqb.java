// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public final class aqb
{

    private static Handler a;
    private static art b = new art(8);
    private static art c = new art(2);
    private static final Map d = new HashMap();

    private static Handler a()
    {
        aqb;
        JVM INSTR monitorenter ;
        Handler handler;
        if (a == null)
        {
            a = new Handler(Looper.getMainLooper());
        }
        handler = a;
        aqb;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        throw exception;
    }

    private static aqe a(aqf aqf1)
    {
        synchronized (d)
        {
            aqf1 = (aqe)d.remove(aqf1);
        }
        return aqf1;
        aqf1;
        map;
        JVM INSTR monitorexit ;
        throw aqf1;
    }

    public static void a(Context context)
    {
        aqk.a(context);
        aro.a(context);
    }

    static void a(aqf aqf1, Context context)
    {
        Context context1;
        Object obj2;
        Bitmap bitmap;
        boolean flag;
        boolean flag1;
        boolean flag2;
        bitmap = null;
        context1 = null;
        obj2 = null;
        flag1 = true;
        flag2 = true;
        flag = true;
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(aqf1.a.toString())).openConnection();
        httpurlconnection.setInstanceFollowRedirects(false);
        httpurlconnection.getResponseCode();
        JVM INSTR lookupswitch 3: default 505
    //                   200: 306
    //                   301: 214
    //                   302: 214;
           goto _L1 _L2 _L3 _L3
_L1:
        context = httpurlconnection.getErrorStream();
        Object obj;
        Object obj1;
        obj = context;
        obj1 = context;
        context1 = context;
        Object obj3 = new InputStreamReader(context);
        obj = context;
        obj1 = context;
        context1 = context;
        char ac[] = new char[128];
        obj = context;
        obj1 = context;
        context1 = context;
        StringBuilder stringbuilder = new StringBuilder();
_L5:
        obj = context;
        obj1 = context;
        context1 = context;
        int i = ((InputStreamReader) (obj3)).read(ac, 0, 128);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = context;
        obj1 = context;
        context1 = context;
        stringbuilder.append(ac, 0, i);
        if (true) goto _L5; else goto _L4
        context;
_L15:
        arp.a(((java.io.Closeable) (obj)));
        arp.a(httpurlconnection);
        obj1 = obj2;
_L10:
        if (flag)
        {
            a(aqf1, ((Exception) (context)), ((Bitmap) (obj1)), false);
        }
        return;
_L3:
        obj = httpurlconnection.getHeaderField("location");
        if (arp.a(((String) (obj)))) goto _L7; else goto _L6
_L6:
        obj = new URI(((String) (obj)));
        aro.a(context, aqf1.a, ((URI) (obj)));
        context = a(aqf1);
        if (context == null) goto _L9; else goto _L8
_L8:
        if (!((aqe) (context)).c)
        {
            a(((aqe) (context)).b, new aqf(((URI) (obj)), aqf1.b), false);
        }
_L9:
        flag = false;
        obj = null;
        context = null;
        obj1 = bitmap;
_L11:
        arp.a(context);
        arp.a(httpurlconnection);
        context = ((Context) (obj));
          goto _L10
_L2:
        context = aqk.a(context, httpurlconnection);
        obj = context;
        obj1 = context;
        context1 = context;
        bitmap = BitmapFactory.decodeStream(context);
        obj = null;
        obj1 = bitmap;
        flag = flag1;
          goto _L11
_L4:
        obj = context;
        obj1 = context;
        context1 = context;
        arp.a(((java.io.Closeable) (obj3)));
        obj = context;
        obj1 = context;
        context1 = context;
        obj3 = new FacebookException(stringbuilder.toString());
        flag = flag1;
        obj1 = bitmap;
        obj = obj3;
          goto _L11
        context;
        obj = obj1;
        flag = flag2;
_L14:
        arp.a(((java.io.Closeable) (obj)));
        arp.a(httpurlconnection);
        obj1 = obj2;
          goto _L10
        aqf1;
        context = null;
_L13:
        arp.a(context1);
        arp.a(context);
        throw aqf1;
        aqf1;
        context = httpurlconnection;
        continue; /* Loop/switch isn't completed */
        aqf1;
        context = httpurlconnection;
        if (true) goto _L13; else goto _L12
_L12:
        context;
        obj = null;
        httpurlconnection = null;
        flag = flag2;
          goto _L14
        context;
        obj = null;
        flag = flag2;
          goto _L14
        context;
        obj = null;
        flag = false;
          goto _L14
        context;
        obj = null;
        httpurlconnection = null;
          goto _L15
        context;
        obj = null;
          goto _L15
        context;
        obj = null;
        flag = false;
          goto _L15
_L7:
        flag = false;
        obj = null;
        context = null;
        obj1 = bitmap;
          goto _L11
    }

    static void a(aqf aqf1, Context context, boolean flag)
    {
        boolean flag1 = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = aro.a(context, aqf1.a);
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = aqk.a(((URI) (obj)), context);
        flag = flag1;
        if (obj != null)
        {
            flag = true;
        }
_L9:
        if (!flag)
        {
            obj = aqk.a(aqf1.a, context);
        }
        if (obj == null) goto _L5; else goto _L4
_L4:
        context = BitmapFactory.decodeStream(((java.io.InputStream) (obj)));
        arp.a(((java.io.Closeable) (obj)));
        a(aqf1, ((Exception) (null)), ((Bitmap) (context)), flag);
_L7:
        return;
_L5:
        context = a(aqf1);
        if (context == null || ((aqe) (context)).c) goto _L7; else goto _L6
_L6:
        context = ((aqe) (context)).b;
        a(((aqg) (context)), aqf1, b, ((Runnable) (new aqd(((aqg) (context)).a, aqf1))));
        return;
_L2:
        flag = false;
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static void a(aqf aqf1, Exception exception, Bitmap bitmap, boolean flag)
    {
        aqf1 = a(aqf1);
        if (aqf1 != null && !((aqe) (aqf1)).c)
        {
            aqf1 = ((aqe) (aqf1)).b;
            aqi aqi = ((aqg) (aqf1)).c;
            if (aqi != null)
            {
                a().post(new Runnable(aqf1, exception, flag, bitmap, aqi) {

                    private aqg a;
                    private Exception b;
                    private boolean c;
                    private Bitmap d;
                    private aqi e;

                    public final void run()
                    {
                        aqj aqj1 = new aqj(a, b, c, d);
                        e.a(aqj1);
                    }

            
            {
                a = aqg1;
                b = exception;
                c = flag;
                d = bitmap;
                e = aqi1;
                super();
            }
                });
            }
        }
    }

    public static void a(aqg aqg1)
    {
        aqf aqf1 = new aqf(aqg1.b, aqg1.e);
        Map map = d;
        map;
        JVM INSTR monitorenter ;
        aqe aqe1 = (aqe)d.get(aqf1);
        if (aqe1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        aqe1.b = aqg1;
        aqe1.c = false;
        aqe1.a.b();
_L2:
        map;
        JVM INSTR monitorexit ;
        return;
        a(aqg1, aqf1, aqg1.d);
        if (true) goto _L2; else goto _L1
_L1:
        aqg1;
        map;
        JVM INSTR monitorexit ;
        throw aqg1;
    }

    private static void a(aqg aqg1, aqf aqf1, art art1, Runnable runnable)
    {
        synchronized (d)
        {
            aqe aqe1 = new aqe((byte)0);
            aqe1.b = aqg1;
            d.put(aqf1, aqe1);
            aqe1.a = art1.a(runnable);
        }
        return;
        aqg1;
        map;
        JVM INSTR monitorexit ;
        throw aqg1;
    }

    private static void a(aqg aqg1, aqf aqf1, boolean flag)
    {
        a(aqg1, aqf1, c, ((Runnable) (new aqc(aqg1.a, aqf1, flag))));
    }

    public static boolean b(aqg aqg1)
    {
        aqf aqf1 = new aqf(aqg1.b, aqg1.e);
        aqg1 = d;
        aqg1;
        JVM INSTR monitorenter ;
        aqe aqe1 = (aqe)d.get(aqf1);
        if (aqe1 == null) goto _L2; else goto _L1
_L1:
        if (!aqe1.a.a()) goto _L4; else goto _L3
_L3:
        d.remove(aqf1);
        boolean flag = true;
_L6:
        aqg1;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        aqe1.c = true;
        flag = true;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        aqg1;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
