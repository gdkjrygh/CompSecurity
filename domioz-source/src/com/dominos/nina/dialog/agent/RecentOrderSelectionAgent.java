// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
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
import com.nuance.b.e.c;
import java.util.ArrayList;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, UserIntentionAgent, ProfileGuard, RecentOrderConfirmAgent

public class RecentOrderSelectionAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/RecentOrderSelectionAgent.getSimpleName();
    protected static final String RECENT_SELECTION_DEFAULT = "1";
    protected static final String RECENT_SELECTION_NONE = "-1";
    private UserProfileManager mProfileManager;

    public RecentOrderSelectionAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        App.getInstance().bus.register(this);
        mProfileManager = (UserProfileManager)getSession().getManager("user_manager");
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        if (StringHelper.equals(speechcontext.getSurfaceMeaning(UserIntentionAgent.NAME), "easy"))
        {
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "recent");
            speechcontext.resetAgency(new String[] {
                "ProfileOrderAgency"
            });
            speechcontext.updateAgentConceptValue(ProfileGuard.CONCEPT, "DONE");
            speechcontext.delayConversation();
        } else
        {
            OrderUtil_ orderutil_ = OrderUtil_.getInstance_(App.getInstance().getBaseContext());
            if (speechcontext.getSurfaceMeaning(RecentOrderConfirmAgent.NAME) == null)
            {
                if (mProfileManager.getOrderHistoryList() != null)
                {
                    int i = mProfileManager.getRecentOrderHistoryList().size();
                    if (i > 0)
                    {
                        boolean flag = orderutil_.isProductsRemovedInHistoricalList(mProfileManager.getRecentOrderHistoryList());
                        if (i == 1)
                        {
                            if (flag)
                            {
                                PromptModel promptmodel = getPromptManager().getChapters("order").getPrompter("recent_choose_discontinued").getRandomPrompt();
                                speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
                                return;
                            } else
                            {
                                PromptModel promptmodel1 = getPromptManager().getChapters("order").getPrompter("recent_choose").getRandomPrompt();
                                speechcontext.addTextVoicePrompt(promptmodel1.getText(new Object[0]), promptmodel1.getSpeech(new Object[0]));
                                return;
                            }
                        }
                        if (flag)
                        {
                            PromptModel promptmodel2 = getPromptManager().getChapters("order").getPrompter("recent_details_discontinued").getRandomPrompt();
                            speechcontext.addTextVoicePrompt(promptmodel2.getText(new Object[0]), promptmodel2.getSpeech(new Object[0]));
                            return;
                        } else
                        {
                            PromptModel promptmodel3 = getPromptManager().getChapters("order").getPrompter("recent_choose_enum").getRandomPrompt();
                            speechcontext.addTextVoicePrompt(promptmodel3.getText(new Object[0]), promptmodel3.getSpeech(new Object[0]));
                            return;
                        }
                    }
                }
            } else
            if (speechcontext.getGroundedBooleanMeaning(RecentOrderConfirmAgent.NAME))
            {
                speechcontext.updateAgentConceptValue(CONCEPT, "1");
                return;
            } else
            {
                speechcontext.updateAgentConceptValue(CONCEPT, "-1");
                speechcontext.delayConversation();
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.GoBack());
                return;
            }
        }
    }

    public void onBind(SpeechContext speechcontext)
    {
        super.onBind(speechcontext);
    }

    public void processItemTapped(com.dominos.bus.events.OriginatedFromUX.RecentOrderHistoryItemTapped recentorderhistoryitemtapped)
    {
        if (c.i())
        {
            if (recentorderhistoryitemtapped.getItem() != 0)
            {
                recentorderhistoryitemtapped = Integer.toString(recentorderhistoryitemtapped.getItem());
            } else
            {
                recentorderhistoryitemtapped = "-1";
            }
            SpeechContext.updateAgents(new String[] {
                NAME, recentorderhistoryitemtapped
            });
        }
    }

}
