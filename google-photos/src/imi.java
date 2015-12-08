// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class imi
{

    final int a;

    public imi(int i)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "index must be positive");
        if (i <= 31)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "index must be leq 31");
        a = i;
    }

    public long a(int i)
    {
        return 1L << a + 32 | (long)i & 0xffffffffL;
    }
}
