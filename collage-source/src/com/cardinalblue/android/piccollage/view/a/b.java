// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.model.a;
import com.cardinalblue.android.piccollage.view.GalleryBitmapAjaxCallback;
import java.io.File;
import java.util.List;

public class b extends ArrayAdapter
{
    private class a
    {

        ImageView a;
        TextView b;
        final b c;

        private a()
        {
            c = b.this;
            super();
        }

    }


    private LayoutInflater a;
    private int b;

    public b(Context context, List list)
    {
        super(context, 0x7f030142, 0x7f100108, list);
        a = LayoutInflater.from(context);
        b = context.getResources().getDimensionPixelSize(0x7f0b0137);
    }

    private View a(int i, View view, ViewGroup viewgroup, int j)
    {
        com.cardinalblue.android.piccollage.model.a a1;
        com.androidquery.a a2;
        File file;
        GalleryBitmapAjaxCallback gallerybitmapajaxcallback;
        if (view == null)
        {
            view = a.inflate(j, viewgroup, false);
            viewgroup = new a();
            viewgroup.a = (ImageView)view.findViewById(0x7f10029b);
            viewgroup.b = (TextView)view.findViewById(0x7f100108);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (a)view.getTag();
        }
        a1 = (com.cardinalblue.android.piccollage.model.a)getItem(i);
        a2 = new com.androidquery.a(((a) (viewgroup)).a);
        file = new File(a1.c());
        gallerybitmapajaxcallback = (new GalleryBitmapAjaxCallback()).c(getContext());
        a2.a(file, true, b / 2, gallerybitmapajaxcallback);
        ((a) (viewgroup)).b.setText(a1.b());
        return view;
    }

    public void a(List list)
    {
        clear();
        addAll(list);
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return a(i, view, viewgroup, 0x7f030143);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return a(i, view, viewgroup, 0x7f030142);
    }
}
