// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ij, ii

public class if extends ij
    implements Map
{

    ii a;

    public if()
    {
    }

    private ii b()
    {
        if (a == null)
        {
            a = new ii() {

                final if a;

                protected final int a()
                {
                    return a.h;
                }

                protected final int a(Object obj)
                {
                    if (obj == null)
                    {
                        return a.a();
                    } else
                    {
                        return a.a(obj, obj.hashCode());
                    }
                }

                protected final Object a(int i, int j)
                {
                    return a.g[(i << 1) + j];
                }

                protected final Object a(int i, Object obj)
                {
                    if if1 = a;
                    i = (i << 1) + 1;
                    Object obj1 = ((ij) (if1)).g[i];
                    ((ij) (if1)).g[i] = obj;
                    return obj1;
                }

                protected final void a(int i)
                {
                    a.d(i);
                }

                protected final void a(Object obj, Object obj1)
                {
                    a.put(obj, obj1);
                }

                protected final int b(Object obj)
                {
                    return a.a(obj);
                }

                protected final Map b()
                {
                    return a;
                }

                protected final void c()
                {
                    a.clear();
                }

            
            {
                a = if.this;
                super();
            }
            };
        }
        return a;
    }

    public Set entrySet()
    {
        ii ii1 = b();
        if (ii1.b == null)
        {
            ii1.b = new ii.b(ii1);
        }
        return ii1.b;
    }

    public Set keySet()
    {
        ii ii1 = b();
        if (ii1.c == null)
        {
            ii1.c = new ii.c(ii1);
        }
        return ii1.c;
    }

    public void putAll(Map map)
    {
        a(h + map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        ii ii1 = b();
        if (ii1.d == null)
        {
            ii1.d = new ii.e(ii1);
        }
        return ii1.d;
    }
}
