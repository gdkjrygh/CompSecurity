// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

public abstract class a extends Fragment
{

    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private long e;
    private long f;

    public a()
    {
    }

    private void c()
    {
        d = true;
        e = System.currentTimeMillis();
    }

    private void d()
    {
        d = false;
        f = System.currentTimeMillis();
    }

    protected final int a()
    {
        return Math.round((float)(f - e) / 1000F);
    }

    protected void a(boolean flag)
    {
    }

    protected void b()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = true;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        a = false;
        if (d)
        {
            d();
            b();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
label0:
        {
            super.onViewCreated(view, bundle);
            a = true;
            if (c)
            {
                if (!b)
                {
                    break label0;
                }
                b = false;
                c();
                a(true);
            }
            return;
        }
        c();
        a(false);
    }

    public void setUserVisibleHint(boolean flag)
    {
        c = flag;
        super.setUserVisibleHint(flag);
        if (a && flag)
        {
            if (b)
            {
                b = false;
                c();
                a(true);
            } else
            {
                c();
                a(false);
            }
        }
        if (!flag && d)
        {
            d();
            b();
        }
    }
}
