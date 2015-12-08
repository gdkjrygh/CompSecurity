// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.widget.g;

// Referenced classes of package android.support.v7.internal.app:
//            b

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    final b a;
    private boolean b;

    public final void onCloseMenu(f f, boolean flag)
    {
        if (b)
        {
            return;
        }
        b = true;
        android.support.v7.internal.app.b.c(a).m();
        if (android.support.v7.internal.app.b.a(a) != null)
        {
            android.support.v7.internal.app.b.a(a).onPanelClosed(108, f);
        }
        b = false;
    }

    public final boolean onOpenSubMenu(f f)
    {
        if (android.support.v7.internal.app.b.a(a) != null)
        {
            android.support.v7.internal.app.b.a(a).onMenuOpened(108, f);
            return true;
        } else
        {
            return false;
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
