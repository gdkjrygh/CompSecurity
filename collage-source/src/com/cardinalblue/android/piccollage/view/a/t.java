// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.bumptech.glide.load.engine.b;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class t extends android.support.v7.widget.RecyclerView.Adapter
{
    public static class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public final CardView a;
        public final ImageView b;
        public final TextView c;

        public void a(Context context, CBYoutubeData cbyoutubedata, com.cardinalblue.android.piccollage.controller.n.a a1)
        {
            int k = 0x106000d;
            String s = cbyoutubedata.getVideoThumbUrlMedium();
            if (a1 != null)
            {
                boolean flag = a1.b(cbyoutubedata);
                a1 = context.getResources();
                int i;
                int l;
                if (flag)
                {
                    i = 0x7f0f0062;
                } else
                {
                    i = 0x106000d;
                }
                l = a1.getColor(i);
                a1 = context.getResources();
                i = k;
                if (flag)
                {
                    i = 0x7f0f0063;
                }
                i = a1.getColor(i);
                a.setCardBackgroundColor(l);
                a.setForeground(new ColorDrawable(i));
            }
            if (TextUtils.isEmpty(s))
            {
                b.setImageResource(0x7f02021e);
            } else
            {
                g.b(context).a(s).a(0x7f02021e).a(b.a).a(b);
            }
            c.setText(cbyoutubedata.getTitle());
        }

        public a(View view)
        {
            super(view);
            a = (CardView)view;
            b = (ImageView)view.findViewById(0x7f100107);
            c = (TextView)view.findViewById(0x7f10007b);
        }
    }


    private final WeakReference a;
    private final Context b;
    private LayoutInflater c;
    private final List d = new ArrayList();
    private com.cardinalblue.android.piccollage.controller.n.b e;

    public t(Context context, com.cardinalblue.android.piccollage.controller.n.a a1)
    {
        b = context;
        c = LayoutInflater.from(context);
        a = new WeakReference(a1);
    }

    private Context a()
    {
        return b;
    }

    static com.cardinalblue.android.piccollage.controller.n.b a(t t1)
    {
        return t1.e;
    }

    private CBYoutubeData a(int i)
    {
        return (CBYoutubeData)d.get(i);
    }

    public void a(com.cardinalblue.android.piccollage.controller.n.b b1)
    {
        e = b1;
    }

    public void a(List list)
    {
        d.addAll(list);
        notifyDataSetChanged();
    }

    public void b(List list)
    {
        d.clear();
        d.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount()
    {
        return d.size();
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        CBYoutubeData cbyoutubedata = a(i);
        viewholder.itemView.setOnClickListener(new android.view.View.OnClickListener(cbyoutubedata) {

            final CBYoutubeData a;
            final t b;

            public void onClick(View view)
            {
                t.a(b).a(a);
            }

            
            {
                b = t.this;
                a = cbyoutubedata;
                super();
            }
        });
        ((a)viewholder).a(a(), cbyoutubedata, (com.cardinalblue.android.piccollage.controller.n.a)a.get());
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new a(LayoutInflater.from(a()).inflate(0x7f03013d, viewgroup, false));
    }
}
