// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Date;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            d, e

public abstract class q extends d
{

    protected int a;
    protected int b;
    protected View c;
    protected e d;
    protected Date e;
    protected ViewGroup f;

    public q()
    {
        a = 0x80000000;
        b = 0x80000000;
    }

    public void O_()
    {
        d = null;
        c();
    }

    public final View a(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(i()).inflate(0x7f0401b2, viewgroup, false);
        f = (ViewGroup)viewgroup.findViewById(0x7f110468);
        LayoutInflater.from(i()).inflate(b(), f, true);
        a(((View) (viewgroup)));
        return viewgroup;
    }

    protected void a(View view)
    {
    }

    public void a(Date date)
    {
        e = date;
    }

    protected abstract int b();

    public void b(e e1)
    {
        d = e1;
        c();
    }

    protected abstract void c();

    protected boolean d()
    {
        return d != null && d.d;
    }

    protected boolean e()
    {
        return d != null && d.a;
    }
}
