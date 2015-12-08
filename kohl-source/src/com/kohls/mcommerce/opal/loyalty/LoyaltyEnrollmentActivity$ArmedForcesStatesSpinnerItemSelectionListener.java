// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.view.View;
import android.widget.AdapterView;
import com.kohls.mcommerce.opal.framework.view.adapter.ArrayAdapterWithHint;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

private class <init>
    implements android.widget.SelectionListener
{

    final LoyaltyEnrollmentActivity this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        LoyaltyEnrollmentActivity.access$2102(LoyaltyEnrollmentActivity.this, LoyaltyEnrollmentActivity.access$2200(LoyaltyEnrollmentActivity.this).getItem(i));
        LoyaltyEnrollmentActivity.access$700(LoyaltyEnrollmentActivity.this);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    private ()
    {
        this$0 = LoyaltyEnrollmentActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
