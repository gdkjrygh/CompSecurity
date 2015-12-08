// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.disc.impl;

import com.nostra13.universalimageloader.cache.disc.BaseDiscCache;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.core.DefaultConfigurationFactory;
import java.io.File;

public class UnlimitedDiscCache extends BaseDiscCache
{

    public UnlimitedDiscCache(File file)
    {
        this(file, DefaultConfigurationFactory.createFileNameGenerator());
    }

    public UnlimitedDiscCache(File file, FileNameGenerator filenamegenerator)
    {
        super(file, filenamegenerator);
    }

    public void put(String s, File file)
    {
    }
}
