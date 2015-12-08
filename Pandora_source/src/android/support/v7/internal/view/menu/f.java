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
import p.c.a;

// Referenced classes of package android.support.v7.internal.view.menu:
//            h, l, p

public class f
    implements p.c.a
{
    public static interface a
    {

        public abstract void a(f f1);

        public abstract boolean a(f f1, MenuItem menuitem);
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

    public f(Context context)
    {
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
        d(true);
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((h)arraylist.get(j1)).b() <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = c(k1);
        charsequence = new h(this, i1, j1, k1, l1, charsequence, p);
        if (q != null)
        {
            charsequence.a(q);
        }
        j.add(a(j, l1), charsequence);
        b(true);
        return charsequence;
    }

    private void a(int i1, CharSequence charsequence, int j1, Drawable drawable, View view)
    {
        Resources resources = d();
        if (view == null) goto _L2; else goto _L1
_L1:
        c = view;
        a = null;
        b = null;
_L4:
        b(false);
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
        b = resources.getDrawable(j1);
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

    private boolean a(p p1)
    {
        if (w.isEmpty())
        {
            return false;
        }
        Iterator iterator = w.iterator();
        boolean flag = false;
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
            if (!flag)
            {
                flag = l1.a(p1);
            }
        } while (true);
        return flag;
    }

    private static int c(int i1)
    {
        int j1 = (0xffff0000 & i1) >> 16;
        if (j1 < 0 || j1 >= d.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        } else
        {
            return d[j1] << 16 | 0xffff & i1;
        }
    }

    private void c(boolean flag)
    {
        if (w.isEmpty())
        {
            return;
        }
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
                l1.c(flag);
            }
        }

        h();
    }

    private void d(boolean flag)
    {
        boolean flag1 = true;
        if (flag && f.getConfiguration().keyboard != 1 && f.getBoolean(android.support.v7.appcompat.R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    public int a(int i1)
    {
        int k1 = size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (((h)j.get(j1)).getItemId() == i1)
            {
                return j1;
            }
        }

        return -1;
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
            if (((h)j.get(k1)).getGroupId() == i1)
            {
                return k1;
            }
        }

        return -1;
    }

    protected f a(Drawable drawable)
    {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected f a(View view)
    {
        a(0, null, 0, null, view);
        return this;
    }

    protected f a(CharSequence charsequence)
    {
        a(0, charsequence, 0, null, null);
        return this;
    }

    h a(int i1, KeyEvent keyevent)
    {
        ArrayList arraylist;
        arraylist = v;
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

    protected String a()
    {
        return "android:menu:actionviewstates";
    }

    public void a(Bundle bundle)
    {
        int j1 = size();
        int i1 = 0;
        SparseArray sparsearray;
        SparseArray sparsearray2;
        for (sparsearray = null; i1 < j1; sparsearray = sparsearray2)
        {
            MenuItem menuitem = getItem(i1);
            View view = android.support.v4.view.k.a(menuitem);
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
                    if (android.support.v4.view.k.c(menuitem))
                    {
                        bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
                        sparsearray2 = sparsearray1;
                    }
                }
            }
            if (menuitem.hasSubMenu())
            {
                ((p)menuitem.getSubMenu()).a(bundle);
            }
            i1++;
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(a(), sparsearray);
        }
    }

    public void a(a a1)
    {
        i = a1;
    }

    void a(h h1)
    {
        l = true;
        b(true);
    }

    public void a(l l1)
    {
        w.add(new WeakReference(l1));
        l1.a(e, this);
        o = true;
    }

    void a(MenuItem menuitem)
    {
        int j1 = menuitem.getGroupId();
        int k1 = j.size();
        int i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            h h1 = (h)j.get(i1);
            if (h1.getGroupId() == j1 && h1.f() && h1.isCheckable())
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
        } while (true);
    }

    void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = b();
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

    final void a(boolean flag)
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
        return i != null && i.a(f1, menuitem);
    }

    public boolean a(MenuItem menuitem, int i1)
    {
        Object obj;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        obj = (h)menuitem;
        flag1 = flag2;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((h) (obj)).isEnabled()) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
_L2:
        return flag1;
_L4:
        boolean flag;
        flag1 = ((h) (obj)).a();
        menuitem = ((h) (obj)).m();
        boolean flag3;
        if (menuitem != null && menuitem.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!((h) (obj)).n())
        {
            break; /* Loop/switch isn't completed */
        }
        flag3 = ((h) (obj)).expandActionView() | flag1;
        flag1 = flag3;
        if (flag3)
        {
            a(true);
            return flag3;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (((h) (obj)).hasSubMenu() || flag)
        {
            a(false);
            if (!((h) (obj)).hasSubMenu())
            {
                ((h) (obj)).a(new p(e(), this, ((h) (obj))));
            }
            obj = (p)((h) (obj)).getSubMenu();
            if (flag)
            {
                menuitem.a(((SubMenu) (obj)));
            }
            boolean flag4 = a(((p) (obj))) | flag1;
            flag1 = flag4;
            if (!flag4)
            {
                a(true);
                return flag4;
            }
        } else
        {
            if ((i1 & 1) == 0)
            {
                a(true);
            }
            return flag1;
        }
        if (true) goto _L2; else goto _L6
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
        p p1 = new p(e, this, charsequence);
        charsequence.a(p1);
        return p1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public int b(int i1)
    {
        return a(i1, 0);
    }

    public void b(Bundle bundle)
    {
        if (bundle != null)
        {
            SparseArray sparsearray = bundle.getSparseParcelableArray(a());
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
                    ((p)menuitem.getSubMenu()).b(bundle);
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

    void b(h h1)
    {
        o = true;
        b(true);
    }

    public void b(l l1)
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

    void b(boolean flag)
    {
        if (!r)
        {
            if (flag)
            {
                l = true;
                o = true;
            }
            c(flag);
            return;
        } else
        {
            s = true;
            return;
        }
    }

    boolean b()
    {
        return g;
    }

    public boolean c()
    {
        return h;
    }

    public boolean c(h h1)
    {
        boolean flag1 = false;
        if (!w.isEmpty())
        {
            g();
            Iterator iterator = w.iterator();
            boolean flag = false;
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
                    continue;
                }
                flag1 = l1.a(this, h1);
                flag = flag1;
                if (!flag1)
                {
                    continue;
                }
                flag = flag1;
                break;
            } while (true);
            h();
            flag1 = flag;
            if (flag)
            {
                x = h1;
                return flag;
            }
        }
        return flag1;
    }

    public void clear()
    {
        if (x != null)
        {
            d(x);
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

    Resources d()
    {
        return f;
    }

    public boolean d(h h1)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!w.isEmpty())
        {
            if (x != h1)
            {
                flag2 = flag;
            } else
            {
                g();
                Iterator iterator = w.iterator();
                boolean flag1 = false;
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
                        continue;
                    }
                    flag2 = l1.b(this, h1);
                    flag1 = flag2;
                    if (!flag2)
                    {
                        continue;
                    }
                    flag1 = flag2;
                    break;
                } while (true);
                h();
                flag2 = flag1;
                if (flag1)
                {
                    x = null;
                    return flag1;
                }
            }
        }
        return flag2;
    }

    public Context e()
    {
        return e;
    }

    public void f()
    {
        if (i != null)
        {
            i.a(this);
        }
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
        Object obj = (h)j.get(j1);
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

    public void g()
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

    public void h()
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

    ArrayList i()
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

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    public void j()
    {
        if (!o)
        {
            return;
        }
        Iterator iterator = w.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            l l1 = (l)weakreference.get();
            if (l1 == null)
            {
                w.remove(weakreference);
            } else
            {
                flag = l1.g() | flag;
            }
        }
        if (flag)
        {
            m.clear();
            n.clear();
            ArrayList arraylist = i();
            int j1 = arraylist.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                h h1 = (h)arraylist.get(i1);
                if (h1.i())
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
            n.addAll(i());
        }
        o = false;
    }

    ArrayList k()
    {
        j();
        return m;
    }

    ArrayList l()
    {
        j();
        return n;
    }

    public CharSequence m()
    {
        return a;
    }

    public Drawable n()
    {
        return b;
    }

    public View o()
    {
        return c;
    }

    public f p()
    {
        return this;
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
            a(true);
        }
        return flag;
    }

    boolean q()
    {
        return t;
    }

    public h r()
    {
        return x;
    }

    public void removeGroup(int i1)
    {
        int k1 = b(i1);
        if (k1 >= 0)
        {
            int l1 = j.size();
            for (int j1 = 0; j1 < l1 - k1 && ((h)j.get(k1)).getGroupId() == i1; j1++)
            {
                a(k1, false);
            }

            b(true);
        }
    }

    public void removeItem(int i1)
    {
        a(a(i1), true);
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
        int j1 = 0;
        boolean flag1 = false;
        for (; j1 < k1; j1++)
        {
            h h1 = (h)j.get(j1);
            if (h1.getGroupId() == i1 && h1.c(flag))
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
        g = flag;
        b(false);
    }

    public int size()
    {
        return j.size();
    }

}
