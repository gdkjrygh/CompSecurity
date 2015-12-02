// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Method;

public final class MemoryEnlargementHack
{

    public MemoryEnlargementHack()
    {
    }

    public static void a(Context context)
    {
        if ((context.getApplicationInfo().flags & 0x100000) == 0)
        {
            context = Class.forName("dalvik.system.VMRuntime");
            context.getMethod("clearGrowthLimit", new Class[0]).invoke(context.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        }
    }
}
