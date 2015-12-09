// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.b.a:
//            f, aa

class h
{

    int a;
    f b;
    f c;
    Interpolator d;
    ArrayList e;
    aa f;

    public transient h(f af[])
    {
        a = af.length;
        e = new ArrayList();
        e.addAll(Arrays.asList(af));
        b = (f)e.get(0);
        c = (f)e.get(a - 1);
        d = c.b();
    }

    public h a()
    {
        ArrayList arraylist = e;
        int j = e.size();
        f af[] = new f[j];
        for (int i = 0; i < j; i++)
        {
            af[i] = ((f)arraylist.get(i)).c();
        }

        return new h(af);
    }

    public Object a(float f1)
    {
        if (a == 2)
        {
            float f2 = f1;
            if (d != null)
            {
                f2 = d.getInterpolation(f1);
            }
            return f.a(f2, b.a(), c.a());
        }
        if (f1 <= 0.0F)
        {
            f f6 = (f)e.get(1);
            Interpolator interpolator = f6.b();
            float f3 = f1;
            if (interpolator != null)
            {
                f3 = interpolator.getInterpolation(f1);
            }
            f1 = b.a;
            f1 = (f3 - f1) / (f6.a - f1);
            return f.a(f1, b.a(), f6.a());
        }
        if (f1 >= 1.0F)
        {
            f f7 = (f)e.get(a - 2);
            Interpolator interpolator1 = c.b();
            float f4 = f1;
            if (interpolator1 != null)
            {
                f4 = interpolator1.getInterpolation(f1);
            }
            f1 = f7.a;
            f1 = (f4 - f1) / (c.a - f1);
            return f.a(f1, f7.a(), c.a());
        }
        f f8 = b;
        for (int i = 1; i < a;)
        {
            f f9 = (f)e.get(i);
            if (f1 < f9.a)
            {
                Interpolator interpolator2 = f9.b();
                float f5 = f1;
                if (interpolator2 != null)
                {
                    f5 = interpolator2.getInterpolation(f1);
                }
                f1 = f8.a;
                f1 = (f5 - f1) / (f9.a - f1);
                return f.a(f1, f8.a(), f9.a());
            }
            i++;
            f8 = f9;
        }

        return c.a();
    }

    public Object clone()
    {
        return a();
    }

    public String toString()
    {
        String s = " ";
        for (int i = 0; i < a; i++)
        {
            s = (new StringBuilder()).append(s).append(((f)e.get(i)).a()).append("  ").toString();
        }

        return s;
    }
}
