// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

final class uv extends op
{

    private uu a;

    uv(uu uu1)
    {
        a = uu1;
        super();
    }

    public final void b(View view)
    {
        if (uu.a(a) && uu.b(a) != null)
        {
            mk.b(uu.b(a), 0.0F);
            mk.b(uu.c(a), 0.0F);
        }
        uu.c(a).setVisibility(8);
        uu.c(a).a(false);
        uu.a(a, null);
        view = a;
        if (((uu) (view)).c != null)
        {
            ((uu) (view)).c.a(((uu) (view)).b);
            view.b = null;
            view.c = null;
        }
        if (uu.d(a) != null)
        {
            mk.u(uu.d(a));
        }
    }
}
