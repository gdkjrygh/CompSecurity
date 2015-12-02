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
import android.os.Parcelable;
import android.support.v4.a.a.a;
import android.support.v4.view.d;
import android.support.v4.view.j;
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
    implements a
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
    private static final String TAG = "MenuBuilder";
    private static final int sCategoryToOrder[] = {
        1, 4, 5, 3, 2, 0
    };
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

    private MenuItem addInternal(int i, int k, int l, CharSequence charsequence)
    {
        int i1 = getOrdering(l);
        charsequence = new MenuItemImpl(this, i, k, l, i1, charsequence, mDefaultShowAsAction);
        if (mCurrentMenuInfo != null)
        {
            charsequence.setMenuInfo(mCurrentMenuInfo);
        }
        mItems.add(findInsertIndex(mItems, i1), charsequence);
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
                break;
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
        bundle.putSparseParcelableArray("android:menu:presenters", sparsearray);
    }

    private boolean dispatchSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        if (mPresenters.isEmpty())
        {
            return false;
        }
        Iterator iterator = mPresenters.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
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
        return flag;
    }

    private static int findInsertIndex(ArrayList arraylist, int i)
    {
        for (int k = arraylist.size() - 1; k >= 0; k--)
        {
            if (((MenuItemImpl)arraylist.get(k)).getOrdering() <= i)
            {
                return k + 1;
            }
        }

        return 0;
    }

    private static int getOrdering(int i)
    {
        int k = (0xffff0000 & i) >> 16;
        if (k < 0 || k >= sCategoryToOrder.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        } else
        {
            return sCategoryToOrder[k] << 16 | 0xffff & i;
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

    private void setHeaderInternal(int i, CharSequence charsequence, int k, Drawable drawable, View view)
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
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        mHeaderIcon = resources.getDrawable(k);
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
        if (flag && mResources.getConfiguration().keyboard != 1 && mResources.getBoolean(android.support.v7.a.a.c.abc_config_showMenuShortcutsWhenKeyboardPresent))
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

    public MenuItem add(int i, int k, int l, int i1)
    {
        return addInternal(i, k, l, mResources.getString(i1));
    }

    public MenuItem add(int i, int k, int l, CharSequence charsequence)
    {
        return addInternal(i, k, l, charsequence);
    }

    public MenuItem add(CharSequence charsequence)
    {
        return addInternal(0, 0, 0, charsequence);
    }

    public int addIntentOptions(int i, int k, int l, ComponentName componentname, Intent aintent[], Intent intent, int i1, 
            MenuItem amenuitem[])
    {
        PackageManager packagemanager = mContext.getPackageManager();
        List list = packagemanager.queryIntentActivityOptions(componentname, aintent, intent, 0);
        int j1;
        if (list != null)
        {
            j1 = list.size();
        } else
        {
            j1 = 0;
        }
        if ((i1 & 1) == 0)
        {
            removeGroup(i);
        }
        i1 = 0;
        while (i1 < j1) 
        {
            ResolveInfo resolveinfo = (ResolveInfo)list.get(i1);
            if (resolveinfo.specificIndex < 0)
            {
                componentname = intent;
            } else
            {
                componentname = aintent[resolveinfo.specificIndex];
            }
            componentname = new Intent(componentname);
            componentname.setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
            componentname = add(i, k, l, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setIntent(componentname);
            if (amenuitem != null && resolveinfo.specificIndex >= 0)
            {
                amenuitem[resolveinfo.specificIndex] = componentname;
            }
            i1++;
        }
        return j1;
    }

    public void addMenuPresenter(MenuPresenter menupresenter)
    {
        mPresenters.add(new WeakReference(menupresenter));
        menupresenter.initForMenu(mContext, this);
        mIsActionItemsStale = true;
    }

    public SubMenu addSubMenu(int i)
    {
        return addSubMenu(0, 0, 0, ((CharSequence) (mResources.getString(i))));
    }

    public SubMenu addSubMenu(int i, int k, int l, int i1)
    {
        return addSubMenu(i, k, l, ((CharSequence) (mResources.getString(i1))));
    }

    public SubMenu addSubMenu(int i, int k, int l, CharSequence charsequence)
    {
        charsequence = (MenuItemImpl)addInternal(i, k, l, charsequence);
        SubMenuBuilder submenubuilder = new SubMenuBuilder(mContext, this, charsequence);
        charsequence.setSubMenu(submenubuilder);
        return submenubuilder;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
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
        boolean flag = false;
        boolean flag2 = flag;
        if (!mPresenters.isEmpty())
        {
            if (mExpandedItem != menuitemimpl)
            {
                flag2 = flag;
            } else
            {
                stopDispatchingItemsChanged();
                Iterator iterator = mPresenters.iterator();
                boolean flag1 = false;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
                    if (menupresenter == null)
                    {
                        mPresenters.remove(weakreference);
                        continue;
                    }
                    flag2 = menupresenter.collapseItemActionView(this, menuitemimpl);
                    flag1 = flag2;
                    if (!flag2)
                    {
                        continue;
                    }
                    flag1 = flag2;
                    break;
                } while (true);
                startDispatchingItemsChanged();
                flag2 = flag1;
                if (flag1)
                {
                    mExpandedItem = null;
                    return flag1;
                }
            }
        }
        return flag2;
    }

    boolean dispatchMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return mCallback != null && mCallback.onMenuItemSelected(menubuilder, menuitem);
    }

    public boolean expandItemActionView(MenuItemImpl menuitemimpl)
    {
        boolean flag1 = false;
        if (!mPresenters.isEmpty())
        {
            stopDispatchingItemsChanged();
            Iterator iterator = mPresenters.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WeakReference weakreference = (WeakReference)iterator.next();
                MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
                if (menupresenter == null)
                {
                    mPresenters.remove(weakreference);
                    continue;
                }
                flag1 = menupresenter.expandItemActionView(this, menuitemimpl);
                flag = flag1;
                if (!flag1)
                {
                    continue;
                }
                flag = flag1;
                break;
            } while (true);
            startDispatchingItemsChanged();
            flag1 = flag;
            if (flag)
            {
                mExpandedItem = menuitemimpl;
                return flag;
            }
        }
        return flag1;
    }

    public int findGroupIndex(int i)
    {
        return findGroupIndex(i, 0);
    }

    public int findGroupIndex(int i, int k)
    {
        int i1 = size();
        int l = k;
        if (k < 0)
        {
            l = 0;
        }
        for (; l < i1; l++)
        {
            if (((MenuItemImpl)mItems.get(l)).getGroupId() == i)
            {
                return l;
            }
        }

        return -1;
    }

    public MenuItem findItem(int i)
    {
        int k;
        int l;
        l = size();
        k = 0;
_L6:
        if (k >= l) goto _L2; else goto _L1
_L1:
        Object obj = (MenuItemImpl)mItems.get(k);
        if (((MenuItemImpl) (obj)).getItemId() != i) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        MenuItem menuitem;
        if (!((MenuItemImpl) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        menuitem = ((MenuItemImpl) (obj)).getSubMenu().findItem(i);
        obj = menuitem;
        if (menuitem != null) goto _L3; else goto _L5
_L5:
        k++;
          goto _L6
_L2:
        return null;
    }

    public int findItemIndex(int i)
    {
        int l = size();
        for (int k = 0; k < l; k++)
        {
            if (((MenuItemImpl)mItems.get(k)).getItemId() == i)
            {
                return k;
            }
        }

        return -1;
    }

    MenuItemImpl findItemWithShortcutForKey(int i, KeyEvent keyevent)
    {
        ArrayList arraylist;
        arraylist = mTempShortcutItemList;
        arraylist.clear();
        findItemsWithShortcutForKey(arraylist, i, keyevent);
        if (!arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        keyevent = null;
_L6:
        return keyevent;
_L2:
        android.view.KeyCharacterMap.KeyData keydata;
        int k;
        int l;
        int i1;
        boolean flag;
        l = keyevent.getMetaState();
        keydata = new android.view.KeyCharacterMap.KeyData();
        keyevent.getKeyData(keydata);
        i1 = arraylist.size();
        if (i1 == 1)
        {
            return (MenuItemImpl)arraylist.get(0);
        }
        flag = isQwertyMode();
        k = 0;
_L9:
        if (k >= i1) goto _L4; else goto _L3
_L3:
        MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(k);
        char c;
        if (flag)
        {
            c = menuitemimpl.getAlphabeticShortcut();
        } else
        {
            c = menuitemimpl.getNumericShortcut();
        }
        if (c != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = menuitemimpl;
        if ((l & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = menuitemimpl;
        if ((l & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = menuitemimpl;
        if (i == 67) goto _L6; else goto _L8
_L8:
        k++;
          goto _L9
_L4:
        return null;
    }

    void findItemsWithShortcutForKey(List list, int i, KeyEvent keyevent)
    {
        boolean flag = isQwertyMode();
        int l = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i == 67)
        {
            int i1 = mItems.size();
            int k = 0;
            while (k < i1) 
            {
                MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(k);
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
                if ((l & 5) == 0 && c != 0 && (c == keydata.meta[0] || c == keydata.meta[2] || flag && c == '\b' && i == 67) && menuitemimpl.isEnabled())
                {
                    list.add(menuitemimpl);
                }
                k++;
            }
        }
    }

    public void flagActionItems()
    {
        if (!mIsActionItemsStale)
        {
            return;
        }
        Iterator iterator = mPresenters.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                mPresenters.remove(weakreference);
            } else
            {
                flag = menupresenter.flagActionItems() | flag;
            }
        }
        if (flag)
        {
            mActionItems.clear();
            mNonActionItems.clear();
            ArrayList arraylist = getVisibleItems();
            int k = arraylist.size();
            int i = 0;
            while (i < k) 
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
        int k = mItems.size();
        for (int i = 0; i < k; i++)
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
        int k = size();
        for (int i = 0; i < k; i++)
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

    public boolean performIdentifierAction(int i, int k)
    {
        return performItemAction(findItem(i), k);
    }

    public boolean performItemAction(MenuItem menuitem, int i)
    {
        Object obj;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        obj = (MenuItemImpl)menuitem;
        flag1 = flag2;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((MenuItemImpl) (obj)).isEnabled()) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
_L2:
        return flag1;
_L4:
        boolean flag;
        flag1 = ((MenuItemImpl) (obj)).invoke();
        menuitem = ((MenuItemImpl) (obj)).getSupportActionProvider();
        boolean flag3;
        if (menuitem != null && menuitem.hasSubMenu())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!((MenuItemImpl) (obj)).hasCollapsibleActionView())
        {
            break; /* Loop/switch isn't completed */
        }
        flag3 = ((MenuItemImpl) (obj)).expandActionView() | flag1;
        flag1 = flag3;
        if (flag3)
        {
            close(true);
            return flag3;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (((MenuItemImpl) (obj)).hasSubMenu() || flag)
        {
            close(false);
            if (!((MenuItemImpl) (obj)).hasSubMenu())
            {
                ((MenuItemImpl) (obj)).setSubMenu(new SubMenuBuilder(getContext(), this, ((MenuItemImpl) (obj))));
            }
            obj = (SubMenuBuilder)((MenuItemImpl) (obj)).getSubMenu();
            if (flag)
            {
                menuitem.onPrepareSubMenu(((SubMenu) (obj)));
            }
            boolean flag4 = dispatchSubMenuSelected(((SubMenuBuilder) (obj))) | flag1;
            flag1 = flag4;
            if (!flag4)
            {
                close(true);
                return flag4;
            }
        } else
        {
            if ((i & 1) == 0)
            {
                close(true);
            }
            return flag1;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int k)
    {
        keyevent = findItemWithShortcutForKey(i, keyevent);
        boolean flag = false;
        if (keyevent != null)
        {
            flag = performItemAction(keyevent, k);
        }
        if ((k & 2) != 0)
        {
            close(true);
        }
        return flag;
    }

    public void removeGroup(int i)
    {
        int l = findGroupIndex(i);
        if (l >= 0)
        {
            int i1 = mItems.size();
            for (int k = 0; k < i1 - l && ((MenuItemImpl)mItems.get(l)).getGroupId() == i; k++)
            {
                removeItemAtInt(l, false);
            }

            onItemsChanged(true);
        }
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

    public void restoreActionViewStates(Bundle bundle)
    {
        if (bundle != null)
        {
            SparseArray sparsearray = bundle.getSparseParcelableArray(getActionViewStatesKey());
            int l = size();
            for (int i = 0; i < l; i++)
            {
                MenuItem menuitem = getItem(i);
                View view = j.a(menuitem);
                if (view != null && view.getId() != -1)
                {
                    view.restoreHierarchyState(sparsearray);
                }
                if (menuitem.hasSubMenu())
                {
                    ((SubMenuBuilder)menuitem.getSubMenu()).restoreActionViewStates(bundle);
                }
            }

            int k = bundle.getInt("android:menu:expandedactionview");
            if (k > 0)
            {
                bundle = findItem(k);
                if (bundle != null)
                {
                    j.b(bundle);
                    return;
                }
            }
        }
    }

    public void restorePresenterStates(Bundle bundle)
    {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle)
    {
        int k = size();
        int i = 0;
        SparseArray sparsearray;
        SparseArray sparsearray2;
        for (sparsearray = null; i < k; sparsearray = sparsearray2)
        {
            MenuItem menuitem = getItem(i);
            View view = j.a(menuitem);
            sparsearray2 = sparsearray;
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
                    if (j.c(menuitem))
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
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparsearray);
        }
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
        int k = menuitem.getGroupId();
        int l = mItems.size();
        int i = 0;
        do
        {
            if (i >= l)
            {
                break;
            }
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
            if (menuitemimpl.getGroupId() == k && menuitemimpl.isExclusiveCheckable() && menuitemimpl.isCheckable())
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
        } while (true);
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        int l = mItems.size();
        for (int k = 0; k < l; k++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(k);
            if (menuitemimpl.getGroupId() == i)
            {
                menuitemimpl.setExclusiveCheckable(flag1);
                menuitemimpl.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i, boolean flag)
    {
        int l = mItems.size();
        for (int k = 0; k < l; k++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(k);
            if (menuitemimpl.getGroupId() == i)
            {
                menuitemimpl.setEnabled(flag);
            }
        }

    }

    public void setGroupVisible(int i, boolean flag)
    {
        int l = mItems.size();
        int k = 0;
        boolean flag1 = false;
        for (; k < l; k++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(k);
            if (menuitemimpl.getGroupId() == i && menuitemimpl.setVisibleInt(flag))
            {
                flag1 = true;
            }
        }

        if (flag1)
        {
            onItemsChanged(true);
        }
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

}
