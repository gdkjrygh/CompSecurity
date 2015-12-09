// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import java.util.Iterator;
import java.util.Set;

public class t
{

    public static String a(Set set, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (set = set.iterator(); set.hasNext(); stringbuilder.append(s))
        {
            stringbuilder.append((String)set.next());
        }

        if (stringbuilder.length() > 0)
        {
            return stringbuilder.substring(0, stringbuilder.length() - 1);
        } else
        {
            return "";
        }
    }
}
