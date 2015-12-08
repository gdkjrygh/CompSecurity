// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.util.fragment.SnapchatFragment;

public class IneligibleCashFragment extends SnapchatFragment
{

    public IneligibleCashFragment()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040092, viewgroup, false);
        d(0x7f0d031b).setOnClickListener(new android.view.View.OnClickListener() {

            private IneligibleCashFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = IneligibleCashFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }
}
