// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

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
import android.view.KeyEvent;
import android.view.View;
import com.actionbarsherlock.a.b;
import com.actionbarsherlock.a.d;
import com.facebook.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            c, h, l, b

public class a
    implements com.actionbarsherlock.a.a
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
    private com.actionbarsherlock.internal.view.menu.b i;
    private ArrayList j;
    private ArrayList k;
    private boolean l;
    private ArrayList m;
    private android.view.ContextMenu.ContextMenuInfo n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private ArrayList s;
    private CopyOnWriteArrayList t;
    private c u;

    public a(Context context)
    {
        o = false;
        p = false;
        q = false;
        r = false;
        s = new ArrayList();
        t = new CopyOnWriteArrayList();
        e = context;
        f = context.getResources();
        j = new ArrayList();
        k = new ArrayList();
        l = true;
        m = new ArrayList();
        e(true);
    }

    private static int a(ArrayList arraylist, int i1)
    {
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            if (((c)arraylist.get(j1)).f() <= i1)
            {
                return j1 + 1;
            }
        }

        return 0;
    }

    private void a(int i1, CharSequence charsequence, int j1, Drawable drawable, View view)
    {
        Resources resources = f();
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

    private boolean a(l l1)
    {
        if (t.isEmpty())
        {
            return false;
        }
        Iterator iterator = t.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            h h1 = (h)weakreference.get();
            if (h1 == null)
            {
                t.remove(weakreference);
            } else
            if (!flag)
            {
                flag = h1.a(l1);
            }
        } while (true);
        return flag;
    }

    private b c(int i1, int j1, int k1, CharSequence charsequence)
    {
        int l1 = k(k1);
        charsequence = new c(this, i1, j1, k1, l1, charsequence);
        if (n != null)
        {
            charsequence.a(n);
        }
        j.add(a(j, l1), charsequence);
        c(true);
        return charsequence;
    }

    private void c(int i1, boolean flag)
    {
        if (i1 >= 0 && i1 < j.size())
        {
            j.remove(i1);
            if (flag)
            {
                c(true);
                return;
            }
        }
    }

    private void d(boolean flag)
    {
        if (t.isEmpty())
        {
            return;
        }
        i();
        for (Iterator iterator = t.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            h h1 = (h)weakreference.get();
            if (h1 == null)
            {
                t.remove(weakreference);
            } else
            {
                h1.b(flag);
            }
        }

        j();
    }

    private void e(boolean flag)
    {
        boolean flag1 = true;
        if (flag && f.getConfiguration().keyboard != 1 && f.getBoolean(e.abs__config_showMenuShortcutsWhenKeyboardPresent))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    private static int k(int i1)
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

    public int a(int i1, int j1)
    {
        int l1 = c();
        int k1 = j1;
        if (j1 < 0)
        {
            k1 = 0;
        }
        for (; k1 < l1; k1++)
        {
            if (((c)j.get(k1)).c() == i1)
            {
                return k1;
            }
        }

        return -1;
    }

    public int a(int i1, int j1, int k1, ComponentName componentname, Intent aintent[], Intent intent, int l1, 
            b ab[])
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
            d(i1);
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
            componentname = a(i1, j1, k1, resolveinfo.loadLabel(packagemanager)).a(resolveinfo.loadIcon(packagemanager)).a(componentname);
            if (ab != null && resolveinfo.specificIndex >= 0)
            {
                ab[resolveinfo.specificIndex] = componentname;
            }
            l1++;
        }
        return i2;
    }

    public b a(int i1)
    {
        return c(0, 0, 0, f.getString(i1));
    }

    public b a(int i1, int j1, int k1, int l1)
    {
        return c(i1, j1, k1, f.getString(l1));
    }

    public b a(int i1, int j1, int k1, CharSequence charsequence)
    {
        return c(i1, j1, k1, charsequence);
    }

    public b a(CharSequence charsequence)
    {
        return c(0, 0, 0, charsequence);
    }

    protected a a(Drawable drawable)
    {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected a a(View view)
    {
        a(0, null, 0, null, view);
        return this;
    }

    public void a()
    {
        if (u != null)
        {
            b(u);
        }
        j.clear();
        c(true);
    }

    public void a(int i1, boolean flag)
    {
        int k1 = j.size();
        int j1 = 0;
        boolean flag1 = false;
        for (; j1 < k1; j1++)
        {
            c c1 = (c)j.get(j1);
            if (c1.c() == i1 && c1.f(flag))
            {
                flag1 = true;
            }
        }

        if (flag1)
        {
            c(true);
        }
    }

    public void a(int i1, boolean flag, boolean flag1)
    {
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            c c1 = (c)j.get(j1);
            if (c1.c() == i1)
            {
                c1.c(flag1);
                c1.b(flag);
            }
        }

    }

    void a(b b1)
    {
        int j1 = b1.c();
        int k1 = j.size();
        int i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            c c1 = (c)j.get(i1);
            if (c1.c() == j1 && c1.s() && c1.r())
            {
                boolean flag;
                if (c1 == b1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                c1.e(flag);
            }
            i1++;
        } while (true);
    }

    public void a(com.actionbarsherlock.internal.view.menu.b b1)
    {
        i = b1;
    }

    void a(c c1)
    {
        l = true;
        c(true);
    }

    public void a(h h1)
    {
        t.add(new WeakReference(h1));
        h1.a(e, this);
    }

    void a(List list, int i1, KeyEvent keyevent)
    {
        boolean flag = d();
        int k1 = keyevent.getMetaState();
        android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
        if (keyevent.getKeyData(keydata) || i1 == 67)
        {
            int l1 = j.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                c c1 = (c)j.get(j1);
                if (c1.n())
                {
                    ((a)c1.m()).a(list, i1, keyevent);
                }
                char c2;
                if (flag)
                {
                    c2 = c1.h();
                } else
                {
                    c2 = c1.i();
                }
                if ((k1 & 5) == 0 && c2 != 0 && (c2 == keydata.meta[0] || c2 == keydata.meta[2] || flag && c2 == '\b' && i1 == 67) && c1.b())
                {
                    list.add(c1);
                }
                j1++;
            }
        }
    }

    public void a(boolean flag)
    {
        g = flag;
        c(false);
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        return b(i1, keyevent) != null;
    }

    public boolean a(int i1, KeyEvent keyevent, int j1)
    {
        keyevent = b(i1, keyevent);
        boolean flag = false;
        if (keyevent != null)
        {
            flag = a(((b) (keyevent)), j1);
        }
        if ((j1 & 2) != 0)
        {
            b(true);
        }
        return flag;
    }

    public boolean a(b b1, int i1)
    {
        c c1 = (c)b1;
        boolean flag;
        if (c1 == null || !c1.b())
        {
            flag = false;
        } else
        {
            flag = c1.a();
            if (b1.n())
            {
                b(false);
                boolean flag1 = a((l)b1.m()) | flag;
                flag = flag1;
                if (!flag1)
                {
                    b(true);
                    return flag1;
                }
            } else
            {
                if ((i1 & 1) == 0)
                {
                    b(true);
                }
                return flag;
            }
        }
        return flag;
    }

    boolean a(a a1, b b1)
    {
        return i != null && i.a(a1, b1);
    }

    public d b(int i1)
    {
        return b(0, 0, 0, ((CharSequence) (f.getString(i1))));
    }

    public d b(int i1, int j1, int k1, int l1)
    {
        return b(i1, j1, k1, ((CharSequence) (f.getString(l1))));
    }

    public d b(int i1, int j1, int k1, CharSequence charsequence)
    {
        charsequence = (c)c(i1, j1, k1, charsequence);
        l l1 = new l(e, this, charsequence);
        charsequence.a(l1);
        return l1;
    }

    public d b(CharSequence charsequence)
    {
        return b(0, 0, 0, charsequence);
    }

    c b(int i1, KeyEvent keyevent)
    {
        ArrayList arraylist;
        arraylist = s;
        arraylist.clear();
        a(arraylist, i1, keyevent);
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
            return (c)arraylist.get(0);
        }
        flag = d();
        j1 = 0;
_L9:
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        c c1 = (c)arraylist.get(j1);
        char c2;
        if (flag)
        {
            c2 = c1.h();
        } else
        {
            c2 = c1.i();
        }
        if (c2 != keydata.meta[0])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = c1;
        if ((k1 & 2) == 0) goto _L6; else goto _L5
_L5:
        if (c2 != keydata.meta[2])
        {
            break; /* Loop/switch isn't completed */
        }
        keyevent = c1;
        if ((k1 & 2) != 0) goto _L6; else goto _L7
_L7:
        if (!flag || c2 != '\b')
        {
            continue; /* Loop/switch isn't completed */
        }
        keyevent = c1;
        if (i1 == 67) goto _L6; else goto _L8
_L8:
        j1++;
          goto _L9
_L4:
        return null;
    }

    public void b(int i1, boolean flag)
    {
        int k1 = j.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            c c1 = (c)j.get(j1);
            if (c1.c() == i1)
            {
                c1.a(flag);
            }
        }

    }

    final void b(boolean flag)
    {
        if (r)
        {
            return;
        }
        r = true;
        for (Iterator iterator = t.iterator(); iterator.hasNext();)
        {
            WeakReference weakreference = (WeakReference)iterator.next();
            h h1 = (h)weakreference.get();
            if (h1 == null)
            {
                t.remove(weakreference);
            } else
            {
                h1.a(this, flag);
            }
        }

        r = false;
    }

    public boolean b()
    {
        int j1 = c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((c)j.get(i1)).u())
            {
                return true;
            }
        }

        return false;
    }

    public boolean b(int i1, int j1)
    {
        return a(e(i1), j1);
    }

    public boolean b(c c1)
    {
        boolean flag = false;
        boolean flag2 = flag;
        if (!t.isEmpty())
        {
            if (u != c1)
            {
                flag2 = flag;
            } else
            {
                i();
                Iterator iterator = t.iterator();
                boolean flag1 = false;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    h h1 = (h)weakreference.get();
                    if (h1 == null)
                    {
                        t.remove(weakreference);
                        continue;
                    }
                    flag2 = h1.a(this, c1);
                    flag1 = flag2;
                    if (!flag2)
                    {
                        continue;
                    }
                    flag1 = flag2;
                    break;
                } while (true);
                j();
                flag2 = flag1;
                if (flag1)
                {
                    u = null;
                    return flag1;
                }
            }
        }
        return flag2;
    }

    public int c()
    {
        return j.size();
    }

    protected a c(CharSequence charsequence)
    {
        a(0, charsequence, 0, null, null);
        return this;
    }

    public void c(int i1)
    {
        c(f(i1), true);
    }

    void c(boolean flag)
    {
        if (!o)
        {
            if (flag)
            {
                l = true;
            }
            d(flag);
            return;
        } else
        {
            p = true;
            return;
        }
    }

    public void d(int i1)
    {
        int k1 = g(i1);
        if (k1 >= 0)
        {
            int l1 = j.size();
            for (int j1 = 0; j1 < l1 - k1 && ((c)j.get(k1)).c() == i1; j1++)
            {
                c(k1, false);
            }

            c(true);
        }
    }

    boolean d()
    {
        return g;
    }

    public b e(int i1)
    {
        int j1;
        int k1;
        k1 = c();
        j1 = 0;
_L6:
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        Object obj = (c)j.get(j1);
        if (((c) (obj)).d() != i1) goto _L4; else goto _L3
_L3:
        return ((b) (obj));
_L4:
        b b1;
        if (!((c) (obj)).n())
        {
            continue; /* Loop/switch isn't completed */
        }
        b1 = ((c) (obj)).m().e(i1);
        obj = b1;
        if (b1 != null) goto _L3; else goto _L5
_L5:
        j1++;
          goto _L6
_L2:
        return null;
    }

    public boolean e()
    {
        return h;
    }

    public int f(int i1)
    {
        int k1 = c();
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (((c)j.get(j1)).d() == i1)
            {
                return j1;
            }
        }

        return -1;
    }

    Resources f()
    {
        return f;
    }

    public int g(int i1)
    {
        return a(i1, 0);
    }

    public Context g()
    {
        return e;
    }

    public b h(int i1)
    {
        return (b)j.get(i1);
    }

    public void h()
    {
        b(true);
    }

    protected a i(int i1)
    {
        a(i1, null, 0, null, null);
        return this;
    }

    public void i()
    {
        if (!o)
        {
            o = true;
            p = false;
        }
    }

    protected a j(int i1)
    {
        a(0, null, i1, null, null);
        return this;
    }

    public void j()
    {
        o = false;
        if (p)
        {
            p = false;
            c(true);
        }
    }

    ArrayList k()
    {
        if (!l)
        {
            return k;
        }
        k.clear();
        int j1 = j.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            c c1 = (c)j.get(i1);
            if (c1.u())
            {
                k.add(c1);
            }
        }

        l = false;
        return k;
    }

    ArrayList l()
    {
        return m;
    }

    public void m()
    {
        b = null;
        a = null;
        c = null;
        c(false);
    }

    public a n()
    {
        return this;
    }

    boolean o()
    {
        return q;
    }

    public c p()
    {
        return u;
    }

}
