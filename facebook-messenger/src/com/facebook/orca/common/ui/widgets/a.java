// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.common.a.c;
import com.facebook.common.w.j;
import com.facebook.debug.log.b;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;

// Referenced classes of package com.facebook.orca.common.ui.widgets:
//            b, c, d

public class a
{

    private static final Class a = com/facebook/orca/common/ui/widgets/a;
    private final Context b;
    private final LayoutInflater c;
    private View d;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener e;
    private PopupWindow f;
    private c g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private long l;

    public a(Context context, LayoutInflater layoutinflater)
    {
        k = 48;
        l = 3000L;
        b = context;
        c = layoutinflater;
        i = com.facebook.common.w.j.a(context, 33F);
    }

    static void a(a a1)
    {
        a1.b();
    }

    private void b()
    {
        if (f == null)
        {
            return;
        }
        int ai[] = new int[2];
        d.getLocationInWindow(ai);
        if (k == 48)
        {
            f.update(ai[0], ai[1] - i, h, i);
            return;
        } else
        {
            f.update(ai[0], ai[1] + d.getHeight(), h, i);
            return;
        }
    }

    public void a()
    {
        if (f != null)
        {
            f.dismiss();
            f = null;
        }
        if (g != null)
        {
            g.a();
            g = null;
        }
        if (e != null)
        {
            d.getViewTreeObserver().removeGlobalOnLayoutListener(e);
            e = null;
        }
    }

    public void a(int i1)
    {
        k = i1;
    }

    public void a(long l1)
    {
        l = l1;
    }

    public void a(View view, View view1)
    {
        int ai[];
        a();
        if (view.getWindowToken() == null)
        {
            com.facebook.debug.log.b.d(a, "show called with null window token -- ignoring");
            return;
        }
        d = view;
        ai = new int[2];
        view.getLocationInWindow(ai);
        android.graphics.drawable.Drawable drawable = b.getResources().getDrawable(h.orca_anchorable_toast_background);
        f = new PopupWindow(b);
        FrameLayout framelayout = new FrameLayout(b);
        framelayout.setBackgroundDrawable(drawable);
        framelayout.addView(view1);
        h = view.getWidth();
        if (j)
        {
            framelayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(h, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            i = framelayout.getMeasuredHeight();
        }
        f.setContentView(framelayout);
        f.setWidth(h);
        f.setHeight(i);
        f.setBackgroundDrawable(null);
        if (l > 0L)
        {
            f.setAnimationStyle(0x1030004);
        } else
        {
            f.setAnimationStyle(0);
        }
        if (k != 48) goto _L2; else goto _L1
_L1:
        f.showAtLocation(view, 51, ai[0], ai[1] - i);
_L4:
        if (l > 0L)
        {
            g = new c(new com.facebook.orca.common.ui.widgets.b(this));
            view.postDelayed(g, l);
        }
        e = new com.facebook.orca.common.ui.widgets.c(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(e);
        return;
_L2:
        if (k == 80)
        {
            f.showAtLocation(view, 51, ai[0], ai[1] + view.getHeight());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(View view, CharSequence charsequence, d d1)
    {
        FrameLayout framelayout = new FrameLayout(b);
        if (d1 == d.WARNING)
        {
            d1 = c.inflate(k.orca_toast_warning, framelayout, false);
        } else
        {
            d1 = c.inflate(k.orca_toast_normal, framelayout, false);
        }
        if (k == 80)
        {
            d1.findViewById(i.toast_bottom_divider).setVisibility(0);
        } else
        {
            d1.findViewById(i.toast_top_divider).setVisibility(0);
        }
        ((TextView)d1.findViewById(i.anchorable_toast_text)).setText(charsequence);
        a(view, ((View) (d1)));
    }

    public void a(boolean flag)
    {
        j = flag;
    }

}
