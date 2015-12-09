// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AppStoreHelper;

// Referenced classes of package com.netflix.mediaclient.ui:
//            ServiceErrorsHandler

static final class val.activity
    implements android.content.Listener
{

    final Activity val$activity;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Log.i("ServiceErrorsHandler", "User clicked Ok on prompt to update");
        dialoginterface = AppStoreHelper.getUpdateSourceIntent(val$activity);
        if (dialoginterface == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        dialoginterface.addFlags(0x10000000);
        val$activity.startActivity(dialoginterface);
        val$activity.finish();
        return;
        dialoginterface;
        Log.e("ServiceErrorsHandler", "Failed to start store Activity!", dialoginterface);
        val$activity.finish();
        return;
        dialoginterface;
        val$activity.finish();
        throw dialoginterface;
    }

    (Activity activity1)
    {
        val$activity = activity1;
        super();
    }
}
