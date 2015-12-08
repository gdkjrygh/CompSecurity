// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.nina.speech.SpeechContext;
import com.nuance.b.a.z;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, IntentionAgent, UserIntentionAgent

public class ServiceMethodAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ServiceMethodAgent.getSimpleName();

    public ServiceMethodAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
        App.getInstance().bus.register(this);
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        com.dominos.bus.events.SpeechEvents.SpeechActionEvent speechactionevent = new com.dominos.bus.events.SpeechEvents.SpeechActionEvent();
        speechactionevent.setActionType(com.dominos.bus.events.SpeechEvents.ActionType.NEW_ORDER);
        App.getInstance().bus.post(speechactionevent);
        speechcontext.addPrompter(getPromptManager().getChapters("store").getPrompter("delivery_or_carryout"));
    }

    public void carryOutSelected(com.dominos.bus.events.OriginatedFromUX.CarryOutTapped carryouttapped)
    {
        if (c.i())
        {
            SpeechContext.updateAgents(new String[] {
                IntentionAgent.NAME, "order", UserIntentionAgent.NAME, "new", NAME, "carryout"
            });
        }
    }

    public void deliverySelected(com.dominos.bus.events.OriginatedFromUX.DeliveryTapped deliverytapped)
    {
        if (c.i())
        {
            SpeechContext.updateAgents(new String[] {
                IntentionAgent.NAME, "order", UserIntentionAgent.NAME, "new", NAME, "delivery"
            });
        }
    }

    public List getHints(String s, z z)
    {
        return new ArrayList();
    }

    public void newOrderSelected(com.dominos.bus.events.OriginatedFromUX.LandingNewOrderTapped landingnewordertapped)
    {
        if (c.i())
        {
            SpeechContext.updateAgents(new String[] {
                IntentionAgent.NAME, "order", UserIntentionAgent.NAME, "new"
            });
        }
    }

    public void onBind(SpeechContext speechcontext)
    {
        speechcontext = speechcontext.getSurfaceMeaning(NAME);
        com.dominos.bus.events.SpeechEvents.SpeechActionEvent speechactionevent = new com.dominos.bus.events.SpeechEvents.SpeechActionEvent();
        if ("carryout".equals(speechcontext))
        {
            speechactionevent.setActionType(com.dominos.bus.events.SpeechEvents.ActionType.CARRYOUT);
            App.getInstance().bus.post(speechactionevent);
        } else
        if ("delivery".equals(speechcontext))
        {
            speechactionevent.setActionType(com.dominos.bus.events.SpeechEvents.ActionType.DELIVERY);
            App.getInstance().bus.post(speechactionevent);
            return;
        }
    }

}
