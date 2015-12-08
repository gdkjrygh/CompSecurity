// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper

final class anager extends OrientationHelper
{

    public int a(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        return a.g(view) - arams.leftMargin;
    }

    public void a(int i)
    {
        a.h(i);
    }

    public int b(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = a.i(view);
        return arams.rightMargin + i;
    }

    public int c()
    {
        return a.t();
    }

    public int c(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = a.e(view);
        int j = arams.leftMargin;
        return arams.rightMargin + (i + j);
    }

    public int d()
    {
        return a.r() - a.v();
    }

    public int d(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = a.f(view);
        int j = arams.topMargin;
        return arams.bottomMargin + (i + j);
    }

    public int e()
    {
        return a.r();
    }

    public int f()
    {
        return a.r() - a.t() - a.v();
    }

    public int g()
    {
        return a.v();
    }

    anager(anager anager)
    {
        super(anager, null);
    }
}
