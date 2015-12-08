// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StreamSenseUtils
{

    public StreamSenseUtils()
    {
    }

    public static void filterMap(Map map, Set set)
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (!set.contains(s))
            {
                map.remove(s);
            }
        } while (true);
    }
}
