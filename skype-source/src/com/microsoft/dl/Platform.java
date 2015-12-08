// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl;

import android.content.Context;
import android.os.Environment;
import java.io.File;

public final class Platform
{
    public static class PlatformInfo
    {

        private final File a;
        private final File b = Environment.getExternalStorageDirectory();

        public final File getCacheDir()
        {
            return a;
        }

        public final File getStorageDir()
        {
            return b;
        }

        public final String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [cacheDir=").append(a).append(", storageDir=").append(b).append("]").toString();
        }

        public PlatformInfo(Context context)
        {
            if (context != null)
            {
                context = context.getCacheDir();
            } else
            {
                context = Platform.a();
            }
            a = context;
        }
    }


    private static final File a = new File("/sdcard");
    private static PlatformInfo b;

    private Platform()
    {
    }

    static File a()
    {
        return a;
    }

    public static PlatformInfo getInfo()
    {
        com/microsoft/dl/Platform;
        JVM INSTR monitorenter ;
        PlatformInfo platforminfo = b;
        com/microsoft/dl/Platform;
        JVM INSTR monitorexit ;
        return platforminfo;
        Exception exception;
        exception;
        throw exception;
    }

    public static native long getTimestamp();

    public static void initialize(Context context)
    {
        com/microsoft/dl/Platform;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new PlatformInfo(context);
        }
        com/microsoft/dl/Platform;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

}
