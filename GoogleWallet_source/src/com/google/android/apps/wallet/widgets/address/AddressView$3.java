// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.widgets.address:
//            AddressView

final class val.currentField
    implements AsyncCallback
{

    final AddressView this$0;
    final char val$currentField;

    private void onSuccess(com.google.location.country.ess.PostalAddress postaladdress)
    {
        if (postaladdress != null)
        {
            AddressView.access$000(AddressView.this, postaladdress, val$currentField);
        }
    }

    public final void onFailure(Exception exception)
    {
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.location.country.ess.PostalAddress)obj);
    }

    ()
    {
        this$0 = final_addressview;
        val$currentField = C.this;
        super();
    }
}
