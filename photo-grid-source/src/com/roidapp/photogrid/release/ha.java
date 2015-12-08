// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge, gy, rf, hb

final class ha extends BaseAdapter
{

    gy a;
    final ge b;

    public ha(ge ge1)
    {
        b = ge1;
        super();
    }

    public final int getCount()
    {
        return ge.n(b).length;
    }

    public final Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        LayoutInflater layoutinflater = LayoutInflater.from(ge.f(b));
        viewgroup = view;
        if (view == null)
        {
            viewgroup = layoutinflater.inflate(0x7f0300a3, null);
        }
        if (viewgroup.getTag() != null)
        {
            a = (gy)viewgroup.getTag();
        } else
        {
            a = new gy();
            a.a = (ImageView)viewgroup.findViewById(0x7f0d027c);
            a.c = (TextView)viewgroup.findViewById(0x7f0d027e);
            a.b = (ImageView)viewgroup.findViewById(0x7f0d027d);
        }
        h.a(b).a(ge.n(b)[i]).g().a(e.c).h().a(a.a);
        a.c.setText(rf.a(ge.o(b)[i]));
        view = ge.i(b)[i].substring(0, ge.i(b)[i].indexOf("."));
        if (ge.b(b, view))
        {
            int j = (int)TypedValue.applyDimension(1, 5F, b.getResources().getDisplayMetrics());
            a.b.setImageResource(0x7f02037b);
            a.b.setPadding(j, j, j, j);
            a.b.setBackgroundResource(0x7f0200ea);
            a.c.setVisibility(8);
            a.b.setOnClickListener(new hb(this, i));
        } else
        {
            a.b.setImageResource(0x7f020395);
            a.b.setPadding(0, 0, 0, 0);
            a.b.setBackgroundResource(0x7f0c0026);
            a.c.setVisibility(0);
            a.b.setClickable(false);
        }
        viewgroup.setTag(a);
        return viewgroup;
    }
}
