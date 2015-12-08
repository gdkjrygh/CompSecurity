// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.create.fragment.view.GalleryDirectoryCell;
import com.pinterest.activity.create.model.DirectoryItem;
import com.pinterest.adapter.PinterestBaseAdapter;

public class GalleryDirectoryAdapter extends PinterestBaseAdapter
{

    public GalleryDirectoryAdapter()
    {
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = new GalleryDirectoryCell(viewgroup.getContext());
        } else
        {
            view = (GalleryDirectoryCell)view;
        }
        if (view != null)
        {
            view.setDirectoryItem((DirectoryItem)getItem(i));
        }
        return view;
    }
}
