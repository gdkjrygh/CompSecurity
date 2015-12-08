// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bav
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static String a(byte abyte0[])
    {
        return a(abyte0, 0);
    }

    public static String a(byte abyte0[], int i)
    {
        boolean flag = false;
        int j1 = abyte0.length;
        char ac[];
        int j;
        int k;
        if (i > 0)
        {
            j = j1 / i;
        } else
        {
            j = 0;
        }
        ac = new char[j + (j1 << 1)];
        k = 0;
        j = ((flag) ? 1 : 0);
        for (; k < j1; k++)
        {
            if (i > 0 && k % i == 0 && j > 0)
            {
                int l = j + 1;
                ac[j] = '-';
                j = l;
            }
            int i1 = j + 1;
            ac[j] = a[(abyte0[k] & 0xf0) >>> 4];
            j = i1 + 1;
            ac[i1] = a[abyte0[k] & 0xf];
        }

        return new String(ac);
    }

}
