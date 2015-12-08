// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mra
{

    public final String a;
    private final long b;
    private final long c;

    public mra(long l, String s, long l1)
    {
        b = l;
        a = s;
        c = l1;
    }

    public final String toString()
    {
        long l = b;
        String s = a;
        long l1 = c;
        return (new StringBuilder(String.valueOf(s).length() + 78)).append("Batch {id: ").append(l).append(", albumId: ").append(s).append(", createdTime: ").append(l1).append("}").toString();
    }
}
