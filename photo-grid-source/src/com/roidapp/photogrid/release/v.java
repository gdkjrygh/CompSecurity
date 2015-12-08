// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            z, r, GridImageView, b, 
//            w

final class v extends BaseAdapter
{

    z a;
    ArrayList b;
    final r c;

    public v(r r1, ArrayList arraylist)
    {
        c = r1;
        super();
        b = arraylist;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = false;
        if (view != null)
        {
            a = (z)view.getTag();
        } else
        {
            view = LayoutInflater.from(r.a(c)).inflate(0x7f03008c, viewgroup, false);
            a = new z();
            a.a = (GridImageView)view.findViewById(0x7f0d021a);
            a.b = (ImageView)view.findViewById(0x7f0d021b);
            if (r.d(c))
            {
                a.b.setImageResource(0x7f02036d);
                a.b.setVisibility(0);
            } else
            {
                a.b.setImageResource(0x7f020377);
            }
            viewgroup = (android.widget.FrameLayout.LayoutParams)a.a.getLayoutParams();
            viewgroup.width = r.e(c);
            viewgroup.height = r.f(c);
            a.a.setLayoutParams(viewgroup);
            a.a.a(r.e(c), r.f(c));
            a.a.a(1);
            view.setTag(a);
        }
        if (b == null || b.size() == 0 || i >= b.size())
        {
            return view;
        }
        viewgroup = (b)b.get(i);
        c.a(i, a.a);
        if (!r.d(c) && b != null && b.size() > 0)
        {
            ImageView imageview = a.b;
            if (((b) (viewgroup)).b)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
        }
        view.setOnClickListener(new w(this, viewgroup));
        return view;
    }
}
