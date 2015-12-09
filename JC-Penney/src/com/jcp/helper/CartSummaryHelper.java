// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.activities.CaPrivacyPolicyActivity;
import com.jcp.activities.CartCheckoutActivity;
import com.jcp.activities.PrivacyPolicyActivity;
import com.jcp.adapters.v;
import com.jcp.b.b;
import com.jcp.c.aa;
import com.jcp.c.af;
import com.jcp.e.ag;
import com.jcp.e.e;
import com.jcp.e.g;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.SignInFragment;
import com.jcp.fragments.rewards.RewardsConnectAccountsSignInToRewardsFragment;
import com.jcp.fragments.t;
import com.jcp.h.a;
import com.jcp.model.EstimatedShippingCharges;
import com.jcp.model.OrderItemsDetails;
import com.jcp.model.PromotionDetails;
import com.jcp.model.Promotions;
import com.jcp.model.rewards.Certificate;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.model.rewards.RewardsProfile;
import com.jcp.settings.model.CartSettings;
import com.jcp.settings.model.JCPSettings;
import com.jcp.util.ae;
import com.jcp.util.au;
import com.jcp.util.bn;
import com.jcp.util.bt;
import com.jcp.util.y;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.helper:
//            p, r, q, n, 
//            o

public class CartSummaryHelper
    implements android.view.View.OnClickListener, ag, e
{

    private static final String a = com/jcp/helper/CartSummaryHelper.getName();
    private static int b = -1;
    private static int c = -1;
    private static int d = -1;
    protected TextView availableRewardsCount;
    protected LinearLayout availableRewardsLayout;
    private double e;
    private WeakReference f;
    private aa g;
    private boolean h;
    private v i;
    private com.jcp.adapters.y j;
    private List k;
    private List l;
    private List m;
    protected TextView mCouponCodeButton;
    protected EditText mCouponCodeEditText;
    protected TextView mCouponDiscount;
    protected RelativeLayout mCouponLayout;
    protected TextView mCouponSerialCodeButton;
    protected EditText mCouponSerialCodeEditText;
    protected TextView mCouponmax;
    protected TextView mCouponsCountDescTxt;
    protected ListView mCouponsListView;
    protected RelativeLayout mEstimateSameDayPickUpLayout;
    protected TextView mEstimateShipToAddressHeaderView;
    protected ImageView mEstimateShipToAddressQuestionMark;
    protected TextView mEstimateShipToStoreHeaderView;
    protected ImageView mEstimateShipToStoreQuestionMark;
    protected TextView mEstimateTaxHeader;
    protected TextView mEstimateTaxTextView;
    protected TextView mFindCouponsText;
    protected TextView mInvalidCouponsText;
    protected TextView mInvalidRewardText;
    protected TextView mOrderTotalTextView;
    protected EditText mRewardEditText;
    protected EditText mRewardSerialCodeEditText;
    protected TextView mRewardTotalDiscount;
    protected TextView mRewardapplyBtn;
    protected RelativeLayout mRewardsLayout;
    protected ListView mRewardsListView;
    protected TextView mRewardsmax;
    protected TextView mRewardsnextBtn;
    protected View mSeperator;
    protected TextView mSubtotalHeader;
    protected TextView mSubtotalTextView;
    protected TextView mTotalCouponDiscount;
    protected TextView mTotalRewardDiscount;
    protected TextView mYouSavedHeader;
    protected TextView mYouSavedTextView;
    private PromotionDetails n;
    private g o;
    private RewardsProfile p;
    private int q;
    private AlertDialog r;
    private String s;
    private boolean t;
    protected TextView tvEstimateShipToAddress;
    protected TextView tvEstimateShipToStore;
    protected TextView tvSameDayPickUpPrice;

    public CartSummaryHelper(ac ac1, g g1, aa aa1, boolean flag)
    {
        f = new WeakReference(null);
        k = new ArrayList();
        l = new ArrayList();
        m = new ArrayList();
        t = true;
        h = flag;
        f = new WeakReference(ac1);
        g = aa1;
        n = null;
        o = g1;
        s = ac1.getString(0x7f070176);
        f();
    }

    public static t a(ac ac1)
    {
        if (ac1 != null && (ac1 instanceof t))
        {
            return (t)ac1;
        } else
        {
            return null;
        }
    }

    private String a(double d1)
    {
        if (d1 != 0.0D)
        {
            return (new StringBuilder()).append(s).append(y.a(d1)).toString();
        } else
        {
            return g().getString(0x7f0701ea);
        }
    }

    static List a(CartSummaryHelper cartsummaryhelper)
    {
        return cartsummaryhelper.m;
    }

    private List a(List list)
    {
        q = 0;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Certificate certificate = (Certificate)iterator.next();
            certificate.setIsApplied(false);
            if (!m.isEmpty())
            {
                int i1 = 0;
                while (i1 < m.size()) 
                {
                    if (((PromotionDetails)m.get(i1)).getSerialNumber().equalsIgnoreCase(certificate.getSerialNumber()))
                    {
                        certificate.setIsApplied(true);
                        q = q + 1;
                    }
                    i1++;
                }
            }
        } while (true);
        return list;
    }

    private void a(int i1, boolean flag)
    {
        if (i1 > 0)
        {
            if (i1 == 2)
            {
                mFindCouponsText.setVisibility(8);
                mCouponCodeEditText.setVisibility(8);
                mCouponCodeButton.setVisibility(8);
                mSeperator.setVisibility(8);
                mCouponmax.setVisibility(0);
            } else
            {
                mFindCouponsText.setVisibility(0);
                mCouponCodeEditText.setVisibility(0);
                mCouponCodeButton.setVisibility(0);
                mCouponmax.setVisibility(8);
            }
            mSeperator.setVisibility(0);
            mTotalCouponDiscount.setVisibility(0);
            mCouponDiscount.setVisibility(0);
            mCouponsListView.setVisibility(0);
        } else
        {
            mSeperator.setVisibility(8);
            mCouponsCountDescTxt.setVisibility(8);
            mTotalCouponDiscount.setVisibility(8);
            mCouponDiscount.setVisibility(8);
            mCouponsListView.setVisibility(8);
        }
        if (flag)
        {
            if (l.size() > 0)
            {
                m();
                k();
            }
            a(mCouponsListView);
        } else
        if (b.p)
        {
            m();
            b.p = false;
            return;
        }
    }

    private void a(Activity activity, boolean flag)
    {
        Intent intent = new Intent(activity, com/jcp/activities/CartCheckoutActivity);
        Bundle bundle = new Bundle();
        if (flag)
        {
            bundle.putString("url", com.jcp.b.b.i());
            bundle.putInt("from", 4);
        } else
        {
            bundle.putInt("from", 1);
        }
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, 1000);
    }

    private void a(View view, boolean flag)
    {
        view = (Integer)view.getTag();
        g = new aa(g());
        g.a(this);
        if (flag)
        {
            if (view.intValue() < l.size())
            {
                n = (PromotionDetails)l.get(view.intValue());
                g.a(n.getId(), 70);
            }
        } else
        if (view.intValue() < m.size())
        {
            n = (PromotionDetails)m.get(view.intValue());
            g.a(n.getId(), 69);
            return;
        }
    }

    static void a(CartSummaryHelper cartsummaryhelper, PromotionDetails promotiondetails)
    {
        cartsummaryhelper.b(promotiondetails);
    }

    private void a(PromotionDetails promotiondetails)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(g());
        builder.setMessage(promotiondetails.getMessage());
        builder.setPositiveButton(0x7f070049, new p(this, promotiondetails));
        r = builder.create();
        r.show();
    }

    private void a(Promotions promotions)
    {
        if (b.v)
        {
            b.v = false;
        } else
        {
            mInvalidCouponsText.setVisibility(8);
            mInvalidRewardText.setVisibility(8);
        }
        k.clear();
        k.addAll(promotions.getPromotions());
        l.clear();
        m.clear();
    }

    private void a(boolean flag)
    {
        String s1;
        if (flag)
        {
            s1 = g().getString(0x7f07041c);
        } else
        {
            s1 = g().getString(0x7f0701ea);
        }
        tvEstimateShipToAddress.setText(s1);
        tvSameDayPickUpPrice.setText(s1);
        tvEstimateShipToStore.setText(s1);
    }

    static boolean a(CartSummaryHelper cartsummaryhelper, boolean flag)
    {
        cartsummaryhelper.t = flag;
        return flag;
    }

    static ac b(CartSummaryHelper cartsummaryhelper)
    {
        return cartsummaryhelper.g();
    }

    private void b(int i1, boolean flag)
    {
        if (i1 > 0)
        {
            if (i1 == 10)
            {
                mRewardsmax.setVisibility(0);
            } else
            {
                mRewardsmax.setVisibility(8);
            }
            mRewardsListView.setVisibility(0);
            mTotalRewardDiscount.setVisibility(0);
            mRewardTotalDiscount.setVisibility(0);
        } else
        {
            mRewardsListView.setVisibility(8);
            mTotalRewardDiscount.setVisibility(8);
            mRewardTotalDiscount.setVisibility(8);
        }
        if (flag)
        {
            if (m.size() > 0)
            {
                n();
                l();
            }
            a(mRewardsListView);
        } else
        if (b.q)
        {
            n();
            b.q = false;
            return;
        }
    }

    private void b(PromotionDetails promotiondetails)
    {
        n = promotiondetails;
        g = new aa(g());
        g.a(this);
        g.a(promotiondetails.getId(), 69);
    }

    static boolean c(CartSummaryHelper cartsummaryhelper)
    {
        return cartsummaryhelper.t;
    }

    static int e()
    {
        return d;
    }

    private void f()
    {
        if (b == -1)
        {
            try
            {
                b = Integer.parseInt(JCP.f().getCart().getMaxCouponsPromotional());
            }
            catch (NumberFormatException numberformatexception)
            {
                ae.a("Cart Summary Helper", (new StringBuilder()).append("NumberFormatException while converting string to int ").append(numberformatexception).toString());
                numberformatexception.printStackTrace();
                b = 1;
            }
        }
        if (c == -1)
        {
            try
            {
                c = Integer.parseInt(JCP.f().getCart().getMaxCouponsShipping());
            }
            catch (NumberFormatException numberformatexception1)
            {
                ae.a("Cart Summary Helper", (new StringBuilder()).append("NumberFormatException while converting string to int ").append(numberformatexception1).toString());
                numberformatexception1.printStackTrace();
                c = 1;
            }
        }
        if (d != -1)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        d = Integer.parseInt(JCP.f().getCart().getMaxRewardsCount());
        return;
        NumberFormatException numberformatexception2;
        numberformatexception2;
        ae.a("Cart Summary Helper", (new StringBuilder()).append("NumberFormatException while converting string to int ").append(numberformatexception2).toString());
        numberformatexception2.printStackTrace();
        d = 10;
        return;
    }

    private ac g()
    {
        if (f == null)
        {
            throw new com.jcp.d.b((new StringBuilder()).append(com/jcp/helper/CartSummaryHelper.getName()).append(" activity reference is gone").toString());
        } else
        {
            return (ac)f.get();
        }
    }

    private void h()
    {
        af.b(g()).a(this);
        af.b(g()).f();
    }

    private void i()
    {
        mCouponCodeEditText.addTextChangedListener(new r(this, mCouponCodeEditText, mCouponCodeButton));
        mRewardEditText.addTextChangedListener(new r(this, mRewardEditText, mRewardsnextBtn));
        mCouponSerialCodeEditText.addTextChangedListener(new r(this, mCouponSerialCodeEditText, mCouponSerialCodeButton));
        mRewardSerialCodeEditText.addTextChangedListener(new r(this, mRewardSerialCodeEditText, mRewardapplyBtn));
    }

    private void j()
    {
        int i1 = 0;
        while (i1 < l.size()) 
        {
            if (((PromotionDetails)l.get(i1)).getMessage() != null)
            {
                mCouponsCountDescTxt.setVisibility(0);
                mCouponsCountDescTxt.setText(((PromotionDetails)l.get(i1)).getMessage());
            } else
            {
                mCouponsCountDescTxt.setVisibility(8);
            }
            i1++;
        }
    }

    private void k()
    {
        double d1 = 0.0D;
        for (int i1 = 0; i1 < l.size(); i1++)
        {
            d1 += ((PromotionDetails)l.get(i1)).getAmount();
        }

        mCouponDiscount.setText((new StringBuilder()).append(s).append(y.a(d1, true)).toString());
    }

    private void l()
    {
        double d1 = 0.0D;
        for (int i1 = 0; i1 < m.size(); i1++)
        {
            d1 += ((PromotionDetails)m.get(i1)).getAmount();
        }

        mRewardTotalDiscount.setText((new StringBuilder()).append(s).append(y.a(d1, true)).toString());
    }

    private void m()
    {
        if (i == null)
        {
            i = new v(g(), l, this);
            mCouponsListView.setAdapter(i);
            return;
        } else
        {
            i.notifyDataSetChanged();
            return;
        }
    }

    private void n()
    {
        if (j == null)
        {
            j = new com.jcp.adapters.y(g(), m, this);
            mRewardsListView.setAdapter(j);
            return;
        } else
        {
            j.notifyDataSetChanged();
            return;
        }
    }

    private void o()
    {
        if (g().getCurrentFocus() != null)
        {
            ac ac1 = g();
            g();
            ((InputMethodManager)ac1.getSystemService("input_method")).hideSoftInputFromWindow(g().getCurrentFocus().getWindowToken(), 0);
        }
    }

    public View a()
    {
        View view = g().getLayoutInflater().inflate(0x7f03001f, null);
        ButterKnife.inject(this, view);
        Object obj = (LinearLayout)view.findViewById(0x7f0e011d);
        if (!h)
        {
            view.findViewById(0x7f0e0183).setVisibility(8);
            c();
            ((LinearLayout) (obj)).setVisibility(8);
        } else
        {
            RelativeLayout relativelayout = (RelativeLayout)((LinearLayout) (obj)).findViewById(0x7f0e04cd);
            obj = (RelativeLayout)((LinearLayout) (obj)).findViewById(0x7f0e04d1);
            TextView textview = (TextView)((RelativeLayout) (obj)).findViewById(0x7f0e03eb);
            if (af.b(g()).a())
            {
                if (JCP.s().c())
                {
                    if (JCP.s().d())
                    {
                        relativelayout.setVisibility(0);
                        ((RelativeLayout) (obj)).setVisibility(8);
                        h();
                    } else
                    {
                        ((RelativeLayout) (obj)).setOnClickListener(this);
                        ((RelativeLayout) (obj)).setVisibility(0);
                        textview.setText(g().getResources().getString(0x7f070369));
                        relativelayout.setVisibility(8);
                    }
                } else
                {
                    ((RelativeLayout) (obj)).setOnClickListener(this);
                    ((RelativeLayout) (obj)).setVisibility(0);
                    textview.setText(g().getResources().getString(0x7f070186));
                    relativelayout.setVisibility(8);
                }
            } else
            {
                relativelayout.setVisibility(8);
                ((RelativeLayout) (obj)).setVisibility(8);
            }
        }
        i();
        return view;
    }

    public void a(int i1, int j1)
    {
        ac ac1;
        if (j1 == 22)
        {
            if (n != null)
            {
                k.remove(n);
                l.remove(n);
                m.remove(n);
                n = null;
            }
            n = null;
        } else
        {
            mCouponCodeEditText.setText("");
            mCouponSerialCodeEditText.setText("");
            mRewardSerialCodeEditText.setText("");
            mRewardEditText.setText("");
            mRewardSerialCodeEditText.setVisibility(8);
            mRewardapplyBtn.setVisibility(8);
            mCouponSerialCodeButton.setVisibility(8);
        }
        ac1 = g();
        if (j1 != 58) goto _L2; else goto _L1
_L1:
        com.jcp.h.a.a("Coupon", "2");
        Toast.makeText(ac1, ac1.getResources().getString(0x7f070083), 0).show();
_L4:
        o.U();
        b();
        return;
_L2:
        if (j1 == 50)
        {
            Toast.makeText(ac1, ac1.getResources().getString(0x7f070084), 0).show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(ListView listview)
    {
        ListAdapter listadapter = listview.getAdapter();
        if (listadapter == null)
        {
            return;
        }
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(listview.getWidth(), 0);
        Object obj = null;
        int j1 = 0;
        for (int i1 = 0; i1 < listadapter.getCount(); i1++)
        {
            obj = listadapter.getView(i1, ((View) (obj)), listview);
            ((View) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(k1, -2));
            ((View) (obj)).measure(k1, 0);
            j1 += ((View) (obj)).getMeasuredHeight();
        }

        obj = listview.getLayoutParams();
        obj.height = listview.getDividerHeight() * (listadapter.getCount() - 1) + j1;
        listview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        listview.requestLayout();
    }

    public void a(ErrorMessageEntityContainer errormessageentitycontainer, int i1)
    {
label0:
        {
            if (errormessageentitycontainer != null)
            {
                if (!"SRV_CART_EMPTY".equals(errormessageentitycontainer.getErrorCode()))
                {
                    break label0;
                }
                o.V();
                o.b(errormessageentitycontainer.getErrorMessage());
            }
            return;
        }
        b.v = true;
        if ("SRV_SERIALNUMBER_NOTAPPLIED".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            mInvalidRewardText.setVisibility(0);
            mInvalidRewardText.setText(errormessageentitycontainer.getErrorMessage());
            mRewardSerialCodeEditText.setTextColor(g().getResources().getColor(0x7f0d006c));
        } else
        if ("SVC_ORD_ERR_REWARD_CODE_INVALID".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()) || "SRV_ORD_ERR_REWAR_CERTIFICATE_INVALID".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            mInvalidRewardText.setVisibility(0);
            mInvalidRewardText.setText(errormessageentitycontainer.getErrorMessage());
            mRewardSerialCodeEditText.setTextColor(g().getResources().getColor(0x7f0d006c));
        } else
        if ("SVC_ORD_ERR_REWARD_CODE_MISSING".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            mInvalidRewardText.setVisibility(0);
            mInvalidRewardText.setText(errormessageentitycontainer.getErrorMessage());
        } else
        if ("SRV_ORD_REWARD_CERTIFICATE_ALREADY_PRESENT".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            mInvalidRewardText.setVisibility(0);
            mInvalidRewardText.setText(errormessageentitycontainer.getErrorMessage());
        } else
        if ("SRV_OCS_REWARD_CERTIFICATE_REDEEMED".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            mInvalidRewardText.setVisibility(0);
            mInvalidRewardText.setText(errormessageentitycontainer.getErrorMessage());
        } else
        if ("SRV_OCS_REWARD_CERTIFICATE_MOBILEBAR_CODE_EXPIRED".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            mInvalidRewardText.setVisibility(0);
            mInvalidRewardText.setText(errormessageentitycontainer.getErrorMessage());
        } else
        if ("SVC_ORD_ERR_COUPON_INCOMPATIBLE_APPLIED".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            o.b(errormessageentitycontainer.getErrorMessage());
        } else
        if ("OCS_COUPON_ERR_ALRDY_APLD".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            au.a(g(), errormessageentitycontainer.getErrorMessage());
        } else
        if ("SVC_ORD_ERR_SERIAL_RESTRICTED".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            mCouponSerialCodeEditText.setVisibility(0);
            mCouponSerialCodeButton.setVisibility(0);
            mCouponSerialCodeEditText.requestFocus();
        } else
        if ("SVC_ORD_ERR_COUPON_INVALID".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()) || "SVC_ORD_ERR_COUPON_PROMO_INVALID".equalsIgnoreCase(errormessageentitycontainer.getErrorCode()))
        {
            errormessageentitycontainer.getErrorMessage();
            mInvalidCouponsText.setText(errormessageentitycontainer.getErrorMessage());
            mInvalidCouponsText.setVisibility(0);
            mCouponCodeEditText.setTextColor(g().getResources().getColor(0x7f0d006c));
        } else
        {
            mInvalidCouponsText.setText(errormessageentitycontainer.getErrorMessage());
            mInvalidCouponsText.setVisibility(0);
            mCouponCodeEditText.setTextColor(g().getResources().getColor(0x7f0d006c));
        }
        o.U();
    }

    public void a(ErrorMessageEntityContainer errormessageentitycontainer, int i1, int j1)
    {
        if (errormessageentitycontainer != null && errormessageentitycontainer.getErrorMessage() != null)
        {
            au.a(g(), g().getResources().getString(0x7f070416), errormessageentitycontainer.getErrorMessage());
            return;
        } else
        {
            au.a(g(), g().getResources().getString(0x7f0701bb), g().getResources().getString(0x7f070236));
            return;
        }
    }

    public void a(OrderItemsDetails orderitemsdetails)
    {
        mEstimateSameDayPickUpLayout.setVisibility(8);
        if (orderitemsdetails != null && orderitemsdetails.getEstimatedShippingCharges() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s2;
        EstimatedShippingCharges aestimatedshippingcharges[];
        int i1;
        int j1;
        boolean flag;
        flag = orderitemsdetails.containsTruckableItem();
        a(flag);
        s2 = g().getString(0x7f0701ea);
        aestimatedshippingcharges = orderitemsdetails.getEstimatedShippingCharges();
        j1 = aestimatedshippingcharges.length;
        i1 = 0;
_L13:
        if (i1 >= j1) goto _L1; else goto _L3
_L3:
        String s1;
        byte byte0;
        EstimatedShippingCharges estimatedshippingcharges = aestimatedshippingcharges[i1];
        s1 = a(estimatedshippingcharges.getCharge());
        orderitemsdetails = s1;
        if (flag)
        {
            orderitemsdetails = s1;
            if (s1.equalsIgnoreCase(s2))
            {
                orderitemsdetails = g().getString(0x7f07041c);
            }
        }
        s1 = estimatedshippingcharges.getType();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 4: default 164
    //                   -1156901027: 253
    //                   -949417634: 205
    //                   -779784928: 221
    //                   1606781088: 237;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        byte0;
        JVM INSTR tableswitch 0 3: default 196
    //                   0 269
    //                   1 269
    //                   2 280
    //                   3 291;
           goto _L9 _L10 _L10 _L11 _L12
_L9:
        i1++;
          goto _L13
_L6:
        if (s1.equals("SHIPPING_AND_HANDLING"))
        {
            byte0 = 0;
        }
          goto _L4
_L7:
        if (s1.equals("SHIP_TO_HOME"))
        {
            byte0 = 1;
        }
          goto _L4
_L8:
        if (s1.equals("SHIP_TO_STORE"))
        {
            byte0 = 2;
        }
          goto _L4
_L5:
        if (s1.equals("SAME_DAY_PICK_UP"))
        {
            byte0 = 3;
        }
          goto _L4
_L10:
        tvEstimateShipToAddress.setText(orderitemsdetails);
          goto _L9
_L11:
        tvEstimateShipToStore.setText(orderitemsdetails);
          goto _L9
_L12:
        mEstimateSameDayPickUpLayout.setVisibility(0);
        tvSameDayPickUpPrice.setText(orderitemsdetails);
          goto _L9
    }

    public void a(OrderItemsDetails orderitemsdetails, double d1)
    {
        e = d1;
        mSubtotalTextView.setText((new StringBuilder()).append(s).append(y.a(orderitemsdetails.getItemSubTotal())).toString());
        mOrderTotalTextView.setText((new StringBuilder()).append(s).append(y.a(orderitemsdetails.getTotal())).toString());
        if (orderitemsdetails.getTotalSavings() <= 0.0D)
        {
            mYouSavedTextView.setVisibility(8);
            mYouSavedHeader.setVisibility(8);
            return;
        } else
        {
            mYouSavedTextView.setVisibility(0);
            mYouSavedHeader.setVisibility(0);
            mYouSavedTextView.setText((new StringBuilder()).append(s).append(y.a(orderitemsdetails.getTotalSavings())).toString());
            return;
        }
    }

    public void a(Promotions promotions, int i1)
    {
        if (promotions != null && promotions.getPromotions() != null)
        {
            a(promotions);
            ae.d(a, (new StringBuilder()).append("onPromotionSuccess : ").append(promotions).toString());
            promotions = promotions.getPromotions().iterator();
            int j1 = 0;
            i1 = 0;
            boolean flag1 = false;
            boolean flag = false;
            while (promotions.hasNext()) 
            {
                PromotionDetails promotiondetails = (PromotionDetails)promotions.next();
                int l1;
                boolean flag3;
                if ("COUPON".equals(promotiondetails.getType()))
                {
                    l.add(promotiondetails);
                    j();
                    int k1 = j1 + 1;
                    boolean flag2 = true;
                    flag1 = flag;
                    flag = flag2;
                    j1 = i1;
                    i1 = k1;
                } else
                if ("REWARDS".equals(promotiondetails.getType()))
                {
                    m.add(promotiondetails);
                    if (!TextUtils.isEmpty(promotiondetails.getMessage()))
                    {
                        if (r != null && r.isShowing())
                        {
                            r.dismiss();
                        }
                        a(promotiondetails);
                    }
                    int i2 = i1 + 1;
                    flag = flag1;
                    flag1 = true;
                    i1 = j1;
                    j1 = i2;
                } else
                {
                    int j2 = i1;
                    boolean flag4 = flag;
                    i1 = j1;
                    j1 = j2;
                    flag = flag1;
                    flag1 = flag4;
                }
                flag3 = flag1;
                l1 = j1;
                j1 = i1;
                i1 = l1;
                flag1 = flag;
                flag = flag3;
            }
            a(j1, flag1);
            b(i1, flag);
        }
    }

    public void a(RewardsAccount rewardsaccount)
    {
    }

    public void a(RewardsProfile rewardsprofile)
    {
        p = rewardsprofile;
        if (af.b(g()).a())
        {
            d();
        }
    }

    public void a(String s1, String s2, int i1)
    {
        availableRewardsCount.setText("0");
    }

    public void a(String s1, String s2, String s3, boolean flag)
    {
        g.a(this);
        g.a(s1, s2, s3, flag);
    }

    public void a(boolean flag, boolean flag1)
    {
    }

    public void a(boolean flag, boolean flag1, String s1)
    {
    }

    public void a_(String s1, int i1)
    {
    }

    public void applyCoupon()
    {
        o();
        if (!TextUtils.isEmpty(mCouponCodeEditText.getText()))
        {
            a(mCouponCodeEditText.getText().toString(), mCouponSerialCodeEditText.getText().toString(), "COUPON", false);
        }
    }

    public void applyReward()
    {
label0:
        {
            o();
            if (!TextUtils.isEmpty(mRewardEditText.getText().toString()))
            {
                if (mRewardSerialCodeEditText.getVisibility() != 8 || mRewardapplyBtn.getVisibility() != 8)
                {
                    break label0;
                }
                mRewardSerialCodeEditText.setVisibility(0);
                mRewardapplyBtn.setVisibility(0);
            }
            return;
        }
        mRewardSerialCodeEditText.setVisibility(8);
        mRewardapplyBtn.setVisibility(8);
    }

    public void applySerialReward()
    {
        o();
        if (m.size() < d)
        {
            if (!TextUtils.isEmpty(mRewardSerialCodeEditText.getText().toString()))
            {
                if (JCP.s().d())
                {
                    com.jcp.h.a.s();
                } else
                {
                    com.jcp.h.a.t();
                }
                a(mRewardEditText.getText().toString(), mRewardSerialCodeEditText.getText().toString(), "REWARDS", false);
            }
            return;
        } else
        {
            au.a(g(), g().getString(0x7f070358));
            return;
        }
    }

    public void b()
    {
        g.a(this);
        g.a();
    }

    public void b(int i1, int j1)
    {
        if (j1 != 69) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = new ArrayList();
        Iterator iterator = m.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PromotionDetails promotiondetails = (PromotionDetails)iterator.next();
            if (!promotiondetails.getSerialNumber().equalsIgnoreCase(n.getSerialNumber()))
            {
                arraylist.add(promotiondetails);
            }
        } while (true);
        m.clear();
        m.addAll(arraylist);
_L4:
        o.U();
        return;
_L2:
        if (j1 == 70)
        {
            if (n != null)
            {
                l.remove(n);
                n = null;
            }
            m();
            mSeperator.setVisibility(8);
            a(mCouponsListView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b(OrderItemsDetails orderitemsdetails)
    {
        mSubtotalHeader.setText(g().getResources().getString(0x7f07043e));
        mSubtotalTextView.setText((new StringBuilder()).append(s).append(y.a(orderitemsdetails.getSubTotal())).toString());
        mEstimateShipToAddressHeaderView.setText(g().getResources().getString(0x7f070442));
        double d1 = orderitemsdetails.getShippingHandlingCharges();
        if (Double.isNaN(d1) || d1 == 0.0D)
        {
            tvEstimateShipToAddress.setText(g().getResources().getString(0x7f0701ea));
        } else
        {
            tvEstimateShipToAddress.setText((new StringBuilder()).append(s).append(y.a(d1)).toString());
        }
        mEstimateShipToAddressQuestionMark.setVisibility(8);
        mEstimateShipToStoreQuestionMark.setVisibility(8);
        mEstimateShipToStoreHeaderView.setVisibility(8);
        tvEstimateShipToStore.setVisibility(8);
        mEstimateTaxHeader.setText(g().getResources().getString(0x7f070051));
        mEstimateTaxTextView.setText((new StringBuilder()).append(s).append(y.a(orderitemsdetails.getTax())).toString());
        mOrderTotalTextView.setText((new StringBuilder()).append(s).append(y.a(orderitemsdetails.getTotal())).toString());
        mYouSavedTextView.setText((new StringBuilder()).append(s).append(y.a(orderitemsdetails.getTotalSavings())).toString());
    }

    public void b(RewardsAccount rewardsaccount)
    {
    }

    public void b(String s1, int i1)
    {
    }

    public void b(boolean flag, boolean flag1)
    {
    }

    public void c()
    {
        mCouponLayout.setVisibility(8);
        mRewardsLayout.setVisibility(8);
    }

    public void checkOut()
    {
        o();
        ac ac1 = g();
        if (y.a(e, 9999.9899999999998D) || y.b(9999.9899999999998D, e))
        {
            a(ac1, false);
        } else
        if (y.b(e, 9999.9899999999998D))
        {
            o.b(g().getResources().getString(0x7f0700dd));
            return;
        }
    }

    public void d()
    {
        if (p == null || p.getRewards() == null)
        {
            availableRewardsCount.setText(g().getResources().getString(0x7f070482));
        } else
        {
            Object obj = bn.a(a(p.getRewards()), g().getResources().getString(0x7f0702fc));
            availableRewardsCount.setText(String.valueOf(((List) (obj)).size() - q));
            availableRewardsLayout.removeAllViews();
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Object obj1 = (Certificate)((Iterator) (obj)).next();
                View view = g().getLayoutInflater().inflate(0x7f030039, null);
                RewardsViewHolder rewardsviewholder = new RewardsViewHolder(view);
                bt.a(g(), ((Certificate) (obj1)).getAmount().doubleValue(), ((Certificate) (obj1)).getType(), rewardsviewholder.rewardsTitle);
                if (((Certificate) (obj1)).getDaysLeft().intValue() <= 15)
                {
                    rewardsviewholder.rewardsExpDate.setTextColor(g().getResources().getColor(0x7f0d006c));
                }
                SimpleDateFormat simpledateformat = new SimpleDateFormat("MMM dd, yyyy");
                try
                {
                    java.util.Date date = simpledateformat.parse(((Certificate) (obj1)).getExpires());
                    rewardsviewholder.rewardsExpDate.setText((new StringBuilder()).append(g().getResources().getString(0x7f0701c8)).append(" ").append(simpledateformat.format(date)).toString());
                }
                catch (ParseException parseexception)
                {
                    parseexception.printStackTrace();
                }
                bn.a(rewardsviewholder.applyRewardBtn, ((Certificate) (obj1)), g());
                rewardsviewholder.applyRewardBtn.setOnClickListener(new q(this));
                obj1 = new View(g());
                ((View) (obj1)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, 1));
                ((View) (obj1)).setBackgroundColor(g().getResources().getColor(0x7f0d005d));
                availableRewardsLayout.addView(((View) (obj1)));
                availableRewardsLayout.addView(view);
            }
        }
    }

    public void estimateShipAddressHeader()
    {
        o();
        ac ac1 = g();
        au.a(ac1, ac1.getResources().getString(0x7f07021c), ac1.getResources().getString(0x7f07021b));
    }

    public void estimateShipStoreHeader()
    {
        o();
        ac ac1 = g();
        au.a(ac1, ac1.getResources().getString(0x7f070222), ac1.getResources().getString(0x7f070221));
    }

    public void findCoupons()
    {
label0:
        {
            o();
            ac ac1 = g();
            com.jcp.h.a.y();
            if (ac1 != null)
            {
                if (!(ac1 instanceof t))
                {
                    break label0;
                }
                ((t)ac1).c(new com.jcp.fragments.ac(), "CouponsFragment");
            }
            return;
        }
        throw new com.jcp.d.a(String.format("Cannot typecast the object of type %s to class %s", new Object[] {
            android/app/Activity.getName(), com/jcp/fragments/t.getName()
        }));
    }

    public void onAvailableRewardsClicked(ImageView imageview)
    {
        if (availableRewardsLayout.getVisibility() == 0)
        {
            availableRewardsLayout.animate().translationY(0.0F).alpha(0.0F).setListener(new n(this, imageview));
            return;
        } else
        {
            availableRewardsLayout.animate().translationY(-2F).alpha(1.0F).setListener(new o(this, imageview));
            return;
        }
    }

    public void onCAPrivacyClicked()
    {
        o();
        ac ac1 = g();
        ac1.startActivity(new Intent(ac1, com/jcp/activities/CaPrivacyPolicyActivity));
    }

    public void onClick(View view)
    {
        o();
        switch (view.getId())
        {
        default:
            return;

        case 2131624470: 
            a(view, true);
            return;

        case 2131625040: 
            a(view, false);
            break;
        }
    }

    public void onPrivacyClicked()
    {
        o();
        ac ac1 = g();
        ac1.startActivity(new Intent(ac1, com/jcp/activities/PrivacyPolicyActivity));
    }

    public void paypalCheckOut()
    {
        o();
        a(g(), true);
    }

    public void rewardsConnectOrEnroll()
    {
        Bundle bundle;
label0:
        {
            o();
            if (g() != null)
            {
                bundle = new Bundle();
                bundle.putBoolean("intent_from_shopping_bag_page", true);
                if (!JCP.s().c())
                {
                    break label0;
                }
                com.jcp.h.a.v();
                RewardsConnectAccountsSignInToRewardsFragment rewardsconnectaccountssignintorewardsfragment = new RewardsConnectAccountsSignInToRewardsFragment();
                rewardsconnectaccountssignintorewardsfragment.g(bundle);
                a(g()).c(rewardsconnectaccountssignintorewardsfragment, "RewardsConnectAccountsSignInToRewards");
            }
            return;
        }
        com.jcp.h.a.u();
        SignInFragment signinfragment = new SignInFragment();
        signinfragment.g(bundle);
        a(g()).c(signinfragment, "SignInFragment");
    }


    private class RewardsViewHolder
    {

        final CartSummaryHelper a;
        protected Button applyRewardBtn;
        protected TextView rewardsExpDate;
        protected TextView rewardsTitle;

        protected RewardsViewHolder(View view)
        {
            a = CartSummaryHelper.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
