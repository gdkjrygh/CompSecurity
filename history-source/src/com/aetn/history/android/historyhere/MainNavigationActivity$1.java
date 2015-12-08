// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import android.content.Intent;
import android.net.Uri;
import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere:
//            MainNavigationActivity

class val.intent
    implements Runnable
{

    final MainNavigationActivity this$0;
    final Intent val$intent;

    public void run()
    {
        if (val$intent.getData() != null)
        {
            Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), "handleDeeplink(): we have data from a standard deeplink: ");
            executeDeeplink(val$intent.getData().toString());
            return;
        }
        if (val$intent != null && val$intent.getExtras() != null && val$intent.hasExtra("DEEPLINK"))
        {
            Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), "handleDeeplink():we have data from a notification deeplink: ");
            executeDeeplink(val$intent.getStringExtra("DEEPLINK"));
            return;
        } else
        {
            Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), "handleDeeplink(): nothing to handle");
            return;
        }
    }

    ()
    {
        this$0 = final_mainnavigationactivity;
        val$intent = Intent.this;
        super();
    }
}
