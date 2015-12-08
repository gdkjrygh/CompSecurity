// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.volley.b;
import com.android.volley.l;
import com.android.volley.r;
import com.android.volley.toolbox.a;
import com.android.volley.toolbox.c;
import com.android.volley.toolbox.g;
import com.android.volley.toolbox.m;
import com.android.volley.toolbox.n;
import com.android.volley.toolbox.o;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.NotificationResponse;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class com.cardinalblue.android.piccollage.lib.i
{
    public static class a extends com.android.volley.k
    {

        private final com.android.volley.m.b a;

        protected com.android.volley.m a(com.android.volley.g g1)
        {
            return com.android.volley.m.a(g1.b, com.android.volley.toolbox.e.a(g1));
        }

        protected void a(byte abyte0[])
        {
            if (a != null)
            {
                a.a(abyte0);
            }
        }

        protected void b(Object obj)
        {
            a((byte[])obj);
        }

        public a(int j, String s, com.android.volley.m.b b1, com.android.volley.m.a a1)
        {
            super(j, s, a1);
            a = b1;
        }
    }

    public static class b extends com.android.volley.k
    {

        private com.android.volley.m.b a;
        private final com.google.b.f b;

        protected com.android.volley.m a(com.android.volley.g g1)
        {
            g1 = new String(g1.b);
            return com.android.volley.m.a((CBCollagesResponse)b.a(g1, com/cardinalblue/android/piccollage/model/gson/CBCollagesResponse), h());
        }

        protected void a(CBCollagesResponse cbcollagesresponse)
        {
            if (a != null)
            {
                a.a(cbcollagesresponse);
            }
        }

        protected void b(Object obj)
        {
            a((CBCollagesResponse)obj);
        }

        public b(int j, String s, com.android.volley.m.b b1, com.android.volley.m.a a1)
        {
            super(j, s, a1);
            a = b1;
            s = new com.google.b.g();
            s.a(com/cardinalblue/android/piccollage/model/gson/CBCollagesResponse, new com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse.CBCollagesResponseDeserializer());
            b = s.a();
        }
    }

    public static class c extends n
    {

        private Map a;
        private Map b;

        public void a(Map map)
        {
            a = map;
        }

        public void b(Map map)
        {
            b = map;
        }

        public Map k()
            throws com.android.volley.a
        {
            return b;
        }

        protected Map p()
            throws com.android.volley.a
        {
            return a;
        }

        public c(int j, String s, com.android.volley.m.b b1, com.android.volley.m.a a1)
        {
            super(j, s, b1, a1);
            a = null;
            b = Collections.emptyMap();
        }
    }

    public static class d extends h
    {

        public com.android.volley.k a()
        {
            b b1 = new b(f, b, c, d);
            if (!TextUtils.isEmpty(e))
            {
                b1.a(e);
            }
            return b1;
        }

        public d()
        {
        }
    }

    public static class e extends com.android.volley.k
    {

        private final com.android.volley.m.b a;

        protected com.android.volley.m a(com.android.volley.g g1)
        {
            g1 = com.android.volley.m.a(new pl.droidsonroids.gif.c(g1.b), com.android.volley.toolbox.e.a(g1));
            return g1;
            g1;
_L2:
            return com.android.volley.m.a(new r(g1));
            g1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        protected void a(pl.droidsonroids.gif.c c1)
        {
            if (a != null)
            {
                a.a(c1);
            }
        }

        protected void b(Object obj)
        {
            a((pl.droidsonroids.gif.c)obj);
        }

        public e(int j, String s, com.android.volley.m.b b1, com.android.volley.m.a a1)
        {
            super(j, s, a1);
            a = b1;
        }
    }

    public static class f extends com.android.volley.k
    {

        private com.android.volley.m.b a;
        private final com.google.b.f b = (new com.google.b.g()).a();

        protected com.android.volley.m a(com.android.volley.g g1)
        {
            g1 = new String(g1.b);
            return com.android.volley.m.a((NotificationResponse)b.a(g1, com/cardinalblue/android/piccollage/model/gson/NotificationResponse), h());
        }

        protected void a(NotificationResponse notificationresponse)
        {
            if (a != null)
            {
                a.a(notificationresponse);
            }
        }

        protected void b(Object obj)
        {
            a((NotificationResponse)obj);
        }

        public f(int j, String s, com.android.volley.m.b b1, com.android.volley.m.a a1)
        {
            super(j, s, a1);
            a = b1;
        }
    }

    public static class g extends h
    {

        public com.android.volley.k a()
        {
            f f1 = new f(f, b, c, d);
            if (!TextUtils.isEmpty(e))
            {
                f1.a(e);
            }
            return f1;
        }

        public g()
        {
        }
    }

    public static abstract class h
    {

        protected Map a;
        String b;
        com.android.volley.m.b c;
        com.android.volley.m.a d;
        String e;
        int f;
        Map g;

        public abstract com.android.volley.k a();

        public h a(int j)
        {
            f = j;
            return this;
        }

        public h a(com.android.volley.m.a a1)
        {
            d = a1;
            return this;
        }

        public h a(com.android.volley.m.b b1)
        {
            c = b1;
            return this;
        }

        public h a(String s)
        {
            e = s;
            return this;
        }

        public h a(Map map)
        {
            a = map;
            return this;
        }

        public h b(String s)
        {
            b = s;
            return this;
        }

        public h b(Map map)
        {
            g = map;
            return this;
        }

        public h()
        {
            f = 0;
        }
    }

    public static class i extends h
    {

        public com.android.volley.k a()
        {
            c c1 = new c(f, b, c, d);
            if (!TextUtils.isEmpty(e))
            {
                c1.a(e);
            }
            if (a != null)
            {
                c1.a(a);
            }
            if (g != null)
            {
                c1.b(g);
            }
            return c1;
        }

        public i()
        {
        }
    }


    private static com.cardinalblue.android.piccollage.lib.i a;
    private l b;
    private l c;

    private com.cardinalblue.android.piccollage.lib.i(Context context)
    {
        File file = new File(context.getCacheDir(), "volley");
        com.android.volley.toolbox.a a1 = new com.android.volley.toolbox.a(new com.android.volley.toolbox.g());
        c = new l(new com.android.volley.toolbox.c(file, 0x6400000), a1);
        c.a();
        b = o.a(context);
    }

    public static com.cardinalblue.android.piccollage.lib.i a()
    {
        return a(k.a());
    }

    public static com.cardinalblue.android.piccollage.lib.i a(Context context)
    {
        if (a == null)
        {
            a = new com.cardinalblue.android.piccollage.lib.i(context);
        }
        return a;
    }

    public Bitmap a(String s, int j, int i1, android.graphics.Bitmap.Config config)
        throws InterruptedException, ExecutionException
    {
        m m1 = m.a();
        s = new com.android.volley.toolbox.i(s, m1, j, i1, config, m1);
        s.a(new com.android.volley.c(2500, 5, 1.0F));
        m1.a(a(((com.android.volley.k) (s))));
        try
        {
            s = (Bitmap)m1.get(15L, TimeUnit.SECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new InterruptedException("connection timeout");
        }
        return s;
    }

    public com.android.volley.b.a a(String s)
    {
        return b.d().a(s);
    }

    public com.android.volley.k a(com.android.volley.k k1)
    {
        return c.a(k1);
    }

    public Object a(m m1, com.android.volley.toolbox.k k1)
        throws InterruptedException, ExecutionException
    {
        m1.a(b(k1));
        return m1.get();
    }

    public void a(Object obj)
    {
        b.a(obj);
    }

    public com.android.volley.k b(com.android.volley.k k1)
    {
        return b.a(k1);
    }

    public l b()
    {
        return c;
    }
}
