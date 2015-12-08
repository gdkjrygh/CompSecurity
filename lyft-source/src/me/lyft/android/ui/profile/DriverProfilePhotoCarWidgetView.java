// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

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
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.driver.Vehicle;
import me.lyft.android.managers.ImageLoader;

public class DriverProfilePhotoCarWidgetView extends LinearLayout
{

    AppFlow appFlow;
    TextView carMakeModelTextView;
    ImageView driverPhotoImageView;
    ImageLoader imageLoader;
    TextView licensePlateTextView;
    TextView nameTextView;
    ImageView photoImageView;

    public DriverProfilePhotoCarWidgetView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        attributeset.a(context).inflate(0x7f030101, this, true);
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

    public void setCarInfo(Vehicle vehicle)
    {
        String s = Strings.joinWithDelimiter(" ", new String[] {
            vehicle.getMake(), vehicle.getModel()
        });
        if (vehicle.hasLicensePlate())
        {
            licensePlateTextView.setVisibility(0);
            licensePlateTextView.setText(vehicle.getLicensePlate());
        }
        carMakeModelTextView.setText(s);
        imageLoader.load(vehicle.getPhoto()).fit().placeholder(0x7f0c006b).into(photoImageView);
    }

    public void setUserInfo(String s, final String photoUrl)
    {
        nameTextView.setText(s);
        imageLoader.load(photoUrl).fit().centerCrop().placeholder(0x7f0201bb).into(driverPhotoImageView);
        driverPhotoImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverProfilePhotoCarWidgetView this$0;
            final String val$photoUrl;

            public void onClick(View view)
            {
                appFlow.goTo(new me.lyft.android.ui.MainScreens.FullscreenPhotoScreen(photoUrl));
            }

            
            {
                this$0 = DriverProfilePhotoCarWidgetView.this;
                photoUrl = s;
                super();
            }
        });
    }
}
