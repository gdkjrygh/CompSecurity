// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aa, bc, m, br, 
//            aq, ad, j, bx, 
//            bi, bo, x

public abstract class al extends aa
    implements Set
{
    public static class a extends aa.a
    {

        public aa.a a(Object obj)
        {
            return c(obj);
        }

        public aa.b a(Iterable iterable)
        {
            return b(iterable);
        }

        public aa.b a(Iterator iterator1)
        {
            return b(iterator1);
        }

        public aa.b a(Object aobj[])
        {
            return b(aobj);
        }

        public al a()
        {
            al al1 = al.a(b, a);
            b = al1.size();
            return al1;
        }

        public aa.b b(Object obj)
        {
            return c(obj);
        }

        public a b(Iterable iterable)
        {
            super.a(iterable);
            return this;
        }

        public a b(Iterator iterator1)
        {
            super.a(iterator1);
            return this;
        }

        public transient a b(Object aobj[])
        {
            super.a(aobj);
            return this;
        }

        public a c(Object obj)
        {
            super.a(obj);
            return this;
        }

        public a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
        }
    }

    static final class b
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private Object a[];

        final Object readResolve()
        {
            return al.a(a);
        }

        b(Object aobj[])
        {
            a = aobj;
        }
    }


    al()
    {
    }

    private static int a(int i)
    {
        int l;
        if (i < 0x2ccccccc)
        {
            int k = Integer.highestOneBit(i - 1) << 1;
            do
            {
                l = k;
                if ((double)k * 0.69999999999999996D >= (double)i)
                {
                    break;
                }
                k <<= 1;
            } while (true);
        } else
        {
            boolean flag;
            if (i < 0x40000000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j.a(flag, "collection too large");
            l = 0x40000000;
        }
        return l;
    }

    static al a(int i, Object aobj[])
    {
        return b(i, aobj);
    }

    public static al a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return a(bc.a(iterable));
        }
        iterable = iterable.iterator();
        if (!iterable.hasNext())
        {
            return m.a;
        }
        Object obj = iterable.next();
        if (!iterable.hasNext())
        {
            return a(obj);
        } else
        {
            return (new a()).c(obj).b(iterable).a();
        }
    }

    public static al a(Object obj)
    {
        return new br(obj);
    }

    public static al a(Collection collection)
    {
        if ((collection instanceof al) && !(collection instanceof aq))
        {
            al al1 = (al)collection;
            if (!al1.d())
            {
                return al1;
            }
        } else
        if (collection instanceof EnumSet)
        {
            return ad.a(EnumSet.copyOf((EnumSet)collection));
        }
        collection = ((Collection) (collection.toArray()));
        return b(collection.length, collection);
    }

    public static al a(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return b(aobj.length, (Object[])((Object []) (aobj)).clone());

        case 0: // '\0'
            return m.a;

        case 1: // '\001'
            return a(aobj[0]);
        }
    }

    private static transient al b(int i, Object aobj[])
    {
        int l = i;
_L13:
        l;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 136
    //                   1 140;
           goto _L1 _L2 _L3
_L1:
        Object aobj2[];
        int k;
        int i1;
        int k1;
        int l1;
        k1 = a(l);
        aobj2 = new Object[k1];
        l1 = k1 - 1;
        i1 = 0;
        i = 0;
        k = 0;
_L8:
        if (i1 >= l) goto _L5; else goto _L4
_L4:
        Object obj;
        int j1;
        int i2;
        obj = j.a(aobj[i1], i1);
        i2 = obj.hashCode();
        j1 = bx.a(i2);
_L11:
        Object obj1;
        int j2;
        j2 = j1 & l1;
        obj1 = aobj2[j2];
        if (obj1 != null) goto _L7; else goto _L6
_L6:
        j1 = i + 1;
        aobj[i] = obj;
        aobj2[j2] = obj;
        k += i2;
        i = j1;
_L10:
        i1++;
          goto _L8
_L2:
        return m.a;
_L3:
        return a(aobj[0]);
_L7:
        if (obj1.equals(obj)) goto _L10; else goto _L9
_L9:
        j1++;
          goto _L11
_L5:
        Arrays.fill(aobj, i, l, null);
        if (i == 1)
        {
            return new br(aobj[0], k);
        }
        if (k1 == a(i))
        {
            break; /* Loop/switch isn't completed */
        }
        l = i;
        if (true) goto _L13; else goto _L12
_L12:
        Object aobj1[] = aobj;
        if (i < aobj.length)
        {
            aobj1 = j.b(aobj, i);
        }
        return new bi(aobj1, k, aobj2, l1);
    }

    public static al f()
    {
        return m.a;
    }

    public static a h()
    {
        return new a();
    }

    public abstract x a();

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof al) && g() && ((al)obj).g() && hashCode() != obj.hashCode())
        {
            return false;
        } else
        {
            return bo.a(this, obj);
        }
    }

    boolean g()
    {
        return false;
    }

    public int hashCode()
    {
        Iterator iterator1 = iterator();
        int i = 0;
        while (iterator1.hasNext()) 
        {
            Object obj = iterator1.next();
            int k;
            if (obj != null)
            {
                k = obj.hashCode();
            } else
            {
                k = 0;
            }
            i = ~~(i + k);
        }
        return i;
    }

    public Iterator iterator()
    {
        return a();
    }

    Object writeReplace()
    {
        return new b(toArray());
    }
}
