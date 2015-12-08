// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.x;
import android.support.v4.widget.u;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            f

private final class c
    implements Runnable
{

    final f a;
    private final View b;
    private final boolean c;

    public final void run()
    {
        if (a.b != null && a.b.c())
        {
            x.a(b, this);
        } else
        if (c && a.c != null)
        {
            a.c.a();
            return;
        }
    }

    (f f1, View view, boolean flag)
    {
        a = f1;
        super();
        b = view;
        c = flag;
    }
}
