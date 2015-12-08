// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//            k, l

static final class _cls1.a extends _cls1.a
{

    public final MenuItem a(MenuItem menuitem, _cls1.a a1)
    {
        if (a1 == null)
        {
            return l.a(menuitem, null);
        } else
        {
            return l.a(menuitem, new l.b(a1) {

                final k.e a;
                final k.c b;

                public final boolean a(MenuItem menuitem1)
                {
                    return a.onMenuItemActionExpand(menuitem1);
                }

                public final boolean b(MenuItem menuitem1)
                {
                    return a.onMenuItemActionCollapse(menuitem1);
                }

            
            {
                b = k.c.this;
                a = e;
                super();
            }
            });
        }
    }

    public final boolean b(MenuItem menuitem)
    {
        return menuitem.expandActionView();
    }

    public final boolean c(MenuItem menuitem)
    {
        return menuitem.isActionViewExpanded();
    }

    _cls1.a()
    {
    }
}
