// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.common;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.io.File;

public class PlatformInfo
{

    static final boolean $assertionsDisabled;
    private static final String TAG = "PlatformInfo";
    private static PlatformInfo instance;
    private static final int screenHeightDp;
    private static final int screenHeightPx;
    private static final int screenWidthDp;
    private static final int screenWidthPx;
    private final File cacheDir;

    private PlatformInfo(Context context)
    {
        initializeNaive(screenWidthPx, screenHeightPx, screenWidthDp, screenHeightDp);
        cacheDir = context.getCacheDir();
    }

    public static PlatformInfo getInstance()
    {
        com/skype/android/video/common/PlatformInfo;
        JVM INSTR monitorenter ;
        if (!$assertionsDisabled && instance == null)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        com/skype/android/video/common/PlatformInfo;
        JVM INSTR monitorexit ;
        throw exception;
        PlatformInfo platforminfo = instance;
        com/skype/android/video/common/PlatformInfo;
        JVM INSTR monitorexit ;
        return platforminfo;
    }

    public static void initialize(Context context)
    {
        com/skype/android/video/common/PlatformInfo;
        JVM INSTR monitorenter ;
        if (!$assertionsDisabled && instance != null)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_29;
        context;
        com/skype/android/video/common/PlatformInfo;
        JVM INSTR monitorexit ;
        throw context;
        instance = new PlatformInfo(context);
        com/skype/android/video/common/PlatformInfo;
        JVM INSTR monitorexit ;
    }

    private static native void initializeNaive(int i, int j, int k, int l);

    public File getCacheFile()
    {
        return cacheDir;
    }

    public int getScreenHeightDp()
    {
        return screenHeightDp;
    }

    public int getScreenHeightPx()
    {
        return screenHeightPx;
    }

    public int getScreenWidthDp()
    {
        return screenWidthDp;
    }

    public int getScreenWidthPx()
    {
        return screenWidthPx;
    }

    public final String toString()
    {
        return (new StringBuilder("Info, screenWidthPx=")).append(screenWidthPx).append(", screenHeightPx=").append(screenHeightPx).append(", screenWidthDp=").append(screenWidthDp).append(", screenHeightDp=").append(screenHeightDp).append("]").toString();
    }

    static 
    {
        int i;
        int j;
        int k;
        boolean flag;
        if (!com/skype/android/video/common/PlatformInfo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        i = Resources.getSystem().getDisplayMetrics().widthPixels;
        j = Resources.getSystem().getDisplayMetrics().heightPixels;
        if (i > j)
        {
            k = i;
        } else
        {
            k = j;
        }
        screenWidthPx = k;
        if (i <= j)
        {
            j = i;
        }
        screenHeightPx = j;
        screenWidthDp = Resources.getSystem().getConfiguration().screenWidthDp;
        screenHeightDp = Resources.getSystem().getConfiguration().screenHeightDp;
    }
}
