// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.CameraToolbar;
import me.lyft.android.events.RideStatusChangedEvent;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import rx.functions.Action1;

public class CaptureResultView extends FrameLayout
{

    AppFlow appFlow;
    MessageBus bus;
    CameraToolbar cameraToolbar;
    ICaptureImageSession captureImageSession;
    ImageLoader imageLoader;
    ImageView imageView;
    View retakeButton;
    View saveButton;

    public CaptureResultView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void retakePicture()
    {
        captureImageSession.retakePicture();
    }

    private void savePicture()
    {
        captureImageSession.savePicture();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            Binder.attach(this).bind(bus.observe(me/lyft/android/events/RideStatusChangedEvent), new Action1() {

                final CaptureResultView this$0;

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
                this$0 = CaptureResultView.this;
                super();
            }
            });
            cameraToolbar.setTitle(getResources().getString(0x7f07008a));
            return;
        }
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
            saveButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CaptureResultView this$0;

                public void onClick(View view)
                {
                    savePicture();
                }

            
            {
                this$0 = CaptureResultView.this;
                super();
            }
            });
            retakeButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CaptureResultView this$0;

                public void onClick(View view)
                {
                    retakePicture();
                }

            
            {
                this$0 = CaptureResultView.this;
                super();
            }
            });
            imageLoader.load(captureImageSession.getImage()).skipMemoryCache().centerInside().fit().into(imageView);
            return;
        }
    }

    public void setOnSaveListener(final OnSaveListener onSaveListener)
    {
        saveButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CaptureResultView this$0;
            final OnSaveListener val$onSaveListener;

            public void onClick(View view)
            {
                onSaveListener.onSave();
            }

            
            {
                this$0 = CaptureResultView.this;
                onSaveListener = onsavelistener;
                super();
            }

            private class OnSaveListener
            {

                public abstract void onSave();
            }

        });
    }


}
