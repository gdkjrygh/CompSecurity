// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.c.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            em, jf, ev, jg, 
//            ew, ke, jh, gv, 
//            dp, fg, fh, ff, 
//            kl, fi, mh

public abstract class fe extends em
    implements jf
{

    private transient fi a;

    fe()
    {
    }

    private static fe a(jf jf1)
    {
        ew ew1 = ev.k();
        jf1 = jf1.b().iterator();
        long l = 0L;
        do
        {
            if (!jf1.hasNext())
            {
                break;
            }
            jg jg1 = (jg)jf1.next();
            int i = jg1.b();
            if (i > 0)
            {
                ew1.b(jg1.a(), Integer.valueOf(i));
                l += i;
            }
        } while (true);
        if (l == 0L)
        {
            return j();
        } else
        {
            return new ke(ew1.b(), com.google.common.c.a.b(l));
        }
    }

    public static fe a(Iterable iterable)
    {
        if (iterable instanceof fe)
        {
            fe fe1 = (fe)iterable;
            if (!fe1.a())
            {
                return fe1;
            }
        }
        if (iterable instanceof jf)
        {
            iterable = jh.b(iterable);
        } else
        {
            iterable = com.google.common.a.gv.a(iterable);
        }
        return a(((jf) (iterable)));
    }

    public static fe j()
    {
        return com.google.common.a.dp.a;
    }

    public static fg k()
    {
        return new fg();
    }

    public final int a(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public final int b(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public Set b()
    {
        fi fi1 = a;
        fi fi = fi1;
        if (fi1 == null)
        {
            fi = g();
            a = fi;
        }
        return fi;
    }

    public boolean contains(Object obj)
    {
        return a(obj) > 0;
    }

    public boolean containsAll(Collection collection)
    {
        return f().containsAll(collection);
    }

    abstract mh d();

    abstract int e();

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof jf)
        {
            obj = (jf)obj;
            if (size() != ((jf) (obj)).size())
            {
                return false;
            }
            for (obj = ((jf) (obj)).b().iterator(); ((Iterator) (obj)).hasNext();)
            {
                jg jg1 = (jg)((Iterator) (obj)).next();
                if (a(jg1.a()) != jg1.b())
                {
                    return false;
                }
            }

            return true;
        } else
        {
            return false;
        }
    }

    fi g()
    {
        return new fh(this);
    }

    public mh h_()
    {
        return new ff(this, d());
    }

    public int hashCode()
    {
        return com.google.common.a.kl.a(b());
    }

    public Iterator iterator()
    {
        return h_();
    }

    public String toString()
    {
        return b().toString();
    }
}
