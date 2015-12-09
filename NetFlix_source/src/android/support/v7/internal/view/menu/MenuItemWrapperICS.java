// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.view.CollapsibleActionView;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseMenuWrapper, BaseWrapper

public class MenuItemWrapperICS extends BaseMenuWrapper
    implements SupportMenuItem
{
    class ActionProviderWrapper extends android.view.ActionProvider
    {

        final ActionProvider mInner;
        final MenuItemWrapperICS this$0;

        public boolean hasSubMenu()
        {
            return mInner.hasSubMenu();
        }

        public View onCreateActionView()
        {
            if (mEmulateProviderVisibilityOverride)
            {
                checkActionProviderOverrideVisibility();
            }
            return mInner.onCreateActionView();
        }

        public boolean onPerformDefaultAction()
        {
            return mInner.onPerformDefaultAction();
        }

        public void onPrepareSubMenu(SubMenu submenu)
        {
            mInner.onPrepareSubMenu(getSubMenuWrapper(submenu));
        }

        public ActionProviderWrapper(ActionProvider actionprovider)
        {
            this$0 = MenuItemWrapperICS.this;
            super(actionprovider.getContext());
            mInner = actionprovider;
            if (mEmulateProviderVisibilityOverride)
            {
                mInner.setVisibilityListener(new _cls1());
            }
        }
    }

    static class CollapsibleActionViewWrapper extends FrameLayout
        implements android.view.CollapsibleActionView
    {

        final CollapsibleActionView mWrappedView;

        View getWrappedView()
        {
            return (View)mWrappedView;
        }

        public void onActionViewCollapsed()
        {
            mWrappedView.onActionViewCollapsed();
        }

        public void onActionViewExpanded()
        {
            mWrappedView.onActionViewExpanded();
        }

        CollapsibleActionViewWrapper(View view)
        {
            super(view.getContext());
            mWrappedView = (CollapsibleActionView)view;
            addView(view);
        }
    }

    private class OnActionExpandListenerWrapper extends BaseWrapper
        implements android.view.MenuItem.OnActionExpandListener
    {

        final MenuItemWrapperICS this$0;

        public boolean onMenuItemActionCollapse(MenuItem menuitem)
        {
            return ((android.support.v4.view.MenuItemCompat.OnActionExpandListener)mWrappedObject).onMenuItemActionCollapse(getMenuItemWrapper(menuitem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuitem)
        {
            return ((android.support.v4.view.MenuItemCompat.OnActionExpandListener)mWrappedObject).onMenuItemActionExpand(getMenuItemWrapper(menuitem));
        }

        OnActionExpandListenerWrapper(android.support.v4.view.MenuItemCompat.OnActionExpandListener onactionexpandlistener)
        {
            this$0 = MenuItemWrapperICS.this;
            super(onactionexpandlistener);
        }
    }

    private class OnMenuItemClickListenerWrapper extends BaseWrapper
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final MenuItemWrapperICS this$0;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnMenuItemClickListener)mWrappedObject).onMenuItemClick(getMenuItemWrapper(menuitem));
        }

        OnMenuItemClickListenerWrapper(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
        {
            this$0 = MenuItemWrapperICS.this;
            super(onmenuitemclicklistener);
        }
    }


    static final String LOG_TAG = "MenuItemWrapper";
    private final boolean mEmulateProviderVisibilityOverride;
    private boolean mLastRequestVisible;
    private Method mSetExclusiveCheckableMethod;

    MenuItemWrapperICS(MenuItem menuitem)
    {
        this(menuitem, true);
    }

    MenuItemWrapperICS(MenuItem menuitem, boolean flag)
    {
        super(menuitem);
        mLastRequestVisible = menuitem.isVisible();
        mEmulateProviderVisibilityOverride = flag;
    }

    final boolean checkActionProviderOverrideVisibility()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mLastRequestVisible)
        {
            ActionProvider actionprovider = getSupportActionProvider();
            flag = flag1;
            if (actionprovider != null)
            {
                flag = flag1;
                if (actionprovider.overridesItemVisibility())
                {
                    flag = flag1;
                    if (!actionprovider.isVisible())
                    {
                        wrappedSetVisible(false);
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public boolean collapseActionView()
    {
        return ((MenuItem)mWrappedObject).collapseActionView();
    }

    ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
    {
        return new ActionProviderWrapper(actionprovider);
    }

    public boolean expandActionView()
    {
        return ((MenuItem)mWrappedObject).expandActionView();
    }

    public android.view.ActionProvider getActionProvider()
    {
        return ((MenuItem)mWrappedObject).getActionProvider();
    }

    public View getActionView()
    {
        View view1 = ((MenuItem)mWrappedObject).getActionView();
        View view = view1;
        if (view1 instanceof CollapsibleActionViewWrapper)
        {
            view = ((CollapsibleActionViewWrapper)view1).getWrappedView();
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((MenuItem)mWrappedObject).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((MenuItem)mWrappedObject).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((MenuItem)mWrappedObject).getIcon();
    }

    public Intent getIntent()
    {
        return ((MenuItem)mWrappedObject).getIntent();
    }

    public int getItemId()
    {
        return ((MenuItem)mWrappedObject).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((MenuItem)mWrappedObject).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((MenuItem)mWrappedObject).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((MenuItem)mWrappedObject).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return getSubMenuWrapper(((MenuItem)mWrappedObject).getSubMenu());
    }

    public ActionProvider getSupportActionProvider()
    {
        ActionProviderWrapper actionproviderwrapper = (ActionProviderWrapper)((MenuItem)mWrappedObject).getActionProvider();
        if (actionproviderwrapper != null)
        {
            return actionproviderwrapper.mInner;
        } else
        {
            return null;
        }
    }

    public CharSequence getTitle()
    {
        return ((MenuItem)mWrappedObject).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((MenuItem)mWrappedObject).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((MenuItem)mWrappedObject).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((MenuItem)mWrappedObject).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((MenuItem)mWrappedObject).isCheckable();
    }

    public boolean isChecked()
    {
        return ((MenuItem)mWrappedObject).isChecked();
    }

    public boolean isEnabled()
    {
        return ((MenuItem)mWrappedObject).isEnabled();
    }

    public boolean isVisible()
    {
        return ((MenuItem)mWrappedObject).isVisible();
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionprovider)
    {
        ((MenuItem)mWrappedObject).setActionProvider(actionprovider);
        if (actionprovider != null && mEmulateProviderVisibilityOverride)
        {
            checkActionProviderOverrideVisibility();
        }
        return this;
    }

    public MenuItem setActionView(int i)
    {
        ((MenuItem)mWrappedObject).setActionView(i);
        View view = ((MenuItem)mWrappedObject).getActionView();
        if (view instanceof CollapsibleActionView)
        {
            ((MenuItem)mWrappedObject).setActionView(new CollapsibleActionViewWrapper(view));
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view instanceof CollapsibleActionView)
        {
            obj = new CollapsibleActionViewWrapper(view);
        }
        ((MenuItem)mWrappedObject).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        ((MenuItem)mWrappedObject).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((MenuItem)mWrappedObject).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((MenuItem)mWrappedObject).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((MenuItem)mWrappedObject).setEnabled(flag);
        return this;
    }

    public void setExclusiveCheckable(boolean flag)
    {
        try
        {
            if (mSetExclusiveCheckableMethod == null)
            {
                mSetExclusiveCheckableMethod = ((MenuItem)mWrappedObject).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                    Boolean.TYPE
                });
            }
            mSetExclusiveCheckableMethod.invoke(mWrappedObject, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
        }
        catch (Exception exception)
        {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
        }
    }

    public MenuItem setIcon(int i)
    {
        ((MenuItem)mWrappedObject).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((MenuItem)mWrappedObject).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((MenuItem)mWrappedObject).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c)
    {
        ((MenuItem)mWrappedObject).setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        ((MenuItem)mWrappedObject).setOnActionExpandListener(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        MenuItem menuitem = (MenuItem)mWrappedObject;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new OnMenuItemClickListenerWrapper(onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        menuitem.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c, char c1)
    {
        ((MenuItem)mWrappedObject).setShortcut(c, c1);
        return this;
    }

    public void setShowAsAction(int i)
    {
        ((MenuItem)mWrappedObject).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        ((MenuItem)mWrappedObject).setShowAsActionFlags(i);
        return this;
    }

    public SupportMenuItem setSupportActionProvider(ActionProvider actionprovider)
    {
        MenuItem menuitem = (MenuItem)mWrappedObject;
        if (actionprovider != null)
        {
            actionprovider = createActionProviderWrapper(actionprovider);
        } else
        {
            actionprovider = null;
        }
        menuitem.setActionProvider(actionprovider);
        return this;
    }

    public SupportMenuItem setSupportOnActionExpandListener(android.support.v4.view.MenuItemCompat.OnActionExpandListener onactionexpandlistener)
    {
        MenuItem menuitem = (MenuItem)mWrappedObject;
        if (onactionexpandlistener != null)
        {
            onactionexpandlistener = new OnActionExpandListenerWrapper(onactionexpandlistener);
        } else
        {
            onactionexpandlistener = null;
        }
        menuitem.setOnActionExpandListener(onactionexpandlistener);
        return null;
    }

    public MenuItem setTitle(int i)
    {
        ((MenuItem)mWrappedObject).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((MenuItem)mWrappedObject).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((MenuItem)mWrappedObject).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        if (mEmulateProviderVisibilityOverride)
        {
            mLastRequestVisible = flag;
            if (checkActionProviderOverrideVisibility())
            {
                return this;
            }
        }
        return wrappedSetVisible(flag);
    }

    final MenuItem wrappedSetVisible(boolean flag)
    {
        return ((MenuItem)mWrappedObject).setVisible(flag);
    }



    // Unreferenced inner class android/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1

/* anonymous class */
    class ActionProviderWrapper._cls1
        implements android.support.v4.view.ActionProvider.VisibilityListener
    {

        final ActionProviderWrapper this$1;
        final MenuItemWrapperICS val$this$0;

        public void onActionProviderVisibilityChanged(boolean flag)
        {
            if (mInner.overridesItemVisibility() && mLastRequestVisible)
            {
                wrappedSetVisible(flag);
            }
        }

            
            {
                this$1 = final_actionproviderwrapper;
                this$0 = MenuItemWrapperICS.this;
                super();
            }
    }

}
