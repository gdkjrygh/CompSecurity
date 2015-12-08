// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.d.a.b;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            i

final class j extends i
{
    final class a extends i.a
        implements android.view.ActionProvider.VisibilityListener
    {

        android.support.v4.view.d.b c;
        final j d;

        public final boolean isVisible()
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

        public final View onCreateActionView(MenuItem menuitem)
        {
            return a.onCreateActionView(menuitem);
        }

        public final boolean overridesItemVisibility()
        {
            return a.overridesItemVisibility();
        }

        public final void refreshVisibility()
        {
            a.refreshVisibility();
        }

        public final void setVisibilityListener(android.support.v4.view.d.b b)
        {
            c = b;
            ActionProvider actionprovider = a;
            if (b != null)
            {
                b = this;
            } else
            {
                b = null;
            }
            actionprovider.setVisibilityListener(b);
        }

        public a(Context context, ActionProvider actionprovider)
        {
            d = j.this;
            super(j.this, context, actionprovider);
        }
    }


    j(Context context, b b)
    {
        super(context, b);
    }

    final i.a a(ActionProvider actionprovider)
    {
        return new a(a, actionprovider);
    }
}
