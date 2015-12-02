// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package com.facebook.user.a:
//            m

public class l
{

    private static final String a;
    private static final String b;
    private static final String c;
    private final HashSet d;
    private final HashSet e;
    private final int f;
    private final HashSet g;
    private final HashSet h;
    private final Locale i;
    private final String j;

    public l(String s, String s1, String s2, String s3, Locale locale)
    {
        d = a(s);
        g = a(s1);
        e = a(s2);
        h = a(s3);
        int k;
        if (locale == null)
        {
            locale = Locale.getDefault();
        }
        i = locale;
        j = i.getLanguage().toLowerCase();
        s = e.iterator();
        k = 0;
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            s1 = (String)s.next();
            if (s1.length() > k)
            {
                k = s1.length();
            }
        } while (true);
        f = k;
    }

    private static HashSet a(String s)
    {
        HashSet hashset = new HashSet();
        if (s != null)
        {
            s = s.split(",");
            for (int k = 0; k < s.length; k++)
            {
                hashset.add(s[k].trim().toUpperCase());
            }

        }
        return hashset;
    }

    public int a(int k)
    {
        if (k != 0) goto _L2; else goto _L1
_L1:
        if (!a.equals(j)) goto _L4; else goto _L3
_L3:
        int i1 = 4;
_L6:
        return i1;
_L4:
        if (b.equals(j))
        {
            return 5;
        }
        return !c.equals(j) ? 1 : 3;
_L2:
        i1 = k;
        if (k == 2)
        {
            if (a.equals(j))
            {
                return 4;
            }
            return !b.equals(j) ? 3 : 5;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int a(String as[], String s)
    {
        int k;
        int i1;
        k = 0;
        i1 = 0;
        if (s != null) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        if (m.a(s = new m(s)) == m.b(s))
        {
            continue;
        }
        String s1 = m.c(s)[m.a(s)];
        if (d.contains(s1.toUpperCase()))
        {
            m.d(s);
        }
        int j1 = m.a(s);
        do
        {
            i1 = k;
            if (j1 >= m.b(s))
            {
                continue;
            }
            as[k] = m.c(s)[j1];
            j1++;
            k++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        a = Locale.JAPANESE.getLanguage().toLowerCase();
        b = Locale.KOREAN.getLanguage().toLowerCase();
        c = Locale.CHINESE.getLanguage().toLowerCase();
    }
}
