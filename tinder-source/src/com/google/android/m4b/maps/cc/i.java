// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import com.google.android.m4b.maps.bg.a;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.f;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bn.h;
import com.google.android.m4b.maps.bn.l;
import com.google.android.m4b.maps.bo.ab;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bk;
import com.google.android.m4b.maps.bo.bm;
import com.google.android.m4b.maps.bo.p;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bo.y;
import com.google.android.m4b.maps.bo.z;
import com.google.android.m4b.maps.br.c;
import com.google.android.m4b.maps.bx.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            c, n, h

public final class i
    implements com.google.android.m4b.maps.cc.c
{
    public static final class a
        implements e
    {

        private final Bitmap a;
        private final com.google.android.m4b.maps.bm.j.a b;
        private final int c;
        private final int d;

        public final float a()
        {
            return (float)c;
        }

        public final j a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bx.i i1)
        {
            boolean flag = true;
            j j1 = (j)b.c(a);
            i1 = j1;
            if (j1 == null)
            {
                i1 = new j(d1, (byte)0);
                i1.d = true;
                i1.e = false;
                if (android.os.Build.VERSION.SDK_INT < 9)
                {
                    flag = false;
                }
                if (flag && !com.google.android.m4b.maps.ao.b.c)
                {
                    i1.a(a);
                } else
                {
                    i1.b(a);
                }
                b.b(a, i1);
            }
            i1.b();
            return i1;
        }

        public final j a(com.google.android.m4b.maps.bx.i i1)
        {
            i1 = (j)b.c(a);
            if (i1 != null)
            {
                i1.b();
            }
            return i1;
        }

        public final float b()
        {
            return (float)d;
        }

        public final float c()
        {
            return 0.0F;
        }

        public final float d()
        {
            return 0.0F;
        }

        public final float e()
        {
            return (float)d;
        }

        a(Bitmap bitmap, float f1, com.google.android.m4b.maps.bm.j.a a1)
        {
            a = bitmap;
            b = a1;
            c = (int)((float)a.getWidth() * f1);
            d = (int)((float)a.getHeight() * f1);
        }
    }

    static final class b
        implements e
    {

        private float a;

        public final float a()
        {
            return a;
        }

        public final j a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bx.i i1)
        {
            return null;
        }

        public final j a(com.google.android.m4b.maps.bx.i i1)
        {
            return null;
        }

        public final float b()
        {
            return 0.0F;
        }

        public final float c()
        {
            return 0.0F;
        }

        public final float d()
        {
            return 0.0F;
        }

        public final float e()
        {
            return 0.0F;
        }

        b(float f1)
        {
            a = f1;
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        private static final c d[];

        public static c a(int i1)
        {
            switch (i1)
            {
            default:
                throw new IllegalArgumentException("Unknown justification");

            case 1: // '\001'
                return a;

            case 2: // '\002'
                return b;

            case 3: // '\003'
                return c;
            }
        }

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/google/android/m4b/maps/cc/i$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        static 
        {
            a = new c("CENTER", 0);
            b = new c("LEFT", 1);
            c = new c("RIGHT", 2);
            d = (new c[] {
                a, b, c
            });
        }

        private c(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class d
        implements e
    {

        private final k a;
        private final String b;
        private final int c;
        private final t d;
        private final com.google.android.m4b.maps.bx.k.a e;
        private final float f;
        private final float g;
        private final float h;
        private final float i;
        private final int j;

        public final float a()
        {
            return f;
        }

        public final j a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bx.i i1)
        {
label0:
            {
                int l1 = com.google.android.m4b.maps.cc.h.b(d, i1);
                int i2 = com.google.android.m4b.maps.cc.h.a(d, i1);
                int j1 = i2;
                if (j == 0)
                {
                    break label0;
                }
                boolean flag = false;
                if (i1 != com.google.android.m4b.maps.bx.i.b)
                {
                    j1 = i2;
                    l1 = ((flag) ? 1 : 0);
                    if (i1 != com.google.android.m4b.maps.bx.i.c)
                    {
                        break label0;
                    }
                }
                l1 = j;
                j1 = com.google.android.m4b.maps.cc.h.a(l1, 255);
                k k1;
                String s;
                com.google.android.m4b.maps.bx.k.a a1;
                if (com.google.android.m4b.maps.cc.h.b(l1) < 192)
                {
                    j1 |= 0xffffff;
                }
                l1 = ((flag) ? 1 : 0);
            }
            k1 = a;
            s = b;
            a1 = e;
            if (d != null)
            {
                i1 = d.d;
            } else
            {
                i1 = null;
            }
            return k1.a(d1, s, a1, i1, c, j1, l1, j);
        }

        public final j a(com.google.android.m4b.maps.bx.i i1)
        {
            k k1 = a;
            String s = b;
            com.google.android.m4b.maps.bx.k.a a1 = e;
            z z1;
            if (d != null)
            {
                z1 = d.d;
            } else
            {
                z1 = null;
            }
            return k1.a(s, a1, z1, c, com.google.android.m4b.maps.cc.h.a(d, i1), com.google.android.m4b.maps.cc.h.b(d, i1), j);
        }

        public final float b()
        {
            return g;
        }

        public final float c()
        {
            return h;
        }

        public final float d()
        {
            return i;
        }

        public final float e()
        {
            return g - h - i;
        }

        d(k k1, String s, int i1, t t1, com.google.android.m4b.maps.bx.k.a a1)
        {
            a = k1;
            b = s;
            c = i1;
            d = t1;
            float f1 = 1.0F;
            int j1;
            if (t1.f())
            {
                j1 = t1.e.a;
            } else
            {
                j1 = 0;
            }
            j = j1;
            if (t1.e())
            {
                f1 = t1.d.d;
            }
            e = a1;
            if (d != null)
            {
                t1 = d.d;
            } else
            {
                t1 = null;
            }
            k1 = k1.a(s, a1, t1, i1, true, f1);
            if (a1 == k.e)
            {
                f = k1[0] * 0.8F;
            } else
            {
                f = k1[0];
            }
            g = k1[1];
            h = k1[2];
            i = k1[3];
        }
    }

    static interface e
    {

        public abstract float a();

        public abstract j a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bx.i i1);

        public abstract j a(com.google.android.m4b.maps.bx.i i1);

        public abstract float b();

        public abstract float c();

        public abstract float d();

        public abstract float e();
    }

    public static final class f extends Enum
    {

        public static final f a;
        public static final f b;
        public static final f c;
        private static final f d[];

        public static f a(int i1)
        {
            switch (i1)
            {
            default:
                throw new IllegalArgumentException("Unknown alignment");

            case 1: // '\001'
                return a;

            case 2: // '\002'
                return b;

            case 3: // '\003'
                return c;
            }
        }

        public static f valueOf(String s)
        {
            return (f)Enum.valueOf(com/google/android/m4b/maps/cc/i$f, s);
        }

        public static f[] values()
        {
            return (f[])d.clone();
        }

        static 
        {
            a = new f("CENTER", 0);
            b = new f("TOP", 1);
            c = new f("BOTTOM", 2);
            d = (new f[] {
                a, b, c
            });
        }

        private f(String s, int i1)
        {
            super(s, i1);
        }
    }


    float a;
    float b;
    private c c;
    private final f d;
    private final ArrayList e;
    private final ArrayList f;
    private final ArrayList g;
    private final l h;
    private final h i;
    private final com.google.android.m4b.maps.bm.f j;
    private final com.google.android.m4b.maps.bn.f k;
    private float l;
    private float m;
    private boolean n;
    private boolean o;

    private i(ArrayList arraylist, c c1, f f1)
    {
        e = arraylist;
        f = new ArrayList(arraylist.size());
        g = new ArrayList(arraylist.size());
        j = new com.google.android.m4b.maps.bm.f(arraylist.size() * 4);
        k = new com.google.android.m4b.maps.bn.f(j.j);
        h = j;
        i = j;
        c = c1;
        d = f1;
        b();
        n = false;
        o = true;
    }

    public static i a(bk bk1, bb bb, com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bm.j.a a1, k k1, com.google.android.m4b.maps.br.c c1)
    {
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        arraylist1.add(arraylist);
        int j1 = 0;
        do
        {
            if (j1 < bk1.a())
            {
                com.google.android.m4b.maps.bo.bk.a a3 = bk1.a(j1);
                if (com.google.android.m4b.maps.bo.bk.a.a(a3.a))
                {
                    t t1 = a3.e;
                    String s = a3.d;
                    int i1;
                    if (s == null || s.length() == 0 || k1 == null || t1 == null || !t1.e())
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = t1.d.a;
                        if (t1.d.c > 0 && (i1 & 0xff000000) != 0)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                    }
                    if (i1 != 0)
                    {
                        com.google.android.m4b.maps.bx.k.a a2 = c1.d;
                        if (bb instanceof p)
                        {
                            a2 = c1.a;
                        } else
                        if (bb instanceof bm)
                        {
                            a2 = c1.h;
                        }
                        arraylist.add(new d(k1, a3.d, com.google.android.m4b.maps.cc.n.a(t1, c1, b1.j), t1, a2));
                    }
                } else
                if (a3.a())
                {
                    Object obj = com.google.android.m4b.maps.bg.c.a().a(a3.b, null);
                    if (((com.google.android.m4b.maps.bg.a) (obj)).a())
                    {
                        obj = ((com.google.android.m4b.maps.bg.a) (obj)).b();
                        float f1 = a3.c;
                        if (a3.b.contains("/road_shields/"))
                        {
                            f1 *= c1.m;
                        } else
                        {
                            f1 *= c1.n;
                        }
                        arraylist.add(new a(((Bitmap) (obj)), f1 * b1.j, a1));
                    } else
                    {
                        return null;
                    }
                } else
                if (a3.c())
                {
                    arraylist.add(new b(a3.g));
                } else
                if (a3.d())
                {
                    arraylist = new ArrayList();
                    arraylist1.add(arraylist);
                }
                j1++;
                continue;
            }
            return new i(arraylist1, com.google.android.m4b.maps.cc.c.a(bk1.a.a()), com.google.android.m4b.maps.cc.f.a(bk1.a.b()));
        } while (true);
    }

    private void a(com.google.android.m4b.maps.bm.d d1)
    {
        com.google.android.m4b.maps.bm.f f10 = j;
        f10.a = null;
        if (f10.e != null)
        {
            f10.e.clear();
        }
        f10.h = 0;
        f10.g = 0;
        f10.i = 0;
        f10.b.clear();
        if (f10.d != null)
        {
            f10.d.clear();
        }
        if (f10.c != null)
        {
            f10.c.clear();
        }
        f10.f = 0;
        if (f10.k != null)
        {
            f10.k.clear();
        }
        k.b(d1);
        j.a(f.size() * 4);
        float f2 = b - l;
        int k1 = 0;
        int i1 = 0;
        do
        {
            if (i1 >= e.size())
            {
                break;
            }
            d1 = (ArrayList)e.get(i1);
            Iterator iterator = d1.iterator();
            float f5 = 0.0F;
            float f3;
            e e2;
            for (f3 = 0.0F; iterator.hasNext(); f3 = e2.a() + f3)
            {
                e2 = (e)iterator.next();
                f5 = Math.max(f5, e2.e());
            }

            float f1 = 0.0F;
            if (c == com.google.android.m4b.maps.cc.c.a)
            {
                f1 = (a - f3) / 2.0F;
            } else
            if (c == com.google.android.m4b.maps.cc.c.c)
            {
                f1 = a - f3;
            }
            for (d1 = d1.iterator(); d1.hasNext();)
            {
                e e1 = (e)d1.next();
                if (e1 instanceof b)
                {
                    f1 += e1.a();
                } else
                {
                    float f6 = e1.a();
                    float f7 = e1.b();
                    float f4;
                    float f8;
                    float f9;
                    j j1;
                    if (d == com.google.android.m4b.maps.cc.f.a)
                    {
                        f4 = f2 - (f5 - e1.e()) / 2.0F;
                    } else
                    if (d == com.google.android.m4b.maps.cc.f.c)
                    {
                        f4 = f2 - (f5 - e1.e());
                    } else
                    {
                        f4 = f2;
                    }
                    f4 += e1.c();
                    j1 = (j)f.get(k1);
                    f8 = j1.f;
                    f9 = j1.g;
                    h.a(f1, 0.0F, f4 - f7);
                    h.a(f1 + f6, 0.0F, f4 - f7);
                    h.a(f6 + f1, 0.0F, f4);
                    h.a(f1, 0.0F, f4);
                    i.a(0.0F, f9);
                    i.a(f8, f9);
                    i.a(f8, 0.0F);
                    i.a(0.0F, 0.0F);
                    f1 += e1.a();
                    k1++;
                }
            }

            i1++;
            f2 -= f5;
        } while (true);
        o = false;
        j.c();
        k.a(j.d());
    }

    private void b()
    {
        float f1;
        float f10;
        float f11;
        float f13;
        Object obj;
        Object obj1;
        f13 = 0.0F;
        f10 = 0.0F;
        f11 = 0.0F;
        a = 0.0F;
        int i1 = 0;
        f1 = 0.0F;
        for (; i1 < e.size(); i1++)
        {
            Iterator iterator = ((ArrayList)e.get(i1)).iterator();
            float f2 = 0.0F;
            float f6 = 0.0F;
            while (iterator.hasNext()) 
            {
                e e1 = (e)iterator.next();
                f6 += e1.a();
                f2 = Math.max(f2, e1.e());
            }
            a = Math.max(a, f6);
            f1 += f2;
        }

        obj1 = (ArrayList)e.get(0);
        obj = (ArrayList)e.get(e.size() - 1);
        l = 0.0F;
        m = 0.0F;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[f.values().length];
                try
                {
                    a[com.google.android.m4b.maps.cc.f.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.google.android.m4b.maps.cc.f.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.google.android.m4b.maps.cc.f.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.google.android.m4b.maps.cc._cls1.a[d.ordinal()];
        JVM INSTR tableswitch 1 3: default 204
    //                   1 220
    //                   2 354
    //                   3 485;
           goto _L1 _L2 _L3 _L4
_L1:
        b = l + f1 + m;
        return;
_L2:
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            e e3 = (e)((Iterator) (obj1)).next();
            l = Math.max(l, e3.c());
        }

        obj = ((ArrayList) (obj)).iterator();
        float f7 = 0.0F;
        float f3;
        for (f3 = f11; ((Iterator) (obj)).hasNext(); f3 = Math.max(f3, ((e) (obj1)).d() + f10))
        {
            obj1 = (e)((Iterator) (obj)).next();
            f10 = ((e) (obj1)).e();
            f7 = Math.max(f7, f10);
        }

        if (f3 > f7)
        {
            m = f3 - f7;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj1 = ((ArrayList) (obj1)).iterator();
        float f8 = 0.0F;
        float f4;
        e e4;
        for (f4 = f13; ((Iterator) (obj1)).hasNext(); f4 = Math.max(f4, e4.c() + f10))
        {
            e4 = (e)((Iterator) (obj1)).next();
            f10 = e4.e();
            f8 = Math.max(f8, f10);
        }

        if (f4 > f8)
        {
            l = f4 - f8;
        }
        obj = ((ArrayList) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            obj1 = (e)((Iterator) (obj)).next();
            m = Math.max(m, ((e) (obj1)).d());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = ((ArrayList) (obj1)).iterator();
        float f5 = 0.0F;
        float f9 = 0.0F;
        while (((Iterator) (obj1)).hasNext()) 
        {
            e e5 = (e)((Iterator) (obj1)).next();
            float f12 = e5.e() / 2.0F;
            f9 = Math.max(f9, f12);
            f5 = Math.max(f5, e5.c() + f12);
        }
        if (f5 > f9)
        {
            l = f5 - f9;
        }
        obj = ((ArrayList) (obj)).iterator();
        f9 = 0.0F;
        e e2;
        for (f5 = f10; ((Iterator) (obj)).hasNext(); f5 = Math.max(f5, e2.d() + f10))
        {
            e2 = (e)((Iterator) (obj)).next();
            f10 = e2.e() / 2.0F;
            f9 = Math.max(f9, f10);
        }

        if (f5 > f9)
        {
            m = f5 - f9;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bx.ab ab1)
    {
        boolean flag1;
        flag1 = false;
        if (n)
        {
            break MISSING_BLOCK_LABEL_315;
        }
        b1 = ab1.a;
        if (!f.isEmpty())
        {
            throw new IllegalStateException("this.textureArray should be empty.");
        }
        ab1 = e.iterator();
_L4:
        if (!ab1.hasNext()) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((ArrayList)ab1.next()).iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj = (e)iterator.next();
        if (obj instanceof b) goto _L6; else goto _L5
_L5:
        obj = ((e) (obj)).a(b1);
        if (obj != null) goto _L8; else goto _L7
_L7:
        boolean flag;
        for (ab1 = f.iterator(); ab1.hasNext(); ((j)ab1.next()).c()) { }
        f.clear();
        flag = false;
_L13:
        if (flag) goto _L10; else goto _L9
_L9:
        if (d1.a(10000)) goto _L12; else goto _L11
_L11:
        flag = false;
_L14:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_315;
        }
_L15:
        return;
_L8:
        f.add(obj);
          goto _L6
_L2:
        flag = true;
          goto _L13
_L12:
        if (!f.isEmpty())
        {
            throw new IllegalStateException("this.textureArray should be empty on initialize.");
        }
        for (ab1 = e.iterator(); ab1.hasNext();)
        {
            Iterator iterator1 = ((ArrayList)ab1.next()).iterator();
            while (iterator1.hasNext()) 
            {
                e e1 = (e)iterator1.next();
                if (!(e1 instanceof b))
                {
                    f.add(e1.a(d1, b1));
                }
            }
        }

_L10:
        a(d1);
        n = true;
        flag = true;
          goto _L14
        if (o)
        {
            a(d1);
        }
        b1 = d1.a;
        if (k.a != 0)
        {
            k.a(d1);
            int i1 = ((flag1) ? 1 : 0);
            while (i1 < f.size()) 
            {
                ((j)f.get(i1)).a(b1);
                b1.glDrawArrays(6, i1 * 4, 4);
                i1++;
            }
        }
          goto _L15
    }

    public final void a(c c1)
    {
        if (c != c1)
        {
            o = true;
        }
        c = c1;
    }

    public final boolean a()
    {
        return e.isEmpty() || a == 0.0F || b == 0.0F;
    }

    public final void b(com.google.android.m4b.maps.bm.d d1)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((j)iterator.next()).c()) { }
        f.clear();
        ArrayList arraylist;
        for (Iterator iterator1 = e.iterator(); iterator1.hasNext(); arraylist.clear())
        {
            arraylist = (ArrayList)iterator1.next();
            for (Iterator iterator2 = arraylist.iterator(); iterator2.hasNext(); iterator2.next()) { }
        }

        e.clear();
        k.c(d1);
    }

    public final void c(com.google.android.m4b.maps.bm.d d1)
    {
        b(d1);
        k.c(d1);
    }
}
