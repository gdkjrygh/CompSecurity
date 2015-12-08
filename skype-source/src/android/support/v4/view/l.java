// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;

final class l
{
    static final class a
        implements android.view.MenuItem.OnActionExpandListener
    {

        private b a;

        public final boolean onMenuItemActionCollapse(MenuItem menuitem)
        {
            return a.b(menuitem);
        }

        public final boolean onMenuItemActionExpand(MenuItem menuitem)
        {
            return a.a(menuitem);
        }

        public a(b b1)
        {
            a = b1;
        }
    }

    static interface b
    {

        public abstract boolean a(MenuItem menuitem);

        public abstract boolean b(MenuItem menuitem);
    }


    public static MenuItem a(MenuItem menuitem, b b1)
    {
        return menuitem.setOnActionExpandListener(new a(b1));
    }
}
