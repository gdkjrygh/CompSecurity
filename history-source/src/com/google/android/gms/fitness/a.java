// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
{

    public static String bt(String s)
    {
        String s1;
        if (s.equals("https://www.googleapis.com/auth/fitness.activity.read"))
        {
            s1 = "https://www.googleapis.com/auth/fitness.activity.write";
        } else
        {
            if (s.equals("https://www.googleapis.com/auth/fitness.location.read"))
            {
                return "https://www.googleapis.com/auth/fitness.location.write";
            }
            s1 = s;
            if (s.equals("https://www.googleapis.com/auth/fitness.body.read"))
            {
                return "https://www.googleapis.com/auth/fitness.body.write";
            }
        }
        return s1;
    }

    public static String[] e(List list)
    {
        HashSet hashset = new HashSet(list.size());
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = bt(s);
            if (s1.equals(s) || !list.contains(s1))
            {
                hashset.add(s);
            }
        } while (true);
        return (String[])hashset.toArray(new String[hashset.size()]);
    }
}
