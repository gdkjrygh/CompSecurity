// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, ProductCompleteGuard

public class ProductCommandAgent extends BaseAgent
{

    public static final String ADD_TO_ORDER = "add_order";
    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductCommandAgent.getSimpleName();

    public ProductCommandAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        if (StringHelper.equals(speechcontext.getSurfaceMeaning(NAME), "add_order"))
        {
            ProductCompleteGuard.setUserAddToOrder();
        }
    }

}
