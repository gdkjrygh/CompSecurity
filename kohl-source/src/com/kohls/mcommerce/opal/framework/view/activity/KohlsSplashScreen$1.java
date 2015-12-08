// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            KohlsSplashScreen, HomeActivity

class this._cls0
    implements Runnable
{

    final KohlsSplashScreen this$0;

    public void run()
    {
        Intent intent = new Intent(KohlsSplashScreen.this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
        startActivity(intent);
        finish();
    }

    ()
    {
        this$0 = KohlsSplashScreen.this;
        super();
    }
}
