// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            EditRewardsAddressActivity

class this._cls0
    implements android.widget.tener
{

    final EditRewardsAddressActivity this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsAddressActivity.this, 0x7f0f001e);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsAddressActivity.this, 0x7f0f001e);
    }

    ()
    {
        this$0 = EditRewardsAddressActivity.this;
        super();
    }
}
