// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class okd
{

    private static final byte c[] = new byte[0];
    byte a[];
    transient int b;

    private okd()
    {
        a = c;
        b = 0;
    }

    private okd(byte abyte0[])
    {
        a = (byte[])p.b(abyte0, "map cannot be null");
        b = b(abyte0);
    }

    public static okd a()
    {
        return new okd();
    }

    public static okd a(byte abyte0[])
    {
        if (abyte0.length == 0)
        {
            return new okd();
        } else
        {
            return new okd(abyte0);
        }
    }

    private static int b(byte abyte0[])
    {
        int i = 0;
        p.b(abyte0, "array cannot be null");
        int k = abyte0.length;
        int j = 0;
        for (; i < k; i++)
        {
            j += Integer.bitCount(abyte0[i] & 0xff);
        }

        return j;
    }

}
