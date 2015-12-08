// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

private class <init>
    implements android.widget.adioGroupListener
{

    final LoyaltyEnrollmentActivity this$0;

    public void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        switch (i)
        {
        default:
            return;

        case 2131558540: 
            LoyaltyEnrollmentActivity.access$2300(LoyaltyEnrollmentActivity.this, com.kohls.mcommerce.opal.common.util.._fld0);
            LoyaltyEnrollmentActivity.access$1802(LoyaltyEnrollmentActivity.this, com.kohls.mcommerce.opal.common.util.._fld0);
            LoyaltyEnrollmentActivity.access$2400(LoyaltyEnrollmentActivity.this).setHint(getString(0x7f0804f3));
            LoyaltyEnrollmentActivity.access$2500(LoyaltyEnrollmentActivity.this).setHint(getString(0x7f08016a));
            LoyaltyEnrollmentActivity.access$1700(LoyaltyEnrollmentActivity.this).setVisibility(0);
            LoyaltyEnrollmentActivity.access$2600(LoyaltyEnrollmentActivity.this).setVisibility(0);
            LoyaltyEnrollmentActivity.access$2700(LoyaltyEnrollmentActivity.this).setVisibility(8);
            LoyaltyEnrollmentActivity.access$700(LoyaltyEnrollmentActivity.this);
            return;

        case 2131558541: 
            LoyaltyEnrollmentActivity.access$2300(LoyaltyEnrollmentActivity.this, com.kohls.mcommerce.opal.common.util.._fld0);
            break;
        }
        LoyaltyEnrollmentActivity.access$1802(LoyaltyEnrollmentActivity.this, com.kohls.mcommerce.opal.common.util.._fld0);
        LoyaltyEnrollmentActivity.access$2400(LoyaltyEnrollmentActivity.this).setHint(getString(0x7f08015a));
        LoyaltyEnrollmentActivity.access$2500(LoyaltyEnrollmentActivity.this).setHint(getString(0x7f08015c));
        LoyaltyEnrollmentActivity.access$1700(LoyaltyEnrollmentActivity.this).setVisibility(8);
        LoyaltyEnrollmentActivity.access$2600(LoyaltyEnrollmentActivity.this).setVisibility(8);
        LoyaltyEnrollmentActivity.access$2800(LoyaltyEnrollmentActivity.this);
        LoyaltyEnrollmentActivity.access$2700(LoyaltyEnrollmentActivity.this).setVisibility(0);
        LoyaltyEnrollmentActivity.access$2002(LoyaltyEnrollmentActivity.this, "STATE");
        LoyaltyEnrollmentActivity.access$700(LoyaltyEnrollmentActivity.this);
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
