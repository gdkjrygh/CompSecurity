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
import com.squareup.picasso.s;
import java.util.List;

public final class u extends t
{

    public List a;
    public android.view.View.OnClickListener b;
    public boolean c;
    private Context d;
    private int e;

    public u(Context context)
    {
        e = 6;
        d = context;
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final int getCount()
    {
        if (a == null)
        {
            return 0;
        }
        if (a.size() <= e)
        {
            return a.size();
        } else
        {
            return e;
        }
    }

    public final int getItemPosition(Object obj)
    {
        return !c ? -1 : -2;
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        String s1 = (String)a.get(i);
        View view = LayoutInflater.from(d).inflate(0x7f0300b6, viewgroup, false);
        ImageView imageview = (ImageView)view.findViewById(0x7f0e0368);
        viewgroup.addView(view);
        Picasso.a(d).a(s1).a(imageview, null);
        imageview.setClickable(true);
        imageview.setOnClickListener(new android.view.View.OnClickListener() {

            final u a;

            public final void onClick(View view1)
            {
                if (a.b != null)
                {
                    a.b.onClick(view1);
                }
            }

            
            {
                a = u.this;
                super();
            }
        });
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
