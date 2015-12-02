// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.common.d.a.i;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads:
//            dv, ca, cg, ChatHeadCloseTargetView

public class cf extends dv
{

    private static final Class b = com/facebook/orca/chatheads/cf;

    public cf(WindowManager windowmanager)
    {
        super(windowmanager, n());
        c(false);
        b(false);
    }

    static Class g()
    {
        return b;
    }

    private static android.view.WindowManager.LayoutParams n()
    {
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams(-1, -1, a, 0x1010100, -3);
        layoutparams.gravity = 51;
        return layoutparams;
    }

    public void a(Rect rect)
    {
        ((ca)h()).setSystemWindowInsets(rect);
    }

    public s c()
    {
        c(true);
        b(true);
        return ((ca)h()).b();
    }

    public s d()
    {
        b(false);
        s s = ((ca)h()).c();
        i.a(s, new cg(this));
        return s;
    }

    public ChatHeadCloseTargetView e()
    {
        return ((ca)h()).getCloseTargetView();
    }

    public ViewGroup f()
    {
        return ((ca)h()).getThreadViewContainer();
    }

    public void setX(int j)
    {
        android.view.WindowManager.LayoutParams layoutparams = k();
        if (j >= 10000)
        {
            layoutparams.flags = layoutparams.flags | 0x200;
        } else
        {
            layoutparams.flags = layoutparams.flags & 0xfffffdff;
        }
        a(layoutparams);
        super.setX(j);
    }

}
