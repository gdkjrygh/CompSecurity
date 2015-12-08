// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

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
        if (val$likeRequest.error != null)
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
}
