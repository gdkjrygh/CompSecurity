// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//            fx, hu, gv, gf, 
//            fr, gx, hh, fu, 
//            ho, gs, hr, hw

public abstract class gr extends fx
    implements Set
{

    gr()
    {
    }

    private static int a(int i)
    {
        int k;
        if (i < 0x2ccccccc)
        {
            int j = Integer.highestOneBit(i - 1) << 1;
            do
            {
                k = j;
                if ((double)j * 0.69999999999999996D >= (double)i)
                {
                    break;
                }
                j <<= 1;
            } while (true);
        } else
        {
            if (i < 0x40000000)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                throw new IllegalArgumentException(String.valueOf("collection too large"));
            }
            k = 0x40000000;
        }
        return k;
    }

    static gr a(int i, Object aobj[])
    {
        return b(i, aobj);
    }

    public static gr a(Object obj)
    {
        return new hu(obj);
    }

    public static gr a(Object obj, Object obj1)
    {
        return b(2, new Object[] {
            obj, obj1
        });
    }

    public static transient gr a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object aobj[])
    {
        Object aobj1[] = new Object[171];
        aobj1[0] = obj;
        aobj1[1] = obj1;
        aobj1[2] = obj2;
        aobj1[3] = obj3;
        aobj1[4] = obj4;
        aobj1[5] = obj5;
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 6, 165);
        return b(171, aobj1);
    }

    public static gr a(Collection collection)
    {
        if ((collection instanceof gr) && !(collection instanceof gv))
        {
            gr gr1 = (gr)collection;
            if (!gr1.e())
            {
                return gr1;
            }
        } else
        if (collection instanceof EnumSet)
        {
            collection = EnumSet.copyOf((EnumSet)collection);
            switch (collection.size())
            {
            default:
                return new gf(collection);

            case 0: // '\0'
                return fr.a;

            case 1: // '\001'
                return a(gx.a(collection));
            }
        }
        collection = ((Collection) (collection.toArray()));
        return b(collection.length, collection);
    }

    private static transient gr b(int i, Object aobj[])
    {
        int k = i;
_L13:
        k;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 136
    //                   1 140;
           goto _L1 _L2 _L3
_L1:
        Object aobj2[];
        int j;
        int l;
        int j1;
        int k1;
        j1 = a(k);
        aobj2 = new Object[j1];
        k1 = j1 - 1;
        l = 0;
        i = 0;
        j = 0;
_L8:
        if (l >= k) goto _L5; else goto _L4
_L4:
        Object obj;
        int i1;
        int l1;
        obj = hh.a(aobj[l], l);
        l1 = obj.hashCode();
        i1 = fu.a(l1);
_L11:
        Object obj1;
        int i2;
        i2 = i1 & k1;
        obj1 = aobj2[i2];
        if (obj1 != null) goto _L7; else goto _L6
_L6:
        i1 = i + 1;
        aobj[i] = obj;
        aobj2[i2] = obj;
        j += l1;
        i = i1;
_L10:
        l++;
          goto _L8
_L2:
        return fr.a;
_L3:
        return a(aobj[0]);
_L7:
        if (obj1.equals(obj)) goto _L10; else goto _L9
_L9:
        i1++;
          goto _L11
_L5:
        Arrays.fill(aobj, i, k, null);
        if (i == 1)
        {
            return new hu(aobj[0], j);
        }
        if (j1 == a(i))
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (true) goto _L13; else goto _L12
_L12:
        Object aobj1[] = aobj;
        if (i < aobj.length)
        {
            aobj1 = hh.b(aobj, i);
        }
        return new ho(aobj1, j, aobj2, k1);
    }

    public static gr g()
    {
        return fr.a;
    }

    public static gs h()
    {
        return new gs();
    }

    public abstract hw a();

    boolean b_()
    {
        return false;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof gr) && b_() && ((gr)obj).b_() && hashCode() != obj.hashCode())
        {
            return false;
        } else
        {
            return hr.a(this, obj);
        }
    }

    public int hashCode()
    {
        Iterator iterator1 = iterator();
        int i = 0;
        while (iterator1.hasNext()) 
        {
            Object obj = iterator1.next();
            int j;
            if (obj != null)
            {
                j = obj.hashCode();
            } else
            {
                j = 0;
            }
            i = ~~(i + j);
        }
        return i;
    }

    public Iterator iterator()
    {
        return a();
    }
}
