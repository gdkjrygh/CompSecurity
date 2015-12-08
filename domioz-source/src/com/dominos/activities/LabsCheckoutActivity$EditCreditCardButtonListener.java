// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.RadioButton;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class rb
    implements android.view.nListener
{

    private RadioButton rb;
    final LabsCheckoutActivity this$0;

    public void onClick(View view)
    {
        LabsCheckoutActivity.access$200(LabsCheckoutActivity.this);
        rb.performClick();
        onCreditCardEdit(view);
        rb.setChecked(true);
    }

    public (RadioButton radiobutton)
    {
        this$0 = LabsCheckoutActivity.this;
        super();
        rb = radiobutton;
    }
}
