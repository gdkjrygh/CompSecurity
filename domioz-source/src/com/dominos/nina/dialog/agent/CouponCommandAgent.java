// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.e.c;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, CouponWizardGuard, CouponGlobalCommandAgent, UserIntentionAgent, 
//            CartConfirmAgent

public class CouponCommandAgent extends BaseAgent
{

    public static final String ADD_ANOTHER_ITEM = "add_another_item";
    public static String CONCEPT;
    public static final String COUPON_DONE = "coupon_done";
    public static final String MENULIST = "menu_list";
    public static final String NAME = com/dominos/nina/dialog/agent/CouponCommandAgent.getSimpleName();
    public static final String PRODUCT = "product";
    public static final String REMOVE = "remove";
    public static final String ROOTMENU = "menu_root";
    private CouponWizardManager mCouponWizardManager;

    public CouponCommandAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        App.getInstance().bus.register(this);
        mCouponWizardManager = (CouponWizardManager)getSession().getManager("coupon_wizard_manager");
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        String s = speechcontext.getSurfaceMeaning(NAME);
        if (StringHelper.equals(s, "remove"))
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.CouponRemoved());
            speechcontext.setAvoidFocusIn(true);
            speechcontext.delayConversation();
        } else
        {
            if (StringHelper.equals(s, "menu_root"))
            {
                CouponWizardGuard.redirection = CartConfirmAgent.Redirection.ROOTMENU;
                return;
            }
            if (StringHelper.equals(s, "menu_list"))
            {
                CouponWizardGuard.redirection = CartConfirmAgent.Redirection.MENULIST;
                return;
            }
            if (StringHelper.equals(s, "product"))
            {
                CouponWizardGuard.redirection = CartConfirmAgent.Redirection.PRODUCT;
                return;
            }
            if (StringHelper.equals(s, "add_another_item") && mCouponWizardManager.isCouponFulfilledButStillEditing())
            {
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.CouponAddAnotherItemRequested());
                speechcontext.setAvoidFocusIn(true);
                speechcontext.delayConversation();
                return;
            }
            if (StringHelper.equals(s, "coupon_done") && mCouponWizardManager.isCouponFulfilledButStillEditing())
            {
                CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset(CouponGlobalCommandAgent.NAME).appendReset("CartAgency").appendValue(UserIntentionAgent.NAME, "cart").appendValue(CouponWizardGuard.NAME, "DONE").build());
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.CouponDone());
                speechcontext.setAvoidFocusIn(true);
                speechcontext.delayConversation();
                return;
            }
        }
    }

    public void onCouponRemoved(com.dominos.bus.events.OriginatedFromUX.CouponRemoved couponremoved)
    {
        if (!c.i())
        {
            return;
        } else
        {
            CartConfirmAgent.prependedMention = CartConfirmAgent.Mention.COUPONREMOVED;
            CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset(CouponGlobalCommandAgent.NAME).appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").build());
            return;
        }
    }

    public void onMenuListRequested(com.dominos.bus.events.OriginatedFromUX.MenuListSelected menulistselected)
    {
        if (!c.i() || !menulistselected.isFromCouponWizard())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                NAME, "menu_list"
            });
            return;
        }
    }

    public void onProductSelected(com.dominos.bus.events.OriginatedFromUX.ProductSelected productselected)
    {
        if (!c.i() || !productselected.isFromCouponWizard())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                "CouponWizardAgency", "RESET"
            });
            return;
        }
    }

    public void onRootMenuRequested(com.dominos.bus.events.OriginatedFromUX.MenuSelected menuselected)
    {
        if (!c.i() || !menuselected.isFromCouponWizard())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                NAME, "menu_root"
            });
            return;
        }
    }

}
