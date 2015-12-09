// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.fragments.TrackPackageFragment;
import com.jcp.fragments.UPSTrackFragment;
import com.jcp.fragments.t;
import com.jcp.model.CartItemsDetails;
import com.jcp.model.trackorder.InvoiceInfo;
import com.jcp.model.trackorder.Tracking;
import com.jcp.util.au;
import com.jcp.views.HtmlTypefaceTextView;

// Referenced classes of package com.jcp.adapters:
//            w, db, dc, dd

public class TrackPackageAdapter extends BaseExpandableListAdapter
{

    private final LayoutInflater a;
    private final ac b;
    private final String c;
    private final String d;
    private final w e;
    private final TrackPackageFragment f;
    private final String g;
    private InvoiceInfo h[];

    public TrackPackageAdapter(TrackPackageFragment trackpackagefragment, ac ac1, InvoiceInfo ainvoiceinfo[], String s, String s1, String s2)
    {
        f = trackpackagefragment;
        b = ac1;
        h = ainvoiceinfo;
        c = s;
        d = s1;
        g = s2;
        a = (LayoutInflater)ac1.getSystemService("layout_inflater");
        e = new w(ac1, true);
    }

    static ac a(TrackPackageAdapter trackpackageadapter)
    {
        return trackpackageadapter.b;
    }

    private View a(ViewGroup viewgroup)
    {
        return a.inflate(0x7f0300eb, viewgroup, false);
    }

    private void a(int i, ExpandableListView expandablelistview)
    {
        expandablelistview.expandGroup(i);
    }

    private void a(TrackOrderSectionView trackordersectionview, InvoiceInfo invoiceinfo, String s, String s1, String s2)
    {
        String s3 = s;
        if (s == null)
        {
            s3 = s;
            if (s2 != null)
            {
                int i = s2.indexOf(".");
                s3 = s2.substring(i + 1, s2.indexOf(".", i + 1));
            }
        }
        trackordersectionview.carrierType.setText(s3);
        trackordersectionview.trackStatus.setText(invoiceinfo.getDisplayedShippingStatus());
        trackordersectionview.trackMethod.setText(invoiceinfo.getShipTypeDesc());
        trackordersectionview.trackingNumber.setText(s1);
        trackordersectionview.trackPackageButton.setOnClickListener(new db(this, s2, s3, s1));
    }

    static void a(TrackPackageAdapter trackpackageadapter, String s)
    {
        trackpackageadapter.a(s);
    }

    static void a(TrackPackageAdapter trackpackageadapter, String s, String s1)
    {
        trackpackageadapter.a(s, s1);
    }

    private void a(String s)
    {
        if (b == null)
        {
            return;
        } else
        {
            Resources resources = b.getResources();
            au.a(b, resources.getString(0x7f0701cc), resources.getString(0x7f070049), resources.getString(0x7f070041), new dc(this, s), new dd(this));
            return;
        }
    }

    private void a(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("ORDER_ID", g);
        bundle.putString("CARRIER", s);
        bundle.putString("TRACKING_NUMBER", s1);
        s = new UPSTrackFragment();
        s.g(bundle);
        s1 = f;
        s1 = TrackPackageFragment.a(b);
        if (s1 != null)
        {
            s1.b(s, "TrackShipmentFragment");
        }
    }

    public CartItemsDetails a(int i, int j)
    {
        if (h != null && h[i].getItemInfo() != null)
        {
            return h[i].getItemInfo()[j];
        } else
        {
            return null;
        }
    }

    public InvoiceInfo a(int i)
    {
        if (h != null)
        {
            return h[i];
        } else
        {
            return null;
        }
    }

    public Object getChild(int i, int j)
    {
        return a(i, j);
    }

    public long getChildId(int i, int j)
    {
        return (long)j;
    }

    public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
    {
        Object obj = a(i, j);
        View view1 = e.a(view);
        AddToCartAdapter.ShoppingBagViewHolder shoppingbagviewholder = e.a();
        if (obj != null)
        {
            e.a(shoppingbagviewholder, ((CartItemsDetails) (obj)));
            shoppingbagviewholder.mItemPlusMinusLayout.setVisibility(8);
            shoppingbagviewholder.mSaveForLaterLayout.setVisibility(8);
            shoppingbagviewholder.mSameDayPickupLayout.setVisibility(8);
            shoppingbagviewholder.mQuantityDividerLine.setVisibility(8);
            shoppingbagviewholder.mSameDayPickupDividerLine.setVisibility(8);
            if (!TextUtils.isEmpty(d))
            {
                shoppingbagviewholder.mItemShipDateLayout.setVisibility(0);
                shoppingbagviewholder.mItemShipDate.setText(d);
                shoppingbagviewholder.mItemShipDateHint.setOnClickListener(e.b());
                shoppingbagviewholder.mItemShipDateDividerLine.setVisibility(0);
            }
            shoppingbagviewholder.mQuantityValue.setVisibility(0);
            shoppingbagviewholder.mQuantityValue.setText((new StringBuilder()).append(((CartItemsDetails) (obj)).getQuantity()).append("").toString());
            shoppingbagviewholder.mItemInseam.setText(((CartItemsDetails) (obj)).getEstDeliveryMsg());
            e.a(((CartItemsDetails) (obj)), shoppingbagviewholder);
            obj = ((CartItemsDetails) (obj)).getTracking();
            if (obj != null)
            {
                view = a(viewgroup);
                TrackOrderSectionView trackordersectionview = new TrackOrderSectionView(view);
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                shoppingbagviewholder.mItemInvoiceInfoLayout.setVisibility(0);
                shoppingbagviewholder.mItemInvoiceInfoLayout.removeAllViews();
                shoppingbagviewholder.mItemInvoiceInfoLayout.addView(view);
                String s = ((Tracking) (obj)).getHref();
                viewgroup = s.substring(s.indexOf(".") + 1, s.indexOf(".com"));
                view = viewgroup;
                if (viewgroup != null)
                {
                    view = viewgroup.toUpperCase();
                }
                a(trackordersectionview, a(i), view, ((Tracking) (obj)).getId(), s);
                trackordersectionview.trackOrderDateLayout.setVisibility(8);
            } else
            {
                shoppingbagviewholder.mItemInvoiceInfoLayout.setVisibility(8);
            }
        }
        shoppingbagviewholder.mItemSeparator.setVisibility(0);
        return view1;
    }

    public int getChildrenCount(int i)
    {
        if (h != null && h[i].getItemInfo() != null)
        {
            return h[i].getItemInfo().length;
        } else
        {
            return 0;
        }
    }

    public Object getGroup(int i)
    {
        return a(i);
    }

    public int getGroupCount()
    {
        if (h != null)
        {
            return h.length;
        } else
        {
            return 0;
        }
    }

    public long getGroupId(int i)
    {
        return (long)i;
    }

    public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
    {
        TrackOrderSectionView trackordersectionview;
        InvoiceInfo invoiceinfo;
        if (view == null)
        {
            view = a(viewgroup);
            trackordersectionview = new TrackOrderSectionView(view);
            view.setTag(trackordersectionview);
        } else
        {
            trackordersectionview = (TrackOrderSectionView)view.getTag();
        }
        invoiceinfo = h[i];
        if (invoiceinfo != null)
        {
            a(trackordersectionview, invoiceinfo, invoiceinfo.getDisplayedCarrierType(), invoiceinfo.getTrackingNumbers(), invoiceinfo.getTrackPackURL());
            if (TextUtils.isEmpty(trackordersectionview.trackingNumber.getText()))
            {
                trackordersectionview.trackPackageLayout.setVisibility(8);
            } else
            {
                trackordersectionview.trackPackageLayout.setVisibility(0);
            }
            trackordersectionview.trackOrderDate.setText(c);
        }
        a(i, (ExpandableListView)viewgroup);
        return view;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isChildSelectable(int i, int j)
    {
        return false;
    }

    private class TrackOrderSectionView
    {

        protected TextView carrierType;
        protected TextView trackMethod;
        protected TextView trackOrderDate;
        protected LinearLayout trackOrderDateLayout;
        protected Button trackPackageButton;
        protected LinearLayout trackPackageLayout;
        protected TextView trackStatus;
        protected TextView trackingNumber;

        public TrackOrderSectionView(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
