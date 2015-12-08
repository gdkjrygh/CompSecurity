// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.p;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, PhotoView, ra, bz, 
//            ca, cb, ih, cc

public final class by extends Fragment
{

    private PhotoGridActivity a;
    private boolean b;
    private boolean c;
    private int d;
    private boolean e;
    private int f;
    private TextView g;
    private boolean h;
    private HorizontalScrollView i;
    private int j;
    private int k;

    public by()
    {
        b = false;
        c = false;
        d = 0;
    }

    static int a(by by1, int l)
    {
        by1.f = l;
        return l;
    }

    static PhotoGridActivity a(by by1)
    {
        return by1.a;
    }

    static int b(by by1)
    {
        return by1.d;
    }

    static boolean c(by by1)
    {
        by1.e = true;
        return true;
    }

    static TextView d(by by1)
    {
        return by1.g;
    }

    static boolean e(by by1)
    {
        return by1.e;
    }

    static int f(by by1)
    {
        return by1.f;
    }

    static HorizontalScrollView g(by by1)
    {
        return by1.i;
    }

    static int h(by by1)
    {
        return by1.k;
    }

    static int i(by by1)
    {
        return by1.j;
    }

    static boolean j(by by1)
    {
        return by1.b;
    }

    static boolean k(by by1)
    {
        return by1.c;
    }

    public final void a(boolean flag, boolean flag1, int l)
    {
        b = flag;
        c = flag1;
        d = l;
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(0x7f0300a8, null);
        i = (HorizontalScrollView)view.findViewById(0x7f0d0287);
        ViewGroup viewgroup1 = (ViewGroup)view.findViewById(0x7f0d0289);
        j = (int)getResources().getDimension(0x7f0900d1);
        k = getResources().getDisplayMetrics().widthPixels;
        int l;
        if (b)
        {
            viewgroup = layoutinflater.inflate(0x7f030127, null);
            viewgroup.setLayoutParams(new android.view.ViewGroup.LayoutParams(j, j));
            g = (TextView)viewgroup.findViewById(0x7f0d0494);
            if (d == 1)
            {
                bundle = a.O().g();
                if (bundle != null && (bundle instanceof ra))
                {
                    viewgroup.setId(0x7f0203c7);
                    g.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203c7, 0, 0);
                    g.setText(0x7f0701fa);
                }
            } else
            if (ih.C().B() && az.q != 6)
            {
                viewgroup.setId(0x7f020361);
                g.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020361, 0, 0);
                g.setText(0x7f070333);
            } else
            {
                viewgroup.setId(0x7f0203c7);
                g.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203c7, 0, 0);
                g.setText(0x7f0701fa);
            }
            g.setOnClickListener(new bz(this));
            viewgroup1.addView(viewgroup);
        }
        if (az.q == 1 && d != 1)
        {
            viewgroup = layoutinflater.inflate(0x7f030127, null);
            viewgroup.setLayoutParams(new android.view.ViewGroup.LayoutParams(j, j));
            viewgroup.setId(0x7f0201ce);
            viewgroup1.addView(viewgroup);
            viewgroup = viewgroup.findViewById(0x7f0d0494);
            ((TextView)viewgroup).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020358, 0, 0);
            ((TextView)viewgroup).setText(0x7f07003d);
            viewgroup.setOnClickListener(new ca(this));
        }
        if (c)
        {
            l = 0;
        } else
        {
            l = 1;
        }
        while (l < p.a().f.length) 
        {
            int i1 = p.a().f[l];
            if (l == 0)
            {
                viewgroup = layoutinflater.inflate(0x7f030127, null);
                viewgroup.setLayoutParams(new android.view.ViewGroup.LayoutParams(j, j));
                viewgroup.setId(i1);
                bundle = viewgroup.findViewById(0x7f0d0494);
                ((TextView)bundle).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020396, 0, 0);
                ((TextView)bundle).setText(0x7f070174);
            } else
            {
                bundle = layoutinflater.inflate(0x7f030126, null);
                bundle.findViewById(0x7f0d04c6);
                bundle.setLayoutParams(new android.view.ViewGroup.LayoutParams(j, j));
                bundle.setId(i1);
                ImageView imageview = (ImageView)bundle.findViewById(0x7f0d0494);
                try
                {
                    viewgroup = a.getResources().getDrawable(i1);
                }
                // Misplaced declaration of an exception variable
                catch (ViewGroup viewgroup)
                {
                    viewgroup.printStackTrace();
                    viewgroup = null;
                }
                if (viewgroup != null)
                {
                    ((ImageView)imageview).setImageDrawable(viewgroup);
                }
                viewgroup = bundle;
            }
            viewgroup.setTag(Integer.valueOf(l));
            viewgroup.setOnClickListener(new cb(this));
            viewgroup1.addView(viewgroup);
            l++;
        }
        if (h)
        {
            i.postDelayed(new cc(this), 600L);
        }
        return view;
    }
}
