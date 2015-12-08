// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.photogrid.common.az;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.roidapp.photogrid.release:
//            ih, PhotoGridActivity, fc, fd, 
//            fe, ff, fg, fh

public final class fb extends Fragment
{

    public int a[][] = {
        new int[0], {
            0x7f0202ac, 0x7f0202b0, 0x7f0202af, 0x7f0202b4, 0x7f0202b1, 0x7f0202b2, 0x7f0202b6, 0x7f0202b3, 0x7f0202ad, 0x7f0202b5, 
            0x7f0202ae, 0x7f0202b7
        }, {
            0x7f0202ba, 0x7f0202b8, 0x7f0202bb, 0x7f0202b9, 0x7f0202bf, 0x7f0202be, 0x7f0202bd, 0x7f0202c0, 0x7f0202bc, 0x7f0202c5, 
            0x7f0202c7, 0x7f0202c3, 0x7f0202c8, 0x7f0202c6, 0x7f0202c1, 0x7f0202c2, 0x7f0202c4
        }, {
            0x7f0202cb, 0x7f0202cf, 0x7f0202d3, 0x7f0202d0, 0x7f0202c9, 0x7f0202d1, 0x7f0202ca, 0x7f0202cc, 0x7f0202cd, 0x7f0202d2, 
            0x7f0202ce, 0x7f0202d6, 0x7f0202d4, 0x7f0202d5, 0x7f0202d7
        }, {
            0x7f0202d8, 0x7f0202db, 0x7f0202e4, 0x7f0202e8, 0x7f0202e1, 0x7f0202dc, 0x7f0202de, 0x7f0202e0, 0x7f0202df, 0x7f0202e3, 
            0x7f0202e7, 0x7f0202e6, 0x7f0202e5, 0x7f0202da, 0x7f0202e9, 0x7f0202dd, 0x7f0202d9, 0x7f0202e2, 0x7f0202ea, 0x7f0202ec, 
            0x7f0202ed, 0x7f0202eb
        }, {
            0x7f0202f7, 0x7f0202f0, 0x7f0202f4, 0x7f0202fa, 0x7f0202f1, 0x7f0202ef, 0x7f0202f8, 0x7f0202f9, 0x7f0202fc, 0x7f0202f2, 
            0x7f0202f6, 0x7f0202f5, 0x7f0202ee, 0x7f0202f3, 0x7f0202fb, 0x7f0202fd, 0x7f0202fe, 0x7f0202ff, 0x7f020300
        }, {
            0x7f020303, 0x7f020301, 0x7f02030e, 0x7f020302, 0x7f020308, 0x7f020306, 0x7f020304, 0x7f020305, 0x7f020307, 0x7f02030d, 
            0x7f02030c, 0x7f02030b, 0x7f020309, 0x7f02030a
        }, {
            0x7f020317, 0x7f020313, 0x7f020310, 0x7f020315, 0x7f02030f, 0x7f020316, 0x7f020311, 0x7f020312, 0x7f020314
        }, {
            0x7f02031a, 0x7f02031c, 0x7f02031b, 0x7f020324, 0x7f020323, 0x7f02031f, 0x7f020320, 0x7f02031d, 0x7f020319, 0x7f02031e, 
            0x7f020318, 0x7f020321, 0x7f020322
        }, {
            0x7f020325, 0x7f020326, 0x7f02032e, 0x7f02032f, 0x7f020328, 0x7f02032d, 0x7f020329, 0x7f020327, 0x7f02032c, 0x7f02032a, 
            0x7f02032b
        }, 
        {
            0x7f020276, 0x7f020277, 0x7f02027b, 0x7f02027a, 0x7f02027d, 0x7f02027c, 0x7f02027e, 0x7f020278, 0x7f020279
        }, {
            0x7f02027f, 0x7f020281, 0x7f020280, 0x7f020282, 0x7f020285, 0x7f020286, 0x7f020284, 0x7f020283, 0x7f020287
        }, {
            0x7f020288, 0x7f02028b, 0x7f02028c, 0x7f020289, 0x7f02028a, 0x7f02028d, 0x7f02028f, 0x7f020290, 0x7f02028e
        }, {
            0x7f020291, 0x7f020296, 0x7f020294, 0x7f020292, 0x7f020295, 0x7f020298, 0x7f020293, 0x7f020297, 0x7f020299
        }, {
            0x7f02029a, 0x7f02029b, 0x7f02029c, 0x7f0202a2, 0x7f02029d, 0x7f02029f, 0x7f0202a0, 0x7f0202a1, 0x7f02029e
        }, {
            0x7f0202a3, 0x7f0202a4, 0x7f0202a5, 0x7f0202ab, 0x7f0202a6, 0x7f0202a9, 0x7f0202a8, 0x7f0202aa, 0x7f0202a7
        }
    };
    public int b[][];
    private PhotoGridActivity c;
    private int d;
    private ViewGroup e;
    private int f;
    private HorizontalScrollView g;
    private int h;
    private int i;
    private int j;
    private List k;
    private Random l;
    private boolean m;
    private boolean n;
    private String o;
    private boolean p;
    private String q;

    public fb()
    {
        l = new Random();
        n = false;
        o = "GridActivity";
        p = false;
        int ai[] = new int[0];
        int ai1[] = {
            0, 1, 2, 3, 4
        };
        int ai2[] = {
            2, 10, 11, 3, 4
        };
        int ai3[] = {
            0, 4, 2, 9, 7
        };
        int ai4[] = {
            0, 8, 6, 2, 1
        };
        int ai5[] = {
            7, 0, 2, 6, 8
        };
        int ai6[] = {
            0, 3, 2, 1, 7
        };
        int ai7[] = {
            0, 5, 3, 1, 2
        };
        int ai8[] = {
            0, 5, 1, 3, 4
        };
        int ai9[] = {
            0, 1, 2, 8, 6
        };
        b = (new int[][] {
            ai, ai1, ai2, new int[] {
                2, 6, 9, 10, 3
            }, new int[] {
                2, 1, 8, 7, 9
            }, new int[] {
                2, 7, 14, 6, 3
            }, ai3, ai4, new int[] {
                0, 2, 1, 12, 7
            }, ai5, 
            new int[] {
                0, 2, 6, 7, 1
            }, ai6, ai7, ai8, ai9, new int[] {
                0, 2, 7, 1, 5
            }
        });
    }

    static int a(fb fb1, int i1)
    {
        fb1.d = i1;
        return i1;
    }

    static boolean a(fb fb1)
    {
        return fb1.n;
    }

    static PhotoGridActivity b(fb fb1)
    {
        return fb1.c;
    }

    static String c(fb fb1)
    {
        return fb1.o;
    }

    static HorizontalScrollView d(fb fb1)
    {
        return fb1.g;
    }

    static int e(fb fb1)
    {
        return fb1.i;
    }

    static int f(fb fb1)
    {
        return fb1.d;
    }

    static ViewGroup g(fb fb1)
    {
        return fb1.e;
    }

    static boolean h(fb fb1)
    {
        return fb1.m;
    }

    static int i(fb fb1)
    {
        int i1;
        if (fb1.k != null)
        {
            if ((i1 = fb1.k.size()) != 0)
            {
                i1 = fb1.l.nextInt(i1);
                int j1 = Integer.valueOf((String)fb1.k.get(i1)).intValue();
                fb1.k.remove(i1);
                return j1;
            }
        }
        return -1;
    }

    static boolean j(fb fb1)
    {
        fb1.m = true;
        return true;
    }

    static int k(fb fb1)
    {
        return fb1.f;
    }

    static int l(fb fb1)
    {
        return fb1.j;
    }

    static int m(fb fb1)
    {
        return fb1.h;
    }

    static List n(fb fb1)
    {
        return fb1.k;
    }

    protected final void a()
    {
        boolean flag;
        flag = n;
        n = true;
        az.q;
        JVM INSTR tableswitch 0 10: default 72
    //                   0 142
    //                   1 72
    //                   2 72
    //                   3 72
    //                   4 160
    //                   5 187
    //                   6 72
    //                   7 72
    //                   8 72
    //                   9 205
    //                   10 213;
           goto _L1 _L2 _L1 _L1 _L1 _L3 _L4 _L1 _L1 _L1 _L5 _L6
_L1:
        View view;
        if (flag != n)
        {
            view = e.findViewWithTag("ratio");
            if (view != null)
            {
                if (!n)
                {
                    break; /* Loop/switch isn't completed */
                }
                ((TextView)view.findViewById(0x7f0d04c9)).setTextColor(getResources().getColor(0x7f0c00bf));
                getResources().getDrawable(0x7f0203dc).setAlpha(255);
            }
        }
        return;
_L2:
        if (ih.C().W() == 4)
        {
            n = false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!ih.C().g() || ih.C().W() == 4)
        {
            n = false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (ih.C().W() == 4)
        {
            n = false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        n = false;
        continue; /* Loop/switch isn't completed */
_L6:
        if (ih.C().W() == 4)
        {
            n = false;
        }
        if (true) goto _L1; else goto _L7
_L7:
        ((TextView)view.findViewById(0x7f0d04c9)).setTextColor(getResources().getColor(0x7f0c00c0));
        getResources().getDrawable(0x7f0203dc).setAlpha(50);
        return;
    }

    public final void a(String s)
    {
        q = s;
    }

    public final void b()
    {
        p = true;
    }

    public final void onAttach(Activity activity)
    {
        c = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = layoutinflater.inflate(0x7f0300b1, viewgroup, false);
        if (c == null || c.e == null)
        {
            return bundle;
        }
        e = (ViewGroup)bundle.findViewById(0x7f0d0289);
        g = (HorizontalScrollView)bundle.findViewById(0x7f0d0287);
        i = (int)getResources().getDimension(0x7f0900d4);
        j = getResources().getDisplayMetrics().widthPixels;
        az.q;
        JVM INSTR tableswitch 0 10: default 148
    //                   0 818
    //                   1 827
    //                   2 148
    //                   3 148
    //                   4 925
    //                   5 837
    //                   6 148
    //                   7 148
    //                   8 148
    //                   9 905
    //                   10 915;
           goto _L1 _L2 _L3 _L1 _L1 _L4 _L5 _L1 _L1 _L1 _L6 _L7
_L1:
        View view;
        Object obj1;
        view = layoutinflater.inflate(0x7f03012c, viewgroup, false);
        obj1 = (TextView)view.findViewById(0x7f0d04c9);
        ((TextView) (obj1)).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203dc, 0, 0);
        ((TextView) (obj1)).setText(c.getResources().getString(0x7f07025d));
        n = true;
        az.q;
        JVM INSTR tableswitch 0 10: default 268
    //                   0 935
    //                   1 268
    //                   2 268
    //                   3 268
    //                   4 956
    //                   5 986
    //                   6 268
    //                   7 268
    //                   8 268
    //                   9 1007
    //                   10 1018;
           goto _L8 _L9 _L8 _L8 _L8 _L10 _L11 _L8 _L8 _L8 _L12 _L13
_L8:
        boolean flag = true;
_L17:
        if (n)
        {
            ((TextView) (obj1)).setTextColor(getResources().getColor(0x7f0c00bf));
            Drawable drawable = getResources().getDrawable(0x7f0203dc);
            drawable.setAlpha(255);
            ((TextView) (obj1)).setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        } else
        {
            ((TextView) (obj1)).setTextColor(getResources().getColor(0x7f0c00c0));
            Drawable drawable1 = getResources().getDrawable(0x7f0203dc);
            drawable1.setAlpha(50);
            ((TextView) (obj1)).setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        }
        view.setTag("ratio");
        e.addView(view);
        view.setOnClickListener(new fc(this));
        h = c.e.length;
        d = ih.C().I();
        if (h == 1)
        {
            View view1 = layoutinflater.inflate(0x7f03012c, viewgroup, false);
            obj1 = (TextView)view1.findViewById(0x7f0d04c9);
            ((TextView) (obj1)).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203c8, 0, 0);
            ((TextView) (obj1)).setText(c.getResources().getString(0x7f0701f5));
            if (d == 0 && (ih.C().W() == 1 || ih.C().W() == 0))
            {
                view1.findViewById(0x7f0d0493).setVisibility(0);
            }
            view1.setTag("noMask");
            e.addView(view1);
            view1.setOnClickListener(new fd(this));
        }
        if (h > 1)
        {
            View view2 = layoutinflater.inflate(0x7f03012c, viewgroup, false);
            obj1 = (TextView)view2.findViewById(0x7f0d04c9);
            ((TextView) (obj1)).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203db, 0, 0);
            ((TextView) (obj1)).setText(c.getResources().getString(0x7f070254));
            view2.setOnClickListener(new fe(this));
            e.addView(view2);
        }
        if (h < 16)
        {
            k = ih.C().aG();
            int i1;
            if (k != null)
            {
                if (k.size() == 0)
                {
                    m = true;
                }
            } else
            {
                k = new ArrayList();
                int ai[] = b[h];
                j1 = ai.length;
                for (i1 = 0; i1 < j1; i1++)
                {
                    int k1 = ai[i1];
                    k.add(String.valueOf(k1));
                }

                ih.C().n(k);
            }
            f = a[h].length;
            i1 = 0;
            while (i1 < f) 
            {
                Object obj = layoutinflater.inflate(0x7f03012a, viewgroup, false);
                ((View) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(i, i));
                obj1 = (ImageView)((View) (obj)).findViewById(0x7f0d0494);
                int j1;
                try
                {
                    ((ImageView) (obj1)).setImageDrawable(c.getResources().getDrawable(a[h][i1]));
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    outofmemoryerror.printStackTrace();
                }
                if (h == 1)
                {
                    j1 = i1 + 1;
                } else
                {
                    j1 = i1;
                }
                ((View) (obj)).setTag(Integer.valueOf(j1));
                if (j1 == d)
                {
                    k.remove(String.valueOf(j1));
                    ((View) (obj)).findViewById(0x7f0d0493).setVisibility(0);
                }
                ((View) (obj)).setOnClickListener(new ff(this));
                e.addView(((View) (obj)));
                i1++;
            }
        } else
        {
            f = 0;
        }
          goto _L14
_L2:
        o = "GridActivity";
          goto _L1
_L3:
        o = "FreeActivity";
          goto _L1
_L5:
        switch (ih.C().W())
        {
        case 1: // '\001'
            o = "GridActivity/Single/Instagram";
            break;

        case 2: // '\002'
            o = "GridActivity/Single/Original";
            break;

        case 4: // '\004'
            o = "GridActivity/Single/Shape";
            break;
        }
        if (true) goto _L1; else goto _L15
_L15:
_L6:
        o = "VideoActivity/Single";
          goto _L1
_L7:
        o = "CameraActivity/Single";
          goto _L1
_L4:
        o = "GridActivity/Template";
          goto _L1
_L9:
        if (ih.C().W() != 4) goto _L8; else goto _L16
_L16:
        n = false;
        flag = true;
          goto _L17
_L10:
        if (ih.C().g() && ih.C().W() != 4) goto _L8; else goto _L18
_L18:
        n = false;
        flag = true;
          goto _L17
_L11:
        if (ih.C().W() != 4) goto _L8; else goto _L19
_L19:
        n = false;
        flag = true;
          goto _L17
_L12:
        n = false;
_L20:
        flag = false;
          goto _L17
_L13:
        if (ih.C().W() == 4)
        {
            n = false;
        }
          goto _L20
_L14:
        if (!flag) goto _L22; else goto _L21
_L21:
        layoutinflater = layoutinflater.inflate(0x7f03012a, viewgroup, false);
        viewgroup = (ImageView)layoutinflater.findViewById(0x7f0d0494);
        ai = q;
        if (TextUtils.isEmpty(ai)) goto _L24; else goto _L23
_L23:
        com.bumptech.glide.h.a(this).a(ai).g().a(viewgroup);
_L25:
        layoutinflater.setBackgroundResource(0x7f020093);
_L26:
        layoutinflater.setTag("templateEntry");
        e.addView(layoutinflater);
        layoutinflater.setOnClickListener(new fg(this));
        if (p)
        {
            g.postDelayed(new fh(this), 600L);
        }
_L22:
        return bundle;
_L24:
        viewgroup.setImageDrawable(c.getResources().getDrawable(0x7f0203b1));
          goto _L25
        viewgroup;
        viewgroup.printStackTrace();
          goto _L26
    }
}
