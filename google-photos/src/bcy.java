// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bcy
{

    public long a;
    public long b;
    public bct c;
    public long d;

    public bcy()
    {
    }

    public final String toString()
    {
        String s = String.valueOf("Entry{duration=");
        long l = a;
        long l1 = b;
        String s1 = String.valueOf(c);
        long l2 = d;
        return (new StringBuilder(String.valueOf(s).length() + 93 + String.valueOf(s1).length())).append(s).append(l).append(", size=").append(l1).append(", dlags=").append(s1).append(", compTimeOffset=").append(l2).append("}").toString();
    }
}
