// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.social;

import com.facebook.Session;
import com.facebook.SessionState;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.social:
//            FacebookLoginActivity

class this._cls0
    implements com.facebook.ebookLoginActivity._cls3
{

    final FacebookLoginActivity this$0;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        Log.v("FacebookLoginActivity", (new StringBuilder()).append("Callback - Session: ").append(session).append(", State: ").append(sessionstate).append(", Exception: ").append(exception).toString());
        if (sessionstate.isOpened())
        {
            FacebookLoginActivity.access$200(FacebookLoginActivity.this);
            FacebookLoginActivity.access$000(FacebookLoginActivity.this).connectWithFacebook(Session.getActiveSession().getAccessToken(), new nnectedToFacebookCallback(FacebookLoginActivity.this));
        } else
        if (sessionstate.isClosed())
        {
            FacebookLoginActivity.access$300(FacebookLoginActivity.this);
            return;
        }
    }

    nnectedToFacebookCallback()
    {
        this$0 = FacebookLoginActivity.this;
        super();
    }
}
