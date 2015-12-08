// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hcz
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    public static char[] a(byte abyte0[])
    {
        int j = 0;
        int k = abyte0.length;
        char ac[] = new char[k << 1];
        for (int i = 0; i < k; i++)
        {
            int l = j + 1;
            ac[j] = a[(abyte0[i] & 0xf0) >>> 4];
            j = l + 1;
            ac[l] = a[abyte0[i] & 0xf];
        }

        return ac;
    }

}
