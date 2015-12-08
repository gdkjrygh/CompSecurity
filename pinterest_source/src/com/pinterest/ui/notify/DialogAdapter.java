// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.notify;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DialogAdapter extends BaseAdapter
{

    private Drawable _itemIcons[];
    private CharSequence _items[];

    public DialogAdapter(CharSequence acharsequence[])
    {
        this(acharsequence, null);
    }

    public DialogAdapter(CharSequence acharsequence[], Drawable adrawable[])
    {
        _items = acharsequence;
        _itemIcons = adrawable;
    }

    public int getCount()
    {
        return _items.length;
    }

    public CharSequence getItem(int i)
    {
        return _items[i];
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        TextView textview;
        if (view == null)
        {
            view = new DialogHolder(null);
            View view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030151, null, false);
            view.titleTv = (TextView)view1.findViewById(0x7f0f0077);
            view.iconIv = (ImageView)view1.findViewById(0x7f0f0325);
            view.divider = view1.findViewById(0x7f0f0322);
            view1.setTag(view);
            viewgroup = view;
            view = view1;
        } else
        {
            viewgroup = (DialogHolder)view.getTag();
        }
        textview = ((DialogHolder) (viewgroup)).titleTv;
        if (getItem(i) == null)
        {
            s = "";
        } else
        {
            s = getItem(i).toString();
        }
        textview.setText(s);
        if (_itemIcons != null && _itemIcons.length > 0)
        {
            ((DialogHolder) (viewgroup)).iconIv.setVisibility(0);
            ((DialogHolder) (viewgroup)).iconIv.setImageDrawable(_itemIcons[i]);
        }
        viewgroup = ((DialogHolder) (viewgroup)).divider;
        if (i == getCount() - 1)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        viewgroup.setVisibility(i);
        return view;
    }

    private class DialogHolder
    {

        public View divider;
        public ImageView iconIv;
        public TextView titleTv;

        private DialogHolder()
        {
        }

        DialogHolder(_cls1 _pcls1)
        {
            this();
        }
    }

}
