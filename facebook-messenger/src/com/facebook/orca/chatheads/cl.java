// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.a.a.a;
import com.a.a.q;
import com.facebook.g;
import com.facebook.ui.a.e;
import com.facebook.widget.d;
import com.google.common.d.a.i;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads:
//            ag

public class cl extends d
{

    private double a;
    private a b;
    private s c;
    private FrameLayout d;

    public cl(Context context)
    {
        super(context);
        d = new FrameLayout(context);
        addView(d, new android.widget.FrameLayout.LayoutParams(-2, -2, 51));
    }

    private void b()
    {
        int j = 0;
        int l = getResources().getDimensionPixelSize(g.chat_head_first_stack_offset);
        int i1 = d.getChildCount();
        for (int k = 0; k < i1; k++)
        {
            if (k > 0)
            {
                j += l / k;
            }
            View view = d.getChildAt(i1 - k - 1);
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
            layoutparams.leftMargin = j;
            view.setLayoutParams(layoutparams);
        }

    }

    protected s a(float f, int j)
    {
        if (a == (double)f)
        {
            if (c == null)
            {
                c = i.a(null);
            }
            return c;
        }
        if (b != null && b.e())
        {
            b.b();
        }
        a = f;
        b = q.a(d, "alpha", new float[] {
            f
        });
        b.a(j);
        b.a();
        c = new e(b);
        return c;
    }

    public s a(int j)
    {
        return a(1.0F, j);
    }

    public void a()
    {
        int k = getChildCount();
        for (int j = 0; j < k; j++)
        {
            View view = getChildAt(j);
            if (view instanceof ag)
            {
                ((ag)view).a();
            }
        }

        d.removeAllViewsInLayout();
    }

    public void a(ag ag1)
    {
        ag1.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2, 51));
        d.addView(ag1);
        b();
    }

    public void b(ag ag1)
    {
        d.bringChildToFront(ag1);
        b();
    }

    public void c(ag ag1)
    {
        ag1.a();
        d.removeView(ag1);
        b();
    }

    public void setChatHeadsOffsetX(int j)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)d.getLayoutParams();
        if (layoutparams.leftMargin != j)
        {
            layoutparams.leftMargin = j;
            d.setLayoutParams(layoutparams);
        }
    }
}
