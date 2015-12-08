// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.dominos.App;
import com.dominos.activities.PizzaProfileActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.core.user.UserProfileManager;

// Referenced classes of package com.dominos.views:
//            LoginButton

class r.UserProfileManager
    implements android.view.stener
{

    final LoginButton this$0;
    final UserProfileManager val$profileManager;

    public void onClick(View view)
    {
        App.getInstance().bus.post(new com.dominos.bus.events.topNinaRequest());
        if (val$profileManager.isSessionTimedOut())
        {
            val$profileManager.clearCurrentUser();
            LoginButton.access$000(LoginButton.this);
            return;
        } else
        {
            view = new Intent(getContext(), com/dominos/activities/PizzaProfileActivity_);
            getContext().startActivity(view);
            return;
        }
    }

    r.UserProfileManager()
    {
        this$0 = final_loginbutton;
        val$profileManager = UserProfileManager.this;
        super();
    }
}
