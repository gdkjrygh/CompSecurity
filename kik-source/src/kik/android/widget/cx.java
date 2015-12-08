// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import kik.android.util.DeviceUtils;

// Referenced classes of package kik.android.widget:
//            cy, cz

public class cx extends PopupWindow
{

    int a[];
    private View b;
    private boolean c;
    private android.view.ViewTreeObserver.OnScrollChangedListener d;
    private int e;
    private final android.view.View.OnTouchListener f = new cz(this);

    public cx(View view)
    {
        super(view, -2, -2);
        a = new int[2];
        d = new cy(this);
        e = 0;
    }

    private void a()
    {
        if (b != null)
        {
            b.getViewTreeObserver().removeOnScrollChangedListener(d);
        }
    }

    static int[] a(cx cx1)
    {
        return cx1.b();
    }

    private int[] b()
    {
        int ai[] = new int[2];
        if (b != null)
        {
            b.getLocationInWindow(ai);
        }
        return ai;
    }

    public final void a(View view, View view1)
    {
        b = view;
        if (getBackground() == null)
        {
            setBackgroundDrawable(new BitmapDrawable());
        }
        View view2 = getContentView();
        int i = view2.getResources().getDisplayMetrics().widthPixels;
        view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(view2.getResources().getDisplayMetrics().heightPixels, 0x80000000));
        int k = view2.getMeasuredHeight();
        float f3 = view2.getMeasuredWidth();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int l = ai[0];
        int i1 = ai[1];
        float f2 = (float)view.getMeasuredWidth() / 2.0F;
        float f1 = ((float)l + f2) - f3 / 2.0F;
        View view3;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
        int j;
        if (f1 + f3 > (float)i)
        {
            f1 = (float)i - f3;
        } else
        if (f1 < 0.0F)
        {
            f1 = 0.0F;
        }
        if (view1 != null)
        {
            int ai1[] = new int[2];
            int ai2[] = new int[2];
            view1.getLocationInWindow(ai1);
            view1.getLocationOnScreen(ai2);
            j = ai1[0];
            int k1 = ai2[0];
            i = ai1[1];
            int j1 = ai2[1];
            j -= k1;
            i -= j1;
        } else
        {
            j = 0;
            i = 0;
        }
        view3 = view2.findViewById(0x7f0e0098);
        if (view3 == null) goto _L2; else goto _L1
_L4:
        f3 = (float)view3.getMeasuredWidth() / 2.0F;
        marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view3.getLayoutParams();
        marginlayoutparams.setMargins((int)(((float)l + f2) - f1 - f3 - (float)view2.getPaddingLeft()), marginlayoutparams.topMargin, marginlayoutparams.rightMargin, marginlayoutparams.bottomMargin);
        view3.setLayoutParams(marginlayoutparams);
_L2:
        if (view1 != null)
        {
            view = view1;
        }
        showAtLocation(view, 0, j + (int)f1, i + (i1 - k) + e);
        view = b();
        a[0] = view[0];
        a[1] = view[1];
        if (c)
        {
            a();
            if (b != null)
            {
                b.getViewTreeObserver().addOnScrollChangedListener(d);
            }
        }
        return;
_L1:
        if (view3 == null || view2 == null || view3.getParent() == view2 || !DeviceUtils.c()) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException("Indicator must be a direct child of the root hint view for placement to work properly");
    }

    public void dismiss()
    {
        super.dismiss();
        a();
    }
}
