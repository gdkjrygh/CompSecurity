// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.g;

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib.app:
//            b

public final class a
{

    private Activity a;
    private SlidingMenu b;
    private View c;
    private View d;
    private boolean e;
    private boolean f;
    private boolean g;

    public a(Activity activity)
    {
        e = false;
        f = false;
        g = true;
        a = activity;
    }

    static SlidingMenu a(a a1)
    {
        return a1.b;
    }

    public final View a(int i)
    {
        if (b != null)
        {
            View view = b.findViewById(i);
            if (view != null)
            {
                return view;
            }
        }
        return null;
    }

    public final void a()
    {
        b = (SlidingMenu)LayoutInflater.from(a).inflate(g.a, null);
    }

    public final void a(Bundle bundle)
    {
        int i = 1;
        boolean flag1 = false;
        if (d == null || c == null)
        {
            throw new IllegalStateException("Both setBehindContentView must be called in onCreate in addition to setContentView.");
        }
        f = true;
        SlidingMenu slidingmenu = b;
        Activity activity = a;
        if (g)
        {
            i = 0;
        }
        slidingmenu.a(activity, i);
        boolean flag;
        if (bundle != null)
        {
            flag1 = bundle.getBoolean("SlidingActivityHelper.open");
            flag = bundle.getBoolean("SlidingActivityHelper.secondary");
        } else
        {
            flag = false;
        }
        (new Handler()).post(new b(this, flag1, flag));
    }

    public final void a(View view)
    {
        if (!e)
        {
            c = view;
        }
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("SlidingActivityHelper.open", b.g());
        bundle.putBoolean("SlidingActivityHelper.secondary", b.h());
    }

    public final void b(View view)
    {
        d = view;
        b.a(d);
    }

    public final boolean b(int i)
    {
        if (i == 4 && b.g())
        {
            b.e();
            return true;
        } else
        {
            return false;
        }
    }
}
