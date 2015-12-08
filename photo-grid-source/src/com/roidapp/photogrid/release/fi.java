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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            ih, fl, PhotoGridActivity, as, 
//            ig, fj, fk

public final class fi extends Fragment
{

    public int a[][] = {
        {
            0x7f02041f, 0x7f02034d, 0x7f020352, 0x7f020355, 0x7f02034f, 0x7f020353, 0x7f02034c, 0x7f020200
        }, {
            0x7f0203aa, 0x7f02034d, 0x7f020350, 0x7f020354, 0x7f02034e, 0x7f020351, 0x7f020356, 0x7f020200
        }, {
            0x7f02041f, 0x7f02039b, 0x7f02034d, 0x7f020352, 0x7f020355, 0x7f02034f, 0x7f020353, 0x7f02034c, 0x7f020200
        }, {
            0x7f0203aa, 0x7f02039b, 0x7f02034d, 0x7f020350, 0x7f020354, 0x7f02034e, 0x7f020351, 0x7f020356, 0x7f020200
        }
    };
    public int b[] = {
        1, 4, 7, 3, 5, 16
    };
    public float c[] = {
        1.0F, 3F, 5F, 2.0F, 3F, 9F
    };
    private PhotoGridActivity d;
    private int e;
    private int f;
    private boolean g;
    private List h;
    private boolean i;
    private int j;
    private HorizontalScrollView k;
    private int l;
    private int m;

    public fi()
    {
        e = 0;
        f = 0;
        i = ih.C().v();
        int i1 = ih.C().u() + 1;
        e = i1;
        j = i1;
    }

    static int a(fi fi1, int i1)
    {
        fi1.f = i1;
        return i1;
    }

    static PhotoGridActivity a(fi fi1)
    {
        return fi1.d;
    }

    static void a(fi fi1, int i1, int j1)
    {
label0:
        {
            {
                float f3 = 0.0F;
                float f1 = 1.0F;
                fi1.j = i1 - 1;
                if (i1 == j1 - 1)
                {
                    fl fl1 = new fl(fi1, j1);
                    fi1.d.a("ratio");
                    as as1 = new as();
                    as1.setStyle(1, 0);
                    as1.a(fl1, fi1.e);
                    fi1.d.a(as1, "ratio");
                    return;
                }
                float f2 = f3;
                if (i1 == 1)
                {
                    f2 = f3;
                    if (!fi1.g)
                    {
                        int k1 = fi1.getResources().getDisplayMetrics().heightPixels;
                        j1 = fi1.getResources().getDisplayMetrics().widthPixels;
                        float f4;
                        float f5;
                        ig aig[];
                        int l1;
                        boolean flag;
                        if (k1 < j1)
                        {
                            l1 = k1;
                            k1 = j1;
                        } else
                        {
                            l1 = j1;
                        }
                        f2 = fi1.getResources().getDimension(0x7f0900dd);
                        f4 = k1;
                        f5 = az.g;
                        f2 = (float)l1 / (f4 - f2 - f5);
                    }
                }
                if (!fi1.g)
                {
                    break label0;
                }
                if (i1 > 0)
                {
                    if ((az.q == 5 || az.q == 10) && ih.C().W() != 4)
                    {
                        aig = ih.C().M();
                        if (aig != null && aig.length != 0)
                        {
                            aig[0].B = true;
                        }
                        ih.C().k(1);
                    }
                    i1--;
                    if (fi1.i)
                    {
                        f1 = (float)fi1.b[i1] / fi1.c[i1];
                    } else
                    {
                        f1 = fi1.c[i1] / (float)fi1.b[i1];
                    }
                } else
                {
                    f1 = 1.0F;
                }
                if ((az.q == 5 || az.q == 10) && ih.C().W() != 4)
                {
                    fi1.d.J();
                    flag = false;
                } else
                {
                    flag = false;
                }
            }
            ih.C().d(flag);
            ih.C().b(f1);
            ih.C().c(fi1.j);
            ih.C().f(fi1.i);
            ih.C().a(null);
            fi1.d.a(false, false);
            return;
        }
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        if (0.75F >= f2 || f2 > 1.0F) goto _L4; else goto _L3
_L3:
        f1 = 1.0F;
_L5:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
        if (0.7142857F < f2 && f2 <= 0.75F)
        {
            f1 = 0.75F;
        } else
        if (0.6666667F < f2 && f2 <= 0.7142857F)
        {
            f1 = 0.7142857F;
        } else
        if (0.6F < f2 && f2 <= 0.6666667F)
        {
            f1 = 0.6666667F;
        } else
        if (0.5625F < f2 && f2 <= 0.6F)
        {
            f1 = 0.6F;
        } else
        if (f2 <= 0.5625F)
        {
            f1 = 0.5625F;
        }
        if (true) goto _L5; else goto _L2
_L2:
        i1 -= 2;
        if (fi1.i)
        {
            f1 = (float)fi1.b[i1] / fi1.c[i1];
            flag = false;
        } else
        {
            f1 = fi1.c[i1] / (float)fi1.b[i1];
            flag = false;
        }
        if (true) goto _L7; else goto _L6
_L6:
        break MISSING_BLOCK_LABEL_555;
_L7:
        break MISSING_BLOCK_LABEL_302;
    }

    static boolean a(fi fi1, boolean flag)
    {
        fi1.i = flag;
        return flag;
    }

    static int b(fi fi1, int i1)
    {
        fi1.e = i1;
        return i1;
    }

    static HorizontalScrollView b(fi fi1)
    {
        return fi1.k;
    }

    static int c(fi fi1)
    {
        return fi1.m;
    }

    static int d(fi fi1)
    {
        return fi1.l;
    }

    static int e(fi fi1)
    {
        return fi1.e;
    }

    static boolean f(fi fi1)
    {
        return fi1.g;
    }

    static boolean g(fi fi1)
    {
        return fi1.i;
    }

    static List h(fi fi1)
    {
        return fi1.h;
    }

    static void i(fi fi1)
    {
        int j1 = fi1.h.size();
        int ai[] = fi1.a[fi1.f];
        int i1 = 0;
        while (i1 < j1 - 1) 
        {
            if (i1 > 1)
            {
                android.graphics.drawable.Drawable drawable = fi1.d.getResources().getDrawable(ai[i1]);
                ((ImageView)((View)fi1.h.get(i1)).findViewById(0x7f0d0494)).setImageDrawable(drawable);
            } else
            if (i1 == 0)
            {
                TextView textview = (TextView)((View)fi1.h.get(i1)).findViewById(0x7f0d04c9);
                if (fi1.i)
                {
                    textview.setText(0x7f070198);
                } else
                {
                    textview.setText(0x7f070247);
                }
                textview.setCompoundDrawablesWithIntrinsicBounds(0, ai[i1], 0, 0);
            }
            i1++;
        }
    }

    static int j(fi fi1)
    {
        return fi1.j;
    }

    protected final void a()
    {
        if (e > 0)
        {
            ((View)h.get(e)).findViewById(0x7f0d0493).setVisibility(8);
        }
    }

    public final void onAttach(Activity activity)
    {
        com.roidapp.photogrid.common.b.a("FragmentProportion/onAttach");
        d = (PhotoGridActivity)activity;
        if (az.q == 1)
        {
            g = false;
        } else
        {
            g = true;
        }
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view;
        ViewGroup viewgroup1;
        int ai[];
        android.view.ViewGroup.LayoutParams layoutparams;
        int i1;
        int j1;
        com.roidapp.photogrid.common.b.a("FragmentProportion/onCreateView");
        view = layoutinflater.inflate(0x7f0300b8, viewgroup, false);
        viewgroup1 = (ViewGroup)view.findViewById(0x7f0d02e8);
        k = (HorizontalScrollView)view.findViewById(0x7f0d0287);
        h = new ArrayList();
        viewgroup = (RelativeLayout)view.findViewById(0x7f0d02e5);
        viewgroup.setOnClickListener(new fj(this));
        if (d.e != null)
        {
            i1 = (int)getResources().getDimension(0x7f0900d4);
            l = i1;
            m = getResources().getDisplayMetrics().widthPixels;
            if (az.q == 1)
            {
                viewgroup.setVisibility(8);
                break MISSING_BLOCK_LABEL_134;
            } else
            {
                if (az.q == 0)
                {
                    viewgroup.setVisibility(0);
                    ((ImageView)viewgroup.findViewById(0x7f0d02e6)).setLayoutParams(new android.widget.RelativeLayout.LayoutParams((int)getResources().getDimension(0x7f0900d0), i1));
                }
                continue; /* Loop/switch isn't completed */
            }
        }
          goto _L1
_L3:
        if (g)
        {
            if (i)
            {
                f = 0;
                bundle = d.getResources().getString(0x7f070198);
            } else
            {
                f = 1;
                bundle = d.getResources().getString(0x7f070247);
            }
        } else
        if (i)
        {
            f = 2;
            bundle = d.getResources().getString(0x7f070198);
        } else
        {
            f = 3;
            bundle = d.getResources().getString(0x7f070247);
        }
        ai = a[f];
        j1 = ai.length;
        layoutparams = new android.view.ViewGroup.LayoutParams(l, i1);
        i1 = 0;
        while (i1 < j1) 
        {
            viewgroup = null;
            if (i1 > 1 && i1 < j1 - 1)
            {
                viewgroup = layoutinflater.inflate(0x7f03012b, null);
                ((ImageView)viewgroup.findViewById(0x7f0d0494)).setImageDrawable(d.getResources().getDrawable(ai[i1]));
                viewgroup.setLayoutParams(layoutparams);
                viewgroup.setTag(Integer.valueOf(i1));
                viewgroup1.addView(viewgroup);
                h.add(viewgroup);
            } else
            if (i1 == 0)
            {
                viewgroup = layoutinflater.inflate(0x7f03012c, null);
                TextView textview = (TextView)viewgroup.findViewById(0x7f0d04c9);
                textview.setCompoundDrawablesWithIntrinsicBounds(0, ai[0], 0, 0);
                textview.setText(bundle);
                viewgroup.setTag(Integer.valueOf(i1));
                viewgroup1.addView(viewgroup);
                h.add(viewgroup);
            } else
            if (i1 == j1 - 1)
            {
                viewgroup = layoutinflater.inflate(0x7f03012c, null);
                TextView textview1 = (TextView)viewgroup.findViewById(0x7f0d04c9);
                textview1.setCompoundDrawablesWithIntrinsicBounds(0, ai[j1 - 1], 0, 0);
                textview1.setText(0x7f070117);
                viewgroup.setTag(Integer.valueOf(i1));
                viewgroup1.addView(viewgroup);
                h.add(viewgroup);
            } else
            if (i1 == 1)
            {
                viewgroup = layoutinflater.inflate(0x7f03012b, null);
                ((ImageView)viewgroup.findViewById(0x7f0d0494)).setImageDrawable(d.getResources().getDrawable(ai[i1]));
                viewgroup.setLayoutParams(layoutparams);
                viewgroup.setTag(Integer.valueOf(i1));
                viewgroup1.addView(viewgroup);
                h.add(viewgroup);
            }
            if (viewgroup != null)
            {
                viewgroup.setOnClickListener(new fk(this, j1));
            }
            i1++;
        }
        if (j > 0)
        {
            ((View)h.get(j)).findViewById(0x7f0d0493).setVisibility(0);
        }
_L1:
        return view;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
