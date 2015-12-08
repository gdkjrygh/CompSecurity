// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.util.CallForwarding;

public class DeleteCallForwardingNumberDialog extends SkypeDialogFragment
{

    Account account;
    Analytics analytics;
    SkyLib lib;

    public DeleteCallForwardingNumberDialog()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(0x7f080233);
        bundle.b(0x7f08037b);
        bundle.a(0x7f08034b, new android.content.DialogInterface.OnClickListener() {

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

            
            {
                this$0 = DeleteCallForwardingNumberDialog.this;
                super();
            }
        });
        bundle.b(0x7f0802e5, null);
        return bundle.c();
    }
}
