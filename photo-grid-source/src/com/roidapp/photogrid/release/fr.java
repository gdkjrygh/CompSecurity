// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.baselib.c.p;

// Referenced classes of package com.roidapp.photogrid.release:
//            fz, PhotoGridActivity, PhotoView, ra, 
//            fy, fs, ft, fu, 
//            fv, fw, fx

public final class fr extends Fragment
{

    private PhotoGridActivity a;
    private int b;
    private SharedPreferences c;
    private SeekBar d;
    private SeekBar e;
    private SeekBar f;
    private Integer g;
    private HorizontalScrollView h;
    private int i;
    private int j;
    private android.widget.SeekBar.OnSeekBarChangeListener k;

    public fr()
    {
        k = new fz(this);
    }

    static int a(fr fr1, int l)
    {
        fr1.b = l;
        return l;
    }

    static Integer a(fr fr1)
    {
        return fr1.g;
    }

    static Integer a(fr fr1, Integer integer)
    {
        fr1.g = integer;
        return integer;
    }

    private void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        int l;
        int i1;
        int j1;
        int l1;
        int i2;
        ao ao = a.O().g();
        int ai[];
        View view;
        ImageView imageview;
        ImageView imageview1;
        int k1;
        if (ao != null && (ao instanceof ra))
        {
            l = ((ra)ao).s();
        } else
        {
            l = -1;
        }
        ao = a.O().g();
        if (ao != null && (ao instanceof ra))
        {
            i1 = ((ra)ao).t();
        } else
        {
            i1 = -1;
        }
        ao = a.O().g();
        if (ao != null && (ao instanceof ra))
        {
            j1 = ((ra)ao).ax;
        } else
        {
            j1 = -1;
        }
        viewgroup.removeAllViews();
        i = (int)getResources().getDimension(0x7f0900d1);
        j = getResources().getDisplayMetrics().widthPixels;
        ai = p.a().i;
        g = null;
        k1 = 0;
        if (k1 >= ai.length) goto _L2; else goto _L1
_L1:
        l1 = ai[k1];
        i2 = k1 + 10000;
        b;
        JVM INSTR tableswitch 0 2: default 192
    //                   0 346
    //                   1 365
    //                   2 402;
           goto _L3 _L4 _L5 _L6
_L3:
        view = layoutinflater.inflate(0x7f030129, null);
        imageview = (ImageView)view.findViewById(0x7f0d0494);
        imageview1 = (ImageView)view.findViewById(0x7f0d0493);
        view.setId(i2);
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(i / 2, i));
        imageview1.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i / 2, i));
        imageview.setBackgroundColor(l1);
        view.setTag(Integer.valueOf(k1));
        view.setOnClickListener(new fy(this, viewgroup, view, i2, l1));
        viewgroup.addView(view);
        k1++;
        break MISSING_BLOCK_LABEL_140;
_L4:
        if (l != l1)
        {
            continue; /* Loop/switch isn't completed */
        }
_L8:
        g = Integer.valueOf(i2);
        continue; /* Loop/switch isn't completed */
_L5:
        if (i1 == l1)
        {
            if (d.getProgress() == 0)
            {
                g = null;
            } else
            {
                g = Integer.valueOf(i2);
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (j1 != l1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b()) goto _L8; else goto _L7
_L7:
        g = null;
        if (true) goto _L3; else goto _L2
_L2:
        if (g != null)
        {
            viewgroup.findViewById(g.intValue()).findViewById(0x7f0d0493).setVisibility(0);
        }
        return;
    }

    static void a(fr fr1, LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        fr1.a(layoutinflater, viewgroup);
    }

    static SeekBar b(fr fr1)
    {
        return fr1.d;
    }

    static SharedPreferences c(fr fr1)
    {
        return fr1.c;
    }

    static SeekBar d(fr fr1)
    {
        return fr1.e;
    }

    static SeekBar e(fr fr1)
    {
        return fr1.f;
    }

    static PhotoGridActivity f(fr fr1)
    {
        return fr1.a;
    }

    static HorizontalScrollView g(fr fr1)
    {
        return fr1.h;
    }

    static int h(fr fr1)
    {
        return fr1.j;
    }

    static int i(fr fr1)
    {
        return fr1.i;
    }

    static int j(fr fr1)
    {
        return fr1.b;
    }

    public final float a()
    {
        ao ao = a.O().g();
        if (ao != null && (ao instanceof ra))
        {
            return ((ra)ao).z();
        } else
        {
            return 1.0F;
        }
    }

    public final void a(float f1)
    {
        ao ao;
        if (f1 >= 0.0F && f1 <= 5F)
        {
            if ((ao = a.O().g()) != null && (ao instanceof ra))
            {
                ((ra)ao).f(f1);
                a.O().invalidate();
                return;
            }
        }
    }

    public final void a(float f1, float f2)
    {
        ao ao;
        if (f1 >= -10F && f1 <= 10F)
        {
            if ((ao = a.O().g()) != null && (ao instanceof ra))
            {
                ((ra)ao).d(f1, f2);
                a.O().invalidate();
                return;
            }
        }
    }

    public final void a(int l, int i1)
    {
        Object obj = a.O().g();
        if (obj == null || !(obj instanceof ra)) goto _L2; else goto _L1
_L1:
        obj = (ra)obj;
        i1;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 67
    //                   1 75
    //                   2 83;
           goto _L3 _L4 _L5 _L6
_L3:
        a.O().invalidate();
_L2:
        return;
_L4:
        ((ra) (obj)).e(l);
        continue; /* Loop/switch isn't completed */
_L5:
        ((ra) (obj)).f(l);
        continue; /* Loop/switch isn't completed */
_L6:
        ((ra) (obj)).g(l);
        if (true) goto _L3; else goto _L7
_L7:
    }

    public final void b(float f1)
    {
        ao ao;
        if (f1 >= 0.0F && f1 <= 5F)
        {
            if ((ao = a.O().g()) != null && (ao instanceof ra))
            {
                ((ra)ao).d(f1);
                a.O().invalidate();
                return;
            }
        }
    }

    public final boolean b()
    {
        ao ao = a.O().g();
        if (ao != null && (ao instanceof ra))
        {
            return ((ra)ao).ag;
        } else
        {
            return false;
        }
    }

    public final void c()
    {
        ao ao = a.O().g();
        if (ao != null && (ao instanceof ra))
        {
            ((ra)ao).v();
            a.O().invalidate();
        }
    }

    public final void d()
    {
        ao ao = a.O().g();
        if (ao != null && (ao instanceof ra))
        {
            ((ra)ao).u();
            a.O().invalidate();
        }
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        c = activity.getSharedPreferences(activity.getPackageName(), 0);
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300bd, null);
        viewgroup.setOnClickListener(new fs(this));
        bundle = (TextView)viewgroup.findViewById(0x7f0d02fe);
        TextView textview = (TextView)viewgroup.findViewById(0x7f0d02ff);
        TextView textview1 = (TextView)viewgroup.findViewById(0x7f0d0300);
        ImageView imageview = (ImageView)viewgroup.findViewById(0x7f0d0309);
        ImageView imageview1 = (ImageView)viewgroup.findViewById(0x7f0d030a);
        RelativeLayout relativelayout = (RelativeLayout)viewgroup.findViewById(0x7f0d02f9);
        RelativeLayout relativelayout1 = (RelativeLayout)viewgroup.findViewById(0x7f0d0301);
        RelativeLayout relativelayout2 = (RelativeLayout)viewgroup.findViewById(0x7f0d0304);
        d = (SeekBar)viewgroup.findViewById(0x7f0d0303);
        d.setProgress((int)(a() * 10F));
        d.setKeyProgressIncrement(1);
        d.setMax(50);
        d.setTag("storke");
        d.setOnSeekBarChangeListener(k);
        e = (SeekBar)viewgroup.findViewById(0x7f0d0306);
        Object obj = e;
        ao ao = a.O().g();
        float f1;
        if (ao != null && (ao instanceof ra))
        {
            f1 = ((ra)ao).av;
        } else
        {
            f1 = 0.0F;
        }
        ((SeekBar) (obj)).setProgress((int)(f1 * 10F + 100F));
        e.setKeyProgressIncrement(1);
        e.setMax(200);
        e.setTag("shadow_space");
        e.setOnSeekBarChangeListener(k);
        f = (SeekBar)viewgroup.findViewById(0x7f0d0308);
        obj = f;
        ao = a.O().g();
        if (ao != null && (ao instanceof ra))
        {
            f1 = ((ra)ao).au;
        } else
        {
            f1 = 1.0F;
        }
        ((SeekBar) (obj)).setProgress((int)(f1 * 20F));
        f.setKeyProgressIncrement(1);
        f.setMax(100);
        f.setTag("shadow_size");
        f.setOnSeekBarChangeListener(k);
        h = (HorizontalScrollView)viewgroup.findViewById(0x7f0d0287);
        obj = (ViewGroup)viewgroup.findViewById(0x7f0d030b);
        b = 0;
        a(layoutinflater, ((ViewGroup) (obj)));
        bundle.setOnClickListener(new ft(this, imageview, imageview1, relativelayout, relativelayout1, relativelayout2, bundle, textview, textview1, layoutinflater, ((ViewGroup) (obj))));
        textview.setOnClickListener(new fu(this, imageview, imageview1, relativelayout, relativelayout1, relativelayout2, textview, bundle, textview1, layoutinflater, ((ViewGroup) (obj))));
        textview1.setOnClickListener(new fv(this, imageview, imageview1, relativelayout, relativelayout1, relativelayout2, textview, bundle, textview1, layoutinflater, ((ViewGroup) (obj))));
        imageview.setOnClickListener(new fw(this, ((ViewGroup) (obj))));
        imageview1.setOnClickListener(new fx(this, ((ViewGroup) (obj))));
        bundle.setBackgroundResource(0x7f020074);
        textview.setBackgroundDrawable(null);
        return viewgroup;
    }
}
