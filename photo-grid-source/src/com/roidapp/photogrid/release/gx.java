// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.roidapp.baselib.c.u;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge, rc, PhotoGridActivity, PhotoView, 
//            ra

final class gx extends BaseAdapter
{

    final ge a;

    public gx(ge ge1)
    {
        a = ge1;
        super();
        ge.a(ge1, rc.a(ge.f(ge1)).a());
        ge.k(ge1);
        if (ge.l(ge1).size() < ge.g(ge1).size())
        {
            rc.a(ge.f(ge1)).b(ge.f(ge1));
            ge.a(ge1, rc.a(ge.f(ge1)).a());
            if (ge.f(ge1).O() != null)
            {
                Object obj = ge.f(ge1).O().g();
                if (obj != null && (obj instanceof ra))
                {
                    obj = (ra)obj;
                    ge1 = ge.f(ge1).getSharedPreferences(ge.f(ge1).getPackageName(), 0).edit();
                    ge1.putInt("FREE_TEXT_FONT", ((ra) (obj)).a(Typeface.DEFAULT));
                    ge1.apply();
                }
            }
        }
    }

    public final int getCount()
    {
        return ge.l(a).size();
    }

    public final Object getItem(int i)
    {
        return ge.l(a).get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        LayoutInflater layoutinflater = LayoutInflater.from(ge.f(a));
        viewgroup = view;
        if (view == null)
        {
            viewgroup = layoutinflater.inflate(0x7f0300cb, null);
        }
        view = (TextView)u.a(viewgroup, 0x7f0d0338);
        view.setText(((String)ge.l(a).get(i)).replace("_", " "));
        if (i == ge.m(a))
        {
            view.setTextColor(ge.f(a).getResources().getColor(0x7f0c000a));
        } else
        {
            view.setTextColor(ge.f(a).getResources().getColor(0x7f0c00cf));
        }
        if (ge.g(a).get(Integer.valueOf(i)) != null)
        {
            view.setTypeface((Typeface)ge.g(a).get(Integer.valueOf(i)));
        }
        return viewgroup;
    }
}
