// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.core.models.Prompts;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard

public class CarryoutLoadGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/CarryoutLoadGuard.getSimpleName();

    public CarryoutLoadGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        speechcontext.addTextPrompt(Prompts.loadingStores);
        speechcontext.delayConversation();
        speechcontext = new com.dominos.bus.events.SpeechEvents.SpeechActionEvent();
        speechcontext.setActionType(com.dominos.bus.events.SpeechEvents.ActionType.CARRYOUT_LOAD_GUARD_FOCUSED);
        App.getInstance().bus.post(speechcontext);
    }

}
