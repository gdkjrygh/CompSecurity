// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.fsr.tracker.app:
//            TrackingContext

class val.activity
    implements android.content.ClickListener
{

    final TrackingContext this$0;
    final Activity val$activity;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        val$activity.finish();
    }

    kListener()
    {
        this$0 = final_trackingcontext;
        val$activity = Activity.this;
        super();
    }
}
