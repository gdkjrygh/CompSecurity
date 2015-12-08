// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.e.c;
import com.nuance.b.e.z;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, DeliveryCommandAgent, DeliverySelectionAgent, IntentionAgent, 
//            UserIntentionAgent, CartConfirmAgent

public class DeliveryGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/DeliveryGuard.getSimpleName();
    private UserProfileManager mProfileManager;

    public DeliveryGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
        App.getInstance().bus.register(this);
        mProfileManager = (UserProfileManager)getSession().getManager("user_manager");
    }

    private void handleCommand(SpeechContext speechcontext, String s)
    {
        if (StringHelper.equals(s, "primary"))
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.DeliveryPrimaryAddressSelected());
        } else
        {
            if (StringHelper.equals(s, "address_type"))
            {
                s = getPromptManager().getChapters("store").getPrompter("delivery_address_type").getRandomPrompt();
                speechcontext.addTextVoicePrompt(s.getText(new Object[0]), s.getSpeech(new Object[0]));
                speechcontext.addHints(null);
                speechcontext.delayConversation();
                return;
            }
            if (StringHelper.equals(s, "address_form"))
            {
                s = getPromptManager().getChapters("store").getPrompter("delivery_address_form").getRandomPrompt();
                speechcontext.addTextVoicePrompt(s.getText(new Object[0]), s.getSpeech(new Object[0]));
                speechcontext.addHints(null);
                speechcontext.delayConversation();
                return;
            }
        }
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        String s = speechcontext.getSurfaceMeaning(DeliveryCommandAgent.NAME);
        if (StringHelper.isNotEmpty(s))
        {
            handleCommand(speechcontext, s);
        } else
        if (mProfileManager.isAuthorizedUser() && mProfileManager.getCurrentUser().getAddressList() != null && !mProfileManager.getCurrentUser().getAddressList().isEmpty())
        {
            String s1 = speechcontext.getSurfaceMeaning(DeliverySelectionAgent.NAME);
            if (NumberUtil.isInteger(s1))
            {
                int i = Integer.parseInt(s1);
                if (i > 0 && i <= mProfileManager.getCurrentUser().getAddressList().size())
                {
                    App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.DeliveryAddressSelected(i - 1));
                    return;
                }
                if (i == mProfileManager.getCurrentUser().getAddressList().size() + 1)
                {
                    App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.NewAddressRequested());
                    return;
                }
            }
            DeliverySelectionAgent.retryPrompt.set(true);
            speechcontext.delayConversation();
            speechcontext.resetAgency(new String[] {
                DeliverySelectionAgent.NAME
            });
            speechcontext.resetAgency(new String[] {
                NAME
            });
            return;
        }
    }

    public void onDeliveryAddressSelected(com.dominos.bus.events.OriginatedFromUX.DeliveryAddressSelected deliveryaddressselected)
    {
        if (c.i())
        {
            c.l().n();
            CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset("OrderAgency").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "cart").build());
        }
    }

    public void onNewAddressDismissed(com.dominos.bus.events.OriginatedFromUX.NewAddressDismissed newaddressdismissed)
    {
label0:
        {
            if (c.i())
            {
                if (!mProfileManager.isAuthorizedUser() || mProfileManager.getCurrentUser().getAddressList() == null || mProfileManager.getCurrentUser().getAddressList().isEmpty())
                {
                    break label0;
                }
                SpeechContext.updateAgents(new String[] {
                    "DeliveryAgency", "RESET"
                });
            }
            return;
        }
        mSpeechManager.resetDialogModel();
    }

    public void onNewAddressFormRequested(com.dominos.bus.events.OriginatedFromUX.NewAddressRequested newaddressrequested)
    {
        if (c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendValue(DeliverySelectionAgent.NAME, "1").appendValue(DeliveryCommandAgent.NAME, "address_form").build());
        }
    }

    public void onNewAddressTypeRequested(com.dominos.bus.events.OriginatedFromUX.NewAddressTypeRequested newaddresstyperequested)
    {
        if (c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendValue(DeliverySelectionAgent.NAME, "1").appendValue(DeliveryCommandAgent.NAME, "address_type").build());
        }
    }

}
