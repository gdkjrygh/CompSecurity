// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, dt, an, SingletonImmutableSet, 
//            RegularImmutableSet, bg, ImmutableSortedSet, ImmutableEnumSet, 
//            EmptyImmutableSet, ed, ej

public abstract class ImmutableSet extends ImmutableCollection
    implements Set
{

    static final int MAX_TABLE_SIZE = 0x40000000;

    ImmutableSet()
    {
    }

    private static transient ImmutableSet a(int i, Object aobj[])
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
        j1 = chooseTableSize(k);
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
        obj = dt.a(aobj[l], l);
        l1 = obj.hashCode();
        i1 = an.a(l1);
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
        return of();
_L3:
        return of(aobj[0]);
_L7:
        if (obj1.equals(obj)) goto _L10; else goto _L9
_L9:
        i1++;
          goto _L11
_L5:
        Arrays.fill(aobj, i, k, null);
        if (i == 1)
        {
            return new SingletonImmutableSet(aobj[0], j);
        }
        if (j1 == chooseTableSize(i))
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (true) goto _L13; else goto _L12
_L12:
        Object aobj1[] = aobj;
        if (i < aobj.length)
        {
            aobj1 = dt.b(aobj, i);
        }
        return new RegularImmutableSet(aobj1, j, aobj2, k1);
    }

    public static bg builder()
    {
        return new bg();
    }

    static int chooseTableSize(int i)
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
            boolean flag;
            if (i < 0x40000000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "collection too large");
            k = 0x40000000;
        }
        return k;
    }

    public static ImmutableSet copyOf(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return copyOf((Collection)iterable);
        } else
        {
            return copyOf(iterable.iterator());
        }
    }

    public static ImmutableSet copyOf(Collection collection)
    {
        if ((collection instanceof ImmutableSet) && !(collection instanceof ImmutableSortedSet))
        {
            ImmutableSet immutableset = (ImmutableSet)collection;
            if (!immutableset.isPartialView())
            {
                return immutableset;
            }
        } else
        if (collection instanceof EnumSet)
        {
            return ImmutableEnumSet.asImmutable(EnumSet.copyOf((EnumSet)collection));
        }
        collection = ((Collection) (collection.toArray()));
        return a(collection.length, collection);
    }

    public static ImmutableSet copyOf(Iterator iterator1)
    {
        if (!iterator1.hasNext())
        {
            return of();
        }
        Object obj = iterator1.next();
        if (!iterator1.hasNext())
        {
            return of(obj);
        } else
        {
            return (new bg()).c(obj).b(iterator1).a();
        }
    }

    public static ImmutableSet copyOf(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return a(aobj.length, (Object[])((Object []) (aobj)).clone());

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return of(aobj[0]);
        }
    }

    public static ImmutableSet of()
    {
        return EmptyImmutableSet.INSTANCE;
    }

    public static ImmutableSet of(Object obj)
    {
        return new SingletonImmutableSet(obj);
    }

    public static ImmutableSet of(Object obj, Object obj1)
    {
        return a(2, new Object[] {
            obj, obj1
        });
    }

    public static ImmutableSet of(Object obj, Object obj1, Object obj2)
    {
        return a(3, new Object[] {
            obj, obj1, obj2
        });
    }

    public static ImmutableSet of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return a(4, new Object[] {
            obj, obj1, obj2, obj3
        });
    }

    public static ImmutableSet of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return a(5, new Object[] {
            obj, obj1, obj2, obj3, obj4
        });
    }

    public static transient ImmutableSet of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object aobj[])
    {
        Object aobj1[] = new Object[aobj.length + 6];
        aobj1[0] = obj;
        aobj1[1] = obj1;
        aobj1[2] = obj2;
        aobj1[3] = obj3;
        aobj1[4] = obj4;
        aobj1[5] = obj5;
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 6, aobj.length);
        return a(aobj1.length, aobj1);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet)obj).isHashCodeFast() && hashCode() != obj.hashCode())
        {
            return false;
        } else
        {
            return ed.a(this, obj);
        }
    }

    public int hashCode()
    {
        return ed.a(this);
    }

    boolean isHashCodeFast()
    {
        return false;
    }

    public abstract ej iterator();

    public volatile Iterator iterator()
    {
        return iterator();
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }


    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object elements[];

        Object readResolve()
        {
            return ImmutableSet.copyOf(elements);
        }

        SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }

}
