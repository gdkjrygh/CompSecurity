// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.cardinalblue.android.piccollage.model.gson.Media;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import java.util.ArrayList;

public class n extends ArrayAdapter
{

    public n(Context context)
    {
        super(context, 0, new ArrayList());
    }

    public int a()
    {
        int k = getCount();
        int j = 0;
        int i = 0;
        for (; j < k; j++)
        {
            if (((Media)getItem(j)).isSelected())
            {
                i++;
            }
        }

        return i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = (CheckableImageView)LayoutInflater.from(getContext()).inflate(0x7f0300d9, viewgroup, false);
        } else
        {
            view = (CheckableImageView)view;
        }
        view.setImageBitmap(((Media)getItem(i)).getThumbnail());
        view.setChecked(((Media)getItem(i)).isSelected());
        return view;
    }
}
