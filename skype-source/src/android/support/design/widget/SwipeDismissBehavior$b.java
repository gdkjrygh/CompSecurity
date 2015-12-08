// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.x;
import android.support.v4.widget.s;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            SwipeDismissBehavior

private final class c
    implements Runnable
{

    final SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public final void run()
    {
        if (SwipeDismissBehavior.b(a) != null && SwipeDismissBehavior.b(a).g())
        {
            x.a(b, this);
        } else
        if (c && SwipeDismissBehavior.a(a) != null)
        {
            SwipeDismissBehavior.a(a).a();
            return;
        }
    }

    (SwipeDismissBehavior swipedismissbehavior, View view, boolean flag)
    {
        a = swipedismissbehavior;
        super();
        b = view;
        c = flag;
    }
}
