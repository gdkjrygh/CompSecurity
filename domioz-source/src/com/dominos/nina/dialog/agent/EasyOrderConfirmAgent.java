// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, UserIntentionAgent

public class EasyOrderConfirmAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/EasyOrderConfirmAgent.getSimpleName();

    public EasyOrderConfirmAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        if (StringHelper.equals(speechcontext.getSurfaceMeaning(UserIntentionAgent.NAME), "easy"))
        {
            speechcontext.updateAgentConceptValue(CONCEPT, "true");
            speechcontext.delayConversation();
            return;
        }
        Object obj = (UserProfileManager)getSession().getManager("user_manager");
        if (OrderUtil_.getInstance_(App.getInstance().getBaseContext()).isHistoricalProductsRemoved(((UserProfileManager) (obj)).getEasyOrder()))
        {
            obj = getPromptManager().getChapters("order").getPrompter("easy_details_discontinued").getRandomPrompt();
        } else
        {
            obj = getPromptManager().getChapters("order").getPrompter("easy_details").getRandomPrompt();
        }
        speechcontext.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
    }

    public void onBind(SpeechContext speechcontext)
    {
    }

}
