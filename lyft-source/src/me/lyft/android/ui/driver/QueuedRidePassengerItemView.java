// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.ui.UserImageView;

public class QueuedRidePassengerItemView extends FrameLayout
{

    private final Passenger passenger;
    UserImageView userImageView;
    TextView userNameTextView;

    public QueuedRidePassengerItemView(Context context, Passenger passenger1)
    {
        super(context);
        context = Scoop.a(this);
        context.b(this);
        context.a(getContext()).inflate(0x7f030115, this, true);
        passenger = passenger1;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        userImageView.setUserPartySize(Integer.valueOf(passenger.getPartySize()));
        userImageView.loadPhoto(passenger.getPhotoUrl());
        userNameTextView.setText(passenger.getFirstName());
    }
}
