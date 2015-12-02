// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;


public class b
{

    private static byte a[];

    public b()
    {
    }

    private static boolean a(byte byte0)
    {
        while (byte0 == 61 || a[byte0] != -1) 
        {
            return true;
        }
        return false;
    }

    public static byte[] a(byte abyte0[])
    {
        byte abyte2[];
        boolean flag;
        flag = false;
        abyte2 = b(abyte0);
        if (abyte2.length != 0) goto _L2; else goto _L1
_L1:
        abyte0 = new byte[0];
_L4:
        return abyte0;
_L2:
        int l = abyte2.length / 4;
        int i;
        for (i = abyte2.length; abyte2[i - 1] == 61;)
        {
            int j = i - 1;
            i = j;
            if (j == 0)
            {
                return new byte[0];
            }
        }

        byte abyte1[] = new byte[i - l];
        int k = 0;
        i = ((flag) ? 1 : 0);
        do
        {
            abyte0 = abyte1;
            if (i >= l)
            {
                continue;
            }
            int i1 = i * 4;
            byte byte3 = abyte2[i1 + 2];
            byte byte1 = abyte2[i1 + 3];
            byte byte0 = a[abyte2[i1]];
            i1 = a[abyte2[i1 + 1]];
            if (byte3 != 61 && byte1 != 61)
            {
                byte3 = a[byte3];
                byte1 = a[byte1];
                abyte1[k] = (byte)(byte0 << 2 | i1 >> 4);
                abyte1[k + 1] = (byte)((i1 & 0xf) << 4 | byte3 >> 2 & 0xf);
                abyte1[k + 2] = (byte)(byte3 << 6 | byte1);
            } else
            if (byte3 == 61)
            {
                abyte1[k] = (byte)(i1 >> 4 | byte0 << 2);
            } else
            if (byte1 == 61)
            {
                byte byte2 = a[byte3];
                abyte1[k] = (byte)(byte0 << 2 | i1 >> 4);
                abyte1[k + 1] = (byte)((i1 & 0xf) << 4 | byte2 >> 2 & 0xf);
            }
            k += 3;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static byte[] b(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        int i = 0;
        int j;
        int k;
        for (j = 0; i < abyte0.length; j = k)
        {
            k = j;
            if (a(abyte0[i]))
            {
                abyte1[j] = abyte0[i];
                k = j + 1;
            }
            i++;
        }

        abyte0 = new byte[j];
        System.arraycopy(abyte1, 0, abyte0, 0, j);
        return abyte0;
    }

    static 
    {
        a = new byte[255];
        for (int i = 0; i < 255; i++)
        {
            a[i] = -1;
        }

        for (int j = 90; j >= 65; j--)
        {
            a[j] = (byte)(j - 65);
        }

        for (int k = 122; k >= 97; k--)
        {
            a[k] = (byte)((k - 97) + 26);
        }

        for (int l = 57; l >= 48; l--)
        {
            a[l] = (byte)((l - 48) + 52);
        }

        a[43] = 62;
        a[47] = 63;
    }
}
