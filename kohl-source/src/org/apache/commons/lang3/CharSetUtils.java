// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;


// Referenced classes of package org.apache.commons.lang3:
//            StringUtils, CharSet

public class CharSetUtils
{

    public CharSetUtils()
    {
    }

    public static transient int count(String s, String as[])
    {
        if (!StringUtils.isEmpty(s) && !deepEmpty(as)) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        as = CharSet.getInstance(as);
        int i = 0;
        s = s.toCharArray();
        int l = s.length;
        int j = 0;
        do
        {
            k = i;
            if (j >= l)
            {
                continue;
            }
            k = i;
            if (as.contains(s[j]))
            {
                k = i + 1;
            }
            j++;
            i = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean deepEmpty(String as[])
    {
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                if (StringUtils.isNotEmpty(as[i]))
                {
                    return false;
                }
            }

        }
        return true;
    }

    public static transient String delete(String s, String as[])
    {
        if (StringUtils.isEmpty(s) || deepEmpty(as))
        {
            return s;
        } else
        {
            return modify(s, as, false);
        }
    }

    public static transient String keep(String s, String as[])
    {
        if (s == null)
        {
            return null;
        }
        if (s.length() == 0 || deepEmpty(as))
        {
            return "";
        } else
        {
            return modify(s, as, true);
        }
    }

    private static String modify(String s, String as[], boolean flag)
    {
        as = CharSet.getInstance(as);
        StringBuilder stringbuilder = new StringBuilder(s.length());
        s = s.toCharArray();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            if (as.contains(s[i]) == flag)
            {
                stringbuilder.append(s[i]);
            }
        }

        return stringbuilder.toString();
    }

    public static transient String squeeze(String s, String as[])
    {
        if (StringUtils.isEmpty(s) || deepEmpty(as))
        {
            return s;
        }
        as = CharSet.getInstance(as);
        StringBuilder stringbuilder = new StringBuilder(s.length());
        s = s.toCharArray();
        int j = s.length;
        char c1 = ' ';
        int i = 0;
        while (i < j) 
        {
            char c = s[i];
            if (c != c1 || i == 0 || !as.contains(c))
            {
                stringbuilder.append(c);
                c1 = c;
            }
            i++;
        }
        return stringbuilder.toString();
    }
}
