// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.facebook.Response;
import com.facebook.Session;
import com.facebook.model.GraphUser;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class val.session
    implements com.facebook.k
{

    final SocialConnectActivity this$0;
    final Session val$session;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        if (graphuser != null)
        {
            onFacebookConnected(graphuser, val$session);
        }
    }

    ()
    {
        this$0 = final_socialconnectactivity;
        val$session = Session.this;
        super();
    }
}
