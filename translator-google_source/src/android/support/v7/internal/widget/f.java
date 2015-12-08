// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.bt;
import android.support.v4.view.dq;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarOverlayLayout

final class f
    implements Runnable
{

    final ActionBarOverlayLayout a;

    f(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }

    public final void run()
    {
        ActionBarOverlayLayout.b(a);
        ActionBarOverlayLayout.a(a, bt.l(ActionBarOverlayLayout.d(a)).b(0.0F).a(ActionBarOverlayLayout.c(a)));
    }
}
