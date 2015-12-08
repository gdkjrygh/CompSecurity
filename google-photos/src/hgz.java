// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class hgz extends aen
{

    private static final onh d = new onh("debug.photos.log_notify_change");
    public hhh c;
    private boolean e;
    private final hhg f;

    public hgz(Context context, boolean flag, hhg hhg1)
    {
        e = flag;
        f = hhg1;
        if (super.a.a())
        {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else
        {
            super.b = flag;
            a(new hgx(new ArrayList()));
            return;
        }
    }

    static hhh a(hgz hgz1)
    {
        return hgz1.c;
    }

    public final int a()
    {
        if (c != null)
        {
            return c.b();
        } else
        {
            return 0;
        }
    }

    public final int a(int i)
    {
        return c.c(i).a();
    }

    public final int a(long l)
    {
        return c.a(l);
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        return f.a(viewgroup, i);
    }

    public final void a(int i, int j)
    {
        b().e(i, j);
        super.a.c(i, j);
    }

    public final void a(int i, hgo hgo1)
    {
        b().a(i, hgo1);
        super.a.a(i, 1);
    }

    public final void a(afn afn, int i)
    {
        c.c(i).a(afn);
    }

    public final void a(hhh hhh1)
    {
        if (c != null)
        {
            b(c);
        }
        c = hhh1;
        a(((aep) (hhh1)));
        super.a.b();
    }

    public final void a(List list)
    {
        a(((hhh) (new hgx(list))));
    }

    public final long b(int i)
    {
        if (!e)
        {
            return -1L;
        } else
        {
            return c.a(i);
        }
    }

    public hgy b()
    {
        if (c instanceof hgy)
        {
            return (hgy)c;
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public final adf e(int i)
    {
        return new hhb(this, i);
    }

    public final hgo f(int i)
    {
        return c.c(i);
    }

    public final void g(int i)
    {
        b().d(i);
        d(i);
    }

}
