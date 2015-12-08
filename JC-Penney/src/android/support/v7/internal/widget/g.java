// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.bq;
import android.support.v4.view.dn;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarOverlayLayout, ActionBarContainer

class g
    implements Runnable
{

    final ActionBarOverlayLayout a;

    g(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }

    public void run()
    {
        ActionBarOverlayLayout.a(a);
        ActionBarOverlayLayout.a(a, bq.j(ActionBarOverlayLayout.c(a)).a(-ActionBarOverlayLayout.c(a).getHeight()).a(ActionBarOverlayLayout.b(a)));
    }
}
