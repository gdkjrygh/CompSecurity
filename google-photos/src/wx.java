// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarOverlayLayout;

public final class wx
    implements Runnable
{

    private ActionBarOverlayLayout a;

    public wx(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }

    public final void run()
    {
        ActionBarOverlayLayout.a(a);
        ActionBarOverlayLayout.a(a, mk.r(ActionBarOverlayLayout.c(a)).c(-ActionBarOverlayLayout.c(a).getHeight()).a(ActionBarOverlayLayout.b(a)));
    }
}
