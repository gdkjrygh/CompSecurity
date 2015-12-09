// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aj;
import android.support.v4.app.al;
import android.support.v4.view.ViewPager;
import android.support.v4.view.di;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.activities.MainActivity;
import com.jcp.adapters.ReviewsAdapter;
import com.jcp.adapters.cp;
import com.jcp.adapters.s;
import com.jcp.b.b;
import com.jcp.c.aa;
import com.jcp.c.ab;
import com.jcp.e.ac;
import com.jcp.e.ad;
import com.jcp.e.af;
import com.jcp.e.ah;
import com.jcp.e.ai;
import com.jcp.e.ao;
import com.jcp.e.c;
import com.jcp.e.q;
import com.jcp.e.v;
import com.jcp.e.y;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.g.a;
import com.jcp.h.g;
import com.jcp.h.h;
import com.jcp.h.i;
import com.jcp.h.j;
import com.jcp.h.k;
import com.jcp.h.l;
import com.jcp.h.m;
import com.jcp.model.PromotionDetails;
import com.jcp.model.ShippingStatus;
import com.jcp.pojo.SavedItems;
import com.jcp.productentity.AddToBagInputEntity;
import com.jcp.productentity.AttributesList;
import com.jcp.productentity.Image;
import com.jcp.productentity.InventoryEntity;
import com.jcp.productentity.KnowledgeAssistantEntity;
import com.jcp.productentity.OffersEntity;
import com.jcp.productentity.OptionEntity;
import com.jcp.productentity.OptionValueEntity;
import com.jcp.productentity.PriceEntity;
import com.jcp.productentity.ProductDetailsImage;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.productentity.ProductUtilsEntity;
import com.jcp.productentity.RecommendationsEntityContainer;
import com.jcp.productentity.Restrictions;
import com.jcp.productentity.ServiceAgreementEntity;
import com.jcp.productentity.VDATAOptionValueEntity;
import com.jcp.productentity.VDataOptionEntity;
import com.jcp.productentity.Videos;
import com.jcp.productentity.WarrantyEntity;
import com.jcp.productentity.sephoraproductentity.BazaarvoiceEntityContainer;
import com.jcp.storepickup.pojo.StorePickUp;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.ae;
import com.jcp.util.ap;
import com.jcp.util.at;
import com.jcp.util.au;
import com.jcp.util.bj;
import com.jcp.util.bo;
import com.jcp.util.bt;
import com.jcp.util.bv;
import com.jcp.util.d;
import com.jcp.util.e;
import com.jcp.util.f;
import com.jcp.util.z;
import com.jcp.views.CarouselPageIndicator;
import com.jcp.views.HorizontalListOfRecommendedProducts;
import com.jcp.views.HtmlTypefaceTextView;
import com.jcp.views.ScrollViewWithStopMonitor;
import com.jcp.views.x;
import com.jcp.widget.BackToTopButton;
import com.jcp.widget.ProductRating;
import com.squareup.a.ak;
import com.squareup.a.ba;
import com.squareup.a.bi;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.fragments:
//            s, dm, cm, du, 
//            cx, ec, ek, ei, 
//            ed, da, eg, eh, 
//            cn, co, cs, ct, 
//            cu, cv, cw, dn, 
//            do, ShoppingBagFragment, t, ea, 
//            eb, cy, ee, ef, 
//            dl, dw, dd, cz, 
//            db, dc, de, ej, 
//            df, dg, dk, dh, 
//            di, bt, dr, ds, 
//            dt, dv, dx, dy, 
//            dj, fd, cf, dp, 
//            dq

public class ProductDetailFragment extends com.jcp.fragments.s
    implements ac, ad, af, ah, ai, ao, c, y
{

    public static final String a = com/jcp/fragments/ProductDetailFragment.getName();
    private String aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private String aE;
    private s aF;
    private String aG;
    private String aH;
    private String aI;
    private int aJ;
    private boolean aK;
    private String aL;
    private com.jcp.c.a aM;
    private boolean aN;
    private String aO;
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private boolean aS;
    private PopupWindow aT;
    private List aU;
    private Object aV;
    private boolean aW;
    private int aX;
    private boolean aY;
    private View aZ;
    private List aj;
    private String ak;
    private AttributesList al;
    private ProductUtilsEntity am;
    private List an;
    private String ao;
    private int ap;
    private int aq;
    private int ar;
    private String as;
    private TextView at;
    private String au;
    private ProductEntityContainer av;
    private String aw;
    private Map ax;
    private String ay;
    private aa az;
    private boolean b;
    private boolean ba;
    private boolean bb;
    private String bc;
    private String bd;
    private m be;
    private boolean bf;
    private String bg;
    private Stores bh;
    private Map bi;
    private al bj;
    private android.view.ViewTreeObserver.OnScrollChangedListener bk;
    private String bl;
    private List bm;
    private boolean bn;
    private android.view.View.OnClickListener bo;
    private boolean c;
    private boolean d;
    protected ImageView descriptionArrow;
    protected TextView descriptionText;
    private boolean e;
    private String f;
    protected TextView findInStoreErrorText;
    private ab g;
    private String h;
    protected HorizontalListOfRecommendedProducts horizontalListOfRecommendedProducts;
    private AddToBagInputEntity i;
    protected TextView knowledgeAssistantTitleTextView;
    protected ViewGroup knowledgeAssistantsLayout;
    protected ViewGroup mAvailableOnlineLayout;
    protected TextView mBOGOMarketingLabel;
    protected BackToTopButton mBackToTopButton;
    protected Button mBestMatchesButton;
    protected LinearLayout mBopusStatus;
    protected TextView mBopusStoreAddress;
    protected TextView mBopusStoreDistance;
    protected TextView mBopusStoreName;
    protected TextView mBopusStorePhone;
    protected HtmlTypefaceTextView mBopusStoreStatus;
    protected TextView mBopusStoreStreet;
    protected TextView mBopusViewMoreStores;
    protected CarouselPageIndicator mCarouselIndicator;
    protected ImageView mCloseVideo;
    protected HorizontalScrollView mColorHorizontalSection;
    protected ViewGroup mColorLayout;
    protected ViewGroup mColorSectionLayout;
    protected ViewGroup mEstimatedTimeSection;
    protected ViewGroup mFindInStoreLayout;
    protected TextView mFindInStoreText;
    protected ViewGroup mLayoutSections;
    protected ViewGroup mManufacturerShippedSection;
    protected ImageView mMapIcon;
    protected ViewGroup mMonogromingSection;
    protected TextView mNewImage;
    protected TextView mOriginalPrice;
    protected ViewGroup mOriginalPriceLayout;
    protected TextView mOriginalPricePercentage;
    protected ViewPager mPager;
    protected ScrollViewWithStopMonitor mProductDetailsScrollView;
    protected TextView mProductNameText;
    protected ViewGroup mProductOffersLayout;
    protected ProductRating mProductRating;
    protected TextView mQuantityItem;
    protected ListView mReviewsList;
    protected TextView mSale;
    protected TextView mSalePercentage;
    protected ViewGroup mSalePriceLayout;
    protected CheckBox mSaveForLaterIcon;
    protected CheckBox mSaveIcon;
    protected HorizontalScrollView mSelectColorSection;
    protected Button mSelectOptionsButton;
    protected ViewGroup mSelectOptionsButtons;
    protected ViewGroup mSelectOptionsContainer;
    protected ScrollView mSelectOptionsScroll;
    protected ViewGroup mSelectOriginalPriceLayout;
    protected TextView mSelectOriginalPricePer;
    protected TextView mSelectSalePercentage;
    protected ViewGroup mSelectSalePriceLayout;
    protected ImageButton mSelectSectionCloseBtn;
    protected TextView mSelectSectionMarketingLabel;
    protected TextView mSelectSectionOriginalPrice;
    protected TextView mSelectSectionPromotionType;
    protected TextView mSelectSectionSale;
    protected TextView mSelectSectionTitle;
    protected TextView mSelectedColor;
    protected Button mSelectionAddToBag;
    protected ProgressBar mSelectionLoader;
    protected Button mSelectionMatchingItems;
    protected ViewGroup mSelectionOptionsLayout;
    protected ViewGroup mServiceLayout;
    protected ImageView mShare;
    protected ViewGroup mShippingStatus;
    protected ViewGroup mTruckDeliverySection;
    protected ViewGroup mWarrantyLayout;
    protected TextView productTag;
    protected TextView productWebId;
    protected ViewGroup whiteGlovedLayout;

    public ProductDetailFragment()
    {
        e = true;
        f = "";
        h = "";
        ak = "";
        ao = "";
        ap = 1;
        as = "";
        au = "";
        av = new ProductEntityContainer();
        ay = "";
        aO = "";
        ba = true;
        bo = new dm(this);
    }

    static int A(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aq;
    }

    static boolean B(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aB;
    }

    static boolean C(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aD;
    }

    static void D(ProductDetailFragment productdetailfragment)
    {
        productdetailfragment.as();
    }

    static AddToBagInputEntity E(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.i;
    }

    static AttributesList F(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.al;
    }

    static List G(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aj;
    }

    static boolean H(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aC;
    }

    static String I(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aH;
    }

    static List J(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.au();
    }

    static boolean K(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.bb;
    }

    static Stores L(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.bh;
    }

    static void M(ProductDetailFragment productdetailfragment)
    {
        productdetailfragment.ar();
    }

    static void N(ProductDetailFragment productdetailfragment)
    {
        productdetailfragment.at();
    }

    static String O(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aE;
    }

    static com.jcp.c.a P(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aM;
    }

    static int Q(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.ar;
    }

    static q R(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.ak();
    }

    static v S(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aj();
    }

    static di T(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.ah();
    }

    static boolean U(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aN;
    }

    static String V(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aG;
    }

    static String W(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aI;
    }

    static int X(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aJ;
    }

    static boolean Y(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.b;
    }

    private void Z()
    {
        bj = new cm(this);
    }

    static int a(ProductDetailFragment productdetailfragment, int i1)
    {
        productdetailfragment.ap = i1;
        return i1;
    }

    private GridLayout a(int i1, boolean flag)
    {
        GridLayout gridlayout = new GridLayout(i());
        android.widget.GridLayout.LayoutParams layoutparams = new android.widget.GridLayout.LayoutParams();
        layoutparams.setGravity(16);
        gridlayout.setLayoutParams(layoutparams);
        int j1;
        if (flag && i1 > 33)
        {
            int k1 = i1 / 3;
            j1 = k1;
            if (i1 % 3 > 0)
            {
                j1 = k1 + 1;
            }
            gridlayout.setOrientation(1);
            i1 = j1;
            j1 = 3;
        } else
        {
            j1 = 1;
        }
        gridlayout.setColumnCount(i1);
        gridlayout.setRowCount(j1);
        return gridlayout;
    }

    private ImageView a(String s1, OptionValueEntity optionvalueentity)
    {
        ImageView imageview = new ImageView(i());
        imageview.setPadding(30, 0, 5, 0);
        imageview.setTag(s1);
        s1 = optionvalueentity.getImage().getSwatchUrl();
        com.jcp.g.a.a().a(s1).a(a(optionvalueentity)).b(0x7f02023c).a(imageview);
        if (optionvalueentity.getSelected().booleanValue())
        {
            aV = imageview.getTag();
        }
        imageview.setOnClickListener(new du(this));
        return imageview;
    }

    static m a(ProductDetailFragment productdetailfragment, m m1)
    {
        productdetailfragment.be = m1;
        return m1;
    }

    private bi a(OptionValueEntity optionvalueentity)
    {
        boolean flag = optionvalueentity.getSelected().booleanValue();
        boolean flag1 = optionvalueentity.getAvailable().booleanValue();
        if (flag)
        {
            if (flag1)
            {
                return new e();
            } else
            {
                return new d();
            }
        }
        if (flag1)
        {
            return new f();
        } else
        {
            return new com.jcp.util.c();
        }
    }

    static String a(ProductDetailFragment productdetailfragment, ProductEntityContainer productentitycontainer)
    {
        return productdetailfragment.d(productentitycontainer);
    }

    static String a(ProductDetailFragment productdetailfragment, String s1)
    {
        productdetailfragment.aA = s1;
        return s1;
    }

    private String a(List list, String s1)
    {
        Object obj;
        obj = null;
        Iterator iterator = list.iterator();
        do
        {
label0:
            {
                do
                {
                    String s2;
                    do
                    {
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                break label0;
                            }
                            list = (VDataOptionEntity)iterator.next();
                        } while (list == null);
                        s2 = list.getDisplayText();
                    } while (TextUtils.isEmpty(s2) || !s1.equalsIgnoreCase(s2));
                    list = list.getvDataOptionValues();
                } while (list == null);
                Iterator iterator1 = list.iterator();
                list = ((List) (obj));
                do
                {
                    obj = list;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    obj = (VDATAOptionValueEntity)iterator1.next();
                    if (obj != null && ((VDATAOptionValueEntity) (obj)).isSelected())
                    {
                        list = ((VDATAOptionValueEntity) (obj)).getValue();
                    }
                } while (true);
            }
        } while (true);
        return ((String) (obj));
    }

    static List a(ProductDetailFragment productdetailfragment, List list)
    {
        return productdetailfragment.a(list);
    }

    private List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Videos videos = (Videos)list.next();
                String s1 = videos.getId();
                if (!TextUtils.isEmpty(s1) && "Brightcove".equalsIgnoreCase(videos.getType()))
                {
                    arraylist.add(s1);
                }
            } while (true);
        }
        return arraylist;
    }

    private void a(int i1, String s1)
    {
        double d1 = i1 / 1000;
        be.a(String.valueOf(d1));
        be.b(s1);
        com.jcp.h.c.a(be);
    }

    private void a(Dialog dialog)
    {
        ((InputMethodManager)i().getSystemService("input_method")).hideSoftInputFromWindow(dialog.getCurrentFocus().getWindowToken(), 0);
    }

    private void a(View view, ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer.getServiceAgreements() != null && productentitycontainer.getServiceAgreements().size() != 0)
        {
            int i1 = 0;
            while (i1 < productentitycontainer.getServiceAgreements().size()) 
            {
                mServiceLayout.setVisibility(0);
                if (((ServiceAgreementEntity)productentitycontainer.getServiceAgreements().get(i1)).getName() != null)
                {
                    Object obj = ((ServiceAgreementEntity)productentitycontainer.getServiceAgreements().get(i1)).getName();
                    ((TextView)view.findViewById(0x7f0e04ad)).setText(Html.fromHtml(((String) (obj)).trim()));
                    obj = (CheckBox)view.findViewById(0x7f0e04ae);
                    if (((ServiceAgreementEntity)productentitycontainer.getServiceAgreements().get(i1)).getSelected() != null && ((ServiceAgreementEntity)productentitycontainer.getServiceAgreements().get(i1)).getSelected().booleanValue())
                    {
                        ((CheckBox) (obj)).setChecked(true);
                    } else
                    {
                        ((CheckBox) (obj)).setChecked(false);
                    }
                    if (((ServiceAgreementEntity)productentitycontainer.getServiceAgreements().get(i1)).getUrl() != null)
                    {
                        ay = ((ServiceAgreementEntity)productentitycontainer.getServiceAgreements().get(i1)).getUrl();
                    }
                    ((CheckBox) (obj)).setOnClickListener(new cx(this, productentitycontainer));
                } else
                {
                    mServiceLayout.setVisibility(8);
                }
                i1++;
            }
        } else
        {
            mServiceLayout.setVisibility(8);
        }
    }

    public static void a(ViewGroup viewgroup, boolean flag)
    {
        int j1 = viewgroup.getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = viewgroup.getChildAt(i1);
            view.setEnabled(flag);
            if (view instanceof ViewGroup)
            {
                a((ViewGroup)view, flag);
            }
        }

    }

    private void a(CheckBox checkbox, boolean flag)
    {
        checkbox.setChecked(flag);
    }

    private void a(GridView gridview, int i1)
    {
        ListAdapter listadapter = gridview.getAdapter();
        int k1 = b(i1);
        if (listadapter == null)
        {
            return;
        }
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(gridview.getWidth(), 0);
        Object obj = null;
        int j1 = 0;
        for (i1 = 0; i1 < k1; i1++)
        {
            obj = listadapter.getView(i1, ((View) (obj)), gridview);
            if (i1 == 0)
            {
                ((View) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(l1, -2));
            }
            ((View) (obj)).measure(l1, 0);
            j1 += ((View) (obj)).getMeasuredHeight();
        }

        obj = gridview.getLayoutParams();
        obj.height = (listadapter.getCount() - 1) * 10 + j1;
        gridview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        gridview.requestLayout();
    }

    static void a(ProductDetailFragment productdetailfragment, int i1, String s1)
    {
        productdetailfragment.a(i1, s1);
    }

    static void a(ProductDetailFragment productdetailfragment, Dialog dialog)
    {
        productdetailfragment.a(dialog);
    }

    static void a(ProductDetailFragment productdetailfragment, CheckBox checkbox, boolean flag)
    {
        productdetailfragment.a(checkbox, flag);
    }

    static void a(ProductDetailFragment productdetailfragment, String s1, String s2)
    {
        productdetailfragment.a(s1, s2);
    }

    static void a(ProductDetailFragment productdetailfragment, String s1, String s2, boolean flag)
    {
        productdetailfragment.b(s1, s2, flag);
    }

    static void a(ProductDetailFragment productdetailfragment, List list, boolean flag)
    {
        productdetailfragment.a(list, flag);
    }

    private void a(AddToBagInputEntity addtobaginputentity, boolean flag)
    {
        Object obj;
        byte byte0;
        if (addtobaginputentity.getvDataType() != null)
        {
            aO = addtobaginputentity.getvDataType();
        } else
        if (addtobaginputentity.getProductType() != null)
        {
            aO = addtobaginputentity.getProductType();
        }
        obj = aO.toUpperCase();
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 6: default 88
    //                   -2088802350: 198
    //                   -2001251420: 262
    //                   -1493222641: 214
    //                   1524644677: 230
    //                   1632418880: 246
    //                   1804446588: 182;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        byte0;
        JVM INSTR tableswitch 0 5: default 128
    //                   0 278
    //                   1 278
    //                   2 298
    //                   3 298
    //                   4 298
    //                   5 298;
           goto _L8 _L9 _L9 _L10 _L10 _L10 _L10
_L8:
        addtobaginputentity = com.jcp.helper.ac.a(addtobaginputentity);
_L11:
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("items", addtobaginputentity);
        }
        // Misplaced declaration of an exception variable
        catch (AddToBagInputEntity addtobaginputentity)
        {
            addtobaginputentity.printStackTrace();
        }
        if (!flag)
        {
            aM.a(((JSONObject) (obj)), false);
        }
        return;
_L7:
        if (((String) (obj)).equals("REGULAR"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (((String) (obj)).equals("FURNITURE"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (((String) (obj)).equals("MONOGRAMMING"))
        {
            byte0 = 2;
        }
          goto _L1
_L5:
        if (((String) (obj)).equals("HEMMING"))
        {
            byte0 = 3;
        }
          goto _L1
_L6:
        if (((String) (obj)).equals("GIFTCARD"))
        {
            byte0 = 4;
        }
          goto _L1
_L3:
        if (((String) (obj)).equals("MADE-TO-MEASURE"))
        {
            byte0 = 5;
        }
          goto _L1
_L9:
        if (!flag)
        {
            addtobaginputentity = com.jcp.helper.ac.c(addtobaginputentity);
        } else
        {
            addtobaginputentity = com.jcp.helper.ac.b(addtobaginputentity);
        }
          goto _L11
_L10:
        addtobaginputentity = com.jcp.helper.ac.b(addtobaginputentity);
          goto _L11
    }

    private void a(PriceEntity priceentity, ViewGroup viewgroup, TextView textview, TextView textview1)
    {
        double d1 = priceentity.getMax();
        double d2 = priceentity.getMin();
        double d3 = priceentity.getMinPercentOff();
        double d4 = priceentity.getMaxPercentOff();
        if (d1 != 0.0D && d2 != 0.0D)
        {
            if (com.jcp.util.y.a(d1, d2))
            {
                textview.setText((new StringBuilder(j().getString(0x7f0702d3))).append(com.jcp.util.y.a(d1)));
            } else
            {
                textview.setText((new StringBuilder(j().getString(0x7f0702d3))).append(com.jcp.util.y.a(d2)).append(j().getString(0x7f07014a)).append(com.jcp.util.y.a(d1)));
            }
            bg = com.jcp.util.y.a(d1);
            if (d3 != 0.0D && d4 != 0.0D)
            {
                if (d3 == d4)
                {
                    textview1.setText((new StringBuilder()).append(com.jcp.util.y.a(d4)).append(j().getString(0x7f0702bf)));
                    return;
                } else
                {
                    textview1.setText((new StringBuilder()).append(com.jcp.util.y.a(d3)).append(j().getString(0x7f0702c0)).append(com.jcp.util.y.a(d4)).append("% off"));
                    return;
                }
            } else
            {
                textview1.setVisibility(8);
                return;
            }
        } else
        {
            viewgroup.setVisibility(8);
            return;
        }
    }

    private void a(PriceEntity priceentity, String s1, ViewGroup viewgroup, TextView textview, TextView textview1)
    {
        double d1 = priceentity.getMax();
        double d2 = priceentity.getMin();
        double d3 = priceentity.getMinPercentOff();
        double d4 = priceentity.getMaxPercentOff();
        if (d1 != 0.0D && d2 != 0.0D)
        {
            if (d1 == d2)
            {
                textview.setText((new StringBuilder(s1)).append(com.jcp.util.y.a(d1)));
            } else
            {
                textview.setText((new StringBuilder(s1)).append(com.jcp.util.y.a(d2)).append(j().getString(0x7f07014a)).append(com.jcp.util.y.a(d1)));
            }
            bg = com.jcp.util.y.a(d1);
            if (d3 != 0.0D && d4 != 0.0D)
            {
                if (com.jcp.util.y.a(d3, d4))
                {
                    textview1.setText((new StringBuilder()).append(com.jcp.util.y.a(d4)).append(j().getString(0x7f0702bf)));
                    return;
                } else
                {
                    textview1.setText((new StringBuilder()).append(com.jcp.util.y.a(d3)).append(j().getString(0x7f0702c0)).append(com.jcp.util.y.a(d4)).append(j().getString(0x7f0702bf)));
                    return;
                }
            } else
            {
                textview1.setVisibility(8);
                return;
            }
        } else
        {
            viewgroup.setVisibility(8);
            return;
        }
    }

    private void a(ProductEntityContainer productentitycontainer, int i1, String as1[])
    {
        if (i1 == 36)
        {
            d(productentitycontainer.getRecommendationsURL());
            ba = true;
            bm = null;
            f(bm);
            aX = 0;
            bc = productentitycontainer.getReviewsId();
            if (a(as1))
            {
                productentitycontainer = "u0bnu3k7wqssnz125xskv49e9";
            } else
            {
                productentitycontainer = "lprmzurh7ti92bm99qa5obyrh";
            }
            bd = productentitycontainer;
            ay();
        }
    }

    private void a(ProductEntityContainer productentitycontainer, ViewGroup viewgroup, TextView textview, TextView textview1, ViewGroup viewgroup1, TextView textview2, TextView textview3)
    {
        boolean flag;
        viewgroup.setVisibility(8);
        viewgroup1.setVisibility(8);
        flag = productentitycontainer.getManufacturerAdvertisedPrice();
        if (productentitycontainer.getPrices() == null) goto _L2; else goto _L1
_L1:
        productentitycontainer = productentitycontainer.getPrices().iterator();
_L8:
        PriceEntity priceentity;
        String s1;
        byte byte0;
        if (!productentitycontainer.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        priceentity = (PriceEntity)productentitycontainer.next();
        if (priceentity == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = priceentity.getType();
        if (Boolean.valueOf(flag).booleanValue())
        {
            a(priceentity, viewgroup1, textview2, textview3);
            viewgroup.setVisibility(0);
            textview.setText(j().getString(0x7f070067));
            textview1.setVisibility(8);
            continue; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = s1.toLowerCase();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 176
    //                   -1270511332: 245
    //                   3522631: 262
    //                   1379043793: 228;
           goto _L3 _L4 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_262;
_L7:
        switch (byte0)
        {
        case 0: // '\0'
            viewgroup1.setVisibility(0);
            a(priceentity, viewgroup1, textview2, textview3);
            break;

        case 1: // '\001'
            viewgroup.setVisibility(0);
            a(priceentity, j().getString(0x7f0700f7), viewgroup, textview, textview1);
            break;

        case 2: // '\002'
            viewgroup.setVisibility(0);
            a(priceentity, j().getString(0x7f070391), viewgroup, textview, textview1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (s1.equals("original"))
        {
            byte0 = 0;
        }
          goto _L7
_L4:
        if (s1.equals("clearance"))
        {
            byte0 = 1;
        }
          goto _L7
        if (s1.equals("sale"))
        {
            byte0 = 2;
        }
          goto _L7
        if (true) goto _L8; else goto _L2
_L2:
    }

    private void a(ProductEntityContainer productentitycontainer, HorizontalScrollView horizontalscrollview, ViewGroup viewgroup, TextView textview, boolean flag)
    {
        horizontalscrollview.removeAllViews();
        horizontalscrollview.scrollTo(horizontalscrollview.getWidth(), 3);
        horizontalscrollview.setHorizontalScrollBarEnabled(false);
        if (productentitycontainer.getOptions() != null)
        {
            productentitycontainer = productentitycontainer.getOptions().iterator();
label0:
            do
            {
                if (!productentitycontainer.hasNext())
                {
                    break;
                }
                Object obj = (OptionEntity)productentitycontainer.next();
                if (((OptionEntity) (obj)).getDisplayText() != null && ((OptionEntity) (obj)).getOptionValues() != null)
                {
                    if ("COLOR".equalsIgnoreCase(((OptionEntity) (obj)).getDisplayText()))
                    {
                        viewgroup.setVisibility(0);
                        Object obj1 = ((OptionEntity) (obj)).getOptionValues();
                        obj = a(((List) (obj1)).size(), flag);
                        if (obj != null)
                        {
                            horizontalscrollview.addView(((View) (obj)));
                            obj1 = ((List) (obj1)).iterator();
                            do
                            {
                                if (!((Iterator) (obj1)).hasNext())
                                {
                                    continue label0;
                                }
                                OptionValueEntity optionvalueentity = (OptionValueEntity)((Iterator) (obj1)).next();
                                String s1 = optionvalueentity.getUrl();
                                if (!TextUtils.isEmpty(s1))
                                {
                                    if (optionvalueentity.getImage() != null)
                                    {
                                        if (textview != null)
                                        {
                                            b(optionvalueentity);
                                        }
                                        ((GridLayout) (obj)).addView(a(s1, optionvalueentity));
                                    }
                                } else
                                {
                                    viewgroup.setVisibility(8);
                                }
                            } while (true);
                        }
                        viewgroup.setVisibility(8);
                    } else
                    {
                        viewgroup.setVisibility(8);
                    }
                } else
                {
                    viewgroup.setVisibility(8);
                }
            } while (true);
            if (horizontalscrollview.getChildCount() > 0)
            {
                productentitycontainer = (ViewGroup)horizontalscrollview.getChildAt(0);
                if (productentitycontainer != null && productentitycontainer.getChildCount() <= 0)
                {
                    viewgroup.setVisibility(8);
                }
            }
            return;
        } else
        {
            viewgroup.setVisibility(8);
            return;
        }
    }

    private void a(ProductEntityContainer productentitycontainer, TextView textview)
    {
        if (!TextUtils.isEmpty(productentitycontainer.getMarketingLabel()))
        {
            textview.setVisibility(0);
            textview.setText(productentitycontainer.getMarketingLabel());
            return;
        } else
        {
            textview.setVisibility(8);
            return;
        }
    }

    private void a(ProductEntityContainer productentitycontainer, String s1, int i1)
    {
        s1 = com.jcp.h.j.a(productentitycontainer, s1, i1);
        if (a(productentitycontainer.getTags()))
        {
            productentitycontainer = "Ship to Address Only";
        } else
        {
            productentitycontainer = "Ship to Address or Store";
        }
        com.jcp.h.k.a(s1, productentitycontainer, bl);
    }

    private void a(ProductUtilsEntity productutilsentity)
    {
        boolean flag = false;
        Object obj = i().getResources();
        if (productutilsentity != null)
        {
            ViewGroup viewgroup = whiteGlovedLayout;
            int i1;
            if (productutilsentity.getIsWhiteGlovedDelivery().booleanValue())
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            viewgroup.setVisibility(i1);
            if (!TextUtils.isEmpty(productutilsentity.getAssetReferenceURL()) || !TextUtils.isEmpty(productutilsentity.getEditor()))
            {
                knowledgeAssistantsLayout.setVisibility(0);
                knowledgeAssistantTitleTextView.setText(Html.fromHtml(bv.b(productutilsentity.getTitle())));
                knowledgeAssistantsLayout.setOnClickListener(new ec(this, productutilsentity));
            } else
            {
                knowledgeAssistantsLayout.setVisibility(8);
            }
            obj = new SpannableString((new StringBuilder()).append(((Resources) (obj)).getString(0x7f070342)).append(" ").append(((Resources) (obj)).getString(0x7f070344)).toString());
            ((SpannableString) (obj)).setSpan(new ek(this), i().getResources().getString(0x7f070342).length(), ((SpannableString) (obj)).length(), 33);
            productTag.setText(((CharSequence) (obj)));
            productTag.setMovementMethod(LinkMovementMethod.getInstance());
            obj = productTag;
            if (!TextUtils.isEmpty(productutilsentity.getTags()))
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 8;
            }
            ((TextView) (obj)).setVisibility(i1);
            if (!TextUtils.isEmpty(productutilsentity.getWebId()))
            {
                productWebId.setText(Html.fromHtml((new StringBuilder()).append("Web ID: ").append(productutilsentity.getWebId()).toString()));
            }
            productutilsentity = productutilsentity.getDescription();
            obj = Html.fromHtml(productutilsentity, null, new at()).toString().replace("\n\n", "\n");
            descriptionText.setText(((CharSequence) (obj)));
            if (productutilsentity.length() > 200)
            {
                descriptionText.setMaxLines(2);
                descriptionArrow.setBackgroundResource(0x7f02018f);
                productutilsentity = new ei(this);
                descriptionText.setOnClickListener(productutilsentity);
                descriptionArrow.setOnClickListener(productutilsentity);
                return;
            } else
            {
                descriptionText.setMaxLines(0x7fffffff);
                descriptionArrow.setVisibility(8);
                return;
            }
        } else
        {
            knowledgeAssistantsLayout.setVisibility(8);
            return;
        }
    }

    private void a(RecommendationsEntityContainer recommendationsentitycontainer)
    {
        horizontalListOfRecommendedProducts.setTitle("");
        horizontalListOfRecommendedProducts.setRecommendedProductsWithSignInItem(recommendationsentitycontainer.getProducts());
        horizontalListOfRecommendedProducts.setZone(101);
    }

    private void a(Stores stores)
    {
        mFindInStoreText.setText(a(0x7f070279));
        mBopusStoreName.setText(stores.getName());
        bh = stores;
        mBopusStoreStreet.setText(stores.getStreet());
        String s1 = String.format("%s, %s, %s", new Object[] {
            stores.getCity(), stores.getStateCode(), stores.getZip()
        });
        mBopusStoreAddress.setText(s1);
        mBopusStoreDistance.setText(String.format(a(0x7f070175), new Object[] {
            stores.getDistance()
        }));
        mBopusStorePhone.setText(stores.getPhone());
        bt.a(i(), mBopusStoreStatus, stores.getInventory());
        if (JCP.u() || a(av.getTags()))
        {
            mFindInStoreText.setText(a(0x7f0701d9));
            mBopusViewMoreStores.setVisibility(8);
            mBopusStatus.setVisibility(8);
            return;
        } else
        {
            mBopusViewMoreStores.setVisibility(0);
            mBopusStatus.setVisibility(0);
            return;
        }
    }

    private void a(String s1, String s2)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(i())).create();
        alertdialog.setTitle(s1);
        alertdialog.setCancelable(false);
        alertdialog.setMessage(s2);
        alertdialog.setButton(-1, j().getString(0x7f070049), new ed(this, alertdialog));
        alertdialog.show();
    }

    private void a(List list, boolean flag)
    {
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); c((String)list.next(), av.getName())) { }
        }
        if (!flag)
        {
            c("color", av.getName());
        }
    }

    static boolean a(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aY;
    }

    static boolean a(ProductDetailFragment productdetailfragment, boolean flag)
    {
        productdetailfragment.aY = flag;
        return flag;
    }

    static boolean a(ProductDetailFragment productdetailfragment, String as1[])
    {
        return productdetailfragment.a(as1);
    }

    private boolean a(String as1[])
    {
        boolean flag = false;
        if (as1 != null)
        {
            flag = Arrays.asList(as1).contains("Sephora");
        }
        return flag;
    }

    private boolean aA()
    {
        return JCP.u() && !TextUtils.isEmpty(i.getServiceAgreementId()) || a(av.getTags());
    }

    private void aa()
    {
        bk = new da(this);
    }

    private void ab()
    {
        g = new ab(i());
        g.a(this);
        g.a(this);
        g.a(this);
    }

    private void ac()
    {
        az = new aa(i());
        az.a(this);
    }

    private void ad()
    {
        aM = new com.jcp.c.a(i());
        aM.a(this);
    }

    private h ae()
    {
        if (av != null)
        {
            h h1 = new h();
            h1.a(com.jcp.util.bj.a(av));
            h1.b(com.jcp.util.y.a(av.getRating()));
            h1.c(av.getId());
            h1.d(af());
            h1.e(av.getvDataType());
            String s1;
            if (av.getIsPreOrder())
            {
                s1 = "true";
            } else
            {
                s1 = "false";
            }
            h1.f(s1);
            h1.g(av.getDivision());
            h1.h(av.getEntity());
            h1.i(av.getSubdivision());
            h1.j(bl);
            h1.k(av.getBrand());
            return h1;
        } else
        {
            return null;
        }
    }

    private String af()
    {
        if (av != null)
        {
            StringBuilder stringbuilder = new StringBuilder("");
            if (!TextUtils.isEmpty(av.getSkuId()))
            {
                stringbuilder.append(av.getSkuId());
            }
            stringbuilder.append('|');
            if (av.getInventory() != null && !TextUtils.isEmpty(av.getInventory().getStatus()))
            {
                stringbuilder.append(av.getInventory().getStatus());
            }
            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }

    private void ag()
    {
        com.jcp.b.b.a(1);
        ai();
        an = new ArrayList();
        am = new ProductUtilsEntity();
        i = new AddToBagInputEntity();
        aj = new ArrayList();
        ax = new HashMap();
        al = new AttributesList();
        mBackToTopButton.setScrollView(mProductDetailsScrollView);
        mPager.setOnPageChangeListener(ah());
        al();
        an();
        aT = com.jcp.util.au.a(i(), aU, (ViewGroup)i().findViewById(0x7f0e039b), new eg(this));
    }

    private di ah()
    {
        return new eh(this);
    }

    private void ai()
    {
        Point point = new Point();
        i().getWindowManager().getDefaultDisplay().getSize(point);
        aq = point.x;
        ar = point.y;
    }

    private v aj()
    {
        return new cn(this);
    }

    private q ak()
    {
        return new co(this);
    }

    private void al()
    {
        mCloseVideo.setOnClickListener(new cs(this));
        mSaveIcon.setOnClickListener(new ct(this));
        mShare.setOnClickListener(new cu(this));
    }

    private void am()
    {
        if (aF != null && mPager != null)
        {
            Object obj = aF.e();
            if (obj != null)
            {
                obj = mPager.findViewWithTag(obj);
                aF.a(((View) (obj)), aW);
            }
        }
    }

    private void an()
    {
        mSelectionOptionsLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, ar / 2));
        aU = new ArrayList();
        mQuantityItem.setText(String.valueOf(ap));
        mQuantityItem.setOnClickListener(new cv(this));
    }

    private void ao()
    {
        Dialog dialog = new Dialog(i());
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(0x7f0300b4);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ImageView imageview = (ImageView)dialog.findViewById(0x7f0e038d);
        TextView textview = (TextView)dialog.findViewById(0x7f0e038c);
        ((TextView)dialog.findViewById(0x7f0e038e)).setText(j().getString(0x7f0702db));
        textview.setText(j().getString(0x7f0702dc));
        imageview.setOnClickListener(new cw(this, dialog));
        dialog.show();
    }

    private void ap()
    {
        com.jcp.h.g.a("Check Store Availability", "JCP|FindInStore", com.jcp.h.f.a(a()));
    }

    private void aq()
    {
        if (mSelectionOptionsLayout != null)
        {
            mSelectionOptionsLayout.setVisibility(8);
        }
        a(mPager, true);
    }

    private void ar()
    {
        com.jcp.util.au.a(i(), j().getString(0x7f07024c), j().getString(0x7f070041), j().getString(0x7f07036c), new dn(this), new do(this));
    }

    private void as()
    {
        com.jcp.h.g.a("Edit Item|Update", "JCP|BAG", null);
    }

    private void at()
    {
        if (aE != null)
        {
            Bundle bundle = new Bundle();
            bundle.putSerializable("AddToBag", i);
            bundle.putBoolean("isAddToBagUpdate", aD);
            bundle.putString("UPDATEITEMID", aE);
            bundle.putInt("updatedquantiy", ap);
            com.jcp.b.b.d(true);
            com.jcp.b.b.a(2);
            t t1 = a(i());
            ShoppingBagFragment shoppingbagfragment = new ShoppingBagFragment();
            shoppingbagfragment.g(bundle);
            if (t1 != null)
            {
                t1.c(shoppingbagfragment, "ShoppingCart");
            }
            return;
        } else
        {
            a(i, aD);
            return;
        }
    }

    private List au()
    {
        ArrayList arraylist = new ArrayList();
        if (av == null)
        {
            return arraylist;
        }
        Iterator iterator = av.getOptions().iterator();
label0:
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (OptionEntity)iterator.next();
            AttributesList attributeslist = new AttributesList();
            attributeslist.setType(((OptionEntity) (obj)).getDisplayText());
            obj = ((OptionEntity) (obj)).getOptionValues().iterator();
            OptionValueEntity optionvalueentity;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue label0;
                }
                optionvalueentity = (OptionValueEntity)((Iterator) (obj)).next();
            } while (!optionvalueentity.getSelected().booleanValue());
            attributeslist.setValue(optionvalueentity.getValue());
            arraylist.add(attributeslist);
        } while (true);
        return arraylist;
    }

    private void av()
    {
        if (bf)
        {
            bf = false;
            String s1 = a();
            com.jcp.h.g.a(s1, T(), S());
            c(s1);
        }
    }

    private void aw()
    {
        com.jcp.b.a.a(i(), 0x7f070276);
    }

    private void ax()
    {
        com.jcp.b.a.i();
    }

    private void ay()
    {
        if (!bn && ba && !TextUtils.isEmpty(bc))
        {
            bn = true;
            g.a(bd, bc, aX);
        }
    }

    private void az()
    {
        Dialog dialog = new Dialog(i());
        dialog.requestWindowFeature(1);
        dialog.setContentView(0x7f03008a);
        dialog.show();
        dialog.setCancelable(true);
        EditText edittext = (EditText)dialog.findViewById(0x7f0e032c);
        EditText edittext1 = (EditText)dialog.findViewById(0x7f0e032d);
        ((Button)dialog.findViewById(0x7f0e0329)).setOnClickListener(new ea(this, edittext, edittext1, dialog));
        ((ImageButton)dialog.findViewById(0x7f0e0326)).setOnClickListener(new eb(this, dialog));
        dialog.show();
    }

    private int b(int i1)
    {
        if (i1 % 2 == 0)
        {
            return i1 / 2;
        } else
        {
            return i1 / 2 + 1;
        }
    }

    private void b(View view, ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer.getWarranties() != null && productentitycontainer.getWarranties().size() != 0)
        {
            for (int i1 = 0; i1 < productentitycontainer.getWarranties().size(); i1++)
            {
                String s1 = ((WarrantyEntity)productentitycontainer.getWarranties().get(i1)).getName();
                if (((WarrantyEntity)productentitycontainer.getWarranties().get(i1)).getName() != null)
                {
                    mWarrantyLayout.setVisibility(0);
                    ((TextView)view.findViewById(0x7f0e04aa)).setText(Html.fromHtml(s1.trim()));
                }
            }

        } else
        {
            mWarrantyLayout.setVisibility(8);
        }
        mSaveForLaterIcon.setOnClickListener(new cy(this, productentitycontainer));
    }

    static void b(ProductDetailFragment productdetailfragment)
    {
        productdetailfragment.ay();
    }

    static void b(ProductDetailFragment productdetailfragment, ProductEntityContainer productentitycontainer)
    {
        productdetailfragment.h(productentitycontainer);
    }

    static void b(ProductDetailFragment productdetailfragment, String s1, String s2)
    {
        productdetailfragment.b(s1, s2);
    }

    private void b(OptionValueEntity optionvalueentity)
    {
        boolean flag;
        boolean flag1;
        flag = optionvalueentity.getAvailable().booleanValue();
        flag1 = optionvalueentity.getSelected().booleanValue();
        if (flag1)
        {
            mSelectedColor.setTextColor(0xff000000);
            mSelectedColor.setText(Html.fromHtml((new StringBuilder()).append(j().getString(0x7f0700fe)).append("<b>").append(optionvalueentity.getValue()).append("</b> ").toString()));
        }
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        optionvalueentity = optionvalueentity.getImage();
        if (optionvalueentity == null || optionvalueentity.getUrl() == null) goto _L4; else goto _L3
_L3:
        h = optionvalueentity.getUrl();
_L8:
        c = true;
_L6:
        return;
_L4:
        optionvalueentity = av.getImages();
        if (optionvalueentity != null && optionvalueentity.size() > 1)
        {
            h = ((ProductDetailsImage)optionvalueentity.get(0)).getUrl();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag || !flag1) goto _L6; else goto _L5
_L5:
        c = true;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void b(String s1)
    {
        if (com.jcp.b.b.a(i()))
        {
            e = false;
            if (mSelectionOptionsLayout.getVisibility() == 0)
            {
                mSelectionLoader.setVisibility(0);
            }
            mSelectSectionTitle.setVisibility(8);
            g.a("", s1, e);
            return;
        } else
        {
            com.jcp.util.k.a(j().getString(0x7f0702b9), j().getString(0x7f0702b7), i());
            return;
        }
    }

    private void b(String s1, String s2)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i());
        builder.setTitle(s1);
        builder.setMessage(s2);
        builder.setPositiveButton("YES", new ee(this));
        builder.setNegativeButton("NO", new ef(this));
        builder.show();
    }

    private void b(String s1, String s2, boolean flag)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(i())).create();
        alertdialog.setTitle(s1);
        alertdialog.setCancelable(false);
        alertdialog.setMessage(s2);
        alertdialog.setButton(-1, "Ok", new dl(this, alertdialog));
        alertdialog.setOnDismissListener(new dw(this, flag));
        alertdialog.show();
    }

    private void b(String as1[])
    {
        if (as1 == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = as1.length;
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        String s1 = as1[i1];
        if (TextUtils.isEmpty(s1) || !"mattress".equalsIgnoreCase(s1)) goto _L5; else goto _L4
_L4:
        am.setTags(s1);
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean b(ProductDetailFragment productdetailfragment, boolean flag)
    {
        productdetailfragment.aW = flag;
        return flag;
    }

    private boolean b(List list)
    {
label0:
        {
            if (list == null)
            {
                break label0;
            }
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
            } while (!((OptionValueEntity)list.next()).getSelected().booleanValue());
            return true;
        }
        return false;
    }

    private boolean b(boolean flag)
    {
        bi = new LinkedHashMap();
        if (mSelectionOptionsLayout.getVisibility() == 0)
        {
            Object obj = av.getOptions();
            HashMap hashmap = new HashMap();
            if (obj != null)
            {
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    Object obj1 = (OptionEntity)((Iterator) (obj)).next();
                    String s1 = ((OptionEntity) (obj1)).getDisplayText();
                    obj1 = ((OptionEntity) (obj1)).getOptionValues().iterator();
                    while (((Iterator) (obj1)).hasNext()) 
                    {
                        OptionValueEntity optionvalueentity = (OptionValueEntity)((Iterator) (obj1)).next();
                        if ("color".equalsIgnoreCase(s1))
                        {
                            if (optionvalueentity.getSelected().booleanValue())
                            {
                                bi.put(s1, optionvalueentity.getValue());
                                d = true;
                            }
                        } else
                        if (optionvalueentity.getSelected().booleanValue())
                        {
                            bi.put(s1, optionvalueentity.getValue());
                            hashmap.put(s1, Boolean.valueOf(false));
                        }
                    }
                }

            }
            obj = new ArrayList();
            Iterator iterator = ax.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj2 = (java.util.Map.Entry)iterator.next();
                String s2 = (String)((java.util.Map.Entry) (obj2)).getKey();
                obj2 = (TextView)((java.util.Map.Entry) (obj2)).getValue();
                if (hashmap.get(s2) != null)
                {
                    ((TextView) (obj2)).setTextColor(0xff000000);
                } else
                if (flag)
                {
                    ((TextView) (obj2)).setTextColor(Color.parseColor("#cc0000"));
                    ((TextView) (obj2)).setText((new StringBuilder()).append(s2).append(": ").append(j().getString(0x7f0703c0)).toString());
                    ((List) (obj)).add(s2);
                }
            } while (true);
            if ("GIFTCARD".equalsIgnoreCase(av.getType()) || mColorSectionLayout.getVisibility() == 8)
            {
                d = true;
            }
            if (d && hashmap.size() == ax.size())
            {
                return true;
            }
            if (flag)
            {
                if (!d)
                {
                    mSelectedColor.setTextColor(Color.parseColor("#cc0000"));
                    mSelectedColor.setText(j().getString(0x7f0702f6));
                }
                com.jcp.util.au.a(i(), j().getString(0x7f07005e));
                mSelectOptionsScroll.fullScroll(33);
                a(((List) (obj)), d);
            }
            return false;
        } else
        {
            return false;
        }
    }

    static String c(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.ao;
    }

    private void c(int i1)
    {
        Object obj = i();
        if (obj != null && (obj instanceof MainActivity))
        {
            obj = (MainActivity)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((MainActivity) (obj)).c(ao, i1);
            com.jcp.b.a.f(true);
        }
    }

    private void c(View view, ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer.getChannelOffering() == null)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        if (!"OnlineOnly".equalsIgnoreCase(productentitycontainer.getChannelOffering())) goto _L2; else goto _L1
_L1:
        mAvailableOnlineLayout.setVisibility(0);
        ((TextView)view.findViewById(0x7f0e0497)).setText((new StringBuilder()).append(a(0x7f070089)).append(" ").append(a(0x7f070216)).toString());
        mFindInStoreLayout.setVisibility(8);
_L5:
        mBopusStorePhone.setOnClickListener(new dd(this));
        return;
_L2:
        mAvailableOnlineLayout.setVisibility(8);
        mFindInStoreLayout.setVisibility(0);
        if (JCP.u() || a(av.getTags()))
        {
            mFindInStoreText.setText(Html.fromHtml(a(0x7f0701d9)));
        } else
        {
            mFindInStoreText.setText(Html.fromHtml(a(0x7f0700ea)));
        }
        mFindInStoreText.setOnClickListener(new cz(this, productentitycontainer));
        mBopusViewMoreStores.setOnClickListener(new db(this, productentitycontainer));
        mMapIcon.setOnClickListener(new dc(this, productentitycontainer));
        if (!JCP.u() && !a(av.getTags())) goto _L4; else goto _L3
_L3:
        mFindInStoreText.setText(0x7f0701d9);
_L6:
        if (b(false))
        {
            findInStoreErrorText.setVisibility(8);
            U();
        } else
        {
            mBopusViewMoreStores.setVisibility(8);
            mBopusStatus.setVisibility(8);
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (com.jcp.util.ap.a(i()) == null)
        {
            mFindInStoreText.setText(0x7f0700ea);
        } else
        {
            mFindInStoreText.setText(0x7f070279);
        }
          goto _L6
        mAvailableOnlineLayout.setVisibility(8);
        mFindInStoreLayout.setVisibility(8);
        return;
    }

    private void c(ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer != null && productentitycontainer.getPromotions() != null && productentitycontainer.getPromotions().length > 0)
        {
            productentitycontainer = productentitycontainer.getPromotions()[0];
            if (!TextUtils.isEmpty(productentitycontainer.getMessage()))
            {
                mSelectSectionPromotionType.setVisibility(0);
                mSelectSectionPromotionType.setText(productentitycontainer.getMessage());
                return;
            } else
            {
                mSelectSectionPromotionType.setVisibility(8);
                return;
            }
        } else
        {
            mSelectSectionPromotionType.setVisibility(8);
            return;
        }
    }

    private void c(String s1)
    {
        if (av == null) goto _L2; else goto _L1
_L1:
        String s2 = com.jcp.h.g.a(h());
        if (bl != "HOME") goto _L4; else goto _L3
_L3:
        s2 = "Mobile|RICHREL|HOME_MOBILE>";
_L6:
        com.jcp.h.i.a(s1, av.getWebId(), av.getName(), s2, ae());
        bf = false;
_L2:
        return;
_L4:
        if (bl == "PDP")
        {
            s2 = "Mobile|RICHREL|PDP_MOBILE>";
        } else
        if (bl == "OOS")
        {
            s2 = "Mobile|RICHREL|OOS_MOBILE>";
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void c(String s1, String s2)
    {
        com.jcp.h.c.a(s1, "Product Select Error", com.jcp.h.l.a(s2, "mobile"));
    }

    private void c(List list)
    {
        if (list != null)
        {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (KnowledgeAssistantEntity)iterator.next();
                list = ((KnowledgeAssistantEntity) (obj)).getAssetReferenceURL();
                Object obj1 = ((KnowledgeAssistantEntity) (obj)).getEditor();
                obj = ((KnowledgeAssistantEntity) (obj)).getTitle();
                ProductUtilsEntity productutilsentity = am;
                if (TextUtils.isEmpty(list))
                {
                    list = "";
                } else
                {
                    list = list.trim();
                }
                productutilsentity.setAssetReferenceURL(list);
                productutilsentity = am;
                if (TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    list = "";
                } else
                {
                    list = ((String) (obj1)).trim();
                }
                productutilsentity.setEditor(list);
                obj1 = am;
                if (TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    list = "";
                } else
                {
                    list = ((String) (obj)).trim();
                }
                ((ProductUtilsEntity) (obj1)).setTitle(list);
            }
        }
    }

    static boolean c(ProductDetailFragment productdetailfragment, boolean flag)
    {
        productdetailfragment.e = flag;
        return flag;
    }

    static int d(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.ap;
    }

    private String d(ProductEntityContainer productentitycontainer)
    {
label0:
        {
            productentitycontainer = productentitycontainer.getServiceAgreements();
            if (productentitycontainer == null || productentitycontainer.isEmpty())
            {
                break label0;
            }
            productentitycontainer = productentitycontainer.iterator();
            ServiceAgreementEntity serviceagreemententity;
            do
            {
                if (!productentitycontainer.hasNext())
                {
                    break label0;
                }
                serviceagreemententity = (ServiceAgreementEntity)productentitycontainer.next();
            } while (serviceagreemententity == null || !serviceagreemententity.getSelected().booleanValue());
            return serviceagreemententity.getItemId();
        }
        return null;
    }

    private void d(View view, ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer.getIsTruckDeliveryRequired())
        {
            mTruckDeliverySection.setVisibility(0);
            mTruckDeliverySection.setOnClickListener(new de(this));
            return;
        } else
        {
            mTruckDeliverySection.setVisibility(8);
            return;
        }
    }

    private void d(String s1)
    {
        if (s1 != null)
        {
            g.a(s1, b.i);
        }
    }

    private void d(List list)
    {
        aY = false;
        if (list != null && i() != null)
        {
            aX = aX + list.size();
            if (ba && mReviewsList.findViewById(0x7f0e0361) == null)
            {
                aZ = new x(i());
                mReviewsList.addFooterView(aZ);
                return;
            }
            if (!ba && mReviewsList.findViewById(0x7f0e0361) != null)
            {
                try
                {
                    mReviewsList.removeFooterView(aZ);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    com.jcp.util.ae.a(a, "Exception removing reviews footer view", list);
                }
                return;
            }
        }
    }

    static boolean d(ProductDetailFragment productdetailfragment, boolean flag)
    {
        productdetailfragment.aP = flag;
        return flag;
    }

    static s e(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aF;
    }

    private SavedItems e(String s1)
    {
        s1 = (SavedItems[])com.jcp.util.aa.a(new InputStreamReader(new ByteArrayInputStream(s1.getBytes())), [Lcom/jcp/pojo/SavedItems;);
        JCP.b().a(s1);
        if (s1 != null && s1.length > 0)
        {
            return s1[0];
        } else
        {
            return null;
        }
    }

    private void e(View view, ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer.getEstDeliveryMsg() != null)
        {
            if (!TextUtils.isEmpty(productentitycontainer.getEstDeliveryMsg()))
            {
                mEstimatedTimeSection.setVisibility(0);
                view = (TextView)view.findViewById(0x7f0e0494);
                if (productentitycontainer.getEstDeliveryMsg().contains("</strong>"))
                {
                    productentitycontainer = productentitycontainer.getEstDeliveryMsg().split("</strong>");
                    if (!TextUtils.isEmpty(productentitycontainer[1]))
                    {
                        view.setText(Html.fromHtml(bv.b((new StringBuilder()).append("<b>").append(productentitycontainer[1]).append("</b> ").toString())));
                        return;
                    } else
                    {
                        mEstimatedTimeSection.setVisibility(8);
                        return;
                    }
                } else
                {
                    view.setText(Html.fromHtml(bv.b((new StringBuilder()).append("<b>").append(productentitycontainer.getEstDeliveryMsg()).append("</b> ").toString())));
                    return;
                }
            } else
            {
                mEstimatedTimeSection.setVisibility(8);
                return;
            }
        } else
        {
            mEstimatedTimeSection.setVisibility(8);
            return;
        }
    }

    private void e(ProductEntityContainer productentitycontainer)
    {
        List list = productentitycontainer.getOptions();
        if (list != null && !list.isEmpty())
        {
            mLayoutSections.removeAllViews();
            for (int i1 = 0; i1 < list.size(); i1++)
            {
                OptionEntity optionentity = (OptionEntity)list.get(i1);
                if (optionentity == null || TextUtils.isEmpty(optionentity.getDisplayText()) || optionentity.getOptionValues() == null)
                {
                    continue;
                }
                if (!"COLOR".equalsIgnoreCase(optionentity.getDisplayText()))
                {
                    Object obj = new TextView(i());
                    ax.put(optionentity.getDisplayText(), obj);
                    ((TextView) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
                    ((TextView) (obj)).setSingleLine(false);
                    ((TextView) (obj)).setTextColor(0xff000000);
                    ((TextView) (obj)).setTextSize(15F);
                    ((TextView) (obj)).setPadding(0, 5, 20, 5);
                    ((TextView) (obj)).setTypeface(com.jcp.util.z.a(i(), 12));
                    cp cp1;
                    if ("size".equalsIgnoreCase(optionentity.getDisplayText().toLowerCase()))
                    {
                        if (aB)
                        {
                            ((TextView) (obj)).setText((new StringBuilder()).append(bv.b(optionentity.getDisplayText().toLowerCase())).append(j().getString(0x7f0702d9)).toString());
                        } else
                        {
                            ((TextView) (obj)).setText(bv.b(optionentity.getDisplayText().toLowerCase()));
                        }
                    } else
                    {
                        ((TextView) (obj)).setText(bv.b(optionentity.getDisplayText().toLowerCase()));
                    }
                    mLayoutSections.addView(((View) (obj)));
                    obj = new GridView(i());
                    ((GridView) (obj)).setLayoutParams(new android.widget.AbsListView.LayoutParams(-2, -2));
                    if (optionentity.getOptionValues().size() > 1)
                    {
                        ((GridView) (obj)).setNumColumns(2);
                        ((GridView) (obj)).setColumnWidth(3);
                        ((GridView) (obj)).setVerticalSpacing(2);
                        ((GridView) (obj)).setHorizontalSpacing(2);
                        ((GridView) (obj)).setPadding(0, 1, 22, 1);
                        ((GridView) (obj)).setStretchMode(2);
                    } else
                    {
                        ((GridView) (obj)).setNumColumns(1);
                    }
                    ((GridView) (obj)).setGravity(17);
                    cp1 = new cp(this, optionentity.getDisplayText(), optionentity.getOptionValues(), productentitycontainer.getChannelOffering());
                    ((GridView) (obj)).setAdapter(cp1);
                    for (int j1 = 0; j1 < cp1.getCount(); j1++)
                    {
                        if (j1 != cp1.getCount())
                        {
                            View view1 = cp1.getView(j1, null, mLayoutSections);
                            view1.setVisibility(8);
                            mLayoutSections.addView(view1);
                        }
                    }

                    a(((GridView) (obj)), optionentity.getOptionValues().size());
                    mLayoutSections.addView(((View) (obj)));
                }
                if (i1 != productentitycontainer.getOptions().size())
                {
                    View view = new View(i());
                    view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, 2));
                    view.setPadding(10, 10, 0, 10);
                    view.setBackgroundColor(Color.parseColor("#808080"));
                    mLayoutSections.addView(view);
                }
                if (aS)
                {
                    (new ej(this, null, optionentity, optionentity.getType())).a();
                }
            }

        }
    }

    private void e(List list)
    {
        if (list == null || list.isEmpty() || list.size() == 0)
        {
            mProductOffersLayout.setVisibility(8);
            return;
        }
        mProductOffersLayout.removeAllViews();
        mProductOffersLayout.setVisibility(0);
        list = (OffersEntity)list.get(0);
        View view = LayoutInflater.from(i()).inflate(0x7f0300c8, mProductOffersLayout, false);
        TextView textview = (TextView)view.findViewById(0x7f0e03da);
        TextView textview1 = (TextView)view.findViewById(0x7f0e03db);
        String s1 = list.getName();
        String s2 = list.getDescription();
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2))
        {
            mProductOffersLayout.setVisibility(8);
        } else
        {
            textview.setText(list.getName());
            textview1.setText(Html.fromHtml((new StringBuilder()).append(list.getDescription()).append(" ").append("<font color='#33b5e5'><b>see details</b></font>").toString()));
        }
        mProductOffersLayout.addView(view);
    }

    static boolean e(ProductDetailFragment productdetailfragment, boolean flag)
    {
        productdetailfragment.d = flag;
        return flag;
    }

    private void f(View view, ProductEntityContainer productentitycontainer)
    {
        Object obj = productentitycontainer.getInventory();
        if (obj != null)
        {
            String s1 = ((InventoryEntity) (obj)).getMessage();
            int i1;
            if (!"available".equalsIgnoreCase(s1))
            {
                mManufacturerShippedSection.setVisibility(0);
                TextView textview = (TextView)view.findViewById(0x7f0e04a4);
                obj = s1;
                if (s1.contains("("))
                {
                    obj = s1;
                    if (s1.contains(")"))
                    {
                        obj = s1.substring(s1.indexOf('(') + 1, s1.indexOf(')'));
                    }
                }
                textview.setText(Html.fromHtml(bv.b((new StringBuilder()).append("<b>").append(((String) (obj))).append("</b>").toString())));
            } else
            {
                mManufacturerShippedSection.setVisibility(8);
            }
        } else
        {
            mManufacturerShippedSection.setVisibility(8);
        }
        i1 = (int)productentitycontainer.getOverSizedItemSurcharge();
        productentitycontainer = (LinearLayout)view.findViewById(0x7f0e04a5);
        obj = (ImageButton)view.findViewById(0x7f0e04a7);
        if (i1 > 0)
        {
            productentitycontainer.setVisibility(0);
            view.findViewById(0x7f0e04a5).setVisibility(0);
            ((TextView)view.findViewById(0x7f0e04a6)).setText((new StringBuilder()).append("$").append(i1).append(" ").append(j().getString(0x7f0702dd)).toString());
            productentitycontainer.setOnClickListener(new df(this));
            ((ImageButton) (obj)).setOnClickListener(new dg(this));
            return;
        } else
        {
            productentitycontainer.setVisibility(8);
            return;
        }
    }

    static void f(ProductDetailFragment productdetailfragment)
    {
        productdetailfragment.am();
    }

    private void f(ProductEntityContainer productentitycontainer)
    {
        av = productentitycontainer;
        k(productentitycontainer);
        g(productentitycontainer);
        mSelectSectionCloseBtn.setOnClickListener(new dk(this));
    }

    private void f(List list)
    {
        if (com.jcp.util.ah.a(list))
        {
            mReviewsList.setVisibility(8);
            return;
        } else
        {
            mReviewsList.setVisibility(0);
            mReviewsList.setAdapter(new ReviewsAdapter(i(), list));
            a(mReviewsList);
            return;
        }
    }

    static boolean f(ProductDetailFragment productdetailfragment, boolean flag)
    {
        return productdetailfragment.b(flag);
    }

    static String g(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.au;
    }

    private void g(View view, ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer.getvDataType() != null && "MONOGRAMMING".equalsIgnoreCase(productentitycontainer.getvDataType()))
        {
            mMonogromingSection.setVisibility(0);
            mMonogromingSection.setOnClickListener(new dh(this));
        }
        c(view, productentitycontainer);
        d(view, productentitycontainer);
        e(view, productentitycontainer);
        f(view, productentitycontainer);
        if (productentitycontainer.getIsFurnitureProduct())
        {
            mShippingStatus.setVisibility(0);
            at = (TextView)view.findViewById(0x7f0e049e);
            at.setText(a(0x7f0703e8));
            at.setVisibility(0);
            at.setOnClickListener(new com.jcp.fragments.di(this));
        } else
        {
            mShippingStatus.setVisibility(8);
        }
        a(view, productentitycontainer);
        b(view, productentitycontainer);
    }

    private void g(ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer.getOptions() != null && productentitycontainer.getOptions().size() != 0)
        {
            aD = false;
            mSelectionAddToBag.setVisibility(0);
            if (productentitycontainer.getType() != null && "GIFTCARD".equalsIgnoreCase(productentitycontainer.getType()))
            {
                mSelectionAddToBag.setText(j().getString(0x7f070302));
                mSelectionAddToBag.setGravity(17);
            } else
            if (com.jcp.b.b.f())
            {
                if (aB)
                {
                    mSelectionAddToBag.setText(j().getString(0x7f0701da));
                } else
                {
                    mSelectionAddToBag.setText(j().getString(0x7f07044e));
                    mSelectionAddToBag.setGravity(17);
                }
                aD = true;
            } else
            if (aC)
            {
                if (aB)
                {
                    mSelectionAddToBag.setText(j().getString(0x7f0701da));
                } else
                {
                    mSelectionAddToBag.setText(j().getString(0x7f070450));
                    mSelectionAddToBag.setGravity(17);
                }
            } else
            if (aB)
            {
                mSelectionAddToBag.setText(j().getString(0x7f0701da));
            } else
            {
                mSelectionAddToBag.setText(j().getString(0x7f070065));
                mSelectionAddToBag.setGravity(17);
            }
            mSelectionAddToBag.setOnClickListener(bo);
            return;
        } else
        {
            mSelectionAddToBag.setVisibility(8);
            return;
        }
    }

    private void g(boolean flag)
    {
        a(flag);
        super.b();
    }

    static boolean g(ProductDetailFragment productdetailfragment, boolean flag)
    {
        productdetailfragment.aN = flag;
        return flag;
    }

    static List h(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.an;
    }

    private void h(ProductEntityContainer productentitycontainer)
    {
        String s2 = productentitycontainer.getParentEnsembleId();
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(productentitycontainer.getProductUrls());
        String s1 = a();
        Object obj = s1;
        if (s1.equalsIgnoreCase("PRODUCTDETAILS"))
        {
            obj = "MATCHINGITEM";
        }
        productentitycontainer = com.jcp.fragments.bt.a(s2, productentitycontainer.getType(), arraylist, ((String) (obj)), h().getStringArrayList("breadcrumbs"));
        obj = a(i());
        if (obj != null)
        {
            ((t) (obj)).c(productentitycontainer, "MatchingItemFragment");
        }
    }

    static boolean h(ProductDetailFragment productdetailfragment, boolean flag)
    {
        productdetailfragment.aS = flag;
        return flag;
    }

    static m i(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.be;
    }

    private void i(ProductEntityContainer productentitycontainer)
    {
        if (com.jcp.b.b.f())
        {
            mBestMatchesButton.setVisibility(8);
            return;
        }
        if (productentitycontainer.getType() != null && "ENSEMBLE".equalsIgnoreCase(productentitycontainer.getType()) && productentitycontainer.getProductUrls() != null && productentitycontainer.getProductUrls().size() != 0)
        {
            mBestMatchesButton.setVisibility(0);
            mBestMatchesButton.setText((new StringBuilder()).append("VIEW ALL ").append(productentitycontainer.getProductUrls().size()).append(" ITEMS").toString());
            mSelectOptionsButton.setVisibility(8);
            mBestMatchesButton.setOnClickListener(j(productentitycontainer));
            return;
        }
        if (productentitycontainer.getType() != null && ("GIFTCARD".equalsIgnoreCase(productentitycontainer.getType()) || !TextUtils.isEmpty(productentitycontainer.getParentEnsembleId())))
        {
            mBestMatchesButton.setVisibility(0);
            mBestMatchesButton.setText(j().getString(0x7f070289));
            mSelectOptionsButton.setVisibility(8);
            mBestMatchesButton.setOnClickListener(j(productentitycontainer));
            return;
        } else
        {
            mBestMatchesButton.setVisibility(8);
            return;
        }
    }

    static boolean i(ProductDetailFragment productdetailfragment, boolean flag)
    {
        productdetailfragment.c = flag;
        return flag;
    }

    private android.view.View.OnClickListener j(ProductEntityContainer productentitycontainer)
    {
        return new dr(this, productentitycontainer);
    }

    static ProductEntityContainer j(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.av;
    }

    static boolean j(ProductDetailFragment productdetailfragment, boolean flag)
    {
        productdetailfragment.b = flag;
        return flag;
    }

    private void k(ProductEntityContainer productentitycontainer)
    {
        if (!com.jcp.b.b.f())
        {
            if (productentitycontainer.getType() != null && "ENSEMBLE".equalsIgnoreCase(productentitycontainer.getType()) && productentitycontainer.getProductUrls() != null && productentitycontainer.getProductUrls().size() > 0)
            {
                mSelectionMatchingItems.setVisibility(0);
                mSelectionMatchingItems.setOnClickListener(new ds(this, productentitycontainer));
                return;
            }
            if (productentitycontainer.getType() != null && "GIFTCARD".equalsIgnoreCase(productentitycontainer.getType()))
            {
                mSelectionMatchingItems.setText(j().getString(0x7f070289));
                mSelectionMatchingItems.setGravity(17);
                mSelectionMatchingItems.setVisibility(0);
                mSelectionMatchingItems.setOnClickListener(new dt(this, productentitycontainer));
                return;
            } else
            {
                mSelectionMatchingItems.setVisibility(8);
                return;
            }
        } else
        {
            mSelectionMatchingItems.setVisibility(8);
            return;
        }
    }

    static boolean k(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aW;
    }

    static String l(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.f;
    }

    private void l(ProductEntityContainer productentitycontainer)
    {
        List list;
        int i1;
        boolean flag;
        i1 = 0;
        flag = false;
        an.clear();
        if (!c)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        if (productentitycontainer.getOptions() == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        list = productentitycontainer.getOptions();
        i1 = 0;
_L7:
        if (i1 >= list.size()) goto _L2; else goto _L1
_L1:
        Object obj;
        int j1;
        obj = (OptionEntity)list.get(i1);
        if (((OptionEntity) (obj)).getDisplayText() == null || ((OptionEntity) (obj)).getOptionValues() == null || !"COLOR".equalsIgnoreCase(((OptionEntity)productentitycontainer.getOptions().get(i1)).getDisplayText()))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((OptionEntity) (obj)).getOptionValues();
        j1 = 0;
_L4:
        Object obj1;
        Boolean boolean1;
        Boolean boolean2;
        if (j1 >= ((List) (obj)).size())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = (OptionValueEntity)((List) (obj)).get(j1);
        boolean1 = ((OptionValueEntity) (obj1)).getAvailable();
        boolean2 = ((OptionValueEntity) (obj1)).getSelected();
        if (!boolean1.booleanValue() || !boolean2.booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ((OptionValueEntity) (obj1)).getImage();
        if (obj1 != null && !TextUtils.isEmpty(((Image) (obj1)).getUrl()))
        {
            an.add(0, ((Image) (obj1)).getUrl());
        }
_L6:
        j1++;
        if (true) goto _L4; else goto _L3
_L3:
        if (boolean1.booleanValue() || !boolean2.booleanValue()) goto _L6; else goto _L5
_L5:
        obj1 = ((OptionValueEntity) (obj1)).getImage();
        if (obj1 != null && !TextUtils.isEmpty(((Image) (obj1)).getUrl()))
        {
            an.add(0, ((Image) (obj1)).getUrl());
        }
          goto _L6
        i1++;
          goto _L7
_L2:
        if (productentitycontainer.getImages() != null)
        {
            List list1 = productentitycontainer.getImages();
            for (i1 = ((flag) ? 1 : 0); i1 < list1.size(); i1++)
            {
                ProductDetailsImage productdetailsimage = (ProductDetailsImage)list1.get(i1);
                if (productdetailsimage.getUrl() != null && "ALTERNATE".equalsIgnoreCase(productdetailsimage.getType()))
                {
                    an.add(productdetailsimage.getUrl());
                }
            }

        }
        break MISSING_BLOCK_LABEL_422;
        if (productentitycontainer.getImages() != null)
        {
            for (List list2 = productentitycontainer.getImages(); i1 < list2.size(); i1++)
            {
                ProductDetailsImage productdetailsimage1 = (ProductDetailsImage)list2.get(i1);
                if (productdetailsimage1.getUrl() != null)
                {
                    an.add(productdetailsimage1.getUrl());
                }
            }

        }
        if (an.size() != 0)
        {
            if (aF == null)
            {
                aF = new s(i());
            }
            an = com.jcp.util.ah.b(an);
            mPager.postDelayed(new dv(this, productentitycontainer), 500L);
        }
        return;
    }

    static String m(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aA;
    }

    private void m(ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer.getvDataType() != null && "HEMMING".equalsIgnoreCase(productentitycontainer.getvDataType()))
        {
            mSelectOptionsButton.setVisibility(0);
            mSelectOptionsButton.setText(j().getString(0x7f07032e));
            mSelectOptionsButton.setOnClickListener(new dx(this));
            return;
        }
        if (productentitycontainer.getOptions() != null && productentitycontainer.getOptions().size() > 0)
        {
            mSelectOptionsButton.setVisibility(0);
            mSelectOptionsButton.setOnClickListener(new dy(this, productentitycontainer));
            return;
        } else
        {
            mSelectOptionsButton.setVisibility(8);
            return;
        }
    }

    static aa n(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.az;
    }

    private void n(ProductEntityContainer productentitycontainer)
    {
        av = productentitycontainer;
        av();
        if (a(av.getTags()))
        {
            Restrictions restrictions = productentitycontainer.getRestrictions();
            if (restrictions != null && !restrictions.isSocialShareAllowed())
            {
                mShare.setVisibility(8);
            }
        }
        if (productentitycontainer.getId() != null)
        {
            ao = productentitycontainer.getId();
        }
        if (productentitycontainer.getItemId() != null && !TextUtils.isEmpty(productentitycontainer.getItemId()))
        {
            f = productentitycontainer.getItemId();
        }
        am.setWebId(productentitycontainer.getWebId());
        am.setDescription(productentitycontainer.getDescription());
        am.setIsWhiteGlovedDelivery(Boolean.valueOf(productentitycontainer.getIsWhiteGlovedDelivery()));
    }

    static List o(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aU;
    }

    private void o(ProductEntityContainer productentitycontainer)
    {
        if (!TextUtils.isEmpty(productentitycontainer.getName()))
        {
            au = productentitycontainer.getName().trim();
            mProductNameText.setText(Html.fromHtml(au));
        }
    }

    static PopupWindow p(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aT;
    }

    private void p(ProductEntityContainer productentitycontainer)
    {
        mProductRating.setProduct(productentitycontainer);
    }

    static void q(ProductDetailFragment productdetailfragment)
    {
        productdetailfragment.aw();
    }

    private void q(ProductEntityContainer productentitycontainer)
    {
        if (productentitycontainer.getOptions() == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        productentitycontainer = productentitycontainer.getOptions().iterator();
_L2:
        OptionEntity optionentity;
        do
        {
            if (!productentitycontainer.hasNext())
            {
                break MISSING_BLOCK_LABEL_152;
            }
            optionentity = (OptionEntity)productentitycontainer.next();
        } while (b(optionentity.getOptionValues()));
        if (aQ || !"product_option".equalsIgnoreCase(optionentity.getName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        productentitycontainer = ((OptionValueEntity)optionentity.getOptionValues().get(0)).getUrl();
        aQ = true;
_L3:
        if (!TextUtils.isEmpty(productentitycontainer))
        {
            g.a(null, productentitycontainer, false);
        }
        return;
        if (aR || !"size_range".equalsIgnoreCase(optionentity.getName())) goto _L2; else goto _L1
_L1:
        productentitycontainer = ((OptionValueEntity)optionentity.getOptionValues().get(0)).getUrl();
        aR = true;
          goto _L3
        productentitycontainer = null;
          goto _L3
    }

    static String r(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.ay;
    }

    static boolean s(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.e;
    }

    static ab t(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.g;
    }

    static Map u(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.ax;
    }

    static boolean v(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.d;
    }

    static void w(ProductDetailFragment productdetailfragment)
    {
        productdetailfragment.ap();
    }

    static String x(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.as;
    }

    static void y(ProductDetailFragment productdetailfragment)
    {
        productdetailfragment.ao();
    }

    static Object z(ProductDetailFragment productdetailfragment)
    {
        return productdetailfragment.aV;
    }

    protected com.jcp.h.f S()
    {
        if (av != null)
        {
            String s1;
            String s2;
            String s3;
            if (av.getId() == null)
            {
                s1 = "";
            } else
            {
                s1 = av.getId();
            }
            if (av.getvDataType() == null)
            {
                s2 = "";
            } else
            {
                s2 = av.getvDataType();
            }
            s3 = af();
            com.jcp.util.ae.d(a, "Product Details pageview values");
            com.jcp.util.ae.d(a, (new StringBuilder()).append("ID = ").append(s1).toString());
            com.jcp.util.ae.d(a, (new StringBuilder()).append("vData = ").append(s2).toString());
            com.jcp.util.ae.d(a, (new StringBuilder()).append("skuInventory = ").append(s3).toString());
            return com.jcp.h.f.a(s1, s2, s3);
        } else
        {
            return null;
        }
    }

    protected String T()
    {
        return com.jcp.h.g.a(h());
    }

    public void U()
    {
        Stores stores = com.jcp.util.ap.a(i());
        if (stores != null)
        {
            g.a(stores.getNumber(), av.getItemId());
        }
    }

    protected void V()
    {
        Dialog dialog = new Dialog(i());
        dialog.setContentView(0x7f030061);
        dialog.setTitle("Shipping Status");
        EditText edittext = (EditText)dialog.findViewById(0x7f0e0264);
        ((Button)dialog.findViewById(0x7f0e0265)).setOnClickListener(new dj(this, edittext, dialog));
        dialog.show();
    }

    public void W()
    {
        aq();
        mSelectOptionsButtons.setVisibility(0);
    }

    protected void X()
    {
        if (aF != null && mPager != null)
        {
            aF.c(mPager);
        }
    }

    protected boolean Y()
    {
        return false;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bf = false;
        layoutinflater = layoutinflater.inflate(0x7f030071, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        viewgroup = i();
        Bundle bundle1 = h();
        g(bundle1.getBoolean("showSearch", false));
        JCP.a(null);
        Z();
        aa();
        ab();
        ac();
        ad();
        ag();
        horizontalListOfRecommendedProducts.setRecommendedProductClickListener(this);
        a(a(0x7f070328), ((android.app.Activity) (viewgroup)));
        a(bundle1, bundle);
        if (bundle1.containsKey("PPID"))
        {
            com.jcp.fragments.fd.c(viewgroup, bundle1.getString("PPID"));
        }
        return layoutinflater;
    }

    protected String a()
    {
        if (av != null)
        {
            return String.format("Product: %s (%s)", new Object[] {
                av.getName(), av.getId()
            });
        } else
        {
            return "PRODUCTDETAILS";
        }
    }

    public void a(int i1, int j1)
    {
    }

    public void a(int i1, String s1, int j1)
    {
        if (i() != null && n())
        {
            if (j1 != 41 || i1 != 200)
            {
                continue;
            }
            if (aK)
            {
                s1 = a(i());
                if (s1 != null)
                {
                    s1.b(new ShoppingBagFragment(), "ShoppingCart");
                    return;
                }
            } else
            {
                JCP.e().b(ao);
                JCP.b().a(ao);
                c(j1);
                com.jcp.util.k.b(i());
                mSaveForLaterIcon.setChecked(false);
                mSaveIcon.setChecked(false);
                return;
            }
        }
        do
        {
            do
            {
                return;
            } while (j1 != 40 || i1 != 200);
            if (!TextUtils.isEmpty(s1))
            {
                s1 = e(s1);
                if (s1 != null && s1.getPpId() != null && s1.getPpId().equalsIgnoreCase(ao))
                {
                    aA = s1.getId();
                    JCP.e().a(ao, aA);
                    com.jcp.h.a.a(false, av);
                    com.jcp.util.k.a(i());
                    return;
                }
            } else
            {
                JCP.b().a(null);
                return;
            }
        } while (true);
    }

    public void a(Bundle bundle, Bundle bundle1)
    {
        boolean flag;
        flag = false;
        aR = false;
        aQ = false;
        ap = 1;
        if (bundle != null)
        {
            ak = bundle.getString("ProductURL");
            ao = bundle.getString("PPID");
            if (bundle.getString("ItemID") != null)
            {
                f = bundle.getString("ItemID");
            }
            if (bundle.getString("UpdateItemId") != null)
            {
                aE = bundle.getString("UpdateItemId");
            }
            if (bundle.containsKey("quantity"))
            {
                ap = bundle.getInt("quantity");
            }
            if (bundle.containsKey("itemIdPersonalize"))
            {
                aG = bundle.getString("itemIdPersonalize");
            }
            if (bundle.containsKey("PPIDPersonalize"))
            {
                aI = bundle.getString("PPIDPersonalize");
            }
            if (bundle.containsKey("quantityPersonalize"))
            {
                aJ = bundle.getInt("quantityPersonalize");
            }
            if (bundle.containsKey("isPersonalized"))
            {
                aK = bundle.getBoolean("isPersonalized");
            }
            if (bundle.containsKey("idPersonalized"))
            {
                aL = bundle.getString("idPersonalized");
            }
            if (bundle.containsKey("idSavedItem"))
            {
                aH = bundle.getString("idSavedItem");
            }
            bl = bundle.getString("recommendation_zone", "");
            if (ap == 0)
            {
                bl = "OOS";
            }
            e = bundle.getBoolean("ProductDetails");
            c = bundle.getBoolean("ColorSelected");
            a(mSaveIcon, JCP.b().b(ao));
            if (bundle.containsKey("FromSaved"))
            {
                aC = bundle.getBoolean("FromSaved");
                a(mSaveIcon, aC);
                c = false;
            }
            bb = bundle.getBoolean("triggeredFromPDP", false);
        }
        aB = false;
        if (bundle1 == null) goto _L2; else goto _L1
_L1:
        bundle = bundle1.getString("ProductDetails");
        if (TextUtils.isEmpty(bundle)) goto _L2; else goto _L3
_L3:
        a(g.a(bundle), 36, ((String) (bundle)));
_L6:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.jcp.b.b.a(i()))
        {
            break MISSING_BLOCK_LABEL_472;
        }
        if (!i().isFinishing())
        {
            aw();
        }
        mProductDetailsScrollView.setVisibility(8);
        mSelectOptionsContainer.setVisibility(8);
        g.a(ao, ak, e, b.i);
_L4:
        mQuantityItem.setText(String.valueOf(ap));
        return;
        try
        {
            b(i().getResources().getString(0x7f0702a6), i().getResources().getString(0x7f0702b7), false);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            return;
        }
          goto _L4
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(ListView listview)
    {
        ListAdapter listadapter = listview.getAdapter();
        if (listadapter == null)
        {
            return;
        }
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(listview.getWidth(), 0);
        int i2 = listview.getDividerHeight();
        int i1 = 0;
        Object obj = null;
        int j1;
        int k1;
        for (j1 = 0; i1 < listadapter.getCount(); j1 = k1)
        {
            obj = listadapter.getView(i1, ((View) (obj)), listview);
            k1 = j1;
            if (obj != null)
            {
                if (i1 == 0)
                {
                    ((View) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(l1, -2));
                }
                ((View) (obj)).measure(l1, 0);
                k1 = j1 + (((View) (obj)).getMeasuredHeight() + i2);
            }
            i1++;
        }

        obj = listview.getLayoutParams();
        obj.height = j1 + mSelectOptionsContainer.getMeasuredHeight() * 2;
        listview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        listview.requestLayout();
    }

    public void a(ShippingStatus shippingstatus, int i1)
    {
        while (i() == null || !n() || i1 != 10) 
        {
            return;
        }
        at.setVisibility(0);
        if (shippingstatus.getAvailable().booleanValue())
        {
            at.setText(a(0x7f070089));
            return;
        } else
        {
            at.setText(a(0x7f0702bb));
            return;
        }
    }

    protected void a(ProductEntityContainer productentitycontainer)
    {
label0:
        {
            Object obj;
label1:
            {
                String s2 = "";
                String s3 = "";
                String s1 = "";
                obj = s1;
                if (productentitycontainer.getId() != null)
                {
                    obj = s1;
                    if (!TextUtils.isEmpty(productentitycontainer.getId()))
                    {
                        obj = productentitycontainer.getId();
                    }
                }
                s1 = s2;
                if (productentitycontainer.getName() != null)
                {
                    s1 = s2;
                    if (!TextUtils.isEmpty(productentitycontainer.getName()))
                    {
                        s1 = productentitycontainer.getName();
                    }
                }
                s2 = s3;
                if (productentitycontainer.getItemId() != null)
                {
                    s2 = s3;
                    if (!TextUtils.isEmpty(productentitycontainer.getItemId()))
                    {
                        s2 = productentitycontainer.getItemId();
                    }
                }
                productentitycontainer = new Intent();
                productentitycontainer.putExtra("frompdp", true);
                productentitycontainer.putExtra("PRODNAME", s1);
                productentitycontainer.putExtra("ItemID", s2);
                productentitycontainer.putExtra("PPID", ((String) (obj)));
                productentitycontainer.putExtra("IMAGEURL", h);
                obj = i();
                if (obj != null)
                {
                    if (!(obj instanceof MainActivity))
                    {
                        break label0;
                    }
                    if (JCP.u())
                    {
                        break label1;
                    }
                    obj = (MainActivity)obj;
                    boolean flag;
                    if (!a(av.getTags()))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ((MainActivity) (obj)).a(productentitycontainer, flag, bi);
                }
                return;
            }
            ((MainActivity)obj).a(productentitycontainer, true, bi);
            return;
        }
        throw new com.jcp.d.a(String.format("Cannot typecast the object of type %s to class %s", new Object[] {
            com/jcp/activities/MainActivity.getName(), com/jcp/fragments/t.getName()
        }));
    }

    public void a(ProductEntityContainer productentitycontainer, int i1, String s1)
    {
        if (i() != null && n()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        mProductDetailsScrollView.setVisibility(0);
        mProductDetailsScrollView.smoothScrollTo(0, 0);
        mSelectOptionsContainer.setVisibility(0);
        if (i1 != 36 && i1 != 55 && i1 != 56) goto _L1; else goto _L3
_L3:
        ax();
        aw = s1;
        av = null;
        mSelectionLoader.setVisibility(8);
        mSelectSectionTitle.setVisibility(0);
        if (productentitycontainer == null) goto _L1; else goto _L4
_L4:
        int j1;
        try
        {
            n(productentitycontainer);
            b(productentitycontainer.getTags());
            c(productentitycontainer.getKnowledgeAssistants());
            if (am != null)
            {
                a(am);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ProductEntityContainer productentitycontainer)
        {
            ax();
            return;
        }
          goto _L5
_L6:
        l(productentitycontainer);
_L7:
        a(productentitycontainer, mColorHorizontalSection, mColorLayout, null, false);
        if (aV != null)
        {
            mColorHorizontalSection.post(new cf(mColorHorizontalSection, aV, aq));
        }
        a(productentitycontainer, mSalePriceLayout, mSale, mSalePercentage, mOriginalPriceLayout, mOriginalPrice, mOriginalPricePercentage);
        i(productentitycontainer);
        m(productentitycontainer);
        o(productentitycontainer);
        a(productentitycontainer, mBOGOMarketingLabel);
        p(productentitycontainer);
        s1 = mNewImage;
        if (productentitycontainer.getIsNew())
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        s1.setVisibility(j1);
        a(productentitycontainer, i1, productentitycontainer.getTags());
        if (mSelectionOptionsLayout.getVisibility() == 0)
        {
            a(av, true);
        }
        if (com.jcp.b.b.f())
        {
            a(productentitycontainer, true);
            return;
        }
        q(av);
        return;
_L5:
        if (i1 != 36 && i1 != 56) goto _L7; else goto _L6
    }

    protected void a(ProductEntityContainer productentitycontainer, boolean flag)
    {
        mSelectOptionsButton.performClick();
        mSelectionOptionsLayout.setVisibility(0);
        b(productentitycontainer, flag);
        a(((ViewGroup) (mPager)), false);
    }

    public void a(RecommendationsEntityContainer recommendationsentitycontainer, int i1)
    {
        if (i() != null && n())
        {
            if (aK)
            {
                az();
            }
            if (i1 == 38 && recommendationsentitycontainer != null)
            {
                try
                {
                    a(recommendationsentitycontainer);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (RecommendationsEntityContainer recommendationsentitycontainer)
                {
                    com.jcp.util.ae.a(com/jcp/fragments/ProductDetailFragment.getName(), "Exception:", recommendationsentitycontainer);
                }
                return;
            }
        }
    }

    public void a(BazaarvoiceEntityContainer bazaarvoiceentitycontainer, int i1)
    {
        boolean flag;
        flag = false;
        bn = false;
        break MISSING_BLOCK_LABEL_7;
        if (i() != null && n() && i1 == 39 && bazaarvoiceentitycontainer != null)
        {
            i1 = bazaarvoiceentitycontainer.getResults().size();
            if (i1 >= 20)
            {
                flag = true;
            }
            ba = flag;
            if (i1 > 0)
            {
                if (bm == null)
                {
                    bm = bazaarvoiceentitycontainer.getResults();
                } else
                {
                    bm.addAll(bazaarvoiceentitycontainer.getResults());
                }
                d(bazaarvoiceentitycontainer.getResults());
                f(bm);
                return;
            }
        }
        return;
    }

    public void a(StorePickUp storepickup, int i1)
    {
        if (i() != null && n() && storepickup != null)
        {
            Object obj = storepickup.getStores();
            storepickup = com.jcp.util.ap.a(i());
            if (obj != null)
            {
                if (storepickup != null)
                {
                    obj = ((List) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        Stores stores = (Stores)((Iterator) (obj)).next();
                        if (stores != null && stores.getNumber().equalsIgnoreCase(storepickup.getNumber()))
                        {
                            a(stores);
                        }
                    }
                } else
                {
                    a((Stores)((List) (obj)).get(0));
                    return;
                }
            }
        }
    }

    public void a(String s1, int i1)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            com.jcp.util.au.a(i(), s1);
            return;
        }
    }

    public void a(String s1, String s2, boolean flag)
    {
        aB = flag;
        b(s1);
    }

    public void b()
    {
        a(false);
        a(a(0x7f070328));
        super.b();
        a(mSaveIcon, JCP.b().b(ao));
        if (JCP.v() != null)
        {
            a(JCP.v());
            if (mSelectOptionsButton != null)
            {
                mSelectOptionsButton.performClick();
            }
        }
    }

    public void b(int i1, int j1)
    {
        while (i() == null || !n() || j1 != 4 || i1 != 201) 
        {
            return;
        }
        az.d();
        if (aP)
        {
            a(mSaveForLaterIcon, true);
            aP = false;
        }
        a(mSaveIcon, true);
    }

    protected void b(ProductEntityContainer productentitycontainer)
    {
        Object obj = productentitycontainer.getvDataOption();
        Dialog dialog = new Dialog(i());
        dialog.requestWindowFeature(1);
        dialog.setContentView(0x7f03008a);
        dialog.setCancelable(true);
        EditText edittext = (EditText)dialog.findViewById(0x7f0e032c);
        EditText edittext1 = (EditText)dialog.findViewById(0x7f0e032d);
        Button button = (Button)dialog.findViewById(0x7f0e0329);
        String s1 = a(((List) (obj)), "to");
        if (!TextUtils.isEmpty(s1))
        {
            edittext.setText(s1);
        }
        obj = a(((List) (obj)), "from");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            edittext1.setText(((CharSequence) (obj)));
        }
        if (com.jcp.b.b.f())
        {
            aD = true;
            button.setText(j().getString(0x7f07044e));
            button.setGravity(17);
        }
        button.setOnClickListener(new dp(this, edittext, edittext1, dialog, productentitycontainer));
        ((ImageButton)dialog.findViewById(0x7f0e0326)).setOnClickListener(new dq(this, dialog));
        dialog.show();
    }

    protected void b(ProductEntityContainer productentitycontainer, boolean flag)
    {
        e(productentitycontainer.getOffers());
        a(productentitycontainer, mSelectSalePriceLayout, mSelectSectionSale, mSelectSalePercentage, mSelectOriginalPriceLayout, mSelectSectionOriginalPrice, mSelectOriginalPricePer);
        c(productentitycontainer);
        a(productentitycontainer, mSelectSectionMarketingLabel);
        a(productentitycontainer, mSelectColorSection, mColorSectionLayout, mSelectedColor, flag);
        f(productentitycontainer);
        e(productentitycontainer);
        g(mSelectionOptionsLayout, productentitycontainer);
    }

    public void b(String s1, int i1)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            a(mSaveForLaterIcon, aP);
            aP = false;
            com.jcp.util.au.a(i(), s1);
            return;
        }
    }

    public void c(int i1, int j1)
    {
        if (i() != null && n() && com.jcp.http.b.a(i1))
        {
            if (aK)
            {
                String s1 = com.jcp.b.b.l(aL);
                az.b(s1);
                return;
            }
            if (j1 == 63)
            {
                t t1 = a(i());
                if (t1 != null)
                {
                    t1.b(new ShoppingBagFragment(), "ShoppingCart");
                }
                Toast.makeText(i(), j().getString(0x7f070252), 0).show();
                return;
            }
            if (j1 == 17)
            {
                if (!TextUtils.isEmpty(i.getServiceAgreementId()))
                {
                    Toast.makeText(i(), j().getString(0x7f0703c7), 0).show();
                } else
                {
                    Toast.makeText(i(), j().getString(0x7f070249), 0).show();
                }
                j1 = ap;
                a(av, bg, i.getQuantity());
                i1 = j1;
                if (!TextUtils.isEmpty(i.getServiceAgreementId()))
                {
                    if (ap > 1)
                    {
                        i1 = ap * 2;
                    } else
                    {
                        i1 = j1 + 1;
                    }
                }
                j1 = i1 + JCP.d().a();
                i1 = j1;
                if ("FURNITURE".equalsIgnoreCase(i.getProductType()))
                {
                    i1 = j1;
                    if (aA())
                    {
                        i1 = j1 + 1;
                    }
                }
                JCP.d().a(i1);
                a(j().getString(0x7f070328), i());
                return;
            }
        }
    }

    public void c(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        while (i() == null || !n() || errormessageentitycontainer == null) 
        {
            return;
        }
        com.jcp.util.au.a(i(), a(0x7f0701bb), errormessageentitycontainer);
    }

    public void c(Bundle bundle)
    {
        com.jcp.b.b.d(false);
        l(bundle);
    }

    public void c(String s1, int i1)
    {
        if (i() != null && n())
        {
            ax();
            ax.clear();
            if (i() != null && !i().isFinishing())
            {
                b("Server Response", s1, false);
                return;
            }
        }
    }

    public void d()
    {
        super.d();
        android.support.v4.app.ac ac1 = i();
        if (ac1 != null)
        {
            ac1.f().a(bj);
        }
        if (mProductDetailsScrollView != null)
        {
            mProductDetailsScrollView.getViewTreeObserver().addOnScrollChangedListener(bk);
        }
    }

    public void d(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
    }

    public void d(String s1, int i1)
    {
        while (i() == null || !n() || TextUtils.isEmpty(s1)) 
        {
            return;
        }
        at.setText(s1);
    }

    public void e()
    {
        super.e();
        android.support.v4.app.ac ac1 = i();
        if (ac1 != null)
        {
            ac1.f().b(bj);
        }
        if (mProductDetailsScrollView != null)
        {
            mProductDetailsScrollView.getViewTreeObserver().removeOnScrollChangedListener(bk);
        }
        if (mBackToTopButton != null)
        {
            mBackToTopButton.a();
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        if (av != null)
        {
            bundle.putString("ProductDetails", aw);
        }
    }

    public void e(String s1, int i1)
    {
        ax();
    }

    public void e_()
    {
        super.e_();
        g(true);
    }

    public void f()
    {
        super.f();
        ButterKnife.reset(this);
    }

    public void f(String s1, int i1)
    {
        ax();
    }

    public void f_()
    {
        super.f_();
        bf = true;
        Object obj = i().getSharedPreferences("com.jcp.activities", 0);
        if (((SharedPreferences) (obj)).contains("color_changed") && ((SharedPreferences) (obj)).getBoolean("color_changed", false))
        {
            String s1 = ((SharedPreferences) (obj)).getString("ProductURL", null);
            ((SharedPreferences) (obj)).edit().putBoolean("color_changed", false).apply();
            obj = new Bundle();
            ((Bundle) (obj)).putString("PPID", ao);
            ((Bundle) (obj)).putBoolean("ProductDetails", false);
            ((Bundle) (obj)).putString("ProductURL", ak);
            ((Bundle) (obj)).putBoolean("ColorSelected", true);
            if (!TextUtils.isEmpty(s1))
            {
                ((Bundle) (obj)).putString("ProductURL", s1);
            }
            l(((Bundle) (obj)));
        }
        W();
    }

    public void g_()
    {
        super.g_();
        X();
    }

    public void l(Bundle bundle)
    {
        a(bundle, ((Bundle) (null)));
    }

    public void u()
    {
        super.u();
        g(false);
    }

}
