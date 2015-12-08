// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.SubMenu;
import android.view.View;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuItemImpl, MenuPresenter, SubMenuBuilder

public class MenuBuilder
    implements Menu
{
    public static interface Callback
    {

        public abstract boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem);

        public abstract void onMenuModeChange(MenuBuilder menubuilder);
    }

    public static interface ItemInvoker
    {

        public abstract boolean invokeItem(MenuItemImpl menuitemimpl);
    }


    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final int sCategoryToOrder[];
    private ArrayList mActionItems;
    private Callback mCallback;
    private final Context mContext;
    private android.view.ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private ArrayList mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList mNonActionItems;
    private boolean mOptionalIconsVisible;
    private CopyOnWriteArrayList mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private ArrayList mTempShortcutItemList;
    private ArrayList mVisibleItems;

    public MenuBuilder(Context context)
    {
        mDefaultShowAsAction = 0;
        mPreventDispatchingItemsChanged = false;
        mItemsChangedWhileDispatchPrevented = false;
        mOptionalIconsVisible = false;
        mIsClosing = false;
        mTempShortcutItemList = new ArrayList();
        mPresenters = new CopyOnWriteArrayList();
        mContext = context;
        mResources = context.getResources();
        mItems = new ArrayList();
        mVisibleItems = new ArrayList();
        mIsVisibleItemsStale = true;
        mActionItems = new ArrayList();
        mNonActionItems = new ArrayList();
        mIsActionItemsStale = true;
        setShortcutsVisibleInner(true);
    }

    private MenuItem addInternal(int i, int j, int k, CharSequence charsequence)
    {
        int l = getOrdering(k);
        charsequence = new MenuItemImpl(this, i, j, k, l, charsequence, mDefaultShowAsAction);
        if (mCurrentMenuInfo != null)
        {
            charsequence.setMenuInfo(mCurrentMenuInfo);
        }
        mItems.add(findInsertIndex(mItems, l), charsequence);
        onItemsChanged(true);
        return charsequence;
    }

    private void dispatchPresenterUpdate(boolean flag)
    {
        if (mPresenters.isEmpty())
        {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator iterator = mPresenters.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                startDispatchingItemsChanged();
                return;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                mPresenters.remove(weakreference);
            } else
            {
                menupresenter.updateMenuView(flag);
            }
        } while (true);
    }

    private void dispatchRestoreInstanceState(Bundle bundle)
    {
        bundle = bundle.getSparseParcelableArray("android:menu:presenters");
        if (bundle != null && !mPresenters.isEmpty())
        {
            Iterator iterator = mPresenters.iterator();
            while (iterator.hasNext()) 
            {
                WeakReference weakreference = (WeakReference)iterator.next();
                MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
                if (menupresenter == null)
                {
                    mPresenters.remove(weakreference);
                } else
                {
                    int i = menupresenter.getId();
                    if (i > 0)
                    {
                        Parcelable parcelable = (Parcelable)bundle.get(i);
                        if (parcelable != null)
                        {
                            menupresenter.onRestoreInstanceState(parcelable);
                        }
                    }
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle)
    {
        if (mPresenters.isEmpty())
        {
            return;
        }
        SparseArray sparsearray = new SparseArray();
        Iterator iterator = mPresenters.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                bundle.putSparseParcelableArray("android:menu:presenters", sparsearray);
                return;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                mPresenters.remove(weakreference);
            } else
            {
                int i = menupresenter.getId();
                if (i > 0)
                {
                    Parcelable parcelable = menupresenter.onSaveInstanceState();
                    if (parcelable != null)
                    {
                        sparsearray.put(i, parcelable);
                    }
                }
            }
        } while (true);
    }

    private boolean dispatchSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        if (!mPresenters.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        boolean flag = false;
        Iterator iterator = mPresenters.iterator();
        do
        {
            flag1 = flag;
            if (!iterator.hasNext())
            {
                continue;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                mPresenters.remove(weakreference);
            } else
            if (!flag)
            {
                flag = menupresenter.onSubMenuSelected(submenubuilder);
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static int findInsertIndex(ArrayList arraylist, int i)
    {
        int j = arraylist.size() - 1;
        do
        {
            if (j < 0)
            {
                return 0;
            }
            if (((MenuItemImpl)arraylist.get(j)).getOrdering() <= i)
            {
                return j + 1;
            }
            j--;
        } while (true);
    }

    private static int getOrdering(int i)
    {
        int j = (0xffff0000 & i) >> 16;
        if (j < 0 || j >= sCategoryToOrder.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        } else
        {
            return sCategoryToOrder[j] << 16 | 0xffff & i;
        }
    }

    private void removeItemAtInt(int i, boolean flag)
    {
        if (i >= 0 && i < mItems.size())
        {
            mItems.remove(i);
            if (flag)
            {
                onItemsChanged(true);
                return;
            }
        }
    }

    private void setHeaderInternal(int i, CharSequence charsequence, int j, Drawable drawable, View view)
    {
        Resources resources = getResources();
        if (view == null) goto _L2; else goto _L1
_L1:
        mHeaderView = view;
        mHeaderTitle = null;
        mHeaderIcon = null;
_L4:
        onItemsChanged(false);
        return;
_L2:
        if (i > 0)
        {
            mHeaderTitle = resources.getText(i);
        } else
        if (charsequence != null)
        {
            mHeaderTitle = charsequence;
        }
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        mHeaderIcon = resources.getDrawable(j);
_L6:
        mHeaderView = null;
        if (true) goto _L4; else goto _L3
_L3:
        if (drawable == null) goto _L6; else goto _L5
_L5:
        mHeaderIcon = drawable;
          goto _L6
    }

    private void setShortcutsVisibleInner(boolean flag)
    {
        boolean flag1 = true;
        if (flag && mResources.getConfiguration().keyboard != 1 && mResources.getBoolean(com.actionbarsherlock.R.bool.abs__config_showMenuShortcutsWhenKeyboardPresent))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mShortcutsVisible = flag;
    }

    public MenuItem add(int i)
    {
        return addInternal(0, 0, 0, mResources.getString(i));
    }

    public MenuItem add(int i, int j, int k, int l)
    {
        return addInternal(i, j, k, mResources.getString(l));
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return addInternal(i, j, k, charsequence);
    }

    public MenuItem add(CharSequence charsequence)
    {
        return addInternal(0, 0, 0, charsequence);
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
        PackageManager packagemanager = mContext.getPackageManager();
        List list = packagemanager.queryIntentActivityOptions(componentname, aintent, intent, 0);
        int i1;
        if (list != null)
        {
            i1 = list.size();
        } else
        {
            i1 = 0;
        }
        if ((l & 1) == 0)
        {
            removeGroup(i);
        }
        l = 0;
        do
        {
            if (l >= i1)
            {
                return i1;
            }
            ResolveInfo resolveinfo = (ResolveInfo)list.get(l);
            if (resolveinfo.specificIndex < 0)
            {
                componentname = intent;
            } else
            {
                componentname = aintent[resolveinfo.specificIndex];
            }
            componentname = new Intent(componentname);
            componentname.setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
            componentname = add(i, j, k, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setIntent(componentname);
            if (amenuitem != null && resolveinfo.specificIndex >= 0)
            {
                amenuitem[resolveinfo.specificIndex] = componentname;
            }
            l++;
        } while (true);
    }

    public void addMenuPresenter(MenuPresenter menupresenter)
    {
        mPresenters.add(new WeakReference(menupresenter));
        menupresenter.initForMenu(mContext, this);
        mIsActionItemsStale = true;
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i)
    {
        return addSubMenu(0, 0, 0, ((CharSequence) (mResources.getString(i))));
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return addSubMenu(i, j, k, ((CharSequence) (mResources.getString(l))));
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        charsequence = (MenuItemImpl)addInternal(i, j, k, charsequence);
        SubMenuBuilder submenubuilder = new SubMenuBuilder(mContext, this, charsequence);
        charsequence.setSubMenu(submenubuilder);
        return submenubuilder;
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public boolean bindNativeOverflow(android.view.Menu menu, android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener, HashMap hashmap)
    {
        Object obj = getNonActionItems();
        if (obj != null && ((List) (obj)).size() != 0) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        Iterator iterator;
        boolean flag;
        flag = false;
        menu.clear();
        iterator = ((List) (obj)).iterator();
_L6:
        flag1 = flag;
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        MenuItemImpl menuitemimpl = (MenuItemImpl)iterator.next();
        if (!menuitemimpl.isVisible()) goto _L6; else goto _L5
_L5:
        Iterator iterator1;
        flag = true;
        if (!menuitemimpl.hasSubMenu())
        {
            break MISSING_BLOCK_LABEL_487;
        }
        obj = menu.addSubMenu(menuitemimpl.getGroupId(), menuitemimpl.getItemId(), menuitemimpl.getOrder(), menuitemimpl.getTitle());
        iterator1 = ((SubMenuBuilder)menuitemimpl.getSubMenu()).getVisibleItems().iterator();
_L9:
        if (iterator1.hasNext()) goto _L8; else goto _L7
_L7:
        obj = ((SubMenu) (obj)).getItem();
_L10:
        ((android.view.MenuItem) (obj)).setIcon(menuitemimpl.getIcon());
        ((android.view.MenuItem) (obj)).setOnMenuItemClickListener(onmenuitemclicklistener);
        ((android.view.MenuItem) (obj)).setEnabled(menuitemimpl.isEnabled());
        ((android.view.MenuItem) (obj)).setIntent(menuitemimpl.getIntent());
        ((android.view.MenuItem) (obj)).setNumericShortcut(menuitemimpl.getNumericShortcut());
        ((android.view.MenuItem) (obj)).setAlphabeticShortcut(menuitemimpl.getAlphabeticShortcut());
        ((android.view.MenuItem) (obj)).setTitleCondensed(menuitemimpl.getTitleCondensed());
        ((android.view.MenuItem) (obj)).setCheckable(menuitemimpl.isCheckable());
        ((android.view.MenuItem) (obj)).setChecked(menuitemimpl.isChecked());
        if (menuitemimpl.isExclusiveCheckable())
        {
            menu.setGroupCheckable(menuitemimpl.getGroupId(), true, true);
        }
        hashmap.put(obj, menuitemimpl);
          goto _L6
_L8:
        MenuItemImpl menuitemimpl1 = (MenuItemImpl)iterator1.next();
        android.view.MenuItem menuitem = ((SubMenu) (obj)).add(menuitemimpl1.getGroupId(), menuitemimpl1.getItemId(), menuitemimpl1.getOrder(), menuitemimpl1.getTitle());
        menuitem.setIcon(menuitemimpl1.getIcon());
        menuitem.setOnMenuItemClickListener(onmenuitemclicklistener);
        menuitem.setEnabled(menuitemimpl1.isEnabled());
        menuitem.setIntent(menuitemimpl1.getIntent());
        menuitem.setNumericShortcut(menuitemimpl1.getNumericShortcut());
        menuitem.setAlphabeticShortcut(menuitemimpl1.getAlphabeticShortcut());
        menuitem.setTitleCondensed(menuitemimpl1.getTitleCondensed());
        menuitem.setCheckable(menuitemimpl1.isCheckable());
        menuitem.setChecked(menuitemimpl1.isChecked());
        if (menuitemimpl1.isExclusiveCheckable())
        {
            ((SubMenu) (obj)).setGroupCheckable(menuitemimpl1.getGroupId(), true, true);
        }
        hashmap.put(menuitem, menuitemimpl1);
          goto _L9
        obj = menu.add(menuitemimpl.getGroupId(), menuitemimpl.getItemId(), menuitemimpl.getOrder(), menuitemimpl.getTitle());
          goto _L10
    }

    public void changeMenuMode()
    {
        if (mCallback != null)
        {
            mCallback.onMenuModeChange(this);
        }
    }

    public void clear()
    {
        if (mExpandedItem != null)
        {
            collapseItemActionView(mExpandedItem);
        }
        mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll()
    {
        mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        mPreventDispatchingItemsChanged = false;
        mItemsChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader()
    {
        mHeaderIcon = null;
        mHeaderTitle = null;
        mHeaderView = null;
        onItemsChanged(false);
    }

    public void close()
    {
        close(true);
    }

    final void close(boolean flag)
    {
        if (mIsClosing)
        {
            return;
        }
        mIsClosing = true;
        Iterator iterator = mPresenters.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                mIsClosing = false;
                return;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                mPresenters.remove(weakreference);
            } else
            {
                menupresenter.onCloseMenu(this, flag);
            }
        } while (true);
    }

    public boolean collapseItemActionView(MenuItemImpl menuitemimpl)
    {
        if (!mPresenters.isEmpty() && mExpandedItem == menuitemimpl) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L5:
        return flag1;
_L2:
        Iterator iterator;
        boolean flag;
        flag = false;
        stopDispatchingItemsChanged();
        iterator = mPresenters.iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        startDispatchingItemsChanged();
        flag1 = flag;
        if (flag)
        {
            mExpandedItem = null;
            return flag;
        }
          goto _L5
_L4:
        MenuPresenter menupresenter;
label0:
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter != null)
            {
                break label0;
            }
            mPresenters.remove(weakreference);
        }
          goto _L6
        flag1 = menupresenter.collapseItemActionView(this, menuitemimpl);
        flag = flag1;
        if (!flag1) goto _L6; else goto _L7
_L7:
        flag = flag1;
          goto _L3
    }

    boolean dispatchMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return mCallback != null && mCallback.onMenuItemSelected(menubuilder, menuitem);
    }

    public boolean expandItemActionView(MenuItemImpl menuitemimpl)
    {
        if (!mPresenters.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L5:
        return flag1;
_L2:
        Iterator iterator;
        boolean flag;
        flag = false;
        stopDispatchingItemsChanged();
        iterator = mPresenters.iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        startDispatchingItemsChanged();
        flag1 = flag;
        if (flag)
        {
            mExpandedItem = menuitemimpl;
            return flag;
        }
          goto _L5
_L4:
        MenuPresenter menupresenter;
label0:
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter != null)
            {
                break label0;
            }
            mPresenters.remove(weakreference);
        }
          goto _L6
        flag1 = menupresenter.expandItemActionView(this, menuitemimpl);
        flag = flag1;
        if (!flag1) goto _L6; else goto _L7
_L7:
        flag = flag1;
          goto _L3
    }

    public int findGroupIndex(int i)
    {
        return findGroupIndex(i, 0);
    }

    public int findGroupIndex(int i, int j)
    {
        int i1;
        i1 = size();
        int k = j;
        if (j < 0)
        {
            k = 0;
        }
        j = k;
_L6:
        if (j < i1) goto _L2; else goto _L1
_L1:
        int l = -1;
_L4:
        return l;
_L2:
        l = j;
        if (((MenuItemImpl)mItems.get(j)).getGroupId() == i) goto _L4; else goto _L3
_L3:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public MenuItem findItem(int i)
    {
        int j;
        int k;
        k = size();
        j = 0;
_L6:
        if (j < k) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((MenuItem) (obj));
_L2:
        MenuItemImpl menuitemimpl;
        menuitemimpl = (MenuItemImpl)mItems.get(j);
        obj = menuitemimpl;
        if (menuitemimpl.getItemId() == i) goto _L4; else goto _L3
_L3:
        if (menuitemimpl.hasSubMenu())
        {
            MenuItem menuitem = menuitemimpl.getSubMenu().findItem(i);
            if (menuitem != null)
            {
                return menuitem;
            }
        }
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int findItemIndex(int i)
    {
        int j;
        int l;
        l = size();
        j = 0;
_L6:
        if (j < l) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        k = j;
        if (((MenuItemImpl)mItems.get(j)).getItemId() == i) goto _L4; else goto _L3
_L3:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    MenuItemImpl findItemWithShortcutForKey(int i, KeyEvent keyevent)
    {
        ArrayList arraylist = mTempShortcutItemList;
        arraylist.clear();
        findItemsWithShortcutForKey(arraylist, i, keyevent);
        if (!arraylist.isEmpty())
        {
            int k = keyevent.getMetaState();
            android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
            keyevent.getKeyData(keydata);
            int l = arraylist.size();
            if (l == 1)
            {
                return (MenuItemImpl)arraylist.get(0);
            }
            boolean flag = isQwertyMode();
            int j = 0;
            while (j < l) 
            {
                keyevent = (MenuItemImpl)arraylist.get(j);
                char c;
                if (flag)
                {
                    c = keyevent.getAlphabeticShortcut();
                } else
                {
                    c = keyevent.getNumericShortcut();
                }
                if (c == keydata.meta[0] && (k & 2) == 0 || c == keydata.meta[2] && (k & 2) != 0 || flag && c == '\b' && i == 67)
                {
                    return keyevent;
                }
                j++;
            }
        }
        return null;
    }

    void findItemsWithShortcutForKey(List list, int i, KeyEvent keyevent)
    {
        boolean flag = isQwertyMode();
        int k = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i == 67)
        {
            int l = mItems.size();
            int j = 0;
            while (j < l) 
            {
                MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
                if (menuitemimpl.hasSubMenu())
                {
                    ((MenuBuilder)menuitemimpl.getSubMenu()).findItemsWithShortcutForKey(list, i, keyevent);
                }
                char c;
                if (flag)
                {
                    c = menuitemimpl.getAlphabeticShortcut();
                } else
                {
                    c = menuitemimpl.getNumericShortcut();
                }
                if ((k & 5) == 0 && c != 0 && (c == keydata.meta[0] || c == keydata.meta[2] || flag && c == '\b' && i == 67) && menuitemimpl.isEnabled())
                {
                    list.add(menuitemimpl);
                }
                j++;
            }
        }
    }

    public void flagActionItems()
    {
        Object obj;
        int i;
        if (!mIsActionItemsStale)
        {
            return;
        }
        i = 0;
        obj = mPresenters.iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        int j;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        mActionItems.clear();
        mNonActionItems.clear();
        obj = getVisibleItems();
        j = ((ArrayList) (obj)).size();
        i = 0;
_L6:
        if (i < j) goto _L4; else goto _L3
_L3:
        mIsActionItemsStale = false;
        return;
_L2:
        WeakReference weakreference = (WeakReference)((Iterator) (obj)).next();
        MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
        if (menupresenter == null)
        {
            mPresenters.remove(weakreference);
        } else
        {
            i |= menupresenter.flagActionItems();
        }
          goto _L5
_L4:
        MenuItemImpl menuitemimpl = (MenuItemImpl)((ArrayList) (obj)).get(i);
        if (menuitemimpl.isActionButton())
        {
            mActionItems.add(menuitemimpl);
        } else
        {
            mNonActionItems.add(menuitemimpl);
        }
        i++;
          goto _L6
        mActionItems.clear();
        mNonActionItems.clear();
        mNonActionItems.addAll(getVisibleItems());
          goto _L3
    }

    ArrayList getActionItems()
    {
        flagActionItems();
        return mActionItems;
    }

    protected String getActionViewStatesKey()
    {
        return "android:menu:actionviewstates";
    }

    public Context getContext()
    {
        return mContext;
    }

    public MenuItemImpl getExpandedItem()
    {
        return mExpandedItem;
    }

    public Drawable getHeaderIcon()
    {
        return mHeaderIcon;
    }

    public CharSequence getHeaderTitle()
    {
        return mHeaderTitle;
    }

    public View getHeaderView()
    {
        return mHeaderView;
    }

    public MenuItem getItem(int i)
    {
        return (MenuItem)mItems.get(i);
    }

    ArrayList getNonActionItems()
    {
        flagActionItems();
        return mNonActionItems;
    }

    boolean getOptionalIconsVisible()
    {
        return mOptionalIconsVisible;
    }

    Resources getResources()
    {
        return mResources;
    }

    public MenuBuilder getRootMenu()
    {
        return this;
    }

    ArrayList getVisibleItems()
    {
        if (!mIsVisibleItemsStale)
        {
            return mVisibleItems;
        }
        mVisibleItems.clear();
        int j = mItems.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                mIsVisibleItemsStale = false;
                mIsActionItemsStale = true;
                return mVisibleItems;
            }
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
            if (menuitemimpl.isVisible())
            {
                mVisibleItems.add(menuitemimpl);
            }
            i++;
        } while (true);
    }

    public boolean hasVisibleItems()
    {
        int j = size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return false;
            }
            if (((MenuItemImpl)mItems.get(i)).isVisible())
            {
                return true;
            }
            i++;
        } while (true);
    }

    boolean isQwertyMode()
    {
        return mQwertyMode;
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return findItemWithShortcutForKey(i, keyevent) != null;
    }

    public boolean isShortcutsVisible()
    {
        return mShortcutsVisible;
    }

    void onItemActionRequestChanged(MenuItemImpl menuitemimpl)
    {
        mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    void onItemVisibleChanged(MenuItemImpl menuitemimpl)
    {
        mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    void onItemsChanged(boolean flag)
    {
        if (!mPreventDispatchingItemsChanged)
        {
            if (flag)
            {
                mIsVisibleItemsStale = true;
                mIsActionItemsStale = true;
            }
            dispatchPresenterUpdate(flag);
            return;
        } else
        {
            mItemsChangedWhileDispatchPrevented = true;
            return;
        }
    }

    public boolean performIdentifierAction(int i, int j)
    {
        return performItemAction(findItem(i), j);
    }

    public boolean performItemAction(MenuItem menuitem, int i)
    {
        MenuItemImpl menuitemimpl = (MenuItemImpl)menuitem;
        if (menuitemimpl != null && menuitemimpl.isEnabled()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        boolean flag1;
        flag1 = menuitemimpl.invoke();
        if (!menuitemimpl.hasCollapsibleActionView())
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 |= menuitemimpl.expandActionView();
        flag = flag1;
        if (flag1)
        {
            close(true);
            return flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!menuitem.hasSubMenu())
        {
            break; /* Loop/switch isn't completed */
        }
        close(false);
        SubMenuBuilder submenubuilder = (SubMenuBuilder)menuitem.getSubMenu();
        menuitem = menuitem.getActionProvider();
        if (menuitem != null && menuitem.hasSubMenu())
        {
            menuitem.onPrepareSubMenu(submenubuilder);
        }
        flag1 |= dispatchSubMenuSelected(submenubuilder);
        flag = flag1;
        if (!flag1)
        {
            close(true);
            return flag1;
        }
        if (true) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if ((i & 1) == 0)
        {
            close(true);
            return flag1;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
        keyevent = findItemWithShortcutForKey(i, keyevent);
        boolean flag = false;
        if (keyevent != null)
        {
            flag = performItemAction(keyevent, j);
        }
        if ((j & 2) != 0)
        {
            close(true);
        }
        return flag;
    }

    public void removeGroup(int i)
    {
        int k = findGroupIndex(i);
        if (k < 0) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        l = mItems.size();
        j = 0;
_L6:
        if (j < l - k && ((MenuItemImpl)mItems.get(k)).getGroupId() == i) goto _L4; else goto _L3
_L3:
        onItemsChanged(true);
_L2:
        return;
_L4:
        removeItemAtInt(k, false);
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void removeItem(int i)
    {
        removeItemAtInt(findItemIndex(i), true);
    }

    public void removeItemAt(int i)
    {
        removeItemAtInt(i, true);
    }

    public void removeMenuPresenter(MenuPresenter menupresenter)
    {
        Iterator iterator = mPresenters.iterator();
        do
        {
            WeakReference weakreference;
            MenuPresenter menupresenter1;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                weakreference = (WeakReference)iterator.next();
                menupresenter1 = (MenuPresenter)weakreference.get();
            } while (menupresenter1 != null && menupresenter1 != menupresenter);
            mPresenters.remove(weakreference);
        } while (true);
    }

    public void restoreActionViewStates(Bundle bundle)
    {
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SparseArray sparsearray;
        int i;
        int j;
        sparsearray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        if (android.os.Build.VERSION.SDK_INT < 11 && sparsearray == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = size();
        i = 0;
_L4:
label0:
        {
            if (i < j)
            {
                break label0;
            }
            i = bundle.getInt("android:menu:expandedactionview");
            if (i > 0)
            {
                bundle = findItem(i);
                if (bundle != null)
                {
                    bundle.expandActionView();
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        MenuItem menuitem = getItem(i);
        View view = menuitem.getActionView();
        if (view != null && view.getId() != -1)
        {
            view.restoreHierarchyState(sparsearray);
        }
        if (menuitem.hasSubMenu())
        {
            ((SubMenuBuilder)menuitem.getSubMenu()).restoreActionViewStates(bundle);
        }
        i++;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void restorePresenterStates(Bundle bundle)
    {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle)
    {
        SparseArray sparsearray = null;
        int j = size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                if (sparsearray != null)
                {
                    bundle.putSparseParcelableArray(getActionViewStatesKey(), sparsearray);
                }
                return;
            }
            MenuItem menuitem = getItem(i);
            View view = menuitem.getActionView();
            SparseArray sparsearray2 = sparsearray;
            if (view != null)
            {
                sparsearray2 = sparsearray;
                if (view.getId() != -1)
                {
                    SparseArray sparsearray1 = sparsearray;
                    if (sparsearray == null)
                    {
                        sparsearray1 = new SparseArray();
                    }
                    view.saveHierarchyState(sparsearray1);
                    sparsearray2 = sparsearray1;
                    if (menuitem.isActionViewExpanded())
                    {
                        bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
                        sparsearray2 = sparsearray1;
                    }
                }
            }
            if (menuitem.hasSubMenu())
            {
                ((SubMenuBuilder)menuitem.getSubMenu()).saveActionViewStates(bundle);
            }
            i++;
            sparsearray = sparsearray2;
        } while (true);
    }

    public void savePresenterStates(Bundle bundle)
    {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(Callback callback)
    {
        mCallback = callback;
    }

    public void setCurrentMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        mCurrentMenuInfo = contextmenuinfo;
    }

    public MenuBuilder setDefaultShowAsAction(int i)
    {
        mDefaultShowAsAction = i;
        return this;
    }

    void setExclusiveItemChecked(MenuItem menuitem)
    {
        int j = menuitem.getGroupId();
        int k = mItems.size();
        int i = 0;
        do
        {
            if (i >= k)
            {
                return;
            }
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
            while (false) 
            {
                if (menuitemimpl.getGroupId() == j && menuitemimpl.isExclusiveCheckable() && menuitemimpl.isCheckable())
                {
                    boolean flag;
                    if (menuitemimpl == menuitem)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    menuitemimpl.setCheckedInt(flag);
                }
                i++;
            }
        } while (true);
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        int k = mItems.size();
        int j = 0;
        do
        {
            if (j >= k)
            {
                return;
            }
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
            if (menuitemimpl.getGroupId() == i)
            {
                menuitemimpl.setExclusiveCheckable(flag1);
                menuitemimpl.setCheckable(flag);
            }
            j++;
        } while (true);
    }

    public void setGroupEnabled(int i, boolean flag)
    {
        int k = mItems.size();
        int j = 0;
        do
        {
            if (j >= k)
            {
                return;
            }
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
            if (menuitemimpl.getGroupId() == i)
            {
                menuitemimpl.setEnabled(flag);
            }
            j++;
        } while (true);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        int k = mItems.size();
        boolean flag1 = false;
        int j = 0;
        do
        {
            if (j >= k)
            {
                if (flag1)
                {
                    onItemsChanged(true);
                }
                return;
            }
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
            boolean flag2 = flag1;
            if (menuitemimpl.getGroupId() == i)
            {
                flag2 = flag1;
                if (menuitemimpl.setVisibleInt(flag))
                {
                    flag2 = true;
                }
            }
            j++;
            flag1 = flag2;
        } while (true);
    }

    protected MenuBuilder setHeaderIconInt(int i)
    {
        setHeaderInternal(0, null, i, null, null);
        return this;
    }

    protected MenuBuilder setHeaderIconInt(Drawable drawable)
    {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    protected MenuBuilder setHeaderTitleInt(int i)
    {
        setHeaderInternal(i, null, 0, null, null);
        return this;
    }

    protected MenuBuilder setHeaderTitleInt(CharSequence charsequence)
    {
        setHeaderInternal(0, charsequence, 0, null, null);
        return this;
    }

    protected MenuBuilder setHeaderViewInt(View view)
    {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    void setOptionalIconsVisible(boolean flag)
    {
        mOptionalIconsVisible = flag;
    }

    public void setQwertyMode(boolean flag)
    {
        mQwertyMode = flag;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean flag)
    {
        if (mShortcutsVisible == flag)
        {
            return;
        } else
        {
            setShortcutsVisibleInner(flag);
            onItemsChanged(false);
            return;
        }
    }

    public int size()
    {
        return mItems.size();
    }

    public void startDispatchingItemsChanged()
    {
        mPreventDispatchingItemsChanged = false;
        if (mItemsChangedWhileDispatchPrevented)
        {
            mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(true);
        }
    }

    public void stopDispatchingItemsChanged()
    {
        if (!mPreventDispatchingItemsChanged)
        {
            mPreventDispatchingItemsChanged = true;
            mItemsChangedWhileDispatchPrevented = false;
        }
    }

    static 
    {
        int ai[] = new int[6];
        ai[0] = 1;
        ai[1] = 4;
        ai[2] = 5;
        ai[3] = 3;
        ai[4] = 2;
        sCategoryToOrder = ai;
    }
}
