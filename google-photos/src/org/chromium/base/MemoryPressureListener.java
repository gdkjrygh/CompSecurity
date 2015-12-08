// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import qwm;

public class MemoryPressureListener
{

    public MemoryPressureListener()
    {
    }

    public static void a(int i)
    {
        if (i >= 80)
        {
            nativeOnMemoryPressure(2);
        } else
        if (i >= 40 || i == 15)
        {
            nativeOnMemoryPressure(0);
            return;
        }
    }

    public static void b(int i)
    {
        nativeOnMemoryPressure(2);
    }

    private static native void nativeOnMemoryPressure(int i);

    private static void registerSystemCallback(Context context)
    {
        context.registerComponentCallbacks(new qwm());
    }
}
