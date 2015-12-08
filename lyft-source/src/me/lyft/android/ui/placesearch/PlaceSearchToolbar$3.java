// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.text.Editable;
import android.text.TextWatcher;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchToolbar

class this._cls0
    implements TextWatcher
{

    final PlaceSearchToolbar this$0;

    public void afterTextChanged(Editable editable)
    {
        editable = editable.toString();
        queryChangeSubject.onNext(editable);
        PlaceSearchToolbar.access$200(PlaceSearchToolbar.this, editable);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    _cls9()
    {
        this$0 = PlaceSearchToolbar.this;
        super();
    }
}
