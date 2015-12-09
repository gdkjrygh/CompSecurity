// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class UserIntentionAgent extends BaseAgent
{

    public static final String CART = "cart";
    public static String CONCEPT;
    public static final String EASY = "easy";
    public static final String NAME = com/dominos/nina/dialog/agent/UserIntentionAgent.getSimpleName();
    public static final String NEW = "new";
    public static final String RECENT = "recent";
    public static final String SHOWEASY = "show_easy";

    public UserIntentionAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        OrderManager ordermanager = (OrderManager)getSession().getManager("order_manager");
        if (StringHelper.equals("easy", speechcontext.getSurfaceMeaning(NAME)) || StringHelper.equals("show_easy", speechcontext.getSurfaceMeaning(NAME)))
        {
            ordermanager.setOrderType(com.dominos.android.sdk.core.order.OrderManager.OrderType.EASY_ORDER);
        } else
        {
            if (StringHelper.equals("recent", speechcontext.getSurfaceMeaning(NAME)))
            {
                ordermanager.setOrderType(com.dominos.android.sdk.core.order.OrderManager.OrderType.RECENT_ORDERS);
                return;
            }
            if (StringHelper.equals("new", speechcontext.getSurfaceMeaning(NAME)))
            {
                ordermanager.setOrderType(com.dominos.android.sdk.core.order.OrderManager.OrderType.NEW_ORDER);
                return;
            }
        }
    }

}
