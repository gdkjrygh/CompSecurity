// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.adapters.OrderHistoryAdapter;
import com.jcp.c.r;
import com.jcp.e.ar;
import com.jcp.model.OrderHistory;
import com.jcp.model.OrderItemsDetails;
import com.jcp.util.af;
import com.jcp.util.au;

// Referenced classes of package com.jcp.fragments:
//            s, TrackOrderTabFragment, SignInFragment, t, 
//            gv

public class TrackOrderHistoryFragment extends s
    implements android.widget.AdapterView.OnItemClickListener, ar
{

    protected TextView orderHistoryHeaderTextView;
    protected ListView orderHistoryListView;

    public TrackOrderHistoryFragment()
    {
    }

    private void V()
    {
        Object obj = m();
        if (obj != null && (obj instanceof TrackOrderTabFragment))
        {
            obj = ((TrackOrderTabFragment)obj).U();
            if (obj != null)
            {
                ((ViewPager) (obj)).setCurrentItem(0);
            }
        }
    }

    private void W()
    {
        if (!JCP.s().c())
        {
            X();
            return;
        } else
        {
            r r1 = r.a(i());
            r1.a(this);
            r1.a();
            return;
        }
    }

    private void X()
    {
        Bundle bundle = new Bundle();
        bundle.putString("from", "TrackOrderFragment");
        SignInFragment signinfragment = new SignInFragment();
        signinfragment.g(bundle);
        a(i()).c(signinfragment, "SignInFragment");
    }

    static void a(TrackOrderHistoryFragment trackorderhistoryfragment)
    {
        trackorderhistoryfragment.X();
    }

    static void b(TrackOrderHistoryFragment trackorderhistoryfragment)
    {
        trackorderhistoryfragment.V();
    }

    public void U()
    {
        W();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03006f, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    protected String a()
    {
        return "TRACKORDERHISTORY";
    }

    public void a(OrderItemsDetails orderitemsdetails)
    {
        android.support.v4.app.Fragment fragment;
        if (i() != null && n())
        {
            if ((fragment = m()) != null && (fragment instanceof TrackOrderTabFragment))
            {
                ((TrackOrderTabFragment)fragment).a(orderitemsdetails);
                return;
            }
        }
    }

    public void a(String s1, String s2)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            au.a(i(), s2, new gv(this, s1));
            return;
        }
    }

    public void a(OrderHistory aorderhistory[])
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            orderHistoryHeaderTextView.setText(a(0x7f0702cd));
            aorderhistory = new OrderHistoryAdapter(i(), aorderhistory);
            orderHistoryListView.setAdapter(aorderhistory);
            orderHistoryListView.setOnItemClickListener(this);
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (OrderHistory)adapterview.getAdapter().getItem(i);
        if (adapterview != null && adapterview.getUrl() != null)
        {
            view = r.a(i());
            view.a(this);
            view.a(adapterview.getUrl());
        }
    }
}
