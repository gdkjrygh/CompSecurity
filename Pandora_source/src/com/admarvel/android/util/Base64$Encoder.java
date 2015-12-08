// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.util;


// Referenced classes of package com.admarvel.android.util:
//            Base64

static class count extends count
{

    static final boolean $assertionsDisabled;
    private static final byte ENCODE[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte ENCODE_WEBSAFE[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    public static final int LINE_GROUPS = 19;
    private final byte alphabet[];
    private int count;
    public final boolean do_cr;
    public final boolean do_newline;
    public final boolean do_padding;
    private final byte tail[] = new byte[2];
    int tailLen;

    public int maxOutputSize(int i)
    {
        return (i * 8) / 5 + 10;
    }

    public boolean process(byte abyte0[], int i, int j, boolean flag)
    {
        byte abyte1[];
        byte abyte2[];
        int l;
        int i1;
        int j1;
        int l1;
        abyte1 = alphabet;
        abyte2 = output;
        l = 0;
        j1 = count;
        l1 = j + i;
        i1 = -1;
        tailLen;
        JVM INSTR tableswitch 0 2: default 60
    //                   0 401
    //                   1 407
    //                   2 470;
           goto _L1 _L2 _L3 _L4
_L1:
        int k = i;
_L12:
        i = j1;
        j = l;
        l = k;
        if (i1 == -1) goto _L6; else goto _L5
_L5:
        abyte2[0] = abyte1[i1 >> 18 & 0x3f];
        abyte2[1] = abyte1[i1 >> 12 & 0x3f];
        abyte2[2] = abyte1[i1 >> 6 & 0x3f];
        j = 4;
        abyte2[3] = abyte1[i1 & 0x3f];
        i1 = j1 - 1;
        i = i1;
        l = k;
        if (i1 != 0) goto _L6; else goto _L7
_L7:
        byte abyte3[];
        int k1;
        byte byte0;
        if (do_cr)
        {
            i = 5;
            abyte2[4] = 13;
        } else
        {
            i = 4;
        }
        abyte2[i] = 10;
        i1 = 19;
        j = i + 1;
        if (k + 3 <= l1) goto _L9; else goto _L8
_L8:
        if (!flag) goto _L11; else goto _L10
_L2:
        k = i;
          goto _L12
_L3:
        if (i + 2 > l1) goto _L1; else goto _L13
_L13:
        k = tail[0];
        j = i + 1;
        i1 = (k & 0xff) << 16 | (abyte0[i] & 0xff) << 8 | abyte0[j] & 0xff;
        tailLen = 0;
        k = j + 1;
          goto _L12
_L4:
        if (i + 1 > l1) goto _L1; else goto _L14
_L14:
        j = tail[0];
        i1 = tail[1];
        k = i + 1;
        i1 = (j & 0xff) << 16 | (i1 & 0xff) << 8 | abyte0[i] & 0xff;
        tailLen = 0;
          goto _L12
_L9:
        i = (abyte0[k] & 0xff) << 16 | (abyte0[k + 1] & 0xff) << 8 | abyte0[k + 2] & 0xff;
        abyte2[j] = abyte1[i >> 18 & 0x3f];
        abyte2[j + 1] = abyte1[i >> 12 & 0x3f];
        abyte2[j + 2] = abyte1[i >> 6 & 0x3f];
        abyte2[j + 3] = abyte1[i & 0x3f];
        k += 3;
        k1 = j + 4;
        i1--;
        i = i1;
        j = k1;
        l = k;
        if (i1 == 0)
        {
            if (do_cr)
            {
                i = k1 + 1;
                abyte2[k1] = 13;
            } else
            {
                i = k1;
            }
            abyte2[i] = 10;
            i1 = 19;
            j = i + 1;
            break MISSING_BLOCK_LABEL_185;
        }
          goto _L6
_L10:
        if (k - tailLen == l1 - 1)
        {
            if (tailLen > 0)
            {
                abyte0 = tail;
                k1 = 1;
                l = abyte0[0];
                i = k;
                k = k1;
            } else
            {
                l = abyte0[k];
                i = k + 1;
                k = 0;
            }
            l = (l & 0xff) << 4;
            tailLen = tailLen - k;
            k1 = j + 1;
            abyte2[j] = abyte1[l >> 6 & 0x3f];
            k = k1 + 1;
            abyte2[k1] = abyte1[l & 0x3f];
            j = k;
            if (do_padding)
            {
                l = k + 1;
                abyte2[k] = 61;
                j = l + 1;
                abyte2[l] = 61;
            }
            if (do_newline)
            {
                k = j;
                if (do_cr)
                {
                    abyte2[j] = 13;
                    k = j + 1;
                }
                j = k + 1;
                abyte2[k] = 10;
                l = i;
                i = j;
            } else
            {
                l = i;
                i = j;
            }
        } else
        if (k - tailLen == l1 - 2)
        {
            if (tailLen > 1)
            {
                abyte3 = tail;
                i = 1;
                k1 = abyte3[0];
            } else
            {
                k1 = abyte0[k];
                k++;
                i = 0;
            }
            if (tailLen > 0)
            {
                byte0 = tail[i];
                i++;
                l = k;
                k = byte0;
            } else
            {
                byte0 = abyte0[k];
                l = k + 1;
                k = byte0;
            }
            k = (k & 0xff) << 2 | (k1 & 0xff) << 10;
            tailLen = tailLen - i;
            i = j + 1;
            abyte2[j] = abyte1[k >> 12 & 0x3f];
            j = i + 1;
            abyte2[i] = abyte1[k >> 6 & 0x3f];
            i = j + 1;
            abyte2[j] = abyte1[k & 0x3f];
            if (do_padding)
            {
                j = i + 1;
                abyte2[i] = 61;
                i = j;
            }
            if (do_newline)
            {
                j = i;
                if (do_cr)
                {
                    abyte2[i] = 13;
                    j = i + 1;
                }
                i = j + 1;
                abyte2[j] = 10;
            }
        } else
        {
            l = k;
            i = j;
            if (do_newline)
            {
                l = k;
                i = j;
                if (j > 0)
                {
                    l = k;
                    i = j;
                    if (i1 != 19)
                    {
                        if (do_cr)
                        {
                            i = j + 1;
                            abyte2[j] = 13;
                        } else
                        {
                            i = j;
                        }
                        j = i + 1;
                        abyte2[i] = 10;
                        l = k;
                        i = j;
                    }
                }
            }
        }
        if (!$assertionsDisabled && tailLen != 0)
        {
            throw new AssertionError();
        }
        k1 = i;
        if (!$assertionsDisabled)
        {
            k1 = i;
            if (l != l1)
            {
                throw new AssertionError();
            }
        }
          goto _L15
_L11:
        if (k != l1 - 1) goto _L17; else goto _L16
_L16:
        abyte1 = tail;
        i = tailLen;
        tailLen = i + 1;
        abyte1[i] = abyte0[k];
        k1 = j;
_L15:
        op = k1;
        count = i1;
        return true;
_L17:
        k1 = j;
        if (k == l1 - 2)
        {
            abyte1 = tail;
            i = tailLen;
            tailLen = i + 1;
            abyte1[i] = abyte0[k];
            abyte1 = tail;
            i = tailLen;
            tailLen = i + 1;
            abyte1[i] = abyte0[k + 1];
            k1 = j;
        }
        if (true) goto _L15; else goto _L6
_L6:
        k = l;
        i1 = i;
        break MISSING_BLOCK_LABEL_185;
    }

    static 
    {
        boolean flag;
        if (!com/admarvel/android/util/Base64.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    public (int i, byte abyte0[])
    {
        boolean flag1 = true;
        super();
        output = abyte0;
        boolean flag;
        if ((i & 1) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        do_padding = flag;
        if ((i & 2) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        do_newline = flag;
        if ((i & 4) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        do_cr = flag;
        if ((i & 8) == 0)
        {
            abyte0 = ENCODE;
        } else
        {
            abyte0 = ENCODE_WEBSAFE;
        }
        alphabet = abyte0;
        tailLen = 0;
        if (do_newline)
        {
            i = 19;
        } else
        {
            i = -1;
        }
        count = i;
    }
}
