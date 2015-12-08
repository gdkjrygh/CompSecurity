// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ccu
{

    private final long a;
    private final int b;
    private long c;
    private float d;

    public ccu(long l)
    {
        this(l, -1);
    }

    public ccu(long l, int i)
    {
        c = -1L;
        a = l;
        b = i;
    }

    private boolean a(pyg pyg)
    {
        return b == -1 || b.a(b, pyg);
    }

    public boolean a(int i, int j, cnt cnt, cnt cnt1)
    {
        return i > 0 && i < j;
    }

    public final boolean a(cba cba1)
    {
        return b(cba1) > 0.0F;
    }

    public final float b(cba cba1)
    {
        float f1;
        long l;
        if (cba1.a == c)
        {
            return d;
        }
        f1 = 0.0F;
        l = a / 2L;
        if (cba1.d > l) goto _L2; else goto _L1
_L1:
        float f;
        f = f1;
        if (a(cba1.z))
        {
            f = f1;
            if (a(cba1.f, cba1.h, cba1.j, cba1.i))
            {
                f = 0.5F + (float)cba1.d / (float)a;
            }
        }
_L4:
        d = f;
        c = cba1.a;
        return f;
_L2:
        long l1 = cba1.e - cba1.d;
        f = f1;
        if (l1 < l)
        {
            f = f1;
            if (a(cba1.x))
            {
                f = f1;
                if (a(cba1.f + 1, cba1.h, cba1.i, cba1.k))
                {
                    f = (float)(l - l1) / (float)a;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
