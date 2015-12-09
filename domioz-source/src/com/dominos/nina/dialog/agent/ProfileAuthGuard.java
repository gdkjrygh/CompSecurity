// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.e.c;
import com.nuance.b.e.z;
import java.util.ArrayList;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, UserIntentionAgent, EasyOrderConfirmAgent, RecentOrderSelectionAgent, 
//            RecentOrderConfirmAgent, CartConfirmAgent, IntentionAgent

public class ProfileAuthGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProfileAuthGuard.getSimpleName();

    public ProfileAuthGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    private void tellUserInvalidNumberAndReprompt(SpeechContext speechcontext)
    {
        PromptModel promptmodel = getPromptManager().getChapters("order").getPrompter("recent_invalid_enum").getRandomPrompt();
        speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        super.agentFocusIn(speechcontext);
        if (StringHelper.equals(speechcontext.getSurfaceMeaning(UserIntentionAgent.NAME), "easy") || StringHelper.equals(speechcontext.getSurfaceMeaning(UserIntentionAgent.NAME), "show_easy"))
        {
            boolean flag = speechcontext.getGroundedBooleanMeaning(EasyOrderConfirmAgent.NAME);
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.EasyOrderResponse(flag));
            speechcontext.delayConversation();
        } else
        if (StringHelper.equals(speechcontext.getSurfaceMeaning(UserIntentionAgent.NAME), "recent"))
        {
            String s = speechcontext.getSurfaceMeaning(RecentOrderSelectionAgent.NAME);
            int i;
            int j;
            if (StringHelper.isNotEmpty(s) && NumberUtil.isInteger(s))
            {
                i = Integer.parseInt(s) - 1;
            } else
            if (speechcontext.getGroundedBooleanMeaning(speechcontext.getSurfaceMeaning(RecentOrderConfirmAgent.NAME)))
            {
                i = 0;
            } else
            {
                i = -1;
            }
            j = ((UserProfileManager)getSession().getManager("user_manager")).getRecentOrderHistoryList().size();
            if (i >= 0 && i < j)
            {
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.RecentOrderSelection(i));
                speechcontext.delayConversation();
                return;
            } else
            {
                tellUserInvalidNumberAndReprompt(speechcontext);
                return;
            }
        }
    }

    public void onReorderCreated(com.dominos.bus.events.OriginatedFromUX.ReorderCreated reordercreated)
    {
        if (c.i())
        {
            CartConfirmAgent.prependedMention = CartConfirmAgent.Mention.ORDER;
            c.l().n();
            CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset("OrderAgency").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "cart").build());
        }
    }

}
