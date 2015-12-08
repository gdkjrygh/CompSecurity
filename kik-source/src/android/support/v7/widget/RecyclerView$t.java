// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class a
{

    public final View a;
    int b;
    int c;
    long d;
    int e;
    int f;
    a g;
    a h;
    RecyclerView i;
    private int j;
    private int k;
    private a l;

    static boolean a(a a1)
    {
        return (a1.j & 0x10) == 0 && ViewCompat.hasTransientState(a1.a);
    }

    static a b(a a1)
    {
        a1.l = null;
        return null;
    }

    static boolean c(l l1)
    {
        return (l1.j & 0x10) != 0;
    }

    static int d(j j1)
    {
        return j1.j;
    }

    final void a()
    {
        c = -1;
        f = -1;
    }

    final void a(int i1, int j1)
    {
        j = j & ~j1 | i1 & j1;
    }

    final void a(int i1, boolean flag)
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
            ((youtParams)a.getLayoutParams()).c = true;
        }
    }

    final void a(youtParams.c c1)
    {
        l = c1;
    }

    public final void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = k - 1;
        } else
        {
            i1 = k + 1;
        }
        k = i1;
        if (k < 0)
        {
            k = 0;
            Log.e("View", (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this).toString());
        } else
        {
            if (!flag && k == 1)
            {
                j = j | 0x10;
                return;
            }
            if (flag && k == 0)
            {
                j = j & 0xffffffef;
                return;
            }
        }
    }

    final boolean a(int i1)
    {
        return (j & i1) != 0;
    }

    final void b(int i1)
    {
        j = j | i1;
    }

    final boolean b()
    {
        return (j & 0x80) != 0;
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

    final boolean d()
    {
        return l != null;
    }

    final void e()
    {
        l.b(this);
    }

    final boolean f()
    {
        return (j & 0x20) != 0;
    }

    final void g()
    {
        j = j & 0xffffffdf;
    }

    final void h()
    {
        j = j & 0xfffffeff;
    }

    final boolean i()
    {
        return (j & 4) != 0;
    }

    final boolean j()
    {
        return (j & 2) != 0;
    }

    final boolean k()
    {
        return (j & 0x40) != 0;
    }

    final boolean l()
    {
        return (j & 1) != 0;
    }

    final boolean m()
    {
        return (j & 8) != 0;
    }

    final boolean n()
    {
        return (j & 0x100) != 0;
    }

    final void o()
    {
        j = 0;
        b = -1;
        c = -1;
        d = -1L;
        f = -1;
        k = 0;
        g = null;
        h = null;
    }

    public final boolean p()
    {
        return (j & 0x10) == 0 && !ViewCompat.hasTransientState(a);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(b).append(" id=").append(d).append(", oldPos=").append(c).append(", pLpos:").append(f).toString());
        if (d())
        {
            stringbuilder.append(" scrap");
        }
        if (i())
        {
            stringbuilder.append(" invalid");
        }
        if (!l())
        {
            stringbuilder.append(" unbound");
        }
        if (j())
        {
            stringbuilder.append(" update");
        }
        if (m())
        {
            stringbuilder.append(" removed");
        }
        if (b())
        {
            stringbuilder.append(" ignored");
        }
        if (k())
        {
            stringbuilder.append(" changed");
        }
        if (n())
        {
            stringbuilder.append(" tmpDetached");
        }
        if (!p())
        {
            stringbuilder.append((new StringBuilder(" not recyclable(")).append(k).append(")").toString());
        }
        boolean flag;
        if ((j & 0x200) != 0 || i())
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

    public youtParams(View view)
    {
        b = -1;
        c = -1;
        d = -1L;
        e = -1;
        f = -1;
        g = null;
        h = null;
        k = 0;
        l = null;
        if (view == null)
        {
            throw new IllegalArgumentException("itemView may not be null");
        } else
        {
            a = view;
            return;
        }
    }
}
