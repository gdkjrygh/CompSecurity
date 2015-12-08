// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bcl
{

    public long a;
    public long b;

    public bcl(long l, long l1)
    {
        a = l;
        b = l1;
    }

    public final String toString()
    {
        String s = String.valueOf("Entry{count=");
        long l = a;
        long l1 = b;
        return (new StringBuilder(String.valueOf(s).length() + 49)).append(s).append(l).append(", delta=").append(l1).append("}").toString();
    }
}
