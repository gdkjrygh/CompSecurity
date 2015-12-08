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
import android.support.v4.d.a.a;
import android.support.v4.view.d;
import android.support.v4.view.m;
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
//            h, l, p

public class f
    implements android.support.v4.d.a.a
{
    public static interface a
    {

        public abstract boolean onMenuItemSelected(f f1, MenuItem menuitem);

        public abstract void onMenuModeChange(f f1);
    }

    public static interface b
    {

        public abstract boolean invokeItem(h h1);
    }


    private static final int l[] = {
        1, 4, 5, 3, 2, 0
    };
    final Context a;
    public a b;
    ArrayList c;
    public ArrayList d;
    public int e;
    CharSequence f;
    Drawable g;
    View h;
    boolean i;
    h j;
    public boolean k;
    private final Resources m;
    private boolean n;
    private boolean o;
    private ArrayList p;
    private boolean q;
    private ArrayList r;
    private boolean s;
    private android.view.ContextMenu.ContextMenuInfo t;
    private boolean u;
    private boolean v;
    private boolean w;
    private ArrayList x;
    private CopyOnWriteArrayList y;

    public f(Context context)
    {
        boolean flag = true;
        super();
        e = 0;
        u = false;
        v = false;
        i = false;
        w = false;
        x = new ArrayList();
        y = new CopyOnWriteArrayList();
        a = context;
        m = context.getResources();
        c = new ArrayList();
        p = new ArrayList();
        q = true;
        d = new ArrayList();
        r = new ArrayList();
        s = true;
        if (m.getConfiguration().keyboard == 1 || !m.getBoolean(android.support.v7.appcompat.R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent))
        {
            flag = false;
        }
        o = flag;
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((h)arraylist.get(j1)).a <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private h a(int i1, KeyEvent keyevent)
    {
        ArrayList arraylist;
        arraylist = x;
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
            return (h)arraylist.get(0);
        }
        flag = b();
        j1 = 0;
_L9:
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        h h1 = (h)arraylist.get(j1);
        char c1;
        if (flag)
        {
            c1 = h1.getAlphabeticShortcut();
        } else
        {
            c1 = h1.getNumericShortcut();
        }
        if (c1 != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = h1;
        if ((k1 & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c1 != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = h1;
        if ((k1 & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c1 != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = h1;
        if (i1 == 67) goto _L6; else goto _L8
_L8:
        j1++;
          goto _L9
_L4:
        return null;
    }

    private MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = (0xffff0000 & k1) >> 16;
        if (l1 < 0 || l1 >= l.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        l1 = l[l1] << 16 | 0xffff & k1;
        charsequence = new h(this, i1, j1, k1, l1, charsequence, e);
        if (t != null)
        {
            charsequence.e = t;
        }
        c.add(a(c, l1), charsequence);
        b(true);
        return charsequence;
    }

    private void a(int i1, boolean flag)
    {
        if (i1 >= 0 && i1 < c.size())
        {
            c.remove(i1);
            if (flag)
            {
                b(true);
                return;
            }
        }
    }

    private void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = b();
        int k1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i1 == 67)
        {
            int l1 = c.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                h h1 = (h)c.get(j1);
                if (h1.hasSubMenu())
                {
                    ((f)h1.getSubMenu()).a(list, i1, keyevent);
                }
                char c1;
                if (flag)
                {
                    c1 = h1.getAlphabeticShortcut();
                } else
                {
                    c1 = h1.getNumericShortcut();
                }
                if ((k1 & 5) == 0 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && h1.isEnabled())
                {
                    list.add(h1);
                }
                j1++;
            }
        }
    }

    protected final f a(Drawable drawable)
    {
        a(((CharSequence) (null)), drawable, ((View) (null)));
        return this;
    }

    protected final f a(CharSequence charsequence)
    {
        a(charsequence, ((Drawable) (null)), ((View) (null)));
        return this;
    }

    protected String a()
    {
        return "android:menu:actionviewstates";
    }

    public final void a(Bundle bundle)
    {
        if (!y.isEmpty())
        {
            SparseArray sparsearray = new SparseArray();
            Iterator iterator = y.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WeakReference weakreference = (WeakReference)iterator.next();
                l l1 = (l)weakreference.get();
                if (l1 == null)
                {
                    y.remove(weakreference);
                } else
                {
                    int i1 = l1.getId();
                    if (i1 > 0)
                    {
                        Parcelable parcelable = l1.onSaveInstanceState();
                        if (parcelable != null)
                        {
                            sparsearray.put(i1, parcelable);
                        }
                    }
                }
            } while (true);
            bundle.putSparseParcelableArray("android:menu:presenters", sparsearray);
        }
    }

    public void a(a a1)
    {
        b = a1;
    }

    public final void a(l l1)
    {
        a(l1, a);
    }

    public final void a(l l1, Context context)
    {
        y.add(new WeakReference(l1));
        l1.initForMenu(context, this);
        s = true;
    }

    final void a(CharSequence charsequence, Drawable drawable, View view)
    {
        if (view != null)
        {
            h = view;
            f = null;
            g = null;
        } else
        {
            if (charsequence != null)
            {
                f = charsequence;
            }
            if (drawable != null)
            {
                g = drawable;
            }
            h = null;
        }
        b(false);
    }

    public final void a(boolean flag)
    {
        if (w)
        {
            return;
        }
        w = true;
        for (Iterator iterator = y.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            l l1 = (l)weakreference.get();
            if (l1 == null)
            {
                y.remove(weakreference);
            } else
            {
                l1.onCloseMenu(this, flag);
            }
        }

        w = false;
    }

    boolean a(f f1, MenuItem menuitem)
    {
        return b != null && b.onMenuItemSelected(f1, menuitem);
    }

    public boolean a(h h1)
    {
        boolean flag1 = false;
        if (!y.isEmpty())
        {
            d();
            Iterator iterator = y.iterator();
            boolean flag = false;
label0:
            do
            {
                l l1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    l1 = (l)weakreference.get();
                    if (l1 != null)
                    {
                        break;
                    }
                    y.remove(weakreference);
                } while (true);
                flag = l1.expandItemActionView(this, h1);
            } while (!flag);
            e();
            flag1 = flag;
            if (flag)
            {
                j = h1;
                return flag;
            }
        }
        return flag1;
    }

    public final boolean a(MenuItem menuitem, l l1, int i1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        menuitem = (h)menuitem;
        if (menuitem != null && menuitem.isEnabled()) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        return flag1;
_L2:
        d d1;
        boolean flag;
        boolean flag3;
        flag3 = menuitem.b();
        d1 = ((h) (menuitem)).d;
        if (d1 != null && d1.hasSubMenu())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!menuitem.i())
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = menuitem.expandActionView() | flag3;
        flag1 = flag2;
        if (flag2)
        {
            a(true);
            return flag2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (menuitem.hasSubMenu() || flag)
        {
            a(false);
            if (!menuitem.hasSubMenu())
            {
                menuitem.a(new p(a, this, menuitem));
            }
            menuitem = (p)menuitem.getSubMenu();
            if (flag)
            {
                d1.onPrepareSubMenu(menuitem);
            }
            if (!y.isEmpty())
            {
                flag1 = flag2;
                if (l1 != null)
                {
                    flag1 = l1.onSubMenuSelected(menuitem);
                }
                l1 = y.iterator();
                while (l1.hasNext()) 
                {
                    WeakReference weakreference = (WeakReference)l1.next();
                    l l2 = (l)weakreference.get();
                    if (l2 == null)
                    {
                        y.remove(weakreference);
                    } else
                    if (!flag1)
                    {
                        flag1 = l2.onSubMenuSelected(menuitem);
                    }
                }
            }
            flag2 = flag3 | flag1;
            flag1 = flag2;
            if (!flag2)
            {
                a(true);
                return flag2;
            }
        } else
        {
            if ((i1 & 1) == 0)
            {
                a(true);
            }
            return flag3;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public MenuItem add(int i1)
    {
        return a(0, 0, 0, m.getString(i1));
    }

    public MenuItem add(int i1, int j1, int k1, int l1)
    {
        return a(i1, j1, k1, m.getString(l1));
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
        PackageManager packagemanager = a.getPackageManager();
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
        return addSubMenu(0, 0, 0, ((CharSequence) (m.getString(i1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, int l1)
    {
        return addSubMenu(i1, j1, k1, ((CharSequence) (m.getString(l1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, CharSequence charsequence)
    {
        charsequence = (h)a(i1, j1, k1, charsequence);
        p p1 = new p(a, this, charsequence);
        charsequence.a(p1);
        return p1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public final void b(Bundle bundle)
    {
        bundle = bundle.getSparseParcelableArray("android:menu:presenters");
        if (bundle != null && !y.isEmpty())
        {
            Iterator iterator = y.iterator();
            while (iterator.hasNext()) 
            {
                WeakReference weakreference = (WeakReference)iterator.next();
                l l1 = (l)weakreference.get();
                if (l1 == null)
                {
                    y.remove(weakreference);
                } else
                {
                    int i1 = l1.getId();
                    if (i1 > 0)
                    {
                        Parcelable parcelable = (Parcelable)bundle.get(i1);
                        if (parcelable != null)
                        {
                            l1.onRestoreInstanceState(parcelable);
                        }
                    }
                }
            }
        }
    }

    public final void b(l l1)
    {
        Iterator iterator = y.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            l l2 = (l)weakreference.get();
            if (l2 == null || l2 == l1)
            {
                y.remove(weakreference);
            }
        } while (true);
    }

    public final void b(boolean flag)
    {
        if (!u)
        {
            if (flag)
            {
                q = true;
                s = true;
            }
            if (!y.isEmpty())
            {
                d();
                for (Iterator iterator = y.iterator(); iterator.hasNext();)
                {
                    WeakReference weakreference = (WeakReference)iterator.next();
                    l l1 = (l)weakreference.get();
                    if (l1 == null)
                    {
                        y.remove(weakreference);
                    } else
                    {
                        l1.updateMenuView(flag);
                    }
                }

                e();
            }
            return;
        } else
        {
            v = true;
            return;
        }
    }

    boolean b()
    {
        return n;
    }

    public boolean b(h h1)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!y.isEmpty())
        {
            if (j != h1)
            {
                flag2 = flag;
            } else
            {
                d();
                Iterator iterator = y.iterator();
                boolean flag1 = false;
label0:
                do
                {
                    l l1;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        WeakReference weakreference = (WeakReference)iterator.next();
                        l1 = (l)weakreference.get();
                        if (l1 != null)
                        {
                            break;
                        }
                        y.remove(weakreference);
                    } while (true);
                    flag1 = l1.collapseItemActionView(this, h1);
                } while (!flag1);
                e();
                flag2 = flag1;
                if (flag1)
                {
                    j = null;
                    return flag1;
                }
            }
        }
        return flag2;
    }

    public final void c(Bundle bundle)
    {
        int j1 = size();
        int i1 = 0;
        SparseArray sparsearray;
        SparseArray sparsearray2;
        for (sparsearray = null; i1 < j1; sparsearray = sparsearray2)
        {
            MenuItem menuitem = getItem(i1);
            View view = android.support.v4.view.m.a(menuitem);
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
                    if (android.support.v4.view.m.c(menuitem))
                    {
                        bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
                        sparsearray2 = sparsearray1;
                    }
                }
            }
            if (menuitem.hasSubMenu())
            {
                ((p)menuitem.getSubMenu()).c(bundle);
            }
            i1++;
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(a(), sparsearray);
        }
    }

    public boolean c()
    {
        return o;
    }

    public void clear()
    {
        if (j != null)
        {
            b(j);
        }
        c.clear();
        b(true);
    }

    public void clearHeader()
    {
        g = null;
        f = null;
        h = null;
        b(false);
    }

    public void close()
    {
        a(true);
    }

    public final void d()
    {
        if (!u)
        {
            u = true;
            v = false;
        }
    }

    public final void d(Bundle bundle)
    {
        if (bundle != null)
        {
            SparseArray sparsearray = bundle.getSparseParcelableArray(a());
            int k1 = size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                MenuItem menuitem = getItem(i1);
                View view = android.support.v4.view.m.a(menuitem);
                if (view != null && view.getId() != -1)
                {
                    view.restoreHierarchyState(sparsearray);
                }
                if (menuitem.hasSubMenu())
                {
                    ((p)menuitem.getSubMenu()).d(bundle);
                }
            }

            int j1 = bundle.getInt("android:menu:expandedactionview");
            if (j1 > 0)
            {
                bundle = findItem(j1);
                if (bundle != null)
                {
                    android.support.v4.view.m.b(bundle);
                    return;
                }
            }
        }
    }

    public final void e()
    {
        u = false;
        if (v)
        {
            v = false;
            b(true);
        }
    }

    final void f()
    {
        q = true;
        b(true);
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
        Object obj = (h)c.get(j1);
        if (((h) (obj)).getItemId() != i1) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        MenuItem menuitem;
        if (!((h) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        menuitem = ((h) (obj)).getSubMenu().findItem(i1);
        obj = menuitem;
        if (menuitem != null) goto _L3; else goto _L5
_L5:
        j1++;
          goto _L6
_L2:
        return null;
    }

    final void g()
    {
        s = true;
        b(true);
    }

    public MenuItem getItem(int i1)
    {
        return (MenuItem)c.get(i1);
    }

    public final ArrayList h()
    {
        if (!q)
        {
            return p;
        }
        p.clear();
        int j1 = c.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            h h1 = (h)c.get(i1);
            if (h1.isVisible())
            {
                p.add(h1);
            }
        }

        q = false;
        s = true;
        return p;
    }

    public boolean hasVisibleItems()
    {
        if (k)
        {
            return true;
        }
        int j1 = size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((h)c.get(i1)).isVisible())
            {
                return true;
            }
        }

        return false;
    }

    public final void i()
    {
        ArrayList arraylist = h();
        if (!s)
        {
            return;
        }
        Iterator iterator = y.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            l l1 = (l)weakreference.get();
            if (l1 == null)
            {
                y.remove(weakreference);
            } else
            {
                flag = l1.flagActionItems() | flag;
            }
        }
        if (flag)
        {
            d.clear();
            r.clear();
            int j1 = arraylist.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                h h1 = (h)arraylist.get(i1);
                if (h1.f())
                {
                    d.add(h1);
                } else
                {
                    r.add(h1);
                }
                i1++;
            }
        } else
        {
            d.clear();
            r.clear();
            r.addAll(h());
        }
        s = false;
    }

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    public final ArrayList j()
    {
        i();
        return r;
    }

    public f k()
    {
        return this;
    }

    public boolean performIdentifierAction(int i1, int j1)
    {
        return a(findItem(i1), ((l) (null)), j1);
    }

    public boolean performShortcut(int i1, KeyEvent keyevent, int j1)
    {
        keyevent = a(i1, keyevent);
        boolean flag = false;
        if (keyevent != null)
        {
            flag = a(keyevent, ((l) (null)), j1);
        }
        if ((j1 & 2) != 0)
        {
            a(true);
        }
        return flag;
    }

    public void removeGroup(int i1)
    {
        int j1;
        int k1;
        k1 = size();
        j1 = 0;
_L7:
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        if (((h)c.get(j1)).getGroupId() != i1) goto _L4; else goto _L3
_L3:
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        int i2 = c.size();
        for (int l1 = 0; l1 < i2 - j1 && ((h)c.get(j1)).getGroupId() == i1; l1++)
        {
            a(j1, false);
        }

        break; /* Loop/switch isn't completed */
_L4:
        j1++;
        continue; /* Loop/switch isn't completed */
_L2:
        j1 = -1;
        if (true) goto _L3; else goto _L5
_L5:
        b(true);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void removeItem(int i1)
    {
        int j1;
        int k1;
        k1 = size();
        j1 = 0;
_L3:
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (((h)c.get(j1)).getItemId() != i1) goto _L2; else goto _L1
_L1:
        a(j1, true);
        return;
_L2:
        j1++;
          goto _L3
        j1 = -1;
          goto _L1
    }

    public void setGroupCheckable(int i1, boolean flag, boolean flag1)
    {
        int k1 = c.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            h h1 = (h)c.get(j1);
            if (h1.getGroupId() == i1)
            {
                h1.a(flag1);
                h1.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int k1 = c.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            h h1 = (h)c.get(j1);
            if (h1.getGroupId() == i1)
            {
                h1.setEnabled(flag);
            }
        }

    }

    public void setGroupVisible(int i1, boolean flag)
    {
        int k1 = c.size();
        int j1 = 0;
        boolean flag1 = false;
        for (; j1 < k1; j1++)
        {
            h h1 = (h)c.get(j1);
            if (h1.getGroupId() == i1 && h1.b(flag))
            {
                flag1 = true;
            }
        }

        if (flag1)
        {
            b(true);
        }
    }

    public void setQwertyMode(boolean flag)
    {
        n = flag;
        b(false);
    }

    public int size()
    {
        return c.size();
    }

}
