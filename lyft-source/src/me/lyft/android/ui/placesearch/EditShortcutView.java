// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.util.AttributeSet;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.shortcuts.IShortcutService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.shortcuts.Shortcut;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import rx.Observable;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchView, IPlaceSearchPresenter

public class EditShortcutView extends PlaceSearchView
{

    AppFlow appFlow;
    private Binder binder;
    private final PlaceSearchScreens.EditShortcut params;
    IPlaceSearchPresenter placeSearchPresenter;
    IProgressController progressController;
    IShortcutService shortcutService;

    public EditShortcutView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (PlaceSearchScreens.EditShortcut)context.a();
    }

    protected int getHintId()
    {
        return !params.getShortcut().isHome() ? 0x7f0702af : 0x7f0702ad;
    }

    protected Observable getInitialPlaces()
    {
        return placeSearchPresenter.observeShortcutSuggestions();
    }

    protected String getInitialQuery()
    {
        return params.getShortcut().getLocation().getAddress();
    }

    protected int getInputIconId()
    {
        return !params.getShortcut().isHome() ? 0x7f020172 : 0x7f020171;
    }

    protected String getSourceForAnalytics()
    {
        return "shortcut";
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
    }

    protected void onPlaceSelected(Location location)
    {
        progressController.showProgress();
        binder.bind(shortcutService.saveShortcut(params.getShortcut().getType(), location), new AsyncCall() {

            final EditShortcutView this$0;

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
                this$0 = EditShortcutView.this;
                super();
            }
        });
    }
}
