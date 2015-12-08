// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.internal.view.b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            d, l

public final class k
{
    static final class a
        implements d
    {

        public final MenuItem a(MenuItem menuitem, e e1)
        {
            return menuitem;
        }

        public final MenuItem a(MenuItem menuitem, View view)
        {
            return menuitem;
        }

        public final View a(MenuItem menuitem)
        {
            return null;
        }

        public final void a(MenuItem menuitem, int i)
        {
        }

        public final MenuItem b(MenuItem menuitem, int i)
        {
            return menuitem;
        }

        public final boolean b(MenuItem menuitem)
        {
            return false;
        }

        public final boolean c(MenuItem menuitem)
        {
            return false;
        }

        a()
        {
        }
    }

    static class b
        implements d
    {

        public MenuItem a(MenuItem menuitem, e e1)
        {
            return menuitem;
        }

        public final MenuItem a(MenuItem menuitem, View view)
        {
            return menuitem.setActionView(view);
        }

        public final View a(MenuItem menuitem)
        {
            return menuitem.getActionView();
        }

        public final void a(MenuItem menuitem, int i)
        {
            menuitem.setShowAsAction(i);
        }

        public final MenuItem b(MenuItem menuitem, int i)
        {
            return menuitem.setActionView(i);
        }

        public boolean b(MenuItem menuitem)
        {
            return false;
        }

        public boolean c(MenuItem menuitem)
        {
            return false;
        }

        b()
        {
        }
    }

    static final class c extends b
    {

        public final MenuItem a(MenuItem menuitem, e e1)
        {
            if (e1 == null)
            {
                return l.a(menuitem, null);
            } else
            {
                return l.a(menuitem, new l.b(this, e1) {

                    final e a;
                    final c b;

                    public final boolean a(MenuItem menuitem)
                    {
                        return a.onMenuItemActionExpand(menuitem);
                    }

                    public final boolean b(MenuItem menuitem)
                    {
                        return a.onMenuItemActionCollapse(menuitem);
                    }

            
            {
                b = c1;
                a = e1;
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

        c()
        {
        }
    }

    static interface d
    {

        public abstract MenuItem a(MenuItem menuitem, e e1);

        public abstract MenuItem a(MenuItem menuitem, View view);

        public abstract View a(MenuItem menuitem);

        public abstract void a(MenuItem menuitem, int i);

        public abstract MenuItem b(MenuItem menuitem, int i);

        public abstract boolean b(MenuItem menuitem);

        public abstract boolean c(MenuItem menuitem);
    }

    public static interface e
    {

        public abstract boolean onMenuItemActionCollapse(MenuItem menuitem);

        public abstract boolean onMenuItemActionExpand(MenuItem menuitem);
    }


    static final d a;

    public static MenuItem a(MenuItem menuitem, android.support.v4.view.d d1)
    {
        if (menuitem instanceof android.support.v4.internal.view.b)
        {
            return ((android.support.v4.internal.view.b)menuitem).a(d1);
        } else
        {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            return menuitem;
        }
    }

    public static MenuItem a(MenuItem menuitem, e e1)
    {
        if (menuitem instanceof android.support.v4.internal.view.b)
        {
            return ((android.support.v4.internal.view.b)menuitem).a(e1);
        } else
        {
            return a.a(menuitem, e1);
        }
    }

    public static MenuItem a(MenuItem menuitem, View view)
    {
        if (menuitem instanceof android.support.v4.internal.view.b)
        {
            return ((android.support.v4.internal.view.b)menuitem).setActionView(view);
        } else
        {
            return a.a(menuitem, view);
        }
    }

    public static View a(MenuItem menuitem)
    {
        if (menuitem instanceof android.support.v4.internal.view.b)
        {
            return ((android.support.v4.internal.view.b)menuitem).getActionView();
        } else
        {
            return a.a(menuitem);
        }
    }

    public static void a(MenuItem menuitem, int i)
    {
        if (menuitem instanceof android.support.v4.internal.view.b)
        {
            ((android.support.v4.internal.view.b)menuitem).setShowAsAction(i);
            return;
        } else
        {
            a.a(menuitem, i);
            return;
        }
    }

    public static MenuItem b(MenuItem menuitem, int i)
    {
        if (menuitem instanceof android.support.v4.internal.view.b)
        {
            return ((android.support.v4.internal.view.b)menuitem).setActionView(i);
        } else
        {
            return a.b(menuitem, i);
        }
    }

    public static boolean b(MenuItem menuitem)
    {
        if (menuitem instanceof android.support.v4.internal.view.b)
        {
            return ((android.support.v4.internal.view.b)menuitem).expandActionView();
        } else
        {
            return a.b(menuitem);
        }
    }

    public static boolean c(MenuItem menuitem)
    {
        if (menuitem instanceof android.support.v4.internal.view.b)
        {
            return ((android.support.v4.internal.view.b)menuitem).isActionViewExpanded();
        } else
        {
            return a.c(menuitem);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14)
        {
            a = new c();
        } else
        if (i >= 11)
        {
            a = new b();
        } else
        {
            a = new a();
        }
    }
}
