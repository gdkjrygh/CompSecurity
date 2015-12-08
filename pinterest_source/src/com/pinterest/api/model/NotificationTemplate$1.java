// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, NotificationTemplate

final class > extends BackgroundTask
{

    final NotificationTemplate val$template;

    public final void run()
    {
        ModelHelper.setNotificationTemplate(val$template);
    }

    ()
    {
        val$template = notificationtemplate;
        super();
    }
}
