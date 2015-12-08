// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.GraphRequestBatch;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class val.analyticsParameters
    implements questCompletionCallback
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
            final blishLikeRequestWrapper likeRequest = new blishLikeRequestWrapper(LikeActionController.this, LikeActionController.access$1600(LikeActionController.this), LikeActionController.access$1700(LikeActionController.this));
            likeRequest.addToBatch(graphrequestbatch);
            class _cls1
                implements com.facebook.GraphRequestBatch.Callback
            {

                final LikeActionController._cls7 this$1;
                final LikeActionController.PublishLikeRequestWrapper val$likeRequest;

                public void onBatchCompleted(GraphRequestBatch graphrequestbatch1)
                {
                    LikeActionController.access$1802(this$0, false);
                    if (likeRequest.error != null)
                    {
                        LikeActionController.access$1900(this$0, false);
                        return;
                    } else
                    {
                        LikeActionController.access$1102(this$0, Utility.coerceValueIfNullOrEmpty(likeRequest.unlikeToken, null));
                        LikeActionController.access$2002(this$0, true);
                        LikeActionController.access$1200(this$0).logSdkEvent("fb_like_control_did_like", null, analyticsParameters);
                        LikeActionController.access$2100(this$0, analyticsParameters);
                        return;
                    }
                }

            _cls1()
            {
                this$1 = LikeActionController._cls7.this;
                likeRequest = publishlikerequestwrapper;
                super();
            }
            }

            graphrequestbatch.addCallback(new _cls1());
            graphrequestbatch.executeAsync();
            return;
        }
    }

    _cls1()
    {
        this$0 = final_likeactioncontroller;
        val$analyticsParameters = Bundle.this;
        super();
    }
}
