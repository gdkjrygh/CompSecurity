// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c, e

class  extends 
{

    final c b;

    public void clear()
    {
        e.d(iterator());
    }

    public boolean containsAll(Collection collection)
    {
        return super.a.keySet().containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return this == obj || super.a.keySet().equals(obj);
    }

    public int hashCode()
    {
        return super.a.keySet().hashCode();
    }

    public Iterator iterator()
    {
        return new Iterator(super.a.entrySet().iterator()) {

            private java.util.Map.Entry a;
            private Iterator b;
            private c.b c;

            public final boolean hasNext()
            {
                return b.hasNext();
            }

            public final Object next()
            {
                a = (java.util.Map.Entry)b.next();
                return a.getKey();
            }

            public final void remove()
            {
                Collection collection;
                boolean flag;
                if (a != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j.b(flag, "no calls to next() since the last call to remove()");
                collection = (Collection)a.getValue();
                b.remove();
                com.google.android.m4b.maps.aa.c.b(c.b, collection.size());
                collection.clear();
            }

            
            {
                c = c.b.this;
                b = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        obj = (Collection)super.a.remove(obj);
        int i;
        if (obj != null)
        {
            i = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            c.b(b, i);
        } else
        {
            i = 0;
        }
        return i > 0;
    }

    _cls1.b(c c1, Map map)
    {
        b = c1;
        super(map);
    }
}
