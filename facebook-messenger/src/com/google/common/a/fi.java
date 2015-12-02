// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            em, ax, fy, hq, 
//            eh, ku, kg, dq, 
//            fk, kl, mh

public abstract class fi extends em
    implements Set
{

    fi()
    {
    }

    static int a(int i)
    {
        if (i < 0x20000000)
        {
            return Integer.highestOneBit(i) << 2;
        }
        boolean flag;
        if (i < 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "collection too large");
        return 0x40000000;
    }

    public static fi a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return a(ax.a(iterable));
        } else
        {
            return a(iterable.iterator());
        }
    }

    public static fi a(Object obj, Object obj1)
    {
        return a(new Object[] {
            obj, obj1
        });
    }

    public static fi a(Object obj, Object obj1, Object obj2)
    {
        return a(new Object[] {
            obj, obj1, obj2
        });
    }

    public static fi a(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return a(new Object[] {
            obj, obj1, obj2, obj3
        });
    }

    public static fi a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return a(new Object[] {
            obj, obj1, obj2, obj3, obj4
        });
    }

    public static transient fi a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object aobj[])
    {
        Object aobj1[] = new Object[aobj.length + 6];
        aobj1[0] = obj;
        aobj1[1] = obj1;
        aobj1[2] = obj2;
        aobj1[3] = obj3;
        aobj1[4] = obj4;
        aobj1[5] = obj5;
        for (int i = 6; i < aobj1.length; i++)
        {
            aobj1[i] = aobj[i - 6];
        }

        return a(aobj1);
    }

    public static fi a(Collection collection)
    {
        if ((collection instanceof fi) && !(collection instanceof fy))
        {
            fi fi1 = (fi)collection;
            if (!fi1.a())
            {
                return fi1;
            }
        }
        return b(collection);
    }

    public static fi a(Iterator iterator1)
    {
        return b(hq.a(iterator1));
    }

    private static transient fi a(Object aobj[])
    {
        Object obj;
        Object aobj1[];
        int i;
        int j;
        int j1;
        int k1;
        j1 = a(aobj.length);
        aobj1 = new Object[j1];
        k1 = j1 - 1;
        obj = null;
        i = 0;
        j = 0;
_L9:
        if (i >= aobj.length) goto _L2; else goto _L1
_L1:
        Object obj1;
        int k;
        int l;
        obj1 = aobj[i];
        l = obj1.hashCode();
        k = eh.a(l);
_L7:
        Object obj2;
        int l1;
        l1 = k & k1;
        obj2 = aobj1[l1];
        if (obj2 != null) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            ((ArrayList) (obj)).add(obj1);
        }
        aobj1[l1] = obj1;
        k = j + l;
        obj1 = obj;
_L6:
        i++;
        j = k;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L4:
label0:
        {
            if (!obj2.equals(obj1))
            {
                break label0;
            }
            k = j;
            obj1 = obj;
            if (obj == null)
            {
                obj = new ArrayList(aobj.length);
                int i1 = 0;
                do
                {
                    k = j;
                    obj1 = obj;
                    if (i1 >= i)
                    {
                        break;
                    }
                    ((ArrayList) (obj)).add(aobj[i1]);
                    i1++;
                } while (true);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        k++;
        if (true) goto _L7; else goto _L2
_L2:
        if (obj != null)
        {
            aobj = ((ArrayList) (obj)).toArray();
        }
        if (aobj.length == 1)
        {
            return new ku(aobj[0], j);
        }
        if (j1 > a(aobj.length) * 2)
        {
            return a(aobj);
        }
        return new kg(aobj, j, aobj1, k1);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static fi b(Object obj)
    {
        return new ku(obj);
    }

    private static fi b(Collection collection)
    {
        collection = ((Collection) (collection.toArray()));
        switch (collection.length)
        {
        default:
            return a(collection);

        case 0: // '\0'
            return d();

        case 1: // '\001'
            return b(collection[0]);
        }
    }

    public static fi d()
    {
        return dq.a;
    }

    public static fk e()
    {
        return new fk();
    }

    boolean c()
    {
        return false;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof fi) && c() && ((fi)obj).c() && hashCode() != obj.hashCode())
        {
            return false;
        } else
        {
            return kl.a(this, obj);
        }
    }

    public abstract mh h_();

    public int hashCode()
    {
        return kl.a(this);
    }

    public Iterator iterator()
    {
        return h_();
    }
}
