// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.GraphRequestBatch;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class uestCompletionCallback
    implements com.facebook.ck
{

    final LikeActionController this$0;
    final uestCompletionCallback val$completionHandler;
    final OGObjectIdRequestWrapper val$objectIdRequest;
    final PageIdRequestWrapper val$pageIdRequest;

    public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
    {
        LikeActionController.access$1602(LikeActionController.this, val$objectIdRequest.verifiedObjectId);
        if (Utility.isNullOrEmpty(LikeActionController.access$1600(LikeActionController.this)))
        {
            LikeActionController.access$1602(LikeActionController.this, val$pageIdRequest.verifiedObjectId);
            LikeActionController.access$2302(LikeActionController.this, val$pageIdRequest.objectIsPage);
        }
        if (Utility.isNullOrEmpty(LikeActionController.access$1600(LikeActionController.this)))
        {
            Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.access$100(), "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] {
                LikeActionController.access$2200(LikeActionController.this)
            });
            LikeActionController likeactioncontroller = LikeActionController.this;
            if (val$pageIdRequest.error != null)
            {
                graphrequestbatch = val$pageIdRequest.error;
            } else
            {
                graphrequestbatch = val$objectIdRequest.error;
            }
            LikeActionController.access$2400(likeactioncontroller, "get_verified_id", graphrequestbatch);
        }
        if (val$completionHandler != null)
        {
            val$completionHandler.onComplete();
        }
    }

    uestCompletionCallback()
    {
        this$0 = final_likeactioncontroller;
        val$objectIdRequest = ogobjectidrequestwrapper;
        val$pageIdRequest = pageidrequestwrapper;
        val$completionHandler = uestCompletionCallback.this;
        super();
    }
}
