// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarOverlayLayout;

public final class ww
    implements Runnable
{

    private ActionBarOverlayLayout a;

    public ww(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }

    public final void run()
    {
        ActionBarOverlayLayout.a(a);
        ActionBarOverlayLayout.a(a, mk.r(ActionBarOverlayLayout.c(a)).c(0.0F).a(ActionBarOverlayLayout.b(a)));
    }
}
