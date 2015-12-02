// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support;

import android.content.Context;
import java.io.File;

public class NativeManager
{

    public static String a = null;
    public static String b = null;

    public static void a(Context context)
    {
        context = context.getFilesDir();
        if (context != null)
        {
            context = context.getParentFile();
            if (context != null)
            {
                context = new StringBuilder(context.getAbsolutePath());
                context.append("/lib/lib");
                context.append("mobilesafe360-jni-1.4");
                context.append(".so");
                context = new File(context.toString());
                if (context.exists())
                {
                    Runtime.getRuntime().load(context.getAbsolutePath());
                    initJniPara();
                    a = getInt(System.currentTimeMillis());
                    b = getCode(System.currentTimeMillis());
                    return;
                }
            }
        }
        System.loadLibrary("mobilesafe360-jni-1.4");
        initJniPara();
        a = getInt(System.currentTimeMillis());
        b = getCode(System.currentTimeMillis());
    }

    public static native int access(String s, int i);

    public static native int chmod(String s, int i);

    public static native String getCode(long l);

    public static native String getCodePD(long l);

    public static native String getCodePS(long l);

    public static native int getCpuUsage();

    public static native String getInt(long l);

    public static native int getPidRss(int i);

    public static native void initJniPara();

}
