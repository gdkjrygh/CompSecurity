// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class afn
{

    static final List j;
    public final View a;
    public int b;
    public int c;
    public long d;
    public int e;
    int f;
    public afn g;
    public afn h;
    int i;
    List k;
    List l;
    afe m;
    RecyclerView n;
    private int o;
    private int p;

    public afn(View view)
    {
        b = -1;
        c = -1;
        d = -1L;
        e = -1;
        f = -1;
        g = null;
        h = null;
        k = null;
        l = null;
        o = 0;
        m = null;
        p = 0;
        if (view == null)
        {
            throw new IllegalArgumentException("itemView may not be null");
        } else
        {
            a = view;
            return;
        }
    }

    static afe a(afn afn1, afe afe1)
    {
        afn1.m = null;
        return null;
    }

    static void a(afn afn1)
    {
        afn1.p = mk.e(afn1.a);
        mk.c(afn1.a, 4);
    }

    static void b(afn afn1)
    {
        mk.c(afn1.a, afn1.p);
        afn1.p = 0;
    }

    static boolean c(afn afn1)
    {
        return (afn1.i & 0x10) == 0 && mk.c(afn1.a);
    }

    static boolean d(afn afn1)
    {
        return (afn1.i & 0x10) != 0;
    }

    static int e(afn afn1)
    {
        return afn1.i;
    }

    public final void a()
    {
        c = -1;
        f = -1;
    }

    final void a(int i1, int j1)
    {
        i = i & ~j1 | i1 & j1;
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
            ((aez)a.getLayoutParams()).e = true;
        }
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            b(1024);
        } else
        if ((i & 0x400) == 0)
        {
            if (k == null)
            {
                k = new ArrayList();
                l = Collections.unmodifiableList(k);
            }
            k.add(obj);
            return;
        }
    }

    public final void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = o - 1;
        } else
        {
            i1 = o + 1;
        }
        o = i1;
        if (o < 0)
        {
            o = 0;
            Log.e("View", (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this).toString());
        } else
        {
            if (!flag && o == 1)
            {
                i = i | 0x10;
                return;
            }
            if (flag && o == 0)
            {
                i = i & 0xffffffef;
                return;
            }
        }
    }

    public final boolean a(int i1)
    {
        return (i & i1) != 0;
    }

    public final void b(int i1)
    {
        i = i | i1;
    }

    public final boolean b()
    {
        return (i & 0x80) != 0;
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
        if (f == -1)
        {
            return b;
        } else
        {
            return f;
        }
    }

    public final int e()
    {
        if (n == null)
        {
            return -1;
        } else
        {
            return RecyclerView.a(n, this);
        }
    }

    final boolean f()
    {
        return m != null;
    }

    final void g()
    {
        m.b(this);
    }

    final boolean h()
    {
        return (i & 0x20) != 0;
    }

    final void i()
    {
        i = i & 0xffffffdf;
    }

    public final void j()
    {
        i = i & 0xfffffeff;
    }

    public final boolean k()
    {
        return (i & 4) != 0;
    }

    final boolean l()
    {
        return (i & 2) != 0;
    }

    public final boolean m()
    {
        return (i & 0x40) != 0;
    }

    public final boolean n()
    {
        return (i & 1) != 0;
    }

    public final boolean o()
    {
        return (i & 8) != 0;
    }

    public final boolean p()
    {
        return (i & 0x100) != 0;
    }

    final void q()
    {
        if (k != null)
        {
            k.clear();
        }
        i = i & 0xfffffbff;
    }

    final void r()
    {
        i = 0;
        b = -1;
        c = -1;
        d = -1L;
        f = -1;
        o = 0;
        g = null;
        h = null;
        q();
        p = 0;
    }

    public final boolean s()
    {
        return (i & 0x10) == 0 && !mk.c(a);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(b).append(" id=").append(d).append(", oldPos=").append(c).append(", pLpos:").append(f).toString());
        if (f())
        {
            stringbuilder.append(" scrap");
        }
        if (k())
        {
            stringbuilder.append(" invalid");
        }
        if (!n())
        {
            stringbuilder.append(" unbound");
        }
        if (l())
        {
            stringbuilder.append(" update");
        }
        if (o())
        {
            stringbuilder.append(" removed");
        }
        if (b())
        {
            stringbuilder.append(" ignored");
        }
        if (m())
        {
            stringbuilder.append(" changed");
        }
        if (p())
        {
            stringbuilder.append(" tmpDetached");
        }
        if (!s())
        {
            stringbuilder.append((new StringBuilder(" not recyclable(")).append(o).append(")").toString());
        }
        boolean flag;
        if ((i & 0x200) != 0 || k())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append("undefined adapter position");
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
        j = Collections.EMPTY_LIST;
    }
}
