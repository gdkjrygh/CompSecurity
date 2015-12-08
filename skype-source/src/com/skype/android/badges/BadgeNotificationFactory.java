// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.badges;

import android.app.Application;
import android.os.Build;

// Referenced classes of package com.skype.android.badges:
//            c, b, e, d, 
//            a, BadgeNotification

public class BadgeNotificationFactory
{

    private BadgeNotificationFactory()
    {
    }

    public static BadgeNotification getBadgeObject(Application application)
    {
        if (Build.MANUFACTURER.equalsIgnoreCase("Samsung"))
        {
            return new c(application);
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Htc"))
        {
            return new b(application);
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Sony"))
        {
            return new e(application);
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi"))
        {
            return new d(application);
        } else
        {
            return new a(application);
        }
    }
}
