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
import com.jcp.adapters.UPSTrackAdapter;
import com.jcp.c.r;
import com.jcp.e.at;
import com.jcp.pojo.TrackShipment;
import com.jcp.util.au;

// Referenced classes of package com.jcp.fragments:
//            s, hg

public class UPSTrackFragment extends s
    implements at
{

    protected ExpandableListView mPackagesShipmentStatusList;

    public UPSTrackFragment()
    {
    }

    private void b(String s1, String s2)
    {
        r r1 = r.a(i());
        r1.a(this);
        r1.a(s1, s2);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030087, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        Object obj = h();
        if (obj != null)
        {
            viewgroup = ((Bundle) (obj)).getString("ORDER_ID");
            bundle = ((Bundle) (obj)).getString("CARRIER");
            obj = ((Bundle) (obj)).getString("TRACKING_NUMBER");
            if (viewgroup != null)
            {
                a(((String) (viewgroup)));
            } else
            {
                a(a(0x7f070440));
            }
            b(bundle, ((String) (obj)));
        }
        return layoutinflater;
    }

    protected String a()
    {
        return "UPSTRACKFRAGMENT";
    }

    public void a(TrackShipment trackshipment)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            trackshipment = new UPSTrackAdapter(i(), trackshipment);
            mPackagesShipmentStatusList.setAdapter(trackshipment);
            return;
        }
    }

    public void a(String s1, String s2)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            au.a(i(), s2, new hg(this));
            return;
        }
    }
}
