// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.content.Context;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;

public class CrashReportingTree extends timber.log.Timber.Tree
{

    public CrashReportingTree(Context context)
    {
        Fabric.with(context, new Kit[] {
            new Crashlytics()
        });
    }

    protected void log(int i, String s, String s1, Throwable throwable)
    {
        if (i == 2 || i == 3)
        {
            return;
        }
        String s2 = s1;
        if (i == 6)
        {
            if (throwable != null)
            {
                Crashlytics.logException(throwable);
            }
            s2 = (new StringBuilder()).append("ERROR: ").append(s1).toString();
        }
        Crashlytics.log(i, s, s2);
    }
}
