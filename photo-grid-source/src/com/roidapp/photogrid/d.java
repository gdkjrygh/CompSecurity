// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.baselib.b.a;
import com.roidapp.cloudlib.sns.b.u;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid:
//            a, e

final class d extends PagerAdapter
{

    final com.roidapp.photogrid.a a;
    private List b;

    private d(com.roidapp.photogrid.a a1)
    {
        a = a1;
        super();
    }

    d(com.roidapp.photogrid.a a1, byte byte0)
    {
        this(a1);
    }

    static List a(d d1)
    {
        return d1.b;
    }

    public final void a(List list)
    {
        b = list;
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final int getCount()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return Math.min(b.size(), 5);
        }
    }

    public final int getItemPosition(Object obj)
    {
        return -2;
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = com.roidapp.photogrid.a.k(a).inflate(0x7f030099, null);
        ImageView imageview = (ImageView)view.findViewById(0x7f0d026e);
        Object obj = (android.widget.LinearLayout.LayoutParams)imageview.getLayoutParams();
        obj.width = com.roidapp.photogrid.a.l(a);
        obj.height = com.roidapp.photogrid.a.m(a);
        imageview.setOnClickListener(new e(this, i));
        obj = (u)b.get(i);
        h.a(com.roidapp.photogrid.a.j(a)).a(((u) (obj)).b).b(com.roidapp.baselib.b.a.b()).g().b(com.roidapp.photogrid.a.h(a), com.roidapp.photogrid.a.i(a)).a(imageview);
        viewgroup.addView(view, 0);
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
