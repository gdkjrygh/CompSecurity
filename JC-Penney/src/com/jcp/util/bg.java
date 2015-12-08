// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;


// Referenced classes of package com.jcp.util:
//            bq

public final class bg
{

    private static Boolean a(char ac[], int i, int j)
    {
        if (i > j + 1 && ac[j] == '0')
        {
            if (ac[j + 1] == 'x' || ac[j + 1] == 'X')
            {
                int k = j + 2;
                j = k;
                if (k == i)
                {
                    return Boolean.valueOf(false);
                }
                do
                {
                    if (j < ac.length)
                    {
                        if ((ac[j] < '0' || ac[j] > '9') && (ac[j] < 'a' || ac[j] > 'f') && (ac[j] < 'A' || ac[j] > 'F'))
                        {
                            return Boolean.valueOf(false);
                        }
                    } else
                    {
                        return Boolean.valueOf(true);
                    }
                    if (true)
                    {
                        j++;
                    } else
                    {
                        break;
                    }
                } while (true);
            }
            if (Character.isDigit(ac[j + 1]))
            {
                for (i = j + 1; i < ac.length; i++)
                {
                    if (ac[i] < '0' || ac[i] > '7')
                    {
                        return Boolean.valueOf(false);
                    }
                }

                return Boolean.valueOf(true);
            }
        }
        return null;
    }

    private static Boolean a(char ac[], boolean flag, boolean flag1, boolean flag2, boolean flag3, int i)
    {
        boolean flag4 = true;
        if (i < ac.length)
        {
            if (ac[i] >= '0' && ac[i] <= '9')
            {
                return Boolean.valueOf(true);
            }
            if (ac[i] == 'e' || ac[i] == 'E')
            {
                return Boolean.valueOf(false);
            }
            if (ac[i] == '.')
            {
                if (flag1 || flag)
                {
                    return Boolean.valueOf(false);
                } else
                {
                    return Boolean.valueOf(flag3);
                }
            }
            if (!flag2 && (ac[i] == 'd' || ac[i] == 'D' || ac[i] == 'f' || ac[i] == 'F'))
            {
                return Boolean.valueOf(flag3);
            }
            if (ac[i] == 'l' || ac[i] == 'L')
            {
                if (flag3 && !flag && !flag1)
                {
                    flag = flag4;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            } else
            {
                return Boolean.valueOf(false);
            }
        } else
        {
            return null;
        }
    }

    public static boolean a(String s)
    {
        boolean flag4 = true;
        if (!bq.a(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        int j;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        s = s.toCharArray();
        j = s.length;
        Boolean boolean1;
        if (s[0] == '-')
        {
            i = 1;
        } else
        {
            i = 0;
        }
        boolean1 = a(((char []) (s)), j, i);
        if (boolean1 != null)
        {
            return boolean1.booleanValue();
        }
        j--;
        flag1 = false;
        flag = false;
        flag2 = false;
        flag3 = false;
_L4:
        if (i >= j && (i >= j + 1 || !flag || flag1))
        {
            break MISSING_BLOCK_LABEL_207;
        }
        if (s[i] < '0' || s[i] > '9')
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = true;
        flag = false;
_L6:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (s[i] != '.')
        {
            break MISSING_BLOCK_LABEL_142;
        }
        if (flag2 || flag3) goto _L1; else goto _L5
_L5:
        flag2 = true;
          goto _L6
        if (s[i] != 'e' && s[i] != 'E')
        {
            continue; /* Loop/switch isn't completed */
        }
        if (flag3 || !flag1) goto _L1; else goto _L7
_L7:
        flag = true;
        flag3 = true;
          goto _L6
        if (s[i] != '+' && s[i] != '-' || !flag) goto _L1; else goto _L8
_L8:
        flag1 = false;
        flag = false;
          goto _L6
        s = a(((char []) (s)), flag3, flag2, flag, flag1, i);
        if (s != null)
        {
            return s.booleanValue();
        }
        if (!flag && flag1)
        {
            flag = flag4;
        } else
        {
            flag = false;
        }
        return flag;
    }
}
