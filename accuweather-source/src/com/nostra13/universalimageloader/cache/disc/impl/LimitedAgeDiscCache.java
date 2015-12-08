// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.disc.impl;

import com.nostra13.universalimageloader.cache.disc.BaseDiscCache;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.core.DefaultConfigurationFactory;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LimitedAgeDiscCache extends BaseDiscCache
{

    private final Map loadingDates;
    private final long maxFileAge;

    public LimitedAgeDiscCache(File file, long l)
    {
        this(file, DefaultConfigurationFactory.createFileNameGenerator(), l);
    }

    public LimitedAgeDiscCache(File file, FileNameGenerator filenamegenerator, long l)
    {
        super(file, filenamegenerator);
        loadingDates = Collections.synchronizedMap(new HashMap());
        maxFileAge = 1000L * l;
    }

    public File get(String s)
    {
        File file = super.get(s);
        if (file.exists())
        {
            s = (Long)loadingDates.get(file);
            boolean flag;
            if (s == null)
            {
                flag = false;
                s = Long.valueOf(file.lastModified());
            } else
            {
                flag = true;
            }
            if (System.currentTimeMillis() - s.longValue() > maxFileAge)
            {
                file.delete();
                loadingDates.remove(file);
            } else
            if (!flag)
            {
                loadingDates.put(file, s);
                return file;
            }
        }
        return file;
    }

    public void put(String s, File file)
    {
        long l = System.currentTimeMillis();
        file.setLastModified(l);
        loadingDates.put(file, Long.valueOf(l));
    }
}
