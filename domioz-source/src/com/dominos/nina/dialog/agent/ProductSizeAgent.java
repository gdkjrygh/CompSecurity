// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import android.util.Log;
import com.dominos.App;
import com.dominos.MobileSession_;
import com.dominos.activities.LabsFlavorListActivity;
import com.dominos.activities.LabsProductDetailListActivity;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.NinaPromptModel;
import com.dominos.android.sdk.core.models.ProductCategoryPromptModel;
import com.dominos.android.sdk.core.models.ProductPrompter;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import java.util.ArrayList;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class ProductSizeAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductSizeAgent.getSimpleName();
    private static boolean hadSize;
    DomProductManager mNinaHelper;

    public ProductSizeAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        mNinaHelper = (DomProductManager)getSession().getManager("dom_product_manager");
        CONCEPT = s;
    }

    static void promptValidSizesForFlavor(BaseAgent baseagent, ProductWizardManager productwizardmanager, NinaPartialProduct ninapartialproduct, SpeechContext speechcontext)
    {
        ArrayList arraylist = new ArrayList(productwizardmanager.getCurrentVariants());
        MenuManager menumanager = (MenuManager)MobileSession_.getInstance_(App.getInstance().getBaseContext()).getManager("menu_manager");
        String s = menumanager.getFlavor((LabsVariant)arraylist.get(0)).getName();
        StringBuilder stringbuilder = new StringBuilder();
        if (arraylist.size() > 0)
        {
            int i = 0;
            while (i < arraylist.size()) 
            {
                Object obj = (LabsVariant)arraylist.get(i);
                if (i == arraylist.size() - 2)
                {
                    productwizardmanager = " and ";
                } else
                if (i <= arraylist.size() - 3)
                {
                    productwizardmanager = ", ";
                } else
                {
                    productwizardmanager = "";
                }
                obj = menumanager.getSize(((LabsVariant) (obj))).getName();
                stringbuilder = stringbuilder.append((new StringBuilder()).append(((String) (obj))).append(productwizardmanager).toString());
                i++;
            }
            if (App.isDebugMode())
            {
                Log.d("ProductSizeAgent", (new StringBuilder("Flavor: ")).append(s).append(" valid sizes: ").append(stringbuilder).toString());
            }
            baseagent = baseagent.getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getSizePrompter();
            productwizardmanager = baseagent.getRandomForState("reset");
            speechcontext.clearTextVoicePrompts();
            speechcontext.addTextVoicePrompt(null, productwizardmanager.getSpeech(new Object[] {
                s, stringbuilder.toString()
            }));
            speechcontext.addHints(baseagent.getHints());
        }
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        final Object currentActivity;
        NinaPartialProduct ninapartialproduct;
        ninapartialproduct = mNinaHelper.getCurrentPartialProduct();
        currentActivity = mSpeechManager.getCurrentNinaActivity();
        if (ninapartialproduct == null) goto _L2; else goto _L1
_L1:
        final ProductWizardManager controller;
        String s;
        s = speechcontext.getSurfaceMeaning(NAME);
        controller = (ProductWizardManager)getSession().getManager("product_wizard_manager");
        if (!controller.hasSizes()) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (hadSize || StringHelper.isNotEmpty(ninapartialproduct.getSize()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hadSize = flag;
        controller.setSize(s);
        ninapartialproduct.setSize(s);
        if (!(currentActivity instanceof LabsProductDetailListActivity)) goto _L6; else goto _L5
_L5:
        currentActivity = (LabsProductDetailListActivity)currentActivity;
        if (controller.getProductLine() != null)
        {
            ((LabsProductDetailListActivity) (currentActivity)).updateProductLine();
        }
_L13:
        if (!hadSize) goto _L2; else goto _L7
_L7:
        hadSize = false;
        if (speechcontext.getFlavorSizeUpdated()) goto _L2; else goto _L8
_L8:
        currentActivity = getPromptManager().getChapters("product").getPrompter("change_flavor_size");
        PromptModel promptmodel = ((PrompterModel) (currentActivity)).getRandomPrompt();
        speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
        if (!ninapartialproduct.isPizza()) goto _L10; else goto _L9
_L9:
        currentActivity = ((PrompterModel) (currentActivity)).getHints("pr_pizza");
_L11:
        speechcontext.addHints(((com.dominos.android.sdk.core.models.HintModel) (currentActivity)));
        speechcontext.setFlavorSizeUpdated();
        return;
_L6:
        try
        {
            if (currentActivity instanceof LabsFlavorListActivity)
            {
                ninapartialproduct.setSkipFlavorDefault(true);
                ((Activity) (currentActivity)).runOnUiThread(new _cls1());
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (final Object currentActivity)
        {
            if (!speechcontext.setErrorState(true))
            {
                if (controller.hasFlavors() && StringHelper.isNotEmpty(controller.getFlavorCode()))
                {
                    try
                    {
                        controller.setSize(null);
                    }
                    catch (com.dominos.android.sdk.core.product.ProductWizardManager.InvalidSizeException invalidsizeexception)
                    {
                        ((com.dominos.android.sdk.core.product.ProductWizardManager.InvalidSizeException) (currentActivity)).printStackTrace();
                    }
                    ninapartialproduct.setSize(null);
                    promptValidSizesForFlavor(this, controller, ninapartialproduct, speechcontext);
                    return;
                } else
                {
                    ProductPrompter productprompter = getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getSizePrompter();
                    speechcontext.addTextVoicePrompt(null, productprompter.getRandomForState("invalid").getSpeech(new Object[0]));
                    speechcontext.addHints(productprompter.getHints());
                    return;
                }
            }
        }
          goto _L2
_L10:
        currentActivity = ((PrompterModel) (currentActivity)).getHints();
          goto _L11
_L4:
        speechcontext.setErrorState(true);
        return;
_L2:
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }


    private class _cls1
        implements Runnable
    {

        final ProductSizeAgent this$0;
        final ProductWizardManager val$controller;
        final Activity val$currentActivity;

        public void run()
        {
            LabsVariantListAdapter labsvariantlistadapter = (LabsVariantListAdapter)((LabsFlavorListActivity)currentActivity).getListAdapter();
            labsvariantlistadapter.setVariantList(controller.getCurrentVariants());
            labsvariantlistadapter.notifyDataSetChanged();
        }

        _cls1()
        {
            this$0 = ProductSizeAgent.this;
            currentActivity = activity;
            controller = productwizardmanager;
            super();
        }
    }

}
