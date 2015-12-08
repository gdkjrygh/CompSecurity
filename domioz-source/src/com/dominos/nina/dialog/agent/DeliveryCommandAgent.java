// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class DeliveryCommandAgent extends BaseAgent
{

    public static final String COMMAND_ADDRESS_FORM = "address_form";
    public static final String COMMAND_ADDRESS_TYPE = "address_type";
    public static final String COMMAND_OTHER_ADDRESS = "other_address";
    public static final String COMMAND_PRIMARY = "primary";
    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/DeliveryCommandAgent.getSimpleName();

    public DeliveryCommandAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

}
