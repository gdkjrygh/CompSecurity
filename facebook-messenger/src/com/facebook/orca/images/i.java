// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.k;
import com.facebook.ui.images.b.m;
import com.facebook.ui.images.b.o;
import com.facebook.widget.images.UrlImage;
import java.util.Collections;
import java.util.List;

public class i extends BaseAdapter
{

    private final Context a;
    private final LayoutInflater b;
    private List c;

    public i(Context context, LayoutInflater layoutinflater)
    {
        c = Collections.emptyList();
        a = context;
        b = layoutinflater;
    }

    public Bundle a(int j)
    {
        return (Bundle)c.get(j);
    }

    public void a(List list)
    {
        c = list;
        notifyDataSetInvalidated();
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int j)
    {
        return a(j);
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = (UrlImage)b.inflate(k.orca_image_search_item, viewgroup, false);
        } else
        {
            view = (UrlImage)view;
        }
        view.setImageParams(m.a(Uri.parse(((Bundle)((Bundle)c.get(j)).getParcelable("Thumbnail")).getString("Url"))).a());
        return view;
    }
}
