// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import com.facebook.AppEventsLogger;
import com.facebook.RequestBatch;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Utility

class ishLikeRequestWrapper
    implements com.facebook.ller._cls6._cls1
{

    final l.analyticsParameters this$1;
    final ishLikeRequestWrapper val$likeRequest;

    public void onBatchCompleted(RequestBatch requestbatch)
    {
        LikeActionController.access$2002(_fld0, false);
        if (val$likeRequest.error != null)
        {
            LikeActionController.access$2100(_fld0, false);
            return;
        } else
        {
            LikeActionController.access$1302(_fld0, Utility.coerceValueIfNullOrEmpty(val$likeRequest.unlikeToken, null));
            LikeActionController.access$2202(_fld0, true);
            LikeActionController.access$1400(_fld0).logSdkEvent("fb_like_control_did_like", null, analyticsParameters);
            LikeActionController.access$2300(_fld0, analyticsParameters);
            return;
        }
    }

    ishLikeRequestWrapper()
    {
        this$1 = final_ishlikerequestwrapper;
        val$likeRequest = ishLikeRequestWrapper.this;
        super();
    }

    // Unreferenced inner class com/facebook/internal/LikeActionController$6

/* anonymous class */
    class LikeActionController._cls6
        implements LikeActionController.RequestCompletionCallback
    {

        final LikeActionController this$0;
        final Bundle val$analyticsParameters;

        public void onComplete()
        {
            if (Utility.isNullOrEmpty(LikeActionController.access$1900(LikeActionController.this)))
            {
                Bundle bundle = new Bundle();
                bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                LikeActionController.access$1800(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                return;
            } else
            {
                RequestBatch requestbatch = new RequestBatch();
                LikeActionController.PublishLikeRequestWrapper publishlikerequestwrapper = new LikeActionController.PublishLikeRequestWrapper(LikeActionController.this, LikeActionController.access$1900(LikeActionController.this));
                publishlikerequestwrapper.addToBatch(requestbatch);
                requestbatch.addCallback(publishlikerequestwrapper. new LikeActionController._cls6._cls1());
                requestbatch.executeAsync();
                return;
            }
        }

            
            {
                this$0 = final_likeactioncontroller;
                analyticsParameters = Bundle.this;
                super();
            }
    }

}
