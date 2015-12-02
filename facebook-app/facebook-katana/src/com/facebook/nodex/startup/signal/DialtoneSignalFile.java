// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.signal;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;

public class DialtoneSignalFile
{

    public static final String a = com/facebook/nodex/startup/signal/DialtoneSignalFile.getSimpleName();
    protected Boolean b;
    private final File c;

    public DialtoneSignalFile(Context context)
    {
        b = null;
        c = new File(context.getCacheDir(), "fb_dialtone_signal");
    }

    private void d()
    {
        b = Boolean.valueOf((new File(c, "enable_dialtone_mode")).exists());
    }

    private boolean e()
    {
        if (c.exists())
        {
            return c.isDirectory() && c.canRead() && c.canWrite();
        } else
        {
            return c.mkdirs();
        }
    }

    public boolean a()
    {
        boolean flag = e();
        if (!flag)
        {
            d();
            return false;
        }
        File file = new File(c, "enable_dialtone_mode");
        file.createNewFile();
        (new StringBuilder("Dialtone signal file successfully created at ")).append(file);
        d();
        return true;
        Object obj;
        obj;
        Log.w(a, "Dialtone file could not be created", ((Throwable) (obj)));
        d();
        return false;
        obj;
        d();
        throw obj;
    }

    public boolean b()
    {
        boolean flag1 = true;
        boolean flag = true;
        File afile[] = c.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            int i = 0;
            do
            {
                flag1 = flag;
                if (i >= j)
                {
                    break;
                }
                if (!afile[i].delete())
                {
                    flag = false;
                }
                i++;
            } while (true);
        }
        d();
        return flag1;
    }

    public boolean c()
    {
        if (b == null)
        {
            d();
        }
        return b.booleanValue();
    }

}
