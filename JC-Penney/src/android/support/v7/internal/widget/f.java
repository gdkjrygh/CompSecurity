// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.bq;
import android.support.v4.view.dn;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarOverlayLayout

class f
    implements Runnable
{

    final ActionBarOverlayLayout a;

    f(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }

    public void run()
    {
        ActionBarOverlayLayout.a(a);
        ActionBarOverlayLayout.a(a, bq.j(ActionBarOverlayLayout.c(a)).a(0.0F).a(ActionBarOverlayLayout.b(a)));
    }
}
