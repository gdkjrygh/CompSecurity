// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            LowBalanceSettingsActivity, TextAndButtonListRowDisplay

final class this._cls0
    implements OnActionListener
{

    final LowBalanceSettingsActivity this$0;

    private void onAction(Void void1)
    {
        boolean flag;
        if (!lowBalanceToggleRow.isSwitchOn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lowBalanceToggleRow.setSwitch(flag);
        LowBalanceSettingsActivity.access$000(LowBalanceSettingsActivity.this, flag);
        LowBalanceSettingsActivity.access$100(LowBalanceSettingsActivity.this);
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    ()
    {
        this$0 = LowBalanceSettingsActivity.this;
        super();
    }
}
