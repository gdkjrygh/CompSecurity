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
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ih, ce, cf

public final class cd extends Fragment
{

    private PhotoGridActivity a;
    private int b;
    private Integer c;
    private boolean d;
    private boolean e;
    private int f;
    private HorizontalScrollView g;
    private int h;
    private int i;

    public cd()
    {
        b = 2;
        d = true;
        e = true;
        f = 0;
    }

    static PhotoGridActivity a(cd cd1)
    {
        return cd1.a;
    }

    static Integer a(cd cd1, Integer integer)
    {
        cd1.c = integer;
        return integer;
    }

    static int b(cd cd1)
    {
        return cd1.b;
    }

    static boolean c(cd cd1)
    {
        return cd1.d;
    }

    static boolean d(cd cd1)
    {
        return cd1.e;
    }

    static int e(cd cd1)
    {
        return cd1.f;
    }

    static HorizontalScrollView f(cd cd1)
    {
        return cd1.g;
    }

    static int g(cd cd1)
    {
        return cd1.i;
    }

    static int h(cd cd1)
    {
        return cd1.h;
    }

    static Integer i(cd cd1)
    {
        return cd1.c;
    }

    public final int a()
    {
        return f;
    }

    public final void a(boolean flag, boolean flag1, int j)
    {
        d = flag;
        e = flag1;
        f = j;
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300a9, null);
        b = ih.C().aw();
        if (b != 0) goto _L2; else goto _L1
_L1:
        az.q;
        JVM INSTR tableswitch 1 6: default 68
    //                   1 271
    //                   2 68
    //                   3 68
    //                   4 271
    //                   5 68
    //                   6 271;
           goto _L2 _L3 _L2 _L2 _L3 _L2 _L3
_L2:
        g = (HorizontalScrollView)viewgroup.findViewById(0x7f0d0287);
        bundle = (ViewGroup)viewgroup.findViewById(0x7f0d0289);
        h = (int)getResources().getDimension(0x7f0900d1);
        i = getResources().getDisplayMetrics().widthPixels;
        viewgroup.findViewById(0x7f0d0286).setOnClickListener(new ce(this));
        int ai[] = p.a().g[b];
        for (int j = 0; j < ai.length; j++)
        {
            int k = ai[j];
            View view = layoutinflater.inflate(0x7f030128, null);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(h, h));
            view.setId(k);
            ((ImageView)view.findViewById(0x7f0d0494)).setImageDrawable(a.getResources().getDrawable(k));
            view.setTag(Integer.valueOf(j));
            view.setOnClickListener(new cf(this, bundle, view, k));
            bundle.addView(view);
        }

        break; /* Loop/switch isn't completed */
_L3:
        b = 2;
        if (true) goto _L2; else goto _L4
_L4:
        return viewgroup;
    }
}
