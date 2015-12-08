// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.b.a.ab;
import com.b.a.b;
import com.b.a.i;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsSide;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.nina.dialog.agent.ProductCompleteGuard;
import com.dominos.nina.dialog.agent.ProductOptionsSide1Agent;
import com.dominos.nina.dialog.agent.ProductOptionsSide2Agent;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.CommandBuilder;
import com.dominos.utils.ImageManagerCDN;
import com.dominos.utils.ResUtils;
import com.dominos.views.AddToOrderFooterView_;
import com.dominos.views.PizzaCheeseView;
import com.dominos.views.PizzaCheeseView_;
import com.dominos.views.QuantityView;
import com.dominos.views.QuantityView_;
import com.dominos.views.SauceSelectorView;
import com.dominos.views.SauceSelectorView_;
import com.dominos.views.SectionTitleView;
import com.dominos.views.SectionTitleView_;
import com.dominos.views.SideView;
import com.dominos.views.SideView_;
import com.dominos.views.SizeView;
import com.dominos.views.SizeView_;
import com.dominos.views.SplitToppingView;
import com.dominos.views.SplitToppingView_;
import com.dominos.views.WholeToppingView;
import com.dominos.views.WholeToppingView_;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.c.d.m;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, LabsCouponWizardActivity_, CartActivity_, LabsFlavorListActivity_, 
//            LabsSizeListActivity_

public class LabsProductDetailListActivity extends BaseActivity
    implements com.dominos.views.AddToOrderFooterView.OnButtonClickListener, com.dominos.views.PizzaCheeseView.OnCheeseClickListener, com.dominos.views.QuantityView.OnQuantityChangedListener, com.dominos.views.SauceSelectorView.OnSauceSelectedListener, com.dominos.views.SideView.OnSideClickListener, com.dominos.views.SizeView.OnSizeClickListener, com.dominos.views.SplitToppingView.OnSplitToppingClickListener, com.dominos.views.WholeToppingView.OnWholeToppingClickListener
{

    private static final String BYO_PASTA = "S_BUILD";
    private static final String CHEESE_OPTION_VALUE = "C";
    private static final double PAN_QTY_LIMIT = 5D;
    private static final String TAG = com/dominos/activities/LabsProductDetailListActivity.getSimpleName();
    public static volatile CountDownLatch sResumeLatchHappened;
    LinearLayout flashAnimationLayout;
    private boolean initialFlashFlag;
    private boolean isGlutenWarningShowing;
    private LinearLayout listLayout;
    private com.dominos.utils.ActivityHelper.AlertActionCallback mAlertActionCallback;
    private final String mAlertDomCommands[];
    private int mOriginalProductQuantity;
    private ProductWizardManager mProductWizardManager;
    ImageView productLineImage;
    TextView productLineTitle;
    TextView productToppingsList;
    ResUtils resourceUtility;
    Button saveButton;
    private BusSubscriber subscriber;
    TextView titleText;
    private boolean wasWarnedGluten;

    public LabsProductDetailListActivity()
    {
        initialFlashFlag = false;
        isGlutenWarningShowing = false;
        mAlertDomCommands = (new CommandBuilder()).appendReset(ProductOptionsSide1Agent.NAME).appendReset(ProductOptionsSide1Agent.NAME).appendReset(ProductOptionsSide2Agent.NAME).appendReset(ProductCompleteGuard.NAME).build();
        wasWarnedGluten = false;
        mAlertActionCallback = new _cls1();
    }

    private void addFooterView()
    {
        com.dominos.views.AddToOrderFooterView addtoorderfooterview = AddToOrderFooterView_.build(this, this, mProductWizardManager.isEditMode());
        listLayout.addView(addtoorderfooterview);
        listLayout.addView(getNinaPaddingView());
    }

    private void addProductToOrder()
    {
        boolean flag = mProductWizardManager.isFromCouponWizard();
        LabsProductLine labsproductline = mProductWizardManager.getProductLine();
        if (mProductWizardManager.saveProduct(labsproductline))
        {
            mAnalyticsUtil.postProductAdded(labsproductline);
            if (!mNinaHelper.getNinaPartialProducts().isEmpty())
            {
                LogUtil.d("NinaX", "Nina partial product removed", new Object[0]);
                mNinaHelper.clearPartialProductsResetProductController();
            }
        }
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ProductAddedToOrder(labsproductline, 0));
        if (c.i())
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (!LoyaltyUtil.isLoyaltyCouponLine(mCouponWizardManager.getCouponLine()) && mCouponWizardManager.isStillOnCoupon())
        {
            mCouponWizardManager.getCouponLine().getCoupon();
            ((LabsCouponWizardActivity_.IntentBuilder_)LabsCouponWizardActivity_.intent(this).flags(0x4000000)).start();
            return;
        }
        try
        {
            ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
            return;
        }
        catch (com.dominos.android.sdk.core.product.ProductWizardManager.InvalidToppingException invalidtoppingexception)
        {
            displayToppingsErrorDialog(invalidtoppingexception.getQuantityCode(), null);
        }
    }

    private void checkGlutenWarning()
    {
        LabsProductLine labsproductline = mProductWizardManager.getProductLine();
        if (labsproductline.getFlavor() != null && labsproductline.getFlavor().getCode().equalsIgnoreCase("GLUTENF") && !wasWarnedGluten)
        {
            wasWarnedGluten = true;
            isGlutenWarningShowing = true;
            mActivityHelper.showAlert(AlertType.GLUTEN_FREE_CRUST, new _cls2());
        }
    }

    private void checkToppingsErrorWarning()
    {
        NinaPartialProduct ninapartialproduct = mNinaHelper.getCurrentPartialProduct();
        if (ninapartialproduct != null && ninapartialproduct.getToppingsErrorCode() != null)
        {
            displayToppingsErrorDialog(ninapartialproduct.getToppingsErrorCode(), null);
        }
    }

    private boolean containsSauce(LabsProductLine labsproductline)
    {
        for (labsproductline = labsproductline.getAvailableToppingsList().iterator(); labsproductline.hasNext();)
        {
            if (((LabsTopping)labsproductline.next()).isSauce())
            {
                return true;
            }
        }

        return false;
    }

    private void displaySingleToppingList(LabsProductLine labsproductline)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = labsproductline.getToppingsList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsTopping labstopping1 = (LabsTopping)iterator.next();
            if (labstopping1.getOptionAvailability().size() == 1)
            {
                arraylist.add(labstopping1);
            }
        } while (true);
        if (labsproductline.isBuildYourOwnHoagie() || labsproductline.isBuildYourOwnPasta() || labsproductline.isBuildYourOwnSandwichSlide())
        {
            if (labsproductline.isBuildYourOwnPasta())
            {
                SauceSelectorView sauceselectorview = SauceSelectorView_.build(this);
                sauceselectorview.bind(labsproductline, this);
                listLayout.addView(sauceselectorview);
            }
            Iterator iterator1 = labsproductline.getAvailableToppingsList().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                LabsTopping labstopping2 = (LabsTopping)iterator1.next();
                if (labstopping2.getOptionAvailability().size() != 1 && (!labsproductline.isBuildYourOwnPasta() || !labstopping2.isSauce()))
                {
                    arraylist.add(labstopping2);
                }
            } while (true);
        } else
        {
            Iterator iterator2 = labsproductline.getToppingsList().iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    break;
                }
                LabsTopping labstopping3 = (LabsTopping)iterator2.next();
                if (labstopping3.getOptionAvailability().size() != 1)
                {
                    arraylist.add(labstopping3);
                }
            } while (true);
            addMissingDefaultToppings(arraylist);
        }
        int j = 0;
        while (j < arraylist.size()) 
        {
            LabsTopping labstopping = (LabsTopping)arraylist.get(j);
            WholeToppingView wholetoppingview = WholeToppingView_.build(this);
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (j == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j == arraylist.size() - 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (j == 0)
            {
                SectionTitleView sectiontitleview = SectionTitleView_.build(this);
                sectiontitleview.bind(getString(0x7f080437));
                listLayout.addView(sectiontitleview);
            }
            flag3 = isToppingAdded(labsproductline, labstopping);
            if (labstopping.getOptionAvailability().size() == 1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            wholetoppingview.bind(labstopping, labsproductline, flag, flag1, flag3, flag2, this);
            listLayout.addView(wholetoppingview);
            j++;
        }
    }

    private void displayToppingLists(ArrayList arraylist, LabsProductLine labsproductline, String s)
    {
        int j = 0;
        while (j < arraylist.size()) 
        {
            LabsTopping labstopping = (LabsTopping)arraylist.get(j);
            SplitToppingView splittoppingview = SplitToppingView_.build(this);
            if (j == 0)
            {
                SectionTitleView sectiontitleview = SectionTitleView_.build(this);
                sectiontitleview.bind(s);
                listLayout.addView(sectiontitleview);
                splittoppingview.bind(labstopping, labsproductline, true, false, isToppingAdded(labsproductline, labstopping), this);
            } else
            if (j < arraylist.size() - 1)
            {
                splittoppingview.bind(labstopping, labsproductline, false, false, isToppingAdded(labsproductline, labstopping), this);
            } else
            {
                splittoppingview.bind(labstopping, labsproductline, false, true, isToppingAdded(labsproductline, labstopping), this);
            }
            listLayout.addView(splittoppingview);
            j++;
        }
    }

    private void displayToppingsErrorDialog(String s, String s1)
    {
        mActivityHelper.showAlert(getAlertType(s), null, s1, mAlertDomCommands, mAlertActionCallback);
    }

    private AlertType getAlertType(String s)
    {
        AlertType alerttype = AlertType.TOO_MANY_TOPPINGS_WHOLE;
        if ("TOO_MANY_TOPPINGS_LEFT_ERROR_CODE".equals(s))
        {
            alerttype = AlertType.TOO_MANY_TOPPINGS_LEFT;
        } else
        {
            if ("TOO_MANY_TOPPINGS_WHOLE_ERROR_CODE".equals(s))
            {
                return AlertType.TOO_MANY_TOPPINGS_WHOLE;
            }
            if ("TOO_MANY_TOPPINGS_RIGHT_ERROR_CODE".equals(s))
            {
                return AlertType.TOO_MANY_TOPPINGS_RIGHT;
            }
            if ("TOO_MANY_TOPPINGS_PASTA_ERROR_CODE".equals(s))
            {
                return AlertType.TOO_MANY_TOPPINGS_PASTA;
            }
            if ("TOO_MANY_TOPPINGS_SAUCE_ERROR_CODE".equals(s))
            {
                return AlertType.TOO_MANY_TOPPINGS_SAUCE;
            }
            if ("TOO_MANY_TOPPINGS_SAND_ERROR_CODE".equals(s))
            {
                return AlertType.TOO_MANY_TOPPINGS_SAND;
            }
            if ("TOO_MANY_TOPPINGS_SAND_SLICE_ERROR_CODE".equals(s))
            {
                return AlertType.TOO_MANY_TOPPINGS_SAND_SLICE;
            }
            if ("TOO_MANY_SAUCES_SAND_SLICE_ERROR_CODE".equals(s))
            {
                return AlertType.TOO_MANY_SAUCES_SAND_SLICE;
            }
            if ("TOO_MANY_DIPPING_CUPS_ERROR_CODE".equals(s))
            {
                return AlertType.TOO_MANY_DIPPING_CUPS;
            }
            if ("RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED".equals(s))
            {
                return AlertType.RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED;
            }
        }
        return alerttype;
    }

    private boolean isToppingAdded(LabsProductLine labsproductline, LabsTopping labstopping)
    {
        for (labsproductline = labsproductline.getToppingsList().iterator(); labsproductline.hasNext();)
        {
            if (StringHelper.equals(((LabsTopping)labsproductline.next()).getCode(), labstopping.getCode()) && labstopping.isToppingAdded())
            {
                return true;
            }
        }

        return false;
    }

    private SpannableString makeSpannableString(String s)
    {
        String s1 = getString(0x7f080341);
        String s2 = getString(0x7f08018a);
        String s3 = getString(0x7f080283);
        SpannableString spannablestring = new SpannableString(s);
        int j = s.indexOf(s1);
        if (j != -1)
        {
            spannablestring.setSpan(new ForegroundColorSpan(0xffff0000), j, s1.length() + j, 0);
        }
        j = s.indexOf(s2);
        if (j != -1)
        {
            spannablestring.setSpan(new ForegroundColorSpan(0xffff0000), j, s2.length() + j, 0);
        }
        j = s.indexOf(s3);
        if (j != -1)
        {
            spannablestring.setSpan(new ForegroundColorSpan(0xffff0000), j, s3.length() + j, 0);
        }
        return spannablestring;
    }

    private void setupAndDisplaySidesList(LabsProductLine labsproductline)
    {
        SectionTitleView sectiontitleview = SectionTitleView_.build(this);
        int j;
        if (labsproductline.isSalad() || labsproductline.isDessert())
        {
            sectiontitleview.bind(getString(0x7f0803bb));
        } else
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(getString(0x7f080390)).append(" ").append(labsproductline.getMaxDippingCups()).append(" ");
            String s;
            if (labsproductline.getMaxDippingCups() > 1)
            {
                s = getString(0x7f080392);
            } else
            {
                s = getString(0x7f080391);
            }
            sectiontitleview.bind(stringbuilder.append(s).toString());
        }
        listLayout.addView(sectiontitleview);
        j = 0;
        while (j < labsproductline.getAvailableSidesList().size()) 
        {
            SideView sideview;
            boolean flag;
            boolean flag1;
            if (j == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j == labsproductline.getAvailableSidesList().size() - 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (labsproductline.getSidesList().contains(labsproductline.getAvailableSidesList().get(j)))
            {
                int k = labsproductline.getSidesList().indexOf(labsproductline.getAvailableSidesList().get(j));
                double d = ((LabsSide)labsproductline.getSidesList().get(k)).getQuantityForPart("1/1");
                ((LabsSide)labsproductline.getAvailableSidesList().get(j)).setQuantityForPart("1/1", d);
            }
            sideview = SideView_.build(this);
            sideview.bind((LabsSide)labsproductline.getAvailableSidesList().get(j), flag, flag1, this);
            listLayout.addView(sideview);
            j++;
        }
    }

    private void setupAndDisplayToppingLists(LabsProductLine labsproductline)
    {
        LabsTopping labstopping = new LabsTopping();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        if (labsproductline.getProduct().isArtisan() || !StringHelper.equals(mMenuManager.getFoodCategory(labsproductline.getProduct().getProductType()), "Pizza"))
        {
            displaySingleToppingList(labsproductline);
            return;
        }
        if (containsSauce(labsproductline))
        {
            SauceSelectorView sauceselectorview = SauceSelectorView_.build(this);
            sauceselectorview.bind(labsproductline, this);
            listLayout.addView(sauceselectorview);
        }
        Iterator iterator = labsproductline.getAvailableToppingsList().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsTopping labstopping1 = (LabsTopping)iterator.next();
            if (labstopping1.isNonMeat() && !labstopping1.isSauce() && !labstopping1.isCheese())
            {
                arraylist1.add(labstopping1);
            } else
            if (labstopping1.isMeat())
            {
                arraylist.add(labstopping1);
            } else
            if (labstopping1.isCheese())
            {
                flag = true;
                labstopping = labstopping1;
            }
        } while (true);
        if (flag)
        {
            SectionTitleView sectiontitleview = SectionTitleView_.build(this);
            sectiontitleview.bind(getString(0x7f080435));
            PizzaCheeseView pizzacheeseview = PizzaCheeseView_.build(this);
            pizzacheeseview.bind(mProductWizardManager.getProductLine(), labstopping, true, this);
            listLayout.addView(sectiontitleview);
            listLayout.addView(pizzacheeseview);
        }
        displayToppingLists(arraylist, labsproductline, getString(0x7f0801c0));
        displayToppingLists(arraylist1, labsproductline, getString(0x7f0801e1));
    }

    private void showPanPizzaWarningIfNecessary()
    {
        if (isPanQtyLimitReached() && !mCartManager.panWarning)
        {
            mCartManager.panWarning = true;
            mActivityHelper.showAlert(AlertType.TOO_MANY_TOPPINGS_PAN_PIZZA, null, null, mAlertDomCommands, mAlertActionCallback);
        }
    }

    private void startFlashAnimation()
    {
        i j = i.a(flashAnimationLayout, "backgroundColor", new int[] {
            -32640, 0x80ffffff
        });
        j.a(new b());
        j.a(new AccelerateInterpolator());
        j.a(1000L);
        j.a();
    }

    private void updateSauce(LabsTopping labstopping)
    {
        Iterator iterator = mProductWizardManager.getProductLine().getToppingsList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((LabsTopping)iterator.next()).isSauce())
            {
                iterator.remove();
            }
        } while (true);
        mProductWizardManager.addTopping(labstopping);
    }

    public void addMissingDefaultToppings(List list)
    {
        Map map = mProductWizardManager.getProductLine().getDefaultToppingsMap();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            if (!containsTopping(((String) (obj)), list))
            {
                obj = new LabsTopping((LabsTopping)map.get(obj));
                ((LabsTopping) (obj)).reset();
                list.add(obj);
            }
        } while (true);
    }

    public boolean containsTopping(String s, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (StringHelper.equals(s, ((LabsTopping)list.next()).getCode()))
            {
                return true;
            }
        }

        return false;
    }

    public boolean handleHomeButtonClicked()
    {
        if (mProductWizardManager.isFromCouponWizard())
        {
            goToCouponWizard();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isGlutenWarningShowing()
    {
        return isGlutenWarningShowing;
    }

    public boolean isPanQtyLimitReached()
    {
        double d;
        double d4;
        double d5;
        if (!mProductWizardManager.getProductLine().isPanPizza())
        {
            return false;
        }
        Iterator iterator = mProductWizardManager.getProductLine().getToppingsList().iterator();
        d = 0.0D;
        d4 = 0.0D;
        d5 = 0.0D;
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                LabsTopping labstopping = (LabsTopping)iterator.next();
                Iterator iterator1 = labstopping.getOptionKeyList().iterator();
                double d3 = d;
                double d2 = d4;
                double d1 = d5;
                do
                {
                    d5 = d1;
                    d4 = d2;
                    d = d3;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator1.next();
                    if (!labstopping.isSauce())
                    {
                        d4 = labstopping.getQuantityForPart(s);
                        d = d4;
                        if (labstopping.getCode().equalsIgnoreCase("C"))
                        {
                            if (d4 == 3D)
                            {
                                d = 2D;
                            } else
                            if (d4 == 2D)
                            {
                                d = 1.0D;
                            } else
                            if (d4 == 0.5D)
                            {
                                d = 0.5D;
                            } else
                            {
                                d = 0.0D;
                            }
                        }
                        if (StringHelper.equals(s, "1/2"))
                        {
                            d3 += d;
                        } else
                        if (StringHelper.equals(s, "2/2"))
                        {
                            d2 += d;
                        } else
                        if (StringHelper.equals(s, "1/1"))
                        {
                            d1 += d;
                        }
                    }
                } while (true);
            }
        } while (true);
        return d5 + d + d4 > 5D;
    }

    public void onAddToOrderClick()
    {
        mAnalyticsUtil.postAddToOrder(mProductWizardManager.getProductLine().getProduct().getProductType(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.ButtonLocation.FOOTER);
        addProductToOrder();
    }

    public void onAfterInject()
    {
        mProductWizardManager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
    }

    public void onBackPressed()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.BackPressedOnToppings());
        super.onBackPressed();
    }

    public void onCheeseToppingAdded(LabsTopping labstopping, int j, PizzaCheeseView pizzacheeseview)
    {
    }

    public void onCheeseToppingPartChanged(LabsTopping labstopping)
    {
        mProductWizardManager.addTopping(labstopping);
        updateProductToppingsList(mProductWizardManager.getProductLine());
    }

    public void onCheeseToppingRemoved(LabsTopping labstopping)
    {
    }

    public void onCheeseToppingWeightUpdate(LabsTopping labstopping, int j, String s)
    {
        labstopping.setQuantityForPart(s, ((Double)labstopping.getOptionAvailability().get(j)).doubleValue());
        updateProductToppingsList(mProductWizardManager.getProductLine());
    }

    public void onOrderClick(View view)
    {
    }

    protected void onPause()
    {
        super.onPause();
        if (subscriber != null)
        {
            App.getInstance().bus.unregister(subscriber);
            subscriber = null;
        }
    }

    public void onQuantityChanged(int j)
    {
        mProductWizardManager.getProductLine().setQuantity(j);
    }

    public void onQuantityUpdated(LabsSide labsside, int j)
    {
        labsside.setQuantityForPart("1/1", j);
        if (!mProductWizardManager.getProductLine().getSidesList().contains(labsside))
        {
            mProductWizardManager.getProductLine().getSidesList().add(labsside);
        } else
        {
            Iterator iterator = mProductWizardManager.getProductLine().getSidesList().iterator();
            while (iterator.hasNext()) 
            {
                LabsSide labsside1 = (LabsSide)iterator.next();
                if (StringHelper.equals(labsside1.getCode(), labsside.getCode()))
                {
                    labsside1.setQuantityForPart("1/1", j);
                }
            }
        }
        updateProductToppingsList(mProductWizardManager.getProductLine());
    }

    public void onResume()
    {
        super.onResume();
        if (sResumeLatchHappened != null)
        {
            sResumeLatchHappened.countDown();
        }
        subscriber = new BusSubscriber(null);
        App.getInstance().bus.register(subscriber);
        if (mProductWizardManager.isEditMode())
        {
            mSpeechManager.removeInvokeButton();
        }
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.ProductDetailsListActivityTransition());
    }

    public void onSauceQuantityUpdate(LabsTopping labstopping, int j)
    {
        Iterator iterator = mProductWizardManager.getProductLine().getToppingsList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsTopping labstopping1 = (LabsTopping)iterator.next();
            if (StringHelper.equals(labstopping1.getCode(), labstopping.getCode()))
            {
                labstopping1.reset();
                labstopping1.setQuantityForPart("1/1", ((Double)labstopping1.getOptionAvailability().get(j)).doubleValue());
            }
        } while (true);
        updateProductToppingsList(mProductWizardManager.getProductLine());
    }

    public void onSauceSelected(LabsTopping labstopping, LabsTopping labstopping1)
    {
        if (labstopping1 == null) goto _L2; else goto _L1
_L1:
        if (labstopping1.getQuantityForPart("1/1") < 0.5D)
        {
            labstopping1.setQuantityForPart("1/1", 1.0D);
        }
        updateSauce(labstopping1);
_L4:
        updateProductToppingsList(mProductWizardManager.getProductLine());
        return;
_L2:
        if (labstopping != null)
        {
            labstopping.reset();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSaveClick()
    {
        mAnalyticsUtil.postAddToOrder(mProductWizardManager.getProductLine().getProduct().getProductType(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.ButtonLocation.HEADER);
        addProductToOrder();
    }

    public void onSizeClicked()
    {
        if (!mNinaHelper.getNinaPartialProducts().isEmpty())
        {
            String s = m.arrayToDelimitedString(mProductWizardManager.getProductLine().getProduct().getVariants().toArray(), ":");
            ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setVariant(s);
            ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setFlavor(null);
            ((NinaPartialProduct)mNinaHelper.getNinaPartialProducts().get(0)).setSize(null);
        }
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.UpdateServerState(new String[] {
            ProductCompleteGuard.NAME, "RESET"
        }));
        try
        {
            mProductWizardManager.setSize(null);
            mProductWizardManager.setFlavor(null);
        }
        catch (Exception exception) { }
        mProductWizardManager.setProductLineInEdit(mProductWizardManager.getProductLine());
        mProductWizardManager.setRestoreMode(true);
        if (mProductWizardManager.hasFlavors())
        {
            ((LabsFlavorListActivity_.IntentBuilder_)LabsFlavorListActivity_.intent(this).flags(0x4020000)).start();
        } else
        if (mProductWizardManager.hasSizes())
        {
            ((LabsSizeListActivity_.IntentBuilder_)LabsSizeListActivity_.intent(this).flags(0x4020000)).start();
            return;
        }
    }

    public void onSplitToppingAdded(LabsTopping labstopping, int j, SplitToppingView splittoppingview)
    {
        boolean flag = true;
        LabsTopping labstopping1 = new LabsTopping(labstopping);
        mProductWizardManager.getProductLine().getToppingsList().remove(labstopping);
        if (validateProductLineAddDetailItem(labstopping1, j, 0, true))
        {
            updateProductToppingsList(mProductWizardManager.getProductLine());
        } else
        {
            labstopping1.reset();
            flag = false;
        }
        splittoppingview.setToppingAdded(labstopping1, flag);
        showPanPizzaWarningIfNecessary();
    }

    public void onSplitToppingPartChanged(LabsTopping labstopping)
    {
        updateProductToppingsList(mProductWizardManager.getProductLine());
    }

    public void onSplitToppingRemoved(LabsTopping labstopping, SplitToppingView splittoppingview)
    {
        mProductWizardManager.getProductLine().getToppingsList().remove(labstopping);
        updateProductToppingsList(mProductWizardManager.getProductLine());
        labstopping.reset();
        splittoppingview.toggleSplitToppingControls(labstopping);
    }

    public void onSplitToppingWeightUpdate(LabsTopping labstopping, int j, SplitToppingView splittoppingview, int k)
    {
        if (validateProductLineAddDetailItem(labstopping, j, k, false))
        {
            updateProductToppingsList(mProductWizardManager.getProductLine());
        }
        splittoppingview.toggleSplitToppingControls(labstopping);
        showPanPizzaWarningIfNecessary();
    }

    public void onWholeToppingAdded(LabsTopping labstopping, int j, WholeToppingView wholetoppingview)
    {
        LabsTopping labstopping1 = new LabsTopping(labstopping);
        mProductWizardManager.getProductLine().getToppingsList().remove(labstopping);
        if (validateProductLineAddDetailItem(labstopping1, j, 0, true))
        {
            updateProductToppingsList(mProductWizardManager.getProductLine());
            wholetoppingview.setToppingAdded(labstopping1, true);
            updateProductToppingsList(mProductWizardManager.getProductLine());
        }
    }

    public void onWholeToppingRemoved(LabsTopping labstopping)
    {
        mProductWizardManager.getProductLine().getToppingsList().remove(labstopping);
        updateProductToppingsList(mProductWizardManager.getProductLine());
    }

    public void onWholeToppingWeightUpdate(LabsTopping labstopping, int j, WholeToppingView wholetoppingview)
    {
        labstopping.reset();
        labstopping.setQuantityForPart("1/1", ((Double)labstopping.getOptionAvailability().get(j)).doubleValue());
        updateProductToppingsList(mProductWizardManager.getProductLine());
        wholetoppingview.toggleWholeToppingControls(labstopping);
    }

    void setupDetailList()
    {
        listLayout = (LinearLayout)findViewById(0x7f0f0368);
        LabsProductLine labsproductline = mProductWizardManager.getProductLine();
        FontManager.applyDominosFont(titleText);
        FontManager.applyDominosFont(productLineTitle);
        FontManager.applyDominosFont(saveButton);
        mCartManager.setPanWithMarinara(false);
        mMenuManager.loadOptionsFromMenu(labsproductline);
        if (mProductWizardManager.isFromCouponWizard())
        {
            labsproductline.setProduct(new LabsProduct(mProductWizardManager.getProduct()));
        }
        Object obj;
        String s;
        if (labsproductline.getSize() != null)
        {
            productLineTitle.setText((new StringBuilder()).append(labsproductline.getSize().getName()).append(" ").append(labsproductline.getProduct().getName()).toString());
        } else
        {
            productLineTitle.setText(labsproductline.getProduct().getName());
        }
        initialFlashFlag = true;
        if (mProductWizardManager.isEditMode())
        {
            saveButton.setText(getString(0x7f08028b));
        }
        s = labsproductline.getProduct().getCode();
        obj = s;
        if (StringHelper.isEmpty(s))
        {
            obj = labsproductline.getProduct().getProductType();
        }
        ImageManagerCDN.INSTANCE.addProductDetailImage(productLineImage, ((String) (obj)));
        if (labsproductline.getProduct().getVariants().size() > 1)
        {
            obj = SizeView_.build(this);
            ((SizeView) (obj)).bind(labsproductline, this);
            listLayout.addView(((View) (obj)));
        }
        obj = QuantityView_.build(this);
        ((QuantityView) (obj)).bind(labsproductline, this);
        listLayout.addView(((View) (obj)));
        if (labsproductline.getAvailableToppingsList().size() > 0)
        {
            setupAndDisplayToppingLists(labsproductline);
        }
        if (labsproductline.getAvailableSidesList().size() > 0)
        {
            setupAndDisplaySidesList(labsproductline);
        }
        checkToppingsErrorWarning();
        mOriginalProductQuantity = labsproductline.getQuantity();
        obj = labsproductline.getProduct().getProductType();
        obj = mMenuManager.getFoodCategory(((String) (obj)));
        mAnalyticsUtil.postProductDetails(((String) (obj)), labsproductline.getProduct().getName());
        updateProductLine();
        addFooterView();
        showPanPizzaWarningIfNecessary();
    }

    public void updateProductLine()
    {
        updateProductLine(null);
    }

    public void updateProductLine(CountDownLatch countdownlatch)
    {
        updateProductToppingsList(mProductWizardManager.getProductLine());
        checkGlutenWarning();
        if (countdownlatch != null)
        {
            countdownlatch.countDown();
            if (listLayout != null)
            {
                listLayout.removeAllViews();
                setupDetailList();
            }
        }
    }

    public void updateProductToppingsList(LabsProductLine labsproductline)
    {
        String s = getString(0x7f080341);
        String s1 = getString(0x7f08018a);
        String s2 = getString(0x7f080283);
        productToppingsList.setText(makeSpannableString(labsproductline.getOptionDescription(resourceUtility.getOptionToQuantityMap(), s, s1, s2)));
        if (initialFlashFlag)
        {
            startFlashAnimation();
        }
    }

    public boolean validateProductLineAddDetailItem(LabsTopping labstopping, int j, int k, boolean flag)
    {
        Object obj = mProductWizardManager.getProductLine();
        double d = ((Double)labstopping.getOptionAvailability().get(k)).doubleValue();
        labstopping.setQuantityForPart(labstopping.getPartWithQuantity(), ((Double)labstopping.getOptionAvailability().get(j)).doubleValue());
        List list = ((LabsProductLine) (obj)).getToppingsList();
        if (d <= 0.5D && flag)
        {
            list.add(labstopping);
        }
        obj = ((LabsProductLine) (obj)).validateSidesOptionsQuantity();
        if (!((String) (obj)).equals("VALID_TOPPINGS_QUANTITY_CODE"))
        {
            labstopping.setQuantityForPart(labstopping.getPartWithQuantity(), d);
            if (d <= 0.0D)
            {
                list.remove(labstopping);
            }
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.ToppingsError(((String) (obj))));
            LogUtil.d(TAG, "POSTING INVALID ITEM ADD EVENT.", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }



/*
    static boolean access$102(LabsProductDetailListActivity labsproductdetaillistactivity, boolean flag)
    {
        labsproductdetaillistactivity.isGlutenWarningShowing = flag;
        return flag;
    }

*/


    private class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final LabsProductDetailListActivity this$0;

        public void onAlertDismissed()
        {
            NinaPartialProduct ninapartialproduct = ((DomProductManager)mMobileSession.getManager("dom_product_manager")).getCurrentPartialProduct();
            if (ninapartialproduct != null)
            {
                ninapartialproduct.setToppingsErrorCode(null);
            }
        }

        _cls1()
        {
            this$0 = LabsProductDetailListActivity.this;
            super();
        }
    }


    private class _cls2 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final LabsProductDetailListActivity this$0;

        public void onAlertDismissed()
        {
            isGlutenWarningShowing = false;
        }

        _cls2()
        {
            this$0 = LabsProductDetailListActivity.this;
            super();
        }
    }


    private class BusSubscriber
    {

        final LabsProductDetailListActivity this$0;

        public void onToppingsError(com.dominos.bus.events.DialogEvents.ToppingsError toppingserror)
        {
            displayToppingsErrorDialog(toppingserror.getQuantityStatusCode(), toppingserror.getPrompt());
        }

        private BusSubscriber()
        {
            this$0 = LabsProductDetailListActivity.this;
            super();
        }

        BusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

}
