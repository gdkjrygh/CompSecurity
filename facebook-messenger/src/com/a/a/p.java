// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.a.a:
//            n, o, l, aj

class p
{

    int a;
    n b;
    n c;
    Interpolator d;
    ArrayList e;
    aj f;

    public transient p(n an[])
    {
        a = an.length;
        e = new ArrayList();
        e.addAll(Arrays.asList(an));
        b = (n)e.get(0);
        c = (n)e.get(a - 1);
        d = c.d();
    }

    public static transient p a(float af[])
    {
        int i = 1;
        int j = af.length;
        o ao[] = new o[Math.max(j, 2)];
        if (j == 1)
        {
            ao[0] = (o)n.a(0.0F);
            ao[1] = (o)n.a(1.0F, af[0]);
        } else
        {
            ao[0] = (o)n.a(0.0F, af[0]);
            while (i < j) 
            {
                ao[i] = (o)n.a((float)i / (float)(j - 1), af[i]);
                i++;
            }
        }
        return new l(ao);
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
            return f.a(f2, b.b(), c.b());
        }
        if (f1 <= 0.0F)
        {
            n n1 = (n)e.get(1);
            Interpolator interpolator = n1.d();
            float f3 = f1;
            if (interpolator != null)
            {
                f3 = interpolator.getInterpolation(f1);
            }
            f1 = b.c();
            f1 = (f3 - f1) / (n1.c() - f1);
            return f.a(f1, b.b(), n1.b());
        }
        if (f1 >= 1.0F)
        {
            n n2 = (n)e.get(a - 2);
            Interpolator interpolator1 = c.d();
            float f4 = f1;
            if (interpolator1 != null)
            {
                f4 = interpolator1.getInterpolation(f1);
            }
            f1 = n2.c();
            f1 = (f4 - f1) / (c.c() - f1);
            return f.a(f1, n2.b(), c.b());
        }
        n n3 = b;
        for (int i = 1; i < a;)
        {
            n n4 = (n)e.get(i);
            if (f1 < n4.c())
            {
                Interpolator interpolator2 = n4.d();
                float f5 = f1;
                if (interpolator2 != null)
                {
                    f5 = interpolator2.getInterpolation(f1);
                }
                f1 = n3.c();
                f1 = (f5 - f1) / (n4.c() - f1);
                return f.a(f1, n3.b(), n4.b());
            }
            i++;
            n3 = n4;
        }

        return c.b();
    }

    public void a(aj aj1)
    {
        f = aj1;
    }

    public p b()
    {
        ArrayList arraylist = e;
        int j = e.size();
        n an[] = new n[j];
        for (int i = 0; i < j; i++)
        {
            an[i] = ((n)arraylist.get(i)).e();
        }

        return new p(an);
    }

    public Object clone()
    {
        return b();
    }

    public String toString()
    {
        String s = " ";
        for (int i = 0; i < a; i++)
        {
            s = (new StringBuilder()).append(s).append(((n)e.get(i)).b()).append("  ").toString();
        }

        return s;
    }
}
