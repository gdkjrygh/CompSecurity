// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.baselib.b.a;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.d;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.o;

final class m extends ViewGroup
{

    private final int a = d.a(getResources(), 4F);

    public m(Context context)
    {
        super(context);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        TextView textview = new TextView(getContext());
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginlayoutparams.topMargin = a * 4;
        marginlayoutparams.bottomMargin = a * 2;
        marginlayoutparams.leftMargin = a * 2;
        textview.setLayoutParams(marginlayoutparams);
        textview.setText(context.getString(at.aQ));
        textview.setTextSize(2, 18F);
        addView(textview);
        for (int i = 0; i < 5; i++)
        {
            context = new FrameLayout(getContext());
            context.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -1));
            Object obj = new StateListDrawable();
            ColorDrawable colordrawable = new ColorDrawable(0xa0396cec);
            ((StateListDrawable) (obj)).addState(new int[] {
                0x10100a7
            }, colordrawable);
            colordrawable = new ColorDrawable(0);
            ((StateListDrawable) (obj)).addState(new int[0], colordrawable);
            context.setForeground(((android.graphics.drawable.Drawable) (obj)));
            obj = new ImageView(getContext());
            ((ImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            ((ImageView) (obj)).setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -1));
            context.addView(((View) (obj)));
            addView(context);
        }

    }

    public final void a(Fragment fragment, e e1, android.view.View.OnClickListener onclicklistener)
    {
        if (e1 != null && !e1.isEmpty() && e1.size() >= 5)
        {
            int i = 0;
            while (i < e1.size()) 
            {
                n n1 = (n)e1.get(i);
                FrameLayout framelayout = (FrameLayout)getChildAt(i + 1);
                ImageView imageview = (ImageView)framelayout.getChildAt(0);
                framelayout.setOnClickListener(onclicklistener);
                framelayout.setTag(n1);
                if (i == 0)
                {
                    h.a(fragment).a(n1.a.f).g().b(com.roidapp.baselib.b.a.b()).a(com.bumptech.glide.load.b.e.c).a(imageview);
                } else
                {
                    h.a(fragment).a(n1.a.e).g().b(com.roidapp.baselib.b.a.b()).a(imageview);
                }
                i++;
            }
        }
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = 0;
        i = 0;
        l = getChildCount();
        k = 0;
        while (k < l) 
        {
            View view = getChildAt(k);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
            if (view instanceof TextView)
            {
                view.layout(marginlayoutparams.leftMargin, marginlayoutparams.topMargin, view.getMeasuredWidth() + marginlayoutparams.leftMargin, view.getMeasuredHeight() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin);
                int i1 = view.getMeasuredHeight();
                int i2 = marginlayoutparams.topMargin;
                j = marginlayoutparams.bottomMargin + (i1 + i2) + j;
            } else
            if (k == 1 || k == 4)
            {
                view.layout(marginlayoutparams.leftMargin, marginlayoutparams.topMargin + j, view.getMeasuredWidth(), view.getMeasuredHeight() + j);
                i = view.getMeasuredWidth();
                int j1 = marginlayoutparams.leftMargin;
                i = marginlayoutparams.rightMargin + (i + j1);
            } else
            if (k == 2 || k == 3)
            {
                view.layout(marginlayoutparams.leftMargin + i, marginlayoutparams.topMargin + j, view.getMeasuredWidth() + i + marginlayoutparams.leftMargin, view.getMeasuredHeight() + j + marginlayoutparams.topMargin);
                int k1 = view.getMeasuredHeight();
                int j2 = marginlayoutparams.topMargin;
                j = marginlayoutparams.bottomMargin + (k1 + j2) + j;
            } else
            {
                int l1 = marginlayoutparams.leftMargin;
                int k2 = marginlayoutparams.topMargin;
                int l2 = view.getMeasuredWidth();
                int i3 = marginlayoutparams.leftMargin;
                int j3 = view.getMeasuredHeight();
                view.layout(l1 + i, k2 + j, l2 + i + i3, marginlayoutparams.topMargin + (j3 + j));
            }
            k++;
        }
    }

    protected final void onMeasure(int i, int j)
    {
        int i1;
        int k1;
        int k = android.view.View.MeasureSpec.getMode(i);
        k1 = android.view.View.MeasureSpec.getSize(i);
        int l1;
        int i2;
        int j3;
        switch (k)
        {
        default:
            i1 = 0;
            break;

        case -2147483648: 
        case 1073741824: 
            i1 = k1;
            continue;
        }
        break;
        do
        {
            l1 = getChildCount();
            int j1 = 0;
            int l = 0;
            while (j1 < l1) 
            {
                View view = getChildAt(j1);
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
                if (view instanceof TextView)
                {
                    measureChild(view, i, j);
                    i2 = view.getMeasuredHeight();
                    j3 = marginlayoutparams.topMargin;
                    l = marginlayoutparams.bottomMargin + (i2 + j3) + l;
                } else
                if (j1 == 1)
                {
                    int k3 = (i1 * 2) / 3;
                    marginlayoutparams.rightMargin = a / 2;
                    marginlayoutparams.bottomMargin = a / 2;
                    int j2 = Math.max(0, k3 - marginlayoutparams.leftMargin - marginlayoutparams.rightMargin);
                    k3 = Math.max(0, k3 - marginlayoutparams.topMargin - marginlayoutparams.bottomMargin);
                    measureChild(view, android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k3, 0x40000000));
                    l = view.getMeasuredHeight() + l;
                } else
                if (j1 == 2)
                {
                    int l3 = k1 / 3;
                    marginlayoutparams.leftMargin = a / 2;
                    marginlayoutparams.bottomMargin = a / 2;
                    int k2 = Math.max(0, l3 - marginlayoutparams.leftMargin - marginlayoutparams.rightMargin);
                    l3 = Math.max(0, l3 - marginlayoutparams.topMargin - marginlayoutparams.bottomMargin);
                    measureChild(view, android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l3, 0x40000000));
                } else
                if (j1 == 3)
                {
                    int i4 = k1 / 3;
                    marginlayoutparams.leftMargin = a / 2;
                    marginlayoutparams.topMargin = a / 2;
                    marginlayoutparams.bottomMargin = a / 2;
                    int l2 = Math.max(0, i4 - marginlayoutparams.leftMargin - marginlayoutparams.rightMargin);
                    i4 = Math.max(0, i4 - marginlayoutparams.topMargin - marginlayoutparams.bottomMargin);
                    measureChild(view, android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i4, 0x40000000));
                } else
                {
                    int j4 = k1 / 2;
                    int i3;
                    if (j1 == 4)
                    {
                        marginlayoutparams.rightMargin = a / 2;
                    } else
                    {
                        marginlayoutparams.leftMargin = a / 2;
                    }
                    marginlayoutparams.topMargin = a / 2;
                    i3 = Math.max(0, j4 - marginlayoutparams.leftMargin - marginlayoutparams.rightMargin);
                    j4 = Math.max(0, j4 - marginlayoutparams.topMargin - marginlayoutparams.bottomMargin);
                    measureChild(view, android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j4, 0x40000000));
                    if (j1 == 4)
                    {
                        l = view.getMeasuredHeight() + l;
                    }
                }
                j1++;
            }
            setMeasuredDimension(i1, l);
            return;
        } while (true);
    }
}
