// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.io;

import c.ac;
import c.ad;
import c.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.io:
//            FileSystem

final class 
    implements FileSystem
{

    public ac appendingSink(File file)
    {
        ac ac;
        try
        {
            ac = r.c(file);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            file.getParentFile().mkdirs();
            return r.c(file);
        }
        return ac;
    }

    public void delete(File file)
    {
        if (!file.delete() && file.exists())
        {
            throw new IOException((new StringBuilder()).append("failed to delete ").append(file).toString());
        } else
        {
            return;
        }
    }

    public void deleteContents(File file)
    {
        File afile[] = file.listFiles();
        if (afile == null)
        {
            throw new IOException((new StringBuilder()).append("not a readable directory: ").append(file).toString());
        }
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            file = afile[i];
            if (file.isDirectory())
            {
                deleteContents(file);
            }
            if (!file.delete())
            {
                throw new IOException((new StringBuilder()).append("failed to delete ").append(file).toString());
            }
        }

    }

    public boolean exists(File file)
    {
        return file.exists();
    }

    public void rename(File file, File file1)
    {
        delete(file1);
        if (!file.renameTo(file1))
        {
            throw new IOException((new StringBuilder()).append("failed to rename ").append(file).append(" to ").append(file1).toString());
        } else
        {
            return;
        }
    }

    public ac sink(File file)
    {
        ac ac;
        try
        {
            ac = r.b(file);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            file.getParentFile().mkdirs();
            return r.b(file);
        }
        return ac;
    }

    public long size(File file)
    {
        return file.length();
    }

    public ad source(File file)
    {
        return r.a(file);
    }

    ()
    {
    }
}
