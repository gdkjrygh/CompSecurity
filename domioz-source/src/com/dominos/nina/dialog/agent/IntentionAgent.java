// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.content.SharedPreferences;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.a.z;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, CouponGlobalCommandAgent, ProductsAgent, UserIntentionAgent, 
//            VanityAgent

public class IntentionAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/IntentionAgent.getSimpleName();
    public static final String ORDER = "order";
    private static final String PRIVACY = "privacy";
    private static final String PROFILE = "profile";
    private static final String TRACKER = "tracker";

    public IntentionAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        UserProfileManager userprofilemanager = (UserProfileManager)getSession().getManager("user_manager");
        Object obj = speechcontext.getSurfaceMeaning(CouponGlobalCommandAgent.NAME);
        if (StringHelper.isNotEmpty(ProductsAgent.remembered) || StringHelper.isNotEmpty(((String) (obj))) && !StringHelper.equals(((String) (obj)), "redeem"))
        {
            speechcontext.updateAgentConceptValue(CONCEPT, "order");
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "new");
            speechcontext.delayConversation();
            return;
        }
        StringBuilder stringbuilder = new StringBuilder("");
        StringBuilder stringbuilder1 = new StringBuilder("");
        PromptCategoryModel promptcategorymodel = getPromptManager().getChapters("landing");
        if (App.settings().getBoolean("firstTimeVoiceIntro", true))
        {
            if (userprofilemanager.isUserWithOrderHistory())
            {
                if (userprofilemanager.getEasyOrder() == null)
                {
                    obj = "first_invocation_profiled_noeasy";
                } else
                {
                    obj = "first_invocation_profiled";
                }
            } else
            {
                obj = "first_invocation_anonymous";
            }
            obj = promptcategorymodel.getPrompter(((String) (obj))).getRandomPrompt();
            stringbuilder.append((new StringBuilder()).append(((PromptModel) (obj)).getText(new Object[0])).append(" ").toString());
            stringbuilder1.append((new StringBuilder()).append(((PromptModel) (obj)).getSpeech(new Object[0])).append(" ").toString());
            App.editor().putBoolean("firstTimeVoiceIntro", false).commit();
        } else
        {
            if (mSpeechManager.shouldInitialGreet())
            {
                mSpeechManager.setShouldInitialGreet(false);
                obj = promptcategorymodel.getPrompter("greeting").getRandomPrompt();
                stringbuilder.append((new StringBuilder()).append(((PromptModel) (obj)).getText(new Object[0])).append(" ").toString());
                stringbuilder1.append((new StringBuilder()).append(((PromptModel) (obj)).getSpeech(new Object[0])).append(" ").toString());
            }
            VanityAgent.hasMeaning = false;
            if (userprofilemanager.isAuthorizedUser() && userprofilemanager.getEasyOrder() != null)
            {
                obj = promptcategorymodel.getPrompter("determine").getRandomPrompt();
                stringbuilder.append(((PromptModel) (obj)).getText(new Object[0]));
                stringbuilder1.append(((PromptModel) (obj)).getSpeech(new Object[0]));
            } else
            if (userprofilemanager.isAuthorizedUser() && userprofilemanager.getRecentOrderHistoryList() != null && userprofilemanager.getRecentOrderHistoryList().size() > 0)
            {
                obj = promptcategorymodel.getPrompter("determine_no_easy").getRandomPrompt();
                stringbuilder.append(((PromptModel) (obj)).getText(new Object[0]));
                stringbuilder1.append(((PromptModel) (obj)).getSpeech(new Object[0]));
            } else
            {
                obj = promptcategorymodel.getPrompter("determine_new_order").getRandomPrompt();
                stringbuilder.append(((PromptModel) (obj)).getText(new Object[0]));
                stringbuilder1.append(((PromptModel) (obj)).getSpeech(new Object[0]));
            }
        }
        speechcontext.addTextVoicePrompt(stringbuilder.toString(), stringbuilder1.toString());
        if (userprofilemanager.isAuthorizedUser())
        {
            obj = "first_invocation_profiled";
        } else
        {
            obj = "first_invocation_anonymous";
        }
        speechcontext.addHints(promptcategorymodel.getPrompter(((String) (obj))).getHints());
    }

    public List getHints(String s, z z)
    {
        return new ArrayList();
    }

    public void onBackPressedNewOrder(com.dominos.bus.events.OriginatedFromUX.BackPressedOnLandingActivity backpressedonlandingactivity)
    {
        ProductsAgent.remembered = null;
        SpeechContext.updateAgents(new String[] {
            "Application", "RESET"
        });
    }

    public void onBind(SpeechContext speechcontext)
    {
        super.onBind(speechcontext);
        String s = speechcontext.getSurfaceMeaning(NAME);
        if (StringHelper.equals(s, "privacy") || StringHelper.equals(s, "profile") || StringHelper.equals(s, "tracker"))
        {
            PromptModel promptmodel = getPromptManager().getChapters("global").getPrompter("tap_that").getRandomPrompt();
            speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
            speechcontext.stopConversation();
            speechcontext.setAvoidFocusIn(true);
        }
    }

    public void onShowEasyOrderRequested(com.dominos.bus.events.OriginatedFromUX.ShowEasyOrder showeasyorder)
    {
        if (c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendValue(NAME, "order").appendValue(UserIntentionAgent.NAME, "show_easy").build());
        }
    }

}
