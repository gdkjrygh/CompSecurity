// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.cq.m;
import com.google.android.m4b.maps.y.j;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashSet;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            q, af, ad, s, 
//            d

public final class ae
{
    final class a
        implements Runnable
    {

        private final b a;
        private final String b;
        private boolean c;
        private ae d;

        public final void run()
        {
            Object obj;
            Object obj2;
            Object obj3;
            obj3 = null;
            obj2 = null;
            Thread.currentThread().getName();
            obj = obj3;
            Object obj1 = com.google.android.m4b.maps.bv.ae.a(d);
            obj = obj3;
            Object obj4 = b;
            obj = obj3;
            long l = com.google.android.m4b.maps.bv.q.a;
            if (obj4 == null) goto _L2; else goto _L1
_L1:
            obj = obj3;
            if (((String) (obj4)).length() >= 5) goto _L2; else goto _L3
_L3:
            obj = obj3;
            throw new IllegalArgumentException("persistentKey");
            obj;
            obj1 = obj2;
            obj2 = obj;
_L15:
            obj = obj1;
            com.google.android.m4b.maps.bv.d.a("PM failed to load config", ((Throwable) (obj2)));
            obj = ae.b(d);
            if (b != null && b.equals(obj))
            {
                obj1.p = c;
                a.a(false, ((q) (obj1)));
            }
            com.google.android.m4b.maps.bv.ae.a(d, b);
            return;
_L2:
            if (l >= 1L) goto _L5; else goto _L4
_L4:
            obj = obj3;
            throw new IllegalArgumentException("shelfLife");
            obj;
            obj = null;
_L13:
            obj1 = obj;
            com.google.android.m4b.maps.bv.d.b("PM was interrupted loading config");
            obj1 = obj;
            Thread.currentThread().interrupt();
            obj = ae.b(d);
            if (b != null && b.equals(obj))
            {
                boolean flag = c;
                a.a(true, null);
            }
            com.google.android.m4b.maps.bv.ae.a(d, b);
            return;
_L5:
            obj = obj3;
            if (((s) (obj1)).a == null || obj4 == null) goto _L7; else goto _L6
_L6:
            obj = obj3;
            obj1 = ((s) (obj1)).b(((String) (obj4)), l);
            if (obj1 == null) goto _L9; else goto _L8
_L8:
            obj = obj3;
            obj4 = new ByteArrayInputStream(((byte []) (obj1)));
            obj = com.google.android.m4b.maps.bv.q.a(((java.io.InputStream) (obj4)));
            obj1 = obj;
            com.google.android.m4b.maps.bv.s.a(((java.io.Closeable) (obj4)));
            obj1 = ae.b(d);
            if (b != null && b.equals(obj1))
            {
                obj.p = c;
                a.a(false, ((q) (obj)));
            }
            com.google.android.m4b.maps.bv.ae.a(d, b);
            return;
_L9:
            obj = obj3;
            if (!Thread.interrupted()) goto _L11; else goto _L10
_L10:
            obj = obj3;
            throw new InterruptedException("read");
            Exception exception1;
            exception1;
            obj1 = obj;
            obj = exception1;
_L12:
            exception1 = ((Exception) (ae.b(d)));
            if (b != null && b.equals(exception1))
            {
                obj1.p = c;
                a.a(false, ((q) (obj1)));
            }
            com.google.android.m4b.maps.bv.ae.a(d, b);
            throw obj;
_L11:
            obj1 = null;
              goto _L8
_L7:
            obj1 = null;
              goto _L8
            Exception exception;
            exception;
            obj = obj3;
            com.google.android.m4b.maps.bv.s.a(((java.io.Closeable) (obj4)));
            obj = obj3;
            throw exception;
            obj;
              goto _L12
            exception;
              goto _L13
            exception1;
            exception = ((Exception) (obj));
            if (true) goto _L15; else goto _L14
_L14:
        }

        public a(b b1, String s1, boolean flag)
        {
            d = ae.this;
            super();
            a = b1;
            b = s1;
            j.a(s1, "persistentKey");
            c = flag;
        }
    }

    public static interface b
    {

        public abstract void a(boolean flag, q q1);
    }

    public static interface c
    {

        public abstract void a(ad ad1, Bitmap bitmap);
    }

    final class d
        implements af.a
    {

        private final b a;
        private final c b;
        private final Object c;
        private int d;
        private boolean e;
        private ae f;

        public final void a()
        {
            if (a != null && d != 1 && c != null && c.equals(com.google.android.m4b.maps.bv.ae.c(f)))
            {
                a.a(true, null);
            }
            com.google.android.m4b.maps.bv.ae.a(f, c);
        }

        public final void a(q q1, com.google.android.m4b.maps.ac.a a1)
        {
            d = d + 1;
            if (a != null && c != null && c.equals(com.google.android.m4b.maps.bv.ae.c(f)))
            {
                q1.p = e;
                a.a(false, q1);
            }
            q1 = com.google.android.m4b.maps.bv.q.a(q1.i);
            try
            {
                SystemClock.uptimeMillis();
                a1 = a1.c();
                com.google.android.m4b.maps.bv.ae.a(f).a(a1, q1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (q q1)
            {
                com.google.android.m4b.maps.bv.d.a("PM failed to cache config", q1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (q q1)
            {
                com.google.android.m4b.maps.bv.d.b("PM was interrupted caching config");
            }
            Thread.currentThread().interrupt();
        }

        public final void a(String s1, int i, int k, int l, int i1, byte abyte0[])
        {
            s1 = new ad(s1, k, l, i1, i);
            if (b != null)
            {
                Object obj = new android.graphics.BitmapFactory.Options();
                obj.inDither = true;
                obj.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
                obj.inPurgeable = true;
                obj = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, ((android.graphics.BitmapFactory.Options) (obj)));
                b.a(s1, ((Bitmap) (obj)));
            }
            try
            {
                s s2 = com.google.android.m4b.maps.bv.ae.a(f);
                String s3 = ((ad) (s1)).a;
                i = ((ad) (s1)).e;
                k = ((ad) (s1)).b;
                l = ((ad) (s1)).c;
                s2.a(abyte0, (new StringBuilder(String.valueOf(s3).length() + 41)).append("tile_").append(s3).append("_").append(i).append("_").append(k).append("_").append(l).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                s1 = String.valueOf(s1);
                com.google.android.m4b.maps.bv.d.a((new StringBuilder(String.valueOf(s1).length() + 24)).append("PM failed to cache tile ").append(s1).toString(), abyte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                s1 = String.valueOf(s1);
            }
            com.google.android.m4b.maps.bv.d.b((new StringBuilder(String.valueOf(s1).length() + 32)).append("PM was interrupted caching tile ").append(s1).toString());
            Thread.currentThread().interrupt();
        }

        public d(b b1, c c1, Object obj, boolean flag)
        {
            f = ae.this;
            super();
            d = 0;
            a = b1;
            b = c1;
            c = obj;
            e = flag;
        }
    }


    static long a;
    final s b;
    Object c;
    final com.google.android.m4b.maps.ay.m d;
    private final HashSet e = new HashSet();

    public ae(s s, com.google.android.m4b.maps.ay.m m1)
    {
        b = s;
        d = m1;
    }

    static s a(ae ae1)
    {
        return ae1.b;
    }

    static void a(ae ae1, Object obj)
    {
        ae1.b(obj);
    }

    static Object b(ae ae1)
    {
        if (ae1.c instanceof String)
        {
            return com.google.android.m4b.maps.bv.q.a((String)ae1.c);
        } else
        {
            return ae1.c;
        }
    }

    private void b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        e.remove(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    static Object c(ae ae1)
    {
        return ae1.c;
    }

    public final boolean a(c c1, ad ad1, boolean flag)
    {
        if (a(ad1))
        {
            return false;
        }
        c1 = new af(new d(null, c1, ad1, false), ad1.a, d);
        int i = ad1.e;
        if (i < 0)
        {
            throw new IllegalArgumentException("zoom < 0");
        }
        if (((af) (c1)).c != null)
        {
            throw new IllegalStateException("already requested tiles");
        }
        ((af) (c1)).e.append(" tiles @ zoom ").append(i);
        c1.b = i;
        c1.c = com.google.android.m4b.maps.ac.c.b(((af) (c1)).a, 33);
        com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(m.a);
        a1.a(16, 3L);
        ((af) (c1)).c.b(34, a1);
        ((af) (c1)).c.a(35, 512L);
        ((af) (c1)).c.a(36, i);
        i = ad1.b;
        int k = ad1.c;
        int l = ad1.d;
        if (((af) (c1)).c == null)
        {
            throw new IllegalStateException("must call addTilesRequest first");
        }
        ((af) (c1)).e.append((new StringBuilder(44)).append(" (").append(i).append(", ").append(k).append(") face ").append(l).toString());
        ad1 = com.google.android.m4b.maps.ac.c.c(((af) (c1)).c, 37);
        ad1.a(39, i);
        ad1.a(40, k);
        if (l != -1)
        {
            ad1.a(60, l);
        }
        c1.d = flag;
        c1.i();
        return true;
    }

    public final boolean a(c c1, String s, int i, boolean flag)
    {
        j.a(c1, "listener");
        j.a(s, "panoId");
        return a(c1, new ad(s, 0, 0, i, 0), flag);
    }

    final boolean a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e.contains(obj);
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e.add(obj);
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    static 
    {
        a = com.google.android.m4b.maps.bv.q.a - 10000L;
    }
}
