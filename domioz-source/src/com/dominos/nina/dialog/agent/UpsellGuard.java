// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard

public class UpsellGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/UpsellGuard.getSimpleName();

    public UpsellGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        speechcontext.addTextPrompt(getPromptManager().getChapters("upsell").getPrompter("proceed_checkout").getRandomPrompt().getText(new Object[0]));
        speechcontext.delayConversation();
    }

}
