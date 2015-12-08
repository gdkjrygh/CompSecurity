// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.n;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            l, t

abstract class w extends l
{

    protected int a;
    protected int b;
    protected String c;
    protected int g;
    protected int h;
    protected int i;

    public w(Context context, int j, t t)
    {
        super(context, j, t);
    }

    public View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        if (f || layoutinflater == null)
        {
            return null;
        }
        if (view != null && !(view.getTag() instanceof w))
        {
            view = null;
        }
        if (view == null)
        {
            view = layoutinflater.inflate(0x7f030014, viewgroup, false);
        }
        if (view == null)
        {
            return null;
        }
        layoutinflater = (ImageView)view.findViewById(0x7f0d0080);
        viewgroup = (TextView)view.findViewById(0x7f0d007f);
        TextView textview = (TextView)view.findViewById(0x7f0d0081);
        TextView textview1 = (TextView)view.findViewById(0x7f0d0082);
        View view1 = view.findViewById(0x7f0d0083);
        TextView textview2 = (TextView)view.findViewById(0x7f0d0084);
        if (d() == 7)
        {
            view1.setVisibility(0);
            textview2.setVisibility(0);
        } else
        {
            view1.setVisibility(8);
            textview2.setVisibility(8);
        }
        if (view != null)
        {
            n.a(layoutinflater, a);
            if (viewgroup != null)
            {
                if (c == null)
                {
                    viewgroup.setText(b);
                } else
                {
                    viewgroup.setText(c);
                }
            }
            if (textview != null)
            {
                textview.setText(g);
            }
            if (textview1 != null)
            {
                textview1.setText(h);
                textview1.setOnClickListener(this);
            }
            if (textview2 != null && textview2.getVisibility() == 0)
            {
                textview2.setText(i);
                textview2.setOnClickListener(this);
            }
            if (d() == 7)
            {
                view.setBackgroundResource(0x7f0200a8);
                view.setClickable(true);
                view.setOnClickListener(null);
            } else
            {
                view.setOnClickListener(this);
            }
        }
        view.setTag(this);
        return view;
    }
}
