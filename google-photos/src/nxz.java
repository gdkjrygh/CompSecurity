// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nxz
{

    String a;
    long b;
    long c;
    long d;
    long e;
    long f;
    long g;
    final jk h = new jk();
    String i;
    public String j[];

    nxz()
    {
    }

    public final String toString()
    {
        String s = a;
        long l = b;
        long l1 = b;
        long l2 = c;
        long l3 = g;
        long l4 = c;
        long l5 = d;
        long l6 = f;
        long l7 = e;
        String s1 = i;
        return (new StringBuilder(String.valueOf(s).length() + 240 + String.valueOf(s1).length())).append("[").append(s).append("], duration: ").append(l).append("ms, network: ").append(l1 - l2).append("ms, server: ").append(l3).append("ms, processing: ").append(l4).append("ms, requests: ").append(l5).append(", sent: ").append(l6).append(", received: ").append(l7).append(", protocol:").append(s1).toString();
    }
}
