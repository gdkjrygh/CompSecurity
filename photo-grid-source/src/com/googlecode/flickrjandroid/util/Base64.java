// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.util;


public final class Base64
{

    private static final int BASELENGTH = 255;
    private static final int EIGHTBIT = 8;
    private static final int FOURBYTE = 4;
    private static final int LOOKUPLENGTH = 64;
    private static final byte PAD = 61;
    private static final int SIGN = -128;
    private static final int SIXBIT = 6;
    private static final int SIXTEENBIT = 16;
    private static final int TWENTYFOURBITGROUP = 24;
    private static byte base64Alphabet[];
    private static final boolean fDebug = false;
    private static byte lookUpBase64Alphabet[];

    public Base64()
    {
    }

    public static byte[] decode(byte abyte0[])
    {
        Object obj = null;
        int k = 0;
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorenter ;
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        abyte0 = obj;
_L6:
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorexit ;
        return abyte0;
_L2:
        byte abyte2[] = removeWhiteSpace(abyte0);
        abyte0 = obj;
        int l;
        if (abyte2.length % 4 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = abyte2.length / 4;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        abyte0 = new byte[0];
        continue; /* Loop/switch isn't completed */
        byte abyte1[] = new byte[l * 3];
        int i;
        int j;
        i = 0;
        j = 0;
_L4:
        byte byte0;
        if (j < l - 1)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        l = k + 1;
        byte0 = abyte2[k];
        abyte0 = obj;
        if (!isData(byte0))
        {
            continue; /* Loop/switch isn't completed */
        }
        byte byte1;
        int i1;
        i1 = l + 1;
        byte1 = abyte2[l];
        abyte0 = obj;
        if (!isData(byte1))
        {
            continue; /* Loop/switch isn't completed */
        }
        k = base64Alphabet[byte0];
        l = base64Alphabet[byte1];
        byte0 = abyte2[i1];
        byte1 = abyte2[i1 + 1];
        if (isData(byte0) && isData(byte1))
        {
            break MISSING_BLOCK_LABEL_528;
        }
        if (!isPad(byte0) || !isPad(byte1))
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0 = obj;
        if ((l & 0xf) != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = new byte[j * 3 + 1];
        System.arraycopy(abyte1, 0, abyte0, 0, j * 3);
        abyte0[i] = (byte)(k << 2 | l >> 4);
        continue; /* Loop/switch isn't completed */
        abyte0;
        throw abyte0;
        i1 = k + 1;
        byte0 = abyte2[k];
        abyte0 = obj;
        if (!isData(byte0))
        {
            continue; /* Loop/switch isn't completed */
        }
        k = i1 + 1;
        byte1 = abyte2[i1];
        abyte0 = obj;
        if (!isData(byte1))
        {
            continue; /* Loop/switch isn't completed */
        }
        byte byte2;
        i1 = k + 1;
        byte2 = abyte2[k];
        abyte0 = obj;
        if (!isData(byte2))
        {
            continue; /* Loop/switch isn't completed */
        }
        byte byte3;
        k = i1 + 1;
        byte3 = abyte2[i1];
        abyte0 = obj;
        byte byte4;
        byte byte5;
        int l1;
        if (!isData(byte3))
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = base64Alphabet[byte0];
        byte5 = base64Alphabet[byte1];
        i1 = base64Alphabet[byte2];
        byte4 = base64Alphabet[byte3];
        int k1 = i + 1;
        abyte1[i] = (byte)(l1 << 2 | byte5 >> 4);
        l1 = k1 + 1;
        abyte1[k1] = (byte)((byte5 & 0xf) << 4 | i1 >> 2 & 0xf);
        i = l1 + 1;
        abyte1[l1] = (byte)(i1 << 6 | byte4);
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        abyte0 = obj;
        if (isPad(byte0))
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = obj;
        if (!isPad(byte1))
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = base64Alphabet[byte0];
        abyte0 = obj;
        if ((i1 & 3) != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = new byte[j * 3 + 2];
        System.arraycopy(abyte1, 0, abyte0, 0, j * 3);
        abyte0[i] = (byte)(k << 2 | l >> 4);
        abyte0[i + 1] = (byte)((l & 0xf) << 4 | i1 >> 2 & 0xf);
        continue; /* Loop/switch isn't completed */
        j = base64Alphabet[byte0];
        i1 = base64Alphabet[byte1];
        int j1 = i + 1;
        abyte1[i] = (byte)(k << 2 | l >> 4);
        abyte1[j1] = (byte)((l & 0xf) << 4 | j >> 2 & 0xf);
        abyte1[j1 + 1] = (byte)(j << 6 | i1);
        abyte0 = abyte1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static byte[] encode(byte abyte0[])
    {
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorenter ;
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        byte abyte2[] = null;
_L6:
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorexit ;
        return abyte2;
_L2:
        int i = abyte0.length * 8;
        byte byte3 = i % 24;
        int j = i / 24;
        if (byte3 == 0) goto _L4; else goto _L3
_L3:
        byte abyte1[] = new byte[(j + 1) * 4];
          goto _L5
_L11:
        byte byte0;
        byte byte1;
        abyte1[byte1] = lookUpBase64Alphabet[i];
        abyte1[byte1 + 1] = lookUpBase64Alphabet[byte0 << 4];
        abyte1[byte1 + 2] = 61;
        abyte1[byte1 + 3] = 61;
        abyte2 = abyte1;
          goto _L6
        abyte0;
        throw abyte0;
_L4:
        abyte1 = new byte[j * 4];
          goto _L5
_L12:
        byte byte2;
        byte byte4;
        byte byte5;
        byte byte6;
        int k;
        abyte1[k] = lookUpBase64Alphabet[byte0];
        abyte1[k + 1] = lookUpBase64Alphabet[byte1 | byte6 << 4];
        abyte1[k + 2] = lookUpBase64Alphabet[byte2 | byte5 << 2];
        abyte1[k + 3] = lookUpBase64Alphabet[byte4 & 0x3f];
        i++;
          goto _L7
_L9:
        abyte1[byte1] = lookUpBase64Alphabet[i];
        abyte1[byte1 + 1] = lookUpBase64Alphabet[byte0 | byte3 << 4];
        abyte1[byte1 + 2] = lookUpBase64Alphabet[byte2 << 2];
        abyte1[byte1 + 3] = 61;
        abyte2 = abyte1;
          goto _L6
_L15:
        i = (byte)(i >> 2 ^ 0xc0);
          goto _L8
_L17:
        byte0 = (byte)(byte0 >> 4 ^ 0xf0);
          goto _L9
_L5:
        i = 0;
_L7:
label0:
        {
            if (i < j)
            {
                break label0;
            }
            byte0 = i * 3;
            byte1 = i * 4;
            if (byte3 != 8)
            {
                break MISSING_BLOCK_LABEL_456;
            }
            i = abyte0[byte0];
            byte0 = (byte)(i & 3);
            if ((i & 0xffffff80) == 0)
            {
                i >>= 2;
            } else
            {
                i = (byte)(i >> 2 ^ 0xc0);
            }
        }
        if (true) goto _L11; else goto _L10
_L10:
        byte2 = i * 3;
        byte0 = abyte0[byte2];
        byte1 = abyte0[byte2 + 1];
        byte4 = abyte0[byte2 + 2];
        byte5 = (byte)(byte1 & 0xf);
        byte6 = (byte)(byte0 & 3);
        k = i * 4;
        if ((byte0 & 0xffffff80) == 0)
        {
            byte0 >>= 2;
        } else
        {
            byte0 = (byte)(byte0 >> 2 ^ 0xc0);
        }
        if ((byte1 & 0xffffff80) == 0)
        {
            byte1 >>= 4;
        } else
        {
            byte1 = (byte)(byte1 >> 4 ^ 0xf0);
        }
        if ((byte4 & 0xffffff80) == 0)
        {
            byte2 = (byte)(byte4 >> 6);
        } else
        {
            byte2 = (byte)(byte4 >> 6 ^ 0xfc);
        }
          goto _L12
        abyte2 = abyte1;
        if (byte3 != 16) goto _L6; else goto _L13
_L13:
        i = abyte0[byte0];
        byte0 = abyte0[byte0 + 1];
        byte2 = (byte)(byte0 & 0xf);
        byte3 = (byte)(i & 3);
        if ((i & 0xffffff80) != 0) goto _L15; else goto _L14
_L14:
        i >>= 2;
_L8:
        if ((byte0 & 0xffffff80) != 0) goto _L17; else goto _L16
_L16:
        byte0 >>= 4;
          goto _L9
    }

    public static int getDecodedDataLength(byte abyte0[])
    {
        int i = -1;
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorenter ;
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorexit ;
        return i;
_L2:
        if (abyte0.length == 0)
        {
            i = 0;
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = decode(abyte0);
        if (abyte0 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = abyte0.length;
        if (true) goto _L1; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    public static boolean isArrayByteBase64(byte abyte0[])
    {
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorenter ;
        int i = getDecodedDataLength(abyte0);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorexit ;
        return flag;
        abyte0;
        throw abyte0;
    }

    public static boolean isBase64(byte byte0)
    {
        return isWhiteSpace(byte0) || isPad(byte0) || isData(byte0);
    }

    public static boolean isBase64(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return isArrayByteBase64(s.getBytes());
        }
    }

    protected static boolean isData(byte byte0)
    {
        return base64Alphabet[byte0] != -1;
    }

    protected static boolean isPad(byte byte0)
    {
        return byte0 == 61;
    }

    protected static boolean isWhiteSpace(byte byte0)
    {
        return byte0 == 32 || byte0 == 13 || byte0 == 10 || byte0 == 9;
    }

    public static byte[] removeWhiteSpace(byte abyte0[])
    {
        boolean flag = false;
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorenter ;
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        byte abyte1[] = null;
_L6:
        com/googlecode/flickrjandroid/util/Base64;
        JVM INSTR monitorexit ;
        return abyte1;
_L2:
        int l = abyte0.length;
        int i;
        int j;
        i = 0;
        j = 0;
_L9:
        if (i < l) goto _L4; else goto _L3
_L3:
        abyte1 = abyte0;
        if (j == l) goto _L6; else goto _L5
_L5:
        abyte1 = new byte[j];
        j = 0;
        i = ((flag) ? 1 : 0);
          goto _L7
_L4:
        int k;
        k = j;
        break MISSING_BLOCK_LABEL_54;
_L8:
        if (!isWhiteSpace(abyte0[j]))
        {
            k = i + 1;
            abyte1[i] = abyte0[j];
            i = k;
        }
        j++;
        continue; /* Loop/switch isn't completed */
        abyte0;
        throw abyte0;
_L7:
        if (j < l) goto _L8; else goto _L6
        if (!isWhiteSpace(abyte0[i]))
        {
            k = j + 1;
        }
        i++;
        j = k;
          goto _L9
    }

    static 
    {
        int i;
        boolean flag;
        flag = false;
        base64Alphabet = new byte[255];
        lookUpBase64Alphabet = new byte[64];
        i = 0;
_L13:
        if (i < 255) goto _L2; else goto _L1
_L1:
        i = 90;
_L14:
        if (i >= 65) goto _L4; else goto _L3
_L3:
        i = 122;
_L15:
        if (i >= 97) goto _L6; else goto _L5
_L5:
        i = 57;
_L16:
        if (i >= 48) goto _L8; else goto _L7
_L7:
        base64Alphabet[43] = 62;
        base64Alphabet[47] = 63;
        i = 0;
_L17:
        if (i <= 25) goto _L10; else goto _L9
_L9:
        int j;
        j = 26;
        i = 0;
_L18:
        if (j <= 51) goto _L12; else goto _L11
_L11:
        j = 52;
        i = ((flag) ? 1 : 0);
_L19:
        if (j > 61)
        {
            lookUpBase64Alphabet[62] = 43;
            lookUpBase64Alphabet[63] = 47;
            return;
        }
        break MISSING_BLOCK_LABEL_224;
_L2:
        base64Alphabet[i] = -1;
        i++;
          goto _L13
_L4:
        base64Alphabet[i] = (byte)(i - 65);
        i--;
          goto _L14
_L6:
        base64Alphabet[i] = (byte)((i - 97) + 26);
        i--;
          goto _L15
_L8:
        base64Alphabet[i] = (byte)((i - 48) + 52);
        i--;
          goto _L16
_L10:
        lookUpBase64Alphabet[i] = (byte)(i + 65);
        i++;
          goto _L17
_L12:
        lookUpBase64Alphabet[j] = (byte)(i + 97);
        j++;
        i++;
          goto _L18
        lookUpBase64Alphabet[j] = (byte)(i + 48);
        j++;
        i++;
          goto _L19
    }
}
