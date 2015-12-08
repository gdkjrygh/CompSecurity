// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib.app;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib.app:
//            a

final class b
    implements Runnable
{

    final a a;
    private final boolean b;
    private final boolean c;

    b(a a1, boolean flag, boolean flag1)
    {
        a = a1;
        b = flag;
        c = flag1;
        super();
    }

    public final void run()
    {
        if (b)
        {
            if (c)
            {
                com.jeremyfeinstein.slidingmenu.lib.app.a.a(a).d();
                return;
            } else
            {
                com.jeremyfeinstein.slidingmenu.lib.app.a.a(a).a(false);
                return;
            }
        } else
        {
            com.jeremyfeinstein.slidingmenu.lib.app.a.a(a).b(false);
            return;
        }
    }
}
