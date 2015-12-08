// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr;

import android.widget.Scroller;

// Referenced classes of package in.srain.cube.views.ptr:
//            PtrFrameLayout

final class tContext
    implements Runnable
{

    Scroller a;
    boolean b;
    private int c;
    private int d;
    private PtrFrameLayout e;

    final void a()
    {
        b = false;
        c = 0;
        e.removeCallbacks(this);
    }

    public final void a(int i, int j)
    {
        if (PtrFrameLayout.c(e) == i)
        {
            return;
        } else
        {
            d = PtrFrameLayout.c(e);
            int k = d;
            e.removeCallbacks(this);
            c = 0;
            a = new Scroller(e.getContext());
            a.startScroll(0, 0, 0, i - k, j);
            e.post(this);
            b = true;
            return;
        }
    }

    public final void run()
    {
        boolean flag;
        int i;
        int j;
        if (!a.computeScrollOffset() || a.isFinished())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = a.getCurrY();
        j = c;
        if (!flag)
        {
            c = i;
            PtrFrameLayout.a(e, i - j);
            e.post(this);
            return;
        } else
        {
            a();
            return;
        }
    }

    public (PtrFrameLayout ptrframelayout)
    {
        e = ptrframelayout;
        super();
        b = false;
        a = new Scroller(ptrframelayout.getContext());
    }
}
