// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.dialogs.LoginDialogFragment;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class t
    implements android.view.ctivity._cls3
{

    final LabsCheckoutActivity this$0;
    final LabsPayment val$token;

    public void onClick(View view)
    {
        if (mProfileManager.getAuthorizationCode() == null)
        {
            class _cls1
                implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
            {

                final LabsCheckoutActivity._cls3 this$1;

                public void onCanceled()
                {
                }

                public void onContinueAsGuest()
                {
                    restartActivity();
                }

                public void onLoginSuccess()
                {
                    LabsCheckoutActivity.access$100(this$0, token);
                }

                public void onSignOut()
                {
                }

            _cls1()
            {
                this$1 = LabsCheckoutActivity._cls3.this;
                super();
            }
            }

            logindialog = LoginDialogFragment.newInstance(null, null, false, true, new _cls1());
            logindialog.show(getSupportFragmentManager());
            return;
        } else
        {
            LabsCheckoutActivity.access$100(LabsCheckoutActivity.this, val$token);
            return;
        }
    }

    t()
    {
        this$0 = final_labscheckoutactivity;
        val$token = LabsPayment.this;
        super();
    }
}
