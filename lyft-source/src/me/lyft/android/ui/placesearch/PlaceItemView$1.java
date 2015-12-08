// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceItemView, IPlaceItemViewModel

class del
    implements android.view.ener
{

    final PlaceItemView this$0;
    final IPlaceItemViewModel val$placeItem;

    public void onClick(View view)
    {
        val$placeItem.onEdit();
    }

    del()
    {
        this$0 = final_placeitemview;
        val$placeItem = IPlaceItemViewModel.this;
        super();
    }
}
