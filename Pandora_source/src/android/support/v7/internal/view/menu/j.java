// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.view.d;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            i

class j extends i
{
    class a extends i.a
        implements android.support.v4.view.d.b
    {

        android.view.ActionProvider.VisibilityListener c;
        final j d;

        public void a(boolean flag)
        {
            if (c != null)
            {
                c.onActionProviderVisibilityChanged(flag);
            }
        }

        public boolean isVisible()
        {
            return a.d();
        }

        public View onCreateActionView(MenuItem menuitem)
        {
            return a.a(menuitem);
        }

        public boolean overridesItemVisibility()
        {
            return a.c();
        }

        public void refreshVisibility()
        {
            a.e();
        }

        public void setVisibilityListener(android.view.ActionProvider.VisibilityListener visibilitylistener)
        {
            c = visibilitylistener;
            d d1 = a;
            if (visibilitylistener != null)
            {
                visibilitylistener = this;
            } else
            {
                visibilitylistener = null;
            }
            d1.a(visibilitylistener);
        }

        public a(d d1)
        {
            d = j.this;
            super(j.this, d1);
        }
    }


    j(MenuItem menuitem)
    {
        super(menuitem, false);
    }

    i.a b(d d)
    {
        return new a(d);
    }
}
