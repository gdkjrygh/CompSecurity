// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tinder.sunset:
//            SunsetMoment

public final class a extends BaseAdapter
{

    List a;
    private int b;
    private android.view.View.OnClickListener c;

    public a(android.view.View.OnClickListener onclicklistener)
    {
        c = onclicklistener;
        a = new ArrayList(0);
        onclicklistener = ManagerApp.c().getResources();
        b = (int)(((float)ad.c() - 2.0F * onclicklistener.getDimension(0x7f090159) - onclicklistener.getDimension(0x7f090111) * 3F) / 3F);
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030024, viewgroup, false);
            view.setClickable(true);
            view.setOnClickListener(c);
        }
        view.setTag(a.get(i));
        Picasso.a(viewgroup.getContext()).a(((SunsetMoment)a.get(i)).d).b(b, b).b().a((x)view);
        return view;
    }
}
