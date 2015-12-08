// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

public final class bwg
{

    private static final SparseArray d;
    public final String a;
    public final List b;
    private long c;

    public bwg(String s, List list, long l)
    {
        a = (String)b.a(s, "genreName", null);
        b = Collections.unmodifiableList(list);
        c = l;
    }

    public final msp a()
    {
        return (msp)d.get((int)c);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof bwg))
            {
                return false;
            }
            obj = (bwg)obj;
            if (!a.equals(((bwg) (obj)).a) || !b.equals(((bwg) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.h(a, b.hashCode());
    }

    public final String toString()
    {
        return b.a(bwg, new Object[] {
            a, b
        });
    }

    static 
    {
        SparseArray sparsearray = new SparseArray();
        d = sparsearray;
        sparsearray.put(4, pwp.f);
        d.put(5, pwp.g);
        d.put(10, pwp.h);
        d.put(13, pwp.i);
        d.put(14, pwp.j);
    }
}
