// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class CourierRideTypeInfoDialogView extends DialogContainerView
{

    ImageView cancelButton;
    IConstantsProvider constantsProvider;
    DialogFlow dialogFlow;
    TextView headerTextView;
    private final PassengerDialogs.CourierRideTypeInfoDialog params;
    TextView priceGuaranteedMessageTextView;
    TextView priceGuaranteedTitleTextView;
    TextView ridePriceTextView;
    TextView smartlyRoutedMessageTextView;
    TextView smartlyRoutedTitleTextView;
    TextView titleTextView;

    public CourierRideTypeInfoDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (PassengerDialogs.CourierRideTypeInfoDialog)context.a();
    }

    protected void onAttachedToWindow()
    {
        boolean flag = false;
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CourierRideTypeInfoDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = CourierRideTypeInfoDialogView.this;
                super();
            }
        });
        TextView textview = headerTextView;
        int i;
        if (params.isComparison())
        {
            i = 8;
        } else
        {
            i = 0;
        }
        textview.setVisibility(i);
        textview = ridePriceTextView;
        if (params.isComparison())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        ridePriceTextView.setText(params.getFareMoney().format());
        titleTextView.setText(Strings.nullOrEmptyToDefault(constantsProvider.getConstants().getCourierDialogHeaderTitle(), getResources().getString(0x7f0700e8)));
        headerTextView.setText(Strings.nullOrEmptyToDefault(constantsProvider.getConstants().getCourierDialogHeaderMessage(), getResources().getString(0x7f070218)));
        smartlyRoutedTitleTextView.setText(Strings.nullOrEmptyToDefault(constantsProvider.getConstants().getCourierDialogInfoTitle1(), getResources().getString(0x7f0700e5)));
        smartlyRoutedMessageTextView.setText(Strings.nullOrEmptyToDefault(constantsProvider.getConstants().getCourierDialogInfoMessage1(), getResources().getString(0x7f0700e4)));
        priceGuaranteedTitleTextView.setText(Strings.nullOrEmptyToDefault(constantsProvider.getConstants().getCourierDialogInfoTitle2(), getResources().getString(0x7f0700e1)));
        priceGuaranteedMessageTextView.setText(Strings.nullOrEmptyToDefault(constantsProvider.getConstants().getCourierDialogInfoMessage2(), getResources().getString(0x7f0700e0)));
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
            return;
        }
    }
}
