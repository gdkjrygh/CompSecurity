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
//            o, r

final class s extends o
    implements android.view.ActionProvider.VisibilityListener
{

    p e;
    final r f;

    public s(r r, Context context, ActionProvider actionprovider)
    {
        f = r;
        super(r, context, actionprovider);
    }

    public final View a(MenuItem menuitem)
    {
        return c.onCreateActionView(menuitem);
    }

    public final void a(p p1)
    {
        e = p1;
        c.setVisibilityListener(this);
    }

    public final boolean b()
    {
        return c.overridesItemVisibility();
    }

    public final boolean c()
    {
        return c.isVisible();
    }

    public final void onActionProviderVisibilityChanged(boolean flag)
    {
        if (e != null)
        {
            e.a();
        }
    }
}
