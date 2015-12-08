// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Bt;
import Iq;
import Jo;
import S;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.util.fragment.SnapchatFragment;

public class SQAcceptTermsFragment extends SnapchatFragment
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    public a a;

    public SQAcceptTermsFragment()
    {
    }

    static a a(SQAcceptTermsFragment sqaccepttermsfragment)
    {
        return sqaccepttermsfragment.a;
    }

    static a b(SQAcceptTermsFragment sqaccepttermsfragment)
    {
        sqaccepttermsfragment.a = null;
        return null;
    }

    public final boolean f()
    {
        AnalyticsEvents.p();
        if (a != null)
        {
            a.b();
            a = null;
        }
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400e6, viewgroup, false);
        d(0x7f0d04b9).setOnClickListener(new android.view.View.OnClickListener() {

            private SQAcceptTermsFragment a;

            public final void onClick(View view)
            {
                if (SQAcceptTermsFragment.a(a) != null)
                {
                    SQAcceptTermsFragment.a(a).b();
                    SQAcceptTermsFragment.b(a);
                }
                a.getActivity().onBackPressed();
            }

            
            {
                a = SQAcceptTermsFragment.this;
                super();
            }
        });
        layoutinflater = (Button)d(0x7f0d04bd);
        getActivity().getAssets();
        Iq.a(layoutinflater);
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            private SQAcceptTermsFragment a;

            public final void onClick(View view)
            {
                Bt.ad();
                AnalyticsEvents.o();
                a.getActivity().mFragments.c();
                if (SQAcceptTermsFragment.a(a) != null)
                {
                    SQAcceptTermsFragment.a(a).a();
                    SQAcceptTermsFragment.b(a);
                }
            }

            
            {
                a = SQAcceptTermsFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onVisible()
    {
        super.onVisible();
        Jo.a(getActivity(), mFragmentLayout);
    }
}
