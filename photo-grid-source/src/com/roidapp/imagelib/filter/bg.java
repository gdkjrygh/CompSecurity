// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.roidapp.baselib.hlistview.AdapterView;
import com.roidapp.baselib.hlistview.HListView;
import com.roidapp.baselib.hlistview.s;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter:
//            bh, ax, be, ad

public class bg extends RelativeLayout
    implements android.widget.SeekBar.OnSeekBarChangeListener, s
{

    private final String a = com/roidapp/imagelib/filter/bg.getSimpleName();
    private final HListView b;
    private final ad c;
    private final SeekBar d;
    private final View e;
    private int f;
    private boolean g;
    private be h;

    public bg(Context context, ad ad1)
    {
        super(context);
        f = 100;
        g = false;
        c = ad1;
        Object obj = new RelativeLayout(context);
        addView(((View) (obj)), new android.widget.RelativeLayout.LayoutParams(-1, -2));
        e = LayoutInflater.from(context).inflate(h.m, this, false);
        e.setVisibility(8);
        d = (SeekBar)e.findViewById(g.C);
        d.setProgress(f);
        d.setOnSeekBarChangeListener(this);
        ((RelativeLayout) (obj)).addView(e);
        ad1 = new RelativeLayout(context);
        ad1.setId(4097);
        ad1.setBackgroundResource(f.d);
        int i = (int)getResources().getDimension(e.h);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, i);
        layoutparams.addRule(3, e.getId());
        ((RelativeLayout) (obj)).addView(ad1, layoutparams);
        obj = new ImageView(context);
        ((ImageView) (obj)).setImageResource(f.a);
        ((ImageView) (obj)).setBackgroundResource(f.b);
        ((ImageView) (obj)).setId(g.g);
        ((ImageView) (obj)).setOnClickListener(new bh(this));
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, i);
        layoutparams.addRule(9);
        ad1.addView(((View) (obj)), layoutparams);
        b = new HListView(context);
        context = new android.widget.RelativeLayout.LayoutParams(-1, i);
        context.addRule(1, g.g);
        ad1.addView(b, context);
        b.a(f.bp);
        b.a(this);
    }

    static ad a(bg bg1)
    {
        return bg1.c;
    }

    public final int a()
    {
        return f;
    }

    public final void a(AdapterView adapterview, View view, int i)
    {
        ax ax1 = (ax)b.z();
        int j = ax1.b;
        adapterview = (IFilterInfo)adapterview.j(i);
        if (j == adapterview.c())
        {
            return;
        }
        View view1;
        if (adapterview.a() == 0)
        {
            e.setVisibility(8);
        } else
        {
            if (!e.isShown())
            {
                e.setVisibility(0);
            }
            f = 100;
            d.setProgress(f);
        }
        view1 = b.findViewWithTag(Integer.valueOf(j));
        if (view1 != null)
        {
            ((View)view1.getParent()).findViewById(g.l).setBackgroundColor(0);
        }
        ax1.b = adapterview.c();
        view.findViewById(g.l).setBackgroundColor(getResources().getColor(d.b));
        view = ax1.a();
        view.a(adapterview);
        if (h != null)
        {
            h.a(view);
        }
        if (c != null)
        {
            c.f();
        }
        if (b.t() + 1 == i || b.t() == i)
        {
            b.c(i - 1);
            return;
        } else
        {
            b.c(i + 1);
            return;
        }
    }

    public final void a(be be1)
    {
        h = be1;
    }

    public final void a(IGroupInfo igroupinfo, int i)
    {
        ax ax1;
        IFilterInfo ifilterinfo;
        int j;
        int k;
        if (c == null)
        {
            return;
        }
        e.setVisibility(8);
        b.setVisibility(0);
        ax1 = c.a(igroupinfo, getContext());
        ifilterinfo = igroupinfo.a();
        if (ifilterinfo == null || igroupinfo.d() == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        igroupinfo = igroupinfo.d();
        k = igroupinfo.size();
        j = 0;
_L3:
        IFilterInfo ifilterinfo1;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        ifilterinfo1 = (IFilterInfo)igroupinfo.get(j);
        if (ifilterinfo1.c() != ifilterinfo.c()) goto _L2; else goto _L1
_L1:
        ax1.b = ifilterinfo1.c();
        if (ifilterinfo.a() != 0)
        {
            e.setVisibility(0);
            d.setProgress(i);
            i = j;
        } else
        {
            i = j;
        }
_L4:
        b.a(ax1);
        b.i(i);
        return;
_L2:
        j++;
          goto _L3
        i = 0;
          goto _L4
    }

    public final void a(boolean flag)
    {
        g = flag;
    }

    public final IGroupInfo b()
    {
        ax ax1 = (ax)b.z();
        if (ax1 == null)
        {
            return null;
        } else
        {
            return ax1.a();
        }
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        f = i;
        if (!g && c != null)
        {
            c.g();
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        if (c != null && g)
        {
            c.g();
        }
    }
}
