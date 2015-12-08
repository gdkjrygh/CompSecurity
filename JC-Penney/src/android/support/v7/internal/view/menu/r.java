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
//            m, q

class r extends m
    implements android.view.ActionProvider.VisibilityListener
{

    p c;
    final q d;

    public r(q q, Context context, ActionProvider actionprovider)
    {
        d = q;
        super(q, context, actionprovider);
    }

    public View a(MenuItem menuitem)
    {
        return a.onCreateActionView(menuitem);
    }

    public void a(p p1)
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

    public boolean b()
    {
        return a.overridesItemVisibility();
    }

    public boolean c()
    {
        return a.isVisible();
    }

    public void onActionProviderVisibilityChanged(boolean flag)
    {
        if (c != null)
        {
            c.a(flag);
        }
    }
}
