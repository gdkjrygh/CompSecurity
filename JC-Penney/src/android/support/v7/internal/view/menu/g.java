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
import android.support.v4.c.a.a;
import android.support.v4.view.n;
import android.support.v7.b.c;
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
//            j, u, h, aa

public class g
    implements a
{

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
    private h i;
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
    private j x;
    private boolean y;

    public g(Context context)
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
            if (((j)arraylist.get(j1)).c() <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private j a(int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
    {
        return new j(this, i1, j1, k1, l1, charsequence, i2);
    }

    private void a(int i1, CharSequence charsequence, int j1, Drawable drawable, View view)
    {
        Resources resources = c();
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
        b = android.support.v4.a.a.a(d(), j1);
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

    private boolean a(aa aa1, u u1)
    {
        boolean flag = false;
        if (w.isEmpty())
        {
            return false;
        }
        if (u1 != null)
        {
            flag = u1.a(aa1);
        }
        u1 = w.iterator();
        do
        {
            if (!u1.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)u1.next();
            u u2 = (u)weakreference.get();
            if (u2 == null)
            {
                w.remove(weakreference);
            } else
            if (!flag)
            {
                flag = u2.a(aa1);
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
        f();
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            u u1 = (u)weakreference.get();
            if (u1 == null)
            {
                w.remove(weakreference);
            } else
            {
                u1.b(flag);
            }
        }

        g();
    }

    private void d(boolean flag)
    {
        boolean flag1 = true;
        if (flag && f.getConfiguration().keyboard != 1 && f.getBoolean(c.abc_config_showMenuShortcutsWhenKeyboardPresent))
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
            if (((j)j.get(j1)).getItemId() == i1)
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
            if (((j)j.get(k1)).getGroupId() == i1)
            {
                return k1;
            }
        }

        return -1;
    }

    protected g a(Drawable drawable)
    {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected g a(View view)
    {
        a(0, null, 0, null, view);
        return this;
    }

    protected g a(CharSequence charsequence)
    {
        a(0, charsequence, 0, null, null);
        return this;
    }

    j a(int i1, KeyEvent keyevent)
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
        int k1;
        int l1;
        int i2;
        boolean flag;
        l1 = keyevent.getMetaState();
        keydata = new android.view.KeyCharacterMap.KeyData();
        keyevent.getKeyData(keydata);
        i2 = arraylist.size();
        if (i2 == 1)
        {
            return (j)arraylist.get(0);
        }
        flag = a();
        k1 = 0;
_L9:
        if (k1 >= i2) goto _L4; else goto _L3
_L3:
        j j1 = (j)arraylist.get(k1);
        char c1;
        if (flag)
        {
            c1 = j1.getAlphabeticShortcut();
        } else
        {
            c1 = j1.getNumericShortcut();
        }
        if (c1 != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = j1;
        if ((l1 & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c1 != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = j1;
        if ((l1 & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c1 != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = j1;
        if (i1 == 67) goto _L6; else goto _L8
_L8:
        k1++;
          goto _L9
_L4:
        return null;
    }

    protected MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = c(k1);
        charsequence = a(i1, j1, k1, l1, charsequence, p);
        if (q != null)
        {
            charsequence.a(q);
        }
        j.add(a(j, l1), charsequence);
        b(true);
        return charsequence;
    }

    public void a(h h1)
    {
        i = h1;
    }

    void a(j j1)
    {
        l = true;
        b(true);
    }

    public void a(u u1, Context context)
    {
        w.add(new WeakReference(u1));
        u1.a(context, this);
        o = true;
    }

    void a(MenuItem menuitem)
    {
        int k1 = menuitem.getGroupId();
        int l1 = j.size();
        int i1 = 0;
        do
        {
            if (i1 >= l1)
            {
                break;
            }
            j j1 = (j)j.get(i1);
            if (j1.getGroupId() == k1 && j1.g() && j1.isCheckable())
            {
                boolean flag;
                if (j1 == menuitem)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j1.b(flag);
            }
            i1++;
        } while (true);
    }

    void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = a();
        int l1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i1 == 67)
        {
            int i2 = j.size();
            int k1 = 0;
            while (k1 < i2) 
            {
                j j1 = (j)j.get(k1);
                if (j1.hasSubMenu())
                {
                    ((g)j1.getSubMenu()).a(list, i1, keyevent);
                }
                char c1;
                if (flag)
                {
                    c1 = j1.getAlphabeticShortcut();
                } else
                {
                    c1 = j1.getNumericShortcut();
                }
                if ((l1 & 5) == 0 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && j1.isEnabled())
                {
                    list.add(j1);
                }
                k1++;
            }
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
            u u1 = (u)weakreference.get();
            if (u1 == null)
            {
                w.remove(weakreference);
            } else
            {
                u1.a(this, flag);
            }
        }

        u = false;
    }

    boolean a()
    {
        return g;
    }

    boolean a(g g1, MenuItem menuitem)
    {
        return i != null && i.a(g1, menuitem);
    }

    public boolean a(MenuItem menuitem, int i1)
    {
        return a(menuitem, ((u) (null)), i1);
    }

    public boolean a(MenuItem menuitem, u u1, int i1)
    {
        Object obj;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        obj = (j)menuitem;
        flag1 = flag2;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((j) (obj)).isEnabled()) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
_L2:
        return flag1;
_L4:
        boolean flag;
        flag1 = ((j) (obj)).b();
        menuitem = ((j) (obj)).a();
        boolean flag3;
        if (menuitem != null && menuitem.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!((j) (obj)).n())
        {
            break; /* Loop/switch isn't completed */
        }
        flag3 = ((j) (obj)).expandActionView() | flag1;
        flag1 = flag3;
        if (flag3)
        {
            a(true);
            return flag3;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (((j) (obj)).hasSubMenu() || flag)
        {
            a(false);
            if (!((j) (obj)).hasSubMenu())
            {
                ((j) (obj)).a(new aa(d(), this, ((j) (obj))));
            }
            obj = (aa)((j) (obj)).getSubMenu();
            if (flag)
            {
                menuitem.a(((SubMenu) (obj)));
            }
            boolean flag4 = a(((aa) (obj)), u1) | flag1;
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
        charsequence = (j)a(i1, j1, k1, charsequence);
        aa aa1 = new aa(e, this, charsequence);
        charsequence.a(aa1);
        return aa1;
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return addSubMenu(0, 0, 0, charsequence);
    }

    public int b(int i1)
    {
        return a(i1, 0);
    }

    void b(j j1)
    {
        o = true;
        b(true);
    }

    public void b(boolean flag)
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

    public boolean b()
    {
        return h;
    }

    Resources c()
    {
        return f;
    }

    public boolean c(j j1)
    {
        boolean flag1 = false;
        if (!w.isEmpty())
        {
            f();
            Iterator iterator = w.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WeakReference weakreference = (WeakReference)iterator.next();
                u u1 = (u)weakreference.get();
                if (u1 == null)
                {
                    w.remove(weakreference);
                    continue;
                }
                flag1 = u1.a(this, j1);
                flag = flag1;
                if (!flag1)
                {
                    continue;
                }
                flag = flag1;
                break;
            } while (true);
            g();
            flag1 = flag;
            if (flag)
            {
                x = j1;
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

    public Context d()
    {
        return e;
    }

    public boolean d(j j1)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!w.isEmpty())
        {
            if (x != j1)
            {
                flag2 = flag;
            } else
            {
                f();
                Iterator iterator = w.iterator();
                boolean flag1 = false;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    u u1 = (u)weakreference.get();
                    if (u1 == null)
                    {
                        w.remove(weakreference);
                        continue;
                    }
                    flag2 = u1.b(this, j1);
                    flag1 = flag2;
                    if (!flag2)
                    {
                        continue;
                    }
                    flag1 = flag2;
                    break;
                } while (true);
                g();
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

    public void e()
    {
        if (i != null)
        {
            i.a(this);
        }
    }

    public void f()
    {
        if (!r)
        {
            r = true;
            s = false;
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
        Object obj = (j)j.get(j1);
        if (((j) (obj)).getItemId() != i1) goto _L4; else goto _L3
_L3:
        return ((MenuItem) (obj));
_L4:
        MenuItem menuitem;
        if (!((j) (obj)).hasSubMenu())
        {
            continue; /* Loop/switch isn't completed */
        }
        menuitem = ((j) (obj)).getSubMenu().findItem(i1);
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
        r = false;
        if (s)
        {
            s = false;
            b(true);
        }
    }

    public MenuItem getItem(int i1)
    {
        return (MenuItem)j.get(i1);
    }

    public ArrayList h()
    {
        if (!l)
        {
            return k;
        }
        k.clear();
        int k1 = j.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            j j1 = (j)j.get(i1);
            if (j1.isVisible())
            {
                k.add(j1);
            }
        }

        l = false;
        o = true;
        return k;
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
            if (((j)j.get(i1)).isVisible())
            {
                return true;
            }
        }

        return false;
    }

    public void i()
    {
        ArrayList arraylist = h();
        if (!o)
        {
            return;
        }
        Iterator iterator = w.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            u u1 = (u)weakreference.get();
            if (u1 == null)
            {
                w.remove(weakreference);
            } else
            {
                flag = u1.b() | flag;
            }
        }
        if (flag)
        {
            m.clear();
            n.clear();
            int k1 = arraylist.size();
            int i1 = 0;
            while (i1 < k1) 
            {
                j j1 = (j)arraylist.get(i1);
                if (j1.j())
                {
                    m.add(j1);
                } else
                {
                    n.add(j1);
                }
                i1++;
            }
        } else
        {
            m.clear();
            n.clear();
            n.addAll(h());
        }
        o = false;
    }

    public boolean isShortcutKey(int i1, KeyEvent keyevent)
    {
        return a(i1, keyevent) != null;
    }

    public ArrayList j()
    {
        i();
        return m;
    }

    public ArrayList k()
    {
        i();
        return n;
    }

    public g l()
    {
        return this;
    }

    boolean m()
    {
        return t;
    }

    public j n()
    {
        return x;
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

    public void removeGroup(int i1)
    {
        int k1 = b(i1);
        if (k1 >= 0)
        {
            int l1 = j.size();
            for (int j1 = 0; j1 < l1 - k1 && ((j)j.get(k1)).getGroupId() == i1; j1++)
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
        int l1 = j.size();
        for (int k1 = 0; k1 < l1; k1++)
        {
            j j1 = (j)j.get(k1);
            if (j1.getGroupId() == i1)
            {
                j1.a(flag1);
                j1.setCheckable(flag);
            }
        }

    }

    public void setGroupEnabled(int i1, boolean flag)
    {
        int l1 = j.size();
        for (int k1 = 0; k1 < l1; k1++)
        {
            j j1 = (j)j.get(k1);
            if (j1.getGroupId() == i1)
            {
                j1.setEnabled(flag);
            }
        }

    }

    public void setGroupVisible(int i1, boolean flag)
    {
        int l1 = j.size();
        int k1 = 0;
        boolean flag1 = false;
        for (; k1 < l1; k1++)
        {
            j j1 = (j)j.get(k1);
            if (j1.getGroupId() == i1 && j1.c(flag))
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
