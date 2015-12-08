// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.actionsender;

import com.worklight.androidgap.api.WLActionReceiver;

// Referenced classes of package com.worklight.androidgap.actionsender:
//            WLActionSender, WLAction

class val.wlAction
    implements Runnable
{

    final WLActionSender this$0;
    final WLAction val$wlAction;
    final WLActionReceiver val$wlActionReceiver;

    public void run()
    {
        val$wlActionReceiver.onActionReceived(val$wlAction.getAction(), val$wlAction.getData());
    }

    ()
    {
        this$0 = final_wlactionsender;
        val$wlActionReceiver = wlactionreceiver;
        val$wlAction = WLAction.this;
        super();
    }
}
