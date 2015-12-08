// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FiletimeComparator
    implements Comparator
{

    private final Map filetimes = new HashMap();
    private final boolean oldestFirst;

    public FiletimeComparator(boolean flag)
    {
        oldestFirst = flag;
    }

    private static Long getTimestamp(File file, Map map)
    {
        Long long2 = (Long)map.get(file);
        Long long1 = long2;
        if (long2 == null)
        {
            long l = file.lastModified();
            map.put(file, Long.valueOf(l));
            long1 = Long.valueOf(l);
        }
        return long1;
    }

    public int compare(File file, File file1)
    {
        if (oldestFirst)
        {
            return getTimestamp(file, filetimes).compareTo(getTimestamp(file1, filetimes));
        } else
        {
            return getTimestamp(file1, filetimes).compareTo(getTimestamp(file, filetimes));
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((File)obj, (File)obj1);
    }
}
