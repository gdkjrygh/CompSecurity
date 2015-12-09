// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.dominos.activities:
//            SplashScreenActivity

class this._cls0
    implements android.content.Listener
{

    final SplashScreenActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW");
        dialoginterface.setData(Uri.parse("http://www.dominos.com"));
        startActivity(dialoginterface);
        finish();
    }

    r()
    {
        this$0 = SplashScreenActivity.this;
        super();
    }
}
