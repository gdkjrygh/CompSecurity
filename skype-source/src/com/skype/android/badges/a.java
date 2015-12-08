// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.badges;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.badges:
//            BadgeNotification

class a
    implements BadgeNotification
{

    protected static final Logger a = Logger.getLogger(com/skype/android/badges/a.getSimpleName());
    protected Application b;
    protected String c;

    public a(Application application)
    {
        b = application;
        c = a();
        a.info(String.format("Launcher Class Name: %s", new Object[] {
            c
        }));
    }

    private String a()
    {
        Object obj = new Intent("android.intent.action.MAIN");
        ((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
        for (obj = b.getPackageManager().queryIntentActivities(((Intent) (obj)), 0).iterator(); ((Iterator) (obj)).hasNext();)
        {
            ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
            if (resolveinfo.activityInfo.applicationInfo.packageName.equalsIgnoreCase(b.getPackageName()))
            {
                return resolveinfo.activityInfo.name;
            }
        }

        return "";
    }

    public void a(int i)
    {
    }

}
