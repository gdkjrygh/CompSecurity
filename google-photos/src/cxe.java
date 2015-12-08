// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxe
    implements cxd
{

    private final int a;

    public cxe(int i)
    {
        a = i;
    }

    private static float a(float f, float f1, float f2)
    {
        return (float)(1.0D / (Math.exp(-f1 * (f - f2)) + 1.0D));
    }

    private static long a(cqh cqh1, cod cod1)
    {
        long l = cqh1.c;
        if (cqh1.b == coj.b)
        {
            return l;
        } else
        {
            return (l - cqh1.d) + cod1.b;
        }
    }

    private static long b(cqh cqh1, cod cod1)
    {
        long l = cqh1.c;
        if (cqh1.b == coj.b)
        {
            return l;
        } else
        {
            return (l - cqh1.d) + cod1.c;
        }
    }

    public final float a(cqh cqh1, cof cof1, cqh cqh2, cof cof2)
    {
        cof1 = cof1.b;
        cof2 = cof2.b;
        long l;
        if (!b.e(cqh1.a, cqh2.a))
        {
            l = a(cqh1, ((cod) (cof1)));
            long l1 = b(cqh1, cof1);
            long l2 = a(cqh2, ((cod) (cof2)));
            long l3 = b(cqh2, cof2);
            l = Math.max(l, l2) - Math.min(l1, l3);
        } else
        {
            l = Math.max(((cod) (cof1)).b, ((cod) (cof2)).b) - Math.min(((cod) (cof1)).c, ((cod) (cof2)).c);
        }
        if (a == 0)
        {
            float f = (float)l / 1000000F;
            if (f <= 360F)
            {
                return a(f, 0.06F, 50F) * 0.25F;
            } else
            {
                return a(f, 0.0015F, 1800F) * 0.75F + 0.25F;
            }
        }
        if (a == 1)
        {
            return (float)Math.log(Math.log(Math.max(0.0D, (double)l * 9.9999999999999995E-07D) + 1.0D) + 1.0D);
        } else
        {
            throw new RuntimeException("Only Sigmoid Based and Log based scores are supported.");
        }
    }

    public final boolean b(cqh cqh1, cof cof1, cqh cqh2, cof cof2)
    {
        return b.e(cqh1.a, cqh2.a) || cqh1.c != -1L && cqh2.c != -1L;
    }

    static 
    {
        cxe.getSimpleName();
    }
}
