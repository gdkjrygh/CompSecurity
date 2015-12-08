// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.buck.android.support.exopackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import cF;
import cG;
import cH;
import cI;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class ExopackageApplication extends Application
{

    private final String a;
    private final int b;
    private cF c;

    protected ExopackageApplication(int i)
    {
        this(cG.getName(), i);
    }

    public ExopackageApplication(String s, int i)
    {
        a = s;
        b = i;
    }

    private cF b()
    {
        boolean flag1 = true;
        int i;
        if ((b & 1) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            File file = new File((new StringBuilder("/data/local/tmp/exopackage/")).append(getPackageName()).append("/secondary-dex").toString());
            ArrayList arraylist = new ArrayList();
            HashSet hashset = new HashSet();
            File afile1[] = file.listFiles();
            if (afile1 != null)
            {
                int k = afile1.length;
                i = 0;
                while (i < k) 
                {
                    File file2 = afile1[i];
                    if (!file2.getName().equals("metadata.txt"))
                    {
                        if (!file2.getName().endsWith(".dex.jar"))
                        {
                            (new StringBuilder("Skipping unexpected file in exopackage directory: ")).append(file2.getName());
                        } else
                        {
                            arraylist.add(file2);
                            hashset.add(file2.getName().replaceFirst("\\.jar$", ".dex"));
                        }
                    }
                    i++;
                }
            }
            afile1 = getDir("exopackage_dex_opt", 0);
            cI.a(getClassLoader(), afile1, arraylist);
            File afile[] = afile1.listFiles();
            if (afile != null)
            {
                int l = afile.length;
                for (int j = 0; j < l; j++)
                {
                    File file1 = afile[j];
                    if (!hashset.contains(file1.getName()) && !file1.delete())
                    {
                        (new StringBuilder("Failed to delete stale odex: ")).append(file1.getAbsolutePath());
                    }
                }

            }
        }
        cF cf;
        boolean flag;
        if ((b & 2) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            cH.a(this);
        }
        try
        {
            cf = (cF)Class.forName(a).getConstructor(new Class[] {
                android/app/Application
            }).newInstance(new Object[] {
                this
            });
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        return cf;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
    {
    }

    protected final void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        a();
        c();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (c != null)
        {
            c.onConfigurationChanged(configuration);
        }
    }

    public final void onCreate()
    {
        super.onCreate();
        c();
        c.onCreate();
    }

    public final void onLowMemory()
    {
        super.onLowMemory();
        if (c != null)
        {
            c.onLowMemory();
        }
    }

    public final void onTerminate()
    {
        super.onTerminate();
        if (c != null)
        {
            c.onTerminate();
        }
    }

    public final void onTrimMemory(int i)
    {
        super.onTrimMemory(i);
        if (c != null)
        {
            c.onTrimMemory(i);
        }
    }
}
