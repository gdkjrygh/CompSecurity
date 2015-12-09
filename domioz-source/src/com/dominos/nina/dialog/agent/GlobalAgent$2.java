// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            GlobalAgent

class val.currentActivity
    implements Runnable
{

    final GlobalAgent this$0;
    final Activity val$currentActivity;

    public void run()
    {
        val$currentActivity.onBackPressed();
    }

    ()
    {
        this$0 = final_globalagent;
        val$currentActivity = Activity.this;
        super();
    }
}
