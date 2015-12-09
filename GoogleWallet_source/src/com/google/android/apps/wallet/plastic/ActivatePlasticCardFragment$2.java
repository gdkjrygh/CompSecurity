// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            ActivatePlasticCardFragment

final class val.activateButton
    implements AsyncCallback
{

    final ActivatePlasticCardFragment this$0;
    final Button val$activateButton;

    private void onSuccess(Void void1)
    {
        analyticsUtil.sendSuccess("ActivateWalletCard", new AnalyticsCustomDimension[0]);
        val$activateButton.setClickable(true);
        requestNav(W_IT_WORKS);
        getView().setVisibility(8);
        Views.hideSoftKeyboard(getActivity(), getView());
        fullScreenProgressSpinnerManager.hide();
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(ActivatePlasticCardFragment.access$100(), "Failed to activate card. Stack Trace:", exception);
        analyticsUtil.sendError("ActivateWalletCard", new AnalyticsCustomDimension[0]);
        fullScreenProgressSpinnerManager.hide();
        CallErrorDialogs.createBuilder(exception, com.google.android.apps.walletnfcrel._error_title, com.google.android.apps.walletnfcrel._error_text).ild().show(getActivity().getSupportFragmentManager());
        val$activateButton.setClickable(true);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Void)obj);
    }

    ilder()
    {
        this$0 = final_activateplasticcardfragment;
        val$activateButton = Button.this;
        super();
    }
}
