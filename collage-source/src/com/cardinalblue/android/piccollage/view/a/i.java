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
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.request.e;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.FbPhotoListActivity;
import com.cardinalblue.android.piccollage.model.gson.FbPhoto;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import java.util.List;

public class i extends ArrayAdapter
{

    private final j a;
    private String b;
    private LinearLayout c;
    private FbPhotoListActivity d;

    public i(Context context, FbPhotoListActivity fbphotolistactivity, List list)
    {
        super(context, 0, list);
        d = fbphotolistactivity;
        int l = getContext().getResources().getInteger(0x7f090025);
        float f = getContext().getResources().getDimension(0x7f0b009e);
        l = (k.c() - Math.round(f * (float)(l - 1))) / l;
        c = (LinearLayout)LayoutInflater.from(context).inflate(0x7f0300dc, null);
        c.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, l));
        c.setPadding(0, 0, 0, 0);
        c.setGravity(17);
        c.setVisibility(0);
        a = g.b(context);
    }

    private boolean d()
    {
        return super.getCount() >= 25 && !TextUtils.isEmpty(b);
    }

    public void a()
    {
        a.e();
    }

    public void a(String s)
    {
        b = s;
    }

    public boolean a(int l)
    {
        return d() && l == getCount() - 1;
    }

    public void b()
    {
        a.d();
    }

    public void c()
    {
        a.f();
    }

    public void clear()
    {
        b = null;
        super.clear();
    }

    public int getCount()
    {
        if (d())
        {
            return super.getCount() + 1;
        } else
        {
            return super.getCount();
        }
    }

    public View getView(int l, View view, ViewGroup viewgroup)
    {
        if (!a(l))
        {
            if (view == null || !(view instanceof CheckableImageView))
            {
                view = (CheckableImageView)LayoutInflater.from(getContext()).inflate(0x7f0300d9, viewgroup, false);
            } else
            {
                view = (CheckableImageView)view;
            }
            view.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            view.a(false);
            view.setChecked(((FbPhoto)getItem(l)).isSelected());
            viewgroup = ((FbPhoto)getItem(l)).getThumbnailUrl();
            a.a(viewgroup).a(0x7f02021e).a(b.a).a(new e(view) {

                final CheckableImageView a;
                final i b;

                public boolean a(com.bumptech.glide.load.resource.a.b b1, String s, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
                {
                    a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                    return false;
                }

                public volatile boolean a(Exception exception, Object obj, com.bumptech.glide.request.b.j j1, boolean flag)
                {
                    return a(exception, (String)obj, j1, flag);
                }

                public boolean a(Exception exception, String s, com.bumptech.glide.request.b.j j1, boolean flag)
                {
                    return false;
                }

                public volatile boolean a(Object obj, Object obj1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
                {
                    return a((com.bumptech.glide.load.resource.a.b)obj, (String)obj1, j1, flag, flag1);
                }

            
            {
                b = i.this;
                a = checkableimageview;
                super();
            }
            }).a(view);
            return view;
        }
        if (!TextUtils.isEmpty(b))
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l != 0)
        {
            c.setVisibility(0);
            d.a(b);
        } else
        {
            c.setVisibility(8);
        }
        return c;
    }
}
