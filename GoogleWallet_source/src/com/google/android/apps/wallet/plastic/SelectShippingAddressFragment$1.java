// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            SelectShippingAddressFragment, OrderPlasticCardUiModel

final class this._cls0
    implements OnActionListener
{

    final SelectShippingAddressFragment this$0;

    private void onAction(Integer integer)
    {
        SelectShippingAddressFragment.access$000(SelectShippingAddressFragment.this).setSelectedAddressIndex(integer.intValue());
        SelectShippingAddressFragment.access$100(SelectShippingAddressFragment.this);
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Integer)obj);
    }

    ()
    {
        this$0 = SelectShippingAddressFragment.this;
        super();
    }
}
