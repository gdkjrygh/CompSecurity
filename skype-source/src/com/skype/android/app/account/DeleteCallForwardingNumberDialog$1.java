// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.util.CallForwarding;

// Referenced classes of package com.skype.android.app.account:
//            DeleteCallForwardingNumberDialog

final class this._cls0
    implements android.content.umberDialog._cls1
{

    final DeleteCallForwardingNumberDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        String s = getArguments().getString("phone_num");
        CallForwarding callforwarding = new CallForwarding(lib, account);
        if (callforwarding.b(callforwarding.a(s)))
        {
            analytics.c(AnalyticsEvent.aD);
        }
        dialoginterface.dismiss();
    }

    ()
    {
        this$0 = DeleteCallForwardingNumberDialog.this;
        super();
    }
}
