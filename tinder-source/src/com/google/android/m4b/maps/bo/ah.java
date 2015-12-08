// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.be.j;
import com.google.android.m4b.maps.be.k;
import com.google.android.m4b.maps.bq.m;
import com.google.android.m4b.maps.bq.n;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.i;
import com.google.android.m4b.maps.bx.l;
import com.google.android.m4b.maps.bx.o;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            s, y, z, t, 
//            am, ac, bg, aa, 
//            ap

public abstract class ah
    implements Comparable
{
    static final class a extends i
    {

        private final boolean I;

        public final int a(int i1, com.google.android.m4b.maps.bx.i j1)
        {
label0:
            {
                int k1;
                if (I)
                {
                    k1 = i1;
                    if (j1 != com.google.android.m4b.maps.bx.i.b)
                    {
                        break label0;
                    }
                }
                if (j1 == com.google.android.m4b.maps.bx.i.e || j1 == com.google.android.m4b.maps.bx.i.d)
                {
                    k1 = 0;
                } else
                {
                    k1 = i1;
                    if (j1 != com.google.android.m4b.maps.bx.i.a)
                    {
                        k1 = i1;
                        if (j1 != com.google.android.m4b.maps.bx.i.c)
                        {
                            return i1 & 0xffffe5f9;
                        }
                    }
                }
            }
            return k1;
        }

        public final void a(GL10 gl10)
        {
            gl10.glColor4f(0.0F, 0.0F, 0.0F, 0.3F);
        }

        public final boolean e()
        {
            return true;
        }

        public final boolean f()
        {
            return true;
        }

        private a(a a1)
        {
            super(a1, (byte)0);
            I = a1.a;
        }

        a(a a1, byte byte0)
        {
            this(a1);
        }
    }

    static final class a.a extends i.a
    {

        boolean a;

        final ah a()
        {
            return new a(this, (byte)0);
        }

        private a.a(int i1)
        {
            super(i1, (byte)0);
            a = false;
        }

        a.a(int i1, byte byte0)
        {
            this(i1);
        }
    }

    static abstract class b
    {

        final int b;
        int c;
        String d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        String i;

        abstract ah a();

        final b b()
        {
            c = 128;
            return this;
        }

        private b(int i1)
        {
            c = 0;
            d = "";
            e = false;
            f = true;
            g = false;
            h = false;
            i = null;
            b = i1;
        }

        b(int i1, byte byte0)
        {
            this(i1);
        }
    }

    static final class c extends ah
    {

        final int a()
        {
            return 2048;
        }

        public final com.google.android.m4b.maps.be.i.c a(com.google.android.m4b.maps.bs.e e1)
        {
            return new d(this, e1);
        }

        public final com.google.android.m4b.maps.bq.j a(u u1, Resources resources, Locale locale, File file, com.google.android.m4b.maps.bs.e e1)
        {
            float f2 = 3F;
            float f1;
            byte byte0;
            int i1;
            if (resources.getDisplayMetrics().densityDpi > 160)
            {
                byte0 = 3;
            } else
            {
                byte0 = 1;
            }
            if (this == ah.d)
            {
                i1 = com.google.android.m4b.maps.bx.l.a(resources);
            } else
            {
                i1 = com.google.android.m4b.maps.bx.l.a(resources, 256);
            }
            if (F)
            {
                f1 = resources.getDisplayMetrics().density;
            } else
            {
                f1 = 1.0F;
            }
            if (this == x)
            {
                if (f1 == 4F)
                {
                    f1 = f2;
                } else
                if (f1 == 3F)
                {
                    f1 = 2.0F;
                } else
                if (f1 == 2.0F)
                {
                    f1 = 1.5F;
                } else
                {
                    f1 = 1.0F;
                }
            }
            return new com.google.android.m4b.maps.bq.c(u1, this, byte0, i1, f1, locale, file, e1);
        }

        public final void a(GL10 gl10)
        {
            gl10.glColor4f(0.0F, 0.0F, 1.0F, 0.3F);
        }

        public final int compareTo(Object obj)
        {
            return a((ah)obj);
        }

        public final boolean f()
        {
            return true;
        }

        private c(a a1)
        {
            super(a1, (byte)0);
        }

        c(a a1, byte byte0)
        {
            this(a1);
        }
    }

    static final class c.a extends b
    {

        final ah a()
        {
            return new c(this, (byte)0);
        }

        private c.a(int i1)
        {
            super(i1, (byte)0);
        }

        c.a(int i1, byte byte0)
        {
            this(i1);
        }
    }

    static final class d
        implements com.google.android.m4b.maps.be.i.c
    {

        private final ah a;
        private final com.google.android.m4b.maps.bs.e b;

        public final aa a(ac ac1, byte abyte0[], int i1, long l1, long l2)
        {
            abyte0 = new com.google.android.m4b.maps.ad.a(abyte0);
            abyte0.skipBytes(i1);
            ah ah1 = a;
            com.google.android.m4b.maps.bs.e e1 = b;
            i1 = abyte0.readInt();
            if (i1 != 0x44524154)
            {
                throw new IOException((new StringBuilder(32)).append("TILE_MAGIC expected: ").append(i1).toString());
            }
            i1 = am.a(abyte0);
            if (i1 != 7 && i1 != 8)
            {
                ac1 = String.valueOf("Version mismatch: 7 or 8 expected, ");
                throw new IOException((new StringBuilder(String.valueOf(ac1).length() + 17)).append(ac1).append(i1).append(" found").toString());
            }
            ac ac2 = ac.a(abyte0);
            if (ac2.b != ac1.b || ac2.c != ac1.c || ac2.a != ac1.a)
            {
                ac1 = String.valueOf(ac1);
                abyte0 = String.valueOf(ac2);
                throw new IOException((new StringBuilder(String.valueOf(ac1).length() + 36 + String.valueOf(abyte0).length())).append("Expected tile coords: ").append(ac1).append(" but received ").append(abyte0).toString());
            } else
            {
                i1 = am.a(abyte0);
                int j1 = am.a(abyte0);
                int k1 = am.a(abyte0);
                byte abyte1[] = new byte[am.a(abyte0)];
                abyte0.readFully(abyte1);
                return new bg(ac1, i1, j1, k1, abyte1, ah1, e1);
            }
        }

        public d(ah ah1, com.google.android.m4b.maps.bs.e e1)
        {
            a = ah1;
            b = e1;
        }
    }

    static final class e extends i
    {

        public final void a(GL10 gl10)
        {
            gl10.glColor4f(1.0F, 0.0F, 0.0F, 0.3F);
        }

        public final boolean f()
        {
            return true;
        }

        private e(a a1)
        {
            super(a1, (byte)0);
        }

        e(a a1, byte byte0)
        {
            this(a1);
        }
    }

    static final class e.a extends i.a
    {

        final ah a()
        {
            return new e(this, (byte)0);
        }

        private e.a(int i1)
        {
            super(i1, (byte)0);
        }

        e.a(int i1, byte byte0)
        {
            this(i1);
        }
    }

    static final class f extends ah
    {

        final int a()
        {
            return 0;
        }

        public final com.google.android.m4b.maps.be.i.c a(com.google.android.m4b.maps.bs.e e1)
        {
            return null;
        }

        public final com.google.android.m4b.maps.bq.j a(u u1, Resources resources, Locale locale, File file, com.google.android.m4b.maps.bs.e e1)
        {
            return new com.google.android.m4b.maps.bq.e(u1, com.google.android.m4b.maps.bx.l.a(resources, 256), locale, file, e1);
        }

        public final int compareTo(Object obj)
        {
            return a((ah)obj);
        }

        private f(a a1)
        {
            super(a1, (byte)0);
        }

        f(a a1, byte byte0)
        {
            this(a1);
        }
    }

    static final class f.a extends b
    {

        final ah a()
        {
            return new f(this, (byte)0);
        }

        private f.a()
        {
            super(8, (byte)0);
        }

        f.a(byte byte0)
        {
            this();
        }
    }

    static final class g extends ah
    {

        final int a()
        {
            return 2048;
        }

        public final com.google.android.m4b.maps.be.i.c a(com.google.android.m4b.maps.bs.e e1)
        {
            return new h((byte)0);
        }

        public final com.google.android.m4b.maps.bq.j a(u u1, Resources resources, Locale locale, File file, com.google.android.m4b.maps.bs.e e1)
        {
            return new com.google.android.m4b.maps.bq.h(u1, this, locale, file, e1);
        }

        public final k b()
        {
            return new com.google.android.m4b.maps.be.j(Math.max(Math.min(128, (com.google.android.m4b.maps.bx.o.e() >> 3) * 18), 36));
        }

        public final int compareTo(Object obj)
        {
            return a((ah)obj);
        }

        private g(a a1)
        {
            super(a1, (byte)0);
        }

        g(a a1, byte byte0)
        {
            this(a1);
        }
    }

    static final class g.a extends b
    {

        final ah a()
        {
            return new g(this, (byte)0);
        }

        private g.a()
        {
            super(11, (byte)0);
        }

        g.a(byte byte0)
        {
            this();
        }
    }

    static final class h
        implements com.google.android.m4b.maps.be.i.c
    {

        public final aa a(ac ac, byte abyte0[], int i1, long l1, long l2)
        {
            return com.google.android.m4b.maps.bc.b.a(ac, abyte0, i1, l1);
        }

        private h()
        {
        }

        h(byte byte0)
        {
            this();
        }
    }

    static class i extends ah
    {

        final int a()
        {
            return 4096;
        }

        public final com.google.android.m4b.maps.be.i.c a(com.google.android.m4b.maps.bs.e e1)
        {
            return new j(this, e1);
        }

        public final com.google.android.m4b.maps.bq.j a(u u1, Resources resources, Locale locale, File file, com.google.android.m4b.maps.bs.e e1)
        {
            float f1;
            int i1;
            if (F)
            {
                f1 = resources.getDisplayMetrics().density;
            } else
            {
                f1 = 1.0F;
            }
            i1 = com.google.android.m4b.maps.bx.l.a(resources, 256);
            if (this != com.google.android.m4b.maps.bo.ah.u) goto _L2; else goto _L1
_L1:
            u1 = null;
_L4:
            return u1;
_L2:
            if (C)
            {
                return new m(u1, this, i1, f1, locale, file, m.e, e1);
            }
            resources = new n(u1, this, i1, f1, locale, file, e1);
            if (this == ah.f)
            {
                break; /* Loop/switch isn't completed */
            }
            u1 = resources;
            if (this != ah.g) goto _L4; else goto _L3
_L3:
            resources.f();
            return resources;
        }

        public int compareTo(Object obj)
        {
            return a((ah)obj);
        }

        private i(a a1)
        {
            super(a1, (byte)0);
        }

        i(a a1, byte byte0)
        {
            this(a1);
        }
    }

    static class i.a extends b
    {

        ah a()
        {
            return new i(this, (byte)0);
        }

        private i.a(int i1)
        {
            super(i1, (byte)0);
        }

        i.a(int i1, byte byte0)
        {
            this(i1);
        }
    }

    static final class j
        implements com.google.android.m4b.maps.be.i.c
    {

        private ah a;
        private com.google.android.m4b.maps.bs.e b;

        public final aa a(ac ac, byte abyte0[], int i1, long l1, long l2)
        {
            return ap.a(ac, abyte0, i1, a, l1, l2, b);
        }

        public j(ah ah1, com.google.android.m4b.maps.bs.e e1)
        {
            a = ah1;
            b = e1;
        }
    }


    private static final Map I = new HashMap();
    private static final List J = new ArrayList();
    private static final s M;
    private static final y N;
    private static final y O;
    private static final y P;
    private static final z Q;
    private static final t R;
    private static final t S;
    private static final t T;
    public static final ah a;
    public static final ah b;
    public static final ah c;
    public static final ah d;
    public static final ah e;
    public static final ah f;
    public static final ah g;
    public static final ah h = (new f.a((byte)0)).a();
    public static final ah i;
    public static final ah j;
    public static final ah k;
    public static final ah l;
    public static final ah m;
    public static final ah n;
    public static final ah o;
    public static final ah p;
    public static final ah q;
    public static final ah r;
    public static final ah s;
    public static final ah t;
    public static final ah u;
    public static final ah v;
    public static final ah w;
    public static final ah x;
    public static final ah y;
    public static final ah z;
    public final int A;
    public final int B;
    public final boolean C;
    public final String D;
    public final int E;
    final boolean F;
    public final boolean G;
    public final String H;
    private int K;
    private final boolean L;

    private ah(b b1)
    {
        A = b1.b;
        B = b1.c;
        D = b1.d;
        C = b1.e;
        F = b1.f;
        L = b1.g;
        G = b1.h;
        H = b1.i;
        K = A + (B << 8);
        E = J.size();
        J.add(this);
        int i1 = d();
        b1 = (ah)I.get(Integer.valueOf(i1));
        if (H == null)
        {
            if (b1 == null || ((ah) (b1)).H != null)
            {
                I.put(Integer.valueOf(i1), this);
            }
        } else
        if (b1 == null)
        {
            I.put(Integer.valueOf(i1), this);
            return;
        }
    }

    ah(b b1, byte byte0)
    {
        this(b1);
    }

    public static ah a(int i1)
    {
        return (ah)I.get(Integer.valueOf(i1));
    }

    public static Iterable c()
    {
        return J;
    }

    public abstract int a();

    public int a(int i1, com.google.android.m4b.maps.bx.i j1)
    {
        return i1;
    }

    public final int a(ah ah1)
    {
        return E - ah1.E;
    }

    public abstract com.google.android.m4b.maps.be.i.c a(com.google.android.m4b.maps.bs.e e1);

    public abstract com.google.android.m4b.maps.bq.j a(u u1, Resources resources, Locale locale, File file, com.google.android.m4b.maps.bs.e e1);

    public void a(GL10 gl10)
    {
    }

    public k b()
    {
        return new com.google.android.m4b.maps.be.j(Math.max(Math.min(256, (com.google.android.m4b.maps.bx.o.e() >> 3) * 32), 64));
    }

    public int compareTo(Object obj)
    {
        return a((ah)obj);
    }

    public final int d()
    {
        return A + B;
    }

    public boolean e()
    {
        return false;
    }

    public boolean f()
    {
        return false;
    }

    public String toString()
    {
        if (H == null)
        {
            return (new StringBuilder("TileType[")).append(A).append("]").toString();
        } else
        {
            return (new StringBuilder("TileType[")).append(A).append(",").append(H).append("]").toString();
        }
    }

    static 
    {
        Object obj = new a.a(10, (byte)0);
        obj.g = true;
        obj.h = true;
        a = ((b) (obj)).a();
        obj = new a.a(22, (byte)0);
        obj.g = true;
        obj.h = true;
        b = ((b) (obj)).a();
        obj = new a.a(20, (byte)0);
        obj.d = "_tran_base";
        obj.g = true;
        obj.h = true;
        c = ((b) (obj)).a();
        obj = new c.a(3, (byte)0);
        obj.f = false;
        obj.h = true;
        d = ((b) (obj)).a();
        obj = new c.a(12, (byte)0);
        obj.d = "_ter";
        obj.f = false;
        obj.h = true;
        e = ((b) (obj)).a();
        obj = new i.a(4, (byte)0);
        obj.d = "_traf";
        f = ((b) (obj)).a();
        obj = new i.a(23, (byte)0);
        obj.d = "_traf";
        g = ((b) (obj)).a();
        obj = new g.a((byte)0);
        obj.h = true;
        i = ((b) (obj)).a();
        obj = new a.a(18, (byte)0);
        obj.a = true;
        obj.d = "_vec_bic";
        obj.h = true;
        j = ((b) (obj)).a();
        obj = (new c.a(7, (byte)0)).b();
        obj.d = "_ter_bic";
        k = ((b) (obj)).a();
        obj = (new c.a(6, (byte)0)).b();
        obj.d = "_hy_bic";
        l = ((b) (obj)).a();
        obj = new i.a(13, (byte)0);
        obj.d = "_tran";
        obj.h = true;
        m = ((b) (obj)).a();
        obj = new i.a(14, (byte)0);
        obj.h = true;
        obj.d = "_inaka";
        n = ((b) (obj)).a();
        obj = new e.a(15, (byte)0);
        obj.d = "_labl";
        obj.g = true;
        obj.h = true;
        o = ((b) (obj)).a();
        obj = new e.a(21, (byte)0);
        obj.d = "_tran_labl";
        obj.g = true;
        obj.h = true;
        p = ((b) (obj)).a();
        obj = new i.a(16, (byte)0);
        obj.d = "_psm";
        obj.e = true;
        q = ((b) (obj)).a();
        obj = new i.a(17, (byte)0);
        obj.d = "_related";
        obj.e = true;
        r = ((b) (obj)).a();
        obj = new i.a(24, (byte)0);
        obj.d = "_high";
        obj.e = true;
        obj.h = true;
        s = ((b) (obj)).a();
        obj = new i.a(25, (byte)0);
        obj.d = "_api";
        t = ((b) (obj)).a();
        obj = new i.a(0, (byte)0);
        obj.d = "_star";
        obj.e = true;
        obj.h = false;
        u = ((b) (obj)).a();
        obj = new i.a(26, (byte)0);
        obj.d = "_spotlight";
        v = ((b) (obj)).a();
        obj = new i.a(27, (byte)0);
        obj.d = "_maps_engine_vector";
        obj.h = true;
        w = ((b) (obj)).a();
        obj = new c.a(28, (byte)0);
        obj.d = "_maps_engine_image";
        obj.h = true;
        x = ((b) (obj)).a();
        obj = new i.a(10, (byte)0);
        obj.i = "RoadmapAmbiactive";
        obj.d = "_amb_col";
        obj.h = true;
        y = ((b) (obj)).a();
        obj = new i.a(10, (byte)0);
        obj.i = "RoadmapAmbiactiveLowBit";
        obj.d = "_amb_low_bit";
        obj.h = true;
        z = ((b) (obj)).a();
        M = new s(0, 0.0F, new int[0], 0);
        N = new y(0xff000000, M);
        O = new y(0xff0000ff, M);
        P = new y(0xffff0000, M);
        Q = new z(-1, 0, 10, 1.2F, 1.0F, 0);
        R = new t(-1, 12, null, null, Q, N, null, null);
        S = new t(-1, 12, null, null, Q, P, null, null);
        T = new t(-1, 12, null, null, Q, O, null, null);
    }
}
