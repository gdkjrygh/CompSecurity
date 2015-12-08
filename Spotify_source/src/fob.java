// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.ui.ActionBarManager;

public final class fob
    implements fnz
{

    private ActionBarManager a;

    public fob(ActionBarManager actionbarmanager)
    {
        a = actionbarmanager;
        super();
    }

    public final void a(float f)
    {
        ActionBarManager actionbarmanager = a;
        if (a.k == com.spotify.mobile.android.ui.ActionBarManager.State.b)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        actionbarmanager.a(f);
    }

    public final void a(boolean flag)
    {
        a.c.setAlpha(com.spotify.mobile.android.ui.ActionBarManager.State.b(a.k));
    }
}
