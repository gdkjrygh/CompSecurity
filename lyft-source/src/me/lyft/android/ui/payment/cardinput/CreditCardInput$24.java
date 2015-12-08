// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import me.lyft.android.common.Strings;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.domain.geo.Address;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CreditCardInput

class this._cls0 extends AsyncCall
{

    final CreditCardInput this$0;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Address)obj);
    }

    public void onSuccess(Address address)
    {
        if (address != null)
        {
            if (Strings.isNullOrBlank(stateEditText.getText().toString()))
            {
                stateEditText.setText(address.getState());
            }
            if (Strings.isNullOrBlank(cityEditText.getText().toString()))
            {
                cityEditText.setText(address.getCity());
            }
        }
    }

    ()
    {
        this$0 = CreditCardInput.this;
        super();
    }
}
