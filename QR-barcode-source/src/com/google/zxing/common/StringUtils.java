// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.util.Map;

public final class StringUtils
{

    private static final boolean ASSUME_SHIFT_JIS;
    private static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    private static final String ISO88591 = "ISO8859_1";
    private static final String PLATFORM_DEFAULT_ENCODING = System.getProperty("file.encoding");
    public static final String SHIFT_JIS = "SJIS";
    private static final String UTF8 = "UTF8";

    private StringUtils()
    {
    }

    public static String guessEncoding(byte abyte0[], Map map)
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        boolean flag;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        boolean flag1;
        boolean flag2;
        int l3;
        int i4;
        int j4;
        if (map != null)
        {
            map = (String)map.get(DecodeHintType.CHARACTER_SET);
            if (map != null)
            {
                return map;
            }
        }
        j4 = abyte0.length;
        flag2 = true;
        j = 1;
        i2 = 0;
        j3 = 0;
        i3 = 0;
        l2 = 0;
        l = 0;
        k = 0;
        k1 = 0;
        i = 0;
        l3 = 0;
        int j2;
        if (abyte0.length > 3 && abyte0[0] == -17 && abyte0[1] == -69 && abyte0[2] == -65)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j2 = 0;
        k2 = 0;
        l1 = 0;
        i1 = 1;
        if (j2 >= j4 || !flag2 && j == 0 && i1 == 0) goto _L2; else goto _L1
_L1:
        i4 = abyte0[j2] & 0xff;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_817;
        }
        if (i2 > 0)
        {
            if ((i4 & 0x80) == 0)
            {
                j1 = 0;
            } else
            {
                i2--;
                j1 = i1;
            }
        } else
        {
            if ((i4 & 0x80) == 0)
            {
                break MISSING_BLOCK_LABEL_817;
            }
            if ((i4 & 0x40) == 0)
            {
                j1 = 0;
            } else
            {
                i2++;
                if ((i4 & 0x20) == 0)
                {
                    j3++;
                    j1 = i1;
                } else
                {
                    i2++;
                    if ((i4 & 0x10) == 0)
                    {
                        i3++;
                        j1 = i1;
                    } else
                    {
                        i2++;
                        if ((i4 & 8) == 0)
                        {
                            l2++;
                            j1 = i1;
                        } else
                        {
                            j1 = 0;
                        }
                    }
                }
            }
        }
_L11:
        k3 = l3;
        flag1 = flag2;
        if (!flag2) goto _L4; else goto _L3
_L3:
        if (i4 <= 127 || i4 >= 160) goto _L6; else goto _L5
_L5:
        flag1 = false;
        k3 = l3;
_L4:
        if (j != 0)
        {
            if (l > 0)
            {
                if (i4 < 64 || i4 == 127 || i4 > 252)
                {
                    j = l1;
                    i1 = 0;
                } else
                {
                    i1 = j;
                    j = l1;
                    l--;
                }
            } else
            if (i4 == 128 || i4 == 160 || i4 > 239)
            {
                j = l1;
                i1 = 0;
            } else
            if (i4 > 160 && i4 < 224)
            {
                i1 = k + 1;
                k = k1 + 1;
                if (k > i)
                {
                    flag2 = false;
                    k1 = k;
                    l1 = j;
                    i = k;
                    j = ((flag2) ? 1 : 0);
                    k = i1;
                    i1 = l1;
                } else
                {
                    l1 = j;
                    j = 0;
                    k1 = k;
                    k = i1;
                    i1 = l1;
                }
            } else
            if (i4 > 127)
            {
                i1 = l + 1;
                k1 = 0;
                l = l1 + 1;
                if (l > k2)
                {
                    k2 = l;
                    l1 = j;
                    j = l;
                    l = i1;
                    i1 = l1;
                } else
                {
                    l1 = j;
                    j = l;
                    l = i1;
                    i1 = l1;
                }
            } else
            {
                k1 = 0;
                i1 = j;
                j = 0;
            }
        } else
        {
            i1 = j;
            j = l1;
        }
        i4 = j2 + 1;
        j2 = i1;
        i1 = j1;
        l1 = j;
        j = j2;
        l3 = k3;
        flag2 = flag1;
        j2 = i4;
        break MISSING_BLOCK_LABEL_103;
_L6:
        k3 = l3;
        flag1 = flag2;
        if (i4 <= 159) goto _L4; else goto _L7
_L7:
        if (i4 < 192 || i4 == 215) goto _L9; else goto _L8
_L8:
        k3 = l3;
        flag1 = flag2;
        if (i4 != 247) goto _L4; else goto _L9
_L9:
        k3 = l3 + 1;
        flag1 = flag2;
          goto _L4
_L2:
        if (i1 != 0 && i2 > 0)
        {
            i1 = 0;
        }
        j1 = j;
        if (j != 0)
        {
            j1 = j;
            if (l > 0)
            {
                j1 = 0;
            }
        }
        if (i1 != 0 && (flag || j3 + i3 + l2 > 0))
        {
            return "UTF8";
        }
        if (j1 != 0 && (ASSUME_SHIFT_JIS || i >= 3 || k2 >= 3))
        {
            return "SJIS";
        }
        if (flag2 && j1 != 0)
        {
            if (i == 2 && k == 2 || l3 * 10 >= j4)
            {
                return "SJIS";
            } else
            {
                return "ISO8859_1";
            }
        }
        if (flag2)
        {
            return "ISO8859_1";
        }
        if (j1 != 0)
        {
            return "SJIS";
        }
        if (i1 != 0)
        {
            return "UTF8";
        } else
        {
            return PLATFORM_DEFAULT_ENCODING;
        }
        j1 = i1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static 
    {
        boolean flag;
        if ("SJIS".equalsIgnoreCase(PLATFORM_DEFAULT_ENCODING) || "EUC_JP".equalsIgnoreCase(PLATFORM_DEFAULT_ENCODING))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ASSUME_SHIFT_JIS = flag;
    }
}
