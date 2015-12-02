// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import com.facebook.orca.notify.NotificationSetting;
import com.facebook.ui.media.attachments.MediaResource;

// Referenced classes of package com.facebook.orca.server:
//            ModifyThreadParams

public class an
{

    private String a;
    private boolean b;
    private String c;
    private MediaResource d;
    private boolean e;
    private boolean f;
    private NotificationSetting g;

    public an()
    {
    }

    public an a(NotificationSetting notificationsetting)
    {
        g = notificationsetting;
        return this;
    }

    public an a(MediaResource mediaresource)
    {
        d = mediaresource;
        return this;
    }

    public an a(String s)
    {
        a = s;
        return this;
    }

    public an a(boolean flag)
    {
        b = flag;
        return this;
    }

    public String a()
    {
        return a;
    }

    public an b(String s)
    {
        c = s;
        return this;
    }

    public an b(boolean flag)
    {
        e = flag;
        return this;
    }

    public boolean b()
    {
        return b;
    }

    public an c(boolean flag)
    {
        f = flag;
        return this;
    }

    public String c()
    {
        return c;
    }

    public boolean d()
    {
        return e;
    }

    public MediaResource e()
    {
        return d;
    }

    public boolean f()
    {
        return f;
    }

    public NotificationSetting g()
    {
        return g;
    }

    public ModifyThreadParams h()
    {
        return new ModifyThreadParams(this);
    }
}
