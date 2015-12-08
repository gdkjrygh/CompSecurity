// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.App;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.fordsync.interactions:
//            YesNoInteraction, CallStore_

public class ErrorHandler extends YesNoInteraction
{

    private String errorReason;
    AnalyticsUtil mAnalyticsUtil;

    public ErrorHandler()
    {
    }

    public PromptModel getInitialPrompt()
    {
        return prompts.getPrompter("initial_prompt").getPrompt(errorReason);
    }

    protected void no()
    {
        mAnalyticsUtil.postFordSyncErrorHandlerNo();
        super.no();
    }

    public ErrorHandler reason(String s)
    {
        errorReason = s;
        mAnalyticsUtil.postFordSyncErrorHandlerReason(s);
        return this;
    }

    public void start()
    {
        super.start();
        mAppLinkManager.updateLayout("TEXTBUTTONS_WITH_GRAPHIC");
    }

    protected void yes()
    {
        mAnalyticsUtil.postFordSyncErrorHandlerYes();
        super.yes();
        CallStore_.getInstance_(app.getBaseContext()).start();
    }
}
