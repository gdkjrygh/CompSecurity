// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class av extends aD
    implements Map
{

    private aB d;

    public av()
    {
    }

    private aB a()
    {
        if (d == null)
        {
            d = new aB() {

                private av d;

                protected final int a()
                {
                    return d.c;
                }

                protected final int a(Object obj)
                {
                    return d.a(obj);
                }

                protected final Object a(int i, int j)
                {
                    return d.b[(i << 1) + j];
                }

                protected final Object a(int i, Object obj)
                {
                    return d.a(i, obj);
                }

                protected final void a(int i)
                {
                    d.d(i);
                }

                protected final void a(Object obj, Object obj1)
                {
                    d.put(obj, obj1);
                }

                protected final int b(Object obj)
                {
                    return d.b(obj);
                }

                protected final Map b()
                {
                    return d;
                }

                protected final void c()
                {
                    d.clear();
                }

            
            {
                d = av.this;
                super();
            }
            };
        }
        return d;
    }

    public Set entrySet()
    {
        aB ab = a();
        if (ab.a == null)
        {
            ab.a = new aB.b(ab);
        }
        return ab.a;
    }

    public Set keySet()
    {
        aB ab = a();
        if (ab.b == null)
        {
            ab.b = new aB.c(ab);
        }
        return ab.b;
    }

    public void putAll(Map map)
    {
        int i = c + map.size();
        if (super.a.length < i)
        {
            int ai[] = super.a;
            Object aobj[] = super.b;
            super.a(i);
            if (super.c > 0)
            {
                System.arraycopy(ai, 0, super.a, 0, super.c);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (super.b)), 0, super.c << 1);
            }
            aD.a(ai, aobj, super.c);
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        aB ab = a();
        if (ab.c == null)
        {
            ab.c = new aB.e(ab);
        }
        return ab.c;
    }
}
