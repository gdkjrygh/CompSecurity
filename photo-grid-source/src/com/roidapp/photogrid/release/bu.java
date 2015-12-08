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
import com.roidapp.baselib.c.p;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, bv, bw, bx

public final class bu extends Fragment
{

    private PhotoGridActivity a;
    private boolean b;
    private boolean c;
    private int d;
    private Integer e;
    private HorizontalScrollView f;
    private int g;
    private int h;

    public bu()
    {
        b = true;
        c = true;
    }

    static PhotoGridActivity a(bu bu1)
    {
        return bu1.a;
    }

    static Integer a(bu bu1, Integer integer)
    {
        bu1.e = integer;
        return integer;
    }

    static boolean b(bu bu1)
    {
        return bu1.b;
    }

    static boolean c(bu bu1)
    {
        return bu1.c;
    }

    static int d(bu bu1)
    {
        return bu1.d;
    }

    static HorizontalScrollView e(bu bu1)
    {
        return bu1.f;
    }

    static int f(bu bu1)
    {
        return bu1.h;
    }

    static int g(bu bu1)
    {
        return bu1.g;
    }

    static Integer h(bu bu1)
    {
        return bu1.e;
    }

    public final void a(boolean flag, boolean flag1, int i)
    {
        b = flag;
        c = flag1;
        d = i;
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300a7, null);
        viewgroup.setOnClickListener(new bv(this));
        viewgroup.findViewById(0x7f0d0285).setOnClickListener(new bw(this));
        f = (HorizontalScrollView)viewgroup.findViewById(0x7f0d0287);
        bundle = (ViewGroup)viewgroup.findViewById(0x7f0d0288);
        g = (int)getResources().getDimension(0x7f0900d1);
        h = getResources().getDisplayMetrics().widthPixels;
        int ai[] = p.a().i;
        for (int i = 0; i < ai.length; i++)
        {
            int j = ai[i];
            int k = i + 10000;
            View view = layoutinflater.inflate(0x7f030129, null);
            ImageView imageview = (ImageView)view.findViewById(0x7f0d0494);
            ImageView imageview1 = (ImageView)view.findViewById(0x7f0d0493);
            view.setId(k);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(g / 2, g));
            imageview1.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(g / 2, g));
            imageview.setBackgroundColor(j);
            view.setTag(Integer.valueOf(i));
            view.setOnClickListener(new bx(this, bundle, view, k, j));
            bundle.addView(view);
        }

        return viewgroup;
    }
}
