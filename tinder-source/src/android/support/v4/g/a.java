// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.g:
//            i, f

public class a extends i
    implements Map
{

    f a;

    public a()
    {
    }

    public a(byte byte0)
    {
        super(3);
    }

    private f a()
    {
        if (a == null)
        {
            a = new f() {

                final a a;

                protected final int a()
                {
                    return a.h;
                }

                protected final int a(Object obj)
                {
                    return a.a(obj);
                }

                protected final Object a(int j, int k)
                {
                    return a.g[(j << 1) + k];
                }

                protected final Object a(int j, Object obj)
                {
                    return a.a(j, obj);
                }

                protected final void a(int j)
                {
                    a.d(j);
                }

                protected final void a(Object obj, Object obj1)
                {
                    a.put(obj, obj1);
                }

                protected final int b(Object obj)
                {
                    return a.b(obj);
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
                a = a.this;
                super();
            }
            };
        }
        return a;
    }

    public Set entrySet()
    {
        f f1 = a();
        if (f1.b == null)
        {
            f1.b = new f.b(f1);
        }
        return f1.b;
    }

    public Set keySet()
    {
        f f1 = a();
        if (f1.c == null)
        {
            f1.c = new f.c(f1);
        }
        return f1.c;
    }

    public void putAll(Map map)
    {
        int j = h + map.size();
        if (super.f.length < j)
        {
            int ai[] = super.f;
            Object aobj[] = super.g;
            super.a(j);
            if (super.h > 0)
            {
                System.arraycopy(ai, 0, super.f, 0, super.h);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (super.g)), 0, super.h << 1);
            }
            i.a(ai, aobj, super.h);
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        f f1 = a();
        if (f1.d == null)
        {
            f1.d = new f.e(f1);
        }
        return f1.d;
    }
}
