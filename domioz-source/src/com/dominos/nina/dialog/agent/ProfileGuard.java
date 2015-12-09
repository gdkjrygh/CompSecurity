// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.nuance.b.e.c;
import java.util.ArrayList;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, UserIntentionAgent, EasyOrderConfirmAgent, RecentOrderConfirmAgent, 
//            IntentionAgent

public class ProfileGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProfileGuard.getSimpleName();

    public ProfileGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        Object obj;
        UserProfileManager userprofilemanager;
        obj = (OrderManager)getSession().getManager("order_manager");
        userprofilemanager = (UserProfileManager)getSession().getManager("user_manager");
        if (!userprofilemanager.isAuthorizedUser()) goto _L2; else goto _L1
_L1:
        if (!((OrderManager) (obj)).getOrderType().equals(com.dominos.android.sdk.core.order.OrderManager.OrderType.EASY_ORDER)) goto _L4; else goto _L3
_L3:
        if (userprofilemanager.getEasyOrder() == null) goto _L6; else goto _L5
_L5:
        if (!StringHelper.equals(speechcontext.getSurfaceMeaning(UserIntentionAgent.NAME), "show_easy")) goto _L8; else goto _L7
_L7:
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.ShowEasyOrder());
_L12:
        speechcontext.updateAgentConceptValue(CONCEPT, "DONE");
        speechcontext.delayConversation();
_L10:
        return;
_L8:
        if (StringHelper.equals(speechcontext.getSurfaceMeaning(UserIntentionAgent.NAME), "easy"))
        {
            speechcontext.updateAgentConceptValue(EasyOrderConfirmAgent.CONCEPT, "true");
        }
        continue; /* Loop/switch isn't completed */
_L6:
        obj = getPromptManager().getChapters("order").getPrompter("no_easy").getRandomPrompt();
        speechcontext.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
        mSpeechManager.resetDialogModel(speechcontext);
        return;
_L4:
        if (!((OrderManager) (obj)).getOrderType().equals(com.dominos.android.sdk.core.order.OrderManager.OrderType.RECENT_ORDERS)) goto _L10; else goto _L9
_L9:
        boolean flag;
        if (userprofilemanager.getOrderHistoryList() != null && userprofilemanager.getOrderHistoryList().size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            PromptModel promptmodel = getPromptManager().getChapters("order").getPrompter("recent_no_recent").getRandomPrompt();
            speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
            mSpeechManager.resetDialogModel(speechcontext);
        } else
        if (StringHelper.isNotEmpty(speechcontext.getSurfaceMeaning(RecentOrderConfirmAgent.NAME)))
        {
            speechcontext.updateAgentConceptValue(CONCEPT, "DONE");
        } else
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.OpenRecentOrderList());
        }
        speechcontext.delayConversation();
        return;
_L2:
        PromptModel promptmodel1 = getPromptManager().getChapters("order").getPrompter("easy_recent_not_signed").getRandomPrompt();
        speechcontext.addTextVoicePrompt(promptmodel1.getText(new Object[0]), promptmodel1.getSpeech(new Object[0]));
        mSpeechManager.resetDialogModel(speechcontext);
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public void updateConversationToOrder(com.dominos.bus.events.OriginatedFromUX.LandingRecentOrderTapped landingrecentordertapped)
    {
        if (c.i())
        {
            SpeechContext.updateAgents(new String[] {
                IntentionAgent.NAME, "order", UserIntentionAgent.NAME, "recent", NAME, "DONE"
            });
        }
    }

}
