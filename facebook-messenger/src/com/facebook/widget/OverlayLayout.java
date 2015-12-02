// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.debug.d.e;

// Referenced classes of package com.facebook.widget:
//            f, k

public class OverlayLayout extends f
{

    public OverlayLayout(Context context)
    {
        super(context);
    }

    public OverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OverlayLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public k a(AttributeSet attributeset)
    {
        return new k(getContext(), attributeset);
    }

    protected k a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new k(layoutparams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof k;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        e e1 = e.a("Overlayout.dispatchDraw");
        super.dispatchDraw(canvas);
        e1.a();
        return;
        canvas;
        e1.a();
        throw canvas;
    }

    protected k g()
    {
        return new k(-1, -1);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return g();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    protected void layoutChild(int i, int j, int l, int i1, View view)
    {
        k k1 = (k)view.getLayoutParams();
        if (!k1.a)
        {
            super.layoutChild(i, j, l, i1, view);
        } else
        {
            j = k1.b;
            if (j != -1)
            {
                View view1 = findViewById(j);
                if (view1 != null)
                {
                    Rect rect = new Rect();
                    Rect rect1 = new Rect();
                    view1.getGlobalVisibleRect(rect);
                    getGlobalVisibleRect(rect1);
                    rect.offset(-rect1.left, -rect1.top);
                    int j1 = k1.c;
                    j = view.getMeasuredWidth();
                    i1 = view.getMeasuredHeight();
                    if ((j1 & 1) == 1)
                    {
                        l = rect.bottom + k1.topMargin;
                    } else
                    if ((j1 & 2) == 2)
                    {
                        l = rect.top - i1 - k1.bottomMargin;
                    } else
                    if ((j1 & 4) == 4)
                    {
                        l = rect.top + k1.topMargin;
                    } else
                    if ((j1 & 8) == 8)
                    {
                        l = rect.bottom - i1 - k1.bottomMargin;
                    } else
                    if ((j1 & 0x100) == 256)
                    {
                        l = ((rect.bottom + rect.top) - i1) / 2 + (k1.topMargin - k1.bottomMargin) / 2;
                    }
                    if ((j1 & 0x10) == 16)
                    {
                        i = rect.left - j - k1.rightMargin;
                    } else
                    if ((j1 & 0x20) == 32)
                    {
                        i = rect.right + k1.leftMargin;
                    } else
                    if ((j1 & 0x40) == 64)
                    {
                        i = rect.left + k1.leftMargin;
                    } else
                    if ((j1 & 0x80) == 128)
                    {
                        i = rect.right - j - k1.rightMargin;
                    } else
                    if ((j1 & 0x200) == 512)
                    {
                        i = ((rect.right + rect.left) - j) / 2 + (k1.leftMargin - k1.rightMargin) / 2;
                    }
                    view.layout(i, l, i + j, l + i1);
                    return;
                }
            }
        }
    }

    protected void onLayout(boolean flag, int i, int j, int l, int i1)
    {
        e e1 = e.a("Overlayout.onLayout");
        super.onLayout(flag, i, j, l, i1);
        e1.a();
        return;
        Exception exception;
        exception;
        e1.a();
        throw exception;
    }

    protected void onMeasure(int i, int j)
    {
        e e1 = e.a("Overlayout.onMeasure");
        super.onMeasure(i, j);
        e1.a();
        return;
        Exception exception;
        exception;
        e1.a();
        throw exception;
    }
}
