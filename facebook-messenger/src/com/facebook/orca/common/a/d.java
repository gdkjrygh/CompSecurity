// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.a;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d
    implements Comparator
{

    private static final Pattern a = Pattern.compile("(\\d*)(\\D*)");

    public d()
    {
    }

    int a(int i, int j)
    {
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    int a(String s, int i)
    {
        int j;
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

    public int a(String s, String s1)
    {
        String as[];
        String as1[];
        int i;
        int k;
        int i1;
        as = s.trim().split("\\.");
        as1 = s1.trim().split("\\.");
        i1 = Math.max(as.length, as1.length);
        k = 0;
        i = 0;
_L5:
        if (i != 0 || k >= i1) goto _L2; else goto _L1
_L1:
        Matcher matcher;
        Matcher matcher1;
        int j;
        boolean flag;
        boolean flag1;
        if (k < as.length)
        {
            s = as[k];
        } else
        {
            s = "";
        }
        if (k < as1.length)
        {
            s1 = as1[k];
        } else
        {
            s1 = "";
        }
        matcher = a.matcher(s);
        matcher1 = a.matcher(s1);
        j = i;
_L7:
        flag = matcher.find();
        flag1 = matcher1.find();
        if (flag || flag1) goto _L4; else goto _L3
_L3:
        i = j;
_L6:
        k++;
          goto _L5
_L4:
        int l;
        if (flag)
        {
            i = a(matcher.group(1), 0);
        } else
        {
            i = 0;
        }
        if (flag1)
        {
            j = a(matcher1.group(1), 0);
        } else
        {
            j = 0;
        }
        l = a(i, j);
        j = l;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        if (flag)
        {
            s = matcher.group(2);
        } else
        {
            s = "";
        }
        if (flag1)
        {
            s1 = matcher1.group(2);
        } else
        {
            s1 = "";
        }
        if (s.length() == 0 && s1.length() > 0)
        {
            i = 1;
        } else
        {
            i = l;
            if (s1.length() == 0)
            {
                i = l;
                if (s.length() > 0)
                {
                    i = -1;
                }
            }
        }
        j = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        i = s.compareTo(s1);
_L8:
        j = i;
        if (i == 0) goto _L7; else goto _L6
_L2:
        return i;
        i = j;
          goto _L8
    }

    public int compare(Object obj, Object obj1)
    {
        return a((String)obj, (String)obj1);
    }

}
