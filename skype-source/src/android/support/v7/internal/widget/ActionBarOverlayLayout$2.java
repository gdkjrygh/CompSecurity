// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.af;
import android.support.v4.view.x;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarOverlayLayout

final class a
    implements Runnable
{

    final ActionBarOverlayLayout a;

    public final void run()
    {
        ActionBarOverlayLayout.b(a);
        ActionBarOverlayLayout.a(a, x.s(ActionBarOverlayLayout.d(a)).c(0.0F).a(ActionBarOverlayLayout.c(a)));
    }

    A(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }
}
