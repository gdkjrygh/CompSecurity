// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.controllers.interfaces.IDominosSplashScreen;

// Referenced classes of package com.dominos.controllers:
//            SplashScreenController

class val.beaconLaunchMode
    implements com.dominos.loader.adCallback
{

    final SplashScreenController this$0;
    final boolean val$beaconLaunchMode;

    public void onSetupFailure(int i, String s)
    {
        SplashScreenController.access$100(SplashScreenController.this).showAlertDialog(i, s);
    }

    public void onSetupSuccess()
    {
        SplashScreenController.access$000(SplashScreenController.this, val$beaconLaunchMode);
    }

    Screen()
    {
        this$0 = final_splashscreencontroller;
        val$beaconLaunchMode = Z.this;
        super();
    }
}
