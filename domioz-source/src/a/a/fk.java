// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;

// Referenced classes of package a.a:
//            es, fe, fm, fz, 
//            ft, fl, gs, fb

final class fk extends es
{

    private final fe a;

    fk(fe fe1)
    {
        a = fe1;
    }

    public final gs a()
    {
        return fz.a(a.b().a());
    }

    public final boolean contains(Object obj)
    {
        return obj != null && ft.a(a(), obj);
    }

    final boolean e()
    {
        return true;
    }

    final fb f()
    {
        return new fl(this, a.b().b_());
    }

    public final Iterator iterator()
    {
        return a();
    }

    public final int size()
    {
        return a.size();
    }
}
