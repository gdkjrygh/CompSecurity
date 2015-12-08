// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryItem;
import me.lyft.android.managers.ImageLoader;

public class PassengerRideHistoryItemView extends LinearLayout
{

    ImageView drivePhotoImageView;
    ImageLoader imageLoader;
    TextView rideDistanceAndDurationTextView;
    TextView rideEndDateTimeTextView;
    TextView rideTotalTextView;
    TextView rideTypeTextView;

    public PassengerRideHistoryItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void setItem(PassengerRideHistoryItem passengerridehistoryitem)
    {
        imageLoader.load(passengerridehistoryitem.getDriverPhotoUrl()).centerCrop().fit().placeholder(0x7f0201fc).into(drivePhotoImageView);
        rideTotalTextView.setText(passengerridehistoryitem.getTotalMoney());
        rideEndDateTimeTextView.setText(passengerridehistoryitem.getPickupTime());
        if (Strings.isNullOrEmpty(passengerridehistoryitem.getRideTypeLabel()))
        {
            rideTypeTextView.setVisibility(8);
        } else
        {
            rideTypeTextView.setText(passengerridehistoryitem.getRideTypeLabel());
            rideTypeTextView.setVisibility(0);
        }
        rideDistanceAndDurationTextView.setText((new StringBuilder()).append(passengerridehistoryitem.getDistance()).append(" \u2022 ").append(passengerridehistoryitem.getRideDuration()).toString());
    }
}
