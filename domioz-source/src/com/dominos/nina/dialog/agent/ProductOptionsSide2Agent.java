// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class ProductOptionsSide2Agent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductOptionsSide2Agent.getSimpleName();
    DomProductManager mNinaHelper;

    public ProductOptionsSide2Agent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        mNinaHelper = (DomProductManager)getSession().getManager("dom_product_manager");
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        speechcontext = speechcontext.getSurfaceMeaning(NAME);
        if (speechcontext != null && StringHelper.isNotEmpty(speechcontext) && mNinaHelper.getCurrentPartialProduct() != null)
        {
            mNinaHelper.getCurrentPartialProduct().setOptionsSide2(speechcontext);
        }
    }

}
