// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.create.fragment.view.GalleryGridCell;
import com.pinterest.activity.create.model.PhotoItem;
import com.pinterest.adapter.PinterestBaseAdapter;

public class GalleryGridAdapter extends PinterestBaseAdapter
{

    public GalleryGridAdapter()
    {
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = new GalleryGridCell(viewgroup.getContext());
        } else
        {
            view = (GalleryGridCell)view;
        }
        view.setPhotoItem((PhotoItem)getItem(i));
        view.setClickable(false);
        return view;
    }
}
