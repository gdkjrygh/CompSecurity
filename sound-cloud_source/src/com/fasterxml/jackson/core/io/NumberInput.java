// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;


public final class NumberInput
{

    static final String MAX_LONG_STR = "9223372036854775807";
    static final String MIN_LONG_STR_NO_SIGN = "-9223372036854775808".substring(1);

    public static boolean inLongRange(String s, boolean flag)
    {
        String s1;
        int i;
        int k;
        if (flag)
        {
            s1 = MIN_LONG_STR_NO_SIGN;
        } else
        {
            s1 = MAX_LONG_STR;
        }
        k = s1.length();
        i = s.length();
        if (i < k)
        {
            return true;
        }
        if (i > k)
        {
            return false;
        }
        for (int j = 0; j < k; j++)
        {
            int l = s.charAt(j) - s1.charAt(j);
            if (l != 0)
            {
                return l < 0;
            }
        }

        return true;
    }

    public static boolean inLongRange(char ac[], int i, int j, boolean flag)
    {
        String s;
        int k;
        if (flag)
        {
            s = MIN_LONG_STR_NO_SIGN;
        } else
        {
            s = MAX_LONG_STR;
        }
        k = s.length();
        if (j < k)
        {
            return true;
        }
        if (j > k)
        {
            return false;
        }
        for (j = 0; j < k; j++)
        {
            int l = ac[i + j] - s.charAt(j);
            if (l != 0)
            {
                return l < 0;
            }
        }

        return true;
    }

    public static int parseAsInt(String s, int i)
    {
        char c = '\0';
        if (s != null) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        int j;
        s = s.trim();
        j = s.length();
        if (j == 0) goto _L1; else goto _L3
_L3:
        if (j <= 0) goto _L5; else goto _L4
_L4:
        int k = s.charAt(0);
        if (k != 43) goto _L7; else goto _L6
_L6:
        s = s.substring(1);
        k = s.length();
        j = c;
_L9:
        if (j < k)
        {
            c = s.charAt(j);
            if (c > '9' || c < '0')
            {
                double d;
                try
                {
                    d = parseDouble(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return i;
                }
                return (int)d;
            }
            j++;
            continue; /* Loop/switch isn't completed */
        } else
        {
            try
            {
                j = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return i;
            }
            return j;
        }
_L7:
        if (k == 45)
        {
            c = '\001';
            k = j;
            j = c;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        k = j;
        j = c;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static long parseAsLong(String s, long l)
    {
        char c = '\0';
        if (s != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i;
        s = s.trim();
        i = s.length();
        if (i == 0) goto _L1; else goto _L3
_L3:
        if (i <= 0) goto _L5; else goto _L4
_L4:
        int j = s.charAt(0);
        if (j != 43) goto _L7; else goto _L6
_L6:
        s = s.substring(1);
        j = s.length();
        i = c;
_L9:
        if (i < j)
        {
            c = s.charAt(i);
            if (c > '9' || c < '0')
            {
                double d;
                long l1;
                try
                {
                    d = parseDouble(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return l;
                }
                return (long)d;
            }
            i++;
            continue; /* Loop/switch isn't completed */
        } else
        {
            try
            {
                l1 = Long.parseLong(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return l;
            }
            return l1;
        }
_L7:
        if (j == 45)
        {
            c = '\001';
            j = i;
            i = c;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        j = i;
        i = c;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static double parseDouble(String s)
        throws NumberFormatException
    {
        if ("2.2250738585072012e-308".equals(s))
        {
            return 4.9406564584124654E-324D;
        } else
        {
            return Double.parseDouble(s);
        }
    }

    public static int parseInt(String s)
    {
        int i;
        boolean flag;
        int j;
        int l;
        j = 1;
        i = s.charAt(0);
        l = s.length();
        if (i == '-')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (l != 1 && l <= 10) goto _L4; else goto _L3
_L3:
        j = Integer.parseInt(s);
_L11:
        return j;
_L4:
        i = s.charAt(1);
        j = 2;
_L6:
        if (i > '9' || i < '0')
        {
            return Integer.parseInt(s);
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (l > 9)
        {
            return Integer.parseInt(s);
        }
        if (true) goto _L6; else goto _L5
_L5:
        int k;
        k = i - 48;
        i = k;
        if (j >= l) goto _L8; else goto _L7
_L7:
        int i1;
        i1 = j + 1;
        i = s.charAt(j);
        if (i > 57 || i < 48)
        {
            return Integer.parseInt(s);
        }
        j = k * 10 + (i - 48);
        i = j;
        if (i1 >= l) goto _L8; else goto _L9
_L9:
        k = i1 + 1;
        i = s.charAt(i1);
        if (i > 57 || i < 48)
        {
            return Integer.parseInt(s);
        }
        j = j * 10 + (i - 48);
        i = j;
        if (k >= l) goto _L8; else goto _L10
_L10:
        i = j;
_L12:
        j = k + 1;
        k = s.charAt(k);
        if (k > '9' || k < '0')
        {
            return Integer.parseInt(s);
        }
        i = i * 10 + (k - 48);
        if (j < l)
        {
            break MISSING_BLOCK_LABEL_260;
        }
_L8:
        j = i;
        if (flag)
        {
            return -i;
        }
          goto _L11
        k = j;
          goto _L12
    }

    public static int parseInt(char ac[], int i, int j)
    {
        int k = ac[i] - 48;
        int l = j + i;
        int i1 = i + 1;
        i = k;
        if (i1 < l)
        {
            j = k * 10 + (ac[i1] - 48);
            k = i1 + 1;
            i = j;
            if (k < l)
            {
                j = j * 10 + (ac[k] - 48);
                k++;
                i = j;
                if (k < l)
                {
                    j = j * 10 + (ac[k] - 48);
                    k++;
                    i = j;
                    if (k < l)
                    {
                        j = j * 10 + (ac[k] - 48);
                        k++;
                        i = j;
                        if (k < l)
                        {
                            j = j * 10 + (ac[k] - 48);
                            k++;
                            i = j;
                            if (k < l)
                            {
                                j = j * 10 + (ac[k] - 48);
                                k++;
                                i = j;
                                if (k < l)
                                {
                                    j = j * 10 + (ac[k] - 48);
                                    k++;
                                    i = j;
                                    if (k < l)
                                    {
                                        i = j * 10 + (ac[k] - 48);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public static long parseLong(String s)
    {
        if (s.length() <= 9)
        {
            return (long)parseInt(s);
        } else
        {
            return Long.parseLong(s);
        }
    }

    public static long parseLong(char ac[], int i, int j)
    {
        j -= 9;
        long l = parseInt(ac, i, j);
        return (long)parseInt(ac, j + i, 9) + l * 0x3b9aca00L;
    }

}
