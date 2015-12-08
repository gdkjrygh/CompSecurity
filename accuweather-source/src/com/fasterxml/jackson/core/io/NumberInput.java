// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;


public final class NumberInput
{

    static final long L_BILLION = 0x3b9aca00L;
    static final String MAX_LONG_STR = String.valueOf(0x7fffffffffffffffL);
    static final String MIN_LONG_STR_NO_SIGN = String.valueOf(0x8000000000000000L).substring(1);
    public static final String NASTY_SMALL_DOUBLE = "2.2250738585072012e-308";

    public NumberInput()
    {
    }

    public static boolean inLongRange(String s, boolean flag)
    {
        String s1;
        int i;
        int j;
        if (flag)
        {
            s1 = MIN_LONG_STR_NO_SIGN;
        } else
        {
            s1 = MAX_LONG_STR;
        }
        j = s1.length();
        i = s.length();
        if (i >= j) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (i > j)
        {
            return false;
        }
        i = 0;
        do
        {
            if (i < j)
            {
label0:
                {
                    int k = s.charAt(i) - s1.charAt(i);
                    if (k == 0)
                    {
                        break label0;
                    }
                    if (k >= 0)
                    {
                        return false;
                    }
                }
            }
            if (true)
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
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
        if (j >= k) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (j > k)
        {
            return false;
        }
        j = 0;
        do
        {
            if (j < k)
            {
label0:
                {
                    int l = ac[i + j] - s.charAt(j);
                    if (l == 0)
                    {
                        break label0;
                    }
                    if (l >= 0)
                    {
                        return false;
                    }
                }
            }
            if (true)
            {
                continue;
            }
            j++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static double parseAsDouble(String s, double d)
    {
        if (s != null)
        {
            if ((s = s.trim()).length() != 0)
            {
                double d1;
                try
                {
                    d1 = parseDouble(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return d;
                }
                return d1;
            }
        }
        return d;
    }

    public static int parseAsInt(String s, int i)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        String s1;
        int l;
        s1 = s.trim();
        l = s1.length();
        if (l == 0) goto _L1; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_24;
        j = ((flag) ? 1 : 0);
        k = l;
        s = s1;
        if (c == '-')
        {
            j = 0 + 1;
            k = l;
            s = s1;
        }
        continue;
        boolean flag = false;
        int j = ((flag) ? 1 : 0);
        int k = l;
        s = s1;
        char c;
        if (l < 0)
        {
            c = s1.charAt(0);
            if (c != '+')
            {
                break MISSING_BLOCK_LABEL_112;
            }
            s = s1.substring(1);
            k = s.length();
            j = ((flag) ? 1 : 0);
        }
        do
        {
            if (j >= k)
            {
                break;
            }
            l = s.charAt(j);
            if (l > 57 || l < 48)
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
        } while (true);
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

    public static long parseAsLong(String s, long l)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        String s1;
        int k;
        s1 = s.trim();
        k = s1.length();
        if (k == 0) goto _L1; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_24;
        i = ((flag) ? 1 : 0);
        j = k;
        s = s1;
        if (c == '-')
        {
            i = 0 + 1;
            j = k;
            s = s1;
        }
        continue;
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        int j = k;
        s = s1;
        char c;
        if (k < 0)
        {
            c = s1.charAt(0);
            if (c != '+')
            {
                break MISSING_BLOCK_LABEL_112;
            }
            s = s1.substring(1);
            j = s.length();
            i = ((flag) ? 1 : 0);
        }
        do
        {
            if (i >= j)
            {
                break;
            }
            k = s.charAt(i);
            if (k > 57 || k < 48)
            {
                double d;
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
        } while (true);
        long l1;
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
        int l1;
        flag = false;
        i = s.charAt(0);
        l1 = s.length();
        if (i == '-')
        {
            flag = true;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (l1 != 1 && l1 <= 10) goto _L4; else goto _L3
_L3:
        int j = Integer.parseInt(s);
_L6:
        return j;
_L4:
        j = 1 + 1;
        i = s.charAt(1);
        break MISSING_BLOCK_LABEL_59;
_L2:
        if (l1 > 9)
        {
            return Integer.parseInt(s);
        }
        break MISSING_BLOCK_LABEL_271;
_L7:
        if (i > '9' || i < '0')
        {
            return Integer.parseInt(s);
        }
        int j1 = i - 48;
        i = j1;
        int k = j;
        if (j < l1)
        {
            int i2 = j + 1;
            i = s.charAt(j);
            if (i > 57 || i < 48)
            {
                return Integer.parseInt(s);
            }
            int l = j1 * 10 + (i - 48);
            i = l;
            if (i2 < l1)
            {
                j = i2 + 1;
                i = s.charAt(i2);
                if (i > 57 || i < 48)
                {
                    return Integer.parseInt(s);
                }
                int k1 = l * 10 + (i - 48);
                i = k1;
                l = j;
                if (j < l1)
                {
                    i = j;
                    j = k1;
                    int i1;
                    do
                    {
                        i1 = i + 1;
                        i = s.charAt(i);
                        if (i > 57 || i < 48)
                        {
                            return Integer.parseInt(s);
                        }
                        k1 = j * 10 + (i - 48);
                        j = k1;
                        i = i1;
                    } while (i1 < l1);
                    i = k1;
                }
            }
        }
        j = i;
        if (flag)
        {
            return -i;
        }
        if (true) goto _L6; else goto _L5
_L5:
        j = 1;
          goto _L7
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
        return (long)parseInt(ac, i + j, 9) + l * 0x3b9aca00L;
    }

}
