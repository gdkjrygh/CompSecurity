// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ev, eh, jz, kb, 
//            ka, jx, kc, jy, 
//            ax, fi, em

final class jw extends ev
{

    private final transient jz a[];
    private final transient jz b[];
    private final transient int c;
    private final transient int d;
    private transient fi e;
    private transient fi f;
    private transient em g;

    transient jw(java.util.Map.Entry aentry[])
    {
        int k = aentry.length;
        a = b(k);
        int i = a(k);
        b = b(i);
        c = i - 1;
        int j = 0;
        int l;
        for (i = 0; j < k; i += l)
        {
            Object obj1 = aentry[j];
            Object obj = ((java.util.Map.Entry) (obj1)).getKey();
            l = obj.hashCode();
            int i1 = eh.a(l);
            i1 = c & i1;
            jz jz1 = b[i1];
            obj1 = a(obj, ((java.util.Map.Entry) (obj1)).getValue(), jz1);
            b[i1] = ((jz) (obj1));
            a[j] = ((jz) (obj1));
            while (jz1 != null) 
            {
                boolean flag;
                if (!obj.equals(jz1.getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "duplicate key: %s", new Object[] {
                    obj
                });
                jz1 = jz1.a();
            }
            j++;
        }

        d = i;
    }

    private static int a(int i)
    {
        int j = Integer.highestOneBit(i) << 1;
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "table too large: %s", new Object[] {
            Integer.valueOf(i)
        });
        return j;
    }

    private static jz a(Object obj, Object obj1, jz jz1)
    {
        if (jz1 == null)
        {
            obj = new kb(obj, obj1);
        } else
        {
            obj = new ka(obj, obj1, jz1);
        }
        return (jz)obj;
    }

    static jz[] a(jw jw1)
    {
        return jw1.a;
    }

    static int b(jw jw1)
    {
        return jw1.d;
    }

    private jz[] b(int i)
    {
        return new jz[i];
    }

    public fi a()
    {
        fi fi = e;
        Object obj = fi;
        if (fi == null)
        {
            obj = new jx(this);
            e = ((fi) (obj));
        }
        return ((fi) (obj));
    }

    public em c()
    {
        em em = g;
        Object obj = em;
        if (em == null)
        {
            obj = new kc(this);
            g = ((em) (obj));
        }
        return ((em) (obj));
    }

    public boolean containsValue(Object obj)
    {
        if (obj != null)
        {
            jz ajz[] = a;
            int j = ajz.length;
            int i = 0;
            while (i < j) 
            {
                if (ajz[i].getValue().equals(obj))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    boolean d()
    {
        return false;
    }

    public Set entrySet()
    {
        return a();
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = eh.a(obj.hashCode());
            int j = c;
            jz jz1 = b[i & j];
            while (jz1 != null) 
            {
                if (obj.equals(jz1.getKey()))
                {
                    return jz1.getValue();
                }
                jz1 = jz1.a();
            }
        }
        return null;
    }

    public fi i_()
    {
        fi fi = f;
        Object obj = fi;
        if (fi == null)
        {
            obj = new jy(this);
            f = ((fi) (obj));
        }
        return ((fi) (obj));
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Set keySet()
    {
        return i_();
    }

    public int size()
    {
        return a.length;
    }

    public String toString()
    {
        StringBuilder stringbuilder = ax.a(size()).append('{');
        ax.a.appendTo(stringbuilder, a);
        return stringbuilder.append('}').toString();
    }

    public Collection values()
    {
        return c();
    }
}
