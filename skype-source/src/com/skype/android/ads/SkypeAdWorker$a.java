// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import java.util.TimerTask;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdWorker, SkypeAdManager, ConfigManager

private final class <init> extends TimerTask
{

    final SkypeAdWorker a;

    public final void run()
    {
        SkypeAdManager skypeadmanager = SkypeAdManager.d();
        if (skypeadmanager != null && skypeadmanager.i())
        {
            return;
        } else
        {
            ConfigManager.b(SkypeAdWorker.a(a));
            return;
        }
    }

    private (SkypeAdWorker skypeadworker)
    {
        a = skypeadworker;
        super();
    }

    a(SkypeAdWorker skypeadworker, byte byte0)
    {
        this(skypeadworker);
    }
}
