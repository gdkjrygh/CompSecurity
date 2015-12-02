// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import com.facebook.orca.notify.NotificationSetting;

// Referenced classes of package com.facebook.orca.server:
//            SetSettingsParams

public class ay
{

    private boolean a;
    private NotificationSetting b;

    public ay()
    {
    }

    public ay a(NotificationSetting notificationsetting)
    {
        b = notificationsetting;
        return this;
    }

    public ay a(boolean flag)
    {
        a = flag;
        return this;
    }

    public boolean a()
    {
        return a;
    }

    public NotificationSetting b()
    {
        return b;
    }

    public SetSettingsParams c()
    {
        return new SetSettingsParams(this);
    }
}
