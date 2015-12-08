// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.opengl.GLU;
import android.opengl.Matrix;
import android.opengl.Visibility;
import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.cg.ay;
import com.google.android.m4b.maps.y.j;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            k, ae, q, x, 
//            ah, z, p, ad, 
//            g

abstract class n
    implements ah.c, x.a
{

    protected q a;
    private g b;
    private int c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final ae i;
    private final ae.c j;
    private x k[];
    private final k l = new k();
    private int m[];
    private int n[];
    private ah.f o;
    private float p;

    public n(ae ae1, ae.c c1)
    {
        i = ae1;
        j = c1;
    }

    private void a(ad ad1)
    {
        i.a(j, ad1, true);
    }

    protected final void a(q q1, g g1, int i1, int j1, int k1)
    {
        a = q1;
        b = g1;
        c = j1;
        d = (float)i1 / (float)j1;
        f = q1.f;
        g = q1.g;
        h = q1.h;
        e = ar.a(q1.e, q1.f, q1.g, q1.h);
        j1 = Math.min(q1.B, e);
        k = new x[j1];
        for (i1 = 0; i1 < j1; i1++)
        {
            g1 = new x(i1, e - 1 - i1, this, q1.e, q1.f, g, h, k1);
            k[i1] = g1;
        }

        p = ar.a(-a.t);
    }

    public void a(GL10 gl10, ay ay1, ah.f f1, ah.i i1)
    {
        if (a == null)
        {
            return;
        }
        o = f1;
        float f5 = ay1.c();
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        GLU.gluPerspective(gl10, f5 * ah.a(d), d, 0.1F, 400F);
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
        gl10.glMultMatrixf(ay1.a(), 0);
        float f7 = ar.p(180F - a.u);
        float f2 = (float)Math.cos(f7);
        f7 = (float)Math.sin(f7);
        gl10.glRotatef(-a.v, f2, 0.0F, -f7);
        gl10.glRotatef(p, 0.0F, 1.0F, 0.0F);
        float f9 = c;
        f2 = 2.0F;
        f7 = ay1.c;
        f5 = (0.125F * f5 * 2.0F * (float)f) / f9;
        if (d > 1.0F)
        {
            f2 = 1.0F;
        }
        int j1 = (int)Math.floor(f2 + ar.e(f5));
        j1 = ar.a(e - 1 - j1, k.length - 1);
        if (f7 == 0.0F)
        {
            j1 = Math.min(j1, 3);
        }
        gl10.glMatrixMode(5888);
        gl10.glPushMatrix();
        int i2;
        if (i1 != null)
        {
            float f3 = ar.r(i1.a());
            gl10.glTranslatef(-i1.a * f3, 0.0F, f3 * i1.b);
            gl10.glEnable(2929);
            gl10.glClear(256);
        } else
        {
            gl10.glDisable(2929);
        }
        ay1 = l;
        f1 = ((k) (ay1)).a;
        f1.b(gl10);
        f1.a(gl10);
        Matrix.multiplyMM(((k) (ay1)).b, 0, ((k) (ay1)).a.b, 0, ((k) (ay1)).a.a, 0);
        i2 = j1;
        do
        {
label0:
            {
                ay1 = k[i2];
                int l1 = ay1.a();
                if (m == null || l1 > m.length)
                {
                    m = new int[l1];
                    n = new int[l1];
                }
                f1 = l;
                float af[];
                int ai[];
                int j2;
                int l2;
                int i3;
                boolean flag1;
                if (i1 != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                af = ay1.a(flag1);
                ai = m;
                j2 = m.length;
                i3 = Visibility.frustumCullSpheres(((k) (f1)).b, 0, af, 0, l1, ai, 0, j2);
                l1 = 0;
                j2 = 0;
                while (j2 < i3) 
                {
                    int k3 = m[j2];
                    k k1;
                    float af1[];
                    char ac[];
                    if (i1 != null)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    f1 = ay1.a(k3, flag1);
                    k1 = l;
                    af1 = ((p) (f1)).a;
                    ac = ((p) (f1)).b;
                    l2 = ((p) (f1)).b.length;
                    if (Visibility.visibilityTest(k1.b, 0, af1, 0, ac, 0, l2) <= 0)
                    {
                        continue;
                    }
                    f1 = n;
                    l2 = l1 + 1;
                    f1[l1] = k3;
                    if (l2 > 16)
                    {
                        break MISSING_BLOCK_LABEL_1178;
                    }
                    l1 = l2;
                    j2++;
                }
                float f4;
                float f6;
                float f8;
                float f10;
                float f11;
                ad ad1;
                g g1;
                Integer integer;
                boolean flag;
                int j3;
                int l3;
                int i4;
                int j4;
                int k4;
                int l4;
                int i5;
                int j5;
                boolean flag2;
                boolean flag3;
                for (int k2 = l1; k2 <= 16 || i2 <= 0; k2 = l2)
                {
                    break label0;
                }

                i2--;
            }
        } while (true);
        gl10.glColor4x(0, 0, 0, 0);
        f1 = o;
        f1.a = 0.0F;
        f1.b = 0;
        f1 = a.s.iterator();
        do
        {
            if (!f1.hasNext())
            {
                break;
            }
            ad1 = (ad)f1.next();
            if (b.b(ad1) == null)
            {
                a(ad1);
            }
        } while (true);
        k4 = ((x) (ay1)).b;
        l4 = ((x) (ay1)).c;
        l2 = 0;
_L5:
        if (l2 >= k2)
        {
            break MISSING_BLOCK_LABEL_1159;
        }
        j3 = n[l2];
        l1 = j3 / (k4 * l4);
        i5 = ((x) (ay1)).a.a(l1);
        j3 %= k4 * l4;
        i4 = j3 / k4;
        l3 = j3 % k4;
        if (n[l2] == ay1.a(l3, i4, l1))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        com.google.android.m4b.maps.y.j.b(flag2);
        j5 = n[l2];
        if (i1 != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        f1 = k[i2];
        gl10.glMatrixMode(5890);
        gl10.glPushMatrix();
        flag = false;
        f6 = 0.0F;
        f8 = 0.0F;
        f4 = 1.0F;
        j3 = i2;
_L6:
        if (j3 < 0) goto _L2; else goto _L1
_L1:
        ad1 = new ad(a.i, l3, i4, i5, j3);
        g1 = b;
        integer = (Integer)g1.b(ad1);
        if (integer == null)
        {
            j4 = 0;
        } else
        {
            j4 = g1.a[integer.intValue()];
        }
        if (j4 == 0) goto _L4; else goto _L3
_L3:
        gl10.glBindTexture(3553, j4);
        gl10.glLoadIdentity();
        gl10.glTranslatef(f8, f6, 0.0F);
        gl10.glScalef(f4, f4, 1.0F);
        o.a(f4);
        flag3 = true;
_L7:
        f1.a(j5, flag2).a(gl10, flag3);
        gl10.glMatrixMode(5890);
        gl10.glPopMatrix();
        l2++;
          goto _L5
_L4:
        if (!flag)
        {
            a(ad1);
            flag = true;
        }
        f8 /= 2.0F;
        f11 = l3 & 1;
        f6 /= 2.0F;
        f10 = i4 & 1;
        i4 >>= 1;
        j3--;
        f8 = 0.5F * f11 + f8;
        f4 = 0.5F * f4;
        l3 >>= 1;
        f6 += 0.5F * f10;
          goto _L6
_L2:
        o.a(0.0F);
        flag3 = false;
          goto _L7
        gl10.glMatrixMode(5888);
        gl10.glPopMatrix();
        return;
    }
}
