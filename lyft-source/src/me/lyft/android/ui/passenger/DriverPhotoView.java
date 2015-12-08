// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.managers.ImageLoader;

public class DriverPhotoView extends LinearLayout
{

    ImageView driverCarImageView;
    TextView driverNameTextView;
    View driverPhotoContainerView;
    ImageView driverPhotoImageView;
    ImageLoader imageLoader;
    ProfileFlow profileFlow;

    public DriverPhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        context.a(getContext()).inflate(0x7f030065, this, true);
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

    public void setDriver(Driver driver)
    {
        imageLoader.load(driver.getVehiclePhoto()).fit().centerInside().into(driverCarImageView);
        imageLoader.load(driver.getPhoto()).fit().centerInside().placeholder(0x7f0201fc).error(0x7f0201fc).into(driverPhotoImageView);
        driverNameTextView.setText(driver.getName());
        driverPhotoContainerView.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverPhotoView this$0;

            public void onClick(View view)
            {
                profileFlow.openDriverRideProfile();
            }

            
            {
                this$0 = DriverPhotoView.this;
                super();
            }
        });
    }
}
