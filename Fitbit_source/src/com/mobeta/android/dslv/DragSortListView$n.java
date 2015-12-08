// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.os.SystemClock;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

private class d
    implements Runnable
{

    private float a;
    protected long b;
    final DragSortListView c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private boolean i;

    public float a(float f1)
    {
        if (f1 < d)
        {
            return e * f1 * f1;
        }
        if (f1 < 1.0F - d)
        {
            return f + g * f1;
        } else
        {
            return 1.0F - h * (f1 - 1.0F) * (f1 - 1.0F);
        }
    }

    public void a()
    {
    }

    public void a(float f1, float f2)
    {
    }

    public void b()
    {
    }

    public void c()
    {
        b = SystemClock.uptimeMillis();
        i = false;
        a();
        c.post(this);
    }

    public void d()
    {
        i = true;
    }

    public void run()
    {
        if (i)
        {
            return;
        }
        float f1 = (float)(SystemClock.uptimeMillis() - b) / a;
        if (f1 >= 1.0F)
        {
            a(1.0F, 1.0F);
            b();
            return;
        } else
        {
            a(f1, a(f1));
            c.post(this);
            return;
        }
    }

    public (DragSortListView dragsortlistview, float f1, int j)
    {
        c = dragsortlistview;
        super();
        d = f1;
        a = j;
        f1 = 1.0F / (d * 2.0F * (1.0F - d));
        h = f1;
        e = f1;
        f = d / ((d - 1.0F) * 2.0F);
        g = 1.0F / (1.0F - d);
    }
}
