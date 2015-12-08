// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nor
{

    public final long a;
    public int b;
    final noq c;

    nor(noq noq, long l, int i)
    {
        c = noq;
        super();
        a = l;
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder(36)).append("stages must be positive: ").append(i).toString());
        } else
        {
            b = i;
            return;
        }
    }
}
