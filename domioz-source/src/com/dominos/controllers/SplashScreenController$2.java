// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.DialogInterface;

// Referenced classes of package com.dominos.controllers:
//            SplashScreenController

class this._cls0
    implements android.content.istener
{

    final SplashScreenController this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        disableGoogleWallet();
    }

    ()
    {
        this$0 = SplashScreenController.this;
        super();
    }
}
