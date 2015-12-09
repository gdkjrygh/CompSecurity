// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.slidingmenu.lib.app;

import com.slidingmenu.lib.SlidingMenu;

// Referenced classes of package com.slidingmenu.lib.app:
//            a

class b
    implements Runnable
{

    final boolean a;
    final boolean b;
    final a c;

    public void run()
    {
        if (a)
        {
            if (b)
            {
                com.slidingmenu.lib.app.a.a(c).b(false);
                return;
            } else
            {
                com.slidingmenu.lib.app.a.a(c).a(false);
                return;
            }
        } else
        {
            com.slidingmenu.lib.app.a.a(c).c(false);
            return;
        }
    }

    enu(a a1, boolean flag, boolean flag1)
    {
        c = a1;
        a = flag;
        b = flag1;
        super();
    }
}
