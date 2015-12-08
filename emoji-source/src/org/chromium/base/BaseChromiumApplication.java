// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Application;

// Referenced classes of package org.chromium.base:
//            ApplicationStatusManager

public class BaseChromiumApplication extends Application
{

    public BaseChromiumApplication()
    {
    }

    public void onCreate()
    {
        super.onCreate();
        ApplicationStatusManager.init(this);
    }
}
