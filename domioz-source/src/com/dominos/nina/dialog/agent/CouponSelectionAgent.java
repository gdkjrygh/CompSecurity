// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.nina.speech.SpeechContext;
import com.nuance.b.a.z;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, CouponGlobalCommandAgent, UserIntentionAgent

public class CouponSelectionAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/CouponSelectionAgent.getSimpleName();

    public CouponSelectionAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    private void processCoupon(String s)
    {
        s = mMenuManager.getCoupon(s);
        if (s != null)
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.CouponSelectedFromGlobal(s));
        }
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        String s = speechcontext.getSurfaceMeaning(CouponGlobalCommandAgent.NAME);
        if (StringHelper.isNotEmpty(s) && !StringHelper.equals(s, "coupons"))
        {
            processCoupon(s);
            speechcontext.delayConversation();
            return;
        }
        if (mMenuManager.hasCoupons())
        {
            speechcontext.addPrompter(getPromptManager().getChapters("coupon").getPrompter("selection"));
            return;
        } else
        {
            PromptModel promptmodel = getPromptManager().getChapters("alert").getPrompter("generic").getRandomPrompt();
            speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
            speechcontext.delayConversation();
            return;
        }
    }

    public List getHints(String s, z z)
    {
        return new ArrayList();
    }

    public void moveConversationBackFromCoupon(com.dominos.bus.events.OriginatedFromUX.BackPressedOnCoupons backpressedoncoupons)
    {
        if (!c.i())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                "OrderAgency", "RESET", UserIntentionAgent.NAME, "cart"
            });
            return;
        }
    }

    public void moveConversationToCoupon(com.dominos.bus.events.OriginatedFromUX.CouponsSelected couponsselected)
    {
        if (!c.i())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                "OrderAgency", "RESET", UserIntentionAgent.NAME, "coupon"
            });
            return;
        }
    }

    public void onBind(SpeechContext speechcontext)
    {
    }

}
