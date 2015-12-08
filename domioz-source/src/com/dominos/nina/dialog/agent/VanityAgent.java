// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class VanityAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/VanityAgent.getSimpleName();
    public static boolean hasMeaning = false;
    private ConfigurationManager mConfigurationManager;

    public VanityAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        mConfigurationManager = (ConfigurationManager)getSession().getManager("configuration_manager");
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        Object obj = speechcontext.getSurfaceMeaning(NAME);
        if (StringHelper.isNotEmpty(((String) (obj))))
        {
            hasMeaning = true;
            PrompterModel promptermodel = getPromptManager().getChapters("vanity").getPrompter(((String) (obj)));
            if (promptermodel != null)
            {
                if (StringHelper.equals(((String) (obj)), "vanity_call_from_ceo") && mConfigurationManager.getApplicationConfiguration().isPromotionCampaignEnabled())
                {
                    App.easterEggs = true;
                }
                obj = promptermodel.getRandomPrompt();
                speechcontext.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
            }
        }
    }

}
