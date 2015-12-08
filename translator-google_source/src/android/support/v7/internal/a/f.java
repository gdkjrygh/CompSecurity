// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v4.view.bt;
import android.support.v4.view.eh;
import android.support.v7.c.b;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.a:
//            e

final class f extends eh
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final void b(View view)
    {
        if (e.a(a) && android.support.v7.internal.a.e.b(a) != null)
        {
            bt.a(android.support.v7.internal.a.e.b(a), 0.0F);
            bt.a(e.c(a), 0.0F);
        }
        e.c(a).setVisibility(8);
        e.c(a).setTransitioning(false);
        e.d(a);
        view = a;
        if (((e) (view)).c != null)
        {
            ((e) (view)).c.a(((e) (view)).b);
            view.b = null;
            view.c = null;
        }
        if (e.e(a) != null)
        {
            bt.p(e.e(a));
        }
    }
}
