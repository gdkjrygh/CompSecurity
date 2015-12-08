// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pv
    implements pw
{

    public pv()
    {
    }

    public final long a(int i)
    {
        if (i <= 0)
        {
            return 0L;
        } else
        {
            return (long)(1 << i - 1);
        }
    }
}
