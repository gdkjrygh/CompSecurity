// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.androidquery.callback.BitmapAjaxCallback;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.model.gson.WebPromotionData;
import java.util.ArrayList;
import java.util.List;

public class y extends android.support.v7.widget.RecyclerView.Adapter
{
    static class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public void a(Context context, WebPromotionData webpromotiondata)
        {
            android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams layoutparams = (android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams)itemView.getLayoutParams();
            layoutparams.setFullSpan(true);
            itemView.setLayoutParams(layoutparams);
            com.cardinalblue.android.piccollage.a.b.k(webpromotiondata.getPromotionId(), "explore");
            if (!TextUtils.isEmpty(webpromotiondata.getShowEvent()))
            {
                com.cardinalblue.android.piccollage.a.f.a(webpromotiondata.getShowEvent());
            }
            com.bumptech.glide.g.b(context).a(webpromotiondata.getBannerUrl()).a((ImageView)itemView);
        }

        public a(View view)
        {
            super(view);
        }
    }

    public static interface b
    {

        public abstract void a(com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate photoboxtemplate);

        public abstract void a(WebPhoto webphoto);

        public abstract void a(WebPromotionData webpromotiondata);
    }

    static class c extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public void a(com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate photoboxtemplate)
        {
            com.bumptech.glide.g.b(k.a()).a(Uri.parse(photoboxtemplate.getThumbnailUrl())).a((ImageView)itemView.findViewById(0x7f10016d));
        }

        public c(View view)
        {
            super(view);
        }
    }

    static class d extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public void a(WebPhoto webphoto)
        {
            (new com.androidquery.a(itemView.findViewById(0x7f10016d))).a(((BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)(new BitmapAjaxCallback()).a(webphoto.getLargeImageUrl())).b(false)).a(true)).e(0x7f020229).a(com.cardinalblue.android.piccollage.helpers.a.a(0x7f020229)));
        }

        public d(View view)
        {
            super(view);
        }
    }


    protected final int a;
    protected final int b;
    protected Context c;
    protected final LayoutInflater d;
    protected final b e;
    private android.widget.AbsListView.LayoutParams f;
    private List g;
    private PhotoboxTemplateList h;
    private WebPromotionData i;
    private String j;

    public y(Context context, b b1)
    {
        f = new android.widget.AbsListView.LayoutParams(-1, -2);
        g = new ArrayList();
        h = new PhotoboxTemplateList();
        c = context;
        d = LayoutInflater.from(context);
        e = b1;
        float f1 = context.getResources().getDimension(0x7f0b0062);
        int l = k.c();
        int i1 = k.d();
        int j1 = context.getResources().getInteger(0x7f09001f);
        a = (int)Math.floor((float)l - f1 * (float)(j1 + 1)) / j1;
        b = Math.round(context.getResources().getDimension(0x7f0b00f5)) + (i1 * a) / l;
    }

    private WebPhoto a(int l)
    {
        int i1 = l;
        if (c())
        {
            i1 = l - 1;
        }
        return (WebPhoto)g.get(i1 - h.getTemplates().size());
    }

    static WebPromotionData a(y y1)
    {
        return y1.i;
    }

    private com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate b(int l)
    {
        int i1 = l;
        if (c())
        {
            i1 = l - 1;
        }
        return (com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate)h.getTemplates().get(i1);
    }

    private boolean c()
    {
        return i != null;
    }

    public String a()
    {
        return j;
    }

    public void a(CBCollagesResponse cbcollagesresponse)
    {
        g.addAll(cbcollagesresponse.getPhotos());
        j = cbcollagesresponse.getNextPageUrl();
        cbcollagesresponse = cbcollagesresponse.getPromotion();
        if (cbcollagesresponse != null)
        {
            i = cbcollagesresponse;
        }
        notifyDataSetChanged();
    }

    public void a(PhotoboxTemplateList photoboxtemplatelist)
    {
        h = photoboxtemplatelist;
        notifyDataSetChanged();
    }

    public void b(CBCollagesResponse cbcollagesresponse)
    {
        g.clear();
        a(cbcollagesresponse);
    }

    public boolean b()
    {
        return !TextUtils.isEmpty(j);
    }

    public int getItemCount()
    {
        int i1 = h.getTemplates().size() + g.size();
        int l = i1;
        if (c())
        {
            l = i1 + 1;
        }
        return l;
    }

    public int getItemViewType(int l)
    {
        if (c() && l == 0)
        {
            return 1;
        }
        int i1 = l;
        if (c())
        {
            i1 = l - 1;
        }
        return i1 >= h.getTemplates().size() ? 2 : 3;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int l)
    {
        if (viewholder instanceof a)
        {
            ((a)viewholder).a(c, i);
            viewholder.itemView.setOnClickListener(new android.view.View.OnClickListener() {

                final y a;

                public void onClick(View view1)
                {
                    if (a.e != null)
                    {
                        a.e.a(y.a(a));
                    }
                }

            
            {
                a = y.this;
                super();
            }
            });
        } else
        {
            if (viewholder instanceof c)
            {
                com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate photoboxtemplate = b(l);
                android.view.ViewGroup.LayoutParams layoutparams = viewholder.itemView.findViewById(0x7f10016c).getLayoutParams();
                layoutparams.height = b;
                viewholder.itemView.findViewById(0x7f10016c).setLayoutParams(layoutparams);
                ((c)viewholder).a(photoboxtemplate);
                viewholder.itemView.setOnClickListener(new android.view.View.OnClickListener(photoboxtemplate) {

                    final com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate a;
                    final y b;

                    public void onClick(View view1)
                    {
                        if (b.e != null)
                        {
                            b.e.a(a);
                        }
                    }

            
            {
                b = y.this;
                a = photoboxtemplate;
                super();
            }
                });
                return;
            }
            if (viewholder instanceof d)
            {
                WebPhoto webphoto = a(l);
                View view = viewholder.itemView;
                view.setLayoutParams(f);
                android.view.ViewGroup.LayoutParams layoutparams1 = view.findViewById(0x7f10016d).getLayoutParams();
                if (webphoto.isSquare())
                {
                    l = a;
                } else
                {
                    l = b;
                }
                layoutparams1.height = l;
                view.findViewById(0x7f10016c).setLayoutParams(layoutparams1);
                ((d)viewholder).a(webphoto);
                viewholder.itemView.setOnClickListener(new android.view.View.OnClickListener(webphoto) {

                    final WebPhoto a;
                    final y b;

                    public void onClick(View view1)
                    {
                        if (b.e != null)
                        {
                            b.e.a(a);
                        }
                    }

            
            {
                b = y.this;
                a = webphoto;
                super();
            }
                });
                return;
            }
        }
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int l)
    {
        switch (l)
        {
        case 2: // '\002'
        default:
            return new d(d.inflate(0x7f03008f, viewgroup, false));

        case 1: // '\001'
            return new a(d.inflate(0x7f0300df, viewgroup, false));

        case 3: // '\003'
            return new c(d.inflate(0x7f0300e5, viewgroup, false));
        }
    }
}
