// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.o;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private final class <init>
    implements android.support.v7.internal.view.menu._11_
{

    final ActionMenuPresenter a;

    public final void onCloseMenu(f f1, boolean flag)
    {
        if (f1 instanceof o)
        {
            ((o)f1).o().a(false);
        }
        android.support.v7.internal.view.menu._11_ _l11_ = a.c();
        if (_l11_ != null)
        {
            _l11_._11_(f1, flag);
        }
    }

    public final boolean onOpenSubMenu(f f1)
    {
        if (f1 == null)
        {
            return false;
        }
        a.h = ((o)f1).getItem().getItemId();
        android.support.v7.internal.view.menu._11_ _l11_ = a.c();
        if (_l11_ != null)
        {
            return _l11_._11_(f1);
        } else
        {
            return false;
        }
    }

    private (ActionMenuPresenter actionmenupresenter)
    {
        a = actionmenupresenter;
        super();
    }

    a(ActionMenuPresenter actionmenupresenter, byte byte0)
    {
        this(actionmenupresenter);
    }
}
