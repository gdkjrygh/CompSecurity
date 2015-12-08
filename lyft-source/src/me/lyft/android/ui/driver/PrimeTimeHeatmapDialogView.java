// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.functions.Action1;

public class PrimeTimeHeatmapDialogView extends DialogContainerView
{

    MessageBus bus;
    ImageView cancelButton;
    DialogFlow dialogFlow;
    TextView heatmapDialogBody;
    private Action1 onRouteChanged;
    private final DriverDialogs.PrimeTimeHeatmapDialog params;
    IDriverRideProvider routeProvider;

    public PrimeTimeHeatmapDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onRouteChanged = new Action1() {

            final PrimeTimeHeatmapDialogView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                if (driverride.isPending() || driverride.isInProgress())
                {
                    dialogFlow.dismiss();
                }
            }

            
            {
                this$0 = PrimeTimeHeatmapDialogView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        params = (DriverDialogs.PrimeTimeHeatmapDialog)context.a();
    }

    private void initializeDialog()
    {
        heatmapDialogBody.setText(getResources().getString(0x7f070191, new Object[] {
            params.getPercentage()
        }));
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PrimeTimeHeatmapDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = PrimeTimeHeatmapDialogView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        initializeDialog();
        Binder.attach(this).bind(routeProvider.observeRide(), onRouteChanged);
    }

    protected void onClickOutside()
    {
        onCancel();
        dialogFlow.dismiss();
    }
}
