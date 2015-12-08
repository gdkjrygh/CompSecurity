// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.util.Random;

public class RandomStringUtils
{

    private static final Random RANDOM = new Random();

    public RandomStringUtils()
    {
    }

    public static String random(int i)
    {
        return random(i, false, false);
    }

    public static String random(int i, int j, int k, boolean flag, boolean flag1)
    {
        return random(i, j, k, flag, flag1, null, RANDOM);
    }

    public static transient String random(int i, int j, int k, boolean flag, boolean flag1, char ac[])
    {
        return random(i, j, k, flag, flag1, ac, RANDOM);
    }

    public static String random(int i, int j, int k, boolean flag, boolean flag1, char ac[], Random random1)
    {
        if (i == 0)
        {
            return "";
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested random string length ").append(i).append(" is less than 0.").toString());
        }
        int l = j;
        int i1 = k;
        if (j == 0)
        {
            l = j;
            i1 = k;
            if (k == 0)
            {
                j = 123;
                k = 32;
                l = k;
                i1 = j;
                if (!flag)
                {
                    l = k;
                    i1 = j;
                    if (!flag1)
                    {
                        l = 0;
                        i1 = 0x7fffffff;
                    }
                }
            }
        }
        char ac1[] = new char[i];
        k = i1 - l;
        do
        {
            j = i - 1;
            if (i != 0)
            {
                char c;
                if (ac == null)
                {
                    c = (char)(random1.nextInt(k) + l);
                } else
                {
                    c = ac[random1.nextInt(k) + l];
                }
                if (flag && Character.isLetter(c) || flag1 && Character.isDigit(c) || !flag && !flag1)
                {
                    if (c >= '\uDC00' && c <= '\uDFFF')
                    {
                        if (j == 0)
                        {
                            i = j + 1;
                        } else
                        {
                            ac1[j] = c;
                            i = j - 1;
                            ac1[i] = (char)(random1.nextInt(128) + 55296);
                        }
                    } else
                    if (c >= '\uD800' && c <= '\uDB7F')
                    {
                        if (j == 0)
                        {
                            i = j + 1;
                        } else
                        {
                            ac1[j] = (char)(random1.nextInt(128) + 56320);
                            i = j - 1;
                            ac1[i] = c;
                        }
                    } else
                    if (c >= '\uDB80' && c <= '\uDBFF')
                    {
                        i = j + 1;
                    } else
                    {
                        ac1[j] = c;
                        i = j;
                    }
                } else
                {
                    i = j + 1;
                }
            } else
            {
                return new String(ac1);
            }
        } while (true);
    }

    public static String random(int i, String s)
    {
        if (s == null)
        {
            return random(i, 0, 0, false, false, null, RANDOM);
        } else
        {
            return random(i, s.toCharArray());
        }
    }

    public static String random(int i, boolean flag, boolean flag1)
    {
        return random(i, 0, 0, flag, flag1);
    }

    public static transient String random(int i, char ac[])
    {
        if (ac == null)
        {
            return random(i, 0, 0, false, false, null, RANDOM);
        } else
        {
            return random(i, 0, ac.length, false, false, ac, RANDOM);
        }
    }

    public static String randomAlphabetic(int i)
    {
        return random(i, true, false);
    }

    public static String randomAlphanumeric(int i)
    {
        return random(i, true, true);
    }

    public static String randomAscii(int i)
    {
        return random(i, 32, 127, false, false);
    }

    public static String randomNumeric(int i)
    {
        return random(i, false, true);
    }

}
