// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.e.c;
import java.util.List;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, CouponSelectionAgent, UserIntentionAgent, CartConfirmAgent

public class CouponGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/CouponGuard.getSimpleName();

    public CouponGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    private void addCouponToCart(int i)
    {
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.CouponSelected(i));
    }

    private int getCouponSelection(SpeechContext speechcontext)
    {
        if (speechcontext == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        speechcontext = speechcontext.getSurfaceMeaning(CouponSelectionAgent.NAME);
        if (!StringHelper.isNotEmpty(speechcontext))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        int i = Integer.parseInt(speechcontext);
        return i - 1;
        speechcontext;
        return -1;
    }

    private boolean indexIsValid(int i)
    {
        List list = ((CouponWizardManager)getSession().getManager("coupon_wizard_manager")).getDisplayedCouponList();
        return i >= 0 && i < list.size();
    }

    private void moveConversationToCouponWizard()
    {
        SpeechContext.updateAgents(new String[] {
            UserIntentionAgent.NAME, "coupon_wizard", CouponSelectionAgent.NAME, "1", NAME, "DONE"
        });
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        int i = getCouponSelection(speechcontext);
        if (indexIsValid(i))
        {
            addCouponToCart(i);
            speechcontext.delayConversation();
            return;
        } else
        {
            speechcontext.addPrompter(getPromptManager().getChapters("coupon").getPrompter("selection_invalid"));
            speechcontext.delayConversation();
            speechcontext.resetAgency(new String[] {
                "CouponAgency"
            });
            return;
        }
    }

    public void couponLoaded(com.dominos.bus.events.OriginatedFromUX.CouponLoaded couponloaded)
    {
        if (!c.i())
        {
            return;
        }
        if (couponloaded.isSuccessfullyLoaded())
        {
            switch (_cls1..SwitchMap.com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType[couponloaded.getCouponStatusType().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                moveConversationToCouponWizard();
                return;

            case 2: // '\002'
                break;
            }
            if (couponloaded.getCouponLine().getCoupon().isBundled())
            {
                CartConfirmAgent.prependedMention = CartConfirmAgent.Mention.COUPONADDED;
                CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").build());
                return;
            } else
            {
                moveConversationToCouponWizard();
                return;
            }
        } else
        {
            SpeechContext.updateAgents(new String[] {
                "CouponAgency", "RESET"
            });
            return;
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType = new int[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.ValidCoupon.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.Fulfilled.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
