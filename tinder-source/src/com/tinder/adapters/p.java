// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.res.Resources;
import android.support.v4.view.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.managers.i;
import com.tinder.model.Match;
import com.tinder.model.TinderLocation;
import com.tinder.utils.ad;
import com.tinder.views.RoundImageView;
import com.tinder.views.RoundedRelativeLayout;
import java.util.List;
import java.util.Set;

public final class p extends t
{

    i a;
    private List b;

    public final void destroyItem(ViewGroup viewgroup, int j, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final int getCount()
    {
        return b.size();
    }

    public final int getItemPosition(Object obj)
    {
        return -2;
    }

    public final Object instantiateItem(ViewGroup viewgroup, int j)
    {
        TinderLocation tinderlocation = (TinderLocation)b.get(j);
        View view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300b4, viewgroup, false);
        Object obj = new android.widget.FrameLayout.LayoutParams((int)ad.a(0.87F), -1, 17);
        ((RoundedRelativeLayout)view.findViewById(0x7f0e0358)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        viewgroup.addView(view);
        obj = new android.widget.RelativeLayout.LayoutParams(-1, (int)ad.b(0.35F));
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
        ((ImageView)view.findViewById(0x7f0e035a)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        view.findViewById(0x7f0e0363);
        obj = (RoundImageView)view.findViewById(0x7f0e035e);
        RoundImageView roundimageview = (RoundImageView)view.findViewById(0x7f0e035f);
        RoundImageView roundimageview1 = (RoundImageView)view.findViewById(0x7f0e0360);
        RoundImageView roundimageview2 = (RoundImageView)view.findViewById(0x7f0e0361);
        RoundImageView roundimageview3 = (RoundImageView)view.findViewById(0x7f0e0362);
        Match amatch[] = (Match[])a.b().toArray(new Match[a.j()]);
        if (amatch.length > 4)
        {
            j = viewgroup.getResources().getDimensionPixelSize(0x7f090084);
            Picasso.a(viewgroup.getContext()).a(amatch[0].getThumbnailUrl()).b(j, j).b().a(((com.squareup.picasso.x) (obj)));
            Picasso.a(viewgroup.getContext()).a(amatch[1].getThumbnailUrl()).b(j, j).b().a(roundimageview);
            Picasso.a(viewgroup.getContext()).a(amatch[2].getThumbnailUrl()).b(j, j).b().a(roundimageview1);
            Picasso.a(viewgroup.getContext()).a(amatch[3].getThumbnailUrl()).b(j, j).b().a(roundimageview2);
            Picasso.a(viewgroup.getContext()).a(amatch[4].getThumbnailUrl()).b(j, j).b().a(roundimageview3);
        }
        view.findViewById(0x7f0e0365);
        view.findViewById(0x7f0e0366);
        obj = (Button)view.findViewById(0x7f0e035b);
        ((Button) (obj)).setText(viewgroup.getResources().getString(0x7f0600d0, new Object[] {
            tinderlocation.getCity()
        }));
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener(tinderlocation) {

            final TinderLocation a;
            final p b;

            public final void onClick(View view1)
            {
            }

            
            {
                b = p.this;
                a = tinderlocation;
                super();
            }
        });
        view.setClickable(true);
        view.setOnClickListener(new android.view.View.OnClickListener(tinderlocation) {

            final TinderLocation a;
            final p b;

            public final void onClick(View view1)
            {
            }

            
            {
                b = p.this;
                a = tinderlocation;
                super();
            }
        });
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public final void setPrimaryItem(ViewGroup viewgroup, int j, Object obj)
    {
        super.setPrimaryItem(viewgroup, j, obj);
    }
}
