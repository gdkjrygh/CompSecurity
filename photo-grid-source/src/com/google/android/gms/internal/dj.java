// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            dg

final class dj extends dg
{

    dj()
    {
    }

    private static String a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            int i = 0;
            int k = s.length();
            int j;
            do
            {
                j = k;
                if (i >= s.length())
                {
                    break;
                }
                j = k;
                if (s.charAt(i) != ',')
                {
                    break;
                }
                i++;
            } while (true);
            for (; j > 0 && s.charAt(j - 1) == ','; j--) { }
            if (i != 0 || j != s.length())
            {
                return s.substring(i, j);
            }
        }
        return s;
    }

    public final String a(String s, String s1)
    {
        s = a(s);
        s1 = a(s1);
        if (TextUtils.isEmpty(s))
        {
            return s1;
        }
        if (TextUtils.isEmpty(s1))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append(",").append(s1).toString();
        }
    }
}
