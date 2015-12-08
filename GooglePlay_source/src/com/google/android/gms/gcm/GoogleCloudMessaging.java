// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.iid.Rpc;
import java.util.concurrent.atomic.AtomicInteger;

public final class GoogleCloudMessaging
{

    public static int GCM_LONGHORN = 0x4c4b40;
    public static int GCM_NACHO = 0x632ea0;
    public static int GCM_ORLA = 0x6acfc0;
    private static final AtomicInteger msgIdGenerator = new AtomicInteger(1);

    public static String getGcmPackage(Context context)
    {
        return Rpc.findAppIDPackage(context);
    }

    public static int getGcmVersion(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getPackageInfo(Rpc.findAppIDPackage(context), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return i;
    }

}
