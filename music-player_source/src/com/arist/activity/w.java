// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.support.v4.view.bo;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import java.util.ArrayList;

// Referenced classes of package com.arist.activity:
//            MainActivity

final class w
    implements bo
{

    final MainActivity a;

    w(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void a(int i)
    {
        boolean flag = false;
        a.a = i;
        int ai[];
        int j;
        if (a.a == 0)
        {
            MainActivity.j(a).a(1);
        } else
        {
            MainActivity.j(a).a(0);
        }
        j = MainActivity.k(a).size();
        ai = new int[j];
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= j)
            {
                MainActivity.a(a, j, ai);
                return;
            }
            if (i == a.a)
            {
                ai[i] = 1;
            }
            i++;
        } while (true);
    }

    public final void a(int i, float f)
    {
    }

    public final void b(int i)
    {
    }
}
