// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.place.view.PlaceCameraCell;
import com.pinterest.activity.place.view.PlaceImageCell;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.PlaceImage;

public class PlaceImagePickerAdapter extends PinterestBaseAdapter
{

    private static final int CAMERA_CELL = 0;
    private static final int CELL_COUNT = 2;
    private static final int IMAGE_CELL = 1;

    public PlaceImagePickerAdapter()
    {
    }

    public int getCount()
    {
        int i = super.getCount();
        if (isLoading() && i == 0)
        {
            return 0;
        } else
        {
            return super.getCount() + 1;
        }
    }

    public volatile Model getItem(int i)
    {
        return getItem(i);
    }

    public PlaceImage getItem(int i)
    {
        return (PlaceImage)super.getItem(i - 1);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public int getItemHeight(int i, int j)
    {
        return j;
    }

    public int getItemViewType(int i)
    {
        return i != 0 ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        switch (getItemViewType(i))
        {
        default:
            view = PlaceImageCell.from(view, viewgroup);
            viewgroup = getItem(i);
            if (viewgroup != null)
            {
                view.setImageUrl(viewgroup.getThumbUrl());
            }
            return view;

        case 0: // '\0'
            return PlaceCameraCell.from(view, viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
