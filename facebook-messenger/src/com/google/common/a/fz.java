// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Comparator;

// Referenced classes of package com.google.common.a:
//            fk, fy, em, eo, 
//            fi

public final class fz extends fk
{

    private final Comparator b;

    public fz(Comparator comparator)
    {
        b = (Comparator)Preconditions.checkNotNull(comparator);
    }

    public em a()
    {
        return c();
    }

    public eo a(Iterable iterable)
    {
        return c(iterable);
    }

    public eo a(Object obj)
    {
        return c(obj);
    }

    public eo a(Object aobj[])
    {
        return c(aobj);
    }

    public fi b()
    {
        return c();
    }

    public fk b(Iterable iterable)
    {
        return c(iterable);
    }

    public fk b(Object obj)
    {
        return c(obj);
    }

    public fk b(Object aobj[])
    {
        return c(aobj);
    }

    public fy c()
    {
        return fy.a(b, a.iterator());
    }

    public fz c(Iterable iterable)
    {
        super.b(iterable);
        return this;
    }

    public fz c(Object obj)
    {
        super.b(obj);
        return this;
    }

    public transient fz c(Object aobj[])
    {
        super.b(aobj);
        return this;
    }
}
