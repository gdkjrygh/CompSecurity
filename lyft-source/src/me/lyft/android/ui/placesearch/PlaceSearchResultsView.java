// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.controls.recycleview.HorizontalDividerDecoration;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceAdapter, IPlaceItemViewModel

public class PlaceSearchResultsView extends RecyclerView
{

    private PlaceAdapter placeAdapter;
    private PublishSubject placeItemSelectedSubject;

    public PlaceSearchResultsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        placeAdapter = null;
        placeItemSelectedSubject = PublishSubject.create();
        if (isInEditMode())
        {
            return;
        } else
        {
            setHasFixedSize(true);
            addItemDecoration(new HorizontalDividerDecoration(getResources().getDrawable(0x7f0201e3)));
            setLayoutManager(new LinearLayoutManager(context));
            placeAdapter = new PlaceAdapter();
            setAdapter(placeAdapter);
            return;
        }
    }

    public void addPlaces(List list)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((IPlaceItemViewModel)iterator.next()).setSelectionObserver(placeItemSelectedSubject)) { }
        placeAdapter.addPlaces(list);
        placeAdapter.notifyDataSetChanged();
    }

    public void clearPlaces()
    {
        placeAdapter.setPlaces(new ArrayList());
        placeAdapter.notifyDataSetChanged();
    }

    public Observable observeSelectedItem()
    {
        return placeItemSelectedSubject.asObservable();
    }

    public void reloadPlaces(List list)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((IPlaceItemViewModel)iterator.next()).setSelectionObserver(placeItemSelectedSubject)) { }
        placeAdapter.setPlaces(list);
        placeAdapter.notifyDataSetChanged();
    }
}
