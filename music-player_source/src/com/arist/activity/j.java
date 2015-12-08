// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.arist.activity:
//            LrcBrowseActivity, k

final class j extends BaseAdapter
{

    final LrcBrowseActivity a;

    j(LrcBrowseActivity lrcbrowseactivity)
    {
        a = lrcbrowseactivity;
        super();
    }

    public final File a(int i)
    {
        return (File)LrcBrowseActivity.a(a).get(i);
    }

    public final int getCount()
    {
        return LrcBrowseActivity.a(a).size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        File file;
        ImageView imageview;
        if (view == null)
        {
            view = a.getLayoutInflater().inflate(0x7f030025, null);
            viewgroup = new k(this);
            viewgroup.a = (ImageView)view.findViewById(0x7f06008c);
            viewgroup.b = (TextView)view.findViewById(0x7f06008d);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (k)view.getTag();
        }
        file = a(i);
        imageview = ((k) (viewgroup)).a;
        if (file.isDirectory())
        {
            i = 0x7f020093;
        } else
        {
            i = 0x7f020057;
        }
        imageview.setImageResource(i);
        ((k) (viewgroup)).b.setText(file.getName());
        return view;
    }
}
