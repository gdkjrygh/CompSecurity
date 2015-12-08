// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, UpsellAgent, IntentionAgent, UserIntentionAgent, 
//            ServiceMethodAgent, CartCompleteGuard, UpsellAskGuard, UpsellGuard

public class OrderGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/OrderGuard.getSimpleName();
    private CartManager mCartManager;
    private OrderManager mOrderManager;

    public OrderGuard(String s)
    {
        super(NAME, s);
        mOrderManager = (OrderManager)getSession().getManager("order_manager");
        mCartManager = (CartManager)getSession().getManager("cart_manager");
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    public void agentFocusIn(final SpeechContext sc)
    {
        boolean flag = sc.getGroundedBooleanMeaning(UpsellAgent.NAME);
        if (!mCartManager.isUpsellDisplayed()) goto _L2; else goto _L1
_L1:
        mCartManager.setUpsellDisplayed(false);
        if (!flag) goto _L4; else goto _L3
_L3:
        PromptModel promptmodel = getPromptManager().getChapters("upsell").getPrompter("accept").getRandomPrompt();
        sc.addTextVoicePrompt(promptmodel.getText(new Object[] {
            NumberUtil.formatPrice(Double.valueOf(mOrderManager.getOrder().getPrice()))
        }), promptmodel.getSpeech(new Object[0]));
_L2:
        PromptModel promptmodel1 = getPromptManager().getChapters("checkout").getPrompter("place_order").getRandomPrompt();
        sc.addTextVoicePrompt("".concat(promptmodel1.getText(new Object[0])), "".concat(promptmodel1.getSpeech(new Object[0])));
        sc.sendRunnableState(new _cls1());
        return;
_L4:
        if (!mCartManager.isUpsellDismissed())
        {
            sc.addTextVoicePrompt(null, getPromptManager().getChapters("upsell").getPrompter("decline").getRandomPrompt().getSpeech(new Object[0]));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void updateOrderPlaced(com.dominos.bus.events.OriginatedFromUX.OrderPlaced orderplaced)
    {
        SpeechContext.updateAgents(new String[] {
            IntentionAgent.NAME, "order", UserIntentionAgent.NAME, "checkout", ServiceMethodAgent.NAME, "skip", CartCompleteGuard.NAME, "DONE", UpsellAskGuard.NAME, "DONE", 
            UpsellAgent.NAME, "false", UpsellGuard.NAME, "DONE", NAME, "order_completed"
        });
    }


    private class _cls1
        implements Runnable
    {

        final OrderGuard this$0;
        final SpeechContext val$sc;

        public void run()
        {
            if (mSpeechManager.getCurrentNinaActivity() instanceof LabsCheckoutActivity)
            {
                mSpeechManager.removeInvokeButton();
            }
            sc.stopConversation();
            sc.updateNinaNextState();
        }

        _cls1()
        {
            this$0 = OrderGuard.this;
            sc = speechcontext;
            super();
        }
    }

}
