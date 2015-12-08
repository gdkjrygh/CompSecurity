// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, CouponCommandAgent, CartConfirmAgent

public class CouponGlobalCommandAgent extends BaseAgent
{

    public static final String COMMAND_COUPON = "coupons";
    public static final String COMMAND_REDEEM = "redeem";
    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/CouponGlobalCommandAgent.getSimpleName();

    public CouponGlobalCommandAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
    }

    private void processCouponRequestCommand(SpeechContext speechcontext)
    {
        if (!StringHelper.equals(speechcontext.getSurfaceMeaning(CouponCommandAgent.NAME), "coupon_done"))
        {
            CartConfirmAgent.redirection = CartConfirmAgent.Redirection.COUPON;
        }
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        String s = speechcontext.getSurfaceMeaning(NAME);
        if (!StringHelper.equals(s, "redeem")) goto _L2; else goto _L1
_L1:
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.LoyaltyRedeem());
_L4:
        mSpeechManager.preventNinaPause();
        return;
_L2:
        if (StringHelper.equals(s, "coupons"))
        {
            processCouponRequestCommand(speechcontext);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
