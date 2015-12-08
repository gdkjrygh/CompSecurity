// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.tinder.adapters.n;

// Referenced classes of package com.tinder.fragments:
//            af

final class b
    implements Runnable
{

    final Runnable a;
    final boolean b;
    final af c;

    public final void run()
    {
        af.j(c).setVisibility(8);
        af.i(c).b = 1;
        af.i(c).notifyDataSetChanged();
        ViewPager viewpager = af.a(c);
        Runnable runnable = a;
        long l;
        if (b)
        {
            l = 300L;
        } else
        {
            l = 600L;
        }
        viewpager.postDelayed(runnable, l);
    }

    wPager(af af1, Runnable runnable, boolean flag)
    {
        c = af1;
        a = runnable;
        b = flag;
        super();
    }
}
