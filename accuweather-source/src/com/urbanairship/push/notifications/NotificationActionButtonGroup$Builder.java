// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.urbanairship.push.notifications:
//            NotificationActionButtonGroup, NotificationActionButton

public static class 
{

    private final List actionButtons = new ArrayList();

    public  addNotificationActionButton(NotificationActionButton notificationactionbutton)
    {
        actionButtons.add(notificationactionbutton);
        return this;
    }

    public NotificationActionButtonGroup build()
    {
        return new NotificationActionButtonGroup(actionButtons, null);
    }

    public ()
    {
    }
}
