// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import com.facebook.reflex.Scroller;
import com.facebook.reflex.Widget;
import com.facebook.reflex.aj;
import com.facebook.reflex.view.h;
import com.facebook.widget.refreshablelistview.b;
import com.facebook.widget.refreshablelistview.c;

// Referenced classes of package com.facebook.reflex.view.c:
//            n, m

public class l
    implements b
{

    private final h a;
    private final n b;
    private final Scroller c;
    private c d;
    private int e;

    public l(h h1, Scroller scroller, n n1)
    {
        e = 0;
        a = h1;
        b = n1;
        c = scroller;
    }

    private void a(m m1)
    {
        if (m1 != b.getState())
        {
            b.setState(m1);
            if (m1 == m.Loading && d != null)
            {
                d.a(true);
            }
            e();
        }
    }

    private void e()
    {
        m m1 = b.getState();
        int i = 0;
        if (m1 == m.Loading || m1 == m.ReleaseToRefresh)
        {
            i = b.getHeight();
        }
        int j = i - e;
        e = i;
        a.setPaddingTop(i);
        if (j != 0)
        {
            c.a(c.c() - (float)j, c.d());
        }
        float f;
        if (i == 0)
        {
            f = c.c() - (float)b.getHeight();
        } else
        {
            f = c.c();
        }
        f += a.getOverflowListOverlap();
        if (f != b.getBackingWidget().e())
        {
            b.getBackingWidget().b(0.0F, f);
        }
    }

    public void a()
    {
        a(m.Loading);
    }

    public void a(aj aj1, float f)
    {
        int i = b.getHeight();
        if (b.getState() == m.Loading)
        {
            aj1 = m.Loading;
        } else
        if (f <= (c.c() - (float)i) + (float)e && aj1 == aj.Interactive)
        {
            aj1 = m.ReleaseToRefresh;
        } else
        if (f <= c.c() && aj1 == aj.Interactive)
        {
            aj1 = m.PullToRefresh;
        } else
        if (b.getState() == m.ReleaseToRefresh && aj1 != aj.Interactive)
        {
            aj1 = m.Loading;
        } else
        {
            aj1 = m.Normal;
        }
        a(((m) (aj1)));
    }

    public void b()
    {
        a(m.Normal);
    }

    public void c()
    {
        b.layout(0, 0, a.getMeasuredWidth(), b.getMeasuredHeight());
        e();
    }

    public void d()
    {
        b.measure(android.view.View.MeasureSpec.makeMeasureSpec(a.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setLastLoadedTime(long l1)
    {
        b.setLastLoadedTime(l1);
    }

    public void setOnRefreshListener(c c1)
    {
        d = c1;
    }
}
