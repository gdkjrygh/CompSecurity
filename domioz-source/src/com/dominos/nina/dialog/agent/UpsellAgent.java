// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.activities.CartActivity;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.nuance.b.a.z;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, UpsellAskGuard, CartConfirmAgent, CartCompleteGuard, 
//            UserIntentionAgent, UpsellGuard

public class UpsellAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/UpsellAgent.getSimpleName();
    private CartManager mCartManager;
    private LabsProductLine upsellProductLine;

    public UpsellAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        upsellProductLine = null;
        mCartManager = (CartManager)getSession().getManager("cart_manager");
        App.getInstance().bus.register(this);
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        String s = UpsellAskGuard.upsellCode;
        upsellProductLine = new LabsProductLine(mMenuManager.getVariant(s));
        mMenuManager.loadOptionsFromMenu(upsellProductLine);
        upsellProductLine.loadDefaultOptions();
        upsellProductLine.setQuantity(1);
        s = upsellProductLine.getName();
        String s1 = NumberUtil.formatPrice(Double.valueOf(upsellProductLine.getPrice()));
        PromptModel promptmodel = getPromptManager().getChapters("upsell").getPrompter("question").getRandomPrompt();
        speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[] {
            s, s1
        }), promptmodel.getSpeech(new Object[] {
            s
        }));
    }

    public List getHints(String s, z z)
    {
        if (name.equals(s))
        {
            return new ArrayList();
        } else
        {
            return new ArrayList();
        }
    }

    public void onBind(SpeechContext speechcontext)
    {
        if ((mSpeechManager.getCurrentNinaActivity() instanceof CartActivity) && mCartManager.isUpsellDisplayed() && !mCartManager.isUpsellAnswered())
        {
            speechcontext = speechcontext.getSurfaceMeaning(NAME);
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.UpsellAnswered("true".equals(speechcontext)));
        }
    }

    public void onCheckoutTapped(com.dominos.bus.events.OriginatedFromUX.CheckoutTapped checkouttapped)
    {
        if (c.i())
        {
            SpeechContext.updateAgents(new String[] {
                CartConfirmAgent.NAME, "false", CartCompleteGuard.NAME, "DONE", UserIntentionAgent.NAME, "checkout"
            });
        }
    }

    public void onUpsellProceededCheckout(com.dominos.bus.events.OriginatedFromUX.UpsellProceededCheckout upsellproceededcheckout)
    {
        if (c.i())
        {
            SpeechContext.updateAgents(new String[] {
                UpsellGuard.NAME, "DONE"
            });
        }
    }

    public void upsellAccepted(com.dominos.bus.events.OriginatedFromUX.UpsellAccepted upsellaccepted)
    {
        SpeechContext.updateAgents(new String[] {
            NAME, "true"
        });
    }

    public void upsellCanceled(com.dominos.bus.events.OriginatedFromUX.UpsellCanceled upsellcanceled)
    {
        SpeechContext.updateAgents(new String[] {
            UserIntentionAgent.NAME, "cart", "CartAgency", "RESET", "UpsellAgency", "RESET"
        });
    }

    public void upsellRejected(com.dominos.bus.events.OriginatedFromUX.UpsellRejected upsellrejected)
    {
        SpeechContext.updateAgents(new String[] {
            NAME, "false", UpsellGuard.NAME, "DONE"
        });
    }

}
