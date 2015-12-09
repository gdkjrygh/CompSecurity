// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.p;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            p, t

final class u extends android.support.v7.internal.view.menu.p
    implements android.view.ActionProvider.VisibilityListener
{

    p c;
    final t d;

    public u(t t, Context context, ActionProvider actionprovider)
    {
        d = t;
        super(t, context, actionprovider);
    }

    public final View a(MenuItem menuitem)
    {
        return a.onCreateActionView(menuitem);
    }

    public final void a(p p1)
    {
        c = p1;
        ActionProvider actionprovider = a;
        if (p1 != null)
        {
            p1 = this;
        } else
        {
            p1 = null;
        }
        actionprovider.setVisibilityListener(p1);
    }

    public final boolean b()
    {
        return a.overridesItemVisibility();
    }

    public final boolean c()
    {
        return a.isVisible();
    }

    public final void onActionProviderVisibilityChanged(boolean flag)
    {
        if (c != null)
        {
            c.a();
        }
    }
}
