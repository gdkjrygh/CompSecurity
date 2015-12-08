// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.slidingmenu.lib.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import com.slidingmenu.lib.SlidingMenu;

public class a
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

    public View a(int i)
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

    public void a()
    {
        b.a();
    }

    public void a(Bundle bundle)
    {
        b = (SlidingMenu)LayoutInflater.from(a).inflate(com.slidingmenu.lib.R.layout.slidingmenumain, null);
    }

    public void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!e)
        {
            c = view;
        }
    }

    public boolean a(int i, KeyEvent keyevent)
    {
        if (i == 4 && b.b())
        {
            a();
            return true;
        } else
        {
            return false;
        }
    }

    public void b(Bundle bundle)
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
            flag = bundle.getBoolean("SlidingActivityHelper.open");
            flag1 = bundle.getBoolean("SlidingActivityHelper.secondary");
        } else
        {
            flag = false;
        }
        (new Handler()).post(new Runnable(flag, flag1) {

            final boolean a;
            final boolean b;
            final a c;

            public void run()
            {
                if (a)
                {
                    if (b)
                    {
                        a.a(c).b(false);
                        return;
                    } else
                    {
                        a.a(c).a(false);
                        return;
                    }
                } else
                {
                    a.a(c).c(false);
                    return;
                }
            }

            
            {
                c = a.this;
                a = flag;
                b = flag1;
                super();
            }
        });
    }

    public void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        d = view;
        b.setMenu(d);
    }

    public void c(Bundle bundle)
    {
        bundle.putBoolean("SlidingActivityHelper.open", b.b());
        bundle.putBoolean("SlidingActivityHelper.secondary", b.c());
    }
}
