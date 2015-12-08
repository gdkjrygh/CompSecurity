// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.internal.view.SupportMenuItem;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ActionProvider, MenuItemCompatHoneycomb, MenuItemCompatIcs

public class MenuItemCompat
{
    static class BaseMenuVersionImpl
        implements MenuVersionImpl
    {

        public boolean collapseActionView(MenuItem menuitem)
        {
            return false;
        }

        public boolean expandActionView(MenuItem menuitem)
        {
            return false;
        }

        public View getActionView(MenuItem menuitem)
        {
            return null;
        }

        public boolean isActionViewExpanded(MenuItem menuitem)
        {
            return false;
        }

        public MenuItem setActionView(MenuItem menuitem, int i)
        {
            return menuitem;
        }

        public MenuItem setActionView(MenuItem menuitem, View view)
        {
            return menuitem;
        }

        public MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener)
        {
            return menuitem;
        }

        public void setShowAsAction(MenuItem menuitem, int i)
        {
        }

        BaseMenuVersionImpl()
        {
        }
    }

    static class HoneycombMenuVersionImpl
        implements MenuVersionImpl
    {

        public boolean collapseActionView(MenuItem menuitem)
        {
            return false;
        }

        public boolean expandActionView(MenuItem menuitem)
        {
            return false;
        }

        public View getActionView(MenuItem menuitem)
        {
            return MenuItemCompatHoneycomb.getActionView(menuitem);
        }

        public boolean isActionViewExpanded(MenuItem menuitem)
        {
            return false;
        }

        public MenuItem setActionView(MenuItem menuitem, int i)
        {
            return MenuItemCompatHoneycomb.setActionView(menuitem, i);
        }

        public MenuItem setActionView(MenuItem menuitem, View view)
        {
            return MenuItemCompatHoneycomb.setActionView(menuitem, view);
        }

        public MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener)
        {
            return menuitem;
        }

        public void setShowAsAction(MenuItem menuitem, int i)
        {
            MenuItemCompatHoneycomb.setShowAsAction(menuitem, i);
        }

        HoneycombMenuVersionImpl()
        {
        }
    }

    static class IcsMenuVersionImpl extends HoneycombMenuVersionImpl
    {

        public boolean collapseActionView(MenuItem menuitem)
        {
            return MenuItemCompatIcs.collapseActionView(menuitem);
        }

        public boolean expandActionView(MenuItem menuitem)
        {
            return MenuItemCompatIcs.expandActionView(menuitem);
        }

        public boolean isActionViewExpanded(MenuItem menuitem)
        {
            return MenuItemCompatIcs.isActionViewExpanded(menuitem);
        }

        public MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener)
        {
            if (onactionexpandlistener == null)
            {
                return MenuItemCompatIcs.setOnActionExpandListener(menuitem, null);
            } else
            {
                return MenuItemCompatIcs.setOnActionExpandListener(menuitem, onactionexpandlistener. new MenuItemCompatIcs.SupportActionExpandProxy() {

                    final IcsMenuVersionImpl this$0;
                    final OnActionExpandListener val$listener;

                    public boolean onMenuItemActionCollapse(MenuItem menuitem)
                    {
                        return listener.onMenuItemActionCollapse(menuitem);
                    }

                    public boolean onMenuItemActionExpand(MenuItem menuitem)
                    {
                        return listener.onMenuItemActionExpand(menuitem);
                    }

            
            {
                this$0 = final_icsmenuversionimpl;
                listener = OnActionExpandListener.this;
                super();
            }
                });
            }
        }

        IcsMenuVersionImpl()
        {
        }
    }

    static interface MenuVersionImpl
    {

        public abstract boolean collapseActionView(MenuItem menuitem);

        public abstract boolean expandActionView(MenuItem menuitem);

        public abstract View getActionView(MenuItem menuitem);

        public abstract boolean isActionViewExpanded(MenuItem menuitem);

        public abstract MenuItem setActionView(MenuItem menuitem, int i);

        public abstract MenuItem setActionView(MenuItem menuitem, View view);

        public abstract MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener);

        public abstract void setShowAsAction(MenuItem menuitem, int i);
    }

    public static interface OnActionExpandListener
    {

        public abstract boolean onMenuItemActionCollapse(MenuItem menuitem);

        public abstract boolean onMenuItemActionExpand(MenuItem menuitem);
    }


    static final MenuVersionImpl IMPL;
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final String TAG = "MenuItemCompat";

    public MenuItemCompat()
    {
    }

    public static boolean collapseActionView(MenuItem menuitem)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).collapseActionView();
        } else
        {
            return IMPL.collapseActionView(menuitem);
        }
    }

    public static boolean expandActionView(MenuItem menuitem)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).expandActionView();
        } else
        {
            return IMPL.expandActionView(menuitem);
        }
    }

    public static ActionProvider getActionProvider(MenuItem menuitem)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).getSupportActionProvider();
        } else
        {
            Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
            return null;
        }
    }

    public static View getActionView(MenuItem menuitem)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).getActionView();
        } else
        {
            return IMPL.getActionView(menuitem);
        }
    }

    public static boolean isActionViewExpanded(MenuItem menuitem)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).isActionViewExpanded();
        } else
        {
            return IMPL.isActionViewExpanded(menuitem);
        }
    }

    public static MenuItem setActionProvider(MenuItem menuitem, ActionProvider actionprovider)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).setSupportActionProvider(actionprovider);
        } else
        {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            return menuitem;
        }
    }

    public static MenuItem setActionView(MenuItem menuitem, int i)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).setActionView(i);
        } else
        {
            return IMPL.setActionView(menuitem, i);
        }
    }

    public static MenuItem setActionView(MenuItem menuitem, View view)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).setActionView(view);
        } else
        {
            return IMPL.setActionView(menuitem, view);
        }
    }

    public static MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).setSupportOnActionExpandListener(onactionexpandlistener);
        } else
        {
            return IMPL.setOnActionExpandListener(menuitem, onactionexpandlistener);
        }
    }

    public static void setShowAsAction(MenuItem menuitem, int i)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            ((SupportMenuItem)menuitem).setShowAsAction(i);
            return;
        } else
        {
            IMPL.setShowAsAction(menuitem, i);
            return;
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14)
        {
            IMPL = new IcsMenuVersionImpl();
        } else
        if (i >= 11)
        {
            IMPL = new HoneycombMenuVersionImpl();
        } else
        {
            IMPL = new BaseMenuVersionImpl();
        }
    }
}
