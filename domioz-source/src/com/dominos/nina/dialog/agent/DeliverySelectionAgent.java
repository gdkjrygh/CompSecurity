// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.nina.speech.SpeechContext;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, DeliveryCommandAgent

public class DeliverySelectionAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/DeliverySelectionAgent.getSimpleName();
    public static volatile AtomicBoolean retryPrompt = new AtomicBoolean(false);
    private UserProfileManager mProfileManager;

    public DeliverySelectionAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        mProfileManager = (UserProfileManager)getSession().getManager("user_manager");
        App.getInstance().bus.register(this);
    }

    private void moveConversationToNewAddressType(SpeechContext speechcontext)
    {
        speechcontext.updateAgentConceptValue(DeliveryCommandAgent.CONCEPT, "address_type");
        speechcontext.updateAgentConceptValue(CONCEPT, "1");
        speechcontext.delayConversation();
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        if (retryPrompt.getAndSet(false))
        {
            PromptModel promptmodel = getPromptManager().getChapters("store").getPrompter("pick").getRandomPrompt();
            speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
            return;
        }
        if (mProfileManager.isAuthorizedUser())
        {
            if (!mProfileManager.getCurrentUser().getAddressList().isEmpty())
            {
                String s = speechcontext.getSurfaceMeaning(DeliveryCommandAgent.NAME);
                if (StringHelper.equals(s, "other_address"))
                {
                    App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.NewAddressRequested());
                    speechcontext.delayConversation();
                    return;
                }
                if (StringHelper.equals(s, "primary"))
                {
                    speechcontext.updateAgentConceptValue(CONCEPT, "1");
                    speechcontext.delayConversation();
                    return;
                } else
                {
                    PromptModel promptmodel1 = getPromptManager().getChapters("store").getPrompter("either").getRandomPrompt();
                    speechcontext.addTextVoicePrompt(promptmodel1.getText(new Object[0]), promptmodel1.getSpeech(new Object[0]));
                    return;
                }
            } else
            {
                moveConversationToNewAddressType(speechcontext);
                return;
            }
        } else
        {
            moveConversationToNewAddressType(speechcontext);
            return;
        }
    }

}
