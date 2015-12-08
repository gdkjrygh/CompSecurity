// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aY;
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
    int i;
    a j;
    RecyclerView k;
    private int l;

    static boolean a(a a1)
    {
        return (a1.i & 0x10) != 0;
    }

    final boolean L_()
    {
        return (i & 0x80) != 0;
    }

    final void a()
    {
        c = -1;
        f = -1;
    }

    final void a(int i1, int j1)
    {
        i = i & ~j1 | i1 & j1;
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
            ((youtParams)a.getLayoutParams()).e = true;
        }
    }

    public final void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = l - 1;
        } else
        {
            i1 = l + 1;
        }
        l = i1;
        if (l < 0)
        {
            l = 0;
            (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this);
        } else
        {
            if (!flag && l == 1)
            {
                i = i | 0x10;
                return;
            }
            if (flag && l == 0)
            {
                i = i & 0xffffffef;
                return;
            }
        }
    }

    final boolean a(int i1)
    {
        return (i & i1) != 0;
    }

    final void b(int i1)
    {
        i = i | i1;
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
        if (k == null)
        {
            return -1;
        } else
        {
            return RecyclerView.a(k, this);
        }
    }

    final boolean f()
    {
        return j != null;
    }

    final void g()
    {
        j.b(this);
    }

    final boolean h()
    {
        return (i & 0x20) != 0;
    }

    final void i()
    {
        i = i & 0xffffffdf;
    }

    final void j()
    {
        i = i & 0xfffffeff;
    }

    final boolean k()
    {
        return (i & 4) != 0;
    }

    final boolean l()
    {
        return (i & 2) != 0;
    }

    final boolean m()
    {
        return (i & 0x40) != 0;
    }

    final boolean n()
    {
        return (i & 1) != 0;
    }

    final boolean o()
    {
        return (i & 8) != 0;
    }

    final boolean p()
    {
        return (i & 0x100) != 0;
    }

    final void q()
    {
        i = 0;
        b = -1;
        c = -1;
        d = -1L;
        f = -1;
        l = 0;
        g = null;
        h = null;
    }

    public final boolean r()
    {
        return (i & 0x10) == 0 && !aY.c(a);
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
        if (L_())
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
        if (!r())
        {
            stringbuilder.append((new StringBuilder(" not recyclable(")).append(l).append(")").toString());
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

    public youtParams(View view)
    {
        b = -1;
        c = -1;
        d = -1L;
        e = -1;
        f = -1;
        g = null;
        h = null;
        l = 0;
        j = null;
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
