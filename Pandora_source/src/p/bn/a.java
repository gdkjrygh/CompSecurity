// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bn;


public class a
{

    private static char a[];
    private static byte b[];

    public static byte[] a(String s)
    {
        int k = 0;
        s = s.toCharArray();
        int l = s.length;
        int j = (l / 4) * 3;
        int i = j;
        if (s[l - 1] == '=')
        {
            i = j - 1;
        }
        j = i;
        if (s[l - 2] == '=')
        {
            j = i - 1;
        }
        byte abyte0[] = new byte[j];
        i = 0;
        while (k < l) 
        {
            byte abyte1[] = b;
            int i1 = k + 1;
            byte byte2 = abyte1[s[k]];
            abyte1 = b;
            k = i1 + 1;
            byte byte3 = abyte1[s[i1]];
            abyte1 = b;
            i1 = k + 1;
            byte byte0 = abyte1[s[k]];
            byte byte1 = b[s[i1]];
            k = i + 1;
            abyte0[i] = (byte)(byte3 >>> 4 | byte2 << 2);
            if (k < j)
            {
                i = k + 1;
                abyte0[k] = (byte)(byte0 >>> 2 | byte3 << 4);
            } else
            {
                i = k;
            }
            if (i < j)
            {
                k = i + 1;
                abyte0[i] = (byte)(byte0 << 6 | byte1);
                i = k;
            }
            k = i1 + 1;
        }
        return abyte0;
    }

    static 
    {
        a = new char[64];
        b = new byte[123];
        char c = 'A';
        byte byte0;
        byte byte1;
        for (byte0 = 0; c <= 'Z'; byte0 = byte1)
        {
            b[c] = byte0;
            char ac[] = a;
            byte1 = (byte)(byte0 + 1);
            ac[byte0] = c;
            c++;
        }

        for (char c1 = 'a'; c1 <= 'z';)
        {
            b[c1] = byte0;
            char ac1[] = a;
            byte byte2 = (byte)(byte0 + 1);
            ac1[byte0] = c1;
            c1++;
            byte0 = byte2;
        }

        for (char c2 = '0'; c2 <= '9';)
        {
            b[c2] = byte0;
            char ac2[] = a;
            byte byte3 = (byte)(byte0 + 1);
            ac2[byte0] = c2;
            c2++;
            byte0 = byte3;
        }

        b[43] = byte0;
        char ac3[] = a;
        byte byte4 = (byte)(byte0 + 1);
        ac3[byte0] = '+';
        b[47] = byte4;
        ac3 = a;
        byte byte5 = (byte)(byte4 + 1);
        ac3[byte4] = '/';
        b[61] = 0;
    }
}
