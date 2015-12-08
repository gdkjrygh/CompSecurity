// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.disc.impl;

import com.nostra13.universalimageloader.cache.disc.LimitedDiscCache;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.core.DefaultConfigurationFactory;
import com.nostra13.universalimageloader.utils.L;
import java.io.File;

public class TotalSizeLimitedDiscCache extends LimitedDiscCache
{

    private static final int MIN_NORMAL_CACHE_SIZE = 0x200000;
    private static final int MIN_NORMAL_CACHE_SIZE_IN_MB = 2;

    public TotalSizeLimitedDiscCache(File file, int i)
    {
        this(file, DefaultConfigurationFactory.createFileNameGenerator(), i);
    }

    public TotalSizeLimitedDiscCache(File file, FileNameGenerator filenamegenerator, int i)
    {
        super(file, filenamegenerator, i);
        if (i < 0x200000)
        {
            L.w("You set too small disc cache size (less than %1$d Mb)", new Object[] {
                Integer.valueOf(2)
            });
        }
    }

    protected int getSize(File file)
    {
        return (int)file.length();
    }
}
