// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import com.dominos.App;
import com.dominos.activities.CartActivity;
import com.dominos.activities.CartActivity_;
import com.dominos.activities.LabsCouponWizardActivity_;
import com.dominos.activities.LabsFlavorListActivity_;
import com.dominos.activities.LabsProductDetailListActivity;
import com.dominos.activities.LabsProductDetailListActivity_;
import com.dominos.activities.LabsRootMenuListActivity_;
import com.dominos.activities.LabsSizeListActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.NinaPromptModel;
import com.dominos.android.sdk.core.models.ProductCategoryPromptModel;
import com.dominos.android.sdk.core.models.ProductPrompter;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.nina.util.DomPromptsUtil;
import com.dominos.utils.CommandBuilder;
import com.dominos.utils.ResUtils_;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.a.a.a.a;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseGuard, CartConfirmAgent, CouponWizardGuard, ProductsAgent, 
//            UserIntentionAgent, IntentionAgent, ProductFlavorAgent, ProductSizeAgent, 
//            CouponCommandAgent, CartCommandAgent

public class ProductCompleteGuard extends BaseGuard
{

    public static String CONCEPT;
    public static final String NAME = com/dominos/nina/dialog/agent/ProductCompleteGuard.getSimpleName();
    private static final String TAG = com/dominos/nina/dialog/agent/ProductCompleteGuard.getSimpleName();
    private static final String TOPPING_BUILDER_AND = " and ";
    private static final String TOPPING_BUILDER_COMMA = ", ";
    private static final String TOPPING_BUILDER_DOT = ". ";
    private static com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity currentProductGranularity;
    private static boolean panWarningFirstTime = true;
    public static boolean startedProduct = false;
    private static AtomicBoolean userAddToOrder = new AtomicBoolean(false);
    private static AtomicBoolean userSaidYes = new AtomicBoolean(false);
    public String mBestLiteral;
    private CartManager mCartManager;
    private CouponWizardManager mCouponWizardManager;
    private DomProductManager mNinaHelper;
    private ProductWizardManager mProductWizardManager;
    private AtomicBoolean mShouldEvaluateProductAfterResume;

    public ProductCompleteGuard(String s)
    {
        super(NAME, s);
        CONCEPT = s;
        App.getInstance().bus.register(this);
        mNinaHelper = (DomProductManager)getSession().getManager("dom_product_manager");
        mProductWizardManager = (ProductWizardManager)getSession().getManager("product_wizard_manager");
        mCartManager = (CartManager)getSession().getManager("cart_manager");
        mCouponWizardManager = (CouponWizardManager)getSession().getManager("coupon_wizard_manager");
        mShouldEvaluateProductAfterResume = new AtomicBoolean(false);
    }

    private String addedOrRemovedToppingsPrompt(List list, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            LabsTopping labstopping = (LabsTopping)list.next();
            if (!labstopping.isToppingAdded() && flag)
            {
                arraylist.add(labstopping);
            }
            if (labstopping.isToppingAdded() && !flag)
            {
                arraylist.add(labstopping);
            }
        } while (true);
        PromptCategoryModel promptcategorymodel = getPromptManager().getChapters("product");
        if (flag)
        {
            list = "i_removed";
        } else
        {
            list = "toppings_prefix";
        }
        return promptcategorymodel.getPrompter(list).getRandomPrompt().getSpeech(new Object[] {
            appendToppingListReturnString(arraylist)
        });
    }

    private boolean ambiguousToppingIsSauce(String s, LabsProductLine labsproductline)
    {
        s = Arrays.asList(s.split(":"));
        labsproductline = labsproductline.getAvailableToppingsList().iterator();
label0:
        do
        {
            if (labsproductline.hasNext())
            {
                LabsTopping labstopping = (LabsTopping)labsproductline.next();
                if (!labstopping.isSauce() && !labstopping.getCode().equals("Ht"))
                {
                    continue;
                }
                Iterator iterator = s.iterator();
                String s1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    s1 = (String)iterator.next();
                } while (!labstopping.getCode().equals(s1));
                break;
            } else
            {
                return false;
            }
        } while (true);
        return true;
    }

    private String appendToppingListReturnString(List list)
    {
        StringBuilder stringbuilder = new StringBuilder("");
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            double d;
            if (i == j - 1 && j > 1)
            {
                stringbuilder.append(" and ");
            } else
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            d = ((LabsTopping)list.get(i)).getQuantityForPart(((LabsTopping)list.get(i)).getPartWithQuantity());
            if (d > 0.0D && d != 1.0D)
            {
                Object obj = ResUtils_.getInstance_(mSpeechManager.getCurrentNinaActivity()).getOptionToQuantityMap();
                obj = mNinaHelper.getNameForOptionQuantity(d, ((HashMap) (obj)));
                if (StringHelper.isNotEmpty(((String) (obj))))
                {
                    stringbuilder.append(((String) (obj)).toLowerCase());
                    stringbuilder.append(" ");
                }
            }
            stringbuilder.append(((LabsTopping)list.get(i)).getName().toLowerCase());
            i++;
        }
        stringbuilder.append(". ");
        return stringbuilder.toString();
    }

    private void attemptToLoadVariantIntoController(String s)
    {
        s = mMenuManager.getVariant(s);
        if (mProductWizardManager.isRestoreMode())
        {
            mProductWizardManager.setNewVariantFromVariantListActivity(s);
        }
        if (!mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            mNinaHelper.getCurrentPartialProduct().setSize(s.getSizeCode());
        }
        try
        {
            mProductWizardManager.setFlavor(s.getFlavorCode());
            mProductWizardManager.setSize(s.getSizeCode());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private void checkAmbiguousClarification(List list)
    {
        if (list != null && list.size() == 1)
        {
            HashMap hashmap = mProductWizardManager.getAmbiguousConfirm();
            if (list.size() == 1 && hashmap != null && !hashmap.isEmpty())
            {
                String as[] = ((String)list.get(0)).split("_");
                if ("1".equals(as[0]))
                {
                    String s = (String)hashmap.keySet().iterator().next();
                    if (a.a((String[])hashmap.get(s), as[1]))
                    {
                        list.set(0, (new StringBuilder()).append(s).append("_").append(as[1]).toString());
                    }
                }
            }
        }
        mProductWizardManager.clearAmbiguousConfirm();
    }

    private void checkAmbiguousInvalidToppingsForRemoval(List list, List list1, LabsProductLine labsproductline)
    {
        list1 = list1.listIterator();
        do
        {
            if (!list1.hasNext())
            {
                break;
            }
            String as[] = ((String)list1.next()).split("_");
            if ("0".equals(as[0]) && as[1].contains(":"))
            {
                ambiguousToppingIsSauce(as[1], labsproductline);
                ArrayList arraylist = new ArrayList();
                Object obj = labsproductline.getToppingsList();
                List list2 = Arrays.asList(as[1].split(":"));
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    LabsTopping labstopping = (LabsTopping)((Iterator) (obj)).next();
                    String s = labstopping.getCode();
                    if (list2.contains(s) && labstopping.isToppingAdded())
                    {
                        arraylist.add(s);
                    }
                } while (true);
                if (arraylist.size() == 1)
                {
                    list1.remove();
                    list.add((new StringBuilder("0_")).append((String)arraylist.get(0)).toString());
                } else
                if (arraylist.size() > 1)
                {
                    list1.set((new StringBuilder("0_")).append(StringHelper.join(arraylist, ":")).toString());
                }
            }
        } while (true);
    }

    private String createToppingFeedbackPromptDynamic(List list)
    {
        if (list == null || list.isEmpty())
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder("");
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (list = list.iterator(); list.hasNext();)
        {
            LabsTopping labstopping = (LabsTopping)list.next();
            if (!labstopping.isToppingAdded())
            {
                arraylist.add(labstopping);
            } else
            {
                arraylist1.add(labstopping);
            }
        }

        if (!arraylist1.isEmpty())
        {
            stringbuilder.append(addedOrRemovedToppingsPrompt(arraylist1, false));
            stringbuilder.append(" ");
        }
        if (!arraylist.isEmpty())
        {
            stringbuilder.append(addedOrRemovedToppingsPrompt(arraylist, true));
            stringbuilder.append(" ");
        }
        return stringbuilder.toString();
    }

    public static com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity getCurrentProductGranularity()
    {
        return currentProductGranularity;
    }

    private void goToCartOrCouponWizard(final Activity activity, SpeechContext speechcontext, LabsProduct labsproduct)
    {
        mSpeechManager.preventNinaPause();
        final Destination destination = obtainDestination(activity);
        activity.runOnUiThread(new _cls4());
        updateModelProductAddedToCart(speechcontext, destination, labsproduct);
    }

    private void goToProductDetailActivity(final Activity activity)
    {
        mSpeechManager.preventNinaPause();
        LabsProductDetailListActivity.sResumeLatchHappened = new CountDownLatch(1);
        mSpeechManager.getCurrentNinaActivity().runOnUiThread(new _cls3());
        try
        {
            LabsProductDetailListActivity.sResumeLatchHappened.await();
        }
        // Misplaced declaration of an exception variable
        catch (final Activity activity)
        {
            LabsProductDetailListActivity.sResumeLatchHappened = null;
            return;
        }
        finally
        {
            LabsProductDetailListActivity.sResumeLatchHappened = null;
        }
        LabsProductDetailListActivity.sResumeLatchHappened = null;
        return;
        throw activity;
    }

    private Destination obtainDestination(Activity activity)
    {
        Destination destination1;
label0:
        {
            destination1 = Destination.MAIN;
            Destination destination = destination1;
            if (!(activity instanceof CartActivity))
            {
                destination = destination1;
                if (mProductWizardManager.isFromCouponWizard())
                {
                    boolean flag = mCouponWizardManager.isStillOnCoupon();
                    boolean flag1 = mCouponWizardManager.isCouponFulfilledButStillEditing();
                    if (!flag && !flag1)
                    {
                        break label0;
                    }
                    destination = Destination.COUPON_WIZARD;
                }
            }
            return destination;
        }
        CartConfirmAgent.prependedMention = CartConfirmAgent.Mention.COUPONADDED;
        return destination1;
    }

    private void promptInitialConfirmation(SpeechContext speechcontext)
    {
        if (startedProduct)
        {
            startedProduct = false;
            PromptModel promptmodel = getPromptManager().getChapters("product").getPrompter("initial_reaction").getRandomPrompt();
            speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
        }
    }

    private void saveProductToOrder(Activity activity, SpeechContext speechcontext, LabsProductLine labsproductline)
    {
        if (labsproductline != null)
        {
            mProductWizardManager.replaceProductLine(labsproductline);
        }
        labsproductline = mProductWizardManager.getProductLine().getProduct();
        if (addProductToOrder())
        {
            goToCartOrCouponWizard(activity, speechcontext, labsproductline);
        }
    }

    public static void setUserAddToOrder()
    {
        userAddToOrder.set(true);
    }

    public static void setUserSaidYes()
    {
        userSaidYes.set(true);
    }

    private void updateModelProductAddedToCart(SpeechContext speechcontext, Destination destination, LabsProduct labsproduct)
    {
        if (!c.i())
        {
            return;
        }
        if (destination == Destination.COUPON_WIZARD)
        {
            CouponWizardGuard.promptProductAdded();
            if (speechcontext == null)
            {
                SpeechContext.updateAgents(new String[] {
                    ProductsAgent.NAME, "RESET", "OrderAgency", "RESET", UserIntentionAgent.NAME, "coupon_wizard"
                });
                return;
            } else
            {
                speechcontext.resetAgency(new String[] {
                    ProductsAgent.NAME
                });
                speechcontext.resetAgency(new String[] {
                    "OrderAgency"
                });
                speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "coupon_wizard");
                return;
            }
        }
        if (!mProductWizardManager.isFromCouponWizard())
        {
            CartConfirmAgent.prependProduct(labsproduct);
        }
        CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset(ProductsAgent.NAME).appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").build());
    }

    public boolean addProductToOrder()
    {
        try
        {
            if (mProductWizardManager.saveProduct(null) && !mNinaHelper.getNinaPartialProducts().isEmpty())
            {
                LogUtil.d("NinaX", "Nina partial product removed", new Object[0]);
                mNinaHelper.clearPartialProductsResetProductController();
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromSpeech.ProductAdded());
            }
        }
        catch (com.dominos.android.sdk.core.product.ProductWizardManager.InvalidToppingException invalidtoppingexception)
        {
            return false;
        }
        return true;
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
        Object obj = mSpeechManager.getCurrentNinaActivity();
        LabsProductLine labsproductline = mProductWizardManager.getProductLine();
        mBestLiteral = speechcontext.getBestLiteral();
        if (userSaidYes.getAndSet(false) && mNinaHelper.getCurrentPartialProduct() != null)
        {
            obj = getPromptManager().getChapters("product").getPrompter("topping_questions").getRandomPrompt();
            speechcontext.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
        } else
        if (userAddToOrder.getAndSet(false) && labsproductline != null)
        {
            saveProductToOrder(((Activity) (obj)), speechcontext, labsproductline);
        } else
        if (!mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            processProduct(((Activity) (obj)), speechcontext, (NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0));
        } else
        {
            moveConversationToCartOrCouponWizard(speechcontext);
        }
        userSaidYes.set(false);
        userAddToOrder.set(false);
    }

    public PromptModel getAmbiguousToppingsPrompt(LabsProductLine labsproductline, List list, NinaPartialProduct ninapartialproduct, boolean flag)
    {
        list = (String)list.get(0);
        if (!list.contains(":"))
        {
            return null;
        }
        list = list.split("_");
        String s = list[0];
        String as[] = list[1].split(":");
        StringBuilder stringbuilder;
        List list1;
        ArrayList arraylist;
        LabsTopping labstopping;
        Iterator iterator;
        LabsTopping labstopping1;
        int i;
        if (!s.equals("0"))
        {
            if (s.equals("0.5"))
            {
                list = "light ";
            } else
            if (s.equals("1"))
            {
                list = "";
            } else
            if (s.equals("1.5"))
            {
                list = "extra ";
            } else
            if (s.equals("2"))
            {
                list = "double ";
            } else
            if (s.equals("3"))
            {
                list = "triple ";
            } else
            {
                list = " unknown ";
            }
        } else
        {
            list = "";
        }
        stringbuilder = new StringBuilder();
        list1 = labsproductline.getToppingsList();
        arraylist = new ArrayList();
        i = 0;
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        labstopping = mMenuManager.validateToppingForProduct(labsproductline.getProduct(), labsproductline.getVariant().getCode(), (new StringBuilder()).append(s).append("_").append(as[i]).toString());
        if (labstopping == null) goto _L2; else goto _L1
_L1:
        if (!s.equals("0")) goto _L4; else goto _L3
_L3:
        iterator = list1.iterator();
_L7:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        labstopping1 = (LabsTopping)iterator.next();
        if (!labstopping1.getCode().equals(as[i]) || labstopping1.isToppingAdded()) goto _L7; else goto _L2
_L2:
        i++;
        break MISSING_BLOCK_LABEL_98;
_L4:
        iterator = list1.iterator();
_L9:
        if (!iterator.hasNext()) goto _L6; else goto _L8
_L8:
        labstopping1 = (LabsTopping)iterator.next();
        if (labstopping1.getCode().equals(as[i]) && labstopping1.isToppingAdded()) goto _L10; else goto _L9
_L10:
        continue; /* Loop/switch isn't completed */
_L6:
        arraylist.add(labstopping.getName().toLowerCase());
        if (true) goto _L2; else goto _L11
_L11:
        if (arraylist.size() == 0)
        {
            if (flag)
            {
                list = (new StringBuilder("All ")).append(mBestLiteral).append(" have been added.").toString();
                labsproductline = (new StringBuilder("All ")).append(mBestLiteral).append(" have been added.").toString();
                if (s.equals("0"))
                {
                    list = (new StringBuilder("All ")).append(mBestLiteral).append(" have been removed.").toString();
                    labsproductline = (new StringBuilder("All ")).append(mBestLiteral).append(" have been removed.").toString();
                }
                ninapartialproduct = new PromptModel();
                ninapartialproduct.setText(list);
                ninapartialproduct.setSpeech(labsproductline);
                return ninapartialproduct;
            } else
            {
                return null;
            }
        }
        i = 0;
        while (i < arraylist.size()) 
        {
            stringbuilder.append((new StringBuilder()).append(list).append((String)arraylist.get(i)).toString());
            if (arraylist.size() == 2)
            {
                if (i == 0)
                {
                    stringbuilder.append(" or ");
                }
            } else
            {
                if (i < arraylist.size() - 2)
                {
                    stringbuilder.append(", ");
                }
                if (i == arraylist.size() - 2)
                {
                    stringbuilder.append(", or ");
                }
            }
            i++;
        }
        labsproductline = new HashMap();
        labsproductline.put(s, as);
        mProductWizardManager.setAmbiguousConfirm(labsproductline);
        if (s.equals("0"))
        {
            list = (new StringBuilder("Do you want to remove ")).append(stringbuilder).append("?").toString();
            labsproductline = (new StringBuilder("Do you want to remove ")).append(stringbuilder).append("?").toString();
        } else
        {
            list = getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getOptionsPrompter();
            if (flag)
            {
                labsproductline = "ambiguous";
            } else
            {
                labsproductline = "ambiguous_only";
            }
            labsproductline = list.getRandomForState(labsproductline);
            list = labsproductline.getText(new Object[0]);
            labsproductline = labsproductline.getSpeech(new Object[] {
                stringbuilder
            });
        }
        ninapartialproduct = new PromptModel();
        ninapartialproduct.setText(list);
        ninapartialproduct.setSpeech(labsproductline);
        LogUtil.d("NinaX", (new StringBuilder("Final ambiguous topping prompt: ")).append(stringbuilder).toString(), new Object[0]);
        return ninapartialproduct;
    }

    public void itemSelectedOnProduct(com.dominos.bus.events.OriginatedFromUX.ItemSelected itemselected)
    {
        if (!c.i())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                IntentionAgent.NAME, "order", UserIntentionAgent.NAME, "detail", NAME, "RESET"
            });
            return;
        }
    }

    public void moveConversationToCartOrCouponWizard(SpeechContext speechcontext)
    {
        LogUtil.d("NinaX", "Moving conversation from ProductCompleteGuard to CartConfirmAgent or CouponWizard.", new Object[0]);
        speechcontext.resetAgency(new String[] {
            ProductsAgent.NAME
        });
        speechcontext.resetAgency(new String[] {
            "OrderAgency"
        });
        if (mProductWizardManager.isFromCouponWizard())
        {
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "coupon_wizard");
        } else
        {
            speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "cart");
        }
        speechcontext.delayConversation();
        LogUtil.d("NinaX", "EXIT moveConversationToCartOrCouponWizard", new Object[0]);
    }

    public void onBackPressedOnToppingScreen(com.dominos.bus.events.OriginatedFromUX.BackPressedOnToppings backpressedontoppings)
    {
        mShouldEvaluateProductAfterResume.set(true);
    }

    public void onBackPressedResume(com.dominos.bus.events.ActivityLifecycleEvents.ResumeEvent resumeevent)
    {
        if (!mShouldEvaluateProductAfterResume.getAndSet(false))
        {
            return;
        }
        if (!mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            resumeevent = StringHelper.arrayToDelimitedString(mProductWizardManager.getProductLine().getProduct().getVariants().toArray(), ":");
            ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setVariant(resumeevent);
        }
        if (mProductWizardManager.hasSizes())
        {
            Object obj;
            try
            {
                mProductWizardManager.setSize(null);
                if (!mNinaHelper.getNinaPartialProducts().isEmpty())
                {
                    ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setSize(null);
                }
                if (mProductWizardManager.getCurrentVariants().size() == 1)
                {
                    mProductWizardManager.setFlavor(null);
                    if (!mNinaHelper.getNinaPartialProducts().isEmpty())
                    {
                        ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setFlavor(null);
                    }
                }
                break MISSING_BLOCK_LABEL_171;
            }
            // Misplaced declaration of an exception variable
            catch (com.dominos.bus.events.ActivityLifecycleEvents.ResumeEvent resumeevent) { }
            // Misplaced declaration of an exception variable
            catch (com.dominos.bus.events.ActivityLifecycleEvents.ResumeEvent resumeevent) { }
            LogUtil.e(TAG, "%s", new Object[] {
                Arrays.toString(resumeevent.getStackTrace())
            });
        } else
        if (mProductWizardManager.hasFlavors())
        {
            try
            {
                mProductWizardManager.setFlavor(null);
                if (!mNinaHelper.getNinaPartialProducts().isEmpty())
                {
                    ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setFlavor(null);
                }
            }
            // Misplaced declaration of an exception variable
            catch (com.dominos.bus.events.ActivityLifecycleEvents.ResumeEvent resumeevent)
            {
                LogUtil.e(TAG, "%s", new Object[] {
                    Arrays.toString(resumeevent.getStackTrace())
                });
            }
        }
        if (!mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            obj = mProductWizardManager.getCurrentVariants();
            resumeevent = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); resumeevent.add(((LabsVariant)((Iterator) (obj)).next()).getCode())) { }
            ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setVariant(StringHelper.join(resumeevent, ":"));
        }
        SpeechContext.updateAgents((new CommandBuilder()).appendReset(ProductFlavorAgent.NAME).appendReset(ProductSizeAgent.NAME).appendReset(NAME).build());
        return;
    }

    public void panPizzaWarningAcknowledged(com.dominos.bus.events.OriginatedFromUX.PanPizzaWarningAcknowledged panpizzawarningacknowledged)
    {
        if (!c.i())
        {
            return;
        } else
        {
            SpeechContext.updateAgents(new String[] {
                NAME, "RESET"
            });
            return;
        }
    }

    public void processProduct(final Activity activity, SpeechContext speechcontext, NinaPartialProduct ninapartialproduct)
    {
        startedProduct = false;
        if (!mProductWizardManager.isInitialized() && !mProductWizardManager.isFromCouponWizard() && ninapartialproduct.getProductAsList() != null && ninapartialproduct.getProductAsList().size() == 1)
        {
            mProductWizardManager.initialize(mMenuManager.getProduct(ninapartialproduct.getProduct()));
            mProductWizardManager.setFromPartialWizard(true);
            startedProduct = true;
        }
        com.dominos.android.sdk.extension.nina.DomProductManager.MenuSearchResult menusearchresult;
        if (mProductWizardManager.isFromCouponWizard())
        {
            boolean flag = mCouponWizardManager.getCouponLine().getCoupon().isBundled();
            menusearchresult = mNinaHelper.couponOptionsForPartialProduct(flag, mCouponWizardManager.getCouponWizardHolderList(), ninapartialproduct, mProductWizardManager);
        } else
        {
            menusearchresult = mNinaHelper.menuOptionsForPartialProduct(ninapartialproduct, mProductWizardManager);
        }
        mNinaHelper.getNinaPartialProducts().set(0, menusearchresult.getNinaPartialProduct());
        currentProductGranularity = menusearchresult.getNextPrompt();
        switch (_cls5..SwitchMap.com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity[currentProductGranularity.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            speechcontext.resetAgency(new String[] {
                ProductsAgent.NAME
            });
            speechcontext.resetAgency(new String[] {
                "OrderAgency"
            });
            if (mProductWizardManager.isFromCouponWizard())
            {
                speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "coupon_wizard");
                speechcontext.updateAgentConceptValue(CouponCommandAgent.CONCEPT, "product");
            } else
            {
                speechcontext.updateAgentConceptValue(UserIntentionAgent.CONCEPT, "cart");
                speechcontext.updateAgentConceptValue(CartCommandAgent.CONCEPT, "product");
            }
            speechcontext.delayConversation();
            return;

        case 2: // '\002'
            speechcontext.addPrompter(getPromptManager().getChapters("coupon").getPrompter(DomPromptsUtil.getLoyaltyPrompt(getSession(), "product_not_valid")));
            mNinaHelper.clearPartialProductsResetProductController();
            moveConversationToCartOrCouponWizard(speechcontext);
            mSpeechManager.preventNinaPause();
            ((com.dominos.activities.LabsCouponWizardActivity_.IntentBuilder_)LabsCouponWizardActivity_.intent(activity).flags(0x4000000)).start();
            return;

        case 3: // '\003'
            if (mProductWizardManager.hasFlavors() && mProductWizardManager.hasSizes() && menusearchresult.getGranularity() == com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.SIZE)
            {
                if ((mSpeechManager.getCurrentNinaActivity() instanceof CartActivity_) || (mSpeechManager.getCurrentNinaActivity() instanceof LabsRootMenuListActivity_) && ninapartialproduct.isPizza())
                {
                    try
                    {
                        mProductWizardManager.setSize(null);
                        mProductWizardManager.setFlavor(null);
                        ninapartialproduct.setSize(null);
                        ninapartialproduct.setFlavor(null);
                        ninapartialproduct.setOptions(null);
                    }
                    // Misplaced declaration of an exception variable
                    catch (final Activity activity)
                    {
                        LogUtil.d(TAG, "Overwriting to empty size", new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (final Activity activity)
                    {
                        LogUtil.d(TAG, "Overwriting to empty flavor", new Object[0]);
                    }
                    ((com.dominos.activities.LabsFlavorListActivity_.IntentBuilder_)LabsFlavorListActivity_.intent(mSpeechManager.getCurrentNinaActivity()).flags(0x4000000)).start();
                    activity = getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getFlavorPrompter().getRandomForState("pending");
                    speechcontext.addTextVoicePrompt(activity.getText(new Object[0]), activity.getSpeech(new Object[0]));
                    return;
                } else
                {
                    ProductSizeAgent.promptValidSizesForFlavor(this, mProductWizardManager, ninapartialproduct, speechcontext);
                    return;
                }
            } else
            {
                mNinaHelper.clearPartialProductsResetProductController();
                moveConversationToCartOrCouponWizard(speechcontext);
                return;
            }

        case 4: // '\004'
            mNinaHelper.clearPartialProductsResetProductController();
            if (!speechcontext.setErrorState(true))
            {
                speechcontext.addPrompter(getPromptManager().getChapters("product").getPrompter("not_store"));
            }
            moveConversationToCartOrCouponWizard(speechcontext);
            return;

        case 5: // '\005'
            if (mProductWizardManager.isFromCouponWizard())
            {
                speechcontext.addPrompter(getPromptManager().getChapters("coupon").getPrompter(DomPromptsUtil.getLoyaltyPrompt(getSession(), "product_not_valid")));
            }
            mNinaHelper.clearPartialProductsResetProductController();
            LogUtil.e(TAG, "This scenario shouldn't happen", new Object[0]);
            moveConversationToCartOrCouponWizard(speechcontext);
            return;

        case 6: // '\006'
            saveProductToOrder(activity, speechcontext, (LabsProductLine)menusearchresult.getResult());
            return;

        case 7: // '\007'
            promptInitialConfirmation(speechcontext);
            if (!(mSpeechManager.getCurrentNinaActivity() instanceof LabsSizeListActivity_))
            {
                mSpeechManager.preventNinaPause();
                activity.runOnUiThread(new _cls1());
            }
            activity = getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getSizePrompter();
            ninapartialproduct = activity.getRandomForState("pending");
            speechcontext.addTextVoicePrompt(ninapartialproduct.getText(new Object[0]), ninapartialproduct.getSpeech(new Object[0]));
            speechcontext.addHints(activity.getHints());
            return;

        case 8: // '\b'
            promptInitialConfirmation(speechcontext);
            if (!(mSpeechManager.getCurrentNinaActivity() instanceof LabsFlavorListActivity_))
            {
                mSpeechManager.preventNinaPause();
                activity.runOnUiThread(new _cls2());
            }
            activity = getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getFlavorPrompter();
            ninapartialproduct = activity.getRandomForState("pending");
            speechcontext.addTextVoicePrompt(ninapartialproduct.getText(new Object[0]), ninapartialproduct.getSpeech(new Object[0]));
            speechcontext.addHints(activity.getHints());
            return;

        case 9: // '\t'
            activity = mSpeechManager.getCurrentNinaActivity();
            break;
        }
        if (!(activity instanceof LabsProductDetailListActivity_))
        {
            goToProductDetailActivity(activity);
            activity = (LabsProductLine)menusearchresult.getResult();
            attemptToLoadVariantIntoController(activity.getCode());
        } else
        {
            activity = mProductWizardManager.getProductLine();
        }
        if (ninapartialproduct.getFlavor() != null && ninapartialproduct.getFlavor().equalsIgnoreCase("GLUTENF") && ((LabsProductDetailListActivity)mSpeechManager.getCurrentNinaActivity()).isGlutenWarningShowing())
        {
            speechcontext.setErrorState(false);
            speechcontext.delayConversation();
        } else
        {
            Object obj = ninapartialproduct.getOptions();
            if (mCartManager.wasWarnedTooManyToppings())
            {
                mCartManager.setWasWarnedTooManyToppings(false);
                activity = getPromptManager().getChapters("alert").getPrompter("question").getRandomPrompt();
                speechcontext.addTextVoicePrompt(activity.getText(new Object[0]), activity.getSpeech(new Object[0]));
            } else
            if (StringHelper.isEmpty(((String) (obj))) && !ninapartialproduct.hasLeftSideOrRightSideOptions())
            {
                obj = new LabsProductLine(activity.getVariant());
                mMenuManager.loadOptionsFromMenu(((LabsProductLine) (obj)));
                ((LabsProductLine) (obj)).loadDefaultOptions();
                if (activity.toppingsDiffer(obj))
                {
                    if (!speechcontext.getFlavorSizeUpdated())
                    {
                        activity = getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getOptionsPrompter();
                        obj = activity.getRandomForState("additional");
                        speechcontext.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
                        speechcontext.addHints(activity.getHints());
                    }
                } else
                if (!speechcontext.getFlavorSizeUpdated())
                {
                    activity = getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getOptionsPrompter();
                    obj = activity.getRandomForState("pending");
                    speechcontext.addTextVoicePrompt(((PromptModel) (obj)).getText(new Object[0]), ((PromptModel) (obj)).getSpeech(new Object[0]));
                    speechcontext.addHints(activity.getHints());
                }
            } else
            {
                obj = mNinaHelper.analyzeToppings(activity.getProduct(), activity.getVariant().getFlavorCode(), ((String) (obj)));
                List list = (List)((Map) (obj)).get("valid");
                List list1 = (List)((Map) (obj)).get("invalid");
                checkAmbiguousClarification(list);
                checkAmbiguousInvalidToppingsForRemoval(list, list1, activity);
                if (!list.isEmpty())
                {
                    obj = mNinaHelper.getValidOptionsForProduct(activity.getProduct(), list);
                    String s = mNinaHelper.updateProductLineWithToppings(activity, ((List) (obj)));
                    mProductWizardManager.replaceProductLine(activity);
                    if (!s.equals("VALID_TOPPINGS_QUANTITY_CODE"))
                    {
                        LogUtil.d("Nina", (new StringBuilder("App.getInstance().bus.post(new DialogEvents.ToppingsError(")).append(s).append("));").toString(), new Object[0]);
                        ninapartialproduct.setToppingsErrorCode(s);
                        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.ToppingsError(s));
                        mNinaHelper.getCurrentPartialProduct().setToppingsErrorCode(null);
                        mCartManager.setWasWarnedTooManyToppings(true);
                    }
                    if (mSpeechManager.getCurrentNinaActivity() instanceof LabsProductDetailListActivity_)
                    {
                        LabsProductDetailListActivity labsproductdetaillistactivity = (LabsProductDetailListActivity)mSpeechManager.getCurrentNinaActivity();
                        CountDownLatch countdownlatch = new CountDownLatch(1);
                        labsproductdetaillistactivity.updateProductLine(countdownlatch);
                        try
                        {
                            LogUtil.d(TAG, "UI Latch await.", new Object[0]);
                            countdownlatch.await();
                        }
                        catch (InterruptedException interruptedexception)
                        {
                            LogUtil.d(TAG, "UI Latch interrupted", new Object[0]);
                        }
                        LogUtil.d(TAG, "UI Latch countdown", new Object[0]);
                        if (activity.isPanPizza() && labsproductdetaillistactivity.isPanQtyLimitReached() && panWarningFirstTime)
                        {
                            panWarningFirstTime = false;
                            activity = getPromptManager().getChapters("alert").getPrompter("generic").getRandomPrompt();
                            speechcontext.addTextVoicePrompt(activity.getText(new Object[0]), activity.getSpeech(new Object[0]));
                            speechcontext.delayConversation();
                            return;
                        }
                    }
                } else
                {
                    obj = null;
                }
                if (ninapartialproduct.getToppingsErrorCode() == null && ninapartialproduct.hasLeftSideOrRightSideOptions())
                {
                    ninapartialproduct.setToppingsErrorCode("RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED");
                    App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.ToppingsError("RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED", "half_toppings_voice_support"));
                    ninapartialproduct.clearWholeAndSideOptions();
                    return;
                }
                if (ninapartialproduct.getToppingsErrorCode() != null)
                {
                    activity = getPromptManager().getChapters("alert").getPrompter("topping_limit_exceeded").getRandomPrompt();
                    speechcontext.addTextVoicePrompt(activity.getText(new Object[0]), activity.getSpeech(new Object[0]));
                    speechcontext.delayConversation();
                } else
                {
                    PromptModel promptmodel = getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getOptionsPrompter().getRandomForState("additional");
                    if (!list1.isEmpty())
                    {
                        boolean flag1;
                        if (!list.isEmpty())
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        activity = getAmbiguousToppingsPrompt(activity, list1, ninapartialproduct, flag1);
                        if (activity == null)
                        {
                            if (!list.isEmpty())
                            {
                                activity = getPromptManager().getChapters("product").getPrompter("topping_not_valid_preceded").getRandomPrompt();
                                speechcontext.addTextVoicePrompt((new StringBuilder()).append("").append(" ").append(activity.getText(new Object[0])).toString(), (new StringBuilder()).append("").append(" ").append(activity.getSpeech(new Object[0])).toString());
                            } else
                            {
                                activity = getPromptManager().getChapters("product").getPrompter("removing_toppings").getRandomPrompt();
                                speechcontext.addTextVoicePrompt((new StringBuilder()).append("").append(" ").append(activity.getText(new Object[0])).toString(), activity.getSpeech(new Object[0]));
                            }
                        } else
                        if (!speechcontext.setErrorState(true))
                        {
                            speechcontext.addTextVoicePrompt((new StringBuilder()).append("").append(" ").append(activity.getText(new Object[0])).toString(), (new StringBuilder()).append("").append(" ").append(activity.getSpeech(new Object[0])).toString());
                        }
                    } else
                    {
                        speechcontext.addTextVoicePrompt(null, createToppingFeedbackPromptDynamic(((List) (obj))));
                        speechcontext.addTextVoicePrompt(promptmodel.getText(new Object[0]), promptmodel.getSpeech(new Object[0]));
                    }
                    speechcontext.addHints(getPromptManager().getPromptModel().getProductPrompter(ninapartialproduct.getCategory().toLowerCase()).getOptionsPrompter().getHints());
                }
            }
        }
        ninapartialproduct.clearWholeAndSideOptions();
    }

    public void productAddedToCart(com.dominos.bus.events.OriginatedFromUX.ProductAddedToOrder productaddedtoorder)
    {
        if (!c.i())
        {
            return;
        }
        mSpeechManager.preventNinaPause();
        Activity activity = mSpeechManager.getCurrentNinaActivity();
        CouponWizardManager couponwizardmanager = (CouponWizardManager)getSession().getManager("coupon_wizard_manager");
        if (mProductWizardManager.isFromCouponWizard() && couponwizardmanager.isStillOnCoupon())
        {
            ((com.dominos.activities.LabsCouponWizardActivity_.IntentBuilder_)LabsCouponWizardActivity_.intent(activity).flags(0x4000000)).start();
        } else
        {
            ((com.dominos.activities.CartActivity_.IntentBuilder_)CartActivity_.intent(activity).flags(0x4000000)).start();
        }
        updateModelProductAddedToCart(null, obtainDestination(activity), productaddedtoorder.getAddedProductLine().getProduct());
    }


    private class _cls4
        implements Runnable
    {

        final ProductCompleteGuard this$0;
        final Activity val$activity;
        final Destination val$destination;

        public void run()
        {
label0:
            {
                if (!(activity instanceof CartActivity))
                {
                    if (destination != Destination.COUPON_WIZARD)
                    {
                        break label0;
                    }
                    ((com.dominos.activities.LabsCouponWizardActivity_.IntentBuilder_)LabsCouponWizardActivity_.intent(activity).flags(0x4000000)).start();
                }
                return;
            }
            ((com.dominos.activities.CartActivity_.IntentBuilder_)CartActivity_.intent(activity).flags(0x4000000)).start();
        }

        _cls4()
        {
            this$0 = ProductCompleteGuard.this;
            activity = activity1;
            destination = destination1;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final ProductCompleteGuard this$0;
        final Activity val$activity;

        public void run()
        {
            ((com.dominos.activities.LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(activity).flags(0x10020000)).start();
        }

        _cls3()
        {
            this$0 = ProductCompleteGuard.this;
            activity = activity1;
            super();
        }
    }


    private class Destination extends Enum
    {

        private static final Destination $VALUES[];
        public static final Destination COUPON_WIZARD;
        public static final Destination MAIN;

        public static Destination valueOf(String s)
        {
            return (Destination)Enum.valueOf(com/dominos/nina/dialog/agent/ProductCompleteGuard$Destination, s);
        }

        public static Destination[] values()
        {
            return (Destination[])$VALUES.clone();
        }

        static 
        {
            MAIN = new Destination("MAIN", 0);
            COUPON_WIZARD = new Destination("COUPON_WIZARD", 1);
            $VALUES = (new Destination[] {
                MAIN, COUPON_WIZARD
            });
        }

        private Destination(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls5
    {

        static final int $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity = new int[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.PRODUCT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.ERROR_NOT_ON_COUPON.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.UNKNOWN.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.ERROR_NOT_ON_MENU.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.ERROR.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.COMPLETED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.SIZE.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.FLAVOR.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$extension$nina$DomProductManager$ProductGranularity[com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.TOPPINGS.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements Runnable
    {

        final ProductCompleteGuard this$0;
        final Activity val$activity;

        public void run()
        {
            ((com.dominos.activities.LabsSizeListActivity_.IntentBuilder_)LabsSizeListActivity_.intent(activity).flags(0x10020000)).start();
        }

        _cls1()
        {
            this$0 = ProductCompleteGuard.this;
            activity = activity1;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final ProductCompleteGuard this$0;
        final Activity val$activity;

        public void run()
        {
            ((com.dominos.activities.LabsFlavorListActivity_.IntentBuilder_)LabsFlavorListActivity_.intent(activity).flags(0x10020000)).start();
        }

        _cls2()
        {
            this$0 = ProductCompleteGuard.this;
            activity = activity1;
            super();
        }
    }

}
