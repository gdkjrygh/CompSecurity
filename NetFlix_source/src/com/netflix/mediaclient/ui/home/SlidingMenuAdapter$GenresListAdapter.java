// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.GenreList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            SlidingMenuAdapter

private class genres extends BaseAdapter
{

    private final List genres;
    final SlidingMenuAdapter this$0;

    public int getCount()
    {
        return genres.size();
    }

    public GenreList getItem(int i)
    {
        return (GenreList)genres.get(i);
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
        viewgroup = view;
        if (view == null)
        {
            viewgroup = activity.getLayoutInflater().inflate(0x7f030031, null);
            viewgroup.setTag(new later((TextView)viewgroup.findViewById(0x7f0700c1)));
        }
        view = (later)viewgroup.getTag();
        updateAdapterViews(view, getItem(i));
        return viewgroup;
    }

    public (List list)
    {
        this$0 = SlidingMenuAdapter.this;
        super();
        genres = list;
    }
}
