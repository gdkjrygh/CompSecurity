// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.c.aa;
import com.jcp.c.ah;
import com.jcp.fragments.ProductDetailFragment;
import com.jcp.fragments.ShoppingBagFragment;
import com.jcp.fragments.t;
import com.jcp.g.a;
import com.jcp.h.g;
import com.jcp.model.AttributesCartItems;
import com.jcp.model.CartItemsDetails;
import com.jcp.model.ItemFulfillmentDetails;
import com.jcp.util.ae;
import com.jcp.util.au;
import com.jcp.util.bv;
import com.jcp.util.y;
import com.jcp.util.z;
import com.jcp.views.HtmlTypefaceTextView;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.adapters:
//            a, w, c, d, 
//            j, k, l, m, 
//            n, o, p, q, 
//            b, e, f, g, 
//            h, i

public class AddToCartAdapter extends BaseAdapter
{

    private static final String a = com/jcp/adapters/AddToCartAdapter.getSimpleName();
    private final String b = "[{\"op\":\"replace\",\"path\":\"/selected\",\"value\":true}]";
    private ac c;
    private ShoppingBagFragment d;
    private aa e;
    private CartItemsDetails f[];
    private List g;
    private PopupWindow h;
    private int i;
    private boolean j;
    private boolean k;
    private String l;
    private w m;
    private int n;

    public AddToCartAdapter(ac ac1, ShoppingBagFragment shoppingbagfragment)
    {
        n = -1;
        c = ac1;
        d = shoppingbagfragment;
        g = new ArrayList();
        h = au.a(d.i(), g, (ViewGroup)d.i().findViewById(0x7f0e039b), new com.jcp.adapters.a(this));
        m = new w(ac1, false);
    }

    static int a(AddToCartAdapter addtocartadapter)
    {
        return addtocartadapter.i;
    }

    static int a(AddToCartAdapter addtocartadapter, int i1)
    {
        addtocartadapter.i = i1;
        return i1;
    }

    private Bundle a(CartItemsDetails cartitemsdetails)
    {
        Bundle bundle = new Bundle();
        bundle.putString("ProductURL", cartitemsdetails.getProductURL());
        bundle.putString("PPID", cartitemsdetails.getProductId());
        bundle.putString("ItemID", cartitemsdetails.getItemId());
        bundle.putInt("quantity", cartitemsdetails.getQuantity());
        bundle.putString("UpdateItemId", cartitemsdetails.getId());
        bundle.putBoolean("ProductDetails", false);
        bundle.putBoolean("ColorSelected", true);
        bundle.putBoolean("triggeredFromPDP", true);
        return bundle;
    }

    static aa a(AddToCartAdapter addtocartadapter, aa aa1)
    {
        addtocartadapter.e = aa1;
        return aa1;
    }

    private String a(int i1, ShoppingBagViewHolder shoppingbagviewholder)
    {
        String s;
        s = f[i1].getEstDeliveryMsg();
        ItemFulfillmentDetails itemfulfillmentdetails = b(i1);
        if (itemfulfillmentdetails != null)
        {
            j = "AVAILABLE".equals(itemfulfillmentdetails.getStatus());
        }
        a(shoppingbagviewholder, itemfulfillmentdetails);
        String s1;
        if (!TextUtils.isEmpty(s))
        {
            String as[] = s.split(">");
            if (as.length >= 2)
            {
                shoppingbagviewholder.mItemEstimatedDeliveryDescription.setVisibility(0);
                shoppingbagviewholder.mItemEstimatedDeliveryDescription.setText(String.valueOf(as[2]));
                shoppingbagviewholder.mItemEstimatedDelivery.setVisibility(0);
                shoppingbagviewholder.mItemEstimatedDelivery.setText(c.getResources().getString(0x7f070091));
                shoppingbagviewholder.mItemEstimatedDeliveryQuestionImageView.setVisibility(0);
            }
        } else
        {
            shoppingbagviewholder.mItemEstimatedDelivery.setVisibility(8);
            shoppingbagviewholder.mItemEstimatedDeliveryDescription.setVisibility(8);
            shoppingbagviewholder.mItemEstimatedDeliveryQuestionImageView.setVisibility(8);
        }
        if (f[i1].getImageURL() == null || "".equals(f[i1].getImageURL()) || f[i1].getImageURL().indexOf(".") <= 0) goto _L2; else goto _L1
_L1:
        s1 = f[i1].getImageURL().substring(0, f[i1].getImageURL().lastIndexOf("."));
        shoppingbagviewholder.mItemImageView.setVisibility(0);
        com.jcp.g.a.a().a(s1).b(0x7f02017f).a(shoppingbagviewholder.mItemImageView);
        shoppingbagviewholder.mSaveForLaterImageView.setVisibility(0);
        shoppingbagviewholder.mSaveForLater.setVisibility(0);
        shoppingbagviewholder.editItem.setVisibility(0);
        shoppingbagviewholder.mSeparatorView.setVisibility(0);
        shoppingbagviewholder.recoverItemRelativeLayout.setVisibility(8);
        shoppingbagviewholder.mItemAmountLayout.setVisibility(0);
_L4:
        if (itemfulfillmentdetails != null && j)
        {
            shoppingbagviewholder.mItemEstimatedDelivery.setVisibility(0);
            shoppingbagviewholder.mItemEstimatedDeliveryDescription.setVisibility(0);
            if (!Boolean.valueOf(itemfulfillmentdetails.getSelected()).booleanValue())
            {
                break; /* Loop/switch isn't completed */
            }
            shoppingbagviewholder.mRadiBtnPickUpStore.setBackgroundColor(c.getResources().getColor(0x7f0d006b));
            shoppingbagviewholder.mRadiBtnPickUpStore.setTextColor(-1);
            shoppingbagviewholder.mRadioBtnShipIt.setBackgroundColor(-1);
            shoppingbagviewholder.mRadioBtnShipIt.setTextColor(c.getResources().getColor(0x7f0d006b));
            shoppingbagviewholder.mItemEstimatedDelivery.setText(c.getResources().getString(0x7f070309));
            shoppingbagviewholder.mItemEstimatedDeliveryDescription.setText(l);
            shoppingbagviewholder.mItemEstimatedDeliveryQuestionImageView.setVisibility(8);
            shoppingbagviewholder.mChangeStore.setVisibility(0);
            shoppingbagviewholder.mCutOffMessageView.setVisibility(0);
        }
        return s;
_L2:
        if (f[i1].getParentId() != null && f[i1].getParentId().length() > 0 && f[i1].getImageURL() == null)
        {
            shoppingbagviewholder.mSaveForLaterImageView.setVisibility(4);
            shoppingbagviewholder.mSaveForLater.setVisibility(4);
            shoppingbagviewholder.editItem.setVisibility(4);
            shoppingbagviewholder.mItemAmountLayout.setVisibility(8);
            shoppingbagviewholder.recoverItemRelativeLayout.setVisibility(0);
            shoppingbagviewholder.recoverOriginalPriceDescription.setText((new StringBuilder()).append(c.getResources().getString(0x7f0702d4)).append(y.a(f[i1].getOriginalPrice(), true)).toString());
            shoppingbagviewholder.mItemImageView.setVisibility(8);
            shoppingbagviewholder.mSeparatorView.setVisibility(8);
            shoppingbagviewholder.mItemOriginalPrice.setVisibility(0);
            shoppingbagviewholder.mItemEstimatedDelivery.setVisibility(8);
            shoppingbagviewholder.mItemEstimatedDeliveryDescription.setVisibility(8);
            shoppingbagviewholder.mItemEstimatedDeliveryQuestionImageView.setVisibility(8);
            shoppingbagviewholder.mCartItemRelativeLayout.setClickable(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
        shoppingbagviewholder.mRadioBtnShipIt.setBackgroundColor(c.getResources().getColor(0x7f0d006b));
        shoppingbagviewholder.mRadioBtnShipIt.setTextColor(-1);
        shoppingbagviewholder.mRadiBtnPickUpStore.setBackgroundColor(-1);
        shoppingbagviewholder.mRadiBtnPickUpStore.setTextColor(c.getResources().getColor(0x7f0d006b));
        shoppingbagviewholder.mItemEstimatedDelivery.setText(c.getResources().getString(0x7f070091));
        shoppingbagviewholder.mItemEstimatedDeliveryDescription.setText(b(s));
        shoppingbagviewholder.mItemEstimatedDeliveryQuestionImageView.setVisibility(0);
        shoppingbagviewholder.mChangeStore.setVisibility(8);
        shoppingbagviewholder.mCutOffMessageView.setVisibility(8);
        return s;
    }

    private void a()
    {
        if (f != null && f.length != 0)
        {
            Object obj = Arrays.asList(f);
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                CartItemsDetails cartitemsdetails = (CartItemsDetails)((Iterator) (obj)).next();
                if (cartitemsdetails.isFactorForShippingDiscount())
                {
                    arraylist.add(cartitemsdetails);
                } else
                {
                    arraylist1.add(cartitemsdetails);
                }
            }

            if (!arraylist1.isEmpty())
            {
                ArrayList arraylist2 = new ArrayList();
                arraylist2.addAll(arraylist);
                n = arraylist.size();
                arraylist2.add(new CartItemsDetails());
                arraylist2.addAll(arraylist1);
                f = (CartItemsDetails[])arraylist2.toArray(new CartItemsDetails[arraylist2.size()]);
                return;
            }
        }
    }

    private void a(int i1, ShoppingBagViewHolder shoppingbagviewholder, String s)
    {
        shoppingbagviewholder.mRadioBtnShipIt.setOnClickListener(new c(this, i1, shoppingbagviewholder, s));
        shoppingbagviewholder.mRadiBtnPickUpStore.setOnClickListener(new d(this, i1, shoppingbagviewholder));
    }

    private void a(ShoppingBagViewHolder shoppingbagviewholder)
    {
        if (JCP.u())
        {
            shoppingbagviewholder.mSameDayPickupViewGroup.setVisibility(8);
            shoppingbagviewholder.mSameDayPickupIconView.setVisibility(8);
        }
    }

    private void a(ShoppingBagViewHolder shoppingbagviewholder, int i1)
    {
        if (JCP.u())
        {
            shoppingbagviewholder.mSameDayPickupViewGroup.setVisibility(8);
            shoppingbagviewholder.mSameDayPickupIconView.setVisibility(8);
        }
        shoppingbagviewholder.mQuantityItem.setText((new StringBuilder()).append("").append(f[i1].getQuantity()).toString());
        shoppingbagviewholder.mQuantityItem.setOnClickListener(new j(this, i1));
        shoppingbagviewholder.mChangeStore.setOnClickListener(new k(this));
        shoppingbagviewholder.mCartItemRelativeLayout.setOnClickListener(new l(this, i1));
        shoppingbagviewholder.mItemImageView.setOnClickListener(new m(this, i1));
        shoppingbagviewholder.mItemEstimatedDeliveryQuestionImageView.setOnClickListener(m.b());
        shoppingbagviewholder.mMattressViewMore.setOnClickListener(new n(this));
        shoppingbagviewholder.mSameDayPickUpDescription.setOnClickListener(new o(this));
        shoppingbagviewholder.editItem.setOnClickListener(new p(this, i1));
        shoppingbagviewholder.mSaveForLater.setOnClickListener(new q(this, i1));
        shoppingbagviewholder.mItemRemove.setOnClickListener(new com.jcp.adapters.b(this, i1));
    }

    private void a(ShoppingBagViewHolder shoppingbagviewholder, ItemFulfillmentDetails itemfulfillmentdetails)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (!JCP.u())
                    {
                        if (!k)
                        {
                            break label0;
                        }
                        if (itemfulfillmentdetails == null || itemfulfillmentdetails.getStatus() == null)
                        {
                            break label1;
                        }
                        if (!"notOffered".equals(itemfulfillmentdetails.getStatus()))
                        {
                            break label2;
                        }
                        shoppingbagviewholder.mEstimateLayoutNoPickUp.setVisibility(8);
                        shoppingbagviewholder.mEstimateLayoutHasPickUp.setVisibility(8);
                    }
                    return;
                }
                if (j)
                {
                    shoppingbagviewholder.mEstimateLayoutNoPickUp.setVisibility(8);
                    shoppingbagviewholder.mEstimateLayoutHasPickUp.setVisibility(0);
                    return;
                } else
                {
                    shoppingbagviewholder.mEstimateLayoutNoPickUp.setVisibility(0);
                    shoppingbagviewholder.mEstimateLayoutHasPickUp.setVisibility(8);
                    shoppingbagviewholder.mSameDayPickUpTitle.setText(c.getResources().getString(0x7f07039d));
                    shoppingbagviewholder.mSameDayPickUpTitle.setTextColor(c.getResources().getColor(0x7f0d006c));
                    shoppingbagviewholder.mSameDayPickUpStoreName.setVisibility(0);
                    shoppingbagviewholder.mSameDayPickUpStoreName.setText((new StringBuilder()).append(l).append(" ").toString());
                    shoppingbagviewholder.mSameDayPickUpDescription.setText(c.getResources().getString(0x7f0700e6));
                    shoppingbagviewholder.mSameDayPickUpDescription.setTypeface(z.a(c, 7));
                    shoppingbagviewholder.mSameDayPickUpDescription.setTextColor(c.getResources().getColor(0x7f0d0010));
                    return;
                }
            }
            shoppingbagviewholder.mEstimateLayoutNoPickUp.setVisibility(8);
            shoppingbagviewholder.mEstimateLayoutHasPickUp.setVisibility(8);
            return;
        }
        if (itemfulfillmentdetails != null)
        {
            shoppingbagviewholder.mEstimateLayoutNoPickUp.setVisibility(0);
        } else
        {
            shoppingbagviewholder.mEstimateLayoutNoPickUp.setVisibility(8);
        }
        shoppingbagviewholder.mEstimateLayoutHasPickUp.setVisibility(8);
        shoppingbagviewholder.mSameDayPickUpTitle.setText(c.getResources().getString(0x7f07039b));
        shoppingbagviewholder.mSameDayPickUpStoreName.setVisibility(8);
        shoppingbagviewholder.mSameDayPickUpDescription.setText(c.getResources().getString(0x7f0701ee));
        shoppingbagviewholder.mSameDayPickUpDescription.setTypeface(z.a(c, 7));
        shoppingbagviewholder.mSameDayPickUpDescription.setTextColor(c.getResources().getColor(0x7f0d0010));
    }

    static void a(AddToCartAdapter addtocartadapter, CartItemsDetails cartitemsdetails)
    {
        addtocartadapter.d(cartitemsdetails);
    }

    static void a(AddToCartAdapter addtocartadapter, String s)
    {
        addtocartadapter.a(s);
    }

    private void a(CartItemsDetails cartitemsdetails, ShoppingBagViewHolder shoppingbagviewholder)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (cartitemsdetails.getAttributes() != null)
        {
            cartitemsdetails = cartitemsdetails.getAttributes();
            int j1 = cartitemsdetails.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                AttributesCartItems attributescartitems = cartitemsdetails[i1];
                stringbuilder.append((new StringBuilder()).append(bv.b(attributescartitems.getType().replace("_", " "))).append(" : <b>").append(attributescartitems.getValue()).append("</b><br>").toString());
            }

            if (stringbuilder.length() > 0)
            {
                shoppingbagviewholder.mItemInseam.setHtmlText(stringbuilder.toString());
                shoppingbagviewholder.mItemInseam.setVisibility(0);
                return;
            } else
            {
                shoppingbagviewholder.mItemInseam.setVisibility(0);
                return;
            }
        } else
        {
            shoppingbagviewholder.mItemInseam.setVisibility(8);
            return;
        }
    }

    private void a(String s)
    {
        com.jcp.h.g.a(s, "JCP|BAG", null);
    }

    private ItemFulfillmentDetails b(int i1)
    {
        ItemFulfillmentDetails aitemfulfillmentdetails[] = f[i1].getFulfillmentOptions();
        if (aitemfulfillmentdetails != null)
        {
            int j1 = aitemfulfillmentdetails.length;
            for (i1 = 0; i1 < j1; i1++)
            {
                ItemFulfillmentDetails itemfulfillmentdetails = aitemfulfillmentdetails[i1];
                if ("2".equals(itemfulfillmentdetails.getId()))
                {
                    return itemfulfillmentdetails;
                }
            }

            return null;
        } else
        {
            return null;
        }
    }

    static String b(AddToCartAdapter addtocartadapter, String s)
    {
        return addtocartadapter.b(s);
    }

    private String b(String s)
    {
        if (s != null)
        {
            s = s.split(">");
            if (s.length >= 2)
            {
                return String.valueOf(s[2]);
            }
        }
        return "";
    }

    static List b(AddToCartAdapter addtocartadapter)
    {
        return addtocartadapter.g;
    }

    private void b()
    {
        au.a(c, c.getResources().getString(0x7f070398), c.getResources().getString(0x7f0703be), c.getResources().getString(0x7f0700b4), new e(this), new f(this));
    }

    static void b(AddToCartAdapter addtocartadapter, CartItemsDetails cartitemsdetails)
    {
        addtocartadapter.b(cartitemsdetails);
    }

    private void b(CartItemsDetails cartitemsdetails)
    {
        ah ah1 = new ah(c);
        b.t = true;
        com.jcp.b.b.a(cartitemsdetails.getId());
        com.jcp.b.b.b(cartitemsdetails.getProductId());
        com.jcp.b.b.c((new StringBuilder()).append(cartitemsdetails.getItemId()).append("").toString());
        ah1.a(d);
        ah1.a(cartitemsdetails.getProductId(), cartitemsdetails.getQuantity(), cartitemsdetails.getItemId());
    }

    static void c(AddToCartAdapter addtocartadapter, CartItemsDetails cartitemsdetails)
    {
        addtocartadapter.c(cartitemsdetails);
    }

    private void c(CartItemsDetails cartitemsdetails)
    {
        Object obj = new android.app.AlertDialog.Builder(c);
        Object obj1 = c.getLayoutInflater().inflate(0x7f030034, null);
        ((android.app.AlertDialog.Builder) (obj)).setView(((View) (obj1)));
        Button button = (Button)((View) (obj1)).findViewById(0x7f0e01be);
        Button button1 = (Button)((View) (obj1)).findViewById(0x7f0e0148);
        obj1 = (Button)((View) (obj1)).findViewById(0x7f0e01bf);
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        ((AlertDialog) (obj)).setCancelable(true);
        ((AlertDialog) (obj)).show();
        ((AlertDialog) (obj)).getWindow().setLayout(-2, -2);
        button.setOnClickListener(new com.jcp.adapters.g(this, cartitemsdetails, ((AlertDialog) (obj))));
        ((Button) (obj1)).setOnClickListener(new h(this, cartitemsdetails, ((AlertDialog) (obj))));
        button1.setOnClickListener(new i(this, ((AlertDialog) (obj))));
    }

    static CartItemsDetails[] c(AddToCartAdapter addtocartadapter)
    {
        return addtocartadapter.f;
    }

    static PopupWindow d(AddToCartAdapter addtocartadapter)
    {
        return addtocartadapter.h;
    }

    private void d(CartItemsDetails cartitemsdetails)
    {
        com.jcp.b.b.d(true);
        Object obj = a(cartitemsdetails);
        a("Edit Item");
        cartitemsdetails = new ProductDetailFragment();
        cartitemsdetails.g(((Bundle) (obj)));
        obj = d;
        obj = ShoppingBagFragment.a(d.i());
        if (obj != null)
        {
            ((t) (obj)).b(cartitemsdetails, "ProductDetailFragment");
        }
    }

    static void e(AddToCartAdapter addtocartadapter)
    {
        addtocartadapter.b();
    }

    static ShoppingBagFragment f(AddToCartAdapter addtocartadapter)
    {
        return addtocartadapter.d;
    }

    static aa g(AddToCartAdapter addtocartadapter)
    {
        return addtocartadapter.e;
    }

    static ac h(AddToCartAdapter addtocartadapter)
    {
        return addtocartadapter.c;
    }

    public CartItemsDetails a(int i1)
    {
        return f[i1];
    }

    public void a(int i1, int j1)
    {
        a("Edit Item|Update");
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        try
        {
            jsonobject1.put("id", f[i1].getItemId());
            jsonobject1.put("ppId", f[i1].getProductId());
            jsonobject1.put("quantity", j1);
            jsonarray.put(jsonobject1);
            jsonobject.put("items", jsonarray);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        ae.d(a, (new StringBuilder()).append("json object").append(jsonobject.toString()).toString());
        e = new aa(c);
        e.a(d);
        e.a(jsonobject, f[i1].getId());
    }

    public void a(String s, boolean flag)
    {
        l = s;
        k = flag;
    }

    public void a(CartItemsDetails acartitemsdetails[])
    {
        if (acartitemsdetails != null)
        {
            f = (CartItemsDetails[])Arrays.copyOf(acartitemsdetails, acartitemsdetails.length);
            a();
            notifyDataSetChanged();
            return;
        } else
        {
            ae.a(a, "setCartItems(null) was called!!!");
            return;
        }
    }

    public int getCount()
    {
        return f.length;
    }

    public Object getItem(int i1)
    {
        return a(i1);
    }

    public long getItemId(int i1)
    {
        return (long)i1;
    }

    public int getItemViewType(int i1)
    {
        return n != i1 ? 0 : 1;
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        CartItemsDetails cartitemsdetails;
        int j1;
        byte byte0;
        byte0 = 0;
        cartitemsdetails = a(i1);
        j1 = getItemViewType(i1);
        if (view != null) goto _L2; else goto _L1
_L1:
        viewgroup = (LayoutInflater)c.getSystemService("layout_inflater");
        j1;
        JVM INSTR tableswitch 0 1: default 60
    //                   0 84
    //                   1 114;
           goto _L3 _L4 _L5
_L3:
        Object obj = null;
        viewgroup = view;
        view = obj;
_L9:
        ViewGroup viewgroup1 = viewgroup;
        viewgroup = view;
        view = viewgroup1;
_L7:
        if (j1 == 1)
        {
            return view;
        }
        break; /* Loop/switch isn't completed */
_L4:
        viewgroup = m.a(view);
        view = m.a();
        viewgroup.setTag(view);
        ButterKnife.inject(this, viewgroup);
        continue; /* Loop/switch isn't completed */
_L5:
        viewgroup = viewgroup.inflate(0x7f03009e, null);
        view = null;
        continue; /* Loop/switch isn't completed */
_L2:
        viewgroup = (ShoppingBagViewHolder)view.getTag();
        if (true) goto _L7; else goto _L6
_L6:
        a(viewgroup);
        m.a(viewgroup, cartitemsdetails);
        a(viewgroup, i1);
        a(i1, viewgroup, a(i1, viewgroup));
        a(cartitemsdetails, viewgroup);
        m.b(cartitemsdetails, viewgroup);
        if (viewgroup != null)
        {
            RelativeLayout relativelayout;
            boolean flag;
            if ("recycle".equalsIgnoreCase(cartitemsdetails.getType()) || "recycle fee".equalsIgnoreCase(cartitemsdetails.getBrandName()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            relativelayout = ((ShoppingBagViewHolder) (viewgroup)).mSaveForLaterLayout;
            if (flag)
            {
                byte0 = 8;
            }
            relativelayout.setVisibility(byte0);
        }
        m.a(cartitemsdetails, viewgroup);
        m.a(viewgroup, i1, getCount());
        return view;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public int getViewTypeCount()
    {
        return 2;
    }


    private class ShoppingBagViewHolder
    {

        protected TextView editItem;
        protected RelativeLayout mCartItemRelativeLayout;
        protected TextView mChangeStore;
        protected TextView mCouponCalculation;
        protected TextView mCouponCalculationAmount;
        protected LinearLayout mCutOffMessageView;
        protected RelativeLayout mEstimateLayoutHasPickUp;
        protected RelativeLayout mEstimateLayoutNoPickUp;
        protected RelativeLayout mItemAmountLayout;
        protected TextView mItemCode;
        protected TextView mItemEstimatedDelivery;
        protected TextView mItemEstimatedDeliveryDescription;
        protected ImageView mItemEstimatedDeliveryQuestionImageView;
        protected ImageView mItemImageView;
        protected HtmlTypefaceTextView mItemInseam;
        protected RelativeLayout mItemInvoiceInfoLayout;
        protected TextView mItemItemPrice;
        protected TextView mItemOriginalPrice;
        protected RelativeLayout mItemPlusMinusLayout;
        protected TextView mItemRemove;
        protected TextView mItemSavePrice;
        protected TextView mItemSavedPriceLabelView;
        protected LinearLayout mItemSeparator;
        protected TextView mItemShipDate;
        protected View mItemShipDateDividerLine;
        protected ImageView mItemShipDateHint;
        protected RelativeLayout mItemShipDateLayout;
        protected TextView mItemTitle;
        protected TextView mItemTotalPrice;
        protected TextView mItemTotalText;
        protected TextView mItemTypeDescription;
        protected TextView mItemTypePrice;
        protected View mItemValueSeparatorView;
        protected RelativeLayout mMattressLayout;
        protected RelativeLayout mMattressRecyleFeeLayout;
        protected TextView mMattressRecyleFeeTotalValue;
        protected TextView mMattressRecyleFeeUnitValue;
        protected View mMattressSeparator;
        protected TextView mMattressViewMore;
        protected View mQuantityDividerLine;
        protected TextView mQuantityItem;
        protected TextView mQuantityValue;
        protected Button mRadiBtnPickUpStore;
        protected Button mRadioBtnShipIt;
        protected TextView mRewardCalculation;
        protected TextView mRewardCalculationAmount;
        protected TextView mSalePriceHeader;
        protected TextView mSameDayPickUpDescription;
        protected TextView mSameDayPickUpStoreName;
        protected TextView mSameDayPickUpTitle;
        protected View mSameDayPickupDividerLine;
        protected ImageView mSameDayPickupIconView;
        protected RelativeLayout mSameDayPickupLayout;
        protected RelativeLayout mSameDayPickupViewGroup;
        protected TextView mSaveForLater;
        protected ImageView mSaveForLaterImageView;
        protected RelativeLayout mSaveForLaterLayout;
        protected View mSeparatorView;
        protected View mSeparatorViewBelowEstimateLayout;
        protected TextView marketingLabel;
        protected RelativeLayout recoverItemRelativeLayout;
        protected TextView recoverOriginalPriceDescription;

        public ShoppingBagViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
