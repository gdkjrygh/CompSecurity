// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public class vu
    implements fq
{

    private static final int k[] = {
        1, 4, 5, 3, 2, 0
    };
    final Context a;
    public vv b;
    ArrayList c;
    public ArrayList d;
    public int e;
    CharSequence f;
    Drawable g;
    View h;
    vy i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private boolean n;
    private ArrayList o;
    private boolean p;
    private ArrayList q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private ArrayList w;
    private CopyOnWriteArrayList x;

    public vu(Context context)
    {
        boolean flag = true;
        super();
        e = 0;
        s = false;
        t = false;
        u = false;
        v = false;
        w = new ArrayList();
        x = new CopyOnWriteArrayList();
        a = context;
        l = context.getResources();
        c = new ArrayList();
        o = new ArrayList();
        p = true;
        d = new ArrayList();
        q = new ArrayList();
        r = true;
        if (l.getConfiguration().keyboard == 1 || !l.getBoolean(b.Y))
        {
            flag = false;
        }
        n = flag;
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((vy)arraylist.get(j1)).a <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = k1 >> 16;
        if (l1 < 0 || l1 >= k.length)
        {
            throw new IllegalArgumentException("order does not contain a valid category.");
        } else
        {
            l1 = k[l1] << 16 | 0xffff & k1;
            charsequence = new vy(this, i1, j1, k1, l1, charsequence, e);
            c.add(a(c, l1), charsequence);
            b(true);
            return charsequence;
        }
    }

    private vy a(int i1, KeyEvent keyevent)
    {
        ArrayList arraylist;
        arraylist = w;
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
            return (vy)arraylist.get(0);
        }
        flag = b();
        j1 = 0;
_L9:
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        vy vy1 = (vy)arraylist.get(j1);
        char c1;
        if (flag)
        {
            c1 = vy1.getAlphabeticShortcut();
        } else
        {
            c1 = vy1.getNumericShortcut();
        }
        if (c1 != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = vy1;
        if ((k1 & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c1 != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = vy1;
        if ((k1 & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c1 != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = vy1;
        if (i1 == 67) goto _L6; else goto _L8
_L8:
        j1++;
          goto _L9
_L4:
        return null;
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
                vy vy1 = (vy)c.get(j1);
                if (vy1.hasSubMenu())
                {
                    ((vu)vy1.getSubMenu()).a(list, i1, keyevent);
                }
                char c1;
                if (flag)
                {
                    c1 = vy1.getAlphabeticShortcut();
                } else
                {
                    c1 = vy1.getNumericShortcut();
                }
                if ((k1 & 5) == 0 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && vy1.isEnabled())
                {
                    list.add(vy1);
                }
                j1++;
            }
        }
    }

    protected String a()
    {
        return "android:menu:actionviewstates";
    }

    protected final vu a(Drawable drawable)
    {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected final vu a(CharSequence charsequence)
    {
        a(0, charsequence, 0, null, null);
        return this;
    }

    void a(int i1, CharSequence charsequence, int j1, Drawable drawable, View view)
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

    public final void a(Bundle bundle)
    {
        int j1 = size();
        int i1 = 0;
        SparseArray sparsearray;
        SparseArray sparsearray2;
        for (sparsearray = null; i1 < j1; sparsearray = sparsearray2)
        {
            MenuItem menuitem = getItem(i1);
            View view = ln.a(menuitem);
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
                    if (ln.c(menuitem))
                    {
                        bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
                        sparsearray2 = sparsearray1;
                    }
                }
            }
            if (menuitem.hasSubMenu())
            {
                ((wo)menuitem.getSubMenu()).a(bundle);
            }
            i1++;
        }

        if (sparsearray != null)
        {
            bundle.putSparseParcelableArray(a(), sparsearray);
        }
    }

    public void a(vv vv1)
    {
        b = vv1;
    }

    public final void a(wj wj1)
    {
        a(wj1, a);
    }

    public final void a(wj wj1, Context context)
    {
        x.add(new WeakReference(wj1));
        wj1.a(context, this);
        r = true;
    }

    public final void a(boolean flag)
    {
        if (v)
        {
            return;
        }
        v = true;
        for (Iterator iterator = x.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            wj wj1 = (wj)weakreference.get();
            if (wj1 == null)
            {
                x.remove(weakreference);
            } else
            {
                wj1.a(this, flag);
            }
        }

        v = false;
    }

    public final boolean a(MenuItem menuitem, wj wj1, int i1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        menuitem = (vy)menuitem;
        if (menuitem != null && menuitem.isEnabled()) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        return flag1;
_L2:
        km km1;
        boolean flag;
        boolean flag3;
        flag3 = menuitem.b();
        km1 = ((vy) (menuitem)).d;
        if (km1 != null && km1.f())
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
                menuitem.a(new wo(a, this, menuitem));
            }
            menuitem = (wo)menuitem.getSubMenu();
            if (flag)
            {
                km1.a(menuitem);
            }
            if (!x.isEmpty())
            {
                flag1 = flag2;
                if (wj1 != null)
                {
                    flag1 = wj1.a(menuitem);
                }
                wj1 = x.iterator();
                while (wj1.hasNext()) 
                {
                    WeakReference weakreference = (WeakReference)wj1.next();
                    wj wj2 = (wj)weakreference.get();
                    if (wj2 == null)
                    {
                        x.remove(weakreference);
                    } else
                    if (!flag1)
                    {
                        flag1 = wj2.a(menuitem);
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

    boolean a(vu vu1, MenuItem menuitem)
    {
        return b != null && b.a(vu1, menuitem);
    }

    public boolean a(vy vy1)
    {
        boolean flag1 = false;
        if (!x.isEmpty())
        {
            d();
            Iterator iterator = x.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WeakReference weakreference = (WeakReference)iterator.next();
                wj wj1 = (wj)weakreference.get();
                if (wj1 == null)
                {
                    x.remove(weakreference);
                    continue;
                }
                flag1 = wj1.b(vy1);
                flag = flag1;
                if (flag1)
                {
                    break;
                }
                flag = flag1;
            } while (true);
            e();
            flag1 = flag;
            if (flag)
            {
                i = vy1;
                return flag;
            }
        }
        return flag1;
    }

    public MenuItem add(int i1)
    {
        return a(0, 0, 0, l.getString(i1));
    }

    public MenuItem add(int i1, int j1, int k1, int l1)
    {
        return a(i1, j1, k1, l.getString(l1));
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
        return addSubMenu(0, 0, 0, ((CharSequence) (l.getString(i1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, int l1)
    {
        return addSubMenu(i1, j1, k1, ((CharSequence) (l.getString(l1))));
    }

    public SubMenu addSubMenu(int i1, int j1, int k1, CharSequence charsequence)
    {
        charsequence = (vy)a(i1, j1, k1, charsequence);
        wo wo1 = new wo(a, this, charsequence);
        charsequence.a(wo1);
        return wo1;
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
                View view = ln.a(menuitem);
                if (view != null && view.getId() != -1)
                {
                    view.restoreHierarchyState(sparsearray);
                }
                if (menuitem.hasSubMenu())
                {
                    ((wo)menuitem.getSubMenu()).b(bundle);
                }
            }

            int j1 = bundle.getInt("android:menu:expandedactionview");
            if (j1 > 0)
            {
                bundle = findItem(j1);
                if (bundle != null)
                {
                    ln.b(bundle);
                    return;
                }
            }
        }
    }

    public final void b(wj wj1)
    {
        Iterator iterator = x.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            wj wj2 = (wj)weakreference.get();
            if (wj2 == null || wj2 == wj1)
            {
                x.remove(weakreference);
            }
        } while (true);
    }

    public final void b(boolean flag)
    {
        if (!s)
        {
            if (flag)
            {
                p = true;
                r = true;
            }
            if (!x.isEmpty())
            {
                d();
                for (Iterator iterator = x.iterator(); iterator.hasNext();)
                {
                    WeakReference weakreference = (WeakReference)iterator.next();
                    wj wj1 = (wj)weakreference.get();
                    if (wj1 == null)
                    {
                        x.remove(weakreference);
                    } else
                    {
                        wj1.b(flag);
                    }
                }

                e();
            }
            return;
        } else
        {
            t = true;
            return;
        }
    }

    boolean b()
    {
        return m;
    }

    public boolean b(vy vy1)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!x.isEmpty())
        {
            if (i != vy1)
            {
                flag2 = flag;
            } else
            {
                d();
                Iterator iterator = x.iterator();
                boolean flag1 = false;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    wj wj1 = (wj)weakreference.get();
                    if (wj1 == null)
                    {
                        x.remove(weakreference);
                        continue;
                    }
                    flag2 = wj1.c(vy1);
                    flag1 = flag2;
                    if (flag2)
                    {
                        break;
                    }
                    flag1 = flag2;
                } while (true);
                e();
                flag2 = flag1;
                if (flag1)
                {
                    i = null;
                    return flag1;
                }
            }
        }
        return flag2;
    }

    public boolean c()
    {
        return n;
    }

    public void clear()
    {
        if (i != null)
        {
            b(i);
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
        if (!s)
        {
            s = true;
            t = false;
        }
    }

    public final void e()
    {
        s = false;
        if (t)
        {
            t = false;
            b(true);
        }
    }

    final void f()
    {
        p = true;
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
        Object obj = (vy)c.get(j1);
        if (((vy) (obj)).getItemId() != i1) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        MenuItem menuitem;
        if (!((vy) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        menuitem = ((vy) (obj)).getSubMenu().findItem(i1);
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
        r = true;
        b(true);
    }

    public MenuItem getItem(int i1)
    {
        return (MenuItem)c.get(i1);
    }

    public final ArrayList h()
    {
        if (!p)
        {
            return o;
        }
        o.clear();
        int j1 = c.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            vy vy1 = (vy)c.get(i1);
            if (vy1.isVisible())
            {
                o.add(vy1);
            }
        }

        p = false;
        r = true;
        return o;
    }

    public boolean hasVisibleItems()
    {
        if (j)
        {
            return true;
        }
        int j1 = size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((vy)c.get(i1)).isVisible())
            {
                return true;
            }
        }

        return false;
    }

    public final void i()
    {
        ArrayList arraylist = h();
        if (!r)
        {
            return;
        }
        Iterator iterator = x.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            wj wj1 = (wj)weakreference.get();
            if (wj1 == null)
            {
                x.remove(weakreference);
            } else
            {
                flag = wj1.a() | flag;
            }
        }
        if (flag)
        {
            d.clear();
            q.clear();
            int j1 = arraylist.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                vy vy1 = (vy)arraylist.get(i1);
                if (vy1.f())
                {
                    d.add(vy1);
                } else
                {
                    q.add(vy1);
                }
                i1++;
            }
        } else
        {
            d.clear();
            q.clear();
            q.addAll(h());
        }
        r = false;
    }

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    public final ArrayList j()
    {
        i();
        return q;
    }

    public vu k()
    {
        return this;
    }

    public boolean performIdentifierAction(int i1, int j1)
    {
        return a(findItem(i1), ((wj) (null)), j1);
    }

    public boolean performShortcut(int i1, KeyEvent keyevent, int j1)
    {
        keyevent = a(i1, keyevent);
        boolean flag = false;
        if (keyevent != null)
        {
            flag = a(keyevent, ((wj) (null)), j1);
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
        if (((vy)c.get(j1)).getGroupId() != i1) goto _L4; else goto _L3
_L3:
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        int i2 = c.size();
        for (int l1 = 0; l1 < i2 - j1 && ((vy)c.get(j1)).getGroupId() == i1; l1++)
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
        if (((vy)c.get(j1)).getItemId() != i1) goto _L2; else goto _L1
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
            vy vy1 = (vy)c.get(j1);
            if (vy1.getGroupId() == i1)
            {
                vy1.a(flag1);
                vy1.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int k1 = c.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            vy vy1 = (vy)c.get(j1);
            if (vy1.getGroupId() == i1)
            {
                vy1.setEnabled(flag);
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
            vy vy1 = (vy)c.get(j1);
            if (vy1.getGroupId() == i1 && vy1.c(flag))
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
        m = flag;
        b(false);
    }

    public int size()
    {
        return c.size();
    }

}
