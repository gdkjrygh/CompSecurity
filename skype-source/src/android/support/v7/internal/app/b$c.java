// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.f;

// Referenced classes of package android.support.v7.internal.app:
//            b

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    final b a;

    public final void onCloseMenu(f f, boolean flag)
    {
        if (b.a(a) != null)
        {
            b.a(a).onPanelClosed(0, f);
        }
    }

    public final boolean onOpenSubMenu(f f)
    {
        if (f == null && b.a(a) != null)
        {
            b.a(a).onMenuOpened(0, f);
        }
        return true;
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
