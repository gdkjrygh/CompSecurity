// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.facebook.q;
import com.facebook.widget.animatablelistview.AnimatingItemView;
import com.facebook.widget.animatablelistview.a;
import com.facebook.widget.d;

// Referenced classes of package com.facebook.orca.common.ui.widgets:
//            h, i, g

public class f extends d
{

    private AnimatingItemView a;
    private boolean b;
    private int c;
    private i d;

    public f(Context context)
    {
        this(context, null);
    }

    public f(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public f(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        context = context.obtainStyledAttributes(attributeset, q.SlidingOutSuggestionView);
        int k = context.getIndexCount();
        for (j = 0; j < k; j++)
        {
            int l = context.getIndex(j);
            if (l == q.SlidingOutSuggestionView_animateOutDirection)
            {
                c = context.getInteger(l, c);
            }
        }

        context.recycle();
    }

    static AnimatingItemView a(f f1)
    {
        return f1.a;
    }

    private void a()
    {
        boolean flag;
        if (b)
        {
            return;
        }
        if (a.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.facebook.orca.common.ui.widgets.h.a[d.ordinal()];
        JVM INSTR tableswitch 1 4: default 60
    //                   1 73
    //                   2 84
    //                   3 60
    //                   4 96;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        d = i.WHATEVER;
        return;
_L2:
        a.setVisibility(0);
        continue; /* Loop/switch isn't completed */
_L3:
        a.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            b();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static boolean a(f f1, boolean flag)
    {
        f1.b = flag;
        return flag;
    }

    private void b()
    {
        float f1;
        a a1;
        com.a.a.q q1;
        if (c == 1)
        {
            f1 = 1.0F;
        } else
        {
            f1 = -1F;
        }
        a1 = new a();
        a.setItemInfo(a1);
        q1 = com.a.a.q.a(a1, "animationOffset", new float[] {
            f1, 0.0F
        });
        q1.b(300L);
        q1.a(new LinearInterpolator());
        q1.a(new g(this, a1));
        q1.a();
        b = true;
    }

    public void d()
    {
        d = i.SHOW;
        a();
    }

    public void e()
    {
        d = i.HIDE;
        a();
    }

    public void f()
    {
        d = i.ANIMATE_OUT;
        a();
    }

    public int getAnimateOutDirection()
    {
        return c;
    }

    public void setAnimateOutDirection(int j)
    {
        c = j;
    }

    protected void setContainer(AnimatingItemView animatingitemview)
    {
        a = animatingitemview;
    }
}
