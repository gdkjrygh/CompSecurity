// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.support.v4.view.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.tinder.model.InstagramPhoto;
import com.tinder.utils.ad;
import java.util.List;

public final class s extends t
{

    int a;
    int b;
    private Context c;
    private List d;
    private android.view.View.OnClickListener e;

    public s(Context context, List list, android.view.View.OnClickListener onclicklistener)
    {
        c = context;
        d = list;
        a = ad.a(c);
        b = a;
        e = onclicklistener;
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final int getCount()
    {
        if (d != null)
        {
            return d.size();
        } else
        {
            return 0;
        }
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = LayoutInflater.from(c).inflate(0x7f03005c, viewgroup, false);
        Object obj = (InstagramPhoto)d.get(i);
        ImageView imageview = (ImageView)view;
        imageview.setOnClickListener(e);
        Picasso picasso = Picasso.a(c);
        if (((InstagramPhoto) (obj)).mUrlLarge != null)
        {
            obj = ((InstagramPhoto) (obj)).mUrlLarge;
        } else
        {
            obj = ((InstagramPhoto) (obj)).mUrlSmall;
        }
        picasso.a(((String) (obj))).b(a, b).b().a(imageview, null);
        viewgroup.addView(view, 0);
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
