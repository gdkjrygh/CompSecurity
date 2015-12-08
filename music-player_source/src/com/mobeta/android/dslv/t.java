// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.os.SystemClock;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

class t
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

    public t(DragSortListView dragsortlistview, int j)
    {
        c = dragsortlistview;
        super();
        d = 0.5F;
        a = j;
        float f1 = 1.0F / (d * 2.0F * (1.0F - d));
        h = f1;
        e = f1;
        f = d / ((d - 1.0F) * 2.0F);
        g = 1.0F / (1.0F - d);
    }

    public void a()
    {
    }

    public void a(float f1)
    {
    }

    public void b()
    {
    }

    public final void c()
    {
        b = SystemClock.uptimeMillis();
        i = false;
        a();
        c.post(this);
    }

    public final void d()
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
            a(1.0F);
            b();
            return;
        }
        if (f1 < d)
        {
            f1 *= e * f1;
        } else
        if (f1 < 1.0F - d)
        {
            float f2 = f;
            f1 = f1 * g + f2;
        } else
        {
            f1 = 1.0F - (f1 - 1.0F) * (h * (f1 - 1.0F));
        }
        a(f1);
        c.post(this);
    }
}
