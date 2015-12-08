// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.util.Map;

public final class StringUtils
{

    private static final boolean ASSUME_SHIFT_JIS;
    private static final String PLATFORM_DEFAULT_ENCODING = System.getProperty("file.encoding");

    public static String guessEncoding(byte abyte0[], Map map)
    {
        int i;
        boolean flag1;
        int j;
        int k;
        boolean flag3;
        boolean flag4;
        int l;
        boolean flag5;
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        boolean flag6;
        int i4;
        boolean flag7;
        int i5;
        int j5;
        if (map != null)
        {
            map = (String)map.get(DecodeHintType.CHARACTER_SET);
            if (map != null)
            {
                return map;
            }
        }
        i5 = abyte0.length;
        flag6 = true;
        flag3 = true;
        flag4 = true;
        i4 = 0;
        l = 0;
        k = 0;
        j = 0;
        i2 = 0;
        k1 = 0;
        j2 = 0;
        l2 = 0;
        i1 = 0;
        j1 = 0;
        l3 = 0;
        int l1;
        if (abyte0.length > 3 && abyte0[0] == -17 && abyte0[1] == -69 && abyte0[2] == -65)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        l1 = 0;
_L9:
        if (l1 >= i5 || !flag6 && !flag3 && !flag4)
        {
            break MISSING_BLOCK_LABEL_936;
        }
        j5 = abyte0[l1] & 0xff;
        flag1 = flag4;
        i3 = l;
        j3 = k;
        k3 = j;
        i = i4;
        if (flag4)
        {
            if (i4 > 0)
            {
                if ((j5 & 0x80) == 0)
                {
                    flag1 = false;
                    i = i4;
                    k3 = j;
                    j3 = k;
                    i3 = l;
                } else
                {
                    i = i4 - 1;
                    flag1 = flag4;
                    i3 = l;
                    j3 = k;
                    k3 = j;
                }
            } else
            {
                flag1 = flag4;
                i3 = l;
                j3 = k;
                k3 = j;
                i = i4;
                if ((j5 & 0x80) != 0)
                {
                    if ((j5 & 0x40) == 0)
                    {
                        flag1 = false;
                        i3 = l;
                        j3 = k;
                        k3 = j;
                        i = i4;
                    } else
                    {
                        i = i4 + 1;
                        if ((j5 & 0x20) == 0)
                        {
                            i3 = l + 1;
                            flag1 = flag4;
                            j3 = k;
                            k3 = j;
                        } else
                        {
                            i++;
                            if ((j5 & 0x10) == 0)
                            {
                                j3 = k + 1;
                                flag1 = flag4;
                                i3 = l;
                                k3 = j;
                            } else
                            {
                                i++;
                                if ((j5 & 8) == 0)
                                {
                                    k3 = j + 1;
                                    flag1 = flag4;
                                    i3 = l;
                                    j3 = k;
                                } else
                                {
                                    flag1 = false;
                                    i3 = l;
                                    j3 = k;
                                    k3 = j;
                                }
                            }
                        }
                    }
                }
            }
        }
        flag7 = flag6;
        i4 = l3;
        if (!flag6) goto _L2; else goto _L1
_L1:
        if (j5 <= 127 || j5 >= 160) goto _L4; else goto _L3
_L3:
        flag7 = false;
        i4 = l3;
_L2:
        flag4 = flag3;
        l = i2;
        j = l2;
        k = j2;
        int j4 = k1;
        int k4 = j1;
        int l4 = i1;
        if (flag3)
        {
            if (i2 > 0)
            {
                if (j5 < 64 || j5 == 127 || j5 > 252)
                {
                    flag4 = false;
                    l4 = i1;
                    k4 = j1;
                    j4 = k1;
                    k = j2;
                    j = l2;
                    l = i2;
                } else
                {
                    l = i2 - 1;
                    flag4 = flag3;
                    j = l2;
                    k = j2;
                    j4 = k1;
                    k4 = j1;
                    l4 = i1;
                }
            } else
            if (j5 == 128 || j5 == 160 || j5 > 239)
            {
                flag4 = false;
                l = i2;
                j = l2;
                k = j2;
                j4 = k1;
                k4 = j1;
                l4 = i1;
            } else
            if (j5 > 160 && j5 < 224)
            {
                l2 = k1 + 1;
                l3 = 0;
                k1 = j2 + 1;
                flag4 = flag3;
                l = i2;
                j = l3;
                k = k1;
                j4 = l2;
                k4 = j1;
                l4 = i1;
                if (k1 > i1)
                {
                    l4 = k1;
                    flag4 = flag3;
                    l = i2;
                    j = l3;
                    k = k1;
                    j4 = l2;
                    k4 = j1;
                }
            } else
            if (j5 > 127)
            {
                int k2 = i2 + 1;
                l3 = 0;
                i2 = l2 + 1;
                flag4 = flag3;
                l = k2;
                j = i2;
                k = l3;
                j4 = k1;
                k4 = j1;
                l4 = i1;
                if (i2 > j1)
                {
                    k4 = i2;
                    flag4 = flag3;
                    l = k2;
                    j = i2;
                    k = l3;
                    j4 = k1;
                    l4 = i1;
                }
            } else
            {
                k = 0;
                j = 0;
                flag4 = flag3;
                l = i2;
                j4 = k1;
                k4 = j1;
                l4 = i1;
            }
        }
        l1++;
        flag6 = flag7;
        flag3 = flag4;
        flag4 = flag1;
        l3 = i4;
        i2 = l;
        l2 = j;
        j2 = k;
        k1 = j4;
        j1 = k4;
        i1 = l4;
        l = i3;
        k = j3;
        j = k3;
        i4 = i;
        continue; /* Loop/switch isn't completed */
_L4:
        flag7 = flag6;
        i4 = l3;
        if (j5 <= 159) goto _L2; else goto _L5
_L5:
        if (j5 < 192 || j5 == 215) goto _L7; else goto _L6
_L6:
        flag7 = flag6;
        i4 = l3;
        if (j5 != 247) goto _L2; else goto _L7
_L7:
        i4 = l3 + 1;
        flag7 = flag6;
          goto _L2
        boolean flag = flag4;
        if (flag4)
        {
            flag = flag4;
            if (i4 > 0)
            {
                flag = false;
            }
        }
        boolean flag2 = flag3;
        if (flag3)
        {
            flag2 = flag3;
            if (i2 > 0)
            {
                flag2 = false;
            }
        }
        if (flag && (flag5 || l + k + j > 0))
        {
            return "UTF8";
        }
        if (flag2 && (ASSUME_SHIFT_JIS || i1 >= 3 || j1 >= 3))
        {
            return "SJIS";
        }
        if (flag6 && flag2)
        {
            if (i1 == 2 && k1 == 2 || l3 * 10 >= i5)
            {
                return "SJIS";
            } else
            {
                return "ISO8859_1";
            }
        }
        if (flag6)
        {
            return "ISO8859_1";
        }
        if (flag2)
        {
            return "SJIS";
        }
        if (flag)
        {
            return "UTF8";
        }
        return PLATFORM_DEFAULT_ENCODING;
        if (true) goto _L9; else goto _L8
_L8:
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
