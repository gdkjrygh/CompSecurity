// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import butterknife.ButterKnife;
import com.jcp.adapters.TrackPackageAdapter;
import com.jcp.helper.CartSummaryHelper;
import com.jcp.model.OrderItemsDetails;

// Referenced classes of package com.jcp.fragments:
//            s

public class TrackPackageFragment extends s
{

    protected ExpandableListView trackListView;

    public TrackPackageFragment()
    {
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030086, null);
        ButterKnife.inject(this, layoutinflater);
        viewgroup = (OrderItemsDetails)h().getSerializable("ORDER_DETAILS");
        bundle = new TrackPackageAdapter(this, i(), viewgroup.getInvoiceInfo(), viewgroup.getOrderDate(), viewgroup.getShippedDate(), viewgroup.getId());
        trackListView.setAdapter(bundle);
        bundle = new CartSummaryHelper(i(), null, null, false);
        trackListView.addFooterView(bundle.a());
        bundle.b(viewgroup);
        a(viewgroup.getId());
        return layoutinflater;
    }

    protected String a()
    {
        return "TRACKER";
    }
}
