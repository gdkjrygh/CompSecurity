// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ea, dz

public class dw extends ea
    implements Map
{

    dz a;

    public dw()
    {
    }

    private dz b()
    {
        if (a == null)
        {
            a = new dz() {

                final dw a;

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
                    dw dw1 = a;
                    i = (i << 1) + 1;
                    Object obj1 = ((ea) (dw1)).g[i];
                    ((ea) (dw1)).g[i] = obj;
                    return obj1;
                }

                protected final void a(int i)
                {
                    a.b(i);
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
                a = dw.this;
                super();
            }
            };
        }
        return a;
    }

    public Set entrySet()
    {
        dz dz1 = b();
        if (dz1.b == null)
        {
            dz1.b = new dz.b(dz1);
        }
        return dz1.b;
    }

    public Set keySet()
    {
        dz dz1 = b();
        if (dz1.c == null)
        {
            dz1.c = new dz.c(dz1);
        }
        return dz1.c;
    }

    public void putAll(Map map)
    {
        int i = h + map.size();
        if (super.f.length < i)
        {
            int ai[] = super.f;
            Object aobj[] = super.g;
            super.a(i);
            if (super.h > 0)
            {
                System.arraycopy(ai, 0, super.f, 0, super.h);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (super.g)), 0, super.h << 1);
            }
            ea.a(ai, aobj, super.h);
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        dz dz1 = b();
        if (dz1.d == null)
        {
            dz1.d = new dz.e(dz1);
        }
        return dz1.d;
    }
}
