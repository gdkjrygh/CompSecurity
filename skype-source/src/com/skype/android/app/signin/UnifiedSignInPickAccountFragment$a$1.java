// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.view.View;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.util.SignInDurationReporter;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInPickAccountFragment, UnifiedSignInFlow

final class val.holder
    implements android.view.untFragment.a._cls1
{

    final COUNT_PICKER_SCREEN this$0;
    final COUNT_PICKER_SCREEN val$holder;

    public final void onClick(View view)
    {
        cess._mth200(this._cls0.this).selectAccount(val$holder.getLayoutPosition());
        cess._mth300(this._cls0.this).a(LogEvent.C);
        cess._mth400(this._cls0.this).a(com.skype.android.util.t.a, String.valueOf(COUNT_PICKER_SCREEN));
    }

    ()
    {
        this$0 = final_;
        val$holder = val.holder.this;
        super();
    }
}
