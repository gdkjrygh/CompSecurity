// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.NativeAdFactory;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.model.gson.WebPromotionData;
import com.cardinalblue.android.piccollage.view.a;
import com.cardinalblue.android.piccollage.view.e;
import com.cardinalblue.android.piccollage.view.f;
import java.util.Date;
import java.util.List;

public class d extends android.support.v7.widget.RecyclerView.Adapter
{
    public static interface a
    {

        public abstract void a(View view, int l);

        public abstract void a(WebPromotionData webpromotiondata);
    }


    protected final int a;
    protected final int b;
    protected Context c;
    protected final int d;
    protected String e;
    protected CBCollagesResponse f;
    protected final LayoutInflater g;
    protected android.widget.AbsListView.LayoutParams h;
    protected a i;
    private WebPromotionData j;

    public d(Context context, CBCollagesResponse cbcollagesresponse, int l, int i1)
    {
        h = new android.widget.AbsListView.LayoutParams(-1, -2);
        c = context;
        d = l;
        f = cbcollagesresponse;
        g = LayoutInflater.from(context);
        float f1 = a().getResources().getDimension(0x7f0b0062);
        int j1 = k.c();
        int k1 = k.d();
        a = (int)Math.floor((float)j1 - f1 * (float)(i1 + 1)) / i1;
        if (d == 0x7f03008e)
        {
            l = 0x7f0b00f6;
        } else
        {
            l = 0x7f0b00f5;
        }
        b = Math.round(a().getResources().getDimension(l)) + (k1 * a) / j1;
    }

    static WebPromotionData a(d d1)
    {
        return d1.j;
    }

    private WebPhoto b(int l)
    {
        int i1 = l;
        if (h())
        {
            if (a(l))
            {
                return null;
            }
            i1 = l - 1;
        }
        return (WebPhoto)f.getPhotos().get(i1);
    }

    private boolean h()
    {
        return j != null;
    }

    protected Context a()
    {
        return c;
    }

    public com.cardinalblue.android.piccollage.view.a a(ViewGroup viewgroup, int l)
    {
        l;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 112
    //                   1 32
    //                   2 32
    //                   3 139;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        viewgroup = new e(c, g.inflate(d, viewgroup, false), e, i);
_L5:
        ((com.cardinalblue.android.piccollage.view.a) (viewgroup)).itemView.setLayoutParams(h);
        android.view.ViewGroup.LayoutParams layoutparams = ((com.cardinalblue.android.piccollage.view.a) (viewgroup)).itemView.findViewById(0x7f10016c).getLayoutParams();
        layoutparams.height = b;
        ((com.cardinalblue.android.piccollage.view.a) (viewgroup)).itemView.findViewById(0x7f10016c).setLayoutParams(layoutparams);
        return viewgroup;
_L2:
        return new f(c, g.inflate(0x7f0300df, viewgroup, false), j);
_L3:
        String s = ((com.cardinalblue.android.piccollage.lib.d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().getNativeAdProvider();
        viewgroup = NativeAdFactory.createViewHolder(c, s, g, viewgroup);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(CBCollagesResponse cbcollagesresponse)
    {
        if (cbcollagesresponse == null)
        {
            return;
        } else
        {
            f = cbcollagesresponse;
            f.setDownloadedDate(new Date());
            notifyDataSetChanged();
            return;
        }
    }

    public void a(WebPromotionData webpromotiondata)
    {
        j = webpromotiondata;
    }

    public void a(a a1)
    {
        i = a1;
    }

    public void a(com.cardinalblue.android.piccollage.view.a a1, int l)
    {
        WebPhoto webphoto = b(l);
        int i1 = l;
        if (h())
        {
            i1 = l - 1;
        }
        a1.a(i1, webphoto);
        if (a1 instanceof f)
        {
            a1.itemView.setOnClickListener(new android.view.View.OnClickListener() {

                final d a;

                public void onClick(View view)
                {
                    if (a.i != null)
                    {
                        a.i.a(com.cardinalblue.android.piccollage.view.a.d.a(a));
                    }
                }

            
            {
                a = d.this;
                super();
            }
            });
        }
    }

    public void a(String s)
    {
        e = s;
    }

    public boolean a(int l)
    {
        while (!h() || l != 0) 
        {
            return false;
        }
        return true;
    }

    public CBCollagesResponse b()
    {
        return f;
    }

    public void b(CBCollagesResponse cbcollagesresponse)
    {
        f.addMoreCollage(cbcollagesresponse);
        f.setPromotion(cbcollagesresponse.getPromotion());
        notifyDataSetChanged();
    }

    public String c()
    {
        return f.getNextPageUrl();
    }

    public void c(CBCollagesResponse cbcollagesresponse)
    {
        List list;
        if (cbcollagesresponse != null && cbcollagesresponse.getPhotos() != null)
        {
            if ((list = cbcollagesresponse.getPhotos()) != null && list.size() != 0)
            {
                f = cbcollagesresponse;
                notifyDataSetChanged();
                return;
            }
        }
    }

    public Date d()
    {
        return f.getDownloadedDate();
    }

    public int e()
    {
        return f.getPhotos().size();
    }

    public void f()
    {
        f = new CBCollagesResponse();
    }

    public boolean g()
    {
        return !TextUtils.isEmpty(f.getNextPageUrl());
    }

    public int getItemCount()
    {
        return e();
    }

    public long getItemId(int l)
    {
        return (long)l;
    }

    public int getItemViewType(int l)
    {
        boolean flag = true;
        if (a(l))
        {
            l = 0;
        } else
        {
            WebPhoto webphoto = b(l);
            l = ((flag) ? 1 : 0);
            if (webphoto != null)
            {
                if (webphoto.isAd())
                {
                    return 3;
                }
                l = ((flag) ? 1 : 0);
                if (webphoto.isSquare())
                {
                    return 2;
                }
            }
        }
        return l;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int l)
    {
        a((com.cardinalblue.android.piccollage.view.a)viewholder, l);
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int l)
    {
        return a(viewgroup, l);
    }
}
