// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.c;

import java.util.ArrayList;
import java.util.List;

public class a
{

    private static final String a = "AppVersionUtils";
    private static final String b = " => ";

    public a()
    {
    }

    public static String a(String s, com.fitbit.config.a a1)
    {
        if (a1 == null)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (s != null)
        {
            stringbuilder.append(s);
            stringbuilder.append(" => ");
        }
        stringbuilder.append(a1);
        return stringbuilder.toString();
    }

    public static List a(String s)
    {
        Object obj;
        int i;
        obj = null;
        i = 0;
        if (s != null) goto _L2; else goto _L1
_L1:
        s = obj;
_L4:
        return s;
_L2:
        String as[] = s.split(" => ");
        if (as == null || as.length == 0)
        {
            com.fitbit.e.a.a("AppVersionUtils", "Unable to parse versions", new Object[0]);
            return null;
        }
        ArrayList arraylist = new ArrayList(as.length);
        int j = as.length;
        do
        {
            s = arraylist;
            if (i >= j)
            {
                continue;
            }
            s = com.fitbit.config.a.a(as[i]);
            if (s != null)
            {
                arraylist.add(s);
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
