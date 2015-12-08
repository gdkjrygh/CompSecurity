// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.app.Application;
import com.google.inject.Module;
import roboguice.RoboGuice;

// Referenced classes of package com.thetransitapp.droid:
//            TransitModule

public class TransitApplication extends Application
{

    public TransitApplication()
    {
    }

    public void onCreate()
    {
        super.onCreate();
        RoboGuice.setBaseApplicationInjector(this, RoboGuice.DEFAULT_STAGE, new Module[] {
            RoboGuice.newDefaultRoboModule(this), new TransitModule()
        });
    }
}
