// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.tinder.managers.ManagerApp;
import com.tinder.views.ScalableLine;

// Referenced classes of package com.tinder.fragments:
//            ac

final class a
    implements Runnable
{

    final ac a;

    public final void run()
    {
        if (a.isAdded() || a.isInLayout())
        {
            ac.a(a, a.e.getWidth());
            ac.b(a, a.f.getWidth());
            ac.c(a, ManagerApp.c().getResources().getDimensionPixelSize(0x7f0900d6));
            a.a.setX(a.e.getLeft());
            ac.a(a, a.k.getX() - (a.f.getX() + (float)ac.b(a) + (float)ac.c(a)));
            ac.b(a, (float)ac.d(a) * 0.7F);
            ac.c(a, 0.0F);
        }
    }

    out(ac ac1)
    {
        a = ac1;
        super();
    }
}
