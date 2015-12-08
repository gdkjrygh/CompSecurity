// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.AppEventsLogger;
import com.facebook.RequestBatch;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

class val.analyticsParameters
    implements com.facebook.roller._cls7
{

    final LikeActionController this$0;
    final Activity val$activity;
    final Bundle val$analyticsParameters;
    final blishUnlikeRequestWrapper val$unlikeRequest;

    public void onBatchCompleted(RequestBatch requestbatch)
    {
        LikeActionController.access$1502(LikeActionController.this, false);
        if (val$unlikeRequest.error != null)
        {
            LikeActionController.access$900(LikeActionController.this, true, LikeActionController.access$1600(LikeActionController.this), LikeActionController.access$1700(LikeActionController.this), LikeActionController.access$1800(LikeActionController.this), LikeActionController.access$1900(LikeActionController.this), LikeActionController.access$2000(LikeActionController.this));
            LikeActionController.access$2100(LikeActionController.this, val$activity, val$analyticsParameters);
            return;
        } else
        {
            LikeActionController.access$2002(LikeActionController.this, null);
            LikeActionController.access$2202(LikeActionController.this, false);
            LikeActionController.access$800(LikeActionController.this).logSdkEvent("fb_like_control_did_unlike", null, val$analyticsParameters);
            LikeActionController.access$2300(LikeActionController.this, val$activity, val$analyticsParameters);
            return;
        }
    }

    blishUnlikeRequestWrapper()
    {
        this$0 = final_likeactioncontroller;
        val$unlikeRequest = blishunlikerequestwrapper;
        val$activity = activity1;
        val$analyticsParameters = Bundle.this;
        super();
    }
}
