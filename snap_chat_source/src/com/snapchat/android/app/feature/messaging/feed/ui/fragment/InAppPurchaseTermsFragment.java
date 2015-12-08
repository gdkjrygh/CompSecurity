// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.util.fragment.SnapchatFragment;

public class InAppPurchaseTermsFragment extends SnapchatFragment
{

    public InAppPurchaseTermsFragment()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040091, viewgroup, false);
        d(0x7f0d0039).setOnClickListener(new android.view.View.OnClickListener() {

            private InAppPurchaseTermsFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = InAppPurchaseTermsFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }
}
