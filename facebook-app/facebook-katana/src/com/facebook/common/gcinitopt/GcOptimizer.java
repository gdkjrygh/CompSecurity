// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.gcinitopt;

import android.content.Context;
import android.util.Log;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.IOException;

public class GcOptimizer
{

    public GcOptimizer()
    {
    }

    public static void a(Context context)
    {
        if (context == null)
        {
            Log.e("GcOptimizer", "Attempting to enable with null context");
        } else
        if (c(context))
        {
            try
            {
                VMRuntime.getRuntime().setTargetHeapUtilization(0.2F);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("GcOptimizer", "Failed to setTargetHeapUtilization - aborting", context);
            }
            return;
        }
    }

    static void a(Context context, boolean flag)
    {
        context = b(context);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (!context.exists() && !context.createNewFile())
        {
            Log.w("GcOptimizer", "Can't create file");
        }
_L1:
        return;
        context;
        Log.w("GcOptimizer", "Can't create file", context);
        return;
        if (context.exists() && !context.delete())
        {
            Log.w("GcOptimizer", "Can't delete");
            return;
        }
          goto _L1
    }

    private static File b(Context context)
    {
        return new File(context.getFilesDir(), "gcinitopt");
    }

    private static boolean c(Context context)
    {
        return b(context).exists();
    }
}
