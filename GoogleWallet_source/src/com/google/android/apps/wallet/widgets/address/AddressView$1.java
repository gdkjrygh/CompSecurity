// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.google.android.apps.wallet.widgets.address:
//            AddressView, AddressSourceResult

final class val.currentField
    implements android.widget.ItemClickListener
{

    final AddressView this$0;
    final char val$currentField;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (AddressSourceResult)adapterview.getItemAtPosition(i);
        view = adapterview.getAddress();
        if (view != null)
        {
            AddressView.access$000(AddressView.this, view, val$currentField);
        } else
        if (!TextUtils.isEmpty(adapterview.getReference()))
        {
            AddressView.access$100(AddressView.this, adapterview, val$currentField);
            return;
        }
    }

    esult()
    {
        this$0 = final_addressview;
        val$currentField = C.this;
        super();
    }
}
