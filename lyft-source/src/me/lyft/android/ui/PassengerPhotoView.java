// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.flows.ProfileFlow;

// Referenced classes of package me.lyft.android.ui:
//            PassengerMyPhotoView, UserImageView

public class PassengerPhotoView extends LinearLayout
{

    final android.view.View.OnClickListener onClickListener;
    private String passengerId;
    TextView passengerName;
    UserImageView passengerPhotoImageView;
    ProfileFlow profileFlow;

    public PassengerPhotoView(Context context)
    {
        super(context);
        onClickListener = new android.view.View.OnClickListener() {

            final PassengerPhotoView this$0;

            public void onClick(View view)
            {
                profileFlow.openPassengerRideProfile(passengerId);
            }

            
            {
                this$0 = PassengerPhotoView.this;
                super();
            }
        };
        init();
    }

    public PassengerPhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onClickListener = new _cls1();
        init();
    }

    public PassengerPhotoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        onClickListener = new _cls1();
        init();
    }

    public PassengerPhotoView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        onClickListener = new _cls1();
        init();
    }

    public static PassengerPhotoView forPassenger(Passenger passenger, Context context)
    {
        if (passenger.isSelf())
        {
            context = new PassengerMyPhotoView(context);
        } else
        {
            context = new PassengerPhotoView(context);
        }
        context.setPassengerId(passenger.getId());
        context.loadPhoto(passenger.getPhotoUrl());
        context.setPartySize(Integer.valueOf(passenger.getPartySize()));
        context.setPassengerName(passenger.getFirstName());
        return context;
    }

    private void init()
    {
        setOrientation(1);
        setGravity(17);
        Scoop scoop = Scoop.a(this);
        scoop.b(this);
        scoop.a(getContext()).inflate(0x7f0300b9, this, true);
        ButterKnife.a(this);
        setOnClickListener(onClickListener);
    }

    protected void loadPhoto(String s)
    {
        passengerPhotoImageView.loadPhoto(s);
    }

    protected void setPartySize(Integer integer)
    {
        passengerPhotoImageView.setUserPartySize(integer);
    }

    protected void setPassengerId(String s)
    {
        passengerId = s;
    }

    protected void setPassengerName(String s)
    {
        passengerName.setText(s);
    }

}
