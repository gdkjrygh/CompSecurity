// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.RadioButton;
import com.dominos.android.sdk.constant.PaymentTag;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.dialogs.LoginDialogFragment;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class <init>
    implements android.view.kListener
{

    final LabsCheckoutActivity this$0;
    private final LabsPayment token;

    public void onClick(final View rb)
    {
        rb = (RadioButton)rb;
        rb.setTag(PaymentTag.CREDIT);
        rb.setChecked(false);
        mOrderManager.getOrder().setPaymentTag(PaymentTag.CREDIT);
        if (mProfileManager.getAuthorizationCode() == null && !mProfileManager.isOAuthTokenExist())
        {
            if (logindialog != null)
            {
                logindialog.dismiss();
            }
            class _cls1
                implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
            {

                final LabsCheckoutActivity.CreditCardRowClickListener this$1;
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

                        final _cls1 this$2;

                        public void run()
                        {
                            if (mProfileManager.isAuthorizedUser())
                            {
                                LabsCheckoutActivity.access$400(this$0);
                                LabsCheckoutActivity.access$200(this$0);
                                rb.setChecked(true);
                                LabsCheckoutActivity.access$300(this$0, token);
                            }
                        }

                            _cls1()
                            {
                                this$2 = _cls1.this;
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
                this$1 = LabsCheckoutActivity.CreditCardRowClickListener.this;
                rb = radiobutton;
                super();
            }
            }

            logindialog = LoginDialogFragment.newInstance(null, null, false, true, new _cls1());
            logindialog.show(getSupportFragmentManager());
            return;
        } else
        {
            LabsCheckoutActivity.access$400(LabsCheckoutActivity.this);
            LabsCheckoutActivity.access$200(LabsCheckoutActivity.this);
            rb.setChecked(true);
            LabsCheckoutActivity.access$300(LabsCheckoutActivity.this, token);
            return;
        }
    }


    private _cls1(LabsPayment labspayment)
    {
        this$0 = LabsCheckoutActivity.this;
        super();
        token = labspayment;
    }

    token(LabsPayment labspayment, token token1)
    {
        this(labspayment);
    }
}
