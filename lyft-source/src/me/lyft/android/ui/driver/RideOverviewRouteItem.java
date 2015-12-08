// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.utils.Navigator;

public class RideOverviewRouteItem extends RelativeLayout
{

    View dashedPathView;
    private DriverRide driverRide;
    private boolean isNetworkError;
    Button navigateButton;
    private Navigator navigator;
    View pathView;
    private Stop stop;
    ImageView stopImageView;
    TextView subtitleTextView;
    TextView titleTextView;

    public RideOverviewRouteItem(Context context, DriverRide driverride, Stop stop1, Navigator navigator1, boolean flag)
    {
        super(context);
        driverRide = driverride;
        stop = stop1;
        navigator = navigator1;
        isNetworkError = flag;
        initView();
    }

    private int getStopImage()
    {
        if (driverRide.isCurrentStop(stop))
        {
            return 0x7f020142;
        }
        return !stop.isCompleted() ? 0x7f020143 : 0x7f020141;
    }

    private void initRoutPathElements()
    {
        boolean flag = false;
        boolean flag1 = driverRide.isLastStopInRoute(stop);
        boolean flag2 = driverRide.isLastStop(stop);
        View view = pathView;
        int i;
        if (flag2 || flag1)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        view = dashedPathView;
        if (flag1 && !flag2)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
        view = pathView;
        if (stop.isCompleted())
        {
            i = getResources().getColor(0x7f0c006f);
        } else
        {
            i = getResources().getColor(0x7f0c0092);
        }
        view.setBackgroundColor(i);
    }

    private void initView()
    {
        boolean flag = false;
        ButterKnife.a(LayoutInflater.from(getContext()).inflate(0x7f03011c, this, true), this);
        Object obj = titleTextView;
        Resources resources = getResources();
        int i;
        if (stop.isDropOff())
        {
            i = 0x7f070315;
        } else
        {
            i = 0x7f070316;
        }
        ((TextView) (obj)).setText(resources.getString(i, new Object[] {
            stop.getPassenger().getFirstName()
        }));
        stopImageView.setImageResource(getStopImage());
        subtitleTextView.setText(stop.getLocation().getDisplayName());
        navigateButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RideOverviewRouteItem this$0;

            public void onClick(View view)
            {
                navigator.navigate(stop.getLocation());
            }

            
            {
                this$0 = RideOverviewRouteItem.this;
                super();
            }
        });
        if (isNetworkError && !stop.isCompleted() || driverRide.isCurrentStop(stop))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = navigateButton;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((Button) (obj)).setVisibility(i);
        if (stop.isCompleted())
        {
            titleTextView.setTextColor(getResources().getColor(0x7f0c006f));
            subtitleTextView.setTextColor(getResources().getColor(0x7f0c006f));
        } else
        {
            titleTextView.setTextColor(getResources().getColor(0x7f0c00b7));
            subtitleTextView.setTextColor(getResources().getColor(0x7f0c006f));
        }
        initRoutPathElements();
    }


}
