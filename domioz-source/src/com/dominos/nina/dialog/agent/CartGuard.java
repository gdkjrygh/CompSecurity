// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, CartConfirmAgent, UserIntentionAgent, CartCompleteGuard

public class CartGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/CartGuard.getSimpleName();

    public CartGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        if (CartConfirmAgent.proceedToCheckout)
        {
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "checkout");
            speechcontext.updateAgentConceptValue(CartCompleteGuard.CONCEPT, "DONE");
            speechcontext.updateAgentConceptValue(CONCEPT, "DONE");
            speechcontext.resetAgency(new String[] {
                "MenuAgency"
            });
            speechcontext.delayConversation();
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.GoToCheckout());
            return;
        }
        if (CartConfirmAgent.showCartWarningDialog)
        {
            CartConfirmAgent.showCartWarningDialog = false;
            return;
        } else
        {
            speechcontext.resetAgency(new String[] {
                "CartAgency"
            });
            speechcontext.delayConversation();
            return;
        }
    }

}
