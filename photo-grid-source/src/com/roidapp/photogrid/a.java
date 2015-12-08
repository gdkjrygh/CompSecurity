// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.sns.b.u;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.az;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid:
//            k, b, d, c

public final class a extends RelativeLayout
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private Context a;
    private ViewPager b;
    private d c;
    private LayoutInflater d;
    private LinearLayout e;
    private ImageView f;
    private RelativeLayout g;
    private List h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private c o;
    private k p;
    private boolean q;
    private Handler r;
    private boolean s;

    public a(k k1)
    {
        super(k1.getActivity());
        r = new com.roidapp.photogrid.b(this);
        s = false;
        p = k1;
        a = k1.getActivity();
        k1 = a;
        a = k1;
        d = (LayoutInflater)k1.getSystemService("layout_inflater");
        View view = d.inflate(0x7f030098, this, true);
        m = Math.min(k1.getResources().getDisplayMetrics().widthPixels, 720);
        n = (int)((float)m * 0.3913043F);
        k = k1.getResources().getDisplayMetrics().widthPixels;
        l = (int)((float)k * 0.3913043F);
        g = (RelativeLayout)view.findViewById(0x7f0d026b);
        g.setLayoutParams(new android.widget.FrameLayout.LayoutParams(k, l));
        b = (ViewPager)view.findViewById(0x7f0d026c);
        e = (LinearLayout)view.findViewById(0x7f0d026d);
        c = new d(this, (byte)0);
        b.addOnPageChangeListener(this);
        b.setAdapter(c);
    }

    static int a(a a1)
    {
        return a1.j;
    }

    static ViewPager b(a a1)
    {
        return a1.b;
    }

    private void b()
    {
        if (h != null)
        {
            e.removeAllViews();
            float f1 = a.getResources().getDisplayMetrics().density;
            i = Math.min(h.size(), 5);
            if (i != 1)
            {
                int i1 = 0;
                while (i1 < i) 
                {
                    ImageView imageview = new ImageView(a);
                    android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutparams.setMargins((int)(8F * f1), 0, 0, 0);
                    layoutparams.gravity = 1;
                    imageview.setLayoutParams(layoutparams);
                    if (i1 == az.I)
                    {
                        imageview.setBackgroundResource(0x7f020362);
                        f = imageview;
                    } else
                    {
                        imageview.setBackgroundResource(0x7f020363);
                    }
                    imageview.setId(i1);
                    e.addView(imageview);
                    i1++;
                }
                j = 0;
                return;
            }
        }
    }

    static Handler c(a a1)
    {
        return a1.r;
    }

    static c d(a a1)
    {
        return a1.o;
    }

    static int e(a a1)
    {
        int i1 = a1.j + 1;
        a1.j = i1;
        return i1;
    }

    static int f(a a1)
    {
        return a1.i;
    }

    static int g(a a1)
    {
        a1.j = 0;
        return 0;
    }

    static int h(a a1)
    {
        return a1.m;
    }

    static int i(a a1)
    {
        return a1.n;
    }

    static k j(a a1)
    {
        return a1.p;
    }

    static LayoutInflater k(a a1)
    {
        return a1.d;
    }

    static int l(a a1)
    {
        return a1.k;
    }

    static int m(a a1)
    {
        return a1.l;
    }

    static Context n(a a1)
    {
        return a1.a;
    }

    public final void a()
    {
        if (r != null && o != null)
        {
            r.removeCallbacks(o);
            r = null;
            o = null;
        }
        b.setAdapter(null);
        p = null;
    }

    public final void a(List list)
    {
        h = list;
        if (c != null)
        {
            c.a(list);
            c.notifyDataSetChanged();
        }
        if (h != null && !h.isEmpty() && az.I == 0 && !q)
        {
            String s1 = (new StringBuilder("Main/Banner/")).append(((u)list.get(az.I)).a).toString();
            long l1 = az.I;
            com.roidapp.baselib.c.b.a("SNS", "show", s1);
            af.b(a, "SNS", "show", (new StringBuilder("Main/Banner/")).append(((u)list.get(az.I)).a).toString(), Long.valueOf(az.I));
            q = true;
        }
        b();
        j = az.I;
        b.setCurrentItem(j);
        if (o == null)
        {
            o = new c(this);
            if (r != null)
            {
                r.postDelayed(o, 5000L);
            }
        }
    }

    public final void onPageScrollStateChanged(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 49
    //                   1 25;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        s = true;
        if (r != null)
        {
            r.removeCallbacks(o);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s)
        {
            if (r != null)
            {
                r.postDelayed(o, 5000L);
            }
            s = false;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void onPageScrolled(int i1, float f1, int j1)
    {
    }

    public final void onPageSelected(int i1)
    {
        j = i1;
        az.I = j;
        if (c != null)
        {
            if (f != null)
            {
                f.setBackgroundResource(0x7f020363);
            }
            ImageView imageview = (ImageView)e.findViewById(i1);
            imageview.setBackgroundResource(0x7f020362);
            f = imageview;
        }
        if (h != null && !h.isEmpty())
        {
            String s1 = (new StringBuilder("Main/Banner/")).append(((u)h.get(i1)).a).toString();
            long l1 = i1;
            com.roidapp.baselib.c.b.a("SNS", "show", s1);
            af.b(a, "SNS", "show", (new StringBuilder("Main/Banner/")).append(((u)h.get(i1)).a).toString(), Long.valueOf(i1));
        }
    }
}
