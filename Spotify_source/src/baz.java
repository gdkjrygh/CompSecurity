// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class baz extends bay
    implements bao
{

    private final bbc f;

    public baz(long l, long l1, bad bad, bbc bbc1)
    {
        super(l, l1, bad, bbc1);
        f = bbc1;
    }

    public final int a()
    {
        return f.e;
    }

    public final int a(long l)
    {
        bbc bbc1;
        int k;
        int i1;
        int j1;
        bbc1 = f;
        l -= b * 1000L;
        k = bbc1.e;
        i1 = bbc1.a();
        if (bbc1.g != null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        long l2 = (bbc1.f * 0xf4240L) / bbc1.b;
        int i = bbc1.e;
        j1 = (int)(l / l2) + i;
        if (j1 >= k) goto _L2; else goto _L1
_L1:
        int j = k;
_L4:
        return j;
_L2:
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i1;
        if (j1 > i1) goto _L4; else goto _L3
_L3:
        return j1;
        if (i1 != k) goto _L4; else goto _L5
_L5:
        return i1;
        int l1 = k;
        j = i1;
        i1 = l1;
        while (i1 <= j) 
        {
            int k1 = (i1 + j) / 2;
            long l3 = bbc1.a(k1);
            if (l3 < l)
            {
                i1 = k1 + 1;
            } else
            if (l3 > l)
            {
                j = k1 - 1;
            } else
            {
                return k1;
            }
        }
        continue; /* Loop/switch isn't completed */
    }

    public final long a(int i)
    {
        return f.a(i) + b * 1000L;
    }

    public final int b()
    {
        return f.a();
    }

    public final long b(int i)
    {
        bbc bbc1 = f;
        if (bbc1.g != null)
        {
            return (((bbf)bbc1.g.get(i - bbc1.e)).b * 0xf4240L) / bbc1.b;
        }
        if (i == bbc1.a())
        {
            return bbc1.d * 1000L - bbc1.a(i);
        } else
        {
            return (bbc1.f * 0xf4240L) / bbc1.b;
        }
    }

    public final bax c(int i)
    {
        return f.a(this, i);
    }

    public final boolean c()
    {
        return f.b();
    }

    public final bax e()
    {
        return null;
    }

    public final bao f()
    {
        return this;
    }
}
