// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import android.content.Context;
import net.hockeyapp.android.CrashManagerListener;

// Referenced classes of package com.skype.android.crash:
//            HockeyAppCrashReporter, CrashReporterConfig

final class  extends CrashManagerListener
{

    final HockeyAppCrashReporter a;

    public final String getContact()
    {
        return HockeyAppCrashReporter.a(a);
    }

    public final String getDescription()
    {
        StringBuilder stringbuilder = new StringBuilder();
        HockeyAppCrashReporter.a(a, stringbuilder);
        return stringbuilder.toString();
    }

    public final String getUserID()
    {
        if (HockeyAppCrashReporter.b(a).a())
        {
            return android.provider.(HockeyAppCrashReporter.c(a).getContentResolver(), "android_id");
        } else
        {
            return "";
        }
    }

    public final net.hockeyapp.android.hHandlingPolicy onCrashesFound()
    {
        if ("qb-market".contains("beta") || "releaseQb".contains("debug"))
        {
            return net.hockeyapp.android.hHandlingPolicy.SEND_SILENTLY;
        }
        if (HockeyAppCrashReporter.b(a).c())
        {
            return net.hockeyapp.android.hHandlingPolicy.ASK_USER;
        } else
        {
            return net.hockeyapp.android.hHandlingPolicy.SEND_SILENTLY;
        }
    }

    andlingPolicy(HockeyAppCrashReporter hockeyappcrashreporter)
    {
        a = hockeyappcrashreporter;
        super();
    }
}
