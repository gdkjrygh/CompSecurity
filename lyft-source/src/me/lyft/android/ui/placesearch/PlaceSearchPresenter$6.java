// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.domain.shortcuts.Shortcut;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchPresenter, ShortcutPlaceItemViewModel, IPlaceItemViewModel

class this._cls0
    implements Func1
{

    final PlaceSearchPresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((Shortcut)obj);
    }

    public IPlaceItemViewModel call(Shortcut shortcut)
    {
        return ShortcutPlaceItemViewModel.create(shortcut, PlaceSearchPresenter.access$300(PlaceSearchPresenter.this), PlaceSearchPresenter.access$400(PlaceSearchPresenter.this));
    }

    del()
    {
        this$0 = PlaceSearchPresenter.this;
        super();
    }
}
