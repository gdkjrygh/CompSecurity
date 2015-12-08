// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            j

final class k extends j
{
    final class a extends j.a
        implements android.view.ActionProvider.VisibilityListener
    {

        android.support.v4.view.ActionProvider.VisibilityListener c;
        final k d;

        public final boolean isVisible()
        {
            return a.isVisible();
        }

        public final void onActionProviderVisibilityChanged(boolean flag)
        {
            if (c != null)
            {
                c.onActionProviderVisibilityChanged(flag);
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

        public final void setVisibilityListener(android.support.v4.view.ActionProvider.VisibilityListener visibilitylistener)
        {
            c = visibilitylistener;
            ActionProvider actionprovider = a;
            if (visibilitylistener != null)
            {
                visibilitylistener = this;
            } else
            {
                visibilitylistener = null;
            }
            actionprovider.setVisibilityListener(visibilitylistener);
        }

        public a(Context context, ActionProvider actionprovider)
        {
            d = k.this;
            super(k.this, context, actionprovider);
        }
    }


    k(Context context, SupportMenuItem supportmenuitem)
    {
        super(context, supportmenuitem);
    }

    final j.a a(ActionProvider actionprovider)
    {
        return new a(a, actionprovider);
    }
}
