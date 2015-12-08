// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common:
//            Logger

private static class <init>
    implements ionHandler
{

    private final uncaughtException defaultUEH;

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        if (Logger.access$200() != null)
        {
            Logger.access$200().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().ean("crashDetected", true).ean();
        }
        Logger.getInstance(getClass().getName()).fatal("Uncaught Exception", new JSONObject(), throwable);
        defaultUEH.uncaughtException(thread, throwable);
    }

    private ()
    {
        defaultUEH = Thread.getDefaultUncaughtExceptionHandler();
    }

    defaultUEH(defaultUEH defaultueh)
    {
        this();
    }
}
