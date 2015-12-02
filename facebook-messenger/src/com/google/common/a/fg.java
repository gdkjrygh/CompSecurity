// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            eo, gv, jf, fe, 
//            jh, jg, em

public class fg extends eo
{

    final jf a;

    public fg()
    {
        this(((jf) (gv.h())));
    }

    fg(jf jf1)
    {
        a = jf1;
    }

    public em a()
    {
        return b();
    }

    public eo a(Iterable iterable)
    {
        return b(iterable);
    }

    public eo a(Object obj)
    {
        return b(obj);
    }

    public eo a(Object aobj[])
    {
        return b(aobj);
    }

    public fg a(Object obj, int i)
    {
        a.a(Preconditions.checkNotNull(obj), i);
        return this;
    }

    public fe b()
    {
        return fe.a(a);
    }

    public fg b(Iterable iterable)
    {
        if (iterable instanceof jf)
        {
            jg jg1;
            for (iterable = jh.b(iterable).b().iterator(); iterable.hasNext(); a(jg1.a(), jg1.b()))
            {
                jg1 = (jg)iterable.next();
            }

        } else
        {
            super.a(iterable);
        }
        return this;
    }

    public fg b(Object obj)
    {
        a.add(Preconditions.checkNotNull(obj));
        return this;
    }

    public transient fg b(Object aobj[])
    {
        super.a(aobj);
        return this;
    }
}
