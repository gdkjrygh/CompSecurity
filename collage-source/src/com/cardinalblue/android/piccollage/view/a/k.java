// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.c;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.bumptech.glide.request.e;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.m;
import com.cardinalblue.android.piccollage.events.n;
import com.cardinalblue.android.piccollage.model.PhotoInfo;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import com.squareup.a.b;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class k extends android.support.v7.widget.RecyclerView.Adapter
    implements Observer
{
    public static class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public a(View view)
        {
            super(view);
        }
    }

    public static class b extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public b(View view)
        {
            super(view);
        }
    }


    protected final j a;
    protected List b;
    protected int c;
    protected final int d;

    public k(Context context, int i)
    {
        c = 0;
        a = g.b(context);
        d = i;
    }

    public void a()
    {
        a.d();
    }

    public void a(List list)
    {
        b = list;
        for (list = b.iterator(); list.hasNext(); ((PhotoInfo)list.next()).a(false)) { }
        c = 0;
        notifyDataSetChanged();
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.g());
    }

    public void b()
    {
        a.e();
        b = null;
        c = 0;
    }

    public int getItemCount()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.size() + 1;
        }
    }

    public int getItemViewType(int i)
    {
        return i != 0 ? 3 : 1;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        if (viewholder instanceof a)
        {
            viewholder.itemView.setOnClickListener(new android.view.View.OnClickListener() {

                final k a;

                public void onClick(View view)
                {
                    com.cardinalblue.android.piccollage.controller.d.a().c(new n());
                }

            
            {
                a = k.this;
                super();
            }
            });
            return;
        } else
        {
            PhotoInfo photoinfo = (PhotoInfo)b.get(i - 1);
            CheckableImageView checkableimageview = (CheckableImageView)viewholder.itemView;
            File file = new File(com.cardinalblue.android.piccollage.lib.e.a.c.c(photoinfo.a()));
            checkableimageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            checkableimageview.setChecked(photoinfo.c());
            checkableimageview.setOnClickListener(new android.view.View.OnClickListener(photoinfo) {

                final PhotoInfo a;
                final k b;

                public void onClick(View view)
                {
                    view = (CheckableImageView)view;
                    int i1 = b.c;
                    int l;
                    if (view.a())
                    {
                        l = -1;
                    } else
                    {
                        l = 1;
                    }
                    l += i1;
                    if (l <= b.d && l >= 0)
                    {
                        view.b();
                        if (view.a())
                        {
                            view = b;
                            view.c = ((k) (view)).c + 1;
                            a.a(true);
                            com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.a(a));
                            return;
                        } else
                        {
                            view = b;
                            view.c = ((k) (view)).c - 1;
                            a.a(false);
                            com.cardinalblue.android.piccollage.controller.d.a().c(new m(a));
                            return;
                        }
                    } else
                    {
                        String s = String.format(view.getContext().getString(0x7f0702a4), new Object[] {
                            Integer.valueOf(30)
                        });
                        com.cardinalblue.android.b.k.a(view.getContext(), s, 0);
                        return;
                    }
                }

            
            {
                b = k.this;
                a = photoinfo;
                super();
            }
            });
            a.a(file).a(0x7f02021e).a(new e(checkableimageview) {

                final CheckableImageView a;
                final k b;

                public boolean a(com.bumptech.glide.load.resource.a.b b1, File file1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
                {
                    a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                    return false;
                }

                public boolean a(Exception exception, File file1, com.bumptech.glide.request.b.j j1, boolean flag)
                {
                    a.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
                    return false;
                }

                public volatile boolean a(Exception exception, Object obj, com.bumptech.glide.request.b.j j1, boolean flag)
                {
                    return a(exception, (File)obj, j1, flag);
                }

                public volatile boolean a(Object obj, Object obj1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
                {
                    return a((com.bumptech.glide.load.resource.a.b)obj, (File)obj1, j1, flag, flag1);
                }

            
            {
                b = k.this;
                a = checkableimageview;
                super();
            }
            }).a((ImageView)viewholder.itemView);
            return;
        }
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        switch (i)
        {
        default:
            return new b(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300d9, viewgroup, false));

        case 1: // '\001'
            return new a(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300d6, viewgroup, false));
        }
    }

    public void update(Observable observable, Object obj)
    {
    }
}
