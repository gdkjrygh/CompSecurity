// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.support.v4.app.ac;
import android.view.View;
import android.widget.RelativeLayout;
import com.brightcove.player.event.Event;
import com.brightcove.player.model.Video;
import com.jcp.adapters.ProductListAdapter;
import com.jcp.e.q;
import com.jcp.h.m;
import com.jcp.util.au;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            el

class eo
    implements q
{

    final el a;

    eo(el el1)
    {
        a = el1;
        super();
    }

    public void a(int i, Event event)
    {
        event.preventDefault();
        event.stopPropagation();
    }

    public void a(Event event)
    {
        int i = ((Integer)event.properties.get("playheadPosition")).intValue();
        el.a(a, i, "3");
        el.e(a);
        event.stopPropagation();
        event.preventDefault();
    }

    public void a(Video video, int i, Event event)
    {
        el.c(a);
        View view = ProductListAdapter.b();
        StringBuilder stringbuilder = (new StringBuilder()).append("relative_loader");
        el.c(a);
        ((RelativeLayout)view.findViewWithTag(stringbuilder.append(ProductListAdapter.a()).toString())).setVisibility(8);
        if (el.d(a) == null)
        {
            el.a(a, m.a(el.c(a).e(), ((Integer)event.properties.get("duration")).intValue(), video.getStringProperty("name")));
        }
        video = "2";
        if (el.c(a).d())
        {
            video = "0";
            el.c(a).c(false);
        }
        el.a(a, i, video);
    }

    public void a(String s)
    {
        au.a(a.i(), a.i().getResources().getString(0x7f070467));
        el.e(a);
    }

    public void b(int i, Event event)
    {
    }

    public void c(int i, Event event)
    {
        el.a(a, i, "1");
    }
}
