// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;

// Referenced classes of package com.qihoo.security.leak:
//            c, b, d

class h extends c
{

    h(d d1)
    {
        super(d1);
    }

    public String a()
    {
        return "leak_samsung_backup";
    }

    boolean b()
    {
        String as[];
        int i;
        int j;
        as = new String[5];
        as[0] = "GT-I9500";
        as[1] = "GT-I9502";
        as[2] = "GT-I9505";
        as[3] = "GT-I9508";
        as[4] = "SCH-I959";
        j = as.length;
        i = 0;
_L5:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        if (!as[i].equalsIgnoreCase(Build.MODEL)) goto _L2; else goto _L1
_L1:
        i = 1;
_L7:
        if (i != 0) goto _L4; else goto _L3
_L3:
        return false;
_L2:
        i++;
          goto _L5
_L4:
        PackageInfo packageinfo;
        Object obj;
        obj = a.getPackageManager();
        packageinfo = null;
        obj = ((PackageManager) (obj)).getPackageInfo(b.a, 2);
        packageinfo = ((PackageInfo) (obj));
_L6:
        if (packageinfo != null && packageinfo.versionCode <= 14 && packageinfo.receivers != null)
        {
            ActivityInfo aactivityinfo[] = packageinfo.receivers;
            int k = aactivityinfo.length;
            i = 0;
            while (i < k) 
            {
                ActivityInfo activityinfo = aactivityinfo[i];
                if (b.b.equals(activityinfo.name))
                {
                    return true;
                }
                i++;
            }
        }
          goto _L3
        Exception exception;
        exception;
          goto _L6
        i = 0;
          goto _L7
    }

    public boolean c()
    {
        PackageManager packagemanager = a.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getApplicationEnabledSetting(b.a);
        }
        catch (Exception exception)
        {
            return true;
        }
        return i == 2 || i == 3;
    }

    public Drawable d()
    {
        return a.getResources().getDrawable(0x7f0200a9);
    }

    int e()
    {
        return 0x7f0e0011;
    }

    public boolean f()
    {
        return c();
    }
}
