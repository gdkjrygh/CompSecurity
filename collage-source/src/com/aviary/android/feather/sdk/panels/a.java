// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.view.LayoutInflater;
import android.view.View;
import com.aviary.android.feather.library.services.IAviaryController;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            b

abstract class a extends b
    implements c.a
{

    protected c.c a;
    protected View b;
    protected ImageViewTouch c;

    public a(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        super(iaviarycontroller, a1);
    }

    public final View a(LayoutInflater layoutinflater)
    {
        b = b(layoutinflater);
        return b;
    }

    public final void a(c.c c1)
    {
        a = c1;
    }

    public void a(boolean flag)
    {
        super.a(flag);
        b().setEnabled(flag);
    }

    public final View b()
    {
        return b;
    }

    protected abstract View b(LayoutInflater layoutinflater);

    protected void c()
    {
        a = null;
        super.c();
    }

    protected void d()
    {
        if (a != null && n())
        {
            a.a(this);
        }
    }

    public boolean e()
    {
        return true;
    }
}
