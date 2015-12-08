// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import com.cardinalblue.android.piccollage.model.gson.ActionableBackground;
import com.cardinalblue.android.piccollage.model.gson.DownloadedBackground;
import com.cardinalblue.android.piccollage.model.gson.IBackground;
import com.cardinalblue.android.piccollage.model.gson.PurchasableBackground;
import com.cardinalblue.android.piccollage.view.CheckableCircleView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class com.cardinalblue.android.piccollage.view.a.c extends android.support.v7.widget.RecyclerView.Adapter
{
    public static class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        private int a;
        private int b;

        public void a(IBackground ibackground, boolean flag)
            throws IOException
        {
            CheckableCircleView checkablecircleview = (CheckableCircleView)itemView;
            checkablecircleview.setChecked(flag);
            com.cardinalblue.android.piccollage.lib.a.e.a(ibackground.getThumbnailPath()).a(checkablecircleview);
        }

        public a(View view, int i, int j)
        {
            super(view);
            a = i;
            b = j;
            ((CheckableCircleView)view).a(a, b);
        }
    }

    public static class b extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        j a;

        public void a(String s)
        {
            CircleImageView circleimageview = (CircleImageView)itemView.findViewById(0x7f100236);
            a.a(s).a(circleimageview);
        }

        public b(View view, j j1)
        {
            super(view);
            a = j1;
        }
    }

    public static interface c
    {

        public abstract void a();

        public abstract void a(PurchasableStickerBundle purchasablestickerbundle);

        public abstract void a(IBackground ibackground);
    }

    public static class d extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        private int a;

        public void a()
        {
            Bitmap bitmap = Bitmap.createBitmap(2, 2, android.graphics.Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(a);
            ((ImageView)itemView.findViewById(0x7f100231)).setImageBitmap(bitmap);
        }

        public d(View view, int i)
        {
            super(view);
            a = i;
        }
    }


    private final Context a;
    private final j b;
    private final List c = new ArrayList();
    private final c d;
    private int e;

    public com.cardinalblue.android.piccollage.view.a.c(Context context, List list, c c1)
    {
        e = -1;
        a = context;
        b = g.b(a);
        c.addAll(list);
        d = c1;
    }

    static c a(com.cardinalblue.android.piccollage.view.a.c c1)
    {
        return c1.d;
    }

    public void a(IBackground ibackground)
    {
        if (c.contains(ibackground))
        {
            e = c.indexOf(ibackground);
        }
    }

    public void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            int j = c.size();
            int i = 0;
            while (i < j) 
            {
                IBackground ibackground = (IBackground)c.get(i);
                if (ibackground != null && s.equals(ibackground.getPath()))
                {
                    e = i;
                }
                i++;
            }
        }
    }

    public void a(List list)
    {
        c.clear();
        c.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount()
    {
        return c.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        IBackground ibackground = (IBackground)c.get(i);
        if (ibackground instanceof ActionableBackground)
        {
            return 100;
        }
        if (ibackground instanceof DownloadedBackground)
        {
            return 300;
        }
        return !(ibackground instanceof PurchasableBackground) ? 400 : 200;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        IBackground ibackground = (IBackground)c.get(i);
        if (!(viewholder instanceof d)) goto _L2; else goto _L1
_L1:
        ((d)viewholder).a();
_L4:
        viewholder.itemView.setOnClickListener(new android.view.View.OnClickListener(ibackground) {

            final IBackground a;
            final com.cardinalblue.android.piccollage.view.a.c b;

            public void onClick(View view)
            {
                if (com.cardinalblue.android.piccollage.view.a.c.a(b) == null)
                {
                    return;
                }
                if (a instanceof ActionableBackground)
                {
                    com.cardinalblue.android.piccollage.view.a.c.a(b).a();
                    return;
                }
                if (a instanceof PurchasableBackground)
                {
                    com.cardinalblue.android.piccollage.view.a.c.a(b).a(((PurchasableBackground)a).getPurchaseInfo());
                    return;
                } else
                {
                    com.cardinalblue.android.piccollage.view.a.c.a(b).a(a);
                    return;
                }
            }

            
            {
                b = com.cardinalblue.android.piccollage.view.a.c.this;
                a = ibackground;
                super();
            }
        });
        return;
_L2:
        if (viewholder instanceof a)
        {
            boolean flag;
            if (i == e)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                ((a)viewholder).a(ibackground, flag);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader from uri [").append(ibackground.getThumbnailPath()).append("]").toString()));
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                k.a(a, 0x7f070203, 0);
            }
            catch (IOException ioexception)
            {
                f.a(ioexception);
            }
        } else
        if (viewholder instanceof b)
        {
            ((b)viewholder).a(ibackground.getThumbnailPath());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        LayoutInflater layoutinflater = LayoutInflater.from(a);
        switch (i)
        {
        default:
            i = a.getResources().getColor(0x7f0f008b);
            int j = a.getResources().getColor(0x7f0f0062);
            return new a(layoutinflater.inflate(0x7f0300f0, viewgroup, false), i, j);

        case 100: // 'd'
            i = a.getResources().getColor(0x7f0f00a6);
            return new d(layoutinflater.inflate(0x7f0300f1, viewgroup, false), i);

        case 200: 
            return new b(layoutinflater.inflate(0x7f0300f7, viewgroup, false), b);
        }
    }
}
