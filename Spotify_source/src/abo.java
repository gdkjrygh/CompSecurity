// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class abo
{

    private static final List k;
    public final View a;
    public int b;
    public int c;
    public long d;
    int e;
    int f;
    public abo g;
    public abo h;
    RecyclerView i;
    private int j;
    private List l;
    private List m;
    private int n;
    private abh o;
    private boolean p;
    private int q;

    public abo(View view)
    {
        b = -1;
        c = -1;
        d = -1L;
        e = -1;
        f = -1;
        g = null;
        h = null;
        l = null;
        m = null;
        n = 0;
        o = null;
        p = false;
        q = 0;
        if (view == null)
        {
            throw new IllegalArgumentException("itemView may not be null");
        } else
        {
            a = view;
            return;
        }
    }

    public static void a(abo abo1)
    {
        abo1.q = km.e(abo1.a);
        km.c(abo1.a, 4);
    }

    public static void b(abo abo1)
    {
        km.c(abo1.a, abo1.q);
        abo1.q = 0;
    }

    static boolean c(abo abo1)
    {
        return (abo1.j & 0x10) == 0 && km.c(abo1.a);
    }

    static abh d(abo abo1)
    {
        abo1.o = null;
        return null;
    }

    static boolean e(abo abo1)
    {
        abo1.p = false;
        return false;
    }

    static boolean f(abo abo1)
    {
        return abo1.p;
    }

    static boolean g(abo abo1)
    {
        return (abo1.j & 0x10) != 0;
    }

    static int h(abo abo1)
    {
        return abo1.j;
    }

    public final boolean E_()
    {
        return (j & 0x80) != 0;
    }

    public final void a()
    {
        c = -1;
        f = -1;
    }

    public final void a(int i1, int j1)
    {
        j = j & ~j1 | i1 & j1;
    }

    public final void a(int i1, boolean flag)
    {
        if (c == -1)
        {
            c = b;
        }
        if (f == -1)
        {
            f = b;
        }
        if (flag)
        {
            f = f + i1;
        }
        b = b + i1;
        if (a.getLayoutParams() != null)
        {
            ((android.support.v7.widget.RecyclerView.LayoutParams)a.getLayoutParams()).e = true;
        }
    }

    final void a(abh abh1, boolean flag)
    {
        o = abh1;
        p = flag;
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            b(1024);
        } else
        if ((j & 0x400) == 0)
        {
            if (l == null)
            {
                l = new ArrayList();
                m = Collections.unmodifiableList(l);
            }
            l.add(obj);
            return;
        }
    }

    public final void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = n - 1;
        } else
        {
            i1 = n + 1;
        }
        n = i1;
        if (n < 0)
        {
            n = 0;
            Log.e("View", (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this).toString());
        } else
        {
            if (!flag && n == 1)
            {
                j = j | 0x10;
                return;
            }
            if (flag && n == 0)
            {
                j = j & 0xffffffef;
                return;
            }
        }
    }

    public final boolean a(int i1)
    {
        return (j & i1) != 0;
    }

    public final void b(int i1)
    {
        j = j | i1;
    }

    public final int c()
    {
        if (f == -1)
        {
            return b;
        } else
        {
            return f;
        }
    }

    public final int d()
    {
        if (i == null)
        {
            return -1;
        } else
        {
            return RecyclerView.b(i, this);
        }
    }

    public final int e()
    {
        return e;
    }

    final boolean f()
    {
        return o != null;
    }

    final void g()
    {
        o.b(this);
    }

    final boolean h()
    {
        return (j & 0x20) != 0;
    }

    final void i()
    {
        j = j & 0xffffffdf;
    }

    public final void j()
    {
        j = j & 0xfffffeff;
    }

    public final boolean k()
    {
        return (j & 4) != 0;
    }

    final boolean l()
    {
        return (j & 2) != 0;
    }

    public final boolean m()
    {
        return (j & 1) != 0;
    }

    public final boolean n()
    {
        return (j & 8) != 0;
    }

    public final boolean o()
    {
        return (j & 0x100) != 0;
    }

    final void p()
    {
        if (l != null)
        {
            l.clear();
        }
        j = j & 0xfffffbff;
    }

    public final List q()
    {
        if ((j & 0x400) == 0)
        {
            if (l == null || l.size() == 0)
            {
                return k;
            } else
            {
                return m;
            }
        } else
        {
            return k;
        }
    }

    final void r()
    {
        j = 0;
        b = -1;
        c = -1;
        d = -1L;
        f = -1;
        n = 0;
        g = null;
        h = null;
        p();
        q = 0;
    }

    public final boolean s()
    {
        return (j & 0x10) == 0 && !km.c(a);
    }

    public final boolean t()
    {
        return (j & 2) != 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(b).append(" id=").append(d).append(", oldPos=").append(c).append(", pLpos:").append(f).toString());
        boolean flag;
        if (f())
        {
            StringBuilder stringbuilder1 = stringbuilder.append(" scrap ");
            String s1;
            if (p)
            {
                s1 = "[changeScrap]";
            } else
            {
                s1 = "[attachedScrap]";
            }
            stringbuilder1.append(s1);
        }
        if (k())
        {
            stringbuilder.append(" invalid");
        }
        if (!m())
        {
            stringbuilder.append(" unbound");
        }
        if (l())
        {
            stringbuilder.append(" update");
        }
        if (n())
        {
            stringbuilder.append(" removed");
        }
        if (E_())
        {
            stringbuilder.append(" ignored");
        }
        if (o())
        {
            stringbuilder.append(" tmpDetached");
        }
        if (!s())
        {
            stringbuilder.append((new StringBuilder(" not recyclable(")).append(n).append(")").toString());
        }
        if ((j & 0x200) != 0 || k())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append(" undefined adapter position");
        }
        if (a.getParent() == null)
        {
            stringbuilder.append(" no parent");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    static 
    {
        k = Collections.EMPTY_LIST;
    }
}
