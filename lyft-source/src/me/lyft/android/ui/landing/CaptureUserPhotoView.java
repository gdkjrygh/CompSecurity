// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.events.RideStatusChangedEvent;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.camera.CaptureView;
import rx.functions.Action1;

public class CaptureUserPhotoView extends RelativeLayout
{

    AppFlow appFlow;
    MessageBus bus;
    CaptureView captureView;

    public CaptureUserPhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        captureView.setSwitchCameraButtonVisibility(0);
        Binder.attach(this).bind(bus.observe(me/lyft/android/events/RideStatusChangedEvent), new Action1() {

            final CaptureUserPhotoView this$0;

            public volatile void call(Object obj)
            {
                call((RideDTO)obj);
            }

            public void call(RideDTO ridedto)
            {
                if ("droppedOff".equalsIgnoreCase(ridedto.getStatus()))
                {
                    appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
                }
            }

            
            {
                this$0 = CaptureUserPhotoView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
