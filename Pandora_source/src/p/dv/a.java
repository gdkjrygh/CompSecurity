// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dv;


public class a
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    protected static int a(char c, int i)
        throws p.du.a
    {
        int j = Character.digit(c, 16);
        if (j == -1)
        {
            throw new p.du.a("Illegal hexadecimal charcter " + c + " at index " + i);
        } else
        {
            return j;
        }
    }

    public static byte[] a(char ac[])
        throws p.du.a
    {
        int j = 0;
        int k = ac.length;
        if ((k & 1) != 0)
        {
            throw new p.du.a("Odd number of characters.");
        }
        byte abyte0[] = new byte[k >> 1];
        for (int i = 0; j < k; i++)
        {
            int l = a(ac[j], j);
            j++;
            int i1 = a(ac[j], j);
            j++;
            abyte0[i] = (byte)((l << 4 | i1) & 0xff);
        }

        return abyte0;
    }

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
