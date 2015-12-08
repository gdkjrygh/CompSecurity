// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.p;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.internal:
//            ae, U, T, I, 
//            G, F

public final class E
{
    private static final class a
        implements Runnable
    {

        private Context a;
        private d b;
        private boolean c;

        public final void run()
        {
            E.a(b, c);
        }

        a(Context context, d d1, boolean flag)
        {
            a = context;
            b = d1;
            c = flag;
        }
    }

    private static final class b
        implements Runnable
    {

        private Context a;
        private d b;

        public final void run()
        {
            E.a(b, a);
        }

        b(Context context, d d1)
        {
            a = context;
            b = d1;
        }
    }

    private static final class c
    {

        ae.a a;
        G b;
        boolean c;

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }

    private static final class d
    {

        Uri a;
        Object b;

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof d)
                {
                    obj = (d)obj;
                    flag = flag1;
                    if (((d) (obj)).a == a)
                    {
                        flag = flag1;
                        if (((d) (obj)).b == b)
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return (a.hashCode() + 1073) * 37 + b.hashCode();
        }

        d(Uri uri, Object obj)
        {
            a = uri;
            b = obj;
        }
    }


    private static Handler a;
    private static ae b = new ae(8);
    private static ae c = new ae(2);
    private static final Map d = new HashMap();

    private static Handler a()
    {
        com/facebook/internal/E;
        JVM INSTR monitorenter ;
        Handler handler;
        if (a == null)
        {
            a = new Handler(Looper.getMainLooper());
        }
        handler = a;
        com/facebook/internal/E;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        throw exception;
    }

    private static c a(d d1)
    {
        synchronized (d)
        {
            d1 = (c)d.remove(d1);
        }
        return d1;
        d1;
        map;
        JVM INSTR monitorexit ;
        throw d1;
    }

    static void a(d d1, Context context)
    {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean flag;
        boolean flag1;
        obj4 = null;
        obj2 = null;
        obj3 = null;
        flag1 = true;
        flag = true;
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(d1.a.toString())).openConnection();
        httpurlconnection.setInstanceFollowRedirects(false);
        httpurlconnection.getResponseCode();
        JVM INSTR lookupswitch 3: default 447
    //                   200: 290
    //                   301: 205
    //                   302: 205;
           goto _L1 _L2 _L3 _L3
_L1:
        Object obj = httpurlconnection.getErrorStream();
        Object obj1;
        obj1 = obj;
        obj2 = obj;
        StringBuilder stringbuilder = new StringBuilder();
        if (obj == null) goto _L5; else goto _L4
_L4:
        obj1 = obj;
        obj2 = obj;
        context = new InputStreamReader(((java.io.InputStream) (obj)));
        obj1 = obj;
        obj2 = obj;
        char ac[] = new char[128];
_L7:
        obj1 = obj;
        obj2 = obj;
        int i = context.read(ac, 0, 128);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        obj2 = obj;
        stringbuilder.append(ac, 0, i);
        if (true) goto _L7; else goto _L6
        context;
        obj = obj1;
_L15:
        U.a(((java.io.Closeable) (obj)));
        U.a(httpurlconnection);
        obj1 = obj3;
_L11:
        if (flag)
        {
            a(d1, ((Exception) (context)), ((Bitmap) (obj1)), false);
        }
        return;
_L3:
        context = httpurlconnection.getHeaderField("location");
        if (U.a(context))
        {
            break; /* Loop/switch isn't completed */
        }
        context = Uri.parse(context);
        T.a(d1.a, context);
        obj = a(d1);
        if (obj == null) goto _L9; else goto _L8
_L8:
        if (!((c) (obj)).c)
        {
            a(((c) (obj)).b, new d(context, d1.b), false);
        }
_L9:
        flag = false;
        context = null;
        obj = null;
        obj1 = obj4;
_L12:
        U.a(((java.io.Closeable) (obj)));
        U.a(httpurlconnection);
        if (true) goto _L11; else goto _L10
_L2:
        obj = I.a(httpurlconnection);
        obj1 = obj;
        obj2 = obj;
        context = BitmapFactory.decodeStream(((java.io.InputStream) (obj)));
        obj2 = null;
        obj1 = context;
        flag = flag1;
        context = ((Context) (obj2));
          goto _L12
_L6:
        obj1 = obj;
        obj2 = obj;
        U.a(context);
_L13:
        obj1 = obj;
        obj2 = obj;
        context = new p(stringbuilder.toString());
        flag = flag1;
        obj1 = obj4;
          goto _L12
        d1;
        context = httpurlconnection;
_L14:
        U.a(((java.io.Closeable) (obj2)));
        U.a(context);
        throw d1;
_L5:
        obj1 = obj;
        obj2 = obj;
        stringbuilder.append(context.getString(com.facebook.O.f.com_facebook_image_download_unknown_error));
          goto _L13
        d1;
        context = null;
          goto _L14
        d1;
        context = httpurlconnection;
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
_L10:
        flag = false;
        context = null;
        obj = null;
        obj1 = obj4;
          goto _L12
    }

    private static void a(d d1, Exception exception, Bitmap bitmap, boolean flag)
    {
        d1 = a(d1);
        if (d1 != null && !((c) (d1)).c)
        {
            d1 = ((c) (d1)).b;
            G.b b1 = ((G) (d1)).c;
            if (b1 != null)
            {
                a().post(new F(d1, exception, flag, bitmap, b1));
            }
        }
    }

    static void a(d d1, boolean flag)
    {
        boolean flag1 = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = T.a(d1.a);
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = I.a(((Uri) (obj)));
        flag = flag1;
        if (obj != null)
        {
            flag = true;
        }
_L9:
        if (!flag)
        {
            obj = I.a(d1.a);
        }
        if (obj == null) goto _L5; else goto _L4
_L4:
        Bitmap bitmap = BitmapFactory.decodeStream(((java.io.InputStream) (obj)));
        U.a(((java.io.Closeable) (obj)));
        a(d1, ((Exception) (null)), bitmap, flag);
_L7:
        return;
_L5:
        obj = a(d1);
        if (obj == null || ((c) (obj)).c) goto _L7; else goto _L6
_L6:
        obj = ((c) (obj)).b;
        a(((G) (obj)), d1, b, ((Runnable) (new b(((G) (obj)).a, d1))));
        return;
_L2:
        flag = false;
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(G g)
    {
        d d1 = new d(g.b, g.e);
        Map map = d;
        map;
        JVM INSTR monitorenter ;
        c c1 = (c)d.get(d1);
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        c1.b = g;
        c1.c = false;
        c1.a.b();
_L2:
        map;
        JVM INSTR monitorexit ;
        return;
        a(g, d1, g.d);
        if (true) goto _L2; else goto _L1
_L1:
        g;
        map;
        JVM INSTR monitorexit ;
        throw g;
    }

    private static void a(G g, d d1, ae ae1, Runnable runnable)
    {
        synchronized (d)
        {
            c c1 = new c((byte)0);
            c1.b = g;
            d.put(d1, c1);
            c1.a = ae1.a(runnable);
        }
        return;
        g;
        map;
        JVM INSTR monitorexit ;
        throw g;
    }

    private static void a(G g, d d1, boolean flag)
    {
        a(g, d1, c, ((Runnable) (new a(g.a, d1, flag))));
    }

    public static boolean b(G g)
    {
        d d1 = new d(g.b, g.e);
        g = d;
        g;
        JVM INSTR monitorenter ;
        c c1 = (c)d.get(d1);
        if (c1 == null) goto _L2; else goto _L1
_L1:
        if (!c1.a.a()) goto _L4; else goto _L3
_L3:
        d.remove(d1);
        boolean flag = true;
_L6:
        g;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        c1.c = true;
        flag = true;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        g;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
