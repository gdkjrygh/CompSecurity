// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.os.Bundle;
import com.facebook.Session;
import com.facebook.SessionState;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            FacebookShareActivity

class val.params
    implements com.facebook.bookShareActivity._cls3
{

    final FacebookShareActivity this$0;
    final boolean val$bShare;
    final Bundle val$params;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        if (val$bShare)
        {
            if (session.isOpened())
            {
                FacebookShareActivity.publishFeedDialog(FacebookShareActivity.this, val$params);
            }
            return;
        } else
        {
            getFacebookUsername();
            return;
        }
    }

    ()
    {
        this$0 = final_facebookshareactivity;
        val$bShare = flag;
        val$params = Bundle.this;
        super();
    }
}
