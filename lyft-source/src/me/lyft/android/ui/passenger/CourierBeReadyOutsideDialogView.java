// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.events.RideStatusChangedEvent;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.functions.Action1;

public class CourierBeReadyOutsideDialogView extends DialogContainerView
{

    MessageBus bus;
    DialogFlow dialogFlow;
    private ReactiveProperty isAcceptedSubject;
    Button okButton;
    private Action1 onRideStatusChanged;
    private Action1 rideAcceptedChanged;

    public CourierBeReadyOutsideDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isAcceptedSubject = ReactiveProperty.create();
        rideAcceptedChanged = new Action1() {

            final CourierBeReadyOutsideDialogView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                onCancel();
            }

            
            {
                this$0 = CourierBeReadyOutsideDialogView.this;
                super();
            }
        };
        onRideStatusChanged = new Action1() {

            final CourierBeReadyOutsideDialogView this$0;

            public volatile void call(Object obj)
            {
                call((RideDTO)obj);
            }

            public void call(RideDTO ridedto)
            {
                ReactiveProperty reactiveproperty = isAcceptedSubject;
                boolean flag;
                if ("accepted".equalsIgnoreCase(ridedto.getStatus()) || "approaching".equalsIgnoreCase(ridedto.getStatus()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                reactiveproperty.onNext(Boolean.valueOf(flag));
            }

            
            {
                this$0 = CourierBeReadyOutsideDialogView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Binder binder = Binder.attach(this);
        binder.bind(bus.observe(me/lyft/android/events/RideStatusChangedEvent), onRideStatusChanged);
        binder.bind(ReactiveUI.isFalse(isAcceptedSubject), rideAcceptedChanged);
    }

    public void onCancel()
    {
        dialogFlow.dismiss();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        okButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CourierBeReadyOutsideDialogView this$0;

            public void onClick(View view)
            {
                onCancel();
            }

            
            {
                this$0 = CourierBeReadyOutsideDialogView.this;
                super();
            }
        });
    }

}
