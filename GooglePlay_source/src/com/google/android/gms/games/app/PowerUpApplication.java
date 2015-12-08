// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.app;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.service.PlayGamesNotificationManager;
import com.google.android.gms.games.ui.appcontent.PowerUpAppContentUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PowerUpApplication extends Application
{

    public static final Map ABI_TO_TARGET_ARCHITECTURE;
    private static final int WRONG_ARCHITECTURE_NOTIFICATION_ID = PlayGamesNotificationManager.getUniqueNotificationId(com/google/android/gms/games/app/PowerUpApplication.getName());

    public PowerUpApplication()
    {
    }

    private static int getCurrentVersionCode(Context context)
    {
        String s = context.getPackageName();
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(s, 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("PowerUpApplication", (new StringBuilder("Could not find package info for package: ")).append(s).toString());
            return -1;
        }
        return i;
    }

    public void onCreate()
    {
        super.onCreate();
        GservicesValue.init(this);
        PowerUpAppContentUtils.init();
        if (Build.FINGERPRINT == null || !Build.FINGERPRINT.contains("dev-keys")) goto _L2; else goto _L1
_L1:
        Object obj1;
        Context context;
        context = getApplicationContext();
        int i = (getCurrentVersionCode(context) % 100) / 10;
        Object obj;
        String s;
        java.util.Map.Entry entry;
        if (PlatformVersion.checkVersion(21))
        {
            obj = Build.SUPPORTED_ABIS[0];
        } else
        {
            obj = Build.CPU_ABI;
        }
        obj1 = (Integer)ABI_TO_TARGET_ARCHITECTURE.get(obj);
        if (obj1 == null || i == ((Integer) (obj1)).intValue()) goto _L4; else goto _L3
_L3:
        s = getString(0x7f100156);
        obj1 = ABI_TO_TARGET_ARCHITECTURE.entrySet().iterator();
_L8:
        if (!((Iterator) (obj1)).hasNext()) goto _L6; else goto _L5
_L5:
        entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        if (((Integer)entry.getValue()).intValue() != i) goto _L8; else goto _L7
_L7:
        obj1 = (String)entry.getKey();
_L9:
        obj = getString(0x7f100155, new Object[] {
            obj1, obj
        });
        obj1 = getString(0x7f100154);
        obj = (new android.support.v4.app.NotificationCompat.Builder(context)).setContentTitle(s).setContentText(((CharSequence) (obj1))).setSmallIcon(0x7f02011e).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(((CharSequence) (obj))));
        obj.mLocalOnly = true;
        obj.mPriority = 2;
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).setFlag(2, true);
        obj = ((android.support.v4.app.NotificationCompat.Builder) (obj)).build();
        PlayGamesNotificationManager.showNotification(context, WRONG_ARCHITECTURE_NOTIFICATION_ID, ((android.app.Notification) (obj)));
_L2:
        return;
_L6:
        obj1 = "Unknown";
        if (true) goto _L9; else goto _L4
_L4:
        PlayGamesNotificationManager.cancelNotification(context, WRONG_ARCHITECTURE_NOTIFICATION_ID);
        return;
    }

    static 
    {
        ArrayMap arraymap = new ArrayMap();
        ABI_TO_TARGET_ARCHITECTURE = arraymap;
        arraymap.put("armeabi", Integer.valueOf(1));
        ABI_TO_TARGET_ARCHITECTURE.put("armeabi-v7a", Integer.valueOf(3));
        ABI_TO_TARGET_ARCHITECTURE.put("arm64-v8a", Integer.valueOf(4));
        ABI_TO_TARGET_ARCHITECTURE.put("mips", Integer.valueOf(5));
        ABI_TO_TARGET_ARCHITECTURE.put("x86", Integer.valueOf(7));
        ABI_TO_TARGET_ARCHITECTURE.put("x86_64", Integer.valueOf(8));
    }
}
