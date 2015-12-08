// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.view.MotionEvent;
import ggd;

// Referenced classes of package com.spotify.mobile.android.util:
//            TouchLifecycle

final class nit> extends nit>
{

    final void a(TouchLifecycle touchlifecycle)
    {
    }

    final void b(TouchLifecycle touchlifecycle)
    {
        touchlifecycle.b = c;
    }

    final void c(TouchLifecycle touchlifecycle)
    {
        touchlifecycle.a.b();
        touchlifecycle.b = d;
    }

    final boolean d(TouchLifecycle touchlifecycle)
    {
        boolean flag = true;
        boolean flag1 = touchlifecycle.a.a(touchlifecycle.e);
        if (TouchLifecycle.a(touchlifecycle))
        {
            if (touchlifecycle.e.getActionMasked() != 1)
            {
                flag = false;
            }
            if (flag)
            {
                touchlifecycle.a.c();
            }
            TouchLifecycle.b(touchlifecycle);
            touchlifecycle.b = a;
        }
        return flag1;
    }

    (String s)
    {
        super(s, 1, (byte)0);
    }
}
