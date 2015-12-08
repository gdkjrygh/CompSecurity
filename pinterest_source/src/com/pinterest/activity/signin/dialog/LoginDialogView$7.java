// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.app.Activity;
import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.model.User;
import com.pinterest.appwidget.PWidgetHelper;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.receiver.GlobalDataUpdateReceiver;
import java.io.IOException;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialog, LoginDialogView

class nit> extends com.pinterest.api.remote.iResponse
{

    final LoginDialogView this$0;

    public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
    {
        StopWatch.get().invalidate("login_email");
        Events.post(new DialogEvent(new LoginDialog()));
        if (throwable instanceof IOException)
        {
            Application.showNoInternetToast();
            return;
        }
        if (pinterestjsonobject != null)
        {
            Application.showToast(pinterestjsonobject.a("error", Resources.string(0x7f070350)), 0x7f020173);
            return;
        } else
        {
            Application.showToast(0x7f070350, 0x7f020173);
            return;
        }
    }

    public void onSuccess(User user)
    {
        super.onSuccess(user);
        GlobalDataUpdateReceiver.c();
        PWidgetHelper.notifyWidgetStateChange(Application.context());
        if (LoginDialogView.access$700(LoginDialogView.this).getVisibility() == 0)
        {
            Preferences.user().set("PREF_CONNETING_GPLUS", true);
        }
        Events.post(new DialogEvent(null));
        if (getContext() instanceof Activity)
        {
            user = (Activity)getContext();
            ActivityHelper.goRoot(user);
            user.finish();
        }
    }

    ()
    {
        this$0 = LoginDialogView.this;
        super();
    }
}
