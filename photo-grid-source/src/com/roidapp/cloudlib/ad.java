// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.Activity;
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
import com.roidapp.baselib.b.a;

// Referenced classes of package com.roidapp.cloudlib:
//            as, ag, ar, t

public abstract class ad extends BaseAdapter
{

    protected int a;
    protected LayoutInflater b;
    protected android.widget.AbsListView.LayoutParams c;
    final t d;

    public ad(t t1, Activity activity)
    {
        d = t1;
        super();
        a = 0;
        b = null;
        b = (LayoutInflater)activity.getSystemService("layout_inflater");
        c = new android.widget.AbsListView.LayoutParams(-1, -1);
    }

    public final int a()
    {
        return a;
    }

    public abstract String a(int i);

    public abstract String b(int i);

    public final void c(int i)
    {
        if (i == a)
        {
            return;
        } else
        {
            a = i;
            c = new android.widget.AbsListView.LayoutParams(-1, a);
            notifyDataSetChanged();
            return;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        c c1;
        if (view == null)
        {
            view = b.inflate(as.E, null);
            viewgroup = new ag();
            viewgroup.b = (TextView)view.findViewById(ar.be);
            viewgroup.a = (ImageView)view.findViewById(ar.aY);
            view.setTag(viewgroup);
            view.setLayoutParams(c);
        } else
        {
            viewgroup = (ag)view.getTag();
        }
        if (view.getLayoutParams().height != a)
        {
            view.setLayoutParams(c);
        }
        c1 = h.a(d).a(a(i)).g().a(e.c).b(com.roidapp.baselib.b.a.b());
        if (a > 0)
        {
            c1.b(a, a);
        }
        c1.a(d.a(((ag) (viewgroup)).a));
        return view;
    }
}
