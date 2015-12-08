// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;

// Referenced classes of package com.dominos.dialogs:
//            UpsellDialog

class val.answer
    implements Runnable
{

    final UpsellDialog this$0;
    final boolean val$answer;

    public void run()
    {
        if (val$answer)
        {
            UpsellDialog.access$000(UpsellDialog.this, true);
            return;
        } else
        {
            App.getInstance().bus.post(new com.dominos.bus.events.X.UpsellProceededCheckout());
            UpsellDialog.access$100(UpsellDialog.this);
            return;
        }
    }

    tionEventBus()
    {
        this$0 = final_upselldialog;
        val$answer = Z.this;
        super();
    }
}
