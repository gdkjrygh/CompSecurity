// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;

// Referenced classes of package a.a:
//            fm, fb, fe, fj, 
//            gs

final class fi extends fm
{

    private final fe a;

    fi(fe fe1)
    {
        a = fe1;
    }

    public final gs a()
    {
        return b_().a();
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    final boolean e()
    {
        return true;
    }

    final fb f()
    {
        return new fj(this, a.b().b_());
    }

    public final Iterator iterator()
    {
        return b_().a();
    }

    public final int size()
    {
        return a.size();
    }
}
