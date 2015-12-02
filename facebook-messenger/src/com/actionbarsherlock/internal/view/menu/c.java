// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.actionbarsherlock.a.b;
import com.actionbarsherlock.a.d;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            a, l, k

public final class c
    implements b
{

    private static String r;
    private static String s;
    private static String t;
    private static String u;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private char i;
    private Drawable j;
    private int k;
    private a l;
    private l m;
    private Runnable n;
    private com.actionbarsherlock.a.c o;
    private int p;
    private android.view.ContextMenu.ContextMenuInfo q;

    c(a a1, int i1, int j1, int k1, int l1, CharSequence charsequence)
    {
        k = 0;
        p = 16;
        l = a1;
        a = j1;
        b = i1;
        c = k1;
        d = l1;
        e = charsequence;
    }

    public b a(char c1)
    {
        if (i == c1)
        {
            return this;
        } else
        {
            i = Character.toLowerCase(c1);
            l.c(false);
            return this;
        }
    }

    public b a(char c1, char c2)
    {
        h = c1;
        i = Character.toLowerCase(c2);
        l.c(false);
        return this;
    }

    public b a(int i1)
    {
        return a(((CharSequence) (l.g().getString(i1))));
    }

    public b a(Intent intent)
    {
        g = intent;
        return this;
    }

    public b a(Drawable drawable)
    {
        k = 0;
        j = drawable;
        l.c(false);
        return this;
    }

    public b a(com.actionbarsherlock.a.c c1)
    {
        o = c1;
        return this;
    }

    public b a(CharSequence charsequence)
    {
        e = charsequence;
        l.c(false);
        if (m != null)
        {
            m.d(charsequence);
        }
        return this;
    }

    public b a(boolean flag)
    {
        if (flag)
        {
            p = p | 0x10;
        } else
        {
            p = p & 0xffffffef;
        }
        l.c(false);
        return this;
    }

    CharSequence a(k k1)
    {
        if (k1 != null && k1.a())
        {
            return p();
        } else
        {
            return o();
        }
    }

    void a(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        q = contextmenuinfo;
    }

    void a(l l1)
    {
        m = l1;
        l1.d(o());
    }

    public boolean a()
    {
        while (o != null && o.a(this) || l.a(l.n(), this)) 
        {
            return true;
        }
        if (n != null)
        {
            n.run();
            return true;
        }
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        l.g().startActivity(g);
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", activitynotfoundexception);
        return false;
    }

    public b b(char c1)
    {
        if (h == c1)
        {
            return this;
        } else
        {
            h = c1;
            l.c(false);
            return this;
        }
    }

    public b b(int i1)
    {
        j = null;
        k = i1;
        l.c(false);
        return this;
    }

    public b b(CharSequence charsequence)
    {
        f = charsequence;
        if (charsequence == null)
        {
            charsequence = e;
        }
        l.c(false);
        return this;
    }

    public b b(boolean flag)
    {
        int i1 = p;
        int j1 = p;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p = flag1 | j1 & -2;
        if (i1 != p)
        {
            l.c(false);
        }
        return this;
    }

    public boolean b()
    {
        return (p & 0x10) != 0;
    }

    public int c()
    {
        return b;
    }

    public void c(boolean flag)
    {
        int i1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        p = byte0 | i1 & -5;
    }

    public int d()
    {
        return a;
    }

    public b d(boolean flag)
    {
        if ((p & 4) != 0)
        {
            l.a(this);
            return this;
        } else
        {
            e(flag);
            return this;
        }
    }

    public int e()
    {
        return c;
    }

    void e(boolean flag)
    {
        int i1 = p;
        int j1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        p = byte0 | j1 & -3;
        if (i1 != p)
        {
            l.c(false);
        }
    }

    public int f()
    {
        return d;
    }

    boolean f(boolean flag)
    {
        boolean flag1 = false;
        int i1 = p;
        int j1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        p = byte0 | j1 & -9;
        flag = flag1;
        if (i1 != p)
        {
            flag = true;
        }
        return flag;
    }

    public Intent g()
    {
        return g;
    }

    public b g(boolean flag)
    {
        if (f(flag))
        {
            l.a(this);
        }
        return this;
    }

    public char h()
    {
        return i;
    }

    public char i()
    {
        return h;
    }

    char j()
    {
        if (l.d())
        {
            return i;
        } else
        {
            return h;
        }
    }

    String k()
    {
        char c1;
        StringBuilder stringbuilder;
        c1 = j();
        if (c1 == 0)
        {
            return "";
        }
        stringbuilder = new StringBuilder(r);
        c1;
        JVM INSTR lookupswitch 3: default 60
    //                   8: 82
    //                   10: 71
    //                   32: 93;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append(c1);
_L6:
        return stringbuilder.toString();
_L3:
        stringbuilder.append(s);
        continue; /* Loop/switch isn't completed */
_L2:
        stringbuilder.append(t);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(u);
        if (true) goto _L6; else goto _L5
_L5:
    }

    boolean l()
    {
        return l.e() && j() != 0;
    }

    public d m()
    {
        return m;
    }

    public boolean n()
    {
        return m != null;
    }

    public CharSequence o()
    {
        return e;
    }

    public CharSequence p()
    {
        if (f != null)
        {
            return f;
        } else
        {
            return e;
        }
    }

    public Drawable q()
    {
        if (j != null)
        {
            return j;
        }
        if (k != 0)
        {
            return l.f().getDrawable(k);
        } else
        {
            return null;
        }
    }

    public boolean r()
    {
        return (p & 1) == 1;
    }

    public boolean s()
    {
        return (p & 4) != 0;
    }

    public boolean t()
    {
        return (p & 2) == 2;
    }

    public String toString()
    {
        return e.toString();
    }

    public boolean u()
    {
        return (p & 8) == 0;
    }

    public android.view.ContextMenu.ContextMenuInfo v()
    {
        return q;
    }

    public boolean w()
    {
        return l.o();
    }
}
