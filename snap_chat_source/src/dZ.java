// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

final class dZ extends eb
{

    private final transient EnumMap a;

    dZ(EnumMap enummap)
    {
        a = enummap;
        boolean flag;
        if (!enummap.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag);
    }

    static EnumMap a(dZ dz)
    {
        return dz.a;
    }

    final eg a()
    {
        return new eg() {

            private dZ a;

            public final eG a()
            {
                return em.a(dZ.a(a).keySet().iterator());
            }

            public final boolean contains(Object obj)
            {
                return dZ.a(a).containsKey(obj);
            }

            final boolean e()
            {
                return true;
            }

            public final Iterator iterator()
            {
                return a();
            }

            public final int size()
            {
                return a.size();
            }

            
            {
                a = dZ.this;
                super();
            }
        };
    }

    final eg c()
    {
        return new ed() {

            final dZ a;

            public final eG a()
            {
                return new eG(this) {

                    private final Iterator a;
                    private _cls2 b;

                    public final boolean hasNext()
                    {
                        return a.hasNext();
                    }

                    public final Object next()
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
                        return ep.a(entry.getKey(), entry.getValue());
                    }

            
            {
                b = _pcls2;
                super();
                a = dZ.a(b.a).entrySet().iterator();
            }
                };
            }

            final eb d()
            {
                return a;
            }

            public final Iterator iterator()
            {
                return a();
            }

            
            {
                a = dZ.this;
                super();
            }
        };
    }

    public final boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    final boolean e()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        return a.get(obj);
    }

    public final int size()
    {
        return a.size();
    }
}
