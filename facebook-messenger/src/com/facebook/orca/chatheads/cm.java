// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.res.Resources;
import android.view.WindowManager;
import com.facebook.g;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads:
//            dv, cl

public class cm extends dv
{

    private final int b;
    private final int c;

    public cm(WindowManager windowmanager, Resources resources)
    {
        super(windowmanager, a(resources));
        c(false);
        b = resources.getDimensionPixelSize(g.chat_head_width);
        c = resources.getDimensionPixelOffset(g.chat_head_dock_overshoot_x);
    }

    private static android.view.WindowManager.LayoutParams a(Resources resources)
    {
        resources = new android.view.WindowManager.LayoutParams(-2, -2, a, 768, -3);
        resources.gravity = 51;
        return resources;
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            ((cl)h()).setChatHeadsOffsetX(-c);
            c(-2);
            return;
        } else
        {
            ((cl)h()).setChatHeadsOffsetX(0);
            c(b - c);
            return;
        }
    }

    public s c()
    {
        return ((cl)h()).a(500);
    }

    public s d()
    {
        return ((cl)h()).a(0.6F, 500);
    }

    public void setX(int i)
    {
        super.setX(Math.max(0, i));
    }
}
