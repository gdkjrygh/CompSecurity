// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.dq;
import android.support.v4.view.eg;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsActionBarView

public final class a
    implements eg
{

    int a;
    final AbsActionBarView b;
    private boolean c;

    protected a(AbsActionBarView absactionbarview)
    {
        b = absactionbarview;
        super();
        c = false;
    }

    public final a a(dq dq, int i)
    {
        b.f = dq;
        a = i;
        return this;
    }

    public final void a(View view)
    {
        AbsActionBarView.a(b);
        c = false;
    }

    public final void b(View view)
    {
        if (c)
        {
            return;
        } else
        {
            b.f = null;
            AbsActionBarView.a(b, a);
            return;
        }
    }

    public final void c(View view)
    {
        c = true;
    }
}
