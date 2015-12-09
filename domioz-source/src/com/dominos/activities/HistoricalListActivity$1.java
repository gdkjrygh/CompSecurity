// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.nina.speech.SpeechManager;

// Referenced classes of package com.dominos.activities:
//            HistoricalListActivity

class val.order
    implements com.dominos.dialogs.ionListener
{

    final HistoricalListActivity this$0;
    final LabsOrder val$order;

    public void onCanceled()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.ose(HistoricalListActivity.access$100(HistoricalListActivity.this)));
    }

    public void onContinueAsGuest()
    {
    }

    public void onLoginSuccess()
    {
        HistoricalListActivity.access$200(HistoricalListActivity.this, val$order);
    }

    public void onSignOut()
    {
        mSpeechManager.resetDialogModel();
        finish();
    }

    ose()
    {
        this$0 = final_historicallistactivity;
        val$order = LabsOrder.this;
        super();
    }
}
