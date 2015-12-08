// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.widget.g;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.app:
//            b

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    final b a;

    public final boolean onMenuItemSelected(f f, MenuItem menuitem)
    {
        return false;
    }

    public final void onMenuModeChange(f f)
    {
        if (android.support.v7.internal.app.b.a(a) != null)
        {
            if (android.support.v7.internal.app.b.c(a).h())
            {
                android.support.v7.internal.app.b.a(a).onPanelClosed(108, f);
            } else
            if (android.support.v7.internal.app.b.a(a).onPreparePanel(0, null, f))
            {
                android.support.v7.internal.app.b.a(a).onMenuOpened(108, f);
                return;
            }
        }
    }

    private u.f(b b1)
    {
        a = b1;
        super();
    }

    a(b b1, byte byte0)
    {
        this(b1);
    }
}
