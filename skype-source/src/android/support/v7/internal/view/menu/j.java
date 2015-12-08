// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.internal.view.b;
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

        public final View a(MenuItem menuitem)
        {
            return a.onCreateActionView(menuitem);
        }

        public final void a(android.support.v4.view.d.b b1)
        {
            c = b1;
            a.setVisibilityListener(this);
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
