// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import com.dominos.activities.LabsProductDetailListActivity_;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            ProductCompleteGuard

class val.activity
    implements Runnable
{

    final ProductCompleteGuard this$0;
    final Activity val$activity;

    public void run()
    {
        ((com.dominos.activities.tivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(val$activity).flags(0x10020000)).start();
    }

    .IntentBuilder_()
    {
        this$0 = final_productcompleteguard;
        val$activity = Activity.this;
        super();
    }
}
