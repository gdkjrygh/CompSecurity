// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.nina.speech.SpeechContext;
import java.util.ArrayList;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class ProductCategoryAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductCategoryAgent.getSimpleName();

    public ProductCategoryAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
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
        DomProductManager domproductmanager = (DomProductManager)getSession().getManager("dom_product_manager");
        if (!domproductmanager.getNinaPartialProducts().isEmpty())
        {
            ((NinaPartialProduct)domproductmanager.getNinaPartialProducts().get(0)).setCategory(speechcontext.getSurfaceMeaning(NAME));
        }
    }

}
