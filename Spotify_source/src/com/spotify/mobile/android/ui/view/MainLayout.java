// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import gay;
import geg;

public class MainLayout extends ViewGroup
{

    public SnackBar a;
    public gay b;
    private int c;
    private View d;
    private ViewGroup e;
    private View f;

    public MainLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private static int b(View view)
    {
        int j = view.getId();
        int i = j;
        if (j < 0)
        {
            i = j;
            if (view instanceof ViewGroup)
            {
                view = ((ViewGroup)view).getChildAt(0);
                i = j;
                if (view != null)
                {
                    i = view.getId();
                }
            }
        }
        return i;
    }

    public final void a(View view)
    {
        if (f != null)
        {
            removeView(f);
        }
        f = view;
        if (f != null)
        {
            addView(f);
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (SnackBar)findViewById(0x7f110408);
        e = (ViewGroup)findViewById(0x7f110409);
        d = findViewById(0x7f11040a);
        c = ActionBarManager.a(getContext());
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = c;
        i = getHeight();
        k = a.getMeasuredHeight();
        l = getHeight();
        a.layout(0, i - k, getWidth(), l);
        i = getHeight();
        k = a.getMeasuredHeight();
        e.layout(0, j, getWidth(), i - k);
        if (f != null)
        {
            f.layout(0, 0, getMeasuredWidth(), f.getMeasuredHeight());
        }
        i = 0;
        while (i < getChildCount()) 
        {
            View view = getChildAt(i);
            if (view != f)
            {
                switch (b(view))
                {
                default:
                    if (b != null && b.a(view))
                    {
                        view.layout(0, 0, getWidth(), getMeasuredHeight() - a.a);
                    } else
                    {
                        view.layout(0, j, getWidth(), getMeasuredHeight() - a.a);
                    }
                    break;

                case 2131821246: 
                case 2131821576: 
                case 2131821577: 
                case 2131821578: 
                    break;
                }
            }
            i++;
        }
        e.bringToFront();
        d.layout(0, 0, getWidth(), getHeight());
        d.bringToFront();
        a.bringToFront();
        if (f != null)
        {
            f.bringToFront();
        }
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(j));
        j = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        i = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
        a.measure(j, geg.a());
        e.measure(j, i);
        d.measure(j, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000));
        if (f != null)
        {
            f.measure(j, geg.a(c));
        }
        i = getMeasuredHeight() - a.a;
        int k = android.view.View.MeasureSpec.makeMeasureSpec(i - c, 0x40000000);
        int l = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        i = 0;
        boolean flag1 = false;
        while (i < getChildCount()) 
        {
            View view = getChildAt(i);
            boolean flag = flag1;
            if (view != f)
            {
                flag = flag1;
                switch (b(view))
                {
                default:
                    if (b != null && b.a(view))
                    {
                        view.measure(j, l);
                        flag = true;
                    } else
                    {
                        view.measure(j, k);
                        flag = false;
                    }
                    break;

                case 2131821246: 
                case 2131821576: 
                case 2131821577: 
                case 2131821578: 
                    break;
                }
            }
            i++;
            flag1 = flag;
        }
        if (b != null)
        {
            b.a(flag1);
        }
    }
}
