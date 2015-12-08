// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.actionbarsherlock.internal.view.ActionProviderWrapper;
import com.actionbarsherlock.internal.widget.CollapsibleActionViewWrapper;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.CollapsibleActionView;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            SubMenuWrapper

public class MenuItemWrapper
    implements MenuItem, android.view.MenuItem.OnMenuItemClickListener
{

    private com.actionbarsherlock.view.MenuItem.OnActionExpandListener mActionExpandListener;
    private com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener mMenuItemClickListener;
    private android.view.MenuItem.OnActionExpandListener mNativeActionExpandListener;
    private final android.view.MenuItem mNativeItem;
    private SubMenu mSubMenu;

    public MenuItemWrapper(android.view.MenuItem menuitem)
    {
        mSubMenu = null;
        mMenuItemClickListener = null;
        mActionExpandListener = null;
        mNativeActionExpandListener = null;
        if (menuitem == null)
        {
            throw new IllegalStateException("Wrapped menu item cannot be null.");
        } else
        {
            mNativeItem = menuitem;
            return;
        }
    }

    public boolean collapseActionView()
    {
        return mNativeItem.collapseActionView();
    }

    public boolean expandActionView()
    {
        return mNativeItem.expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        android.view.ActionProvider actionprovider = mNativeItem.getActionProvider();
        if (actionprovider != null && (actionprovider instanceof ActionProviderWrapper))
        {
            return ((ActionProviderWrapper)actionprovider).unwrap();
        } else
        {
            return null;
        }
    }

    public View getActionView()
    {
        View view1 = mNativeItem.getActionView();
        View view = view1;
        if (view1 instanceof CollapsibleActionViewWrapper)
        {
            view = ((CollapsibleActionViewWrapper)view1).unwrap();
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return mNativeItem.getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return mNativeItem.getGroupId();
    }

    public Drawable getIcon()
    {
        return mNativeItem.getIcon();
    }

    public Intent getIntent()
    {
        return mNativeItem.getIntent();
    }

    public int getItemId()
    {
        return mNativeItem.getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return mNativeItem.getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return mNativeItem.getNumericShortcut();
    }

    public int getOrder()
    {
        return mNativeItem.getOrder();
    }

    public SubMenu getSubMenu()
    {
        if (hasSubMenu() && mSubMenu == null)
        {
            mSubMenu = new SubMenuWrapper(mNativeItem.getSubMenu());
        }
        return mSubMenu;
    }

    public CharSequence getTitle()
    {
        return mNativeItem.getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return mNativeItem.getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return mNativeItem.hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return mNativeItem.isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return mNativeItem.isCheckable();
    }

    public boolean isChecked()
    {
        return mNativeItem.isChecked();
    }

    public boolean isEnabled()
    {
        return mNativeItem.isEnabled();
    }

    public boolean isVisible()
    {
        return mNativeItem.isVisible();
    }

    public boolean onMenuItemClick(android.view.MenuItem menuitem)
    {
        if (mMenuItemClickListener != null)
        {
            return mMenuItemClickListener.onMenuItemClick(this);
        } else
        {
            return false;
        }
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        mNativeItem.setActionProvider(new ActionProviderWrapper(actionprovider));
        return this;
    }

    public MenuItem setActionView(int i)
    {
        mNativeItem.setActionView(i);
        if (i != 0)
        {
            View view = mNativeItem.getActionView();
            if (view instanceof CollapsibleActionView)
            {
                mNativeItem.setActionView(new CollapsibleActionViewWrapper(view));
            }
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view != null)
        {
            obj = view;
            if (view instanceof CollapsibleActionView)
            {
                obj = new CollapsibleActionViewWrapper(view);
            }
        }
        mNativeItem.setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        mNativeItem.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        mNativeItem.setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        mNativeItem.setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        mNativeItem.setEnabled(flag);
        return this;
    }

    public MenuItem setIcon(int i)
    {
        mNativeItem.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        mNativeItem.setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        mNativeItem.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c)
    {
        mNativeItem.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(com.actionbarsherlock.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        mActionExpandListener = onactionexpandlistener;
        if (mNativeActionExpandListener == null)
        {
            mNativeActionExpandListener = new android.view.MenuItem.OnActionExpandListener() {

                final MenuItemWrapper this$0;

                public boolean onMenuItemActionCollapse(android.view.MenuItem menuitem)
                {
                    if (mActionExpandListener != null)
                    {
                        return mActionExpandListener.onMenuItemActionCollapse(MenuItemWrapper.this);
                    } else
                    {
                        return false;
                    }
                }

                public boolean onMenuItemActionExpand(android.view.MenuItem menuitem)
                {
                    if (mActionExpandListener != null)
                    {
                        return mActionExpandListener.onMenuItemActionExpand(MenuItemWrapper.this);
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = MenuItemWrapper.this;
                super();
            }
            };
            mNativeItem.setOnActionExpandListener(mNativeActionExpandListener);
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        mMenuItemClickListener = onmenuitemclicklistener;
        mNativeItem.setOnMenuItemClickListener(this);
        return this;
    }

    public MenuItem setShortcut(char c, char c1)
    {
        mNativeItem.setShortcut(c, c1);
        return this;
    }

    public void setShowAsAction(int i)
    {
        mNativeItem.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        mNativeItem.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i)
    {
        mNativeItem.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        mNativeItem.setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        mNativeItem.setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        mNativeItem.setVisible(flag);
        return this;
    }

}
