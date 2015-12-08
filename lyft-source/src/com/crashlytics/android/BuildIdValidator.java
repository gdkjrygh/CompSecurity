// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.util.Log;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsMissingDependencyException

class BuildIdValidator
{

    private final String a;
    private final boolean b;

    public BuildIdValidator(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public void a(String s, String s1)
    {
        if (CommonUtils.c(a) && b)
        {
            s = b(s, s1);
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
        if (!b)
        {
            Fabric.g().a("Fabric", "Configured not to require a build ID.");
        }
    }

    protected String b(String s, String s1)
    {
        return "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
    }
}
