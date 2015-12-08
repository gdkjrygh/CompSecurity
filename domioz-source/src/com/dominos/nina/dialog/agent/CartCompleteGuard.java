// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, UserIntentionAgent

public class CartCompleteGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/CartCompleteGuard.getSimpleName();

    public CartCompleteGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        speechcontext.resetAgency(new String[] {
            "OrderAgency"
        });
        speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "cart");
        speechcontext.delayConversation();
    }

}
