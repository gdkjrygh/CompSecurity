// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import android.content.Context;
import android.graphics.Bitmap;
import com.aviary.android.feather.headless.b;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            MoaResult

public class Moa
{

    public static final Object a = new Object();

    public Moa()
    {
    }

    public static void a(Context context, String s, int i)
        throws b
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        i = n_init(context, s, i);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        throw b.a(i);
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        obj;
        JVM INSTR monitorexit ;
    }

    public static void a(Bitmap bitmap)
    {
        n_notifyPixelsChanged(bitmap);
    }

    public static void a(MoaResult moaresult)
    {
        synchronized (a)
        {
            n_applyActions(moaresult);
        }
        return;
        moaresult;
        obj;
        JVM INSTR monitorexit ;
        throw moaresult;
    }

    static native void n_applyActions(MoaResult moaresult);

    static native boolean n_cpuIsArmv7();

    static native String[] n_getActions();

    static native int n_getCpuBuild();

    static native int n_getCpuFamily();

    static native String[] n_getEffects();

    static native String n_getMoaLiteVersion();

    static native String n_getProclistVersion();

    static native int n_getVersion();

    static native boolean n_hasHeadless();

    static native int n_init(Context context, String s, int i);

    static native void n_notifyPixelsChanged(Bitmap bitmap);

    static native void n_setid(String s);

    static 
    {
        System.loadLibrary("cutils");
        System.loadLibrary("aviary_moalite");
        System.loadLibrary("aviary_native");
    }
}
