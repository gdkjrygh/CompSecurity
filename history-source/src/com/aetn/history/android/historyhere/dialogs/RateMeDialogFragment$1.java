// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.dialogs;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.PreferenceManager;

// Referenced classes of package com.aetn.history.android.historyhere.dialogs:
//            RateMeDialogFragment

class val.dialog
    implements android.view..dialogs.RateMeDialogFragment._cls1
{

    final RateMeDialogFragment this$0;
    final AlertDialog val$dialog;

    public void onClick(View view)
    {
        ((MainNavigationActivity)getActivity()).tagLocalyticsEvent("Rate App", null);
        PreferenceManager.setShouldShowRateReminder(getActivity(), false);
        view = new Intent("android.intent.action.VIEW", Uri.parse(HistoryHereApplication.getConfiguration().playStoreURL));
        getActivity().startActivity(view);
        val$dialog.cancel();
    }

    I()
    {
        this$0 = final_ratemedialogfragment;
        val$dialog = AlertDialog.this;
        super();
    }
}
