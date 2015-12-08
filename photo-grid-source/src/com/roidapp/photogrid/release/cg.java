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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ng, ch, ih, 
//            ci, cj

public final class cg extends Fragment
{

    private PhotoGridActivity a;
    private SeekBar b;
    private int c;
    private ImageView d;
    private ng e;
    private boolean f;
    private int g;

    public cg()
    {
        b = null;
        e = null;
        f = true;
    }

    static int a(cg cg1, int i)
    {
        cg1.g = i;
        return i;
    }

    static ng a(cg cg1)
    {
        return cg1.e;
    }

    static boolean a(cg cg1, boolean flag)
    {
        cg1.f = flag;
        return flag;
    }

    static int b(cg cg1)
    {
        return cg1.g;
    }

    static ImageView c(cg cg1)
    {
        return cg1.d;
    }

    static PhotoGridActivity d(cg cg1)
    {
        return cg1.a;
    }

    static boolean e(cg cg1)
    {
        return cg1.f;
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        if (a.b instanceof ng)
        {
            e = (ng)a.b;
        } else
        {
            e = null;
        }
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300aa, null);
        viewgroup = (RelativeLayout)layoutinflater.findViewById(0x7f0d028c);
        if (viewgroup != null)
        {
            viewgroup.setOnClickListener(new ch(this));
        }
        if (e == null)
        {
            c = ih.C().bd();
        } else
        {
            c = (ih.C().ag() - 5) * 5;
        }
        d = (ImageView)layoutinflater.findViewById(0x7f0d028b);
        b = (SeekBar)layoutinflater.findViewById(0x7f0d0052);
        b.setMax(100);
        b.setProgress(c);
        g = c;
        b.setOnSeekBarChangeListener(new ci(this));
        if (e == null && !ih.C().be())
        {
            d.setImageResource(0x7f020364);
        } else
        {
            d.setImageResource(0x7f020365);
        }
        ((RelativeLayout)layoutinflater.findViewById(0x7f0d028a)).setOnClickListener(new cj(this));
        return layoutinflater;
    }
}
