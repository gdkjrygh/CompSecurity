// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.model.gdata.AlbumEntry;
import com.cardinalblue.android.piccollage.view.a.a;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            d

private class c extends ArrayAdapter
{

    final d a;
    private LayoutInflater b;
    private int c;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        a a1;
        String s;
        AlbumEntry albumentry;
        String s1;
        int j;
        if (view == null)
        {
            view = b.inflate(0x7f030046, viewgroup, false);
            a1 = new a(view);
            view.setTag(a1);
        } else
        {
            a1 = (a)view.getTag();
            if (a1 == null)
            {
                view = b.inflate(0x7f030046, viewgroup, false);
                a1 = new a(view);
            }
        }
        albumentry = (AlbumEntry)getItem(i);
        j = albumentry.c();
        if (j > 1)
        {
            s = (new StringBuilder()).append(j).append(getContext().getString(0x7f07022c)).toString();
        } else
        {
            s = (new StringBuilder()).append(j).append(getContext().getString(0x7f070224)).toString();
        }
        s1 = albumentry.d();
        if (TextUtils.isEmpty(s1))
        {
            a1.a.setImageResource(0x7f02021e);
        } else
        {
            com.androidquery.a a2 = new com.androidquery.a(view);
            if (a2.a(i, view, viewgroup, s1))
            {
                ((com.androidquery.a)a2.b(0x7f100107)).d(0x7f02021e);
            } else
            {
                ((com.androidquery.a)a2.b(0x7f100107)).a(s1, true, true, c, 0);
            }
        }
        a1.b.setText(albumentry.b());
        a1.c.setVisibility(0);
        a1.c.setText(s);
        return view;
    }

    public try(d d1, Context context)
    {
        a = d1;
        super(context, 0x7f030046);
        b = LayoutInflater.from(context);
        c = context.getResources().getDimensionPixelSize(0x7f0b0137);
    }
}
