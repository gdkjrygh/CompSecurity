// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            az, RecyclerView

public abstract class bi
{

    public final View a;
    int b;
    int c;
    long d;
    int e;
    int f;
    bi g;
    bi h;
    RecyclerView i;
    private int j;
    private int k;
    private az l;

    public bi(View view)
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

    static boolean a(bi bi1)
    {
        return (bi1.j & 0x10) == 0 && ViewCompat.hasTransientState(bi1.a);
    }

    static az b(bi bi1)
    {
        bi1.l = null;
        return null;
    }

    static boolean c(bi bi1)
    {
        return (bi1.j & 0x10) != 0;
    }

    static int d(bi bi1)
    {
        return bi1.j;
    }

    final void a()
    {
        c = -1;
        f = -1;
    }

    final void a(int i1)
    {
        j = j | i1;
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
            ((RecyclerView.LayoutParams)a.getLayoutParams()).c = true;
        }
    }

    final void a(az az1)
    {
        l = az1;
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

    public final int d()
    {
        return e;
    }

    final boolean e()
    {
        return l != null;
    }

    final void f()
    {
        l.b(this);
    }

    final boolean g()
    {
        return (j & 0x20) != 0;
    }

    final void h()
    {
        j = j & 0xffffffdf;
    }

    final void i()
    {
        j = j & 0xfffffeff;
    }

    final boolean j()
    {
        return (j & 4) != 0;
    }

    final boolean k()
    {
        return (j & 2) != 0;
    }

    final boolean l()
    {
        return (j & 0x40) != 0;
    }

    final boolean m()
    {
        return (j & 1) != 0;
    }

    final boolean n()
    {
        return (j & 8) != 0;
    }

    final boolean o()
    {
        return (j & 0x20c) != 0;
    }

    final boolean p()
    {
        return (j & 0x100) != 0;
    }

    final void q()
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

    public final boolean r()
    {
        return (j & 0x10) == 0 && !ViewCompat.hasTransientState(a);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(b).append(" id=").append(d).append(", oldPos=").append(c).append(", pLpos:").append(f).toString());
        if (e())
        {
            stringbuilder.append(" scrap");
        }
        if (j())
        {
            stringbuilder.append(" invalid");
        }
        if (!m())
        {
            stringbuilder.append(" unbound");
        }
        if (k())
        {
            stringbuilder.append(" update");
        }
        if (n())
        {
            stringbuilder.append(" removed");
        }
        if (b())
        {
            stringbuilder.append(" ignored");
        }
        if (l())
        {
            stringbuilder.append(" changed");
        }
        if (p())
        {
            stringbuilder.append(" tmpDetached");
        }
        if (!r())
        {
            stringbuilder.append((new StringBuilder(" not recyclable(")).append(k).append(")").toString());
        }
        boolean flag;
        if ((j & 0x200) != 0 || j())
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
}
