// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;

// Referenced classes of package com.dominos.utils:
//            ActivityHelper

class ertActionCallback
    implements com.dominos.fragments.nt.OnAlertDialogListener
{

    final ActivityHelper this$0;
    final ertActionCallback val$callback;
    final String val$domCommands[];

    public void onAlertDismiss()
    {
        if (val$domCommands != null)
        {
            App.getInstance().bus.post(new com.dominos.bus.events.ralAlertClose(val$domCommands));
        } else
        {
            App.getInstance().bus.post(new com.dominos.bus.events.ralAlertClose(new String[0]));
        }
        if (val$callback != null)
        {
            val$callback.onAlertDismissed();
        }
    }

    ertActionCallback()
    {
        this$0 = final_activityhelper;
        val$domCommands = as;
        val$callback = ertActionCallback.this;
        super();
    }
}
