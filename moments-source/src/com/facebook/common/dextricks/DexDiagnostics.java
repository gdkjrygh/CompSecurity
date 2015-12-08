// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.Log;
import com.facebook.dalvik.DalvikInternals;

public class DexDiagnostics
{

    private final String a;

    public DexDiagnostics(Context context)
    {
        Object obj = null;
        try
        {
            context = a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        a = context;
    }

    private static String a(Context context)
    {
        return context.getApplicationInfo().dataDir;
    }

    private int b()
    {
        if (a == null)
        {
            return -2;
        }
        int i;
        try
        {
            i = DalvikInternals.getOwnerUid(a);
        }
        catch (Throwable throwable)
        {
            Log.e(com/facebook/common/dextricks/DexDiagnostics.getSimpleName(), "Unable to read directory owner uid", throwable);
            return -2;
        }
        return i;
    }

    public final boolean a()
    {
        int i = b();
        return i == Process.myUid() || i == -2;
    }
}
