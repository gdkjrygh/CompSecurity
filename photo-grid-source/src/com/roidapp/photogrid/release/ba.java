// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public final class ba extends BaseAdapter
{

    private Context a;
    private int b[];
    private String c[];
    private boolean d[];

    public ba(Context context, String as[], int ai[], boolean aflag[])
    {
        a = context;
        b = ai;
        c = as;
        d = aflag;
    }

    public final int getCount()
    {
        return c.length;
    }

    public final Object getItem(int i)
    {
        return c[i];
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = LayoutInflater.from(a).inflate(0x7f030093, null);
        }
        view = (TextView)viewgroup.findViewById(0x7f0d0206);
        if (a.getResources().getDisplayMetrics().density == 1.0F && (a.getResources().getDisplayMetrics().heightPixels == 1280 || a.getResources().getDisplayMetrics().heightPixels == 1184) && a.getResources().getDisplayMetrics().widthPixels == 800)
        {
            view.setTextSize(30F);
        }
        ImageView imageview = (ImageView)viewgroup.findViewById(0x7f0d0205);
        view.setText(c[i]);
        if (!d[i])
        {
            view.setTextColor(Color.rgb(144, 151, 128));
        }
        imageview.setImageResource(b[i]);
        return viewgroup;
    }
}
