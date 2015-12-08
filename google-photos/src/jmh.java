// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jmh
{

    final jnl a = new jnl(8);
    int b;

    public jmh()
    {
    }

    long a(jke jke1)
    {
        boolean flag = false;
        jke1.c(a.a, 0, 1);
        int l = a.a[0] & 0xff;
        if (l == 0)
        {
            return 0x8000000000000000L;
        }
        int j = 128;
        int i = 0;
        for (; (l & j) == 0; j >>= 1)
        {
            i++;
        }

        l = ~j & l;
        jke1.c(a.a, 1, i);
        for (int k = ((flag) ? 1 : 0); k < i; k++)
        {
            l = (l << 8) + (a.a[k + 1] & 0xff);
        }

        b = b + (i + 1);
        return (long)l;
    }
}
