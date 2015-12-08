// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.roidapp.baselib.c.n;
import com.roidapp.imagelib.filter.FilterListView;
import com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ng, ih, ek

public final class ej extends Fragment
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    private PhotoGridActivity a;
    private SeekBar b;
    private RelativeLayout c;
    private ng d;
    private int e;
    private IGroupInfo f;
    private FilterListView g;

    public ej()
    {
        d = null;
        e = 100;
        f = null;
    }

    static SeekBar a(ej ej1)
    {
        return ej1.b;
    }

    static int b(ej ej1)
    {
        ej1.e = 100;
        return 100;
    }

    static int c(ej ej1)
    {
        return ej1.e;
    }

    static ng d(ej ej1)
    {
        return ej1.d;
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        if (a.b instanceof ng)
        {
            d = (ng)a.b;
        } else
        {
            d = null;
        }
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300c3, null);
        c = (RelativeLayout)viewgroup.findViewById(0x7f0d031f);
        b = (SeekBar)viewgroup.findViewById(0x7f0d031e);
        b.setOnSeekBarChangeListener(this);
        g = new FilterListView(getActivity(), "");
        c.addView(g);
        b.setVisibility(8);
        f = ih.C().ad();
        e = ih.C().ae();
        if (f != null && f.g())
        {
            layoutinflater = (CloudGroupInfo)f;
            if (!n.a(getActivity(), ((CloudGroupInfo) (layoutinflater)).c))
            {
                f = null;
            }
        }
        if (f != null)
        {
            layoutinflater = f.a();
            f.a(layoutinflater);
        } else
        {
            e = 100;
            ih.C().l(100);
            layoutinflater = null;
        }
        ih.C().a(f);
        ih.C().a(layoutinflater);
        g.a(new ek(this));
        if (f != null && layoutinflater != null)
        {
            g.a(f, layoutinflater);
        }
        return viewgroup;
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (d != null && e != i)
        {
            d.i(i);
        }
        e = i;
    }

    public final void onResume()
    {
        super.onResume();
        g.c();
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        if (d != null)
        {
            d.i(e);
        }
    }
}
