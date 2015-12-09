// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.widget.RadioButton;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class val.rb
    implements com.dominos.dialogs.._cls1
{

    final _cls1 this$1;
    final RadioButton val$rb;

    public void onCanceled()
    {
    }

    public void onContinueAsGuest()
    {
        restartActivity();
    }

    public void onLoginSuccess()
    {
        class _cls1
            implements Runnable
        {

            final LabsCheckoutActivity.CreditCardRowClickListener._cls1 this$2;

            public void run()
            {
                if (mProfileManager.isAuthorizedUser())
                {
                    LabsCheckoutActivity.access$400(this$0);
                    LabsCheckoutActivity.access$200(this$0);
                    rb.setChecked(true);
                    LabsCheckoutActivity.access$300(this$0, LabsCheckoutActivity.CreditCardRowClickListener.access$1500(this$1));
                }
            }

            _cls1()
            {
                this$2 = LabsCheckoutActivity.CreditCardRowClickListener._cls1.this;
                super();
            }
        }

        runOnUiThread(new _cls1());
    }

    public void onSignOut()
    {
    }

    _cls1()
    {
        this$1 = final__pcls1;
        val$rb = RadioButton.this;
        super();
    }
}
