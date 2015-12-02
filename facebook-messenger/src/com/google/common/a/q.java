// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import com.google.common.c.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            aq, bi, r, t, 
//            v

abstract class q extends aq
    implements Serializable
{

    private transient Map a;
    private transient long b;

    protected q(Map map)
    {
        a = (Map)Preconditions.checkNotNull(map);
        b = super.size();
    }

    static int a(q q1, Object obj, Map map)
    {
        return q1.a(obj, map);
    }

    private int a(Object obj, Map map)
    {
        obj = (bi)map.remove(obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            int i = ((bi) (obj)).d(0);
            b = b - (long)i;
            return i;
        }
    }

    static long a(q q1, long l)
    {
        l = q1.b - l;
        q1.b = l;
        return l;
    }

    static Map a(q q1)
    {
        return q1.a;
    }

    static long b(q q1)
    {
        long l = q1.b;
        q1.b = l - 1L;
        return l;
    }

    public int a(Object obj)
    {
        int i;
        try
        {
            obj = (bi)a.get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        if (obj == null)
        {
            i = 0;
            break MISSING_BLOCK_LABEL_37;
        }
        i = ((bi) (obj)).a();
        return i;
    }

    public int a(Object obj, int i)
    {
        int j = 0;
        if (i == 0)
        {
            return a(obj);
        }
        bi bi1;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "occurrences cannot be negative: %s", new Object[] {
            Integer.valueOf(i)
        });
        bi1 = (bi)a.get(obj);
        if (bi1 == null)
        {
            a.put(obj, new bi(i));
        } else
        {
            j = bi1.a();
            long l = (long)j + (long)i;
            boolean flag1;
            if (l <= 0x7fffffffL)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1, "too many occurrences: %s", new Object[] {
                Long.valueOf(l)
            });
            bi1.a(i);
        }
        b = b + (long)i;
        return j;
    }

    Map a()
    {
        return a;
    }

    public int b(Object obj, int i)
    {
        int j = 0;
        if (i == 0)
        {
            j = a(obj);
        } else
        {
            bi bi1;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "occurrences cannot be negative: %s", new Object[] {
                Integer.valueOf(i)
            });
            bi1 = (bi)a.get(obj);
            if (bi1 != null)
            {
                int k = bi1.a();
                if (k <= i)
                {
                    a.remove(obj);
                    i = k;
                }
                bi1.b(-i);
                b = b - (long)i;
                return k;
            }
        }
        return j;
    }

    public Set b()
    {
        return super.b();
    }

    Iterator c()
    {
        return new r(this, a.entrySet().iterator());
    }

    public void clear()
    {
        for (Iterator iterator1 = a.values().iterator(); iterator1.hasNext(); ((bi)iterator1.next()).c(0)) { }
        a.clear();
        b = 0L;
    }

    int d()
    {
        return a.size();
    }

    Set e()
    {
        return new t(this, a);
    }

    public Iterator iterator()
    {
        return new v(this);
    }

    public int size()
    {
        return com.google.common.c.a.b(b);
    }
}
