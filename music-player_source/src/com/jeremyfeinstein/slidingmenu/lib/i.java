// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib;


// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib:
//            c, SlidingMenu

final class i
    implements c
{

    final SlidingMenu a;

    i(SlidingMenu slidingmenu)
    {
        a = slidingmenu;
        super();
    }

    public final void a(int j)
    {
        if (j == 0 && SlidingMenu.a(a) != null)
        {
            SlidingMenu.a(a);
        } else
        {
            if (j == 1 && SlidingMenu.b(a) != null)
            {
                SlidingMenu.b(a);
                return;
            }
            if (j == 2 && SlidingMenu.c(a) != null)
            {
                SlidingMenu.c(a);
                return;
            }
        }
    }
}
