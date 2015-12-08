// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bch
{

    long a;
    int b;
    int c;
    long d;

    public bch()
    {
    }

    public final String toString()
    {
        String s = String.valueOf("SubsampleEntry{subsampleSize=");
        long l = a;
        int i = b;
        int j = c;
        long l1 = d;
        return (new StringBuilder(String.valueOf(s).length() + 108)).append(s).append(l).append(", subsamplePriority=").append(i).append(", discardable=").append(j).append(", reserved=").append(l1).append("}").toString();
    }
}
