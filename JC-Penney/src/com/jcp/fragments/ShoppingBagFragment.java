// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.aj;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.activities.MainActivity;
import com.jcp.adapters.AddToCartAdapter;
import com.jcp.b.b;
import com.jcp.c.aa;
import com.jcp.c.af;
import com.jcp.e.a;
import com.jcp.e.ag;
import com.jcp.e.ah;
import com.jcp.e.c;
import com.jcp.e.g;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.h.k;
import com.jcp.helper.CartSummaryHelper;
import com.jcp.helper.ac;
import com.jcp.model.CartItemsDetails;
import com.jcp.model.OrderItemsDetails;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.model.rewards.RewardsProfile;
import com.jcp.productentity.AddToBagInputEntity;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.ae;
import com.jcp.util.ap;
import com.jcp.util.au;
import com.jcp.util.bp;
import com.jcp.util.bq;
import com.jcp.util.i;
import com.jcp.util.y;
import com.jcp.util.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.fragments:
//            s, gc, ah, t

public class ShoppingBagFragment extends s
    implements a, ag, ah, c, g
{

    private static final String a = com/jcp/fragments/ShoppingBagFragment.getSimpleName();
    private boolean aj;
    private int ak;
    private HeaderViewHolder al;
    private String am;
    private String an;
    private String ao;
    private String ap;
    private String aq;
    private boolean ar;
    private AddToCartAdapter b;
    private OrderItemsDetails c;
    private aa d;
    private boolean e;
    private AddToBagInputEntity f;
    private CartSummaryHelper g;
    private String h;
    private String i;
    protected ListView mCartListView;
    protected ViewGroup mEmptyCartLayout;
    protected ViewGroup mHeaderItemLayout;
    protected TextView mItemTotalPriceDescription;
    protected TextView mNumItemsInBag;
    protected ViewGroup mSavedCartItemsLayout;
    protected ViewGroup mShippingThresholdQualifyLayout;
    protected TextView mShippingThresholdQualifyTextView;

    public ShoppingBagFragment()
    {
        h = "";
    }

    private void Z()
    {
        android.graphics.Typeface typeface = z.a(i(), 7);
        android.graphics.Typeface typeface1 = z.a(i(), 11);
        if (!ar)
        {
            al.mSameDayPickUpTitle.setText(j().getString(0x7f070399));
            if (typeface1 != null)
            {
                al.mSameDayPickUpTitle.setTypeface(typeface1);
            }
            al.mSameDayPickUpTitleExtended.setVisibility(0);
            al.mSameDayPickUpTitleExtended.setText(j().getString(0x7f07039a));
            al.mSelectStoreClickText.setText(j().getString(0x7f0703be));
            al.mStoreDetailsNoGeo.setVisibility(0);
            al.mStoreDetailsHasGeo.setVisibility(8);
            return;
        }
        al.mSameDayPickUpTitle.setText(j().getString(0x7f07039c));
        if (typeface != null)
        {
            al.mSameDayPickUpTitle.setTypeface(typeface);
        }
        al.mSelectedStoreName.setText(am);
        al.mSelectedStoreAddressStreet.setText(an);
        al.mSelectedStoreAddressCity.setText(ao);
        al.mSelectedStoreDistance.setText(ap);
        al.mSameDayPickUpTitleExtended.setVisibility(8);
        al.mSelectStoreClickText.setText(j().getString(0x7f0700e5));
        al.mStoreDetailsNoGeo.setVisibility(8);
        al.mStoreDetailsHasGeo.setVisibility(0);
    }

    private String a(CartItemsDetails cartitemsdetails)
    {
        if (!bp.a(cartitemsdetails.getFulfillmentOptions()))
        {
            return "Ship to Address Only";
        } else
        {
            return "Ship to Address or Store";
        }
    }

    private void a(OrderItemsDetails orderitemsdetails)
    {
        if (i() == null || !n())
        {
            return;
        }
        c = orderitemsdetails;
        android.support.v4.f.a a1 = new android.support.v4.f.a();
        ArrayList arraylist = new ArrayList(Arrays.asList(orderitemsdetails.getItems()));
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            CartItemsDetails cartitemsdetails = (CartItemsDetails)iterator.next();
            a1.put(cartitemsdetails.getId(), cartitemsdetails.getImageURL());
            if ("GIFTCARD".equalsIgnoreCase(cartitemsdetails.getType()))
            {
                g.c();
            }
        } while (true);
        c.setItems((CartItemsDetails[])arraylist.toArray(new CartItemsDetails[arraylist.size()]));
        JCP.a(a1);
        com.jcp.util.i.a(JCP.d());
        X();
        g.a(orderitemsdetails);
    }

    private void a(AddToBagInputEntity addtobaginputentity, boolean flag)
    {
        Object obj;
        String s1;
        byte byte0;
        if (addtobaginputentity.getvDataType() != null)
        {
            h = addtobaginputentity.getvDataType();
        } else
        if (addtobaginputentity.getProductType() != null)
        {
            h = addtobaginputentity.getProductType();
        }
        obj = new JSONArray();
        s1 = h.toUpperCase();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 6: default 100
    //                   -2088802350: 233
    //                   -2001251420: 300
    //                   -1493222641: 250
    //                   1524644677: 267
    //                   1632418880: 284
    //                   1804446588: 216;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        byte0;
        JVM INSTR tableswitch 0 5: default 140
    //                   0 317
    //                   1 317
    //                   2 329
    //                   3 329
    //                   4 329
    //                   5 329;
           goto _L8 _L9 _L9 _L10 _L10 _L10 _L10
_L8:
        obj = com.jcp.helper.ac.a(addtobaginputentity);
_L11:
        addtobaginputentity = new JSONObject();
        try
        {
            addtobaginputentity.put("items", obj);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        obj = new com.jcp.c.a(i());
        ((com.jcp.c.a) (obj)).a(this);
        if (flag)
        {
            ((com.jcp.c.a) (obj)).b(addtobaginputentity, i, true);
        }
        ac();
        return;
_L7:
        if (s1.equals("REGULAR"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (s1.equals("FURNITURE"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (s1.equals("MONOGRAMMING"))
        {
            byte0 = 2;
        }
          goto _L1
_L5:
        if (s1.equals("HEMMING"))
        {
            byte0 = 3;
        }
          goto _L1
_L6:
        if (s1.equals("GIFTCARD"))
        {
            byte0 = 4;
        }
          goto _L1
_L3:
        if (s1.equals("MADE-TO-MEASURE"))
        {
            byte0 = 5;
        }
          goto _L1
_L9:
        if (flag)
        {
            obj = com.jcp.helper.ac.b(addtobaginputentity);
        }
          goto _L11
_L10:
        obj = com.jcp.helper.ac.b(addtobaginputentity);
          goto _L11
    }

    private void aa()
    {
        i().f().c();
    }

    private void ab()
    {
        boolean flag1 = false;
        aq = "";
        if (i().getSharedPreferences("com.jcp.activities", 0).getString("com.jcp.shopdata", null) != null)
        {
            aq = com.jcp.util.ap.a(i()).getId();
            am = com.jcp.util.ap.a(i()).getName();
        }
        boolean flag = flag1;
        if (aq != null)
        {
            flag = flag1;
            if (!aq.isEmpty())
            {
                flag = true;
            }
        }
        ar = flag;
    }

    private void ac()
    {
        com.jcp.b.a.a(i(), 0x7f070317);
    }

    private void ad()
    {
        com.jcp.b.a.i();
    }

    private void b(int j)
    {
        Toast toast = Toast.makeText(i(), (new StringBuilder()).append(j).append(" ").append(j().getString(0x7f07030b)).append(" ").append(am).toString(), 1);
        TextView textview = (TextView)toast.getView().findViewById(0x102000b);
        if (textview != null)
        {
            textview.setGravity(17);
        }
        toast.show();
    }

    private void b(boolean flag)
    {
label0:
        {
            android.support.v4.app.ac ac1;
label1:
            {
                ac1 = i();
                if (ac1 != null && !ac1.isFinishing())
                {
                    if (!(ac1 instanceof MainActivity))
                    {
                        break label0;
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                    ((MainActivity)ac1).l();
                    ac1.getActionBar().show();
                }
                return;
            }
            ((MainActivity)ac1).k();
            ac1.getActionBar().hide();
            return;
        }
        throw new com.jcp.d.a(String.format("Cannot typecast the object of type %s to class %s", new Object[] {
            android/app/Activity.getName(), com/jcp/activities/MainActivity.getName()
        }));
    }

    private void c(Bundle bundle)
    {
        f = new AddToBagInputEntity();
        f = (AddToBagInputEntity)bundle.get("AddToBag");
        if (bundle.containsKey("UPDATEITEMID"))
        {
            i = bundle.getString("UPDATEITEMID");
        }
        a(f, bundle.getBoolean("isAddToBagUpdate"));
    }

    public void U()
    {
        d = new aa(i());
        d.a(this);
        if (!ar)
        {
            d.a(true);
            return;
        } else
        {
            d.a(aq, true);
            return;
        }
    }

    public void V()
    {
        mSavedCartItemsLayout.setVisibility(8);
        mEmptyCartLayout.setVisibility(0);
    }

    public void W()
    {
        com.jcp.b.b.c(0);
        mCartListView.addFooterView(g.a());
        e = true;
    }

    public void X()
    {
        if (c != null)
        {
            CartItemsDetails acartitemsdetails[] = c.getItems();
            int j1 = acartitemsdetails.length;
            int l = 0;
            int i1 = 0;
            while (l < j1) 
            {
                CartItemsDetails cartitemsdetails = acartitemsdetails[l];
                int j;
                if (!JCP.u() && bp.a(cartitemsdetails.getFulfillmentOptions()))
                {
                    j = i1;
                    if (cartitemsdetails.getParentId() == null)
                    {
                        j = i1 + cartitemsdetails.getQuantity();
                    }
                } else
                {
                    j = i1 + cartitemsdetails.getQuantity();
                }
                k.a(cartitemsdetails, a(cartitemsdetails));
                l++;
                i1 = j;
            }
            JCP.d().a(i1);
            mEmptyCartLayout.setVisibility(8);
            mSavedCartItemsLayout.setVisibility(0);
            double d1;
            if (b == null)
            {
                b = new AddToCartAdapter(i(), this);
                b.a(c.getItems());
                mCartListView.setAdapter(b);
            } else
            {
                b.a(c.getItems());
            }
            b.a(am, ar);
            d1 = c.getTotal();
            g.a(c, d1);
            if (c.getItems().length > 0)
            {
                mHeaderItemLayout.setVisibility(0);
                mNumItemsInBag.setText(bq.a(JCP.d().a(), a(0x7f070248), a(0x7f070253)));
                a(d1);
            }
            if (!e)
            {
                W();
                return;
            }
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = i();
        d = new aa(bundle);
        g = new CartSummaryHelper(i(), this, d, true);
        View view = layoutinflater.inflate(0x7f0300e3, null);
        al = new HeaderViewHolder();
        viewgroup = layoutinflater.inflate(0x7f030019, null);
        ButterKnife.inject(this, viewgroup);
        ButterKnife.inject(al, view);
        bundle.getWindow().setSoftInputMode(32);
        bundle = h();
        ak = 0;
        if (bundle != null)
        {
            layoutinflater = bundle.getString("CouponCode");
            ak = bundle.getInt("updatedquantiy", 0);
        } else
        {
            layoutinflater = null;
        }
        ab();
        W();
        Z();
        if (!TextUtils.isEmpty(layoutinflater))
        {
            g.a(layoutinflater, null, "COUPON", false);
            aj = true;
            return viewgroup;
        } else
        {
            aj = false;
            return viewgroup;
        }
    }

    protected String a()
    {
        return "SHOPPINGBAG";
    }

    public void a(double d1)
    {
        mItemTotalPriceDescription.setText((new StringBuilder()).append(a(0x7f0703f7)).append(y.a(d1, true)).toString());
    }

    public void a(int j, int l)
    {
        ae.d(a, "onItemAddOrReduceSuccess");
        U();
    }

    public void a(int j, int l, Intent intent)
    {
        ab();
        U();
        if (intent != null && intent.hasExtra("no_of_pickup_items"))
        {
            b(intent.getIntExtra("no_of_pickup_items", 0));
        }
    }

    public void a(int j, int l, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        ad();
        if (errormessageentitycontainer != null)
        {
            au.a(i(), errormessageentitycontainer.getErrorMessage());
        }
    }

    public void a(ErrorMessageEntityContainer errormessageentitycontainer, int j, int l)
    {
        ad();
    }

    public void a(OrderItemsDetails orderitemsdetails, int j)
    {
        a(orderitemsdetails);
        JCP.a(orderitemsdetails);
    }

    public void a(RewardsAccount rewardsaccount)
    {
    }

    public void a(RewardsProfile rewardsprofile)
    {
        g.d();
    }

    public void a(String s1, int j)
    {
        ad();
        c(s1);
    }

    public void a(String s1, String s2, int j)
    {
    }

    public void a(boolean flag, boolean flag1)
    {
    }

    public void a(boolean flag, boolean flag1, String s1)
    {
    }

    public void a_(String s1, int j)
    {
    }

    public void b()
    {
        a(false);
        b(false);
        super.b();
    }

    public void b(int j, int l)
    {
        if (com.jcp.b.b.a() != null)
        {
            com.jcp.b.a.g(true);
            d = new aa(i());
            d.a(this);
            d.a(com.jcp.b.b.a());
        }
        JCP.e().a(com.jcp.b.b.c(), com.jcp.b.b.d());
    }

    public void b(RewardsAccount rewardsaccount)
    {
    }

    public void b(String s1)
    {
        au.a(i(), s1);
    }

    public void b(String s1, int j)
    {
        ad();
        b(s1);
    }

    public void b(boolean flag, boolean flag1)
    {
    }

    public void c(int j, int l)
    {
        U();
        if (!TextUtils.isEmpty(f.getServiceAgreementId()))
        {
            Toast.makeText(i(), a(0x7f0703c7), 0).show();
            return;
        } else
        {
            Toast.makeText(i(), a(0x7f070252), 0).show();
            return;
        }
    }

    public void c(String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i());
        builder.setMessage(s1);
        builder.setTitle(0x7f0701bb);
        builder.setPositiveButton(0x7f070049, new gc(this));
        builder.create().show();
    }

    public void c(String s1, int j)
    {
        ad();
        if (j == 48)
        {
            W();
            V();
            JCP.d().a(0);
            return;
        } else
        {
            b(s1);
            return;
        }
    }

    public void closeButtonClick()
    {
        aa();
    }

    public void d(int j, int l)
    {
        ae.d(a, "onUpdateFulfillmentSuccess");
        U();
    }

    public void e(int j, int l)
    {
        ad();
    }

    public void f()
    {
        super.f();
        ad();
        b(true);
    }

    public void f(int j, int l)
    {
        ae.d(a, "onItemRemoveSuccess");
        U();
        if (b.t)
        {
            b.t = false;
            au.a(i(), a(0x7f070416), j().getString(0x7f070250));
            return;
        } else
        {
            au.a(i(), a(0x7f070416), j().getString(0x7f07024f));
            return;
        }
    }

    public void f_()
    {
        super.f_();
        if (!aj)
        {
            if (com.jcp.b.b.f() && com.jcp.b.b.e() == 2)
            {
                com.jcp.b.b.d(false);
                com.jcp.b.b.a(0);
                af af1;
                if (ak <= 99)
                {
                    c(h());
                } else
                {
                    Toast.makeText(i(), j().getString(0x7f070096), 0).show();
                    U();
                }
            } else
            {
                c = JCP.z();
                if (c == null)
                {
                    U();
                } else
                {
                    a(c);
                }
            }
            g.b();
        }
        aj = false;
        af1 = af.b(i());
        if (af1.a())
        {
            af1.a(this);
            af1.f();
        }
    }

    public void startShoppingButtonClick()
    {
        t t1 = a(i());
        if (t1 != null)
        {
            t1.c(new com.jcp.fragments.ah(), "DepartmentFragment");
        }
    }


    private class HeaderViewHolder
    {

        final ShoppingBagFragment a;
        protected TextView mSameDayPickUpTitle;
        protected TextView mSameDayPickUpTitleExtended;
        protected TextView mSelectStoreClickText;
        protected TextView mSelectedStoreAddressCity;
        protected TextView mSelectedStoreAddressStreet;
        protected TextView mSelectedStoreDistance;
        protected TextView mSelectedStoreName;
        protected ViewGroup mStoreDetailsHasGeo;
        protected ViewGroup mStoreDetailsNoGeo;

        public void onClick(View view)
        {
        }

        protected HeaderViewHolder()
        {
            a = ShoppingBagFragment.this;
            super();
        }
    }

}
