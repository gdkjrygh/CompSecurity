// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.progressspinner;

import android.app.Activity;

// Referenced classes of package com.google.android.apps.wallet.widgets.progressspinner:
//            ProgressSpinnerView

public class FullScreenProgressSpinnerManager
{

    private final Activity activity;
    private ProgressSpinnerView progressSpinnerView;

    public FullScreenProgressSpinnerManager(Activity activity1)
    {
        activity = activity1;
    }

    private ProgressSpinnerView getProgressSpinnerView()
    {
        if (progressSpinnerView == null)
        {
            progressSpinnerView = (ProgressSpinnerView)activity.findViewById(R.id.FullScreenProgressSpinner);
        }
        return progressSpinnerView;
    }

    public final void hide()
    {
        getProgressSpinnerView().hide();
    }

    public final void show()
    {
        getProgressSpinnerView().showDelayed();
    }

    public final void showImmediately()
    {
        getProgressSpinnerView().show();
    }
}
