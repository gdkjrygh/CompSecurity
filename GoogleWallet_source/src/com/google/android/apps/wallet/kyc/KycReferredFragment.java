// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.wallet.base.fragment.WalletFragment;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycFragmentInterface, KycNavListener, KycUiModel

public class KycReferredFragment extends WalletFragment
    implements KycFragmentInterface
{

    public KycReferredFragment()
    {
        setArguments(new Bundle());
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getActivity().setTitle("");
        if (getActivity() instanceof ActionBarActivity)
        {
            ((ActionBarActivity)getActivity()).getSupportActionBar().setElevation(0.0F);
        }
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.kyc_referred_fragment, null);
        ((Button)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.ok)).setOnClickListener(new android.view.View.OnClickListener() {

            final KycReferredFragment this$0;

            public final void onClick(View view)
            {
                getActivity().setResult(20);
                getActivity().finish();
            }

            
            {
                this$0 = KycReferredFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public final void setKycNavListener(KycNavListener kycnavlistener)
    {
    }

    public final void setKycUiModel(KycUiModel kycuimodel)
    {
    }
}
