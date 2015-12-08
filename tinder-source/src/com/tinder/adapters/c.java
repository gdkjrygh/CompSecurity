// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.model.FacebookAlbum;
import com.tinder.views.RoundImageView;
import java.util.ArrayList;
import java.util.List;

public final class c extends BaseAdapter
{
    static final class a
        implements x
    {

        RoundImageView a;
        TextView b;
        TextView c;

        public final void onBitmapFailed(Drawable drawable)
        {
        }

        public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            a.onBitmapLoaded(bitmap, loadedfrom);
            a.setBackgroundResource(0x7f0d0107);
        }

        public final void onPrepareLoad(Drawable drawable)
        {
        }

        a()
        {
        }
    }


    private final Context a;
    private final LayoutInflater b;
    private List c;

    public c(Context context)
    {
        c = new ArrayList();
        a = context;
        b = LayoutInflater.from(context);
    }

    public final FacebookAlbum a(int i)
    {
        return (FacebookAlbum)c.get(i);
    }

    public final void a(FacebookAlbum facebookalbum)
    {
        c.add(0, facebookalbum);
        notifyDataSetChanged();
    }

    public final void a(List list)
    {
        c = list;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return c.size();
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
        View view1 = view;
        if (view == null)
        {
            view = new a();
            view1 = b.inflate(0x7f03007c, viewgroup, false);
            view.a = (RoundImageView)view1.findViewById(0x7f0e01f0);
            view.b = (TextView)view1.findViewById(0x7f0e01f1);
            view.c = (TextView)view1.findViewById(0x7f0e01f2);
            view1.setTag(view);
        }
        view = (a)view1.getTag();
        Object obj = (FacebookAlbum)c.get(i);
        i = ((FacebookAlbum) (obj)).count;
        viewgroup = ((FacebookAlbum) (obj)).name;
        obj = ((FacebookAlbum) (obj)).thumbnailUrl;
        String s1 = a.getResources().getQuantityString(0x7f08000a, i, new Object[] {
            Integer.valueOf(i)
        });
        ((a) (view)).b.setText(viewgroup);
        ((a) (view)).c.setText(s1);
        ((a) (view)).a.setBackgroundResource(0x7f02019d);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            Picasso.a(a).a(((String) (obj))).a(0x7f09000d, 0x7f09000d).b().a(((a) (view)).a);
        }
        return view1;
    }
}
