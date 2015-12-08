// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib;

import android.util.Log;
import android.view.View;

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib:
//            SlidingMenu

final class j
    implements Runnable
{

    final SlidingMenu a;
    private final int b;

    j(SlidingMenu slidingmenu, int i)
    {
        a = slidingmenu;
        b = i;
        super();
    }

    public final void run()
    {
        String s = SlidingMenu.k();
        StringBuilder stringbuilder = new StringBuilder("changing layerType. hardware? ");
        boolean flag;
        if (b == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.v(s, stringbuilder.append(flag).toString());
        a.a().setLayerType(b, null);
        a.b().setLayerType(b, null);
        if (a.c() != null)
        {
            a.c().setLayerType(b, null);
        }
    }
}
