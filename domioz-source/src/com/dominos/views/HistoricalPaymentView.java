// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.user.UserProfileManager;
import java.util.List;
import java.util.Locale;

public class HistoricalPaymentView extends LinearLayout
{

    MobileSession mMobileSession;
    ImageView mPaymentIconView;
    TextView mPaymentInfoTextView;
    private UserProfileManager mUserManager;

    public HistoricalPaymentView(Context context)
    {
        super(context);
    }

    public HistoricalPaymentView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void bind(LabsOrder labsorder)
    {
        if (mUserManager.isHistoricalOrderPaymentValid(labsorder))
        {
            labsorder = (LabsPayment)labsorder.getPaymentList().get(0);
            if (labsorder.getPaymentType().equalsIgnoreCase("CreditCardToken"))
            {
                if (!mUserManager.isCardExpired(labsorder.getCardId()))
                {
                    mPaymentInfoTextView.setText(labsorder.getNickName().toUpperCase(Locale.getDefault()));
                    mPaymentIconView.setImageResource(0x7f0200d3);
                }
            } else
            if (labsorder.getPaymentType().equalsIgnoreCase("Cash"))
            {
                mPaymentInfoTextView.setText(getResources().getString(0x7f08008b));
                mPaymentIconView.setImageResource(0x7f020092);
                return;
            }
        }
    }

    protected void onAfterInject()
    {
        mUserManager = (UserProfileManager)mMobileSession.getManager("user_manager");
    }
}
