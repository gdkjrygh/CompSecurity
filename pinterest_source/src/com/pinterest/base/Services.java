// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.app.Application;
import android.content.Intent;
import com.pinterest.service.DelayedStartupService;
import com.pinterest.service.NotificationService;
import com.pinterest.service.PinUploaderService;
import com.pinterest.service.TypeaheadCacheService;

// Referenced classes of package com.pinterest.base:
//            Application

public class Services
{

    public Services()
    {
    }

    public static void startDelayedStartupService()
    {
        Application.context().startService(new Intent("com.pinterest.action.LOAD_CONVERSATIONS", null, Application.context(), com/pinterest/service/DelayedStartupService));
        Application.context().startService(new Intent("com.pinterest.action.LOAD_INTERESTS", null, Application.context(), com/pinterest/service/DelayedStartupService));
        Application.context().startService(new Intent("com.pinterest.action.UPDATE_INVITABILITY", null, Application.context(), com/pinterest/service/DelayedStartupService));
        Application.context().startService(new Intent("com.pinterest.action.UPLOAD_CONTACTS", null, Application.context(), com/pinterest/service/DelayedStartupService));
        Application.context().startService(new Intent("com.pinterest.action.CACHE_SHARE_SUGGESTIONS", null, Application.context(), com/pinterest/service/DelayedStartupService));
    }

    public static void startNotificationService()
    {
        Application.context().startService(new Intent(Application.context(), com/pinterest/service/NotificationService));
    }

    public static void startPinUploaderService()
    {
        Application.context().startService(new Intent(Application.context(), com/pinterest/service/PinUploaderService));
    }

    public static void startTypeaheadCacheService()
    {
        Application.context().startService(new Intent(Application.context(), com/pinterest/service/TypeaheadCacheService));
    }
}
