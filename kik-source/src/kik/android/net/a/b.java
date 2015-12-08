// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;

import com.kik.g.p;
import java.util.Arrays;
import java.util.List;
import kik.android.e.e;

public abstract class b
    implements e
{

    protected int a;
    protected List b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    public b()
    {
        c = 0;
        d = 0;
        e = 0;
        a = 0;
        b = Arrays.asList(new Integer[] {
            Integer.valueOf(412), Integer.valueOf(413)
        });
        f = false;
    }

    protected static boolean b(int i1)
    {
        return i1 == 410;
    }

    protected abstract boolean a(int i1);

    abstract int c();

    final boolean c(int i1)
    {
        boolean flag;
        if (i1 == 200)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return true;
        }
        if (b(i1))
        {
            a = a + 1;
        } else
        if (a(i1))
        {
            d = d + 1;
        } else
        {
            e = e + 1;
        }
        return false;
    }

    public abstract String d();

    public abstract void e();

    final void f()
    {
        c = c + 1;
    }

    boolean g()
    {
        return !f && e <= 0 && d < 2 && c < 10;
    }

    void h()
    {
        e = e + 1;
    }

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract p l();

    public abstract long m();
}
