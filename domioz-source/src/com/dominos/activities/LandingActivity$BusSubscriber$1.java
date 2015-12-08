// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.App;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.nina.speech.SpeechManager;

// Referenced classes of package com.dominos.activities:
//            LandingActivity, StoreListActivity_

class val.actionEvent
    implements Runnable
{

    final is._cls0 this$1;
    final com.dominos.bus.events.is._cls0 val$actionEvent;

    public void run()
    {
        .dominos.bus.events.SpeechEvents.ActionType[val$actionEvent.etActionType().etActionType()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 41
    //                   2 68
    //                   3 138;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (mProfileManager.isAuthorizedUser())
        {
            showNoCachedAddressFragment();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        App.editor().ng("orderMode", "Carryout").ng();
        mSpeechManager.preventNinaPause();
        StoreListActivity_.intent(_fld0).start();
        if (LandingActivity.access$400(_fld0))
        {
            LandingActivity.access$502(_fld0, true);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        App.editor().ng("orderMode", "Delivery").ng();
        mSpeechManager.preventNinaPause();
        onDeliverySelected();
        if (LandingActivity.access$400(_fld0))
        {
            LandingActivity.access$502(_fld0, true);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    _()
    {
        this$1 = final__p;
        val$actionEvent = com.dominos.bus.events.val.actionEvent.this;
        super();
    }
}
