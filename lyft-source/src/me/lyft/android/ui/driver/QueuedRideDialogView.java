// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.driver:
//            QueuedRidePassengerItemView

public class QueuedRideDialogView extends DialogContainerView
{

    private static final int DIALOG_AUTO_DISMISS_SEC = 30;
    IAppForegroundDetector appForegroundDetector;
    private Binder binder;
    ViewGroup containerView;
    DialogFlow dialogFlow;
    private List passengers;

    public QueuedRideDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        passengers = ((DriverDialogs.QueuedRideDialog)context.a()).getPassengers();
    }

    private void doDismiss()
    {
        binder.bind(Observable.timer(30L, TimeUnit.SECONDS), new Action1() {

            final QueuedRideDialogView this$0;

            public void call(Long long1)
            {
                dialogFlow.dismiss(me/lyft/android/ui/driver/DriverDialogs$QueuedRideDialog);
            }

            public volatile void call(Object obj)
            {
                call((Long)obj);
            }

            
            {
                this$0 = QueuedRideDialogView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Passenger passenger;
        for (Iterator iterator = passengers.iterator(); iterator.hasNext(); containerView.addView(new QueuedRidePassengerItemView(getContext(), passenger)))
        {
            passenger = (Passenger)iterator.next();
        }

        binder = Binder.attach(this);
        binder.bind(appForegroundDetector.observeAppForegrounded().filter(new Func1() {

            final QueuedRideDialogView this$0;

            public Boolean call(Boolean boolean1)
            {
                return boolean1;
            }

            public volatile Object call(Object obj)
            {
                return call((Boolean)obj);
            }

            
            {
                this$0 = QueuedRideDialogView.this;
                super();
            }
        }), new Action1() {

            final QueuedRideDialogView this$0;

            public void call(Boolean boolean1)
            {
                doDismiss();
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = QueuedRideDialogView.this;
                super();
            }
        });
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

    public boolean performClick()
    {
        dialogFlow.dismiss(me/lyft/android/ui/driver/DriverDialogs$QueuedRideDialog);
        return true;
    }

}
