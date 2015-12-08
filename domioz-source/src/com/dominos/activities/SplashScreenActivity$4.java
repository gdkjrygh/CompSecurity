// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.DialogInterface;
import com.dominos.controllers.SplashScreenController;

// Referenced classes of package com.dominos.activities:
//            SplashScreenActivity

class this._cls0
    implements android.content.Listener
{

    final SplashScreenActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SplashScreenActivity.access$100(SplashScreenActivity.this).continueVerification();
    }

    ()
    {
        this$0 = SplashScreenActivity.this;
        super();
    }
}
