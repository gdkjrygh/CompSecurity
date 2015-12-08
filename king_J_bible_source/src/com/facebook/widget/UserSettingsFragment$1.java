// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.FacebookRequestError;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.model.GraphUser;

// Referenced classes of package com.facebook.widget:
//            UserSettingsFragment, LoginButton

class val.currentSession
    implements com.facebook.ck
{

    final UserSettingsFragment this$0;
    private final Session val$currentSession;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        if (val$currentSession == getSession())
        {
            UserSettingsFragment.access$3(UserSettingsFragment.this, graphuser);
            UserSettingsFragment.access$4(UserSettingsFragment.this);
        }
        if (response.getError() != null)
        {
            UserSettingsFragment.access$5(UserSettingsFragment.this).handleError(response.getError().getException());
        }
    }

    ()
    {
        this$0 = final_usersettingsfragment;
        val$currentSession = Session.this;
        super();
    }
}
