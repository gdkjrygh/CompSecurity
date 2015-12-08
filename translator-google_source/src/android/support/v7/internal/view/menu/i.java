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
import android.support.v4.b.a.a;
import android.support.v4.view.an;
import android.support.v4.view.n;
import android.support.v7.a.c;
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
//            m, ab, v, j

public class i
    implements a
{

    private static final int l[] = {
        1, 4, 5, 3, 2, 0
    };
    final Context a;
    public j b;
    ArrayList c;
    public ArrayList d;
    public int e;
    CharSequence f;
    Drawable g;
    View h;
    boolean i;
    m j;
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

    public i(Context context)
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
        if (m.getConfiguration().keyboard == 1 || !m.getBoolean(c.abc_config_showMenuShortcutsWhenKeyboardPresent))
        {
            flag = false;
        }
        o = flag;
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((m)arraylist.get(j1)).a <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private m a(int i1, KeyEvent keyevent)
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
            return (m)arraylist.get(0);
        }
        flag = b();
        j1 = 0;
_L9:
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        m m1 = (m)arraylist.get(j1);
        char c1;
        if (flag)
        {
            c1 = m1.getAlphabeticShortcut();
        } else
        {
            c1 = m1.getNumericShortcut();
        }
        if (c1 != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = m1;
        if ((k1 & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c1 != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = m1;
        if ((k1 & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c1 != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = m1;
        if (i1 == 67) goto _L6; else goto _L8
_L8:
        j1++;
          goto _L9
_L4:
        return null;
    }

    private MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = k1 >> 16;
        if (l1 < 0 || l1 >= l.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        l1 = l[l1] << 16 | 0xffff & k1;
        charsequence = new m(this, i1, j1, k1, l1, charsequence, e);
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
                m m1 = (m)c.get(j1);
                if (m1.hasSubMenu())
                {
                    ((i)m1.getSubMenu()).a(list, i1, keyevent);
                }
                char c1;
                if (flag)
                {
                    c1 = m1.getAlphabeticShortcut();
                } else
                {
                    c1 = m1.getNumericShortcut();
                }
                if ((k1 & 5) == 0 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && m1.isEnabled())
                {
                    list.add(m1);
                }
                j1++;
            }
        }
    }

    protected final i a(Drawable drawable)
    {
        a(((CharSequence) (null)), drawable, ((View) (null)));
        return this;
    }

    protected final i a(CharSequence charsequence)
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
        int j1 = size();
        int i1 = 0;
        SparseArray sparsearray;
        SparseArray sparsearray2;
        for (sparsearray = null; i1 < j1; sparsearray = sparsearray2)
        {
            MenuItem menuitem = getItem(i1);
            View view = an.a(menuitem);
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
                    if (an.c(menuitem))
                    {
                        bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
                        sparsearray2 = sparsearray1;
                    }
                }
            }
            if (menuitem.hasSubMenu())
            {
                ((ab)menuitem.getSubMenu()).a(bundle);
            }
            i1++;
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(a(), sparsearray);
        }
    }

    public void a(j j1)
    {
        b = j1;
    }

    public final void a(v v1)
    {
        a(v1, a);
    }

    public final void a(v v1, Context context)
    {
        y.add(new WeakReference(v1));
        v1.a(context, this);
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
            v v1 = (v)weakreference.get();
            if (v1 == null)
            {
                y.remove(weakreference);
            } else
            {
                v1.a(this, flag);
            }
        }

        w = false;
    }

    boolean a(i i1, MenuItem menuitem)
    {
        return b != null && b.a(i1, menuitem);
    }

    public boolean a(m m1)
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
                v v1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    v1 = (v)weakreference.get();
                    if (v1 != null)
                    {
                        break;
                    }
                    y.remove(weakreference);
                } while (true);
                flag = v1.b(m1);
            } while (!flag);
            e();
            flag1 = flag;
            if (flag)
            {
                j = m1;
                return flag;
            }
        }
        return flag1;
    }

    public final boolean a(MenuItem menuitem, v v1, int i1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        menuitem = (m)menuitem;
        if (menuitem != null && menuitem.isEnabled()) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        return flag1;
_L2:
        n n1;
        boolean flag;
        boolean flag3;
        flag3 = menuitem.b();
        n1 = ((m) (menuitem)).d;
        if (n1 != null && n1.e())
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
                menuitem.a(new ab(a, this, menuitem));
            }
            menuitem = (ab)menuitem.getSubMenu();
            if (flag)
            {
                n1.a(menuitem);
            }
            if (!y.isEmpty())
            {
                flag1 = flag2;
                if (v1 != null)
                {
                    flag1 = v1.a(menuitem);
                }
                v1 = y.iterator();
                while (v1.hasNext()) 
                {
                    WeakReference weakreference = (WeakReference)v1.next();
                    v v2 = (v)weakreference.get();
                    if (v2 == null)
                    {
                        y.remove(weakreference);
                    } else
                    if (!flag1)
                    {
                        flag1 = v2.a(menuitem);
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
        charsequence = (m)a(i1, j1, k1, charsequence);
        ab ab1 = new ab(a, this, charsequence);
        charsequence.a(ab1);
        return ab1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public final void b(Bundle bundle)
    {
        if (bundle != null)
        {
            SparseArray sparsearray = bundle.getSparseParcelableArray(a());
            int k1 = size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                MenuItem menuitem = getItem(i1);
                View view = an.a(menuitem);
                if (view != null && view.getId() != -1)
                {
                    view.restoreHierarchyState(sparsearray);
                }
                if (menuitem.hasSubMenu())
                {
                    ((ab)menuitem.getSubMenu()).b(bundle);
                }
            }

            int j1 = bundle.getInt("android:menu:expandedactionview");
            if (j1 > 0)
            {
                bundle = findItem(j1);
                if (bundle != null)
                {
                    an.b(bundle);
                    return;
                }
            }
        }
    }

    public final void b(v v1)
    {
        Iterator iterator = y.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            v v2 = (v)weakreference.get();
            if (v2 == null || v2 == v1)
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
                    v v1 = (v)weakreference.get();
                    if (v1 == null)
                    {
                        y.remove(weakreference);
                    } else
                    {
                        v1.b(flag);
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

    public boolean b(m m1)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!y.isEmpty())
        {
            if (j != m1)
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
                    v v1;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        WeakReference weakreference = (WeakReference)iterator.next();
                        v1 = (v)weakreference.get();
                        if (v1 != null)
                        {
                            break;
                        }
                        y.remove(weakreference);
                    } while (true);
                    flag1 = v1.c(m1);
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
        Object obj = (m)c.get(j1);
        if (((m) (obj)).getItemId() != i1) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        MenuItem menuitem;
        if (!((m) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        menuitem = ((m) (obj)).getSubMenu().findItem(i1);
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
            m m1 = (m)c.get(i1);
            if (m1.isVisible())
            {
                p.add(m1);
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
            if (((m)c.get(i1)).isVisible())
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
            v v1 = (v)weakreference.get();
            if (v1 == null)
            {
                y.remove(weakreference);
            } else
            {
                flag = v1.a() | flag;
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
                m m1 = (m)arraylist.get(i1);
                if (m1.f())
                {
                    d.add(m1);
                } else
                {
                    r.add(m1);
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

    public i k()
    {
        return this;
    }

    public boolean performIdentifierAction(int i1, int j1)
    {
        return a(findItem(i1), ((v) (null)), j1);
    }

    public boolean performShortcut(int i1, KeyEvent keyevent, int j1)
    {
        keyevent = a(i1, keyevent);
        boolean flag = false;
        if (keyevent != null)
        {
            flag = a(keyevent, ((v) (null)), j1);
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
        if (((m)c.get(j1)).getGroupId() != i1) goto _L4; else goto _L3
_L3:
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        int i2 = c.size();
        for (int l1 = 0; l1 < i2 - j1 && ((m)c.get(j1)).getGroupId() == i1; l1++)
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
        if (((m)c.get(j1)).getItemId() != i1) goto _L2; else goto _L1
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
            m m1 = (m)c.get(j1);
            if (m1.getGroupId() == i1)
            {
                m1.a(flag1);
                m1.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int k1 = c.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            m m1 = (m)c.get(j1);
            if (m1.getGroupId() == i1)
            {
                m1.setEnabled(flag);
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
            m m1 = (m)c.get(j1);
            if (m1.getGroupId() == i1 && m1.b(flag))
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
