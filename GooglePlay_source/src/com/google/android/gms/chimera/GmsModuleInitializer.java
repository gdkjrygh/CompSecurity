// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.flib.pref.PreferenceFile;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.permission.PermissionUtils;
import com.google.android.gms.common.util.PlatformVersion;

public class GmsModuleInitializer
{

    public GmsModuleInitializer()
    {
    }

    public static void initializeModuleV0(Context context, BaseApplicationContext baseapplicationcontext)
        throws Exception
    {
        new GmsApplicationContext(context, baseapplicationcontext);
        GservicesValue.init(context);
        PreferenceFile.sContext = context;
        if (PlatformVersion.checkVersion(23))
        {
            baseapplicationcontext = PermissionUtils.getInstance();
            context.getPackageManager().addOnPermissionsChangeListener(new com.google.android.gms.common.permission.PermissionUtils._cls1(baseapplicationcontext));
        }
    }
}
