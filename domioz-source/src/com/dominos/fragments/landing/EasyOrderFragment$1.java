// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import com.dominos.activities.LandingActivity_;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.nina.speech.SpeechManager;

// Referenced classes of package com.dominos.fragments.landing:
//            EasyOrderFragment

class val.order
    implements com.dominos.dialogs.OnActionListener
{

    final EasyOrderFragment this$0;
    final LabsOrder val$order;

    public void onCanceled()
    {
        mSpeechManager.resetDialogModel();
    }

    public void onContinueAsGuest()
    {
    }

    public void onLoginSuccess()
    {
        reorder(val$order);
    }

    public void onSignOut()
    {
        mSpeechManager.resetDialogModel();
        ((com.dominos.activities.entBuilder_)LandingActivity_.intent(getActivity()).flags(0x4000000)).start();
    }

    der_()
    {
        this$0 = final_easyorderfragment;
        val$order = LabsOrder.this;
        super();
    }
}
