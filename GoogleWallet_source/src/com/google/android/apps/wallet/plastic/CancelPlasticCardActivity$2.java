// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinnerAdapterWrapper;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            CancelPlasticCardActivity

final class dapterWrapper extends ValidatedSpinnerAdapterWrapper
{

    final CancelPlasticCardActivity this$0;
    final ArrayAdapter val$arrayAdapter;

    private ason getItemValue(int i)
    {
        return (ason)val$arrayAdapter.getItem(i);
    }

    protected final String getHintText()
    {
        return getString(com.google.android.apps.walletnfcrel.reason_hint);
    }

    protected final volatile Object getItemValue(int i)
    {
        return getItemValue(i);
    }

    ason(SpinnerAdapter spinneradapter, int i, ArrayAdapter arrayadapter)
    {
        this$0 = final_cancelplasticcardactivity;
        val$arrayAdapter = arrayadapter;
        super(Context.this, spinneradapter, i);
    }
}
