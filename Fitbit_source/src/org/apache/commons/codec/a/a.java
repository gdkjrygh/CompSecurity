// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.a;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.b;

public class a
    implements org.apache.commons.codec.a, b
{

    static final int a = 76;
    static final byte b[] = "\r\n".getBytes();
    static final int c = 255;
    static final int d = 64;
    static final int e = 8;
    static final int f = 16;
    static final int g = 24;
    static final int h = 4;
    static final int i = -128;
    static final byte j = 61;
    private static byte k[];
    private static byte l[];

    public a()
    {
    }

    private static boolean a(byte byte0)
    {
        while (byte0 == 61 || k[byte0] != -1) 
        {
            return true;
        }
        return false;
    }

    public static byte[] a(byte abyte0[], boolean flag)
    {
        byte abyte1[];
        int i1;
        int k1;
        int l1;
        int i2;
        int j2;
        int l2;
        i1 = abyte0.length * 8;
        l2 = i1 % 24;
        int i3 = i1 / 24;
        i2 = 0;
        if (l2 != 0)
        {
            i1 = (i3 + 1) * 4;
        } else
        {
            i1 = i3 * 4;
        }
        l1 = i1;
        if (flag)
        {
            int j1;
            int k2;
            byte byte8;
            byte byte9;
            if (b.length == 0)
            {
                j1 = 0;
            } else
            {
                j1 = (int)Math.ceil((float)i1 / 76F);
            }
            l1 = i1 + b.length * j1;
            i2 = j1;
        }
        abyte1 = new byte[l1];
        j1 = 76;
        i1 = 0;
        j2 = 0;
        k1 = 0;
        while (j2 < i3) 
        {
            k2 = j2 * 3;
            byte byte2 = abyte0[k2];
            byte byte4 = abyte0[k2 + 1];
            byte byte7 = abyte0[k2 + 2];
            byte8 = (byte)(byte4 & 0xf);
            byte9 = (byte)(byte2 & 3);
            byte byte6;
            if ((byte2 & 0xffffff80) == 0)
            {
                byte2 >>= 2;
            } else
            {
                byte2 = (byte)(byte2 >> 2 ^ 0xc0);
            }
            if ((byte4 & 0xffffff80) == 0)
            {
                byte4 >>= 4;
            } else
            {
                byte4 = (byte)(byte4 >> 4 ^ 0xf0);
            }
            if ((byte7 & 0xffffff80) == 0)
            {
                byte6 = (byte)(byte7 >> 6);
            } else
            {
                byte6 = (byte)(byte7 >> 6 ^ 0xfc);
            }
            abyte1[k1] = l[byte2];
            abyte1[k1 + 1] = l[byte4 | byte9 << 4];
            abyte1[k1 + 2] = l[byte6 | byte8 << 2];
            abyte1[k1 + 3] = l[byte7 & 0x3f];
            k1 += 4;
            if (flag && k1 == j1)
            {
                System.arraycopy(b, 0, abyte1, k1, b.length);
                i1++;
                j1 = (i1 + 1) * 76 + b.length * i1;
                k1 = b.length + k1;
            }
            j2++;
        }
        j2 *= 3;
        if (l2 != 8) goto _L2; else goto _L1
_L1:
        byte byte0 = abyte0[j2];
        j2 = (byte)(byte0 & 3);
        if ((byte0 & 0xffffff80) == 0)
        {
            byte0 >>= 2;
        } else
        {
            byte0 = (byte)(byte0 >> 2 ^ 0xc0);
        }
        abyte1[k1] = l[byte0];
        abyte1[k1 + 1] = l[j2 << 4];
        abyte1[k1 + 2] = 61;
        abyte1[k1 + 3] = 61;
_L4:
        if (flag && i1 < i2)
        {
            System.arraycopy(b, 0, abyte1, l1 - b.length, b.length);
        }
        return abyte1;
_L2:
        if (l2 == 16)
        {
            byte byte1 = abyte0[j2];
            j2 = abyte0[j2 + 1];
            byte byte3 = (byte)(j2 & 0xf);
            byte byte5 = (byte)(byte1 & 3);
            if ((byte1 & 0xffffff80) == 0)
            {
                byte1 >>= 2;
            } else
            {
                byte1 = (byte)(byte1 >> 2 ^ 0xc0);
            }
            if ((j2 & 0xffffff80) == 0)
            {
                j2 >>= 4;
            } else
            {
                j2 = (byte)(j2 >> 4 ^ 0xf0);
            }
            abyte1[k1] = l[byte1];
            abyte1[k1 + 1] = l[j2 | byte5 << 4];
            abyte1[k1 + 2] = l[byte3 << 2];
            abyte1[k1 + 3] = 61;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean c(byte abyte0[])
    {
        abyte0 = g(abyte0);
        int j1 = abyte0.length;
        if (j1 != 0)
        {
            int i1 = 0;
            while (i1 < j1) 
            {
                if (!a(abyte0[i1]))
                {
                    return false;
                }
                i1++;
            }
        }
        return true;
    }

    public static byte[] d(byte abyte0[])
    {
        return a(abyte0, false);
    }

    public static byte[] e(byte abyte0[])
    {
        return a(abyte0, true);
    }

    public static byte[] f(byte abyte0[])
    {
        byte abyte2[];
        boolean flag;
        flag = false;
        abyte2 = h(abyte0);
        if (abyte2.length != 0) goto _L2; else goto _L1
_L1:
        abyte0 = new byte[0];
_L4:
        return abyte0;
_L2:
        int l1 = abyte2.length / 4;
        int i1;
        for (i1 = abyte2.length; abyte2[i1 - 1] == 61;)
        {
            int j1 = i1 - 1;
            i1 = j1;
            if (j1 == 0)
            {
                return new byte[0];
            }
        }

        byte abyte1[] = new byte[i1 - l1];
        int k1 = 0;
        i1 = ((flag) ? 1 : 0);
        do
        {
            abyte0 = abyte1;
            if (i1 >= l1)
            {
                continue;
            }
            int i2 = i1 * 4;
            byte byte3 = abyte2[i2 + 2];
            byte byte1 = abyte2[i2 + 3];
            byte byte0 = k[abyte2[i2]];
            i2 = k[abyte2[i2 + 1]];
            if (byte3 != 61 && byte1 != 61)
            {
                byte3 = k[byte3];
                byte1 = k[byte1];
                abyte1[k1] = (byte)(byte0 << 2 | i2 >> 4);
                abyte1[k1 + 1] = (byte)((i2 & 0xf) << 4 | byte3 >> 2 & 0xf);
                abyte1[k1 + 2] = (byte)(byte3 << 6 | byte1);
            } else
            if (byte3 == 61)
            {
                abyte1[k1] = (byte)(i2 >> 4 | byte0 << 2);
            } else
            if (byte1 == 61)
            {
                byte byte2 = k[byte3];
                abyte1[k1] = (byte)(byte0 << 2 | i2 >> 4);
                abyte1[k1 + 1] = (byte)((i2 & 0xf) << 4 | byte2 >> 2 & 0xf);
            }
            k1 += 3;
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static byte[] g(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        int i1 = 0;
        int j1;
        int k1;
        for (j1 = 0; i1 < abyte0.length; j1 = k1)
        {
            k1 = j1;
            switch (abyte0[i1])
            {
            default:
                abyte1[j1] = abyte0[i1];
                k1 = j1 + 1;
                // fall through

            case 9: // '\t'
            case 10: // '\n'
            case 13: // '\r'
            case 32: // ' '
                i1++;
                break;
            }
        }

        abyte0 = new byte[j1];
        System.arraycopy(abyte1, 0, abyte0, 0, j1);
        return abyte0;
    }

    static byte[] h(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        int i1 = 0;
        int j1;
        int k1;
        for (j1 = 0; i1 < abyte0.length; j1 = k1)
        {
            k1 = j1;
            if (a(abyte0[i1]))
            {
                abyte1[j1] = abyte0[i1];
                k1 = j1 + 1;
            }
            i1++;
        }

        abyte0 = new byte[j1];
        System.arraycopy(abyte1, 0, abyte0, 0, j1);
        return abyte0;
    }

    public Object a(Object obj)
        throws DecoderException
    {
        if (!(obj instanceof byte[]))
        {
            throw new DecoderException("Parameter supplied to Base64 decode is not a byte[]");
        } else
        {
            return a((byte[])obj);
        }
    }

    public byte[] a(byte abyte0[])
    {
        return f(abyte0);
    }

    public Object b(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof byte[]))
        {
            throw new EncoderException("Parameter supplied to Base64 encode is not a byte[]");
        } else
        {
            return b((byte[])obj);
        }
    }

    public byte[] b(byte abyte0[])
    {
        return a(abyte0, false);
    }

    static 
    {
        boolean flag = false;
        k = new byte[255];
        l = new byte[64];
        for (int i1 = 0; i1 < 255; i1++)
        {
            k[i1] = -1;
        }

        for (int j1 = 90; j1 >= 65; j1--)
        {
            k[j1] = (byte)(j1 - 65);
        }

        for (int k1 = 122; k1 >= 97; k1--)
        {
            k[k1] = (byte)((k1 - 97) + 26);
        }

        for (int l1 = 57; l1 >= 48; l1--)
        {
            k[l1] = (byte)((l1 - 48) + 52);
        }

        k[43] = 62;
        k[47] = 63;
        for (int i2 = 0; i2 <= 25; i2++)
        {
            l[i2] = (byte)(i2 + 65);
        }

        int l2 = 26;
        for (int j2 = 0; l2 <= 51; j2++)
        {
            l[l2] = (byte)(j2 + 97);
            l2++;
        }

        l2 = 52;
        for (int k2 = ((flag) ? 1 : 0); l2 <= 61; k2++)
        {
            l[l2] = (byte)(k2 + 48);
            l2++;
        }

        l[62] = 43;
        l[63] = 47;
    }
}
