// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

// Referenced classes of package kik.android.widget:
//            dj

public class ScreenWidthContainer extends FrameLayout
{

    private int a;
    private boolean b;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener c;

    public ScreenWidthContainer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ScreenWidthContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = false;
        c = new dj(this);
        context = context.obtainStyledAttributes(attributeset, kik.android.ag.b.q);
        a = context.getDimensionPixelOffset(0, 0);
        context.recycle();
    }

    private void a()
    {
        getViewTreeObserver().removeGlobalOnLayoutListener(c);
    }

    static void a(ScreenWidthContainer screenwidthcontainer)
    {
        Object obj = screenwidthcontainer.getRootView();
        if (obj != null)
        {
            int i = Math.max(0, ((View) (obj)).getMeasuredWidth() + screenwidthcontainer.a);
            obj = screenwidthcontainer.getLayoutParams();
            if (((android.view.ViewGroup.LayoutParams) (obj)).width != i)
            {
                obj.width = i;
                obj.height = -1;
                screenwidthcontainer.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a();
        getViewTreeObserver().addOnGlobalLayoutListener(c);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = true;
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (b)
        {
            b = false;
            if (layoutparams != null)
            {
                int i = getContext().getResources().getDisplayMetrics().widthPixels;
                if (i > 0)
                {
                    layoutparams.width = i;
                }
            }
        }
        super.setLayoutParams(layoutparams);
    }
}
