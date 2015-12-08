// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.concurrent.TimeUnit;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.ride.PickupOffset;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.Observable;
import rx.functions.Action1;

public class PickupTimeSelectorDialogView extends DialogContainerView
{

    private static final int PICKUP_TIMER_INTERVAL_MINUTES = 1;
    DialogFlow dialogFlow;
    ListView listView;
    private PickupTimesAdapter pickupTimesAdapter;
    IPreRideInfoRepository preRideInfoRepository;
    IRideRequestSession rideRequestSession;

    public PickupTimeSelectorDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        List list = preRideInfoRepository.getPickupOffsets();
        pickupTimesAdapter = new PickupTimesAdapter(getContext(), list);
        listView.setAdapter(pickupTimesAdapter);
        Binder.attach(this).bind(Observable.interval(1L, TimeUnit.MINUTES).map(Unit.func1()), new Action1() {

            final PickupTimeSelectorDialogView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                pickupTimesAdapter.notifyDataSetChanged();
            }

            
            {
                this$0 = PickupTimeSelectorDialogView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void onPickupOffsetSelected(int i)
    {
        rideRequestSession.setPickupOffset((PickupOffset)pickupTimesAdapter.getItem(i));
        dialogFlow.dismiss();
    }


    private class PickupTimesAdapter extends ArrayAdapter
    {

        private final SimpleDateFormat dateFormat;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            view = (TextView)super.getView(i, view, viewgroup);
            view.setText(dateFormat.format(Long.valueOf(((PickupOffset)getItem(i)).getPickupTime())));
            return view;
        }

        public PickupTimesAdapter(Context context, List list)
        {
            super(context, 0x1090003, list);
            dateFormat = new SimpleDateFormat("hh:mm", Locale.US);
        }
    }

}
