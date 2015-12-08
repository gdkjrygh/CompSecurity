// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuPresenter, MenuView, MenuBuilder, MenuItemImpl, 
//            SubMenuBuilder

public abstract class BaseMenuPresenter
    implements MenuPresenter
{

    public MenuPresenter.Callback mCallback;
    public Context mContext;
    public int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    public MenuBuilder mMenu;
    private int mMenuLayoutRes;
    public MenuView mMenuView;
    public Context mSystemContext;
    protected LayoutInflater mSystemInflater;

    public BaseMenuPresenter(Context context, int i, int j)
    {
        mSystemContext = context;
        mSystemInflater = LayoutInflater.from(context);
        mMenuLayoutRes = 0x7f040004;
        mItemLayoutRes = 0x7f040003;
    }

    public abstract void bindItemView(MenuItemImpl menuitemimpl, MenuView.ItemView itemview);

    public final boolean collapseItemActionView$29f2911(MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public final boolean expandItemActionView$29f2911(MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public boolean filterLeftoverView(ViewGroup viewgroup, int i)
    {
        viewgroup.removeViewAt(i);
        return true;
    }

    public boolean flagActionItems()
    {
        return false;
    }

    public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
    {
        if (view instanceof MenuView.ItemView)
        {
            view = (MenuView.ItemView)view;
        } else
        {
            view = (MenuView.ItemView)mSystemInflater.inflate(mItemLayoutRes, viewgroup, false);
        }
        bindItemView(menuitemimpl, view);
        return (View)view;
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
        if (mMenuView == null)
        {
            mMenuView = (MenuView)mSystemInflater.inflate(mMenuLayoutRes, viewgroup, false);
            mMenuView.initialize(mMenu);
            updateMenuView(true);
        }
        return mMenuView;
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mMenu = menubuilder;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mCallback != null)
        {
            mCallback.onCloseMenu(menubuilder, flag);
        }
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        if (mCallback != null)
        {
            return mCallback.onOpenSubMenu(submenubuilder);
        } else
        {
            return false;
        }
    }

    public boolean shouldIncludeItem$361c3b3b(MenuItemImpl menuitemimpl)
    {
        return true;
    }

    public void updateMenuView(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)mMenuView;
        if (viewgroup != null)
        {
            int j = 0;
            int i = 0;
            if (mMenu != null)
            {
                mMenu.flagActionItems();
                ArrayList arraylist = mMenu.getVisibleItems();
                int l = arraylist.size();
                int k = 0;
                do
                {
                    j = i;
                    if (k >= l)
                    {
                        break;
                    }
                    MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(k);
                    j = i;
                    if (shouldIncludeItem$361c3b3b(menuitemimpl))
                    {
                        View view = viewgroup.getChildAt(i);
                        Object obj;
                        View view1;
                        if (view instanceof MenuView.ItemView)
                        {
                            obj = ((MenuView.ItemView)view).getItemData();
                        } else
                        {
                            obj = null;
                        }
                        view1 = getItemView(menuitemimpl, view, viewgroup);
                        if (menuitemimpl != obj)
                        {
                            view1.setPressed(false);
                            ViewCompat.jumpDrawablesToCurrentState(view1);
                        }
                        if (view1 != view)
                        {
                            obj = (ViewGroup)view1.getParent();
                            if (obj != null)
                            {
                                ((ViewGroup) (obj)).removeView(view1);
                            }
                            ((ViewGroup)mMenuView).addView(view1, i);
                        }
                        j = i + 1;
                    }
                    k++;
                    i = j;
                } while (true);
            }
            while (j < viewgroup.getChildCount()) 
            {
                if (!filterLeftoverView(viewgroup, j))
                {
                    j++;
                }
            }
        }
    }
}
