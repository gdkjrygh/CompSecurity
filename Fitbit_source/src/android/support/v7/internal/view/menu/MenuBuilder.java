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

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemImpl, MenuPresenter, a

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


    private static final String d = "MenuBuilder";
    private static final String e = "android:menu:presenters";
    private static final String f = "android:menu:actionviewstates";
    private static final String g = "android:menu:expandedactionview";
    private static final int h[] = {
        1, 4, 5, 3, 2, 0
    };
    private ArrayList A;
    private CopyOnWriteArrayList B;
    private MenuItemImpl C;
    CharSequence a;
    Drawable b;
    View c;
    private final Context i;
    private final Resources j;
    private boolean k;
    private boolean l;
    private Callback m;
    private ArrayList n;
    private ArrayList o;
    private boolean p;
    private ArrayList q;
    private ArrayList r;
    private boolean s;
    private int t;
    private android.view.ContextMenu.ContextMenuInfo u;
    private SparseArray v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public MenuBuilder(Context context)
    {
        t = 0;
        w = false;
        x = false;
        y = false;
        z = false;
        A = new ArrayList();
        B = new CopyOnWriteArrayList();
        i = context;
        j = context.getResources();
        n = new ArrayList();
        o = new ArrayList();
        p = true;
        q = new ArrayList();
        r = new ArrayList();
        s = true;
        f(true);
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((MenuItemImpl)arraylist.get(j1)).getOrdering() <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private MenuItemImpl a(int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
    {
        return new MenuItemImpl(this, i1, j1, k1, l1, charsequence, i2);
    }

    private MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = g(k1);
        charsequence = a(i1, j1, k1, l1, charsequence, t);
        if (u != null)
        {
            charsequence.setMenuInfo(u);
        }
        n.add(a(n, l1), charsequence);
        c(true);
        return charsequence;
    }

    private void a(int i1, CharSequence charsequence, int j1, Drawable drawable, View view)
    {
        Resources resources = e();
        if (view == null) goto _L2; else goto _L1
_L1:
        c = view;
        a = null;
        b = null;
_L4:
        c(false);
        return;
_L2:
        if (i1 > 0)
        {
            a = resources.getText(i1);
        } else
        if (charsequence != null)
        {
            a = charsequence;
        }
        if (j1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        b = ContextCompat.getDrawable(f(), j1);
_L6:
        c = null;
        if (true) goto _L4; else goto _L3
_L3:
        if (drawable == null) goto _L6; else goto _L5
_L5:
        b = drawable;
          goto _L6
    }

    private void a(int i1, boolean flag)
    {
        if (i1 >= 0 && i1 < n.size())
        {
            n.remove(i1);
            if (flag)
            {
                c(true);
                return;
            }
        }
    }

    private boolean a(a a1, MenuPresenter menupresenter)
    {
        boolean flag = false;
        if (B.isEmpty())
        {
            return false;
        }
        if (menupresenter != null)
        {
            flag = menupresenter.onSubMenuSelected(a1);
        }
        menupresenter = B.iterator();
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
                B.remove(weakreference);
            } else
            if (!flag)
            {
                flag = menupresenter1.onSubMenuSelected(a1);
            }
        } while (true);
        return flag;
    }

    private void e(Bundle bundle)
    {
        if (B.isEmpty())
        {
            return;
        }
        SparseArray sparsearray = new SparseArray();
        Iterator iterator = B.iterator();
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
                B.remove(weakreference);
            } else
            {
                int i1 = menupresenter.getId();
                if (i1 > 0)
                {
                    Parcelable parcelable = menupresenter.onSaveInstanceState();
                    if (parcelable != null)
                    {
                        sparsearray.put(i1, parcelable);
                    }
                }
            }
        } while (true);
        bundle.putSparseParcelableArray("android:menu:presenters", sparsearray);
    }

    private void e(boolean flag)
    {
        if (B.isEmpty())
        {
            return;
        }
        h();
        for (Iterator iterator = B.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                B.remove(weakreference);
            } else
            {
                menupresenter.updateMenuView(flag);
            }
        }

        i();
    }

    private void f(Bundle bundle)
    {
        bundle = bundle.getSparseParcelableArray("android:menu:presenters");
        if (bundle != null && !B.isEmpty())
        {
            Iterator iterator = B.iterator();
            while (iterator.hasNext()) 
            {
                WeakReference weakreference = (WeakReference)iterator.next();
                MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
                if (menupresenter == null)
                {
                    B.remove(weakreference);
                } else
                {
                    int i1 = menupresenter.getId();
                    if (i1 > 0)
                    {
                        Parcelable parcelable = (Parcelable)bundle.get(i1);
                        if (parcelable != null)
                        {
                            menupresenter.onRestoreInstanceState(parcelable);
                        }
                    }
                }
            }
        }
    }

    private void f(boolean flag)
    {
        boolean flag1 = true;
        if (flag && j.getConfiguration().keyboard != 1 && j.getBoolean(android.support.v7.appcompat.R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        l = flag;
    }

    private static int g(int i1)
    {
        int j1 = (0xffff0000 & i1) >> 16;
        if (j1 < 0 || j1 >= h.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        } else
        {
            return h[j1] << 16 | 0xffff & i1;
        }
    }

    public int a(int i1, int j1)
    {
        int l1 = size();
        int k1 = j1;
        if (j1 < 0)
        {
            k1 = 0;
        }
        for (; k1 < l1; k1++)
        {
            if (((MenuItemImpl)n.get(k1)).getGroupId() == i1)
            {
                return k1;
            }
        }

        return -1;
    }

    public MenuBuilder a(int i1)
    {
        t = i1;
        return this;
    }

    protected MenuBuilder a(Drawable drawable)
    {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected MenuBuilder a(View view)
    {
        a(0, null, 0, null, view);
        return this;
    }

    protected MenuBuilder a(CharSequence charsequence)
    {
        a(0, charsequence, 0, null, null);
        return this;
    }

    MenuItemImpl a(int i1, KeyEvent keyevent)
    {
        ArrayList arraylist;
        arraylist = A;
        arraylist.clear();
        a(((List) (arraylist)), i1, keyevent);
        if (!arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        keyevent = null;
_L6:
        return keyevent;
_L2:
        android.view.KeyCharacterMap.KeyData keydata;
        int j1;
        int k1;
        int l1;
        boolean flag;
        k1 = keyevent.getMetaState();
        keydata = new android.view.KeyCharacterMap.KeyData();
        keyevent.getKeyData(keydata);
        l1 = arraylist.size();
        if (l1 == 1)
        {
            return (MenuItemImpl)arraylist.get(0);
        }
        flag = c();
        j1 = 0;
_L9:
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(j1);
        char c1;
        if (flag)
        {
            c1 = menuitemimpl.getAlphabeticShortcut();
        } else
        {
            c1 = menuitemimpl.getNumericShortcut();
        }
        if (c1 != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = menuitemimpl;
        if ((k1 & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c1 != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = menuitemimpl;
        if ((k1 & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c1 != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = menuitemimpl;
        if (i1 == 67) goto _L6; else goto _L8
_L8:
        j1++;
          goto _L9
_L4:
        return null;
    }

    protected String a()
    {
        return "android:menu:actionviewstates";
    }

    public void a(Bundle bundle)
    {
        e(bundle);
    }

    public void a(Callback callback)
    {
        m = callback;
    }

    void a(MenuItemImpl menuitemimpl)
    {
        p = true;
        c(true);
    }

    public void a(MenuPresenter menupresenter)
    {
        a(menupresenter, i);
    }

    public void a(MenuPresenter menupresenter, Context context)
    {
        B.add(new WeakReference(menupresenter));
        menupresenter.initForMenu(context, this);
        s = true;
    }

    public void a(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        u = contextmenuinfo;
    }

    void a(MenuItem menuitem)
    {
        int j1 = menuitem.getGroupId();
        int k1 = n.size();
        int i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            MenuItemImpl menuitemimpl = (MenuItemImpl)n.get(i1);
            if (menuitemimpl.getGroupId() == j1 && menuitemimpl.isExclusiveCheckable() && menuitemimpl.isCheckable())
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
            i1++;
        } while (true);
    }

    void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = c();
        int k1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i1 == 67)
        {
            int l1 = n.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                MenuItemImpl menuitemimpl = (MenuItemImpl)n.get(j1);
                if (menuitemimpl.hasSubMenu())
                {
                    ((MenuBuilder)menuitemimpl.getSubMenu()).a(list, i1, keyevent);
                }
                char c1;
                if (flag)
                {
                    c1 = menuitemimpl.getAlphabeticShortcut();
                } else
                {
                    c1 = menuitemimpl.getNumericShortcut();
                }
                if ((k1 & 5) == 0 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && menuitemimpl.isEnabled())
                {
                    list.add(menuitemimpl);
                }
                j1++;
            }
        }
    }

    public void a(boolean flag)
    {
        if (l == flag)
        {
            return;
        } else
        {
            f(flag);
            c(false);
            return;
        }
    }

    boolean a(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return m != null && m.onMenuItemSelected(menubuilder, menuitem);
    }

    public boolean a(MenuItem menuitem, int i1)
    {
        return a(menuitem, ((MenuPresenter) (null)), i1);
    }

    public boolean a(MenuItem menuitem, MenuPresenter menupresenter, int i1)
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
            b(true);
            return flag3;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (((MenuItemImpl) (obj)).hasSubMenu() || flag)
        {
            b(false);
            if (!((MenuItemImpl) (obj)).hasSubMenu())
            {
                ((MenuItemImpl) (obj)).setSubMenu(new a(f(), this, ((MenuItemImpl) (obj))));
            }
            obj = (a)((MenuItemImpl) (obj)).getSubMenu();
            if (flag)
            {
                menuitem.onPrepareSubMenu(((SubMenu) (obj)));
            }
            boolean flag4 = a(((a) (obj)), menupresenter) | flag1;
            flag1 = flag4;
            if (!flag4)
            {
                b(true);
                return flag4;
            }
        } else
        {
            if ((i1 & 1) == 0)
            {
                b(true);
            }
            return flag1;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public MenuItem add(int i1)
    {
        return a(0, 0, 0, j.getString(i1));
    }

    public MenuItem add(int i1, int j1, int k1, int l1)
    {
        return a(i1, j1, k1, j.getString(l1));
    }

    public MenuItem add(int i1, int j1, int k1, CharSequence charsequence)
    {
        return a(i1, j1, k1, charsequence);
    }

    public MenuItem add(CharSequence charsequence)
    {
        return a(0, 0, 0, charsequence);
    }

    public int addIntentOptions(int i1, int j1, int k1, ComponentName componentname, Intent aintent[], Intent intent, int l1, 
            MenuItem amenuitem[])
    {
        PackageManager packagemanager = i.getPackageManager();
        List list = packagemanager.queryIntentActivityOptions(componentname, aintent, intent, 0);
        int i2;
        if (list != null)
        {
            i2 = list.size();
        } else
        {
            i2 = 0;
        }
        if ((l1 & 1) == 0)
        {
            removeGroup(i1);
        }
        l1 = 0;
        while (l1 < i2) 
        {
            ResolveInfo resolveinfo = (ResolveInfo)list.get(l1);
            if (resolveinfo.specificIndex < 0)
            {
                componentname = intent;
            } else
            {
                componentname = aintent[resolveinfo.specificIndex];
            }
            componentname = new Intent(componentname);
            componentname.setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
            componentname = add(i1, j1, k1, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setIntent(componentname);
            if (amenuitem != null && resolveinfo.specificIndex >= 0)
            {
                amenuitem[resolveinfo.specificIndex] = componentname;
            }
            l1++;
        }
        return i2;
    }

    public SubMenu addSubMenu(int i1)
    {
        return addSubMenu(0, 0, 0, ((CharSequence) (j.getString(i1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, int l1)
    {
        return addSubMenu(i1, j1, k1, ((CharSequence) (j.getString(l1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, CharSequence charsequence)
    {
        charsequence = (MenuItemImpl)a(i1, j1, k1, charsequence);
        a a1 = new a(i, this, charsequence);
        charsequence.setSubMenu(a1);
        return a1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public void b()
    {
        w = true;
        clear();
        clearHeader();
        w = false;
        x = false;
        c(true);
    }

    public void b(int i1)
    {
        a(i1, true);
    }

    public void b(Bundle bundle)
    {
        f(bundle);
    }

    void b(MenuItemImpl menuitemimpl)
    {
        s = true;
        c(true);
    }

    public void b(MenuPresenter menupresenter)
    {
        Iterator iterator = B.iterator();
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
                B.remove(weakreference);
            }
        } while (true);
    }

    public final void b(boolean flag)
    {
        if (z)
        {
            return;
        }
        z = true;
        for (Iterator iterator = B.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                B.remove(weakreference);
            } else
            {
                menupresenter.onCloseMenu(this, flag);
            }
        }

        z = false;
    }

    public int c(int i1)
    {
        int k1 = size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (((MenuItemImpl)n.get(j1)).getItemId() == i1)
            {
                return j1;
            }
        }

        return -1;
    }

    public void c(Bundle bundle)
    {
        int j1 = size();
        int i1 = 0;
        SparseArray sparsearray;
        SparseArray sparsearray2;
        for (sparsearray = null; i1 < j1; sparsearray = sparsearray2)
        {
            MenuItem menuitem = getItem(i1);
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
                ((a)menuitem.getSubMenu()).c(bundle);
            }
            i1++;
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(a(), sparsearray);
        }
    }

    public void c(boolean flag)
    {
        if (!w)
        {
            if (flag)
            {
                p = true;
                s = true;
            }
            e(flag);
            return;
        } else
        {
            x = true;
            return;
        }
    }

    boolean c()
    {
        return k;
    }

    public boolean c(MenuItemImpl menuitemimpl)
    {
        boolean flag1 = false;
        if (!B.isEmpty())
        {
            h();
            Iterator iterator = B.iterator();
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
                    B.remove(weakreference);
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
            i();
            flag1 = flag;
            if (flag)
            {
                C = menuitemimpl;
                return flag;
            }
        }
        return flag1;
    }

    public void clear()
    {
        if (C != null)
        {
            d(C);
        }
        n.clear();
        c(true);
    }

    public void clearHeader()
    {
        b = null;
        a = null;
        c = null;
        c(false);
    }

    public void close()
    {
        b(true);
    }

    public int d(int i1)
    {
        return a(i1, 0);
    }

    public void d(Bundle bundle)
    {
        if (bundle != null)
        {
            SparseArray sparsearray = bundle.getSparseParcelableArray(a());
            int k1 = size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                MenuItem menuitem = getItem(i1);
                View view = MenuItemCompat.getActionView(menuitem);
                if (view != null && view.getId() != -1)
                {
                    view.restoreHierarchyState(sparsearray);
                }
                if (menuitem.hasSubMenu())
                {
                    ((a)menuitem.getSubMenu()).d(bundle);
                }
            }

            int j1 = bundle.getInt("android:menu:expandedactionview");
            if (j1 > 0)
            {
                bundle = findItem(j1);
                if (bundle != null)
                {
                    MenuItemCompat.expandActionView(bundle);
                    return;
                }
            }
        }
    }

    void d(boolean flag)
    {
        y = flag;
    }

    public boolean d()
    {
        return l;
    }

    public boolean d(MenuItemImpl menuitemimpl)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!B.isEmpty())
        {
            if (C != menuitemimpl)
            {
                flag2 = flag;
            } else
            {
                h();
                Iterator iterator = B.iterator();
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
                        B.remove(weakreference);
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
                i();
                flag2 = flag1;
                if (flag1)
                {
                    C = null;
                    return flag1;
                }
            }
        }
        return flag2;
    }

    Resources e()
    {
        return j;
    }

    protected MenuBuilder e(int i1)
    {
        a(i1, null, 0, null, null);
        return this;
    }

    public Context f()
    {
        return i;
    }

    protected MenuBuilder f(int i1)
    {
        a(0, null, i1, null, null);
        return this;
    }

    public MenuItem findItem(int i1)
    {
        int j1;
        int k1;
        k1 = size();
        j1 = 0;
_L6:
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        Object obj = (MenuItemImpl)n.get(j1);
        if (((MenuItemImpl) (obj)).getItemId() != i1) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        MenuItem menuitem;
        if (!((MenuItemImpl) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        menuitem = ((MenuItemImpl) (obj)).getSubMenu().findItem(i1);
        obj = menuitem;
        if (menuitem != null) goto _L3; else goto _L5
_L5:
        j1++;
          goto _L6
_L2:
        return null;
    }

    public void g()
    {
        if (m != null)
        {
            m.onMenuModeChange(this);
        }
    }

    public MenuItem getItem(int i1)
    {
        return (MenuItem)n.get(i1);
    }

    public void h()
    {
        if (!w)
        {
            w = true;
            x = false;
        }
    }

    public boolean hasVisibleItems()
    {
        int j1 = size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((MenuItemImpl)n.get(i1)).isVisible())
            {
                return true;
            }
        }

        return false;
    }

    public void i()
    {
        w = false;
        if (x)
        {
            x = false;
            c(true);
        }
    }

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    public ArrayList j()
    {
        if (!p)
        {
            return o;
        }
        o.clear();
        int j1 = n.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)n.get(i1);
            if (menuitemimpl.isVisible())
            {
                o.add(menuitemimpl);
            }
        }

        p = false;
        s = true;
        return o;
    }

    public void k()
    {
        ArrayList arraylist = j();
        if (!s)
        {
            return;
        }
        Iterator iterator = B.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
            if (menupresenter == null)
            {
                B.remove(weakreference);
            } else
            {
                flag = menupresenter.flagActionItems() | flag;
            }
        }
        if (flag)
        {
            q.clear();
            r.clear();
            int j1 = arraylist.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(i1);
                if (menuitemimpl.isActionButton())
                {
                    q.add(menuitemimpl);
                } else
                {
                    r.add(menuitemimpl);
                }
                i1++;
            }
        } else
        {
            q.clear();
            r.clear();
            r.addAll(j());
        }
        s = false;
    }

    public ArrayList l()
    {
        k();
        return q;
    }

    public ArrayList m()
    {
        k();
        return r;
    }

    public CharSequence n()
    {
        return a;
    }

    public Drawable o()
    {
        return b;
    }

    public View p()
    {
        return c;
    }

    public boolean performIdentifierAction(int i1, int j1)
    {
        return a(findItem(i1), j1);
    }

    public boolean performShortcut(int i1, KeyEvent keyevent, int j1)
    {
        keyevent = a(i1, keyevent);
        boolean flag = false;
        if (keyevent != null)
        {
            flag = a(keyevent, j1);
        }
        if ((j1 & 2) != 0)
        {
            b(true);
        }
        return flag;
    }

    public MenuBuilder q()
    {
        return this;
    }

    boolean r()
    {
        return y;
    }

    public void removeGroup(int i1)
    {
        int k1 = d(i1);
        if (k1 >= 0)
        {
            int l1 = n.size();
            for (int j1 = 0; j1 < l1 - k1 && ((MenuItemImpl)n.get(k1)).getGroupId() == i1; j1++)
            {
                a(k1, false);
            }

            c(true);
        }
    }

    public void removeItem(int i1)
    {
        a(c(i1), true);
    }

    public MenuItemImpl s()
    {
        return C;
    }

    public void setGroupCheckable(int i1, boolean flag, boolean flag1)
    {
        int k1 = n.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)n.get(j1);
            if (menuitemimpl.getGroupId() == i1)
            {
                menuitemimpl.setExclusiveCheckable(flag1);
                menuitemimpl.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int k1 = n.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)n.get(j1);
            if (menuitemimpl.getGroupId() == i1)
            {
                menuitemimpl.setEnabled(flag);
            }
        }

    }

    public void setGroupVisible(int i1, boolean flag)
    {
        int k1 = n.size();
        int j1 = 0;
        boolean flag1 = false;
        for (; j1 < k1; j1++)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)n.get(j1);
            if (menuitemimpl.getGroupId() == i1 && menuitemimpl.setVisibleInt(flag))
            {
                flag1 = true;
            }
        }

        if (flag1)
        {
            c(true);
        }
    }

    public void setQwertyMode(boolean flag)
    {
        k = flag;
        c(false);
    }

    public int size()
    {
        return n.size();
    }

}
