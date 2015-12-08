// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.bumptech.glide.load.engine.b;
import com.cardinalblue.android.piccollage.activities.e;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import java.util.ArrayList;
import java.util.List;

public class o extends android.support.v7.widget.RecyclerView.Adapter
{
    static class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public a(View view)
        {
            super(view);
        }
    }


    private final e a;
    private final Context b;
    private final List c = new ArrayList();
    private final j d;

    public o(Context context, e e1)
    {
        b = context;
        a = e1;
        d = g.b(b);
    }

    private Context a()
    {
        return b;
    }

    static e a(o o1)
    {
        return o1.a;
    }

    private WebPhoto a(int i)
    {
        return (WebPhoto)c.get(i);
    }

    static WebPhoto a(o o1, int i)
    {
        return o1.a(i);
    }

    public void a(List list)
    {
        c.addAll(list);
    }

    public void b(List list)
    {
        c.clear();
        c.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount()
    {
        return c.size();
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        WebPhoto webphoto = a(i);
        String s = webphoto.getThumbnailImageUrl();
        viewholder = (CheckableImageView)viewholder.itemView;
        d.a(s).b().a(0x7f02021e).a(b.a).a(new com.bumptech.glide.request.e(viewholder) {

            final CheckableImageView a;
            final o b;

            public boolean a(com.bumptech.glide.load.resource.a.b b1, String s1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
            {
                return false;
            }

            public volatile boolean a(Exception exception, Object obj, com.bumptech.glide.request.b.j j1, boolean flag)
            {
                return a(exception, (String)obj, j1, flag);
            }

            public boolean a(Exception exception, String s1, com.bumptech.glide.request.b.j j1, boolean flag)
            {
                a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                return false;
            }

            public volatile boolean a(Object obj, Object obj1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
            {
                return a((com.bumptech.glide.load.resource.a.b)obj, (String)obj1, j1, flag, flag1);
            }

            
            {
                b = o.this;
                a = checkableimageview;
                super();
            }
        }).a(viewholder);
        viewholder.setOnClickListener(new android.view.View.OnClickListener(webphoto, viewholder, i) {

            final WebPhoto a;
            final CheckableImageView b;
            final int c;
            final o d;

            public void onClick(View view)
            {
                if (o.a(d) != null && o.a(d).a(a))
                {
                    b.setChecked(o.a(d).b(o.a(d, c)));
                }
            }

            
            {
                d = o.this;
                a = webphoto;
                b = checkableimageview;
                c = i;
                super();
            }
        });
        viewholder.setChecked(a.b(a(i)));
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new a((CheckableImageView)LayoutInflater.from(a()).inflate(0x7f0300d9, viewgroup, false));
    }
}
