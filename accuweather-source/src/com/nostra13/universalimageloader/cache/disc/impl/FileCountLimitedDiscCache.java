// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.disc.impl;

import com.nostra13.universalimageloader.cache.disc.LimitedDiscCache;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.core.DefaultConfigurationFactory;
import java.io.File;

public class FileCountLimitedDiscCache extends LimitedDiscCache
{

    public FileCountLimitedDiscCache(File file, int i)
    {
        this(file, DefaultConfigurationFactory.createFileNameGenerator(), i);
    }

    public FileCountLimitedDiscCache(File file, FileNameGenerator filenamegenerator, int i)
    {
        super(file, filenamegenerator, i);
    }

    protected int getSize(File file)
    {
        return 1;
    }
}
