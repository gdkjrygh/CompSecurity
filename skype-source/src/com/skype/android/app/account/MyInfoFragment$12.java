// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Intent;
import android.view.View;
import com.skype.Account;
import com.skype.android.util.SkypeCredit;

// Referenced classes of package com.skype.android.app.account:
//            MyInfoFragment, CallForwardingActivity, BuyCallForwardingDialog

final class this._cls0
    implements android.view.er
{

    final MyInfoFragment this$0;

    public final void onClick(View view)
    {
        if (account.getCapabilityStatus(com.skype..CAPABILITY_CALL_FORWARD).m_return == com.skype.STATUS.CAPABILITY_EXISTS || credit.b())
        {
            view = new Intent(getActivity(), com/skype/android/app/account/CallForwardingActivity);
            startActivity(view);
            return;
        } else
        {
            (new BuyCallForwardingDialog()).show(getFragmentManager());
            return;
        }
    }

    ialog()
    {
        this$0 = MyInfoFragment.this;
        super();
    }
}
