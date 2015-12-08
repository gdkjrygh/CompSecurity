// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nna
{

    private long a;
    private long b;
    private boolean c;
    private boolean d;

    public nna(long l, long l1, boolean flag, boolean flag1)
    {
        a = l;
        b = l1;
        c = flag;
        d = flag1;
    }

    public final String toString()
    {
        long l = a;
        long l1 = b;
        boolean flag = c;
        boolean flag1 = d;
        return (new StringBuilder(110)).append("[QuotaInfo; limit: ").append(l).append(", used: ").append(l1).append(", unlimited quota? ").append(flag).append(", low quota? ").append(flag1).append("]").toString();
    }
}
