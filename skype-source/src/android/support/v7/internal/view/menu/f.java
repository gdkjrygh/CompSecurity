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
import android.support.v4.internal.view.a;
import android.support.v4.view.d;
import android.support.v4.view.k;
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
//            h, l, o

public class f
    implements android.support.v4.internal.view.a
{
    public static interface a
    {

        public abstract boolean onMenuItemSelected(f f1, MenuItem menuitem);

        public abstract void onMenuModeChange(f f1);
    }

    public static interface b
    {

        public abstract boolean a(h h1);
    }


    private static final int d[] = {
        1, 4, 5, 3, 2, 0
    };
    CharSequence a;
    Drawable b;
    View c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private a i;
    private ArrayList j;
    private ArrayList k;
    private boolean l;
    private ArrayList m;
    private ArrayList n;
    private boolean o;
    private int p;
    private android.view.ContextMenu.ContextMenuInfo q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private ArrayList v;
    private CopyOnWriteArrayList w;
    private h x;
    private boolean y;

    public f(Context context)
    {
        boolean flag = true;
        super();
        p = 0;
        r = false;
        s = false;
        t = false;
        u = false;
        v = new ArrayList();
        w = new CopyOnWriteArrayList();
        e = context;
        f = context.getResources();
        j = new ArrayList();
        k = new ArrayList();
        l = true;
        m = new ArrayList();
        n = new ArrayList();
        o = true;
        if (f.getConfiguration().keyboard == 1 || !f.getBoolean(android.support.v7.appcompat.a.b.abc_config_showMenuShortcutsWhenKeyboardPresent))
        {
            flag = false;
        }
        h = flag;
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((h)arraylist.get(j1)).c() <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private h a(int i1, KeyEvent keyevent)
    {
        ArrayList arraylist = v;
        arraylist.clear();
        a(((List) (arraylist)), i1, keyevent);
        if (!arraylist.isEmpty())
        {
            int k1 = keyevent.getMetaState();
            android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
            keyevent.getKeyData(keydata);
            int l1 = arraylist.size();
            if (l1 == 1)
            {
                return (h)arraylist.get(0);
            }
            boolean flag = c();
            int j1 = 0;
            while (j1 < l1) 
            {
                keyevent = (h)arraylist.get(j1);
                char c1;
                if (flag)
                {
                    c1 = keyevent.getAlphabeticShortcut();
                } else
                {
                    c1 = keyevent.getNumericShortcut();
                }
                if (c1 == keydata.meta[0] && (k1 & 2) == 0 || c1 == keydata.meta[2] && (k1 & 2) != 0 || flag && c1 == '\b' && i1 == 67)
                {
                    return keyevent;
                }
                j1++;
            }
        }
        return null;
    }

    private void a(int i1, boolean flag)
    {
        if (i1 >= 0 && i1 < j.size())
        {
            j.remove(i1);
            if (flag)
            {
                b(true);
                return;
            }
        }
    }

    private void a(CharSequence charsequence, Drawable drawable, View view)
    {
        if (view != null)
        {
            c = view;
            a = null;
            b = null;
        } else
        {
            if (charsequence != null)
            {
                a = charsequence;
            }
            if (drawable != null)
            {
                b = drawable;
            }
            c = null;
        }
        b(false);
    }

    private void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = c();
        int k1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i1 == 67)
        {
            int l1 = j.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                h h1 = (h)j.get(j1);
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

    public final f a()
    {
        p = 1;
        return this;
    }

    protected final f a(Drawable drawable)
    {
        a(((CharSequence) (null)), drawable, ((View) (null)));
        return this;
    }

    protected final f a(View view)
    {
        a(((CharSequence) (null)), ((Drawable) (null)), view);
        return this;
    }

    protected final f a(CharSequence charsequence)
    {
        a(charsequence, ((Drawable) (null)), ((View) (null)));
        return this;
    }

    protected final MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = (0xffff0000 & k1) >> 16;
        if (l1 < 0 || l1 >= d.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        l1 = d[l1] << 16 | 0xffff & k1;
        charsequence = new h(this, i1, j1, k1, l1, charsequence, p);
        if (q != null)
        {
            charsequence.a(q);
        }
        j.add(a(j, l1), charsequence);
        b(true);
        return charsequence;
    }

    public final void a(Bundle bundle)
    {
        if (!w.isEmpty())
        {
            SparseArray sparsearray = new SparseArray();
            Iterator iterator = w.iterator();
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
                    w.remove(weakreference);
                } else
                {
                    int i1 = l1.b();
                    if (i1 > 0)
                    {
                        Parcelable parcelable = l1.d();
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
        i = a1;
    }

    public final void a(l l1)
    {
        a(l1, e);
    }

    public final void a(l l1, Context context)
    {
        w.add(new WeakReference(l1));
        l1.a(context, this);
        o = true;
    }

    final void a(MenuItem menuitem)
    {
        int j1 = menuitem.getGroupId();
        int k1 = j.size();
        int i1 = 0;
        while (i1 < k1) 
        {
            h h1 = (h)j.get(i1);
            if (h1.getGroupId() == j1 && h1.g() && h1.isCheckable())
            {
                boolean flag;
                if (h1 == menuitem)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                h1.b(flag);
            }
            i1++;
        }
    }

    public final void a(boolean flag)
    {
        if (u)
        {
            return;
        }
        u = true;
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            l l1 = (l)weakreference.get();
            if (l1 == null)
            {
                w.remove(weakreference);
            } else
            {
                l1.a(this, flag);
            }
        }

        u = false;
    }

    boolean a(f f1, MenuItem menuitem)
    {
        return i != null && i.onMenuItemSelected(f1, menuitem);
    }

    public boolean a(h h1)
    {
        boolean flag;
        if (w.isEmpty())
        {
            flag = false;
        } else
        {
            flag = false;
            g();
            Iterator iterator = w.iterator();
            boolean flag1;
label0:
            do
            {
                l l1;
                do
                {
                    flag1 = flag;
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
                    w.remove(weakreference);
                } while (true);
                flag1 = l1.a(h1);
                flag = flag1;
            } while (!flag1);
            h();
            flag = flag1;
            if (flag1)
            {
                x = h1;
                return flag1;
            }
        }
        return flag;
    }

    public final boolean a(MenuItem menuitem, l l1, int i1)
    {
        boolean flag1;
        boolean flag3;
        flag3 = false;
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
        boolean flag2;
        flag2 = menuitem.b();
        d1 = menuitem.a();
        if (d1 != null && d1.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!menuitem.n())
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 |= menuitem.expandActionView();
        flag1 = flag2;
        if (flag2)
        {
            a(true);
            return flag2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!menuitem.hasSubMenu() && !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        a(false);
        if (!menuitem.hasSubMenu())
        {
            menuitem.a(new o(e, this, menuitem));
        }
        menuitem = (o)menuitem.getSubMenu();
        if (flag)
        {
            d1.a(menuitem);
        }
        if (!w.isEmpty())
        {
            flag1 = flag3;
            if (l1 != null)
            {
                flag1 = l1.a(menuitem);
            }
            l1 = w.iterator();
            while (l1.hasNext()) 
            {
                WeakReference weakreference = (WeakReference)l1.next();
                l l2 = (l)weakreference.get();
                if (l2 == null)
                {
                    w.remove(weakreference);
                } else
                if (!flag1)
                {
                    flag1 = l2.a(menuitem);
                }
            }
        }
        flag2 |= flag1;
        flag1 = flag2;
        if (!flag2)
        {
            a(true);
            return flag2;
        }
        if (true) goto _L4; else goto _L5
_L5:
        flag1 = flag2;
        if ((i1 & 1) == 0)
        {
            a(true);
            return flag2;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public MenuItem add(int i1)
    {
        return a(0, 0, 0, f.getString(i1));
    }

    public MenuItem add(int i1, int j1, int k1, int l1)
    {
        return a(i1, j1, k1, f.getString(l1));
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
        PackageManager packagemanager = e.getPackageManager();
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
        return addSubMenu(0, 0, 0, ((CharSequence) (f.getString(i1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, int l1)
    {
        return addSubMenu(i1, j1, k1, ((CharSequence) (f.getString(l1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, CharSequence charsequence)
    {
        charsequence = (h)a(i1, j1, k1, charsequence);
        o o1 = new o(e, this, charsequence);
        charsequence.a(o1);
        return o1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    protected String b()
    {
        return "android:menu:actionviewstates";
    }

    public final void b(Bundle bundle)
    {
        bundle = bundle.getSparseParcelableArray("android:menu:presenters");
        if (bundle != null && !w.isEmpty())
        {
            Iterator iterator = w.iterator();
            while (iterator.hasNext()) 
            {
                WeakReference weakreference = (WeakReference)iterator.next();
                l l1 = (l)weakreference.get();
                if (l1 == null)
                {
                    w.remove(weakreference);
                } else
                {
                    int i1 = l1.b();
                    if (i1 > 0)
                    {
                        Parcelable parcelable = (Parcelable)bundle.get(i1);
                        if (parcelable != null)
                        {
                            l1.a(parcelable);
                        }
                    }
                }
            }
        }
    }

    public final void b(l l1)
    {
        Iterator iterator = w.iterator();
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
                w.remove(weakreference);
            }
        } while (true);
    }

    public final void b(boolean flag)
    {
        if (!r)
        {
            if (flag)
            {
                l = true;
                o = true;
            }
            if (!w.isEmpty())
            {
                g();
                for (Iterator iterator = w.iterator(); iterator.hasNext();)
                {
                    WeakReference weakreference = (WeakReference)iterator.next();
                    l l1 = (l)weakreference.get();
                    if (l1 == null)
                    {
                        w.remove(weakreference);
                    } else
                    {
                        l1.a(flag);
                    }
                }

                h();
            }
            return;
        } else
        {
            s = true;
            return;
        }
    }

    public boolean b(h h1)
    {
        boolean flag;
        if (w.isEmpty() || x != h1)
        {
            flag = false;
        } else
        {
            flag = false;
            g();
            Iterator iterator = w.iterator();
            boolean flag1;
label0:
            do
            {
                l l1;
                do
                {
                    flag1 = flag;
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
                    w.remove(weakreference);
                } while (true);
                flag1 = l1.b(h1);
                flag = flag1;
            } while (!flag1);
            h();
            flag = flag1;
            if (flag1)
            {
                x = null;
                return flag1;
            }
        }
        return flag;
    }

    public final boolean b(MenuItem menuitem)
    {
        return a(menuitem, ((l) (null)), 0);
    }

    public final void c(Bundle bundle)
    {
        SparseArray sparsearray = null;
        int j1 = size();
        for (int i1 = 0; i1 < j1;)
        {
            MenuItem menuitem = getItem(i1);
            View view = android.support.v4.view.k.a(menuitem);
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
                    if (android.support.v4.view.k.c(menuitem))
                    {
                        bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
                        sparsearray2 = sparsearray1;
                    }
                }
            }
            if (menuitem.hasSubMenu())
            {
                ((o)menuitem.getSubMenu()).c(bundle);
            }
            i1++;
            sparsearray = sparsearray2;
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(b(), sparsearray);
        }
    }

    public final void c(boolean flag)
    {
        y = flag;
    }

    boolean c()
    {
        return g;
    }

    public void clear()
    {
        if (x != null)
        {
            b(x);
        }
        j.clear();
        b(true);
    }

    public void clearHeader()
    {
        b = null;
        a = null;
        c = null;
        b(false);
    }

    public void close()
    {
        a(true);
    }

    public final void d(Bundle bundle)
    {
        if (bundle != null)
        {
            SparseArray sparsearray = bundle.getSparseParcelableArray(b());
            int k1 = size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                MenuItem menuitem = getItem(i1);
                View view = android.support.v4.view.k.a(menuitem);
                if (view != null && view.getId() != -1)
                {
                    view.restoreHierarchyState(sparsearray);
                }
                if (menuitem.hasSubMenu())
                {
                    ((o)menuitem.getSubMenu()).d(bundle);
                }
            }

            int j1 = bundle.getInt("android:menu:expandedactionview");
            if (j1 > 0)
            {
                bundle = findItem(j1);
                if (bundle != null)
                {
                    android.support.v4.view.k.b(bundle);
                    return;
                }
            }
        }
    }

    public boolean d()
    {
        return h;
    }

    public final Context e()
    {
        return e;
    }

    public final void f()
    {
        if (i != null)
        {
            i.onMenuModeChange(this);
        }
    }

    public MenuItem findItem(int i1)
    {
        int k1 = size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            Object obj = (h)j.get(j1);
            if (((h) (obj)).getItemId() == i1)
            {
                return ((MenuItem) (obj));
            }
            if (!((h) (obj)).hasSubMenu())
            {
                continue;
            }
            obj = ((h) (obj)).getSubMenu().findItem(i1);
            if (obj != null)
            {
                return ((MenuItem) (obj));
            }
        }

        return null;
    }

    public final void g()
    {
        if (!r)
        {
            r = true;
            s = false;
        }
    }

    public MenuItem getItem(int i1)
    {
        return (MenuItem)j.get(i1);
    }

    public final void h()
    {
        r = false;
        if (s)
        {
            s = false;
            b(true);
        }
    }

    public boolean hasVisibleItems()
    {
        if (y)
        {
            return true;
        }
        int j1 = size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((h)j.get(i1)).isVisible())
            {
                return true;
            }
        }

        return false;
    }

    final void i()
    {
        l = true;
        b(true);
    }

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    final void j()
    {
        o = true;
        b(true);
    }

    public final ArrayList k()
    {
        if (!l)
        {
            return k;
        }
        k.clear();
        int j1 = j.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            h h1 = (h)j.get(i1);
            if (h1.isVisible())
            {
                k.add(h1);
            }
        }

        l = false;
        o = true;
        return k;
    }

    public final void l()
    {
        ArrayList arraylist = k();
        if (!o)
        {
            return;
        }
        boolean flag = false;
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            l l1 = (l)weakreference.get();
            if (l1 == null)
            {
                w.remove(weakreference);
            } else
            {
                flag |= l1.a();
            }
        }

        if (flag)
        {
            m.clear();
            n.clear();
            int j1 = arraylist.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                h h1 = (h)arraylist.get(i1);
                if (h1.j())
                {
                    m.add(h1);
                } else
                {
                    n.add(h1);
                }
                i1++;
            }
        } else
        {
            m.clear();
            n.clear();
            n.addAll(k());
        }
        o = false;
    }

    public final ArrayList m()
    {
        l();
        return m;
    }

    public final ArrayList n()
    {
        l();
        return n;
    }

    public f o()
    {
        return this;
    }

    final boolean p()
    {
        return t;
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

    public final h q()
    {
        return x;
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
        if (((h)j.get(j1)).getGroupId() != i1) goto _L4; else goto _L3
_L3:
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        int i2 = j.size();
        for (int l1 = 0; l1 < i2 - j1 && ((h)j.get(j1)).getGroupId() == i1; l1++)
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
        if (((h)j.get(j1)).getItemId() != i1) goto _L2; else goto _L1
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
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            h h1 = (h)j.get(j1);
            if (h1.getGroupId() == i1)
            {
                h1.a(flag1);
                h1.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            h h1 = (h)j.get(j1);
            if (h1.getGroupId() == i1)
            {
                h1.setEnabled(flag);
            }
        }

    }

    public void setGroupVisible(int i1, boolean flag)
    {
        int k1 = j.size();
        boolean flag1 = false;
        for (int j1 = 0; j1 < k1;)
        {
            h h1 = (h)j.get(j1);
            boolean flag2 = flag1;
            if (h1.getGroupId() == i1)
            {
                flag2 = flag1;
                if (h1.c(flag))
                {
                    flag2 = true;
                }
            }
            j1++;
            flag1 = flag2;
        }

        if (flag1)
        {
            b(true);
        }
    }

    public void setQwertyMode(boolean flag)
    {
        g = flag;
        b(false);
    }

    public int size()
    {
        return j.size();
    }

}
