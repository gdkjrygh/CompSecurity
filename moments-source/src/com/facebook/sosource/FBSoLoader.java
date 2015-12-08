// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.sosource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import com.facebook.soloader.ApkSoSource;
import com.facebook.soloader.ExoSoSource;
import com.facebook.soloader.SoLoader;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.facebook.sosource:
//            DirectorySoSourceWithAssets

public class FBSoLoader
{

    public FBSoLoader()
    {
    }

    public static void a(Context context, boolean flag)
    {
        com/facebook/sosource/FBSoLoader;
        JVM INSTR monitorenter ;
        android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.allowThreadDiskWrites();
        if (context != null) goto _L2; else goto _L1
_L1:
        SoLoader.a(context, flag);
        StrictMode.setThreadPolicy(threadpolicy);
_L4:
        com/facebook/sosource/FBSoLoader;
        JVM INSTR monitorexit ;
        return;
_L2:
        ApplicationInfo applicationinfo = context.getApplicationInfo();
        boolean flag1;
        if ((applicationinfo.flags & 1) != 0 && (applicationinfo.flags & 0x80) == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        SoLoader.a(context, new ExoSoSource(context));
_L5:
        StrictMode.setThreadPolicy(threadpolicy);
        if (true) goto _L4; else goto _L3
        context;
        throw context;
_L3:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        SoLoader.a(context, new ApkSoSource(context));
          goto _L5
        context;
        throw new RuntimeException(context);
        context;
        StrictMode.setThreadPolicy(threadpolicy);
        throw context;
        DirectorySoSourceWithAssets directorysosourcewithassets = new DirectorySoSourceWithAssets(context, new File(context.getApplicationInfo().nativeLibraryDir));
        SoLoader.a(context, directorysosourcewithassets);
        directorysosourcewithassets.a();
          goto _L5
    }

    public static void a(String s)
    {
        com/facebook/sosource/FBSoLoader;
        JVM INSTR monitorenter ;
        SoLoader.a(s);
        com/facebook/sosource/FBSoLoader;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
