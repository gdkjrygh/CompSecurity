// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.disc;

import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.core.DefaultConfigurationFactory;
import java.io.File;

// Referenced classes of package com.nostra13.universalimageloader.cache.disc:
//            DiscCacheAware

public abstract class BaseDiscCache
    implements DiscCacheAware
{

    private static final String ERROR_ARG_NULL = "\"%s\" argument must be not null";
    protected File cacheDir;
    private FileNameGenerator fileNameGenerator;

    public BaseDiscCache(File file)
    {
        this(file, DefaultConfigurationFactory.createFileNameGenerator());
    }

    public BaseDiscCache(File file, FileNameGenerator filenamegenerator)
    {
        if (file == null)
        {
            throw new IllegalArgumentException(String.format("\"%s\" argument must be not null", new Object[] {
                "cacheDir"
            }));
        }
        if (filenamegenerator == null)
        {
            throw new IllegalArgumentException(String.format("\"%s\" argument must be not null", new Object[] {
                "fileNameGenerator"
            }));
        } else
        {
            cacheDir = file;
            fileNameGenerator = filenamegenerator;
            return;
        }
    }

    public void clear()
    {
        File afile[] = cacheDir.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                afile[i].delete();
            }

        }
    }

    public File get(String s)
    {
        s = fileNameGenerator.generate(s);
        return new File(cacheDir, s);
    }
}
