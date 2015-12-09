// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import java.util.ArrayList;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, ProductCompleteGuard

public class ProductOptionsAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductOptionsAgent.getSimpleName();
    DomProductManager mNinaHelper;

    public ProductOptionsAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        mNinaHelper = (DomProductManager)getSession().getManager("dom_product_manager");
        CONCEPT = s;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public String mergeOptions(String s, String s1)
    {
        if (StringHelper.isEmpty(s))
        {
            return s1;
        }
        StringBuilder stringbuilder = new StringBuilder(s);
        s1 = s1.split(";");
        int k = s1.length;
        int i = 0;
label0:
        do
        {
            if (i < k)
            {
                String s2 = s1[i];
                boolean flag1 = true;
                String as[] = s.split(":");
                int l = as.length;
                int j = 0;
                do
                {
label1:
                    {
                        boolean flag = flag1;
                        if (j < l)
                        {
                            if (!as[j].equals(s2))
                            {
                                break label1;
                            }
                            flag = false;
                        }
                        if (flag)
                        {
                            stringbuilder.append(";").append(s2);
                        }
                        i++;
                        continue label0;
                    }
                    j++;
                } while (true);
            }
            return stringbuilder.toString();
        } while (true);
    }

    public void onBind(SpeechContext speechcontext)
    {
        super.onBind(speechcontext);
        speechcontext = sanitizeOptions(speechcontext.getSurfaceMeaning(NAME));
        if (!mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            if (ProductCompleteGuard.getCurrentProductGranularity() != com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.TOPPINGS)
            {
                mSpeechManager.addErrorCount();
            }
            speechcontext = mergeOptions(((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).getOptions(), speechcontext);
            ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setOptions(speechcontext);
        }
    }

    public String sanitizeOptions(String s)
    {
        if (StringHelper.isNotEmpty(s))
        {
            return StringHelper.replace(s, "^", ";");
        } else
        {
            return null;
        }
    }

}
