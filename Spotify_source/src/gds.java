// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gds
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    public static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        char ac[] = new char[abyte0.length << 1];
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0[i] & 0xff;
            ac[i << 1] = a[j >>> 4];
            ac[(i << 1) + 1] = a[j & 0xf];
        }

        return new String(ac);
    }

}
