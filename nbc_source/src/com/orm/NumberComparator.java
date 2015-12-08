// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import java.util.Comparator;

public class NumberComparator
    implements Comparator
{

    public NumberComparator()
    {
    }

    static char charAt(String s, int i)
    {
        if (i >= s.length())
        {
            return '\0';
        } else
        {
            return s.charAt(i);
        }
    }

    public int compare(Object obj, Object obj1)
    {
        obj = obj.toString();
        obj1 = obj1.toString();
        int j = 0;
        int i = 0;
        do
        {
            boolean flag = false;
            int l = 0;
            char c = charAt(((String) (obj)), j);
            char c2 = charAt(((String) (obj1)), i);
            int k = j;
            char c1;
            int i1;
            do
            {
                if (!Character.isSpaceChar(c))
                {
                    c1 = c2;
                    j = i;
                    i1 = ((flag) ? 1 : 0);
                    if (c != '0')
                    {
                        break;
                    }
                }
                if (c == '0')
                {
                    j = l + 1;
                } else
                {
                    j = 0;
                }
                k++;
                c = charAt(((String) (obj)), k);
                l = j;
            } while (true);
            while (Character.isSpaceChar(c1) || c1 == '0') 
            {
                if (c1 == '0')
                {
                    i = i1 + 1;
                } else
                {
                    i = 0;
                }
                j++;
                c1 = charAt(((String) (obj1)), j);
                i1 = i;
            }
            if (Character.isDigit(c) && Character.isDigit(c1))
            {
                i = compareRight(((String) (obj)).substring(k), ((String) (obj1)).substring(j));
                if (i != 0)
                {
                    return i;
                }
            }
            if (c == 0 && c1 == 0)
            {
                return l - i1;
            }
            if (c < c1)
            {
                return -1;
            }
            if (c > c1)
            {
                return 1;
            }
            i = k + 1;
            k = j + 1;
            j = i;
            i = k;
        } while (true);
    }

    int compareRight(String s, String s1)
    {
        int j;
        int k;
        int l;
        l = 0;
        k = 0;
        j = 0;
_L2:
        char c;
        char c1;
        int i;
        c = charAt(s, k);
        c1 = charAt(s1, j);
        if (!Character.isDigit(c) && !Character.isDigit(c1))
        {
            return l;
        }
        if (!Character.isDigit(c))
        {
            return -1;
        }
        if (!Character.isDigit(c1))
        {
            return 1;
        }
        if (c >= c1)
        {
            break; /* Loop/switch isn't completed */
        }
        i = l;
        if (l == 0)
        {
            i = -1;
        }
_L3:
        k++;
        j++;
        l = i;
        if (true) goto _L2; else goto _L1
_L1:
        if (c > c1)
        {
            i = l;
            if (l == 0)
            {
                i = 1;
            }
        } else
        {
            i = l;
            if (c == 0)
            {
                i = l;
                if (c1 == 0)
                {
                    return l;
                }
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }
}
