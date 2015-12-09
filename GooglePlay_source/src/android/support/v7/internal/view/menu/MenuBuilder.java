// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

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
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemImpl, MenuPresenter, SubMenuBuilder

public class MenuBuilder
    implements SupportMenu
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


    private static final int sCategoryToOrder[] = {
        1, 4, 5, 3, 2, 0
    };
    public ArrayList mActionItems;
    public Callback mCallback;
    final Context mContext;
    public int mDefaultShowAsAction;
    MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    ArrayList mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList mNonActionItems;
    private boolean mOptionalIconsVisible;
    public boolean mOverrideVisibleItems;
    private CopyOnWriteArrayList mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private ArrayList mTempShortcutItemList;
    private ArrayList mVisibleItems;

    public MenuBuilder(Context context)
    {
        boolean flag = true;
        super();
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
        if (mResources.getConfiguration().keyboard == 1 || !mResources.getBoolean(0x7f0a0006))
        {
            flag = false;
        }
        mShortcutsVisible = flag;
    }

    private MenuItem addInternal(int i, int j, int k, CharSequence charsequence)
    {
        int l = (0xffff0000 & k) >> 16;
        if (l < 0 || l >= 6)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        } else
        {
            l = sCategoryToOrder[l] << 16 | 0xffff & k;
            charsequence = new MenuItemImpl(this, i, j, k, l, charsequence, mDefaultShowAsAction);
            mItems.add(findInsertIndex(mItems, l), charsequence);
            onItemsChanged(true);
            return charsequence;
        }
    }

    private static int findInsertIndex(ArrayList arraylist, int i)
    {
        for (int j = arraylist.size() - 1; j >= 0; j--)
        {
            if (((MenuItemImpl)arraylist.get(j)).mOrdering <= i)
            {
                return j + 1;
            }
        }

        return 0;
    }

    private MenuItemImpl findItemWithShortcutForKey(int i, KeyEvent keyevent)
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

    private void findItemsWithShortcutForKey(List list, int i, KeyEvent keyevent)
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
        while (l < i1) 
        {
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
        }
        return i1;
    }

    public final void addMenuPresenter(MenuPresenter menupresenter)
    {
        addMenuPresenter(menupresenter, mContext);
    }

    public final void addMenuPresenter(MenuPresenter menupresenter, Context context)
    {
        mPresenters.add(new WeakReference(menupresenter));
        menupresenter.initForMenu(context, this);
        mIsActionItemsStale = true;
    }

    public SubMenu addSubMenu(int i)
    {
        return addSubMenu(0, 0, 0, ((CharSequence) (mResources.getString(i))));
    }

    public SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return addSubMenu(i, j, k, ((CharSequence) (mResources.getString(l))));
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        charsequence = (MenuItemImpl)addInternal(i, j, k, charsequence);
        SubMenuBuilder submenubuilder = new SubMenuBuilder(mContext, this, charsequence);
        charsequence.setSubMenu(submenubuilder);
        return submenubuilder;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
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

    public final void close(boolean flag)
    {
        if (mIsClosing)
        {
            return;
        }
        mIsClosing = true;
        for (Iterator iterator = mPresenters.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                mPresenters.remove(weakreference);
            } else
            {
                menupresenter.onCloseMenu(this, flag);
            }
        }

        mIsClosing = false;
    }

    public boolean collapseItemActionView(MenuItemImpl menuitemimpl)
    {
        boolean flag;
        if (mPresenters.isEmpty() || mExpandedItem != menuitemimpl)
        {
            flag = false;
        } else
        {
            flag = false;
            stopDispatchingItemsChanged();
            Iterator iterator = mPresenters.iterator();
            boolean flag1;
label0:
            do
            {
                MenuPresenter menupresenter;
                do
                {
                    flag1 = flag;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    menupresenter = (MenuPresenter)weakreference.get();
                    if (menupresenter != null)
                    {
                        break;
                    }
                    mPresenters.remove(weakreference);
                } while (true);
                flag1 = menupresenter.collapseItemActionView$29f2911(menuitemimpl);
                flag = flag1;
            } while (!flag1);
            startDispatchingItemsChanged();
            flag = flag1;
            if (flag1)
            {
                mExpandedItem = null;
                return flag1;
            }
        }
        return flag;
    }

    boolean dispatchMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return mCallback != null && mCallback.onMenuItemSelected(menubuilder, menuitem);
    }

    public boolean expandItemActionView(MenuItemImpl menuitemimpl)
    {
        boolean flag;
        if (mPresenters.isEmpty())
        {
            flag = false;
        } else
        {
            flag = false;
            stopDispatchingItemsChanged();
            Iterator iterator = mPresenters.iterator();
            boolean flag1;
label0:
            do
            {
                MenuPresenter menupresenter;
                do
                {
                    flag1 = flag;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    menupresenter = (MenuPresenter)weakreference.get();
                    if (menupresenter != null)
                    {
                        break;
                    }
                    mPresenters.remove(weakreference);
                } while (true);
                flag1 = menupresenter.expandItemActionView$29f2911(menuitemimpl);
                flag = flag1;
            } while (!flag1);
            startDispatchingItemsChanged();
            flag = flag1;
            if (flag1)
            {
                mExpandedItem = menuitemimpl;
                return flag1;
            }
        }
        return flag;
    }

    public MenuItem findItem(int i)
    {
        int k = size();
        for (int j = 0; j < k; j++)
        {
            Object obj = (MenuItemImpl)mItems.get(j);
            if (((MenuItemImpl) (obj)).getItemId() == i)
            {
                return ((MenuItem) (obj));
            }
            if (!((MenuItemImpl) (obj)).hasSubMenu())
            {
                continue;
            }
            obj = ((MenuItemImpl) (obj)).getSubMenu().findItem(i);
            if (obj != null)
            {
                return ((MenuItem) (obj));
            }
        }

        return null;
    }

    public final void flagActionItems()
    {
        ArrayList arraylist = getVisibleItems();
        if (!mIsActionItemsStale)
        {
            return;
        }
        boolean flag = false;
        for (Iterator iterator = mPresenters.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                mPresenters.remove(weakreference);
            } else
            {
                flag |= menupresenter.flagActionItems();
            }
        }

        if (flag)
        {
            mActionItems.clear();
            mNonActionItems.clear();
            int j = arraylist.size();
            int i = 0;
            while (i < j) 
            {
                MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(i);
                if (menuitemimpl.isActionButton())
                {
                    mActionItems.add(menuitemimpl);
                } else
                {
                    mNonActionItems.add(menuitemimpl);
                }
                i++;
            }
        } else
        {
            mActionItems.clear();
            mNonActionItems.clear();
            mNonActionItems.addAll(getVisibleItems());
        }
        mIsActionItemsStale = false;
    }

    protected String getActionViewStatesKey()
    {
        return "android:menu:actionviewstates";
    }

    public MenuItem getItem(int i)
    {
        return (MenuItem)mItems.get(i);
    }

    public final ArrayList getNonActionItems()
    {
        flagActionItems();
        return mNonActionItems;
    }

    public MenuBuilder getRootMenu()
    {
        return this;
    }

    public final ArrayList getVisibleItems()
    {
        if (!mIsVisibleItemsStale)
        {
            return mVisibleItems;
        }
        mVisibleItems.clear();
        int j = mItems.size();
        for (int i = 0; i < j; i++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
            if (menuitemimpl.isVisible())
            {
                mVisibleItems.add(menuitemimpl);
            }
        }

        mIsVisibleItemsStale = false;
        mIsActionItemsStale = true;
        return mVisibleItems;
    }

    public boolean hasVisibleItems()
    {
        if (mOverrideVisibleItems)
        {
            return true;
        }
        int j = size();
        for (int i = 0; i < j; i++)
        {
            if (((MenuItemImpl)mItems.get(i)).isVisible())
            {
                return true;
            }
        }

        return false;
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

    final void onItemActionRequestChanged$4587d488()
    {
        mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    final void onItemVisibleChanged$4587d488()
    {
        mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public final void onItemsChanged(boolean flag)
    {
        if (!mPreventDispatchingItemsChanged)
        {
            if (flag)
            {
                mIsVisibleItemsStale = true;
                mIsActionItemsStale = true;
            }
            if (!mPresenters.isEmpty())
            {
                stopDispatchingItemsChanged();
                for (Iterator iterator = mPresenters.iterator(); iterator.hasNext();)
                {
                    WeakReference weakreference = (WeakReference)iterator.next();
                    MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
                    if (menupresenter == null)
                    {
                        mPresenters.remove(weakreference);
                    } else
                    {
                        menupresenter.updateMenuView(flag);
                    }
                }

                startDispatchingItemsChanged();
            }
            return;
        } else
        {
            mItemsChangedWhileDispatchPrevented = true;
            return;
        }
    }

    public boolean performIdentifierAction(int i, int j)
    {
        return performItemAction(findItem(i), null, j);
    }

    public final boolean performItemAction(MenuItem menuitem, MenuPresenter menupresenter, int i)
    {
        boolean flag1;
        boolean flag3;
        flag3 = false;
        flag1 = false;
        menuitem = (MenuItemImpl)menuitem;
        if (menuitem != null && menuitem.isEnabled()) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        return flag1;
_L2:
        ActionProvider actionprovider;
        boolean flag;
        boolean flag2;
        flag2 = menuitem.invoke();
        actionprovider = ((MenuItemImpl) (menuitem)).mActionProvider;
        if (actionprovider != null && actionprovider.hasSubMenu())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!menuitem.hasCollapsibleActionView())
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 |= menuitem.expandActionView();
        flag1 = flag2;
        if (flag2)
        {
            close(true);
            return flag2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!menuitem.hasSubMenu() && !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        close(false);
        if (!menuitem.hasSubMenu())
        {
            menuitem.setSubMenu(new SubMenuBuilder(mContext, this, menuitem));
        }
        menuitem = (SubMenuBuilder)menuitem.getSubMenu();
        if (flag)
        {
            actionprovider.onPrepareSubMenu(menuitem);
        }
        if (!mPresenters.isEmpty())
        {
            flag1 = flag3;
            if (menupresenter != null)
            {
                flag1 = menupresenter.onSubMenuSelected(menuitem);
            }
            menupresenter = mPresenters.iterator();
            while (menupresenter.hasNext()) 
            {
                WeakReference weakreference = (WeakReference)menupresenter.next();
                MenuPresenter menupresenter1 = (MenuPresenter)weakreference.get();
                if (menupresenter1 == null)
                {
                    mPresenters.remove(weakreference);
                } else
                if (!flag1)
                {
                    flag1 = menupresenter1.onSubMenuSelected(menuitem);
                }
            }
        }
        flag2 |= flag1;
        flag1 = flag2;
        if (!flag2)
        {
            close(true);
            return flag2;
        }
        if (true) goto _L4; else goto _L5
_L5:
        flag1 = flag2;
        if ((i & 1) == 0)
        {
            close(true);
            return flag2;
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
            flag = performItemAction(keyevent, null, j);
        }
        if ((j & 2) != 0)
        {
            close(true);
        }
        return flag;
    }

    public void removeGroup(int i)
    {
        int j;
        int k;
        k = size();
        j = 0;
_L7:
        if (j >= k) goto _L2; else goto _L1
_L1:
        if (((MenuItemImpl)mItems.get(j)).getGroupId() != i) goto _L4; else goto _L3
_L3:
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        int i1 = mItems.size();
        for (int l = 0; l < i1 - j && ((MenuItemImpl)mItems.get(j)).getGroupId() == i; l++)
        {
            removeItemAtInt(j, false);
        }

        break; /* Loop/switch isn't completed */
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        j = -1;
        if (true) goto _L3; else goto _L5
_L5:
        onItemsChanged(true);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void removeItem(int i)
    {
        int j;
        int k;
        k = size();
        j = 0;
_L3:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (((MenuItemImpl)mItems.get(j)).getItemId() != i) goto _L2; else goto _L1
_L1:
        removeItemAtInt(j, true);
        return;
_L2:
        j++;
          goto _L3
        j = -1;
          goto _L1
    }

    public final void removeMenuPresenter(MenuPresenter menupresenter)
    {
        Iterator iterator = mPresenters.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter1 = (MenuPresenter)weakreference.get();
            if (menupresenter1 == null || menupresenter1 == menupresenter)
            {
                mPresenters.remove(weakreference);
            }
        } while (true);
    }

    public final void restoreActionViewStates(Bundle bundle)
    {
        if (bundle != null)
        {
            SparseArray sparsearray = bundle.getSparseParcelableArray(getActionViewStatesKey());
            int k = size();
            for (int i = 0; i < k; i++)
            {
                MenuItem menuitem = getItem(i);
                View view = MenuItemCompat.getActionView(menuitem);
                if (view != null && view.getId() != -1)
                {
                    view.restoreHierarchyState(sparsearray);
                }
                if (menuitem.hasSubMenu())
                {
                    ((SubMenuBuilder)menuitem.getSubMenu()).restoreActionViewStates(bundle);
                }
            }

            int j = bundle.getInt("android:menu:expandedactionview");
            if (j > 0)
            {
                bundle = findItem(j);
                if (bundle != null)
                {
                    MenuItemCompat.expandActionView(bundle);
                    return;
                }
            }
        }
    }

    public final void saveActionViewStates(Bundle bundle)
    {
        SparseArray sparsearray = null;
        int j = size();
        for (int i = 0; i < j;)
        {
            MenuItem menuitem = getItem(i);
            View view = MenuItemCompat.getActionView(menuitem);
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
                    if (MenuItemCompat.isActionViewExpanded(menuitem))
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
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparsearray);
        }
    }

    public void setCallback(Callback callback)
    {
        mCallback = callback;
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        int k = mItems.size();
        for (int j = 0; j < k; j++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
            if (menuitemimpl.getGroupId() == i)
            {
                menuitemimpl.setExclusiveCheckable(flag1);
                menuitemimpl.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i, boolean flag)
    {
        int k = mItems.size();
        for (int j = 0; j < k; j++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
            if (menuitemimpl.getGroupId() == i)
            {
                menuitemimpl.setEnabled(flag);
            }
        }

    }

    public void setGroupVisible(int i, boolean flag)
    {
        int k = mItems.size();
        boolean flag1 = false;
        for (int j = 0; j < k;)
        {
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
        }

        if (flag1)
        {
            onItemsChanged(true);
        }
    }

    protected final MenuBuilder setHeaderIconInt(Drawable drawable)
    {
        setHeaderInternal$6c64639d(null, drawable, null);
        return this;
    }

    final void setHeaderInternal$6c64639d(CharSequence charsequence, Drawable drawable, View view)
    {
        if (view != null)
        {
            mHeaderView = view;
            mHeaderTitle = null;
            mHeaderIcon = null;
        } else
        {
            if (charsequence != null)
            {
                mHeaderTitle = charsequence;
            }
            if (drawable != null)
            {
                mHeaderIcon = drawable;
            }
            mHeaderView = null;
        }
        onItemsChanged(false);
    }

    protected final MenuBuilder setHeaderTitleInt(CharSequence charsequence)
    {
        setHeaderInternal$6c64639d(charsequence, null, null);
        return this;
    }

    public void setQwertyMode(boolean flag)
    {
        mQwertyMode = flag;
        onItemsChanged(false);
    }

    public int size()
    {
        return mItems.size();
    }

    public final void startDispatchingItemsChanged()
    {
        mPreventDispatchingItemsChanged = false;
        if (mItemsChangedWhileDispatchPrevented)
        {
            mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(true);
        }
    }

    public final void stopDispatchingItemsChanged()
    {
        if (!mPreventDispatchingItemsChanged)
        {
            mPreventDispatchingItemsChanged = true;
            mItemsChangedWhileDispatchPrevented = false;
        }
    }

}
