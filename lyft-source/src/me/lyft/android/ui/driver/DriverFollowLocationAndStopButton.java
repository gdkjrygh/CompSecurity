// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.lyft.scoop.Scoop;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;

public class DriverFollowLocationAndStopButton extends ImageButton
{

    private Binder binder;
    private final BehaviorSubject isFollowingSubject = BehaviorSubject.create(Boolean.valueOf(true));
    private boolean isZoomEnabled;
    RideMap rideMap;

    public DriverFollowLocationAndStopButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    public void follow()
    {
        if (!((Boolean)isFollowingSubject.getValue()).booleanValue())
        {
            isFollowingSubject.onNext(Boolean.valueOf(true));
            if (isZoomEnabled)
            {
                setImageResource(0x7f0201cf);
                return;
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(isFollowingSubject, new Action1() {

            final DriverFollowLocationAndStopButton this$0;

            public void call(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    rideMap.followLocationAndFitToNextStop();
                    return;
                } else
                {
                    rideMap.unfollowCurrentLocation();
                    return;
                }
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = DriverFollowLocationAndStopButton.this;
                super();
            }
        });
    }

    public boolean performClick()
    {
        if (((Boolean)isFollowingSubject.getValue()).booleanValue())
        {
            unfollow();
            if (isZoomEnabled)
            {
                rideMap.fitMapToDriverRoute();
            }
        } else
        {
            follow();
        }
        return true;
    }

    public void setZoomOutEnabled(boolean flag)
    {
        isZoomEnabled = flag;
        if (!flag)
        {
            setImageResource(0x7f020136);
        }
    }

    public void unfollow()
    {
        if (!((Boolean)isFollowingSubject.getValue()).booleanValue())
        {
            return;
        } else
        {
            isFollowingSubject.onNext(Boolean.valueOf(false));
            setImageResource(0x7f020136);
            return;
        }
    }
}
