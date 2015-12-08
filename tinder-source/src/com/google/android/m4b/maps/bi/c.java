// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bi;

import com.google.android.m4b.maps.ak.b;
import com.google.android.m4b.maps.bo.g;

// Referenced classes of package com.google.android.m4b.maps.bi:
//            d

public final class c
    implements d
{

    public final g a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public c(b b1, float f, float f1, float f2, float f3)
    {
        this(g.b(b1.a, b1.b), f, f1, f2, f3);
    }

    public c(g g1, float f, float f1, float f2, float f3)
    {
        a = new g(g1.a, g1.b);
        b = Math.max(Math.min(f, 21F), 2.0F);
        c = f1;
        d = f2;
        e = f3;
    }

    public static float a(float f)
    {
        return (float)(10D * Math.exp((4D - (double)f) / 1.4426950216293335D));
    }

    public final c a(c c1)
    {
        int i = a.a - c1.a.a;
        if (i > 0x20000000)
        {
            return new c(new g(a.a - 0x40000000, a.b), b, c, d, e);
        }
        if (i < 0xe0000000)
        {
            return new c(new g(a.a + 0x40000000, a.b), b, c, d, e);
        } else
        {
            return this;
        }
    }

    public final c b()
    {
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof c)
            {
                if (!a.equals(((c) (obj = (c)obj)).a) || b != ((c) (obj)).b || c != ((c) (obj)).c || d != ((c) (obj)).d || e != ((c) (obj)).e)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((((Float.floatToIntBits(b) + 37) * 37 + Float.floatToIntBits(d)) * 37 + Float.floatToIntBits(c)) * 37 + Float.floatToIntBits(e)) * 37 + a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        float f = b;
        float f1 = c;
        float f2 = d;
        float f3 = e;
        return (new StringBuilder(String.valueOf(s).length() + 109)).append("[target:").append(s).append(" zoom:").append(f).append(" viewingAngle:").append(f1).append(" bearing:").append(f2).append(" lookAhead:").append(f3).append("]").toString();
    }
}
