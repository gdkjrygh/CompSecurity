// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.kohls.mcommerce.opal.wallet.asynctask.RegisterEventAsyncTask;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            FacebookShareActivity

static final class val.context
    implements com.facebook.widget.ener
{

    final Context val$context;
    final Bundle val$params;

    private void dispayMsg()
    {
        Object obj = new android.app.t>(FacebookShareActivity.access$200());
    /* block-local class not found */
    class _cls1 {}

        ((android.app.ebookShareActivity._cls4._cls1) (obj)).itle("Kohl's").essage("Yay!\nWe just love it when our customers share with each other. It's so heartwarming!").ositiveButton("OK", new _cls1());
        obj = ((android.app.ebookShareActivity._cls4) (obj)).te();
        ((AlertDialog) (obj)).requestWindowFeature(1);
        ((AlertDialog) (obj)).show();
    }

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        if (facebookexception == null)
        {
            if (bundle.getString("post_id") != null && val$params.getBoolean("register"))
            {
                (new RegisterEventAsyncTask(val$context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                    "Facebook_Share"
                });
                dispayMsg();
            }
        } else
        if (!(facebookexception instanceof FacebookOperationCanceledException));
        boolean _tmp = FacebookShareActivity.access$102(true);
    }

    yncTask(Bundle bundle, Context context1)
    {
        val$params = bundle;
        val$context = context1;
        super();
    }
}
