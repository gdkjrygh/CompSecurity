// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.managers.ImageLoader;

public class PassengerRideHistorySplitPaymentBreakdownView extends LinearLayout
{

    private final ImageLoader imageLoader;
    private final LayoutInflater inflater;
    private final me.lyft.android.domain.ridehistory.PaymentBreakdown.SplitPayment splitPayment;
    TextView splitPaymentParticipantsCountTextView;
    LinearLayout splitPaymentProfilePhotosContainer;
    TextView splitPaymentTitleTextView;
    TextView subtotalLineItemTitleTextView;
    TextView subtotalValueTextView;

    public PassengerRideHistorySplitPaymentBreakdownView(Context context, me.lyft.android.domain.ridehistory.PaymentBreakdown.SplitPayment splitpayment, ImageLoader imageloader)
    {
        super(context);
        inflater = Scoop.a(this).a(context);
        ButterKnife.a(this, LayoutInflater.from(context).inflate(0x7f0300d4, this, true));
        imageLoader = imageloader;
        splitPayment = splitpayment;
        initSplitPayment();
    }

    public void initSplitPayment()
    {
        splitPaymentTitleTextView.setText(splitPayment.getSplitPaymentReceiptItem().getTitle());
        splitPaymentParticipantsCountTextView.setText(splitPayment.getSplitPaymentReceiptItem().getValue());
        ImageView imageview;
        for (Iterator iterator = splitPayment.getContributorPhotoUrls().iterator(); iterator.hasNext(); splitPaymentProfilePhotosContainer.addView(imageview))
        {
            String s = (String)iterator.next();
            imageview = (ImageView)inflater.inflate(0x7f0300d5, splitPaymentProfilePhotosContainer, false);
            imageLoader.load(s).centerCrop().fit().into(imageview);
        }

        subtotalLineItemTitleTextView.setText(splitPayment.getSubtotalReceiptItem().getTitle());
        subtotalValueTextView.setText(splitPayment.getSubtotalReceiptItem().getValue());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode());
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode());
    }
}
