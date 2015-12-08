// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.e;
import java.nio.charset.Charset;
import java.util.Map;

public final class l
{

    private static final String a = Charset.defaultCharset().name();
    private static final boolean b;

    public static String a(byte abyte0[], Map map)
    {
        int i;
        int j;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        boolean flag;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        boolean flag1;
        boolean flag2;
        int i4;
        int j4;
        int k4;
        if (map != null)
        {
            map = (String)map.get(e.e);
            if (map != null)
            {
                return map;
            }
        }
        k4 = abyte0.length;
        flag2 = true;
        j = 1;
        j2 = 0;
        k3 = 0;
        j3 = 0;
        i3 = 0;
        i1 = 0;
        k = 0;
        l1 = 0;
        i = 0;
        i4 = 0;
        int k2;
        if (abyte0.length > 3 && abyte0[0] == -17 && abyte0[1] == -69 && abyte0[2] == -65)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k2 = 0;
        l2 = 0;
        i2 = 0;
        j1 = 1;
        if (k2 >= k4 || !flag2 && j == 0 && j1 == 0) goto _L2; else goto _L1
_L1:
        j4 = abyte0[k2] & 0xff;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_817;
        }
        if (j2 > 0)
        {
            if ((j4 & 0x80) == 0)
            {
                k1 = 0;
            } else
            {
                j2--;
                k1 = j1;
            }
        } else
        {
            if ((j4 & 0x80) == 0)
            {
                break MISSING_BLOCK_LABEL_817;
            }
            if ((j4 & 0x40) == 0)
            {
                k1 = 0;
            } else
            {
                j2++;
                if ((j4 & 0x20) == 0)
                {
                    k3++;
                    k1 = j1;
                } else
                {
                    j2++;
                    if ((j4 & 0x10) == 0)
                    {
                        j3++;
                        k1 = j1;
                    } else
                    {
                        j2++;
                        if ((j4 & 8) == 0)
                        {
                            i3++;
                            k1 = j1;
                        } else
                        {
                            k1 = 0;
                        }
                    }
                }
            }
        }
_L11:
        l3 = i4;
        flag1 = flag2;
        if (!flag2) goto _L4; else goto _L3
_L3:
        if (j4 <= 127 || j4 >= 160) goto _L6; else goto _L5
_L5:
        flag1 = false;
        l3 = i4;
_L4:
        if (j != 0)
        {
            if (i1 > 0)
            {
                if (j4 < 64 || j4 == 127 || j4 > 252)
                {
                    j = i2;
                    j1 = 0;
                } else
                {
                    j1 = j;
                    j = i2;
                    i1--;
                }
            } else
            if (j4 == 128 || j4 == 160 || j4 > 239)
            {
                j = i2;
                j1 = 0;
            } else
            if (j4 > 160 && j4 < 224)
            {
                j1 = k + 1;
                k = l1 + 1;
                if (k > i)
                {
                    flag2 = false;
                    l1 = k;
                    i2 = j;
                    i = k;
                    j = ((flag2) ? 1 : 0);
                    k = j1;
                    j1 = i2;
                } else
                {
                    i2 = j;
                    j = 0;
                    l1 = k;
                    k = j1;
                    j1 = i2;
                }
            } else
            if (j4 > 127)
            {
                j1 = i1 + 1;
                l1 = 0;
                i1 = i2 + 1;
                if (i1 > l2)
                {
                    l2 = i1;
                    i2 = j;
                    j = i1;
                    i1 = j1;
                    j1 = i2;
                } else
                {
                    i2 = j;
                    j = i1;
                    i1 = j1;
                    j1 = i2;
                }
            } else
            {
                l1 = 0;
                j1 = j;
                j = 0;
            }
        } else
        {
            j1 = j;
            j = i2;
        }
        j4 = k2 + 1;
        k2 = j1;
        j1 = k1;
        i2 = j;
        j = k2;
        i4 = l3;
        flag2 = flag1;
        k2 = j4;
        break MISSING_BLOCK_LABEL_103;
_L6:
        l3 = i4;
        flag1 = flag2;
        if (j4 <= 159) goto _L4; else goto _L7
_L7:
        if (j4 < 192 || j4 == 215) goto _L9; else goto _L8
_L8:
        l3 = i4;
        flag1 = flag2;
        if (j4 != 247) goto _L4; else goto _L9
_L9:
        l3 = i4 + 1;
        flag1 = flag2;
          goto _L4
_L2:
        if (j1 != 0 && j2 > 0)
        {
            j1 = 0;
        }
        k1 = j;
        if (j != 0)
        {
            k1 = j;
            if (i1 > 0)
            {
                k1 = 0;
            }
        }
        if (j1 != 0 && (flag || k3 + j3 + i3 > 0))
        {
            return "UTF8";
        }
        if (k1 != 0 && (b || i >= 3 || l2 >= 3))
        {
            return "SJIS";
        }
        if (flag2 && k1 != 0)
        {
            if (i == 2 && k == 2 || i4 * 10 >= k4)
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
        if (k1 != 0)
        {
            return "SJIS";
        }
        if (j1 != 0)
        {
            return "UTF8";
        } else
        {
            return a;
        }
        k1 = j1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static 
    {
        boolean flag;
        if ("SJIS".equalsIgnoreCase(a) || "EUC_JP".equalsIgnoreCase(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
