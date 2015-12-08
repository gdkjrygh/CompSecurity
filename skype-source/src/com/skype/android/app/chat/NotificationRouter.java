// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import dagger.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            MessageNotificationRenderer

public class NotificationRouter
{

    private final ArrayList notificationRenderer = new ArrayList();

    public NotificationRouter(a a1, a a2)
    {
        notificationRenderer.add(a1.get());
        if (isAndroidWearSupported())
        {
            notificationRenderer.add(a2.get());
        }
    }

    private boolean isAndroidWearSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 20;
    }

    public void clear(int i)
    {
        for (Iterator iterator = notificationRenderer.iterator(); iterator.hasNext(); ((MessageNotificationRenderer)iterator.next()).clearMessage(i)) { }
    }

    public void clearAll()
    {
        for (Iterator iterator = notificationRenderer.iterator(); iterator.hasNext(); ((MessageNotificationRenderer)iterator.next()).clearAllMessages()) { }
    }

    public void displayMessages(List list)
    {
        for (Iterator iterator = notificationRenderer.iterator(); iterator.hasNext(); ((MessageNotificationRenderer)iterator.next()).displayMessages(list)) { }
    }
}
