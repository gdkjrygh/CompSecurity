// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Selection;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.roidapp.photogrid.common.az;
import java.util.Random;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ra, af, gb, 
//            gc, gd, PhotoView, az

public final class ga extends Fragment
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private boolean a;
    private EditText b;
    private ra c;
    private PhotoGridActivity d;
    private InputMethodManager e;
    private ImageView f;
    private ImageView g;
    private int h;
    private int i;
    private int j;

    public ga()
    {
    }

    static int a(AbsListView abslistview)
    {
        if (abslistview == null || abslistview.getChildAt(0) == null)
        {
            return 0;
        } else
        {
            return abslistview.getChildAt(0).getTop();
        }
    }

    static EditText a(ga ga1)
    {
        return ga1.b;
    }

    public static ga a(ra ra1)
    {
        ga ga1 = new ga();
        ga1.c = ra1;
        return ga1;
    }

    static boolean a(ga ga1, int k)
    {
        return k == ga1.j;
    }

    static int b(ga ga1)
    {
        return ga1.i;
    }

    static int b(ga ga1, int k)
    {
        ga1.i = k;
        return k;
    }

    static int c(ga ga1)
    {
        return ga1.h;
    }

    static int c(ga ga1, int k)
    {
        ga1.j = k;
        return k;
    }

    private void c()
    {
        if (b != null)
        {
            b.clearFocus();
        }
        if (e != null)
        {
            e.hideSoftInputFromWindow(b.getWindowToken(), 0);
        }
    }

    static void d(ga ga1)
    {
        ga1.c();
    }

    static int e(ga ga1)
    {
        return ga1.j;
    }

    static InputMethodManager f(ga ga1)
    {
        return ga1.e;
    }

    static void g(ga ga1)
    {
        if (ga1.b != null)
        {
            ga1.b.requestFocus();
        }
        if (ga1.e != null)
        {
            ga1.e.showSoftInput(ga1.b, 0);
        }
    }

    public final String a()
    {
        if (b != null)
        {
            return b.getText().toString();
        } else
        {
            return null;
        }
    }

    public final void b()
    {
        AnimationSet animationset = new AnimationSet(true);
        ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 1.5F, 1.0F, 1.5F, 1, 0.5F, 1, 0.5F);
        scaleanimation.setDuration(500L);
        animationset.setFillAfter(false);
        animationset.setInterpolator(new DecelerateInterpolator());
        animationset.addAnimation(scaleanimation);
        f.startAnimation(animationset);
        g.startAnimation(animationset);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d = (PhotoGridActivity)activity;
        boolean flag;
        if (az.q == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public final void onClick(View view)
    {
        if (d == null || d.h() || d.isFinishing())
        {
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131558444: 
            if (a)
            {
                c.a(b.getText().toString());
                c();
                getFragmentManager().beginTransaction().remove(this).commit();
                return;
            }
            break;

        case 2131559018: 
            getFragmentManager().beginTransaction().remove(this).commit();
            return;
        }
        view = c.e();
        af af2;
        try
        {
            c.a(b.getText().toString());
            float af1[] = c.e();
            c.a(new PointF(view[0], view[1]), new PointF(af1[0], af1[1]));
            c.ak = false;
            c();
            getFragmentManager().beginTransaction().remove(this).commit();
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            af2 = new af();
        }
        getChildFragmentManager().beginTransaction().add(af2, "oomFragment").commit();
        float af3[] = c.e();
        c.a(new PointF(view[0], view[1]), new PointF(af3[0], af3[1]));
        c.ak = true;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (c == null)
        {
            return null;
        }
        layoutinflater = layoutinflater.inflate(0x7f0300be, viewgroup, false);
        e = (InputMethodManager)getActivity().getSystemService("input_method");
        b = (EditText)layoutinflater.findViewById(0x7f0d030e);
        b.setText(c.r());
        viewgroup = (LevelListDrawable)b.getCompoundDrawables()[2];
        b.setOnTouchListener(new gb(this, viewgroup));
        Selection.setSelection(b.getText(), b.length());
        f = (ImageView)layoutinflater.findViewById(0x7f0d030d);
        g = (ImageView)layoutinflater.findViewById(0x7f0d030f);
        layoutinflater.findViewById(0x7f0d026a).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d002c).setOnClickListener(this);
        if (a)
        {
            viewgroup = getResources().getDisplayMetrics();
            h = (int)TypedValue.applyDimension(1, 4F, viewgroup);
            b.getLayoutParams().height = (int)(3F * getResources().getDimension(0x7f09009d));
            bundle = getResources().getStringArray(0x7f080003);
            Object obj = new Random();
            int l = bundle.length;
            for (int k = 0; k < l; k++)
            {
                int i1 = ((Random) (obj)).nextInt(l - k) + k;
                if (k != i1)
                {
                    Object obj1 = bundle[k];
                    bundle[k] = bundle[i1];
                    bundle[i1] = obj1;
                }
            }

            obj = new StateListDrawable();
            Object obj2 = new ColorDrawable(0xff3d3d3d);
            ((StateListDrawable) (obj)).addState(new int[] {
                0x10100a7
            }, ((android.graphics.drawable.Drawable) (obj2)));
            obj2 = new ColorDrawable(0);
            ((StateListDrawable) (obj)).addState(new int[0], ((android.graphics.drawable.Drawable) (obj2)));
            obj2 = (LinearLayout)layoutinflater.findViewById(0x7f0d030c);
            ListView listview = new ListView(d);
            listview.setScrollBarStyle(0x2000000);
            listview.setOnItemClickListener(this);
            listview.setSelector(((android.graphics.drawable.Drawable) (obj)));
            listview.setDrawSelectorOnTop(false);
            listview.setBackgroundColor(0xff4d4d4d);
            listview.setCacheColorHint(0);
            listview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            listview.setDivider(new ColorDrawable(0xff797979));
            listview.setDividerHeight((int)TypedValue.applyDimension(1, 1.0F, viewgroup));
            listview.setAdapter(new ArrayAdapter(getActivity(), 0x7f0300e8, 0x7f0d03ae, bundle));
            listview.setOnScrollListener(new gc(this));
            ((LinearLayout) (obj2)).addView(listview);
        } else
        {
            b.getViewTreeObserver().addOnPreDrawListener(new gd(this));
        }
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        if (e != null && b != null && e.isActive(b))
        {
            c();
            e = null;
        }
        if (c != null && c.B())
        {
            if (c.ak)
            {
                float af1[] = c.e();
                c.a(c.L);
                float af2[] = c.e();
                c.a(new PointF(af1[0], af1[1]), new PointF(af2[0], af2[1]));
            }
            c.D();
            Object obj = d.O();
            if (obj != null)
            {
                if (c.A() && !a)
                {
                    ((PhotoView) (obj)).a(c);
                } else
                {
                    ((PhotoView) (obj)).invalidate();
                }
            }
            obj = d.P();
            if (obj != null)
            {
                ((com.roidapp.photogrid.release.az) (obj)).setVisibility(0);
            }
            if (a)
            {
                d.K();
            }
            if (c.f && !d.i && !a)
            {
                d.H();
            }
            c = null;
        }
        e = null;
        c = null;
        b = null;
        d = null;
    }

    public final void onItemClick(AdapterView adapterview, View view, int k, long l)
    {
        adapterview = (BaseAdapter)adapterview.getAdapter();
        if (adapterview != null && b != null)
        {
            adapterview = (String)adapterview.getItem(k);
            b.setText(adapterview);
        }
    }
}
