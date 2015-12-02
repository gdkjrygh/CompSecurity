// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


public class ByteConvertor
{

    public ByteConvertor()
    {
    }

    private static void a(StringBuffer stringbuffer, byte byte0)
    {
        stringbuffer.append("0123456789ABCDEF".charAt(byte0 >> 4 & 0xf)).append("0123456789ABCDEF".charAt(byte0 & 0xf));
    }

    public static String bytesToHexString(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append("0123456789abcdef".charAt(abyte0[i] >> 4 & 0xf));
            stringbuilder.append("0123456789abcdef".charAt(abyte0[i] & 0xf));
            i++;
        } while (true);
    }

    public static int hexCharToInt(char c)
    {
        if (c >= '0' && c <= '9')
        {
            return c - 48;
        }
        if (c >= 'A' && c <= 'F')
        {
            return (c - 65) + 10;
        }
        if (c >= 'a' && c <= 'f')
        {
            return (c - 97) + 10;
        } else
        {
            throw new RuntimeException((new StringBuilder("invalid hex char '")).append(c).append("'").toString());
        }
    }

    public static byte[] hexStringToBytes(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        byte abyte0[] = null;
_L4:
        return abyte0;
_L2:
        int j = s.length();
        byte abyte1[] = new byte[j / 2];
        int i = 0;
        do
        {
            abyte0 = abyte1;
            if (i >= j)
            {
                continue;
            }
            abyte1[i / 2] = (byte)(hexCharToInt(s.charAt(i)) << 4 | hexCharToInt(s.charAt(i + 1)));
            i += 2;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] subBytes(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        int k = 0;
        do
        {
            if (k >= j)
            {
                return abyte1;
            }
            abyte1[k] = abyte0[i + k];
            k++;
        } while (true);
    }

    public static byte[] toBytes(int i)
    {
        return (new byte[] {
            (byte)(i & 0xff), (byte)((0xff00 & i) >> 8), (byte)((0xff0000 & i) >> 16), (byte)((0xff000000 & i) >> 24)
        });
    }

    public static byte[] toBytes(long l)
    {
        return (new byte[] {
            (byte)(int)(255L & l), (byte)(int)((65280L & l) >> 8), (byte)(int)((0xff0000L & l) >> 16), (byte)(int)((0xff000000L & l) >> 24), (byte)(int)((0xff00000000L & l) >> 32), (byte)(int)((0xff0000000000L & l) >> 40), (byte)(int)((0xff000000000000L & l) >> 48), (byte)(int)((0xff00000000000000L & l) >> 56)
        });
    }

    public static String toHex(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return stringbuffer.toString();
            }
            a(stringbuffer, abyte0[i]);
            i++;
        } while (true);
    }

    public static int toInt(byte abyte0[])
    {
        return (((abyte0[3] & 0xff | 0) << 8 | abyte0[2] & 0xff) << 8 | abyte0[1] & 0xff) << 8 | abyte0[0] & 0xff;
    }

    public static long toLong(byte abyte0[])
    {
        return (((((((0L | (long)(abyte0[7] & 0xff)) << 8 | (long)(abyte0[6] & 0xff)) << 8 | (long)(abyte0[5] & 0xff)) << 8 | (long)(abyte0[4] & 0xff)) << 8 | (long)(abyte0[3] & 0xff)) << 8 | (long)(abyte0[2] & 0xff)) << 8 | (long)(abyte0[1] & 0xff)) << 8 | (long)(abyte0[0] & 0xff);
    }
}
