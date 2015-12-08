// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.nina.speech.SpeechContext;
import com.dominos.utils.CommandBuilder;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, UserIntentionAgent, CartConfirmAgent

public class NewOrderGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/NewOrderGuard.getSimpleName();

    public NewOrderGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset(UserIntentionAgent.NAME).appendValue(UserIntentionAgent.NAME, "cart").appendValue(NAME, "DONE").build());
        speechcontext.delayConversation();
    }

}
