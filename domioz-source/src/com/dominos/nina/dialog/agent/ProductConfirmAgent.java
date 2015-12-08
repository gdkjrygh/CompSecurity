// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, ProductCompleteGuard

public class ProductConfirmAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductConfirmAgent.getSimpleName();

    public ProductConfirmAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        if (StringHelper.equals(speechcontext.getSurfaceMeaning(NAME), "true"))
        {
            ProductCompleteGuard.setUserSaidYes();
        } else
        if (StringHelper.equals(speechcontext.getSurfaceMeaning(NAME), "false"))
        {
            ProductCompleteGuard.setUserAddToOrder();
            return;
        }
    }

}
