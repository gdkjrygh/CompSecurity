// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import android.content.SharedPreferences;
import com.dominos.App;
import com.dominos.activities.CartActivity;
import com.dominos.activities.CartActivity_;
import com.dominos.activities.LabsMenuListActivity;
import com.dominos.activities.LabsMenuListActivity_;
import com.dominos.activities.LabsRootMenuListActivity;
import com.dominos.activities.LabsRootMenuListActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.fordsync.StreetAbbreviationSanitizer;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.nina.util.DomPromptsUtil;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, ProductsAgent, CouponGlobalCommandAgent, ProductCompleteGuard, 
//            UserIntentionAgent, IntentionAgent, CartCommandAgent

public class CartConfirmAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/CartConfirmAgent.getSimpleName();
    private static String delayFocusCommands[];
    public static AtomicBoolean handlingRememberedProduct;
    private static LabsProduct prependProduct = null;
    public static Mention prependedMention;
    public static boolean proceedToCheckout = false;
    public static Redirection redirection;
    private static AtomicBoolean shouldResetCouponGlobalCommandAgent = new AtomicBoolean(false);
    public static boolean showCartWarningDialog = false;
    public static boolean userSaidYes = false;
    private CartManager mCartManager;
    DomProductManager mNinaHelper;
    private OrderManager mOrderManager;
    private StoreManager mStoreManager;

    public CartConfirmAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        App.getInstance().bus.register(this);
        mNinaHelper = (DomProductManager)getSession().getManager("dom_product_manager");
        mOrderManager = (OrderManager)getSession().getManager("order_manager");
        mStoreManager = (StoreManager)getSession().getManager("store_manager");
        mCartManager = (CartManager)getSession().getManager("cart_manager");
        handlingRememberedProduct = new AtomicBoolean(false);
    }

    public static void delayNextFocus(String as[])
    {
        LogUtil.d("NinaX", "CartConfirmAgent focus is delayed.", new Object[0]);
        delayFocusCommands = as;
    }

    private void handleProductRedirection(NinaPartialProduct ninapartialproduct, SpeechContext speechcontext)
    {
        Object obj;
        ArrayList arraylist;
        int j;
        if (StringHelper.isEmpty(ninapartialproduct.getSubcategory()))
        {
            obj = ninapartialproduct.getCategory();
        } else
        {
            obj = ninapartialproduct.getSubcategory();
        }
        arraylist = new ArrayList();
        obj = ((String) (obj)).split(":");
        j = obj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj1 = obj[i];
            obj1 = mMenuManager.getCategory(((String) (obj1)));
            if (obj1 != null && !((LabsCategory) (obj1)).getAllProducts().isEmpty())
            {
                arraylist.add(obj1);
            }
        }

        if (arraylist.size() > 0)
        {
            String s;
            Activity activity;
            if (ninapartialproduct.getProduct() != null)
            {
                s = ninapartialproduct.getProduct();
            } else
            {
                s = null;
            }
            activity = mSpeechManager.getCurrentNinaActivity();
            if (activity instanceof LabsMenuListActivity_)
            {
                activity.finish();
            }
            mSpeechManager.preventNinaPause();
            LabsMenuListActivity_.intent(activity).invokedFromRootMenu(activity instanceof LabsRootMenuListActivity_).categories(arraylist).ambiguousProductCode(s).start();
            if (ninapartialproduct.isTooAmbiguous())
            {
                speechcontext.addPrompter(getPromptManager().getChapters("menu").getPrompter("request_submenu"));
            } else
            {
                speechcontext.addPrompter(getPromptManager().getChapters("product").getPrompter("product_disambiguation"));
            }
            ProductsAgent.replacePartialProduct = true;
            return;
        } else
        {
            promptProductNotInStore(speechcontext);
            return;
        }
    }

    public static void prependProduct(LabsProduct labsproduct)
    {
        prependedMention = Mention.PRODUCT;
        prependProduct = labsproduct;
    }

    private void promptProductNotInStore(SpeechContext speechcontext)
    {
        if (!speechcontext.setErrorState(true))
        {
            speechcontext.addPrompter(getPromptManager().getChapters("product").getPrompter("not_store"));
        }
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        Object obj;
        delayFocusCommands = null;
        obj = mMenuManager.getStoreId();
        if (StringHelper.isEmpty(((String) (obj))) || !mOrderManager.getOrder().getStoreId().equals(obj) || !mMenuManager.isMenuLoaded())
        {
            speechcontext.delayConversation();
            return;
        }
        if (ProductsAgent.remembered != null)
        {
            ProductsAgent.addRememberedProductsToCart(mSpeechManager.getCurrentNinaActivity());
            handlingRememberedProduct.set(true);
        }
        obj = mNinaHelper.getCurrentPartialProduct();
        String s = speechcontext.getSurfaceMeaning(CouponGlobalCommandAgent.NAME);
        if (StringHelper.isNotEmpty(s) && !StringHelper.equals(s, "coupons"))
        {
            if (StringHelper.equals(s, "redeem"))
            {
                speechcontext.delayConversation();
                return;
            }
            if ((mSpeechManager.getCurrentNinaActivity() instanceof LabsRootMenuListActivity) || (mSpeechManager.getCurrentNinaActivity() instanceof LabsMenuListActivity))
            {
                mSpeechManager.preventNinaPause();
                ((com.dominos.activities.CartActivity_.IntentBuilder_)CartActivity_.intent(mSpeechManager.getCurrentNinaActivity()).flags(0x4000000)).start();
            }
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.AddCouponRequested(s));
            speechcontext.delayConversation();
            return;
        }
        if (obj != null && (redirection == null || redirection == Redirection.ROOTMENU))
        {
            redirection = null;
            if (mCartManager.canShowProductRemovedAlert(((NinaPartialProduct) (obj)).getProduct(), "3.0.1"))
            {
                speechcontext.delayConversation();
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.ShowProductReplaced(((NinaPartialProduct) (obj)).getProduct()));
                return;
            }
            if (((NinaPartialProduct) (obj)).isLostProductCode())
            {
                promptProductNotInStore(speechcontext);
                return;
            } else
            {
                ProductCompleteGuard.startedProduct = true;
                speechcontext.updateAgentConceptValue(ProductsAgent.CONCEPT, "DONE");
                speechcontext.resetAgency(new String[] {
                    "OrderAgency"
                });
                speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "detail");
                speechcontext.delayConversation();
                return;
            }
        }
        if (redirection == null) goto _L2; else goto _L1
_L1:
        if (redirection != Redirection.PRODUCT)
        {
            mNinaHelper.clearPartialProductsResetProductController();
        }
        _cls1..SwitchMap.com.dominos.nina.dialog.agent.CartConfirmAgent.Redirection[redirection.ordinal()];
        JVM INSTR tableswitch 1 8: default 400
    //                   1 405
    //                   2 522
    //                   3 543
    //                   4 604
    //                   5 621
    //                   6 648
    //                   7 675
    //                   8 702;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        redirection = null;
        return;
_L4:
        mSpeechManager.preventNinaPause();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.RootMenuSelected());
        obj = getPromptManager().getChapters("menu").getPrompter("question").getRandomPrompt();
        speechcontext.addTextVoicePrompt(null, getPromptManager().getChapters("menu").getPrompter("confirmation").getRandomPrompt().getSpeech(new Object[0]));
        speechcontext.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
        speechcontext.addHints(getPromptManager().getChapters("menu").getPrompter("confirmation").getHints());
        continue; /* Loop/switch isn't completed */
_L5:
        speechcontext.addPrompter(getPromptManager().getChapters("menu").getPrompter("request_submenu"));
        continue; /* Loop/switch isn't completed */
_L6:
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.CouponListRequested());
        speechcontext.resetAgency(new String[] {
            CouponGlobalCommandAgent.NAME
        });
        speechcontext.resetAgency(new String[] {
            "OrderAgency"
        });
        speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "coupon");
        speechcontext.delayConversation();
        continue; /* Loop/switch isn't completed */
_L7:
        speechcontext.updateAgentConceptValue(CONCEPT, "false");
        speechcontext.delayConversation();
        continue; /* Loop/switch isn't completed */
_L8:
        speechcontext.addPrompter(getPromptManager().getChapters("cart").getPrompter("edit_product"));
        speechcontext.pauseConversation();
        continue; /* Loop/switch isn't completed */
_L9:
        speechcontext.addPrompter(getPromptManager().getChapters("cart").getPrompter("remove_product"));
        speechcontext.pauseConversation();
        continue; /* Loop/switch isn't completed */
_L10:
        if (obj != null && (((NinaPartialProduct) (obj)).isTooAmbiguous() || ((NinaPartialProduct) (obj)).hasMultipleProducts()))
        {
            handleProductRedirection(((NinaPartialProduct) (obj)), speechcontext);
        }
        continue; /* Loop/switch isn't completed */
_L11:
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.GoogleWalletSelected());
        speechcontext.delayConversation();
        if (true) goto _L3; else goto _L2
_L2:
        obj = mOrderManager.getOrder();
        if (prependedMention == null) goto _L13; else goto _L12
_L12:
        _cls1..SwitchMap.com.dominos.nina.dialog.agent.CartConfirmAgent.Mention[prependedMention.ordinal()];
        JVM INSTR tableswitch 1 4: default 780
    //                   1 818
    //                   2 889
    //                   3 1053
    //                   4 1083;
           goto _L14 _L15 _L16 _L17 _L18
_L14:
        prependedMention = null;
_L13:
        if (((LabsOrder) (obj)).getLineCount() > 0 && !userSaidYes)
        {
            speechcontext.addPrompter(getPromptManager().getChapters("cart").getPrompter("anything_else"));
            return;
        }
        break; /* Loop/switch isn't completed */
_L15:
        if (prependProduct != null)
        {
            PrompterModel promptermodel = getPromptManager().getChapters("cart").getPrompter("add_confirmation");
            PromptModel promptmodel = promptermodel.getRandomPrompt();
            speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[] {
                prependProduct.getName()
            }));
            speechcontext.addHints(promptermodel.getHints());
        }
        continue; /* Loop/switch isn't completed */
_L16:
        ServiceMethod servicemethod = ServiceMethod.fromString(mOrderManager.getOrder().getServiceMethod());
        switch (_cls1..SwitchMap.com.dominos.android.sdk.common.dom.order.ServiceMethod[servicemethod.ordinal()])
        {
        case 1: // '\001'
            LabsAddress labsaddress = mOrderManager.getOrder().getStoreAddress();
            if (labsaddress != null)
            {
                String s1 = StreetAbbreviationSanitizer.sanitizeAndTrim(labsaddress.getStreet());
                PrompterModel promptermodel1 = getPromptManager().getChapters("cart").getPrompter("carryout_added");
                PromptModel promptmodel1 = promptermodel1.getRandomPrompt();
                speechcontext.addTextVoicePrompt(promptmodel1.getText(new Object[0]), promptmodel1.getSpeech(new Object[] {
                    s1, labsaddress.getCity()
                }));
                speechcontext.addHints(promptermodel1.getHints());
            }
            break;

        case 2: // '\002'
            speechcontext.addPrompter(getPromptManager().getChapters("cart").getPrompter("delivery_added"));
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        speechcontext.addPrompter(getPromptManager().getChapters("coupon").getPrompter(DomPromptsUtil.getLoyaltyPrompt(getSession(), "added_to_cart")));
        continue; /* Loop/switch isn't completed */
_L18:
        speechcontext.addPrompter(getPromptManager().getChapters("coupon").getPrompter(DomPromptsUtil.getLoyaltyPrompt(getSession(), "removed_from_wizard")));
        if (true) goto _L14; else goto _L19
_L19:
        userSaidYes = false;
        if (App.settings().getBoolean("firstTimeVoiceIntro", true))
        {
            speechcontext.addPrompter(getPromptManager().getChapters("cart").getPrompter("first_invocation"));
            App.editor().putBoolean("firstTimeVoiceIntro", false).commit();
            return;
        } else
        {
            speechcontext.addPrompter(getPromptManager().getChapters("cart").getPrompter("empty_cart"));
            return;
        }
    }

    public void goToBackToHome(com.dominos.bus.events.OriginatedFromUX.BackPressedOnCart backpressedoncart)
    {
        if (!c.i())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                "Application", "RESET"
            });
            return;
        }
    }

    public void menuLoaded(com.dominos.bus.events.OriginatedFromUX.MenuLoaded menuloaded)
    {
        SpeechContext.updateAgents(new String[] {
            "CartAgency", "RESET"
        });
    }

    public void onBind(SpeechContext speechcontext)
    {
        LabsOrder labsorder = mOrderManager.getOrder();
        NinaPartialProduct ninapartialproduct = mNinaHelper.getCurrentPartialProduct();
        Activity activity = mSpeechManager.getCurrentNinaActivity();
        if (speechcontext.getGroundedBooleanMeaning(NAME))
        {
            proceedToCheckout = false;
            if (ninapartialproduct == null)
            {
                userSaidYes = true;
            }
        } else
        {
            proceedToCheckout = false;
            if (labsorder != null && labsorder.getLineCount() != 0 && (activity instanceof CartActivity))
            {
                if (mCartManager.isCartAbleToCheckout())
                {
                    proceedToCheckout = true;
                    return;
                }
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.ShowCartWarning());
                showCartWarningDialog = true;
                return;
            }
        }
    }

    public void onCouponAddedResponse(com.dominos.bus.events.OriginatedFromUX.AddCouponResponse addcouponresponse)
    {
        switch (_cls1..SwitchMap.com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType[addcouponresponse.getCouponStatusType().ordinal()])
        {
        default:
            SpeechContext.updateAgents(new String[] {
                CouponGlobalCommandAgent.NAME, "RESET", "CartAgency", "RESET"
            });
            return;

        case 1: // '\001'
            if (addcouponresponse.getCouponLine().getCoupon().isBundled())
            {
                prependedMention = Mention.COUPONADDED;
                return;
            } else
            {
                shouldResetCouponGlobalCommandAgent.set(true);
                return;
            }

        case 2: // '\002'
            shouldResetCouponGlobalCommandAgent.set(true);
            return;
        }
    }

    public void onCouponCustomizationNeeded(com.dominos.bus.events.OriginatedFromUX.CouponCustomizationNeeded couponcustomizationneeded)
    {
        if (!c.i())
        {
            return;
        } else
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "coupon_wizard").build());
            return;
        }
    }

    public void onMenuListRequested(com.dominos.bus.events.OriginatedFromUX.MenuListSelected menulistselected)
    {
        if (!c.i() || menulistselected.isFromCouponWizard())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                CartCommandAgent.NAME, "menu_list"
            });
            return;
        }
    }

    public void proceedToCartFromCheckout(com.dominos.bus.events.OriginatedFromUX.BackPressedOnCheckout backpressedoncheckout)
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

    public void productSelected(com.dominos.bus.events.OriginatedFromUX.ProductSelected productselected)
    {
        if (!c.i() || productselected.isFromCouponWizard())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                "CartAgency", "RESET"
            });
            return;
        }
    }

    public void resumeDelayedFocus(com.dominos.bus.events.OriginatedFromUX.ResumeDelayedFocus resumedelayedfocus)
    {
        boolean flag;
        for (flag = false; !c.i() || delayFocusCommands == null || delayFocusCommands.length <= 0;)
        {
            return;
        }

        resumedelayedfocus = new CommandBuilder();
        int i = ((flag) ? 1 : 0);
        if (shouldResetCouponGlobalCommandAgent.getAndSet(false))
        {
            resumedelayedfocus.appendReset(CouponGlobalCommandAgent.NAME);
            i = ((flag) ? 1 : 0);
        }
        while (i < delayFocusCommands.length) 
        {
            String s = delayFocusCommands[i];
            String s1 = delayFocusCommands[i + 1];
            if (StringHelper.equals(s1, "RESET"))
            {
                resumedelayedfocus.appendReset(s);
            } else
            {
                resumedelayedfocus.appendValue(s, s1);
            }
            i += 2;
        }
        SpeechContext.updateAgents(resumedelayedfocus.build());
    }

    public void rootMenuSelected(com.dominos.bus.events.OriginatedFromUX.MenuSelected menuselected)
    {
        if (!c.i() || menuselected.isFromCouponWizard())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                IntentionAgent.NAME, "order", UserIntentionAgent.NAME, "cart", CartCommandAgent.NAME, "menu"
            });
            return;
        }
    }


    private class Mention extends Enum
    {

        private static final Mention $VALUES[];
        public static final Mention COUPONADDED;
        public static final Mention COUPONREMOVED;
        public static final Mention ORDER;
        public static final Mention PRODUCT;

        public static Mention valueOf(String s)
        {
            return (Mention)Enum.valueOf(com/dominos/nina/dialog/agent/CartConfirmAgent$Mention, s);
        }

        public static Mention[] values()
        {
            return (Mention[])$VALUES.clone();
        }

        static 
        {
            PRODUCT = new Mention("PRODUCT", 0);
            ORDER = new Mention("ORDER", 1);
            COUPONADDED = new Mention("COUPONADDED", 2);
            COUPONREMOVED = new Mention("COUPONREMOVED", 3);
            $VALUES = (new Mention[] {
                PRODUCT, ORDER, COUPONADDED, COUPONREMOVED
            });
        }

        private Mention(String s, int i)
        {
            super(s, i);
        }
    }


    private class Redirection extends Enum
    {

        private static final Redirection $VALUES[];
        public static final Redirection CHECKOUT;
        public static final Redirection COUPON;
        public static final Redirection GOOGLE_WALLET;
        public static final Redirection MENULIST;
        public static final Redirection PRODUCT;
        public static final Redirection PRODUCT_EDIT;
        public static final Redirection PRODUCT_REMOVE;
        public static final Redirection ROOTMENU;

        public static Redirection valueOf(String s)
        {
            return (Redirection)Enum.valueOf(com/dominos/nina/dialog/agent/CartConfirmAgent$Redirection, s);
        }

        public static Redirection[] values()
        {
            return (Redirection[])$VALUES.clone();
        }

        static 
        {
            COUPON = new Redirection("COUPON", 0);
            ROOTMENU = new Redirection("ROOTMENU", 1);
            MENULIST = new Redirection("MENULIST", 2);
            PRODUCT = new Redirection("PRODUCT", 3);
            PRODUCT_EDIT = new Redirection("PRODUCT_EDIT", 4);
            PRODUCT_REMOVE = new Redirection("PRODUCT_REMOVE", 5);
            CHECKOUT = new Redirection("CHECKOUT", 6);
            GOOGLE_WALLET = new Redirection("GOOGLE_WALLET", 7);
            $VALUES = (new Redirection[] {
                COUPON, ROOTMENU, MENULIST, PRODUCT, PRODUCT_EDIT, PRODUCT_REMOVE, CHECKOUT, GOOGLE_WALLET
            });
        }

        private Redirection(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[];
        static final int $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[];
        static final int $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[];
        static final int $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType = new int[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.Fulfilled.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror15) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.ValidCoupon.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention = new int[Mention.values().length];
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[Mention.PRODUCT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[Mention.ORDER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[Mention.COUPONADDED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[Mention.COUPONREMOVED.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod = new int[ServiceMethod.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.CARRYOUT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.DELIVERY.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection = new int[Redirection.values().length];
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[Redirection.ROOTMENU.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[Redirection.MENULIST.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[Redirection.COUPON.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[Redirection.CHECKOUT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[Redirection.PRODUCT_EDIT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[Redirection.PRODUCT_REMOVE.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[Redirection.PRODUCT.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[Redirection.GOOGLE_WALLET.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
