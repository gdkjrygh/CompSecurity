// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v4.view.bp;
import android.support.v4.view.dp;
import android.support.v7.c.b;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.a:
//            b

final class c extends dp
{

    final android.support.v7.internal.a.b a;

    c(android.support.v7.internal.a.b b1)
    {
        a = b1;
        super();
    }

    public final void b(View view)
    {
        if (android.support.v7.internal.a.b.a(a) && android.support.v7.internal.a.b.b(a) != null)
        {
            bp.b(android.support.v7.internal.a.b.b(a), 0.0F);
            bp.b(android.support.v7.internal.a.b.c(a), 0.0F);
        }
        if (android.support.v7.internal.a.b.d(a) != null && android.support.v7.internal.a.b.e(a) == 1)
        {
            android.support.v7.internal.a.b.d(a).setVisibility(8);
        }
        android.support.v7.internal.a.b.c(a).setVisibility(8);
        android.support.v7.internal.a.b.c(a).a(false);
        android.support.v7.internal.a.b.f(a);
        view = a;
        if (((android.support.v7.internal.a.b) (view)).c != null)
        {
            ((android.support.v7.internal.a.b) (view)).c.a(((android.support.v7.internal.a.b) (view)).b);
            view.b = null;
            view.c = null;
        }
        if (android.support.v7.internal.a.b.g(a) != null)
        {
            bp.r(android.support.v7.internal.a.b.g(a));
        }
    }
}
