// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class evh
{

    public final String a;
    public final long b;
    public final qgg c;

    public evh(String s, long l, long l1)
    {
        this(s, l, l1, null);
    }

    public evh(String s, long l, long l1, qgg qgg)
    {
        this(s, ivc.a(l, l1), qgg);
    }

    public evh(String s, long l, qgg qgg)
    {
        a = s;
        b = l;
        c = qgg;
    }

    public final String toString()
    {
        String s = String.valueOf("MediaTableRow{dedupKey='");
        String s1 = a;
        long l = b;
        String s2 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 53 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append("', captureTimestamp=").append(l).append(", mediaItem=").append(s2).append("}").toString();
    }
}
