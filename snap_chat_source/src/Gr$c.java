// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class >
{

    public float a;
    public float b;
    float c;
    float d;
    float e;
    float f;
    boolean g;
    boolean h;
    boolean i;

    public final float a()
    {
        if (!g)
        {
            return 1.0F;
        } else
        {
            return c;
        }
    }

    public final void a(float f1, float f2, boolean flag, float f3, boolean flag1, float f4, float f5, 
            boolean flag2, float f6)
    {
        float f7 = 1.0F;
        a = f1;
        b = f2;
        g = flag;
        f1 = f3;
        if (f3 == 0.0F)
        {
            f1 = 1.0F;
        }
        c = f1;
        h = flag1;
        f1 = f4;
        if (f4 == 0.0F)
        {
            f1 = 1.0F;
        }
        d = f1;
        if (f5 == 0.0F)
        {
            f1 = f7;
        } else
        {
            f1 = f5;
        }
        e = f1;
        i = flag2;
        f = f6;
    }

    public final float b()
    {
        if (!i)
        {
            return 0.0F;
        } else
        {
            return f;
        }
    }

    public >()
    {
    }
}
