// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.p;
import com.roidapp.photogrid.common.az;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, az, cz, ih

public final class cy extends Fragment
    implements android.view.View.OnClickListener
{

    private TextView a;
    private TextView b;
    private TextView c;
    private Integer d;
    private PhotoGridActivity e;
    private int f;
    private CheckedTextView g[];
    private RelativeLayout h;
    private RelativeLayout i;
    private RelativeLayout j;
    private RelativeLayout k;
    private RelativeLayout l;
    private RelativeLayout m;
    private int n;
    private HorizontalScrollView o;
    private String p;
    private boolean q;
    private HorizontalScrollView r;
    private int s;
    private int t;

    public cy()
    {
        f = 0xfffa0029;
        n = 3;
        q = false;
    }

    static int a(cy cy1, int i1)
    {
        cy1.f = i1;
        return i1;
    }

    static PhotoGridActivity a(cy cy1)
    {
        return cy1.e;
    }

    static Integer a(cy cy1, Integer integer)
    {
        cy1.d = integer;
        return integer;
    }

    private void a(int i1)
    {
        CheckedTextView acheckedtextview[] = g;
        int k1 = acheckedtextview.length;
        int j1 = 0;
        while (j1 < k1) 
        {
            CheckedTextView checkedtextview = acheckedtextview[j1];
            StateListDrawable statelistdrawable = new StateListDrawable();
            GradientDrawable gradientdrawable = new GradientDrawable();
            gradientdrawable.setShape(1);
            gradientdrawable.setColor(i1);
            GradientDrawable gradientdrawable1 = new GradientDrawable();
            gradientdrawable1.setShape(1);
            gradientdrawable1.setColor(0xff636c76);
            statelistdrawable.addState(new int[] {
                0x10100a0
            }, gradientdrawable);
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, gradientdrawable);
            statelistdrawable.addState(new int[0], gradientdrawable1);
            if (com.roidapp.baselib.c.n.g())
            {
                checkedtextview.setBackground(statelistdrawable);
            } else
            {
                checkedtextview.setBackgroundDrawable(statelistdrawable);
            }
            j1++;
        }
    }

    static HorizontalScrollView b(cy cy1)
    {
        return cy1.r;
    }

    private void b(int i1)
    {
        int j1 = 0;
        while (j1 < g.length) 
        {
            if (j1 == i1)
            {
                g[j1].setChecked(true);
                n = i1 + 1;
            } else
            {
                g[j1].setChecked(false);
            }
            j1++;
        }
    }

    static void b(cy cy1, int i1)
    {
        cy1.a(i1);
    }

    static int c(cy cy1)
    {
        return cy1.t;
    }

    static void c(cy cy1, int i1)
    {
        cy1.b(i1);
    }

    static int d(cy cy1)
    {
        return cy1.s;
    }

    static Integer e(cy cy1)
    {
        return cy1.d;
    }

    static int f(cy cy1)
    {
        return cy1.n;
    }

    public final void a()
    {
        if (o != null && o.getVisibility() == 0)
        {
            o.setVisibility(8);
        }
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            c.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f02037b, 0, 0);
            c.setTextColor(getResources().getColor(0x7f0c00bf));
            return;
        } else
        {
            Drawable drawable = getResources().getDrawable(0x7f02037b);
            drawable.setAlpha(165);
            c.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            c.setTextColor(getResources().getColor(0x7f0c00c0));
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        e = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        com.roidapp.photogrid.release.az az1 = e.P();
        if (az1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (view.getId())
        {
        case 2131559061: 
        case 2131559063: 
        case 2131559065: 
        case 2131559067: 
        case 2131559069: 
        case 2131559071: 
        default:
            return;

        case 2131559070: 
            continue; /* Loop/switch isn't completed */

        case 2131559058: 
            a.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020389, 0, 0);
            b.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203d0, 0, 0);
            b.setText(0x7f07022a);
            c.setVisibility(0);
            if (az1.a().size() > 0)
            {
                c.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f02037b, 0, 0);
            } else
            {
                view = getResources().getDrawable(0x7f02037b);
                view.setAlpha(165);
                c.setCompoundDrawablesWithIntrinsicBounds(null, view, null, null);
            }
            h.setVisibility(8);
            i.setVisibility(8);
            m.setVisibility(0);
            q = true;
            if (n == 1 || n == 2)
            {
                n = 3;
                az1.a(6F);
            }
            a(-1);
            b(n - 1);
            a();
            az1.a(0);
            az1.invalidate();
            return;

        case 2131559059: 
            a.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020388, 0, 0);
            b.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203ce, 0, 0);
            b.setText(0x7f07010d);
            c.setVisibility(8);
            h.setVisibility(0);
            i.setVisibility(0);
            m.setVisibility(8);
            q = false;
            if (n == 6)
            {
                n = 3;
                az1.a(6F);
            }
            a(f);
            b(n - 1);
            if (o.getVisibility() == 8)
            {
                o.setVisibility(0);
            } else
            if (o.getVisibility() == 0)
            {
                o.setVisibility(8);
            }
            az1.a(f);
            az1.invalidate();
            return;

        case 2131559072: 
            if (az1.a().size() > 0)
            {
                az1.i();
                az1.invalidate();
                return;
            }
            break;

        case 2131559060: 
            b(0);
            az1.a(2.0F);
            return;

        case 2131559062: 
            b(1);
            az1.a(4F);
            return;

        case 2131559064: 
            b(2);
            az1.a(6F);
            return;

        case 2131559066: 
            b(3);
            az1.a(9F);
            return;

        case 2131559068: 
            b(4);
            az1.a(12F);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!q) goto _L1; else goto _L4
_L4:
        b(5);
        az1.a(15F);
        return;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300ae, null);
        r = (HorizontalScrollView)viewgroup.findViewById(0x7f0d0290);
        bundle = (ViewGroup)viewgroup.findViewById(0x7f0d0291);
        s = (int)getResources().getDimension(0x7f0900d1);
        t = getResources().getDisplayMetrics().widthPixels;
        int ai[] = com.roidapp.baselib.c.p.a().i;
        for (int i1 = 0; i1 < ai.length; i1++)
        {
            int j1 = ai[i1];
            int k1 = i1 + 10000;
            View view = layoutinflater.inflate(0x7f030129, null);
            ImageView imageview = (ImageView)view.findViewById(0x7f0d0494);
            ImageView imageview1 = (ImageView)view.findViewById(0x7f0d0493);
            view.setId(k1);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(s / 2, s));
            imageview1.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(s / 2, s));
            imageview.setBackgroundColor(j1);
            view.setTag(Integer.valueOf(i1));
            if (i1 == 3)
            {
                view.findViewById(0x7f0d0493).setVisibility(0);
                d = Integer.valueOf(k1);
            }
            view.setOnClickListener(new cz(this, bundle, view, k1, j1));
            bundle.addView(view);
        }

        b = (TextView)viewgroup.findViewById(0x7f0d0293);
        a = (TextView)viewgroup.findViewById(0x7f0d0292);
        c = (TextView)viewgroup.findViewById(0x7f0d02a0);
        g = (new CheckedTextView[] {
            (CheckedTextView)viewgroup.findViewById(0x7f0d0295), (CheckedTextView)viewgroup.findViewById(0x7f0d0297), (CheckedTextView)viewgroup.findViewById(0x7f0d0299), (CheckedTextView)viewgroup.findViewById(0x7f0d029b), (CheckedTextView)viewgroup.findViewById(0x7f0d029d), (CheckedTextView)viewgroup.findViewById(0x7f0d029f)
        });
        h = (RelativeLayout)viewgroup.findViewById(0x7f0d0294);
        i = (RelativeLayout)viewgroup.findViewById(0x7f0d0296);
        j = (RelativeLayout)viewgroup.findViewById(0x7f0d0298);
        k = (RelativeLayout)viewgroup.findViewById(0x7f0d029a);
        l = (RelativeLayout)viewgroup.findViewById(0x7f0d029c);
        m = (RelativeLayout)viewgroup.findViewById(0x7f0d029e);
        o = (HorizontalScrollView)viewgroup.findViewById(0x7f0d0290);
        b.setOnClickListener(this);
        a.setOnClickListener(this);
        c.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        a(f);
        b(n - 1);
        switch (az.q)
        {
        case 2: // '\002'
        case 3: // '\003'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        default:
            p = "GridActivity";
            return viewgroup;

        case 0: // '\0'
            p = "GridActivity";
            return viewgroup;

        case 1: // '\001'
            p = "FreeActivity";
            return viewgroup;

        case 4: // '\004'
            p = "GridActivity/Template";
            return viewgroup;

        case 5: // '\005'
            if (ih.C().W() == 1)
            {
                p = "GridActivity/Single/Instagram";
                return viewgroup;
            } else
            {
                p = "GridActivity/Single/Original";
                return viewgroup;
            }

        case 9: // '\t'
            p = "VideoActivity/Single";
            return viewgroup;

        case 10: // '\n'
            p = "CameraActivity/Single";
            return viewgroup;
        }
    }
}
