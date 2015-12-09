// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinnerAdapterWrapper;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterPersonalInfoFragment

final class AdapterWrapper extends ValidatedSpinnerAdapterWrapper
{

    final KycEnterPersonalInfoFragment this$0;
    final ArrayAdapter val$arrayAdapter;

    private bCategory getItemValue(int i)
    {
        return (bCategory)val$arrayAdapter.getItem(i);
    }

    protected final String getHintText()
    {
        return getActivity().getString(com.google.android.apps.walletnfcrel.ctivity);
    }

    protected final volatile Object getItemValue(int i)
    {
        return getItemValue(i);
    }

    bCategory(SpinnerAdapter spinneradapter, int i, ArrayAdapter arrayadapter)
    {
        this$0 = final_kycenterpersonalinfofragment;
        val$arrayAdapter = arrayadapter;
        super(Context.this, spinneradapter, i);
    }
}
