// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.WindowManager;
import com.facebook.g;

// Referenced classes of package com.facebook.orca.chatheads:
//            dv

public class ck extends dv
{

    public ck(WindowManager windowmanager, Context context)
    {
        super(windowmanager, a(context.getResources()));
        c(false);
        b(true);
        a(new View(context));
    }

    private static android.view.WindowManager.LayoutParams a(Resources resources)
    {
        resources = new android.view.WindowManager.LayoutParams(resources.getDimensionPixelSize(g.chat_head_width) - resources.getDimensionPixelSize(g.chat_head_dock_overshoot_x), resources.getDimensionPixelSize(g.chat_head_height), a, 768, -2);
        resources.gravity = 51;
        return resources;
    }

    public void setX(int i)
    {
        super.setX(Math.max(0, i));
    }
}
