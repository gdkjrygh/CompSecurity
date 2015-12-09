// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view.menu;

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
import android.support.v4.content.ContextCompat;
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

// Referenced classes of package android.support.v7.view.menu:
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
    private SparseArray mFrozenViewStates;
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
    private boolean mOverrideVisibleItems;
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

    private MenuItemImpl createNewMenuItem(int i, int j, int k, int l, CharSequence charsequence, int i1)
    {
        return new MenuItemImpl(this, i, j, k, l, charsequence, i1);
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

    private boolean dispatchSubMenuSelected(SubMenuBuilder submenubuilder, MenuPresenter menupresenter)
    {
        boolean flag = false;
        if (mPresenters.isEmpty())
        {
            return false;
        }
        if (menupresenter != null)
        {
            flag = menupresenter.onSubMenuSelected(submenubuilder);
        }
        menupresenter = mPresenters.iterator();
        do
        {
            if (!menupresenter.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)menupresenter.next();
            MenuPresenter menupresenter1 = (MenuPresenter)weakreference.get();
            if (menupresenter1 == null)
            {
                mPresenters.remove(weakreference);
            } else
            if (!flag)
            {
                flag = menupresenter1.onSubMenuSelected(submenubuilder);
            }
        } while (true);
        return flag;
    }

    private static int findInsertIndex(ArrayList arraylist, int i)
    {
        for (int j = arraylist.size() - 1; j >= 0; j--)
        {
            if (((MenuItemImpl)arraylist.get(j)).getOrdering() <= i)
            {
                return j + 1;
            }
        }

        return 0;
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
        mHeaderIcon = ContextCompat.getDrawable(getContext(), j);
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
        if (flag && mResources.getConfiguration().keyboard != 1 && mResources.getBoolean(android.support.v7.appcompat.R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent))
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

    protected MenuItem addInternal(int i, int j, int k, CharSequence charsequence)
    {
        int l = getOrdering(k);
        charsequence = createNewMenuItem(i, j, k, l, charsequence, mDefaultShowAsAction);
        if (mCurrentMenuInfo != null)
        {
            charsequence.setMenuInfo(mCurrentMenuInfo);
        }
        mItems.add(findInsertIndex(mItems, l), charsequence);
        onItemsChanged(true);
        return charsequence;
    }

    public void addMenuPresenter(MenuPresenter menupresenter)
    {
        addMenuPresenter(menupresenter, mContext);
    }

    public void addMenuPresenter(MenuPresenter menupresenter, Context context)
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

    public int findGroupIndex(int i, int j)
    {
        int l = size();
        int k = j;
        if (j < 0)
        {
            k = 0;
        }
        for (; k < l; k++)
        {
            if (((MenuItemImpl)mItems.get(k)).getGroupId() == i)
            {
                return k;
            }
        }

        return -1;
    }

    public MenuItem findItem(int i)
    {
        int j;
        int k;
        k = size();
        j = 0;
_L6:
        if (j >= k) goto _L2; else goto _L1
_L1:
        Object obj = (MenuItemImpl)mItems.get(j);
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
        j++;
          goto _L6
_L2:
        return null;
    }

    public int findItemIndex(int i)
    {
        int k = size();
        for (int j = 0; j < k; j++)
        {
            if (((MenuItemImpl)mItems.get(j)).getItemId() == i)
            {
                return j;
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
        int j;
        int k;
        int l;
        boolean flag;
        k = keyevent.getMetaState();
        keydata = new android.view.KeyCharacterMap.KeyData();
        keyevent.getKeyData(keydata);
        l = arraylist.size();
        if (l == 1)
        {
            return (MenuItemImpl)arraylist.get(0);
        }
        flag = isQwertyMode();
        j = 0;
_L9:
        if (j >= l) goto _L4; else goto _L3
_L3:
        MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(j);
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
        if ((k & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = menuitemimpl;
        if ((k & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = menuitemimpl;
        if (i == 67) goto _L6; else goto _L8
_L8:
        j++;
          goto _L9
_L4:
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
        ArrayList arraylist = getVisibleItems();
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

    public ArrayList getActionItems()
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

    public ArrayList getNonActionItems()
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

    public ArrayList getVisibleItems()
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

    public void onItemsChanged(boolean flag)
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
        return performItemAction(menuitem, null, i);
    }

    public boolean performItemAction(MenuItem menuitem, MenuPresenter menupresenter, int i)
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
            boolean flag4 = dispatchSubMenuSelected(((SubMenuBuilder) (obj)), menupresenter) | flag1;
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
        if (k >= 0)
        {
            int l = mItems.size();
            for (int j = 0; j < l - k && ((MenuItemImpl)mItems.get(k)).getGroupId() == i; j++)
            {
                removeItemAtInt(k, false);
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

    public void restorePresenterStates(Bundle bundle)
    {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle)
    {
        int j = size();
        int i = 0;
        SparseArray sparsearray;
        SparseArray sparsearray2;
        for (sparsearray = null; i < j; sparsearray = sparsearray2)
        {
            MenuItem menuitem = getItem(i);
            View view = MenuItemCompat.getActionView(menuitem);
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
        int j = menuitem.getGroupId();
        int k = mItems.size();
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
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
        } while (true);
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
        int j = 0;
        boolean flag1 = false;
        for (; j < k; j++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
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

    public void setOverrideVisibleItems(boolean flag)
    {
        mOverrideVisibleItems = flag;
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
