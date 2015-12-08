// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class cxh
{

    public final float a[];

    private cxh(float f, float f1, float f2)
    {
        a = new float[9];
        a[0] = b.a(f2, "zoom");
        a[1] = 0.0F;
        a[2] = -2F * f;
        a[3] = 0.0F;
        a[4] = b.a(f2, "zoom");
        a[5] = 2.0F * f1;
        a[6] = 0.0F;
        a[7] = 0.0F;
        a[8] = 1.0F;
    }

    private cxh(float af[])
    {
        b.a(af.length, "transform.length", 9, null);
        a = af;
    }

    public static cxh a(float f, float f1, float f2)
    {
        return new cxh(f, f1, f2);
    }

    public static cxh a(float af[])
    {
        return new cxh(Arrays.copyOf(af, af.length));
    }

    public static float[] a()
    {
        return (new float[] {
            1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F
        });
    }

    public final float[] b()
    {
        return Arrays.copyOf(a, a.length);
    }

    public final float c()
    {
        return -a[2] / 2.0F;
    }

    public final float d()
    {
        return a[5] / 2.0F;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof cxh))
        {
            return false;
        } else
        {
            obj = (cxh)obj;
            return Arrays.equals(a, ((cxh) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a);
    }
}
