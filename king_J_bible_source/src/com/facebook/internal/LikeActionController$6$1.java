// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.AppEventsLogger;
import com.facebook.RequestBatch;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Utility

class val.analyticsParameters
    implements com.facebook.ller._cls6._cls1
{

    final val.analyticsParameters this$1;
    private final Activity val$activity;
    private final Bundle val$analyticsParameters;
    private final ishLikeRequestWrapper val$likeRequest;

    public void onBatchCompleted(RequestBatch requestbatch)
    {
        LikeActionController.access$27(_fld0, false);
        if (val$likeRequest.error != null)
        {
            LikeActionController.access$28(_fld0, val$activity, val$analyticsParameters, false);
            return;
        } else
        {
            LikeActionController.access$29(_fld0, Utility.coerceValueIfNullOrEmpty(val$likeRequest.unlikeToken, null));
            LikeActionController.access$30(_fld0, true);
            LikeActionController.access$21(_fld0).logSdkEvent("fb_like_control_did_like", null, val$analyticsParameters);
            LikeActionController.access$31(_fld0, val$activity, val$analyticsParameters);
            return;
        }
    }

    ishLikeRequestWrapper()
    {
        this$1 = final_ishlikerequestwrapper;
        val$likeRequest = ishlikerequestwrapper1;
        val$activity = activity1;
        val$analyticsParameters = Bundle.this;
        super();
    }

    // Unreferenced inner class com/facebook/internal/LikeActionController$6

/* anonymous class */
    class LikeActionController._cls6
        implements LikeActionController.RequestCompletionCallback
    {

        final LikeActionController this$0;
        private final Activity val$activity;
        private final Bundle val$analyticsParameters;

        public void onComplete()
        {
            if (Utility.isNullOrEmpty(LikeActionController.access$26(LikeActionController.this)))
            {
                Bundle bundle = new Bundle();
                bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                LikeActionController.access$25(LikeActionController.access$24(LikeActionController.this), LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                return;
            } else
            {
                RequestBatch requestbatch = new RequestBatch();
                final LikeActionController.PublishLikeRequestWrapper likeRequest = new LikeActionController.PublishLikeRequestWrapper(LikeActionController.this, LikeActionController.access$26(LikeActionController.this));
                likeRequest.addToBatch(requestbatch);
                requestbatch.addCallback(analyticsParameters. new LikeActionController._cls6._cls1());
                requestbatch.executeAsync();
                return;
            }
        }


            
            {
                this$0 = final_likeactioncontroller;
                activity = activity1;
                analyticsParameters = Bundle.this;
                super();
            }
    }

}
