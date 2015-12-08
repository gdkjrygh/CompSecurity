// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            IPlaceItemViewModel, PlaceItemView

class PlaceAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

    private static final int FOOTER = 0;
    private static final int ITEM = 1;
    private LayoutInflater layoutInflater;
    private List places;

    PlaceAdapter()
    {
        places = new ArrayList();
    }

    public void addPlaces(List list)
    {
        places.addAll(list);
    }

    public int getItemCount()
    {
        return places.size() + 1;
    }

    public int getItemViewType(int i)
    {
        return i != places.size() ? 1 : 0;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        if (viewholder instanceof ItemViewHolder)
        {
            viewholder = (ItemViewHolder)viewholder;
            IPlaceItemViewModel iplaceitemviewmodel = (IPlaceItemViewModel)places.get(i);
            ((ItemViewHolder) (viewholder)).placeItemView.setPlaceItem(iplaceitemviewmodel);
        }
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        if (layoutInflater == null)
        {
            layoutInflater = LayoutInflater.from(viewgroup.getContext());
        }
        if (i == 1)
        {
            return new ItemViewHolder((PlaceItemView)layoutInflater.inflate(0x7f0300ee, viewgroup, false));
        } else
        {
            return new FooterViewHolder(layoutInflater.inflate(0x7f0300fa, viewgroup, false));
        }
    }

    public void setPlaces(List list)
    {
        places = list;
    }

    private class ItemViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        final PlaceItemView placeItemView;

        public ItemViewHolder(PlaceItemView placeitemview)
        {
            super(placeitemview);
            placeItemView = placeitemview;
        }
    }


    private class FooterViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public FooterViewHolder(View view)
        {
            super(view);
        }
    }

}
