// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.trophies;

import Br;
import Bt;
import EW;
import EX;
import Gh;
import LY;
import Nw;
import UJ;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.util.emoji.Emoji;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import mS;

public class TrophyCaseFragment extends SnapchatFragment
    implements android.view.View.OnClickListener
{

    private View a;
    private GridView b;
    private EX c;
    private EW d;
    private List e;
    private TextView f;

    public TrophyCaseFragment()
    {
    }

    static List a(TrophyCaseFragment trophycasefragment)
    {
        return trophycasefragment.e;
    }

    static void a(TrophyCaseFragment trophycasefragment, UJ uj)
    {
        trophycasefragment.c = new EX(((LayoutInflater)trophycasefragment.getActivity().getSystemService("layout_inflater")).inflate(0x7f0400fb, null), uj, trophycasefragment.getActivity());
        trophycasefragment.c.showAtLocation(trophycasefragment.b, 17, 0, 0);
        trophycasefragment.d.a.add(uj);
    }

    private void h()
    {
        Br br = Br.a();
        if (br != null && br.mTrophies != null)
        {
            e = br.mTrophies;
            return;
        } else
        {
            e = new LinkedList();
            return;
        }
    }

    public final boolean k_()
    {
        return true;
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0d0039)
        {
            view = getActivity();
            if (view != null)
            {
                view.onBackPressed();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400f9, viewgroup, false);
        Bt.a();
        h();
        a = d(0x7f0d0039);
        a.setOnClickListener(this);
        f = (TextView)d(0x7f0d0519);
        layoutinflater = getActivity().getString(0x7f08012c);
        f.setText((new StringBuilder()).append(layoutinflater).append(" ").append(LY.a(Emoji.DISAPPOINTED_FACE)).toString());
        b = (GridView)d(0x7f0d051a);
        b.setEmptyView(f);
        d = new EW(getActivity(), e, Gh.a());
        b.setAdapter(d);
        b.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private TrophyCaseFragment a;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                view.findViewById(0x7f0d0521).setVisibility(4);
                adapterview = (UJ)TrophyCaseFragment.a(a).get(i);
                TrophyCaseFragment.a(a, adapterview);
            }

            
            {
                a = TrophyCaseFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        Bt.a(Long.valueOf(System.currentTimeMillis()));
        mS ms = new mS();
        ms.mLastCheckTrophiesTimestamp = Long.valueOf(Bt.bD());
        ms.execute();
    }

    public void onProfileDataUpdatedEvent(Nw nw)
    {
        h();
        d.notifyDataSetChanged();
    }

    public void onResume()
    {
        super.onResume();
        AnalyticsEvents.a(Integer.valueOf(e.size()));
    }
}
