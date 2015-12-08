// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.util.regex.Pattern;

public class StringUtils
{

    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("(?: |\\u00A0|\\s|[\\s&&[^ ]])\\s*");

    public static int getLevenshteinDistance(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null || charsequence1 == null)
        {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int k = charsequence.length();
        int j = charsequence1.length();
        if (k == 0)
        {
            return j;
        }
        if (j == 0)
        {
            return k;
        }
        CharSequence charsequence2;
        CharSequence charsequence3;
        int i;
        if (k > j)
        {
            i = charsequence.length();
            charsequence3 = charsequence1;
            charsequence2 = charsequence;
        } else
        {
            i = j;
            j = k;
            charsequence2 = charsequence1;
            charsequence3 = charsequence;
        }
        charsequence1 = new int[j + 1];
        charsequence = new int[j + 1];
        for (k = 0; k <= j; k++)
        {
            charsequence1[k] = k;
        }

        k = 1;
        do
        {
            CharSequence charsequence4 = charsequence1;
            if (k <= i)
            {
                char c = charsequence2.charAt(k - 1);
                charsequence[0] = k;
                int l = 1;
                while (l <= j) 
                {
                    int i1;
                    if (charsequence3.charAt(l - 1) == c)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 1;
                    }
                    charsequence[l] = Math.min(Math.min(charsequence[l - 1] + 1, charsequence4[l] + 1), i1 + charsequence4[l - 1]);
                    l++;
                }
                k++;
                charsequence1 = charsequence;
                charsequence = charsequence4;
            } else
            {
                return charsequence4[j];
            }
        } while (true);
    }

    public static boolean isBlank(CharSequence charsequence)
    {
        boolean flag1 = false;
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        int j = charsequence.length();
        if (j != 0) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        return flag;
_L3:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                flag = flag1;
                if (!Character.isWhitespace(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
        return true;
    }

    public static boolean isEmpty(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static boolean isNumeric(CharSequence charsequence)
    {
        if (!isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (!Character.isDigit(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static String join(Object aobj[], String s)
    {
        if (aobj == null)
        {
            return null;
        } else
        {
            return join(aobj, s, 0, aobj.length);
        }
    }

    public static String join(Object aobj[], String s, int i, int j)
    {
        if (aobj == null)
        {
            return null;
        }
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        s = new StringBuilder(k << 4);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                s.append(s1);
            }
            if (aobj[l] != null)
            {
                s.append(aobj[l]);
            }
        }

        return s.toString();
    }

    public static int length(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return 0;
        } else
        {
            return charsequence.length();
        }
    }

    public static String repeat(char c, int i)
    {
        char ac[] = new char[i];
        for (i--; i >= 0; i--)
        {
            ac[i] = c;
        }

        return new String(ac);
    }

    public static String substring(String s, int i, int j)
    {
        boolean flag = false;
        if (s == null)
        {
            return null;
        }
        int k;
        if (j < 0)
        {
            k = s.length() + j;
        } else
        {
            k = j;
        }
        j = i;
        if (i < 0)
        {
            j = i + s.length();
        }
        i = k;
        if (k > s.length())
        {
            i = s.length();
        }
        if (j > i)
        {
            return "";
        }
        k = j;
        if (j < 0)
        {
            k = 0;
        }
        if (i < 0)
        {
            i = ((flag) ? 1 : 0);
        }
        return s.substring(k, i);
    }

}
