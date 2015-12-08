// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class eyp
    implements eyf
{

    private final eyq b;

    eyp(dty dty)
    {
        b = new eym(dty);
    }

    public final int a(long l)
    {
        int i = b.a(b, l);
        if (i != -1)
        {
            return (int)b.a(i);
        } else
        {
            return 0x80000000;
        }
    }

    public final int a(long l, long l1)
    {
        if (b.a() == 0)
        {
            return 0;
        }
        long l2 = Math.min(l, l1);
        l = Math.max(l, l1);
        int j = b.a(l2);
        int i = j;
        if (j < 0)
        {
            i = eyn.f(j);
        }
        j = b.a(l);
        int k;
        if (j < 0)
        {
            j = eyn.f(j);
        } else
        {
            j++;
        }
        k = j - i;
        if (k < 0)
        {
            throw new IllegalStateException((new StringBuilder(45)).append("highIndex: ").append(j).append(", lowIndex: ").append(i).toString());
        } else
        {
            return k;
        }
    }
}
