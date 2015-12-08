// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.version;

import android.app.Application;

// Referenced classes of package com.google.android.apps.wallet.util.version:
//            VersionUtils

public class VersionUtilModule
{

    public VersionUtilModule()
    {
    }

    static int getVersionCode(Application application)
    {
        return VersionUtils.getVersionCode(application);
    }

    static String getVersionName(Application application)
    {
        return VersionUtils.getVersionName(application);
    }
}
