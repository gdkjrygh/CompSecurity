// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import com.dominos.App;
import com.dominos.activities.LabsCouponWizardActivity;
import com.dominos.activities.LabsMenuListActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.models.CouponWizardLineHolder;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.controllers.CouponWizardController;
import com.dominos.controllers.CouponWizardController_;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.nina.util.DomPromptsUtil;
import com.dominos.utils.CommandBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, ProductsAgent, CouponCommandAgent, UserIntentionAgent, 
//            CouponConfirmAgent, CartConfirmAgent

public class CouponWizardGuard extends BaseGuard
{

    public static String CONCEPT;
    private static final int INDEX_FIRST_PRODUCT = 0;
    public static final String NAME = com/dominos/nina/dialog/agent/CouponWizardGuard.getSimpleName();
    private static AtomicBoolean promptProductAdded = new AtomicBoolean(false);
    public static CartConfirmAgent.Redirection redirection = null;
    private CartManager mCartManager;
    private CouponWizardManager mCouponWizardManager;
    protected DomProductManager mNinaHelper;
    private OrderManager mOrderManager;
    private boolean promptIntro;

    public CouponWizardGuard(String s)
    {
        super(NAME, s);
        promptIntro = true;
        CONCEPT = s;
        mNinaHelper = (DomProductManager)getSession().getManager("dom_product_manager");
        mOrderManager = (OrderManager)getSession().getManager("order_manager");
        mCartManager = (CartManager)getSession().getManager("cart_manager");
        mCouponWizardManager = (CouponWizardManager)getSession().getManager("coupon_wizard_manager");
        App.getInstance().bus.register(this);
    }

    private void handleProduct(Activity activity, SpeechContext speechcontext)
    {
        Object obj = mNinaHelper.getCurrentPartialProduct();
        Object obj1 = CouponWizardController_.getInstance_(activity);
        HashMap hashmap = new HashMap();
        hashmap.putAll(((CouponWizardController) (obj1)).createProductGroupMapFromVariantList(((NinaPartialProduct) (obj)).getVariantAsList()));
        Object obj2 = LabsCategory.getInstance(mMenuManager.getFoodCategory());
        ((CouponWizardController) (obj1)).filterCategory(((LabsCategory) (obj2)), hashmap);
        ((LabsCategory) (obj2)).pruneCategory();
        obj1 = new ArrayList();
        for (obj2 = ((LabsCategory) (obj2)).getCategoryList().iterator(); ((Iterator) (obj2)).hasNext(); ((ArrayList) (obj1)).add((LabsCategory)((Iterator) (obj2)).next())) { }
        if (((NinaPartialProduct) (obj)).getProductAsList().size() > 1)
        {
            obj = ((NinaPartialProduct) (obj)).getProduct();
        } else
        {
            obj = null;
        }
        mSpeechManager.preventNinaPause();
        LabsMenuListActivity_.intent(activity).categories(((ArrayList) (obj1))).ambiguousProductCode(((String) (obj))).start();
        speechcontext.addPrompter(getPromptManager().getChapters("menu").getPrompter("request_submenu"));
        ProductsAgent.replacePartialProduct = true;
    }

    private boolean isCouponWizardAlreadyStarted()
    {
        for (Iterator iterator = mCouponWizardManager.getCouponWizardHolderList().iterator(); iterator.hasNext();)
        {
            if (((CouponWizardLineHolder)iterator.next()).getLine() instanceof LabsProductLine)
            {
                return true;
            }
        }

        return false;
    }

    public static void promptProductAdded()
    {
        promptProductAdded.set(true);
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        if (mCouponWizardManager.getCouponLine() == null)
        {
            break MISSING_BLOCK_LABEL_813;
        }
        if (redirection == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.dominos.nina.dialog.agent.CartConfirmAgent.Redirection[redirection.ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 57
    //                   2 151
    //                   3 172;
           goto _L3 _L4 _L5 _L6
_L3:
        redirection = null;
        return;
_L4:
        PromptModel promptmodel = getPromptManager().getChapters("menu").getPrompter("question").getRandomPrompt();
        speechcontext.addTextVoicePrompt(null, getPromptManager().getChapters("menu").getPrompter("confirmation").getRandomPrompt().getSpeech(new Object[0]));
        speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
        speechcontext.addHints(getPromptManager().getChapters("menu").getPrompter("confirmation").getHints());
        continue; /* Loop/switch isn't completed */
_L5:
        speechcontext.addPrompter(getPromptManager().getChapters("menu").getPrompter("request_submenu"));
        continue; /* Loop/switch isn't completed */
_L6:
        handleProduct(mSpeechManager.getCurrentNinaActivity(), speechcontext);
        if (true) goto _L3; else goto _L2
_L2:
        Object obj = mNinaHelper.getCurrentPartialProduct();
        if (obj != null)
        {
            if (mCartManager.canShowProductRemovedAlert(((NinaPartialProduct) (obj)).getProduct(), "3.0.1"))
            {
                speechcontext.delayConversation();
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.ShowProductReplaced(((NinaPartialProduct) (obj)).getProduct()));
                return;
            } else
            {
                speechcontext.resetAgency(new String[] {
                    CouponCommandAgent.NAME
                });
                speechcontext.updateAgentConceptValue(ProductsAgent.CONCEPT, "DONE");
                speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "detail");
                speechcontext.updateAgentConceptValue(CONCEPT, "DONE");
                speechcontext.delayConversation();
                return;
            }
        }
        obj = getPromptManager().getChapters("coupon").getPrompter("next_item").getHints();
        boolean flag = mSpeechManager.getCurrentNinaActivity() instanceof LabsCouponWizardActivity;
        if (mCouponWizardManager.isCouponFulfilledButStillEditing() && flag)
        {
            if (StringHelper.isEmpty(speechcontext.getSurfaceMeaning(CouponConfirmAgent.NAME)))
            {
                obj = getPromptManager().getChapters("coupon").getPrompter("add_another_item").getRandomPrompt();
                speechcontext.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
                obj = getPromptManager().getChapters("coupon").getPrompter("add_another_item").getHints();
            } else
            {
                if (speechcontext.getGroundedBooleanMeaning(CouponConfirmAgent.NAME))
                {
                    App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.CouponAddAnotherItemRequested());
                } else
                {
                    CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset("CartAgency").appendValue(UserIntentionAgent.NAME, "cart").appendValue(NAME, "DONE").build());
                    App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.CouponDone());
                }
                speechcontext.delayConversation();
            }
        } else
        if (isCouponWizardAlreadyStarted())
        {
            promptIntro = true;
            PromptModel promptmodel1 = getPromptManager().getChapters("coupon").getPrompter("next_item").getRandomPrompt();
            if (promptProductAdded.getAndSet(false))
            {
                String s = ((LabsProductLine)mOrderManager.getOrder().getProductLineList().get(0)).getProduct().getName();
                PromptModel promptmodel4 = getPromptManager().getChapters("coupon").getPrompter(DomPromptsUtil.getLoyaltyPrompt(getSession(), "product_added")).getRandomPrompt();
                speechcontext.addTextVoicePrompt((new StringBuilder()).append(promptmodel4.getText(new Object[] {
                    s
                })).append(promptmodel1.getText(new Object[0])).toString(), (new StringBuilder()).append(promptmodel4.getSpeech(new Object[] {
                    s
                })).append(promptmodel1.getSpeech(new Object[0])).toString());
            } else
            {
                speechcontext.addTextVoicePrompt(promptmodel1.getText(new Object[0]), promptmodel1.getSpeech(new Object[0]));
            }
        } else
        if (promptIntro)
        {
            promptIntro = false;
            PromptModel promptmodel2 = getPromptManager().getChapters("coupon").getPrompter(DomPromptsUtil.getLoyaltyPrompt(getSession(), "wizard_intro")).getRandomPrompt();
            speechcontext.addTextVoicePrompt(promptmodel2.getText(new Object[0]), promptmodel2.getSpeech(new Object[0]));
        } else
        {
            PromptModel promptmodel3 = getPromptManager().getChapters("coupon").getPrompter("next_item").getRandomPrompt();
            speechcontext.addTextVoicePrompt(promptmodel3.getText(new Object[0]), promptmodel3.getSpeech(new Object[0]));
        }
        speechcontext.addHints(((com.dominos.android.sdk.core.models.HintModel) (obj)));
        return;
        speechcontext.resetAgency(new String[] {
            "OrderAgency"
        });
        speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "cart");
        speechcontext.delayConversation();
        return;
    }

    public void onCouponCompleted(com.dominos.bus.events.OriginatedFromUX.CouponCompleted couponcompleted)
    {
        CartConfirmAgent.prependedMention = CartConfirmAgent.Mention.COUPONADDED;
        CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").build());
    }

    public void onCouponReset(com.dominos.bus.events.OriginatedFromUX.CouponReset couponreset)
    {
        promptIntro = true;
    }


    private class _cls1
    {

        static final int $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[];

        static 
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection = new int[CartConfirmAgent.Redirection.values().length];
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[CartConfirmAgent.Redirection.ROOTMENU.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[CartConfirmAgent.Redirection.MENULIST.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[CartConfirmAgent.Redirection.PRODUCT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
