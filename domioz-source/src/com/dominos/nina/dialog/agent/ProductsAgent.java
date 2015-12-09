// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import com.dominos.App;
import com.dominos.MobileSession_;
import com.dominos.activities.CartActivity;
import com.dominos.activities.LabsCouponWizardActivity;
import com.dominos.activities.LabsMenuListActivity;
import com.dominos.activities.LabsRootMenuListActivity;
import com.dominos.activities.LabsVariantListActivity;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class ProductsAgent extends BaseAgent
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductsAgent.getSimpleName();
    public static String remembered;
    public static boolean replacePartialProduct = false;
    DomProductManager mNinaHelper;

    public ProductsAgent(String s, com.dominos.nina.dialog.DialogModelBuilder.SlotMode slotmode)
    {
        super(NAME, s, slotmode);
        mNinaHelper = (DomProductManager)getSession().getManager("dom_product_manager");
        CONCEPT = s;
        remembered = null;
    }

    public static boolean activityCanAddProductsToCartNow(Activity activity)
    {
        MenuManager menumanager = (MenuManager)MobileSession_.getInstance_(activity).getManager("menu_manager");
        return activity != null && menumanager.isMenuLoaded() && ((activity instanceof CartActivity) || (activity instanceof LabsCouponWizardActivity) || (activity instanceof LabsRootMenuListActivity) || (activity instanceof LabsMenuListActivity) || (activity instanceof LabsVariantListActivity));
    }

    public static void addProductsToCart(SpeechContext speechcontext, Activity activity, String s)
    {
        if (activityCanAddProductsToCartNow(activity))
        {
            decodeProducts(activity, s);
            return;
        } else
        {
            remembered = s;
            return;
        }
    }

    public static void addRememberedProductsToCart(Activity activity)
    {
        if (remembered != null)
        {
            String s = remembered;
            remembered = null;
            decodeProducts(activity, s);
        }
    }

    public static Map decodeProduct(String s)
    {
        HashMap hashmap = new HashMap();
        s = s.split(",");
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String as[] = s[i].split("=", 2);
            if (as.length == 2)
            {
                hashmap.put(as[0], as[1].split(";"));
            }
        }

        return hashmap;
    }

    public static void decodeProducts(Activity activity, String s)
    {
        DomProductManager domproductmanager;
label0:
        {
            Object obj;
            MenuManager menumanager;
label1:
            {
                obj = MobileSession_.getInstance_(App.getInstance().getBaseContext());
                domproductmanager = (DomProductManager)((Session) (obj)).getManager("dom_product_manager");
                menumanager = (MenuManager)((Session) (obj)).getManager("menu_manager");
                s = s.split("\\^");
                if (s.length > 0)
                {
                    s = decodeProduct(s[0]);
                    if (s.containsKey(NinaPartialProduct.PR_CATEGORY) && StringHelper.equalsIgnoreCase(((String[])s.get(NinaPartialProduct.PR_CATEGORY))[0], "Pizza") && s.containsKey(NinaPartialProduct.PR_SUBCATEGORY) && StringHelper.equalsIgnoreCase(((String[])s.get(NinaPartialProduct.PR_SUBCATEGORY))[0], "BuildYourOwn") && !s.containsKey(NinaPartialProduct.PR_SIZE) && !s.containsKey(NinaPartialProduct.PR_OPTIONS) && (activity instanceof LabsRootMenuListActivity))
                    {
                        s.remove(NinaPartialProduct.PR_SUBCATEGORY);
                        s.remove(NinaPartialProduct.PR_VARIANT);
                        s.remove(NinaPartialProduct.PR_PRODUCTCODE);
                        s.remove(NinaPartialProduct.PR_OPTIONS);
                        s.remove(NinaPartialProduct.PR_OPTIONS_S1);
                        s.remove(NinaPartialProduct.PR_OPTIONS_S2);
                    }
                    s = new NinaPartialProduct(((Session) (obj)), s);
                    obj = domproductmanager.getCurrentPartialProduct();
                    if (!replacePartialProduct || obj == null)
                    {
                        break label0;
                    }
                    if (!s.hasSingleProduct() || s.isBYOP())
                    {
                        break label1;
                    }
                    domproductmanager.clearPartialProductsResetProductController();
                    domproductmanager.getNinaPartialProducts().add(s);
                    replacePartialProduct = false;
                }
                return;
            }
            String s1;
            Object obj1;
            String s3;
            String as[];
            int i;
            int j;
            int k;
            if (((NinaPartialProduct) (obj)).hasMultipleProducts() && !s.hasMultipleProducts() && s.hasSingleCategory())
            {
                activity = ((Activity) (obj));
                obj = s;
            } else
            if (s.hasOneOrMoreProducts() && !((NinaPartialProduct) (obj)).hasMultipleProducts() && ((NinaPartialProduct) (obj)).hasSingleCategory())
            {
                activity = s;
            } else
            {
                domproductmanager.clearPartialProductsResetProductController();
                domproductmanager.getNinaPartialProducts().add(s);
                return;
            }
            s3 = ((NinaPartialProduct) (obj)).getCategory();
            i = 0;
            s1 = null;
            as = activity.getProduct().split(":");
            k = as.length;
            j = 0;
            obj1 = null;
            activity = s1;
            s1 = obj1;
            for (; j < k; j++)
            {
                String s2 = as[j];
                LabsCategory labscategory = menumanager.getCategoryForProduct(s2);
                if (labscategory != null && s3.equals(labscategory.getParentCode()))
                {
                    i++;
                    s1 = labscategory.getCode();
                    activity = s2;
                }
            }

            if (i == 1)
            {
                ((NinaPartialProduct) (obj)).setSubcategory(s1);
                ((NinaPartialProduct) (obj)).setProduct(activity);
                ((NinaPartialProduct) (obj)).setVariant(StringHelper.join(menumanager.getProduct(activity).getVariants(), ':'));
                domproductmanager.clearPartialProductsResetProductController();
                domproductmanager.getNinaPartialProducts().add(obj);
                replacePartialProduct = false;
                return;
            } else
            {
                domproductmanager.clearPartialProductsResetProductController();
                domproductmanager.getNinaPartialProducts().add(s);
                return;
            }
        }
        domproductmanager.clearPartialProductsResetProductController();
        domproductmanager.getNinaPartialProducts().add(s);
    }

    private void handleFixedRedirection(SpeechContext speechcontext)
    {
        speechcontext.resetAgency(new String[] {
            NAME
        });
        speechcontext.setAvoidFocusIn(true);
        speechcontext.delayConversation();
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }

    public void onBind(SpeechContext speechcontext)
    {
        Activity activity = mSpeechManager.getCurrentNinaActivity();
        String s = speechcontext.getSurfaceMeaning(NAME);
        if (StringHelper.isNotEmpty(s) && !StringHelper.equals("DONE", s))
        {
            addProductsToCart(speechcontext, activity, s);
            handleFixedRedirection(speechcontext);
        }
    }

}
