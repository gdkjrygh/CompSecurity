// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.App;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.analytics.AnalyticsService;
import com.dominos.android.sdk.core.models.NinaPromptModel;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.fordsync.FordSyncSession;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.fordsync.service.SyncPowerAPI;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

public abstract class SyncInteraction
{

    protected static final String ERROR_PROMPT = "error_prompt";
    protected static final String HELP_PROMPT = "help_prompt";
    protected static final String INITIAL_PROMPT = "initial_prompt";
    protected static final String LOG_TAG = "SyncInteraction";
    protected static final String TIMEOUT_PROMPT = "timeout_prompt";
    protected AnalyticsService analyticsService;
    App app;
    protected NumberFormat currency;
    protected PromptCategoryModel genericPrompts;
    AppLinkManager mAppLinkManager;
    FordSyncSession mFordSyncSession;
    OrderUtil mOrderUtil;
    protected PromptCategoryModel prompts;
    SyncPowerAPI restApi;

    public SyncInteraction()
    {
        currency = NumberFormat.getCurrencyInstance(Locale.US);
    }

    private String getSpeech(String s)
    {
        PrompterModel promptermodel;
label0:
        {
            PrompterModel promptermodel1 = prompts.getPrompter(s);
            if (promptermodel1 != null)
            {
                promptermodel = promptermodel1;
                if (!promptermodel1.prompts.isEmpty())
                {
                    break label0;
                }
            }
            promptermodel = genericPrompts.getPrompter(s);
        }
        if (promptermodel != null && !promptermodel.prompts.isEmpty())
        {
            if ((s = promptermodel.getRandomPrompt()) != null && !StringHelper.isEmpty(s.getSpeech(new Object[0])))
            {
                return s.getSpeech(new Object[0]);
            }
        }
        return null;
    }

    public static String sanitizeProductInformation(String s)
    {
        return s.replaceAll("\\s+\\(.+\\)\\s+", " ").replaceAll("[\\u2122\\u00A9\\u00AE\\u00C2\\u00E2]", "").replaceAll("\\s+-\\s+", " ");
    }

    public abstract Vector getChoiceSets();

    public String getHelpPrompt()
    {
        return getSpeech("help_prompt");
    }

    public PromptModel getInitialPrompt()
    {
        return prompts.getPrompter("initial_prompt").getRandomPrompt();
    }

    public String getTimeoutPrompt()
    {
        return getSpeech("timeout_prompt");
    }

    public Vector getVrSynonyms()
    {
        return new Vector(prompts.getPrompter("initial_prompt").getHintsVector());
    }

    public abstract void handleChoice(int i);

    protected void setup()
    {
        analyticsService = (AnalyticsService)mFordSyncSession.getManager("analytics_manager");
        String s = getClass().getSimpleName().replace("_", "");
        NinaPromptModel ninapromptmodel = mAppLinkManager.getPromptModel();
        prompts = ninapromptmodel.getFordSync(s);
        genericPrompts = ninapromptmodel.getFordSync("generic");
    }

    public void start()
    {
        mAppLinkManager.interact(this);
    }
}
