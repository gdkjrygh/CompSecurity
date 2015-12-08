// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.ag;
import com.google.android.m4b.maps.bx.h;
import com.google.android.m4b.maps.cg.c;
import com.google.android.m4b.maps.y.j;
import java.util.Map;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

public final class f
    implements h
{

    final Map a;
    public final float b;
    public long c;
    public int d;
    public float e;
    private Set f;
    private boolean g;

    f(float f1)
    {
        a = ax.b();
        c = 0L;
        d = 0;
        e = 0.0F;
        g = false;
        b = f1;
    }

    f(c c1)
    {
        a = ax.b();
        c = 0L;
        d = 0;
        e = 0.0F;
        g = false;
        b = c1.e();
        a(c1);
    }

    private static float a(float f1)
    {
        return f1 * f1 * (3F - 2.0F * f1);
    }

    private static float a(float f1, float f2, float f3, float f4, float f5)
    {
        if (f1 <= f2)
        {
            return f4;
        }
        if (f1 >= f3)
        {
            return f5;
        } else
        {
            return f4 + ((f1 - f2) / (f3 - f2)) * (f5 - f4);
        }
    }

    public final float a(b b1, g g1)
    {
        float f1;
        float f2;
        float f3;
        int i;
        f2 = b1.b.c;
        f1 = b1.b.b;
        i = d;
        f3 = e;
        float f4 = b;
        if (f4 > 0.0F)
        {
            f1 = a(f1, 18F, 20F, 3F, 0.0F);
        } else
        if (f4 < 0.0F)
        {
            f1 = a(f1, 18F, 20F, -3F, -1F);
        } else
        {
            f1 = 0.0F;
        }
        f2 = a(f2, 0.0F, 10F, 0.0F, f1);
        f3 = a(f3);
        if ((i & 2) == 0) goto _L2; else goto _L1
_L1:
        f1 = f2 + f3 * 100F;
_L4:
        return f1 * (float)com.google.android.m4b.maps.bo.g.a(g1.b());
_L2:
        f1 = f2;
        if ((i & 1) != 0)
        {
            f1 = f2 + (1.0F - f3) * 100F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Set a()
    {
        if (f == null)
        {
            f = al.a(a.keySet());
        }
        return f;
    }

    public final void a(int i)
    {
        k.a();
        long l = k.c();
        d = i;
        c = l;
        e = 0.0F;
    }

    public final void a(d d1, b b1, ab ab1, g g1)
    {
        GL10 gl10 = d1.a;
        gl10.glPushMatrix();
        float f1 = a(b1, g1);
        float f3 = b1.f() * f1;
        gl10.glTranslatef(0.0F, 0.0F, f3);
        int i = d;
        float f2 = a(e);
        f1 = f2;
        boolean flag;
        if ((i & 4) == 0)
        {
            if ((i & 8) != 0)
            {
                f1 = 1.0F - f2;
            } else
            {
                f1 = 1.0F;
            }
        }
        if ((i & 0x10) != 0)
        {
            f1 = a(f1, 0.0F, 1.0F, 0.6F, 1.0F);
            i = com.google.android.m4b.maps.bm.c.a(1.0F, f1, f1, f1);
        } else
        {
            i = com.google.android.m4b.maps.bm.c.a(f1, f1, f1, f1);
        }
        com.google.android.m4b.maps.bm.c.a(gl10, i);
        b1 = ab1.c.b;
        if (b1 == com.google.android.m4b.maps.bx.ag.a.f || b1 == com.google.android.m4b.maps.bx.ag.a.g || b1 == com.google.android.m4b.maps.bx.ag.a.h && f3 < 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (g)
        {
            d1.d();
            gl10.glStencilOp(7680, 7680, 7680);
            gl10.glStencilFunc(514, 255, 128);
        }
    }

    public final void a(d d1, ab ab1)
    {
        ab1 = d1.a;
        if (g)
        {
            d1.e();
        }
        com.google.android.m4b.maps.bm.c.a(ab1, -1);
        ab1.glPopMatrix();
    }

    public final boolean a(c c1)
    {
        boolean flag;
        if ((float)c1.e() == b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        while (f != null || (float)c1.e() != b) 
        {
            return false;
        }
        a.put(c1.b(), c1);
        return true;
    }

    public final boolean b()
    {
        return d != 0 && e < 1.0F;
    }

    public final boolean c()
    {
        return b() && (d & 3) != 0;
    }

    public final int compareTo(Object obj)
    {
        obj = (h)obj;
        int i = 0;
        if (obj instanceof f)
        {
            i = Float.compare(b, ((f)obj).b);
        }
        return i;
    }

    public final Set d()
    {
        return a.keySet();
    }

    public final String toString()
    {
        return com.google.android.m4b.maps.y.h.a(this).a("height", b).a("animationStartTimeMs", c).a("animationPosition", e).a("animationType", d).a("featureIds", f).toString();
    }
}
