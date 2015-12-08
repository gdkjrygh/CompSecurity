// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MyAdapter extends BaseAdapter
{

    Activity a;
    ArrayList appnames;
    ArrayList icone;
    ImageView image;
    LayoutInflater inflater;
    ArrayList packNames;
    int resource;
    TextView text;
    TextView text2;

    public MyAdapter(Activity activity, int i, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2)
    {
        inflater = null;
        a = activity;
        resource = i;
        icone = arraylist;
        appnames = arraylist1;
        packNames = arraylist2;
        inflater = (LayoutInflater)activity.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        return icone.size();
    }

    public Drawable getItem(int i)
    {
        return (Drawable)icone.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = inflater.inflate(resource, null);
        }
        image = (ImageView)viewgroup.findViewById(0x7f0d00a4);
        text = (TextView)viewgroup.findViewById(0x7f0d00a5);
        text2 = (TextView)viewgroup.findViewById(0x7f0d00a6);
        image.setImageDrawable(getItem(i));
        text.setText((CharSequence)appnames.get(i));
        text2.setText((CharSequence)packNames.get(i));
        return viewgroup;
    }
}
