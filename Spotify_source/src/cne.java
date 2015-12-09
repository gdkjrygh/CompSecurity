// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class cne extends cnm
    implements Map
{

    private cng d;

    public cne()
    {
    }

    private cng b()
    {
        if (d == null)
        {
            d = new cng() {

                private cne d;

                protected final int a()
                {
                    return d.c;
                }

                protected final int a(Object obj)
                {
                    if (obj == null)
                    {
                        return d.a();
                    } else
                    {
                        return d.a(obj, obj.hashCode());
                    }
                }

                protected final Object a(int i, int j)
                {
                    return d.b[(i << 1) + j];
                }

                protected final Object a(int i, Object obj)
                {
                    cne cne1 = d;
                    i = (i << 1) + 1;
                    Object obj1 = ((cnm) (cne1)).b[i];
                    ((cnm) (cne1)).b[i] = obj;
                    return obj1;
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
                    return d.a(obj);
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
                d = cne.this;
                super();
            }
            };
        }
        return d;
    }

    public Set entrySet()
    {
        cng cng1 = b();
        if (cng1.a == null)
        {
            cng1.a = new cni(cng1);
        }
        return cng1.a;
    }

    public Set keySet()
    {
        cng cng1 = b();
        if (cng1.b == null)
        {
            cng1.b = new cnj(cng1);
        }
        return cng1.b;
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
            cnm.a(ai, aobj, super.c);
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        cng cng1 = b();
        if (cng1.c == null)
        {
            cng1.c = new cnl(cng1);
        }
        return cng1.c;
    }
}
