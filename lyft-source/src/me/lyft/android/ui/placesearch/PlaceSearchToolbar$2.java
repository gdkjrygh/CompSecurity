// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.view.View;
import me.lyft.android.common.Unit;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchToolbar

class this._cls0
    implements android.view.ceSearchToolbar._cls2
{

    final PlaceSearchToolbar this$0;

    public void onClick(View view)
    {
        backButtonTapSubject.onNext(Unit.create());
        PlaceSearchToolbar.access$100(PlaceSearchToolbar.this);
    }

    _cls9()
    {
        this$0 = PlaceSearchToolbar.this;
        super();
    }
}
