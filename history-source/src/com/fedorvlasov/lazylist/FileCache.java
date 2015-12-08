// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fedorvlasov.lazylist;

import android.content.Context;
import android.os.Environment;
import java.io.File;

public class FileCache
{

    private File cacheDir;

    public FileCache(Context context)
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            cacheDir = new File(Environment.getExternalStorageDirectory(), "LazyList");
        } else
        {
            cacheDir = context.getCacheDir();
        }
        if (!cacheDir.exists())
        {
            cacheDir.mkdirs();
        }
    }

    public void clear()
    {
        File afile[] = cacheDir.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            int i = 0;
            while (i < j) 
            {
                afile[i].delete();
                i++;
            }
        }
    }

    public File getFile(String s)
    {
        int i = s.hashCode();
        return new File(cacheDir, String.valueOf(i));
    }
}
