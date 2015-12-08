// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;


public final class f
{

    public static final String a = "2.2250738585072012e-308";
    static final long b = 0x3b9aca00L;
    static final String c = String.valueOf(0x8000000000000000L).substring(1);
    static final String d = String.valueOf(0x7fffffffffffffffL);

    public f()
    {
    }

    public static double a(String s, double d1)
    {
        if (s != null)
        {
            if ((s = s.trim()).length() != 0)
            {
                double d2;
                try
                {
                    d2 = c(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return d1;
                }
                return d2;
            }
        }
        return d1;
    }

    public static int a(String s)
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

    public static int a(String s, int i)
    {
        char c1 = '\0';
        if (s != null) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        int j;
        s = s.trim();
        j = s.length();
        if (j == 0) goto _L1; else goto _L3
_L3:
        if (j >= 0) goto _L5; else goto _L4
_L4:
        int k = s.charAt(0);
        if (k != 43) goto _L7; else goto _L6
_L6:
        s = s.substring(1);
        k = s.length();
        j = c1;
_L9:
        if (j < k)
        {
            c1 = s.charAt(j);
            if (c1 > '9' || c1 < '0')
            {
                double d1;
                try
                {
                    d1 = c(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return i;
                }
                return (int)d1;
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
            c1 = '\001';
            k = j;
            j = c1;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        k = j;
        j = c1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static int a(char ac[], int i, int j)
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

    public static long a(String s, long l)
    {
        char c1 = '\0';
        if (s != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int i;
        s = s.trim();
        i = s.length();
        if (i == 0) goto _L1; else goto _L3
_L3:
        if (i >= 0) goto _L5; else goto _L4
_L4:
        int j = s.charAt(0);
        if (j != 43) goto _L7; else goto _L6
_L6:
        s = s.substring(1);
        j = s.length();
        i = c1;
_L9:
        if (i < j)
        {
            c1 = s.charAt(i);
            if (c1 > '9' || c1 < '0')
            {
                double d1;
                long l1;
                try
                {
                    d1 = c(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return l;
                }
                return (long)d1;
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
            c1 = '\001';
            j = i;
            i = c1;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        j = i;
        i = c1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static boolean a(String s, boolean flag)
    {
        String s1;
        int i;
        int j;
        if (flag)
        {
            s1 = c;
        } else
        {
            s1 = d;
        }
        j = s1.length();
        i = s.length();
        if (i >= j)
        {
            if (i > j)
            {
                return false;
            }
            i = 0;
            while (i < j) 
            {
                int k = s.charAt(i) - s1.charAt(i);
                if (k != 0)
                {
                    if (k < 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    return flag;
                }
                i++;
            }
        }
        return true;
    }

    public static boolean a(char ac[], int i, int j, boolean flag)
    {
        String s;
        int k;
        if (flag)
        {
            s = c;
        } else
        {
            s = d;
        }
        k = s.length();
        if (j >= k)
        {
            if (j > k)
            {
                return false;
            }
            j = 0;
            while (j < k) 
            {
                int l = ac[i + j] - s.charAt(j);
                if (l != 0)
                {
                    if (l < 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    return flag;
                }
                j++;
            }
        }
        return true;
    }

    public static long b(String s)
    {
        if (s.length() <= 9)
        {
            return (long)a(s);
        } else
        {
            return Long.parseLong(s);
        }
    }

    public static long b(char ac[], int i, int j)
    {
        j -= 9;
        long l = a(ac, i, j);
        return (long)a(ac, j + i, 9) + l * 0x3b9aca00L;
    }

    public static double c(String s)
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

}
