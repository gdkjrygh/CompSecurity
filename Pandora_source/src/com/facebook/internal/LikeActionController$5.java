// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import com.facebook.AppEventsLogger;
import com.facebook.LoggingBehavior;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Logger

class val.analyticsParameters
    implements com.facebook.widget.
{

    final LikeActionController this$0;
    final Bundle val$analyticsParameters;

    public void onComplete(com.facebook.widget.all all, Bundle bundle)
    {
        if (!bundle.containsKey("object_is_liked"))
        {
            return;
        }
        boolean flag = bundle.getBoolean("object_is_liked");
        String s = bundle.getString("like_count_string");
        String s1 = bundle.getString("social_sentence");
        String s2 = bundle.getString("unlike_token");
        if (val$analyticsParameters == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = val$analyticsParameters;
        }
        bundle.putString("call_id", all.getCallId().toString());
        LikeActionController.access$800(LikeActionController.this).logSdkEvent("fb_like_control_dialog_did_succeed", null, bundle);
        LikeActionController.access$900(LikeActionController.this, flag, s, s, s1, s1, s2);
    }

    public void onError(com.facebook.widget.all all, Exception exception, Bundle bundle)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$1000(), "Like Dialog failed with error : %s", new Object[] {
            exception
        });
        if (val$analyticsParameters == null)
        {
            exception = new Bundle();
        } else
        {
            exception = val$analyticsParameters;
        }
        exception.putString("call_id", all.getCallId().toString());
        LikeActionController.access$1100(LikeActionController.this, "present_dialog", exception);
        LikeActionController.access$1300(LikeActionController.access$1200(LikeActionController.this), LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    l()
    {
        this$0 = final_likeactioncontroller;
        val$analyticsParameters = Bundle.this;
        super();
    }
}
