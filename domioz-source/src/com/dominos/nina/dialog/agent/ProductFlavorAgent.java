// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import android.util.Log;
import com.dominos.App;
import com.dominos.activities.LabsProductDetailListActivity;
import com.dominos.activities.LabsSizeListActivity;
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
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent, ProductSizeAgent

public class ProductFlavorAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductFlavorAgent.getSimpleName();
    DomProductManager mNinaHelper;

    public ProductFlavorAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
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
        if (!mNinaHelper.getNinaPartialProducts().isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        NinaPartialProduct ninapartialproduct;
        final ProductWizardManager productWizardManager;
        final Activity currentActivity;
        obj = speechcontext.getSurfaceMeaning(NAME);
        ninapartialproduct = (NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0);
        productWizardManager = (ProductWizardManager)getSession().getManager("product_wizard_manager");
        currentActivity = mSpeechManager.getCurrentNinaActivity();
        if (ninapartialproduct == null) goto _L1; else goto _L3
_L3:
        if (!productWizardManager.hasFlavors()) goto _L5; else goto _L4
_L4:
        boolean flag;
        boolean flag1;
        flag = StringHelper.isNotEmpty(ninapartialproduct.getFlavor());
        flag1 = StringHelper.isNotEmpty(ninapartialproduct.getSize());
        productWizardManager.setFlavor(((String) (obj)));
        ninapartialproduct.setFlavor(((String) (obj)));
        ninapartialproduct.setSize(productWizardManager.getSizeCode());
        obj = speechcontext.getCollectedAgentsThisTurn().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_666;
            }
        } while (!((BaseAgent)((Iterator) (obj)).next()).name.equals(com/dominos/nina/dialog/agent/ProductSizeAgent.getSimpleName()));
        int i = 1;
_L15:
        if (productWizardManager.getSizeCode() != null || !flag1 || i != 0) goto _L7; else goto _L6
_L6:
        StringBuilder stringbuilder;
        String s;
        ArrayList arraylist;
        arraylist = new ArrayList(productWizardManager.getCurrentVariants());
        s = mMenuManager.getFlavor((LabsVariant)arraylist.get(0)).getName();
        stringbuilder = new StringBuilder();
        if (arraylist.size() <= 1)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        i = 0;
_L8:
        Object obj1;
        if (i >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_336;
        }
        obj1 = (LabsVariant)arraylist.get(i);
        if (i != arraylist.size() - 2)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        obj = " and ";
_L9:
        obj1 = mMenuManager.getSize(((LabsVariant) (obj1))).getName();
        stringbuilder = stringbuilder.append((new StringBuilder()).append(((String) (obj1))).append(((String) (obj))).toString());
        i++;
          goto _L8
        if (i <= arraylist.size() - 3)
        {
            obj = ", ";
        } else
        {
            obj = "";
        }
          goto _L9
        if (App.isDebugMode())
        {
            Log.d("ProductSizeAgent", (new StringBuilder("Flavor: ")).append(s).append(" valid sizes: ").append(stringbuilder).toString());
        }
        obj = getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getSizePrompter();
        speechcontext.addTextVoicePrompt(null, ((ProductPrompter) (obj)).getRandomForState("reset").getSpeech(new Object[] {
            s, stringbuilder.toString()
        }));
        speechcontext.addHints(((ProductPrompter) (obj)).getHints());
_L12:
        if (!(currentActivity instanceof LabsProductDetailListActivity))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (LabsProductDetailListActivity)currentActivity;
        if (productWizardManager.getProductLine() != null)
        {
            ((LabsProductDetailListActivity) (obj)).updateProductLine();
            return;
        }
          goto _L1
        obj;
        speechcontext.setErrorState(true);
        if (mSpeechManager.isErrorCountLimitReached()) goto _L1; else goto _L10
_L10:
        obj = getPromptManager().getChapters("product").getPrompter("not_available");
        PromptModel promptmodel = ((PrompterModel) (obj)).getRandomPrompt();
        speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
        if (ninapartialproduct.isPizza())
        {
            obj = ((PrompterModel) (obj)).getHints("pr_pizza");
        } else
        {
            obj = ((PrompterModel) (obj)).getHints();
        }
        speechcontext.addHints(((com.dominos.android.sdk.core.models.HintModel) (obj)));
        return;
_L7:
        if (!flag) goto _L12; else goto _L11
_L11:
        obj = getPromptManager().getChapters("product").getPrompter("change_flavor_size");
        promptmodel = ((PrompterModel) (obj)).getRandomPrompt();
        speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
        if (!ninapartialproduct.isPizza())
        {
            break MISSING_BLOCK_LABEL_617;
        }
        obj = ((PrompterModel) (obj)).getHints("pr_pizza");
_L13:
        speechcontext.addHints(((com.dominos.android.sdk.core.models.HintModel) (obj)));
        speechcontext.setFlavorSizeUpdated();
          goto _L12
        obj = ((PrompterModel) (obj)).getHints();
          goto _L13
        if (!(currentActivity instanceof LabsSizeListActivity)) goto _L1; else goto _L14
_L14:
        currentActivity.runOnUiThread(new _cls1());
        return;
_L5:
        speechcontext.setErrorState(true);
        return;
        i = 0;
          goto _L15
    }


    private class _cls1
        implements Runnable
    {

        final ProductFlavorAgent this$0;
        final Activity val$currentActivity;
        final ProductWizardManager val$productWizardManager;

        public void run()
        {
            LabsVariantListAdapter labsvariantlistadapter = (LabsVariantListAdapter)((LabsSizeListActivity)currentActivity).getListAdapter();
            labsvariantlistadapter.setVariantList(productWizardManager.getCurrentVariants());
            labsvariantlistadapter.notifyDataSetChanged();
        }

        _cls1()
        {
            this$0 = ProductFlavorAgent.this;
            currentActivity = activity;
            productWizardManager = productwizardmanager;
            super();
        }
    }

}
