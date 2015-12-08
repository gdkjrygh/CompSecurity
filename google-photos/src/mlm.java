// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mlm
{

    public final int a;
    public final int b;

    public mlm(int i, int j)
    {
        a = i;
        b = j;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof mlm) && ((mlm)obj).b == b && ((mlm)obj).a == a;
    }

    public final int hashCode()
    {
        return (a + 1369) * 37 + b;
    }
}
