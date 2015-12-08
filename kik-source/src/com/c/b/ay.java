// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.c.b:
//            d, az, f, au, 
//            bz

public final class ay extends d
    implements az, RandomAccess
{

    public static final az a;
    private static final ay b;
    private final List c;

    public ay()
    {
        c = new ArrayList();
    }

    public ay(az az1)
    {
        c = new ArrayList(az1.size());
        addAll(az1);
    }

    private static String a(Object obj)
    {
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof f)
        {
            return ((f)obj).f();
        } else
        {
            return au.b((byte[])obj);
        }
    }

    public final f a(int i)
    {
        Object obj = c.get(i);
        f f1;
        if (obj instanceof f)
        {
            f1 = (f)obj;
        } else
        if (obj instanceof String)
        {
            f1 = f.a((String)obj);
        } else
        {
            f1 = f.a((byte[])obj);
        }
        if (f1 != obj)
        {
            c.set(i, f1);
        }
        return f1;
    }

    public final void a(f f1)
    {
        c();
        c.add(f1);
        modCount = modCount + 1;
    }

    public final volatile boolean a()
    {
        return super.a();
    }

    public final void add(int i, Object obj)
    {
        obj = (String)obj;
        c();
        c.add(i, obj);
        modCount = modCount + 1;
    }

    public final boolean addAll(int i, Collection collection)
    {
        c();
        Object obj = collection;
        if (collection instanceof az)
        {
            obj = ((az)collection).d();
        }
        boolean flag = c.addAll(i, ((Collection) (obj)));
        modCount = modCount + 1;
        return flag;
    }

    public final boolean addAll(Collection collection)
    {
        return addAll(size(), collection);
    }

    public final void clear()
    {
        c();
        c.clear();
        modCount = modCount + 1;
    }

    public final List d()
    {
        return Collections.unmodifiableList(c);
    }

    public final az e()
    {
        Object obj = this;
        if (super.a())
        {
            obj = new bz(this);
        }
        return ((az) (obj));
    }

    public final Object get(int i)
    {
        Object obj = c.get(i);
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof f)
        {
            obj = (f)obj;
            String s = ((f) (obj)).f();
            if (((f) (obj)).g())
            {
                c.set(i, s);
            }
            return s;
        }
        byte abyte0[] = (byte[])obj;
        String s1 = au.b(abyte0);
        if (au.a(abyte0))
        {
            c.set(i, s1);
        }
        return s1;
    }

    public final Object remove(int i)
    {
        c();
        Object obj = c.remove(i);
        modCount = modCount + 1;
        return a(obj);
    }

    public final volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public final volatile boolean removeAll(Collection collection)
    {
        return super.removeAll(collection);
    }

    public final volatile boolean retainAll(Collection collection)
    {
        return super.retainAll(collection);
    }

    public final Object set(int i, Object obj)
    {
        obj = (String)obj;
        c();
        return a(c.set(i, obj));
    }

    public final int size()
    {
        return c.size();
    }

    static 
    {
        ay ay1 = new ay();
        b = ay1;
        ay1.b();
        a = b;
    }
}
