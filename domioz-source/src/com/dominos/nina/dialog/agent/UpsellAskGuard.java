// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.activities.CartActivity;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, UpsellAgent, UpsellGuard

public class UpsellAskGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/UpsellAskGuard.getSimpleName();
    public static String upsellCode;
    private CartManager mCartManager;

    public UpsellAskGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
        mCartManager = (CartManager)getSession().getManager("cart_manager");
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        if (mCartManager.isUpsellAnswered())
        {
            speechcontext.updateAgentConceptValue(UpsellAgent.CONCEPT, "false");
            speechcontext.updateAgentConceptValue(UpsellGuard.CONCEPT, "DONE");
        } else
        {
            shouldAskUpsell();
        }
        speechcontext.updateAgentConceptValue(CONCEPT, "DONE");
    }

    boolean shouldAskUpsell()
    {
        if (mSpeechManager.getCurrentNinaActivity() instanceof CartActivity)
        {
            String s = mCartManager.getUpsellCode();
            upsellCode = s;
            return StringHelper.isNotEmpty(s);
        } else
        {
            return false;
        }
    }

}
