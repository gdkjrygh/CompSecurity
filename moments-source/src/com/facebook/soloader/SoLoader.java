// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.facebook.soloader:
//            DirectorySoSource, SoSource, ExoSoSource, ApkSoSource, 
//            SysUtil

public class SoLoader
{

    private static SoSource a[] = null;
    private static final Set b = new HashSet();
    private static android.os.StrictMode.ThreadPolicy c = null;

    public SoLoader()
    {
    }

    private static void a()
    {
        if (a == null)
        {
            throw new RuntimeException("SoLoader.init() not yet called");
        } else
        {
            return;
        }
    }

    public static void a(Context context, SoSource sosource)
    {
        int i = 0;
        com/facebook/soloader/SoLoader;
        JVM INSTR monitorenter ;
        String s1;
        ArrayList arraylist;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        arraylist = new ArrayList();
        s1 = System.getenv("LD_LIBRARY_PATH");
        String s;
        s = s1;
        if (s1 == null)
        {
            s = "/vendor/lib:/system/lib";
        }
        String as[] = s.split(":");
_L1:
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        arraylist.add(new DirectorySoSource(new File(as[i]), 2));
        i++;
          goto _L1
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        arraylist.add(0, sosource);
        a = (SoSource[])arraylist.toArray(new SoSource[arraylist.size()]);
        com/facebook/soloader/SoLoader;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void a(Context context, boolean flag)
    {
        com/facebook/soloader/SoLoader;
        JVM INSTR monitorenter ;
        android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.allowThreadDiskWrites();
        b(context, flag);
        StrictMode.setThreadPolicy(threadpolicy);
        com/facebook/soloader/SoLoader;
        JVM INSTR monitorexit ;
        return;
        context;
        StrictMode.setThreadPolicy(threadpolicy);
        throw context;
        context;
        com/facebook/soloader/SoLoader;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void a(String s)
    {
        com/facebook/soloader/SoLoader;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) goto _L4; else goto _L3
_L3:
        a();
_L2:
        a(System.mapLibraryName(s), 0);
_L6:
        com/facebook/soloader/SoLoader;
        JVM INSTR monitorexit ;
        return;
_L4:
        System.loadLibrary(s);
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
        s;
        throw new RuntimeException(s);
    }

    public static void a(String s, int i)
    {
        int j;
        if (b.contains(s))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        int k;
        if (c == null)
        {
            c = StrictMode.allowThreadDiskReads();
            flag = true;
        } else
        {
            flag = false;
        }
        k = 0;
        if (j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k >= a.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j = a[k].a(s, i);
        k++;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_35;
_L3:
        if (flag)
        {
            StrictMode.setThreadPolicy(c);
            c = null;
            i = j;
        } else
        {
            i = j;
        }
_L6:
        if (i == 0)
        {
            throw new UnsatisfiedLinkError((new StringBuilder("couldn't find DSO to load: ")).append(s).toString());
        }
        break MISSING_BLOCK_LABEL_135;
        s;
        if (flag)
        {
            StrictMode.setThreadPolicy(c);
            c = null;
        }
        throw s;
        if (i == 1)
        {
            b.add(s);
        }
        return;
_L2:
        i = j;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static File b(String s)
    {
        a();
        try
        {
            s = c(System.mapLibraryName(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    private static void b(Context context, boolean flag)
    {
        boolean flag1 = true;
        if (a != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        String s1 = System.getenv("LD_LIBRARY_PATH");
        String s = s1;
        if (s1 == null)
        {
            s = "/vendor/lib:/system/lib";
        }
        String as[] = s.split(":");
        for (int i = 0; i < as.length; i++)
        {
            arraylist.add(new DirectorySoSource(new File(as[i]), 2));
        }

        if (context == null) goto _L4; else goto _L3
_L3:
        ApplicationInfo applicationinfo;
        int j;
        applicationinfo = context.getApplicationInfo();
        if ((applicationinfo.flags & 1) != 0 && (applicationinfo.flags & 0x80) == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        try
        {
            arraylist.add(0, new ExoSoSource(context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
_L4:
        a = (SoSource[])arraylist.toArray(new SoSource[arraylist.size()]);
_L2:
        return;
_L6:
        if (!j)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        arraylist.add(0, new ApkSoSource(context));
          goto _L4
        SysUtil.b(SysUtil.b(context));
        if (android.os.Build.VERSION.SDK_INT <= 17)
        {
            j = ((flag1) ? 1 : 0);
        } else
        {
            j = 0;
        }
        arraylist.add(0, new DirectorySoSource(new File(applicationinfo.nativeLibraryDir), j));
          goto _L4
    }

    private static File c(String s)
    {
        for (int i = 0; i < a.length; i++)
        {
            File file = a[i].a(s);
            if (file != null)
            {
                return file;
            }
        }

        throw new FileNotFoundException(s);
    }

}
