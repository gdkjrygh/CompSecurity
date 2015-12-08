// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
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
            h h1 = ((prepareMenuItems)mItems.get(i)).MenuItem();
            if (h1.getIcon() != null)
            {
                continue;
            }
            if (mTransparentIcon == null)
            {
                mTransparentIcon = new ColorDrawable(0x106000d);
            }
            h1.setIcon(mTransparentIcon);
        }

    }

    private void prepareMenuItems()
    {
        if (!mUpdateSuspended) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        int k;
        int l1;
        int j2;
        mItems.clear();
        k = -1;
        j2 = NavigationMenuPresenter.access$400(NavigationMenuPresenter.this).h().size();
        l1 = 0;
        j = 0;
        i = 0;
_L6:
        if (l1 >= j2) goto _L1; else goto _L3
_L3:
        Object obj = (h)NavigationMenuPresenter.access$400(NavigationMenuPresenter.this).h().get(l1);
        if (!((h) (obj)).hasSubMenu()) goto _L5; else goto _L4
_L4:
        SubMenu submenu = ((h) (obj)).getSubMenu();
        if (submenu.hasVisibleItems())
        {
            if (l1 != 0)
            {
                mItems.add(arator(NavigationMenuPresenter.access$500(NavigationMenuPresenter.this), 0));
            }
            mItems.add(mItems(((h) (obj))));
            int k2 = mItems.size();
            int l2 = submenu.size();
            int i2 = 0;
            boolean flag;
            boolean flag1;
            for (flag = false; i2 < l2; flag = flag1)
            {
                obj = submenu.getItem(i2);
                flag1 = flag;
                if (((MenuItem) (obj)).isVisible())
                {
                    flag1 = flag;
                    if (!flag)
                    {
                        flag1 = flag;
                        if (((MenuItem) (obj)).getIcon() != null)
                        {
                            flag1 = true;
                        }
                    }
                    mItems.add(mItems((h)obj));
                }
                i2++;
            }

            if (flag)
            {
                appendTransparentIconIfMissing(k2, mItems.size());
            }
        }
        int l = j;
        j = i;
        i = l;
_L7:
        l1++;
        int i1 = j;
        j = i;
        i = i1;
          goto _L6
_L5:
        int j1;
label0:
        {
            int k1 = ((h) (obj)).getGroupId();
            if (k1 != k)
            {
                j = mItems.size();
                if (((h) (obj)).getIcon() != null)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                j1 = i;
                k = j;
                if (l1 == 0)
                {
                    break label0;
                }
                mItems.add(arator(NavigationMenuPresenter.access$500(NavigationMenuPresenter.this), NavigationMenuPresenter.access$500(NavigationMenuPresenter.this)));
                j++;
            } else
            {
                j1 = j;
                k = i;
                if (j != 0)
                {
                    break label0;
                }
                j1 = j;
                k = i;
                if (((h) (obj)).getIcon() == null)
                {
                    break label0;
                }
                appendTransparentIconIfMissing(i, mItems.size());
                k = 1;
                j = i;
                i = k;
            }
        }
_L8:
        if (i != 0 && ((h) (obj)).getIcon() == null)
        {
            ((h) (obj)).setIcon(0x106000d);
        }
        mItems.add(mItems(((h) (obj))));
        k = k1;
          goto _L7
        i = j1;
        j = k;
          goto _L8
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
            h h1 = ((mItems)iterator.next()).MenuItem();
            if (h1 != null && h1.isChecked())
            {
                arraylist.add(Integer.valueOf(h1.getItemId()));
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
        getItemViewType(i);
        JVM INSTR tableswitch 0 2: default 40
    //                   0 42
    //                   1 140
    //                   2 177;
           goto _L1 _L2 _L3 _L4
_L1:
        return view;
_L2:
        if (view == null)
        {
            view = NavigationMenuPresenter.access$000(NavigationMenuPresenter.this).inflate(android.support.design.uAdapter.this._fld0, viewgroup, false);
        }
        NavigationMenuItemView navigationmenuitemview = (NavigationMenuItemView)view;
        navigationmenuitemview.setIconTintList(NavigationMenuPresenter.access$100(NavigationMenuPresenter.this));
        navigationmenuitemview.setTextColor(NavigationMenuPresenter.access$200(NavigationMenuPresenter.this));
        if (NavigationMenuPresenter.access$300(NavigationMenuPresenter.this) != null)
        {
            viewgroup = NavigationMenuPresenter.access$300(NavigationMenuPresenter.this).getConstantState()._mth0();
        } else
        {
            viewgroup = null;
        }
        navigationmenuitemview.setBackgroundDrawable(viewgroup);
        navigationmenuitemview.initialize(menuitem.MenuItem(), 0);
        return view;
_L3:
        if (view == null)
        {
            view = NavigationMenuPresenter.access$000(NavigationMenuPresenter.this).inflate(android.support.design.uAdapter.this._fld0, viewgroup, false);
        }
        ((TextView)view).setText(menuitem.MenuItem().getTitle());
        return view;
_L4:
        View view1 = view;
        if (view == null)
        {
            view1 = NavigationMenuPresenter.access$000(NavigationMenuPresenter.this).inflate(android.support.design.uAdapter.this._fld0, viewgroup, false);
        }
        view1.setPadding(0, menuitem.PaddingTop(), 0, menuitem.PaddingBottom());
        view = view1;
        if (true) goto _L1; else goto _L5
_L5:
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
                h h1 = ((mItems)iterator.next()).MenuItem();
                if (h1 != null && bundle.contains(Integer.valueOf(h1.getItemId())))
                {
                    h1.setChecked(true);
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
