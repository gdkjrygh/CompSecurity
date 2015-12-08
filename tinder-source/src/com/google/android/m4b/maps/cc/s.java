// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.e;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bn.a;
import com.google.android.m4b.maps.bn.c;
import com.google.android.m4b.maps.bn.g;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ai;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.d;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.i;
import java.util.HashSet;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            d

public final class s extends com.google.android.m4b.maps.cc.d
{
    static final class a
    {

        int a;
        int b;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final int c[] = {
        12, 13, 14, 15, 16, 17, 18, 19
    };
    private static final int d = 800;
    private static volatile boolean e = false;
    private static final float k = (float)Math.sqrt(2D);
    private final ac f;
    private final k g;
    private final com.google.android.m4b.maps.bn.a h;
    private final g i;
    private final c j;

    private s(ac ac1, a a1, Set set)
    {
        super(set);
        f = ac1;
        g = new k(a1.a);
        h = new com.google.android.m4b.maps.bn.a(a1.a);
        i = new g(a1.a);
        j = new c(a1.b);
    }

    public static s a(ac ac1, String as[], com.google.android.m4b.maps.bo.ap.b b1)
    {
        Object obj;
        obj = new HashSet();
        a a1 = new a((byte)0);
        b1.b();
        do
        {
            if (!b1.hasNext())
            {
                break;
            }
            bb bb1 = (bb)b1.next();
            if (!(bb1 instanceof ai))
            {
                break;
            }
            int l = ((ai)bb1).a.a.length / 3 - 1;
            int j1 = l * 4;
            int ai1[];
            if (a1.a + j1 > 4096)
            {
                l = 0;
            } else
            {
                a1.a = j1 + a1.a;
                a1.b = ((l - 1) + l * 2) * 3 + a1.b;
                l = 1;
            }
            if (l == 0)
            {
                break;
            }
            ai1 = bb1.f();
            j1 = ai1.length;
            l = 0;
            while (l < j1) 
            {
                int i2 = ai1[l];
                if (i2 >= 0 && i2 < as.length)
                {
                    ((HashSet) (obj)).add(as[i2]);
                }
                l++;
            }
        } while (true);
        b1.c();
        as = new s(ac1, a1, ((Set) (obj)));
        ac1 = ac1.d();
        obj = com.google.android.m4b.maps.bm.e.a();
_L12:
        if (!b1.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1 = b1.a();
        if (!(obj1 instanceof ai)) goto _L2; else goto _L3
_L3:
        com.google.android.m4b.maps.bo.k k1;
        com.google.android.m4b.maps.bo.g g1;
        t t1;
        int i1;
        int l1;
        int j2;
        obj1 = (ai)obj1;
        k1 = ((ai) (obj1)).a.b(((float)ac1.f() * 1.0F) / 256F);
        i1 = k1.a.length / 3 - 1;
        l1 = ((s) (as)).g.a();
        g1 = ac1.c();
        j2 = ac1.f();
        t1 = ((ai) (obj1)).b;
        if (t1.b() <= 0) goto _L5; else goto _L4
_L4:
        float f3;
        float f4;
        f4 = t1.c[0].b;
        int k2 = t1.b();
        k2 = t1.c[k2 - 1].a;
        float f1 = ((float)j2 * f4 * 1.25F) / 256F;
        f3 = f1;
        if (!com.google.android.m4b.maps.bo.d.a(((ai) (obj1)).c, 1))
        {
            f3 = -f1;
        }
        ((s) (as)).h.a(l1 + i1 * 4);
        ((s) (as)).h.b(k2, i1 * 4);
        ((ai) (obj1)).d;
        JVM INSTR tableswitch 1 3: default 456
    //                   1 498
    //                   2 507
    //                   3 516;
           goto _L6 _L7 _L8 _L9
_L6:
        float f2 = 80F / f4;
_L10:
        ((e) (obj)).a(k1, f3, g1, j2, f2, ((s) (as)).g, ((s) (as)).j, ((s) (as)).i);
_L5:
        b1.next();
        continue; /* Loop/switch isn't completed */
_L7:
        f2 = 360F / f4;
        continue; /* Loop/switch isn't completed */
_L8:
        f2 = 240F / f4;
        continue; /* Loop/switch isn't completed */
_L9:
        f2 = 160F / f4;
        if (true) goto _L10; else goto _L2
_L2:
        return as;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public static void a(com.google.android.m4b.maps.bm.d d1)
    {
        GL10 gl10 = d1.a;
        d1.c();
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvx(8960, 8704, 8448);
    }

    public final int a()
    {
        return g.c() + h.a() + i.b() + j.c();
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, b b1, ab ab1)
    {
        if (j.b != 0)
        {
            g.d(d1);
            i.d(d1);
            boolean flag;
            boolean flag1;
            if (b1.b.b - (float)f.a >= 0.5F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                d1.a.glMatrixMode(5890);
                d1.a.glLoadIdentity();
                d1.a.glScalef(k, 0.0F, 0.0F);
                d1.a.glMatrixMode(5888);
            }
            b1 = ab1.a;
            if (b1 == i.a || b1 == i.d)
            {
                d1.C.a[10].a(d1.a);
                d1.a.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
                j.a(d1, 4);
            }
            d1.C.a[11].a(d1.a);
            d1.a();
            flag1 = e;
            h.c(d1);
            j.a(d1, 4);
            if (flag)
            {
                d1.a.glMatrixMode(5890);
                d1.a.glLoadIdentity();
                d1.a.glMatrixMode(5888);
                return;
            }
        }
    }

    public final int b()
    {
        return g.d() + 184 + h.b() + i.c() + j.d();
    }

    public final void b(com.google.android.m4b.maps.bm.d d1)
    {
        g.b(d1);
        h.a(d1);
        i.b(d1);
        j.b(d1);
    }

    public final void c(com.google.android.m4b.maps.bm.d d1)
    {
        g.c(d1);
        h.b(d1);
        i.c(d1);
        j.c(d1);
    }

}
