// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.support.v4.app.ac;
import android.support.v4.view.ViewPager;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.brightcove.player.event.Event;
import com.brightcove.player.model.Video;
import com.jcp.adapters.s;
import com.jcp.b.a;
import com.jcp.e.q;
import com.jcp.h.m;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.ae;
import com.jcp.util.ah;
import com.jcp.util.au;
import com.jcp.views.CarouselPageIndicator;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment, cp, cq, cr

class co
    implements q
{

    final ProductDetailFragment a;

    co(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void a(int i, Event event)
    {
        a.W();
        a.mSaveIcon.setVisibility(8);
        a.mCloseVideo.setVisibility(0);
        ProductDetailFragment.b(a, true);
        com.jcp.b.a.a(new cp(this));
        a.mCarouselIndicator.setVisibility(8);
        a.mPager.setOnTouchListener(new cq(this));
    }

    public void a(Event event)
    {
        int i = ((Integer)event.properties.get("playheadPosition")).intValue();
        com.jcp.fragments.ProductDetailFragment.a(a, i, "3");
        if (!ProductDetailFragment.k(a))
        {
            ProductDetailFragment.f(a);
        }
    }

    public void a(Video video, int i, Event event)
    {
        if (ProductDetailFragment.i(a) == null)
        {
            com.jcp.fragments.ProductDetailFragment.a(a, m.a(ProductDetailFragment.j(a).getName(), ((Integer)event.properties.get("duration")).intValue(), video.getStringProperty("name")));
        }
        if (ProductDetailFragment.e(a) != null && ProductDetailFragment.e(a).d())
        {
            com.jcp.fragments.ProductDetailFragment.a(a, i, "0");
            ProductDetailFragment.e(a).a(false);
        }
        com.jcp.fragments.ProductDetailFragment.a(a, i, "2");
    }

    public void a(String s1)
    {
        ae.a(getClass().getName(), s1);
        au.a(a.i(), a.i().getResources().getString(0x7f070467));
        ProductDetailFragment.f(a);
    }

    public void b(int i, Event event)
    {
        ProductDetailFragment.b(a, false);
        com.jcp.b.a.a(null);
        a.mSaveIcon.setVisibility(0);
        a.mCloseVideo.setVisibility(8);
        if (!ah.a(ProductDetailFragment.h(a)))
        {
            a.mCarouselIndicator.setVisibility(0);
        }
        a.mPager.setOnTouchListener(new cr(this));
    }

    public void c(int i, Event event)
    {
        com.jcp.fragments.ProductDetailFragment.a(a, i, "1");
    }
}
