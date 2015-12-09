// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, CartConfirmAgent

public class CartCommandAgent extends BaseAgent
{

    public static final String CANCEL = "cancel";
    public static final String CHECKOUT = "checkout";
    public static String CONCEPT;
    public static final String COUPONS = "coupons";
    public static final String EDIT = "edit";
    public static final String GOOGLE_WALLET = "google_wallet";
    public static final String MENU = "menu";
    public static final String MENU_LIST = "menu_list";
    public static final String NAME = com/dominos/nina/dialog/agent/CartCommandAgent.getSimpleName();
    public static final String PRODUCT = "product";

    public CartCommandAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        super.onBind(speechcontext);
        if (StringHelper.equals("menu", speechcontext.getSurfaceMeaning(NAME)))
        {
            CartConfirmAgent.redirection = CartConfirmAgent.Redirection.ROOTMENU;
            ((DomProductManager)getSession().getManager("dom_product_manager")).clearPartialProductsResetProductController();
        } else
        {
            if (StringHelper.equals("coupons", speechcontext.getSurfaceMeaning(NAME)))
            {
                CartConfirmAgent.redirection = CartConfirmAgent.Redirection.COUPON;
                return;
            }
            if (StringHelper.equals("checkout", speechcontext.getSurfaceMeaning(NAME)))
            {
                CartConfirmAgent.redirection = CartConfirmAgent.Redirection.CHECKOUT;
                return;
            }
            if (StringHelper.equals("edit", speechcontext.getSurfaceMeaning(NAME)))
            {
                CartConfirmAgent.redirection = CartConfirmAgent.Redirection.PRODUCT_EDIT;
                return;
            }
            if (StringHelper.equals("cancel", speechcontext.getSurfaceMeaning(NAME)))
            {
                CartConfirmAgent.redirection = CartConfirmAgent.Redirection.PRODUCT_REMOVE;
                return;
            }
            if (StringHelper.equals("google_wallet", speechcontext.getSurfaceMeaning(NAME)))
            {
                CartConfirmAgent.redirection = CartConfirmAgent.Redirection.GOOGLE_WALLET;
                return;
            }
            if (StringHelper.equals("menu_list", speechcontext.getSurfaceMeaning(NAME)))
            {
                CartConfirmAgent.redirection = CartConfirmAgent.Redirection.MENULIST;
                return;
            }
            if (StringHelper.equals("product", speechcontext.getSurfaceMeaning(NAME)))
            {
                CartConfirmAgent.redirection = CartConfirmAgent.Redirection.PRODUCT;
                return;
            }
        }
    }

}
