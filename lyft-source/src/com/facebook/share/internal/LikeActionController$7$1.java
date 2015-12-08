// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.GraphRequestBatch;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class ishLikeRequestWrapper
    implements com.facebook.k
{

    final l.analyticsParameters this$1;
    final ishLikeRequestWrapper val$likeRequest;

    public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
    {
        LikeActionController.access$1802(_fld0, false);
        if (val$likeRequest.getError() != null)
        {
            LikeActionController.access$1900(_fld0, false);
            return;
        } else
        {
            LikeActionController.access$1102(_fld0, Utility.coerceValueIfNullOrEmpty(val$likeRequest.unlikeToken, null));
            LikeActionController.access$2002(_fld0, true);
            LikeActionController.access$1200(_fld0).logSdkEvent("fb_like_control_did_like", null, analyticsParameters);
            LikeActionController.access$2100(_fld0, analyticsParameters);
            return;
        }
    }

    ishLikeRequestWrapper()
    {
        this$1 = final_ishlikerequestwrapper;
        val$likeRequest = ishLikeRequestWrapper.this;
        super();
    }

    // Unreferenced inner class com/facebook/share/internal/LikeActionController$7

/* anonymous class */
    class LikeActionController._cls7
        implements LikeActionController.RequestCompletionCallback
    {

        final LikeActionController this$0;
        final Bundle val$analyticsParameters;

        public void onComplete()
        {
            if (Utility.isNullOrEmpty(LikeActionController.access$1600(LikeActionController.this)))
            {
                Bundle bundle = new Bundle();
                bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                LikeActionController.access$1500(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                return;
            } else
            {
                GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
                LikeActionController.PublishLikeRequestWrapper publishlikerequestwrapper = new LikeActionController.PublishLikeRequestWrapper(LikeActionController.this, LikeActionController.access$1600(LikeActionController.this), LikeActionController.access$1700(LikeActionController.this));
                publishlikerequestwrapper.addToBatch(graphrequestbatch);
                graphrequestbatch.addCallback(publishlikerequestwrapper. new LikeActionController._cls7._cls1());
                graphrequestbatch.executeAsync();
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
