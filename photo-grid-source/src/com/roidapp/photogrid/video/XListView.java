// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.video:
//            cd, ce

public class XListView extends ListView
    implements android.widget.AbsListView.OnScrollListener
{

    private RotateAnimation a;
    private RotateAnimation b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private ce i;
    private LinearLayout j;
    private LayoutInflater k;
    private TextView l;
    private TextView m;
    private ProgressBar n;
    private ImageView o;
    private boolean p;
    private LinearLayout q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private ProgressBar v;

    public XListView(Context context)
    {
        super(context);
        f = true;
        h = 10;
        p = false;
        a(context);
    }

    public XListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = true;
        h = 10;
        p = false;
        a(context);
    }

    public XListView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        f = true;
        h = 10;
        p = false;
        a(context);
    }

    static ce a(XListView xlistview)
    {
        return xlistview.i;
    }

    private void a(Context context)
    {
        a = new RotateAnimation(0.0F, -180F, 1, 0.5F, 1, 0.5F);
        a.setInterpolator(new LinearInterpolator());
        a.setDuration(100L);
        a.setFillAfter(true);
        b = new RotateAnimation(-180F, 0.0F, 1, 0.5F, 1, 0.5F);
        b.setInterpolator(new LinearInterpolator());
        b.setDuration(100L);
        b.setFillAfter(true);
        k = LayoutInflater.from(context);
        j = (LinearLayout)k.inflate(0x7f03013e, null);
        l = (TextView)j.findViewById(0x7f0d04ff);
        m = (TextView)j.findViewById(0x7f0d0500);
        o = (ImageView)j.findViewById(0x7f0d0501);
        n = (ProgressBar)j.findViewById(0x7f0d04fe);
        q = (LinearLayout)k.inflate(0x7f03013d, null);
        s = (TextView)q.findViewById(0x7f0d04f8);
        v = (ProgressBar)q.findViewById(0x7f0d04fc);
        u = (TextView)q.findViewById(0x7f0d04fa);
        r = (TextView)q.findViewById(0x7f0d04f9);
        t = (TextView)q.findViewById(0x7f0d04fb);
        t.setOnClickListener(new cd(this));
        addFooterView(q, null, false);
        setOnScrollListener(this);
    }

    public final void a()
    {
        g = true;
        v.setVisibility(8);
        u.setVisibility(8);
        r.setVisibility(8);
        t.setVisibility(0);
    }

    public final void a(ce ce1)
    {
        i = ce1;
    }

    public final void a(boolean flag)
    {
        int i1 = getFooterViewsCount();
        if (flag && i1 > 0)
        {
            removeFooterView(q);
        } else
        if (i1 == 0 && !flag)
        {
            addFooterView(q, null, false);
            return;
        }
    }

    public final void b()
    {
        g = false;
    }

    public final void b(boolean flag)
    {
        Log.e("Xlist", (new StringBuilder("setResultSize ")).append(flag).toString());
        if (flag)
        {
            g = false;
            v.setVisibility(0);
            u.setVisibility(0);
            r.setVisibility(8);
            t.setVisibility(8);
            return;
        } else
        {
            g = true;
            v.setVisibility(8);
            u.setVisibility(8);
            r.setVisibility(0);
            t.setVisibility(8);
            return;
        }
    }

    public final void c()
    {
        e = false;
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        c = i1;
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        d = i1;
        if (!f || i1 != 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (!e && abslistview.getLastVisiblePosition() == abslistview.getPositionForView(q) && !g)
        {
            if (i != null)
            {
                i.a();
            }
            e = true;
        }
        return;
        abslistview;
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        super.setAdapter(listadapter);
    }
}
