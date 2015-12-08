// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            SelectShippingAddressFragment

final class val.onAddressSelectedListener
    implements android.widget.ippingAddressFragment._cls2
{

    final SelectShippingAddressFragment this$0;
    final OnActionListener val$onAddressSelectedListener;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        val$onAddressSelectedListener.onAction(Integer.valueOf(i));
    }

    ()
    {
        this$0 = final_selectshippingaddressfragment;
        val$onAddressSelectedListener = OnActionListener.this;
        super();
    }
}
