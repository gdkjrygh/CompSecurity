// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v4.view.t;

// Referenced classes of package com.tinder.c:
//            n

final class <init>
    implements Runnable
{

    final n a;

    private void a()
    {
        if (!n.j(a))
        {
            Handler handler = n.k(a);
            long l;
            if (n.h(a))
            {
                l = 8000L;
            } else
            {
                l = 2000L;
            }
            handler.postDelayed(this, l);
        }
    }

    public final void run()
    {
        int i;
        if (n.h(a))
        {
            a();
            return;
        }
        i = n.i(a).getCurrentItem();
        if (i >= n.i(a).getAdapter().getCount() - 1) goto _L2; else goto _L1
_L1:
        i++;
        if (i < n.i(a).getAdapter().getCount())
        {
            n.i(a).setCurrentItem(i, true);
        }
_L4:
        a();
        return;
_L2:
        if (n.i(a).getAdapter().getCount() > 0)
        {
            n.i(a).setCurrentItem(0, true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    _cls4.view.t(n n1)
    {
        a = n1;
        super();
    }
}
