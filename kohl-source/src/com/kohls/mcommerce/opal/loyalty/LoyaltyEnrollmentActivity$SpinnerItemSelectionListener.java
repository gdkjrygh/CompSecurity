// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.view.View;
import android.widget.AdapterView;
import com.kohls.mcommerce.opal.common.value.ConstantValues;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

private class <init>
    implements android.widget.SelectionListener
{

    final LoyaltyEnrollmentActivity this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (LoyaltyEnrollmentActivity.access$1800(LoyaltyEnrollmentActivity.this) != com.kohls.mcommerce.opal.common.util.._fld0) goto _L2; else goto _L1
_L1:
        LoyaltyEnrollmentActivity.access$2002(LoyaltyEnrollmentActivity.this, ConstantValues.STATES_CODE[i]);
_L4:
        LoyaltyEnrollmentActivity.access$700(LoyaltyEnrollmentActivity.this);
        return;
_L2:
        if (LoyaltyEnrollmentActivity.access$1800(LoyaltyEnrollmentActivity.this) == com.kohls.mcommerce.opal.common.util.._fld0)
        {
            LoyaltyEnrollmentActivity.access$2002(LoyaltyEnrollmentActivity.this, ConstantValues.ARMED_FORCE_STATES_CODE[i]);
        }
        if (true) goto _L4; else goto _L3
_L3:
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
