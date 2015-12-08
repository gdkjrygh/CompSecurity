// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.util.AttributeSet;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import rx.Observable;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchView, IPlaceSearchPresenter

public class DestinySearchView extends PlaceSearchView
{

    AppFlow appFlow;
    private Binder binder;
    IDestinyService destinyService;
    IDestinySession destinySession;
    IPlaceSearchPresenter placeSearchPresenter;
    IProgressController progressController;

    public DestinySearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected int getHintId()
    {
        return 0x7f0702ac;
    }

    protected Observable getInitialPlaces()
    {
        return placeSearchPresenter.observeUserDropoffPlacesSuggestions();
    }

    protected String getInitialQuery()
    {
        return destinySession.getLocation().getAddress();
    }

    protected int getInputIconId()
    {
        return 0x7f02016f;
    }

    protected String getSourceForAnalytics()
    {
        return "destiny";
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
    }

    protected void onPlaceSelected(Location location)
    {
        progressController.showProgress();
        binder.bind(destinyService.setDestiny(location), new AsyncCall() {

            final DestinySearchView this$0;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                appFlow.goBack();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = DestinySearchView.this;
                super();
            }
        });
    }
}
