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
        return a.h(view) - arams.topMargin;
    }

    public void a(int i)
    {
        a.i(i);
    }

    public int b(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = a.j(view);
        return arams.bottomMargin + i;
    }

    public int c()
    {
        return a.u();
    }

    public int c(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = a.f(view);
        int j = arams.topMargin;
        return arams.bottomMargin + (i + j);
    }

    public int d()
    {
        return a.s() - a.w();
    }

    public int d(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = a.e(view);
        int j = arams.leftMargin;
        return arams.rightMargin + (i + j);
    }

    public int e()
    {
        return a.s();
    }

    public int f()
    {
        return a.s() - a.u() - a.w();
    }

    public int g()
    {
        return a.w();
    }

    anager(anager anager)
    {
        super(anager, null);
    }
}
