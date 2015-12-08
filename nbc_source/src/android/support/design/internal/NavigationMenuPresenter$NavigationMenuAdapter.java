// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.internal:
//            NavigationMenuPresenter, NavigationMenuItemView

private class prepareMenuItems extends BaseAdapter
{

    private static final String STATE_CHECKED_ITEMS = "android:menu:checked";
    private static final int VIEW_TYPE_NORMAL = 0;
    private static final int VIEW_TYPE_SEPARATOR = 2;
    private static final int VIEW_TYPE_SUBHEADER = 1;
    private final ArrayList mItems = new ArrayList();
    private ColorDrawable mTransparentIcon;
    private boolean mUpdateSuspended;
    final NavigationMenuPresenter this$0;

    private void appendTransparentIconIfMissing(int i, int j)
    {
        for (; i < j; i++)
        {
            MenuItemImpl menuitemimpl = ((prepareMenuItems)mItems.get(i)).MenuItem();
            if (menuitemimpl.getIcon() != null)
            {
                continue;
            }
            if (mTransparentIcon == null)
            {
                mTransparentIcon = new ColorDrawable(0x106000d);
            }
            menuitemimpl.setIcon(mTransparentIcon);
        }

    }

    private void prepareMenuItems()
    {
        if (!mUpdateSuspended)
        {
            mItems.clear();
            int j1 = -1;
            int k = 0;
            int l = 0;
            int i1 = 0;
            int i2 = NavigationMenuPresenter.access$400(NavigationMenuPresenter.this).getVisibleItems().size();
            while (i1 < i2) 
            {
                Object obj = (MenuItemImpl)NavigationMenuPresenter.access$400(NavigationMenuPresenter.this).getVisibleItems().get(i1);
                int j;
                int k1;
                int l1;
                if (((MenuItemImpl) (obj)).hasSubMenu())
                {
                    SubMenu submenu = ((MenuItemImpl) (obj)).getSubMenu();
                    j = l;
                    k1 = j1;
                    l1 = k;
                    if (submenu.hasVisibleItems())
                    {
                        if (i1 != 0)
                        {
                            mItems.add(arator(NavigationMenuPresenter.access$500(NavigationMenuPresenter.this), 0));
                        }
                        mItems.add(mItems(((MenuItemImpl) (obj))));
                        boolean flag = false;
                        int j2 = mItems.size();
                        k1 = 0;
                        for (l1 = submenu.size(); k1 < l1;)
                        {
                            obj = submenu.getItem(k1);
                            j = ((flag) ? 1 : 0);
                            if (((MenuItem) (obj)).isVisible())
                            {
                                j = ((flag) ? 1 : 0);
                                if (!flag)
                                {
                                    j = ((flag) ? 1 : 0);
                                    if (((MenuItem) (obj)).getIcon() != null)
                                    {
                                        j = 1;
                                    }
                                }
                                mItems.add(mItems((MenuItemImpl)obj));
                            }
                            k1++;
                            flag = j;
                        }

                        j = l;
                        k1 = j1;
                        l1 = k;
                        if (flag)
                        {
                            appendTransparentIconIfMissing(j2, mItems.size());
                            l1 = k;
                            k1 = j1;
                            j = l;
                        }
                    }
                } else
                {
                    k1 = ((MenuItemImpl) (obj)).getGroupId();
                    int i;
                    if (k1 != j1)
                    {
                        l = mItems.size();
                        if (((MenuItemImpl) (obj)).getIcon() != null)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        j = k;
                        i = l;
                        if (i1 != 0)
                        {
                            i = l + 1;
                            mItems.add(arator(NavigationMenuPresenter.access$500(NavigationMenuPresenter.this), NavigationMenuPresenter.access$500(NavigationMenuPresenter.this)));
                            j = k;
                        }
                    } else
                    {
                        j = l;
                        i = k;
                        if (l == 0)
                        {
                            j = l;
                            i = k;
                            if (((MenuItemImpl) (obj)).getIcon() != null)
                            {
                                j = 1;
                                appendTransparentIconIfMissing(k, mItems.size());
                                i = k;
                            }
                        }
                    }
                    if (j != 0 && ((MenuItemImpl) (obj)).getIcon() == null)
                    {
                        ((MenuItemImpl) (obj)).setIcon(0x106000d);
                    }
                    mItems.add(mItems(((MenuItemImpl) (obj))));
                    l1 = i;
                }
                i1++;
                l = j;
                j1 = k1;
                k = l1;
            }
        }
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public Bundle createInstanceState()
    {
        Bundle bundle = new Bundle();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mItems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MenuItemImpl menuitemimpl = ((mItems)iterator.next()).MenuItem();
            if (menuitemimpl != null && menuitemimpl.isChecked())
            {
                arraylist.add(Integer.valueOf(menuitemimpl.getItemId()));
            }
        } while (true);
        bundle.putIntegerArrayList("android:menu:checked", arraylist);
        return bundle;
    }

    public int getCount()
    {
        return mItems.size();
    }

    public mItems getItem(int i)
    {
        return (mItems)mItems.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        getItem getitem = getItem(i);
        if (getitem.eparator())
        {
            return 2;
        }
        return !getitem.MenuItem().hasSubMenu() ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        MenuItem menuitem = getItem(i);
        View view3;
        switch (getItemViewType(i))
        {
        default:
            return view;

        case 0: // '\0'
            View view1 = view;
            if (view == null)
            {
                view1 = NavigationMenuPresenter.access$000(NavigationMenuPresenter.this).inflate(android.support.design.uAdapter.this._fld0, viewgroup, false);
            }
            viewgroup = (NavigationMenuItemView)view1;
            viewgroup.setIconTintList(NavigationMenuPresenter.access$100(NavigationMenuPresenter.this));
            viewgroup.setTextColor(NavigationMenuPresenter.access$200(NavigationMenuPresenter.this));
            if (NavigationMenuPresenter.access$300(NavigationMenuPresenter.this) != null)
            {
                view = NavigationMenuPresenter.access$300(NavigationMenuPresenter.this).getConstantState()._mth0();
            } else
            {
                view = null;
            }
            viewgroup.setBackgroundDrawable(view);
            viewgroup.initialize(menuitem.MenuItem(), 0);
            return view1;

        case 1: // '\001'
            View view2 = view;
            if (view == null)
            {
                view2 = NavigationMenuPresenter.access$000(NavigationMenuPresenter.this).inflate(android.support.design.uAdapter.this._fld0, viewgroup, false);
            }
            ((TextView)view2).setText(menuitem.MenuItem().getTitle());
            return view2;

        case 2: // '\002'
            view3 = view;
            break;
        }
        if (view == null)
        {
            view3 = NavigationMenuPresenter.access$000(NavigationMenuPresenter.this).inflate(android.support.design.uAdapter.this._fld0, viewgroup, false);
        }
        view3.setPadding(0, menuitem.PaddingTop(), 0, menuitem.PaddingBottom());
        return view3;
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean isEnabled(int i)
    {
        return getItem(i).nabled();
    }

    public void notifyDataSetChanged()
    {
        prepareMenuItems();
        super.notifyDataSetChanged();
    }

    public void restoreInstanceState(Bundle bundle)
    {
        bundle = bundle.getIntegerArrayList("android:menu:checked");
        if (bundle != null)
        {
            mUpdateSuspended = true;
            Iterator iterator = mItems.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                MenuItemImpl menuitemimpl = ((mItems)iterator.next()).MenuItem();
                if (menuitemimpl != null && bundle.contains(Integer.valueOf(menuitemimpl.getItemId())))
                {
                    menuitemimpl.setChecked(true);
                }
            } while (true);
            mUpdateSuspended = false;
            prepareMenuItems();
        }
    }

    public void setUpdateSuspended(boolean flag)
    {
        mUpdateSuspended = flag;
    }

    ()
    {
        this$0 = NavigationMenuPresenter.this;
        super();
        prepareMenuItems();
    }
}
