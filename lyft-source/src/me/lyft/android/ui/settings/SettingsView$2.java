// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import me.lyft.android.application.ILogoutService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.dialogs.DialogResult;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.settings:
//            SettingsView

class this._cls0
    implements Action1
{

    final SettingsView this$0;

    public volatile void call(Object obj)
    {
        call((DialogResult)obj);
    }

    public void call(DialogResult dialogresult)
    {
        if (dialogresult.getButtonId() == 0x7f0d000b)
        {
            logoutService.logout("user_initiated");
            appFlow.resetTo(new me.lyft.android.ui.landing.IntroductionScreen("user_logout"));
        }
    }

    ntroductionScreen()
    {
        this$0 = SettingsView.this;
        super();
    }
}
