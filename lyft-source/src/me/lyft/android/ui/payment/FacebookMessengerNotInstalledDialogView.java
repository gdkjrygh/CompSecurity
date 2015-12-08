// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class FacebookMessengerNotInstalledDialogView extends DialogContainerView
{

    ImageView closeButton;
    DialogFlow dialogFlow;

    public FacebookMessengerNotInstalledDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            closeButton.setOnClickListener(new android.view.View.OnClickListener() {

                final FacebookMessengerNotInstalledDialogView this$0;

                public void onClick(View view)
                {
                    dialogFlow.dismiss(me/lyft/android/ui/payment/PaymentDialogs$FacebookMessengerNotInstalledDialogScreen);
                }

            
            {
                this$0 = FacebookMessengerNotInstalledDialogView.this;
                super();
            }
            });
            return;
        }
    }
}
