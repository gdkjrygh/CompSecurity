// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.af;
import android.support.v4.view.aj;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            a

protected final class c
    implements aj
{

    int a;
    final a b;
    private boolean c;

    public final c a(af af, int i)
    {
        b.f = af;
        a = i;
        return this;
    }

    public final void a(View view)
    {
        android.support.v7.internal.widget.a.a(b);
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
            android.support.v7.internal.widget.a.a(b, a);
            return;
        }
    }

    public final void c(View view)
    {
        c = true;
    }

    protected (a a1)
    {
        b = a1;
        super();
        c = false;
    }
}
