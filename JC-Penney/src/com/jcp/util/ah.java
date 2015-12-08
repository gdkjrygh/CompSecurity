// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ah
{

    public static boolean a(List list)
    {
        return list == null || list.isEmpty();
    }

    public static boolean a(String as[])
    {
        return as == null || as.length == 0;
    }

    public static List b(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        HashSet hashset = new HashSet(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (!hashset.contains(s))
            {
                arraylist.add(s);
                hashset.add(s);
            }
        } while (true);
        return arraylist;
    }
}
