// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            NotificationSettingsActivity, TextAndButtonListRowDisplay

final class val.display
    implements OnActionListener
{

    final NotificationSettingsActivity this$0;
    final gleCallback val$callback;
    final TextAndButtonListRowDisplay val$display;

    private void onAction(Void void1)
    {
        void1 = val$callback;
        boolean flag;
        if (!val$display.isSwitchOn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        void1.onToggle(flag);
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    gleCallback()
    {
        this$0 = final_notificationsettingsactivity;
        val$callback = glecallback;
        val$display = TextAndButtonListRowDisplay.this;
        super();
    }
}
