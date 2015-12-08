// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.util.Log;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.common.h;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsMissingDependencyException

class BuildIdValidator
{

    private static final String MESSAGE = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
    private final String buildId;
    private final boolean requiringBuildId;

    public BuildIdValidator(String s, boolean flag)
    {
        buildId = s;
        requiringBuildId = flag;
    }

    protected String getMessage(String s, String s1)
    {
        return "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
    }

    public void validate(String s, String s1)
    {
        if (h.c(buildId) && requiringBuildId)
        {
            s = getMessage(s, s1);
            Log.e("Fabric", ".");
            Log.e("Fabric", ".     |  | ");
            Log.e("Fabric", ".     |  |");
            Log.e("Fabric", ".     |  |");
            Log.e("Fabric", ".   \\ |  | /");
            Log.e("Fabric", ".    \\    /");
            Log.e("Fabric", ".     \\  /");
            Log.e("Fabric", ".      \\/");
            Log.e("Fabric", ".");
            Log.e("Fabric", s);
            Log.e("Fabric", ".");
            Log.e("Fabric", ".      /\\");
            Log.e("Fabric", ".     /  \\");
            Log.e("Fabric", ".    /    \\");
            Log.e("Fabric", ".   / |  | \\");
            Log.e("Fabric", ".     |  |");
            Log.e("Fabric", ".     |  |");
            Log.e("Fabric", ".     |  |");
            Log.e("Fabric", ".");
            throw new CrashlyticsMissingDependencyException(s);
        }
        if (!requiringBuildId)
        {
            c.h().a("Fabric", "Configured not to require a build ID.");
        }
    }
}
