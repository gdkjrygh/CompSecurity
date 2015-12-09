// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class eqm
{

    private final List a = new LinkedList();
    private final List b = new LinkedList();
    public boolean c;
    public Optional d;
    public Optional e;

    public eqm()
    {
        d = Optional.e();
        e = Optional.e();
    }

    private boolean b(eqn eqn1)
    {
        if (d.b())
        {
            eqn1.b(d.c());
            return true;
        }
        if (e.b())
        {
            eqn1.a(e.c());
            return true;
        } else
        {
            return false;
        }
    }

    private void d()
    {
        if (b())
        {
            throw new IllegalStateException((new StringBuilder("Task ")).append(this).append(" already completed!").toString());
        } else
        {
            return;
        }
    }

    private void e()
    {
        if (c)
        {
            return;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); Assertion.a(b((eqn)iterator.next()), (new StringBuilder("Task ")).append(this).append(" not yet completed!").toString())) { }
        a.clear();
        b.clear();
    }

    public final eqm a(ghl ghl, ghl ghl1)
    {
        return new eqs(this, ghl, ghl1);
    }

    public abstract void a();

    public final void a(eqn eqn1)
    {
        while (c || b((eqn)ctz.a(eqn1))) 
        {
            return;
        }
        a.add(eqn1);
    }

    public final boolean b()
    {
        return d.b() || e.b();
    }

    public final void c()
    {
        if (!c && !b())
        {
            c = true;
            a.clear();
            a();
            for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
            b.clear();
        }
    }

    public final void c(Object obj)
    {
        d();
        d = Optional.b(obj);
        e();
    }

    public final void d(Object obj)
    {
        d();
        e = Optional.b(obj);
        e();
    }
}
