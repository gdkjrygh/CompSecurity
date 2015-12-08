// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            ih, PhotoGridActivity, mm, cr, 
//            cl, cm, cp, cq, 
//            cn, co

public final class ck extends Fragment
{

    SharedPreferences a;
    android.content.SharedPreferences.Editor b;
    public final int c[] = {
        0x7f020077, 0x7f020078, 0x7f020079, 0x7f02007f, 0x7f02007e, 0x7f020076, 0x7f02007a, 0x7f02007b, 0x7f02007c, 0x7f02007d
    };
    private float d;
    private float e;
    private float f;
    private PhotoGridActivity g;
    private int h;
    private int i;
    private int j;
    private View k;
    private float l;
    private boolean m;
    private boolean n;
    private boolean o;
    private Integer p;

    public ck()
    {
        d = -22F;
        e = -22F;
        f = -22F;
    }

    static float a(ck ck1)
    {
        return ck1.e;
    }

    static float a(ck ck1, float f1)
    {
        ck1.e = f1;
        return f1;
    }

    static int a(ck ck1, int i1)
    {
        ck1.i = i1;
        return i1;
    }

    static Integer a(ck ck1, Integer integer)
    {
        ck1.p = integer;
        return integer;
    }

    private void a(SeekBar seekbar, SeekBar seekbar1, SeekBar seekbar2)
    {
        float f1;
        int i1;
        if (seekbar != null && seekbar1 != null)
        {
            if (ih.C().S() > l / 2.0F)
            {
                ih.C().e(l / 2.0F);
            }
            if (ih.C().R() > l / 2.0F)
            {
                ih.C().d(l / 2.0F);
            }
            int j1;
            if (ih.C().S() <= 1.5F)
            {
                seekbar.setProgress((int)((ih.C().S() / 1.5F) * 50F));
            } else
            {
                seekbar.setProgress((int)(((ih.C().S() - 1.5F) / (l / 2.0F - 1.5F)) * 50F + 50F));
            }
            if (ih.C().R() <= 1.5F)
            {
                seekbar1.setProgress((int)((ih.C().R() / 1.5F) * 50F));
            } else
            {
                seekbar1.setProgress((int)(((ih.C().R() - 1.5F) / (l / 2.0F - 1.5F)) * 50F + 50F));
            }
            if (!m && !n && !o)
            {
                a("OUTER_SPACE", ih.C().S());
                a("INNER_SPACE", ih.C().R());
            }
            i = seekbar.getProgress();
            h = seekbar1.getProgress();
        }
        if (seekbar2 == null || g == null || g.b == null || g.b.j == null) goto _L2; else goto _L1
_L1:
        i1 = g.b.j.getLayoutParams().width;
        j1 = g.b.j.getLayoutParams().height;
        f1 = i1;
        if (i1 > j1)
        {
            f1 = j1;
        }
        f1 = (f1 * ih.C().Q()) / 100F;
        if (az.q != 6) goto _L4; else goto _L3
_L3:
        i1 = (int)ih.C().V();
_L6:
        seekbar2.setProgress(i1);
        if (ih.C().W() == 0 && !n)
        {
            a("CORNER_RADIOUS", ih.C().V());
        }
        j = seekbar2.getProgress();
_L2:
        return;
_L4:
        int k1 = (int)((ih.C().V() / f1) * 200F);
        i1 = k1;
        if ((float)k1 > 100F)
        {
            ih.C().f(f1 / 2.0F);
            i1 = 100;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(ck ck1, String s, float f1)
    {
        ck1.a(s, f1);
    }

    private void a(String s, float f1)
    {
        if (f1 == -22F)
        {
            return;
        } else
        {
            b.putFloat(s, f1).apply();
            return;
        }
    }

    static float b(ck ck1, float f1)
    {
        ck1.d = f1;
        return f1;
    }

    static int b(ck ck1, int i1)
    {
        ck1.h = i1;
        return i1;
    }

    static PhotoGridActivity b(ck ck1)
    {
        return ck1.g;
    }

    static float c(ck ck1, float f1)
    {
        ck1.f = f1;
        return f1;
    }

    static int c(ck ck1)
    {
        return ck1.i;
    }

    static int c(ck ck1, int i1)
    {
        ck1.j = i1;
        return i1;
    }

    static float d(ck ck1)
    {
        return ck1.l;
    }

    static boolean e(ck ck1)
    {
        return ck1.m;
    }

    static boolean f(ck ck1)
    {
        return ck1.n;
    }

    static boolean g(ck ck1)
    {
        return ck1.o;
    }

    static float h(ck ck1)
    {
        return ck1.d;
    }

    static int i(ck ck1)
    {
        return ck1.h;
    }

    static float j(ck ck1)
    {
        return ck1.f;
    }

    static int k(ck ck1)
    {
        return ck1.j;
    }

    static void l(ck ck1)
    {
        boolean flag = true;
        az.q;
        JVM INSTR tableswitch 0 10: default 64
    //                   0 199
    //                   1 64
    //                   2 64
    //                   3 64
    //                   4 129
    //                   5 80
    //                   6 80
    //                   7 64
    //                   8 64
    //                   9 80
    //                   10 80;
           goto _L1 _L2 _L1 _L1 _L1 _L3 _L4 _L4 _L1 _L1 _L4 _L4
_L1:
        ck1.a();
        ck1.g.b.c(2);
        return;
_L4:
        if (ck1.g.b.r != 0)
        {
            ih.C().e(1.45F);
            ih.C().d(0.64F);
        } else
        {
            ih.C().e(0.0F);
        }
        ih.C().f(0.0F);
        continue; /* Loop/switch isn't completed */
_L3:
        if (ck1.o)
        {
            ih.C().e(ih.C().aO());
            ih.C().d(ih.C().aQ());
            ih.C().f(ih.C().aP());
        } else
        {
            ih.C().e(0.0F);
            ih.C().d(0.0F);
            ih.C().f(0.0F);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (ck1.o)
        {
            ih.C().e(ih.C().aO());
            ih.C().d(ih.C().aQ());
            ih.C().f(ih.C().aP());
        } else
        {
            if (ck1.g.b.r != 0)
            {
                ih.C().e(1.45F);
            } else
            {
                ih.C().e(0.64F);
            }
            ih.C().d(0.64F);
            ih.C().f(0.0F);
        }
        if (az.q != 5 || ih.C().W() != 1)
        {
            flag = false;
        }
        if (!flag)
        {
            ck1.b.putFloat("OUTER_SPACE", 0.64F);
            ck1.b.putFloat("INNER_SPACE", 0.64F);
            ck1.b.putFloat("CORNER_RADIOUS", 0.0F);
            ck1.b.apply();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static Integer m(ck ck1)
    {
        return ck1.p;
    }

    public final void a()
    {
        if (k == null)
        {
            return;
        } else
        {
            a((SeekBar)k.findViewById(0x7f0d004f), (SeekBar)k.findViewById(0x7f0d0052), (SeekBar)k.findViewById(0x7f0d0055));
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        g = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        k = layoutinflater.inflate(0x7f030007, viewgroup, false);
        layoutinflater = k.findViewById(0x7f0d004b);
        viewgroup = k.findViewById(0x7f0d0056);
        a = g.getPreferences(0);
        b = a.edit();
        l = ih.C().Q();
        bundle = (ViewGroup)viewgroup.findViewById(0x7f0d0058);
        LayoutInflater layoutinflater1 = LayoutInflater.from(getActivity());
        int j1 = (int)getResources().getDimension(0x7f0900d1);
        int ai[] = c;
        for (int i1 = 0; i1 < ai.length; i1++)
        {
            int k1 = ai[i1];
            View view = layoutinflater1.inflate(0x7f030128, null);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(j1, j1));
            view.setId(k1);
            ImageView imageview = (ImageView)view.findViewById(0x7f0d0494);
            imageview.setImageDrawable(g.getResources().getDrawable(k1));
            imageview.setTag(Integer.valueOf(i1));
            imageview.setOnClickListener(new cr(this, bundle, view, k1));
            bundle.addView(view);
        }

        m = false;
        n = false;
        az.q;
        JVM INSTR tableswitch 0 10: default 300
    //                   0 640
    //                   1 300
    //                   2 300
    //                   3 300
    //                   4 695
    //                   5 610
    //                   6 658
    //                   7 300
    //                   8 300
    //                   9 610
    //                   10 610;
           goto _L1 _L2 _L1 _L1 _L1 _L3 _L4 _L5 _L1 _L1 _L4 _L4
_L1:
        float f1;
        if (layoutinflater != null)
        {
            layoutinflater.setOnClickListener(new cl(this));
        }
        layoutinflater = (TextView)k.findViewById(0x7f0d0059);
        viewgroup = (SeekBar)k.findViewById(0x7f0d004f);
        bundle = (SeekBar)k.findViewById(0x7f0d0052);
        SeekBar seekbar = (SeekBar)k.findViewById(0x7f0d0055);
        a(viewgroup, bundle, seekbar);
        k.findViewById(0x7f0d0053).setVisibility(0);
        viewgroup.setOnSeekBarChangeListener(new cm(this, layoutinflater));
        if (m || o)
        {
            k.findViewById(0x7f0d0050).setVisibility(8);
        } else
        {
            bundle.setOnSeekBarChangeListener(new cn(this, layoutinflater));
        }
        if (o && m)
        {
            k.findViewById(0x7f0d0053).setVisibility(8);
        } else
        {
            seekbar.setOnSeekBarChangeListener(new co(this, layoutinflater));
        }
        if (az.q == 4 || az.q == 6)
        {
            k.findViewById(0x7f0d004a).setVisibility(8);
        }
        layoutinflater = (ImageView)k.findViewById(0x7f0d0049);
        layoutinflater.setOnClickListener(new cp(this));
        viewgroup = (TextView)k.findViewById(0x7f0d004c);
        f1 = g.getResources().getDisplayMetrics().density;
        az.q;
        JVM INSTR lookupswitch 4: default 592
    //                   0: 783
    //                   5: 818
    //                   9: 818
    //                   10: 818;
           goto _L6 _L7 _L8 _L8 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_818;
_L9:
        viewgroup.setOnClickListener(new cq(this, layoutinflater));
        return k;
_L4:
        m = true;
        if (ih.C().W() == 4)
        {
            o = true;
        }
        l = 80F;
          goto _L1
_L2:
        if (ih.C().W() == 4)
        {
            o = true;
        }
          goto _L1
_L5:
        getResources().getDrawable(0x7f0203df).setAlpha(255);
        viewgroup.setVisibility(8);
        m = true;
        l = 60F;
          goto _L1
_L3:
        n = true;
        if (ih.C().W() == 4)
        {
            o = true;
        }
        if (ih.C().h() && ih.C().M().length == 1)
        {
            m = true;
            l = 80F;
        }
          goto _L1
_L7:
        if (!o)
        {
            viewgroup.setCompoundDrawablePadding((int)(-30F * f1));
            viewgroup.setPadding(0, (int)(30F * f1), 0, 0);
        }
          goto _L9
        if (o)
        {
            viewgroup.setCompoundDrawablePadding(0);
            viewgroup.setPadding(0, 0, 0, 0);
            bundle = (ViewGroup)k.findViewById(0x7f0d004d);
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)bundle.getLayoutParams();
            layoutparams.setMargins((int)(10F * f1), (int)(15F * f1), (int)(5F * f1), (int)(f1 * 15F));
            bundle.setLayoutParams(layoutparams);
        }
          goto _L9
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
    }
}
