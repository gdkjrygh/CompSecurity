// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.content.Intent;
import android.view.View;
import com.dominos.App;
import com.dominos.activities.UserChangePassword_;
import com.dominos.android.sdk.app.ApplicationEventBus;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment

class this._cls0
    implements android.view.ment._cls4
{

    final LoginDialogFragment this$0;

    public void onClick(View view)
    {
        dismiss();
        App.getInstance().bus.post(new com.dominos.bus.events.equest());
        view = UserChangePassword_.intent(getActivity());
        view.get().putExtra("resetPassword", true);
        view.start();
    }

    .IntentBuilder_()
    {
        this$0 = LoginDialogFragment.this;
        super();
    }
}
