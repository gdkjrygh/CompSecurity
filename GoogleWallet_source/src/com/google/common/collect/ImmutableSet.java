// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, ObjectArrays, Hashing, SingletonImmutableSet, 
//            RegularImmutableSet, ImmutableSortedSet, ImmutableEnumSet, EmptyImmutableSet, 
//            Sets, UnmodifiableIterator

public abstract class ImmutableSet extends ImmutableCollection
    implements Set
{
    public static final class Builder extends ImmutableCollection.ArrayBasedBuilder
    {

        private Builder addAll(Iterable iterable)
        {
            super.addAll(iterable);
            return this;
        }

        private Builder addAll(Iterator iterator1)
        {
            super.addAll(iterator1);
            return this;
        }

        public final volatile ImmutableCollection.ArrayBasedBuilder add(Object obj)
        {
            return add(obj);
        }

        public final volatile ImmutableCollection.Builder add(Object obj)
        {
            return add(obj);
        }

        public final Builder add(Object obj)
        {
            super.add(obj);
            return this;
        }

        public final volatile ImmutableCollection.Builder addAll(Iterable iterable)
        {
            return addAll(iterable);
        }

        public final volatile ImmutableCollection.Builder addAll(Iterator iterator1)
        {
            return addAll(iterator1);
        }

        public final ImmutableSet build()
        {
            ImmutableSet immutableset = ImmutableSet.construct(size, contents);
            size = immutableset.size();
            return immutableset;
        }

        public Builder()
        {
            this(4);
        }

        private Builder(int i)
        {
            super(i);
        }
    }

    static final class SerializedForm
        implements Serializable
    {

        final Object elements[];

        SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }


    ImmutableSet()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    private static int chooseTableSize(int i)
    {
        int k = 0x40000000;
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
            Preconditions.checkArgument(flag, "collection too large");
        }
        return k;
    }

    private static transient ImmutableSet construct(int i, Object aobj[])
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 134
    //                   1 138;
           goto _L1 _L2 _L3
_L1:
        Object aobj1[];
        int j;
        int k;
        int l;
        int j1;
        int k1;
        j1 = chooseTableSize(i);
        aobj1 = new Object[j1];
        k1 = j1 - 1;
        l = 0;
        k = 0;
        j = 0;
_L12:
        if (k >= i) goto _L5; else goto _L4
_L4:
        Object obj;
        int i1;
        int l1;
        obj = ObjectArrays.checkElementNotNull(aobj[k], k);
        l1 = obj.hashCode();
        i1 = Hashing.smear(l1);
_L10:
        Object obj1;
        int i2;
        i2 = i1 & k1;
        obj1 = aobj1[i2];
        if (obj1 != null) goto _L7; else goto _L6
_L6:
        i1 = j + 1;
        aobj[j] = obj;
        aobj1[i2] = obj;
        l += l1;
        j = i1;
_L9:
        k++;
        continue; /* Loop/switch isn't completed */
_L2:
        return of();
_L3:
        return of(aobj[0]);
_L7:
        if (obj1.equals(obj)) goto _L9; else goto _L8
_L8:
        i1++;
        if (true) goto _L10; else goto _L5
_L5:
        Arrays.fill(aobj, j, i, null);
        if (j == 1)
        {
            return new SingletonImmutableSet(aobj[0], l);
        }
        if (j1 != chooseTableSize(j))
        {
            return construct(j, aobj);
        }
        if (j < aobj.length)
        {
            aobj = ObjectArrays.arraysCopyOf(aobj, j);
        }
        return new RegularImmutableSet(aobj, l, aobj1, k1);
        if (true) goto _L12; else goto _L11
_L11:
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
            return copyOfEnumSet((EnumSet)collection);
        }
        collection = ((Collection) (collection.toArray()));
        return construct(collection.length, collection);
    }

    public static ImmutableSet copyOf(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return construct(aobj.length, (Object[])((Object []) (aobj)).clone());

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return of(aobj[0]);
        }
    }

    private static ImmutableSet copyOfEnumSet(EnumSet enumset)
    {
        return ImmutableEnumSet.asImmutable(EnumSet.copyOf(enumset));
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
        return construct(2, new Object[] {
            obj, obj1
        });
    }

    public static ImmutableSet of(Object obj, Object obj1, Object obj2)
    {
        return construct(3, new Object[] {
            obj, obj1, obj2
        });
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
            return Sets.equalsImpl(this, obj);
        }
    }

    public int hashCode()
    {
        return Sets.hashCodeImpl(this);
    }

    boolean isHashCodeFast()
    {
        return false;
    }

    public abstract UnmodifiableIterator iterator();

    public volatile Iterator iterator()
    {
        return iterator();
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }

}
