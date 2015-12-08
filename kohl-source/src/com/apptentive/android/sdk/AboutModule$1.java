// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.apptentive.android.sdk:
//            AboutModule

class val.activity
    implements android.view.stener
{

    final AboutModule this$0;
    final Activity val$activity;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse("http://www.apptentive.com"));
        val$activity.startActivity(view);
    }

    ()
    {
        this$0 = final_aboutmodule;
        val$activity = Activity.this;
        super();
    }
}
