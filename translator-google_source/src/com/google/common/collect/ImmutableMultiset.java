// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.c.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, dl, RegularImmutableMultiset, ImmutableMap, 
//            bf, dm, aw, Multisets, 
//            LinkedHashMultiset, bl, ImmutableSet, ed, 
//            be, ej

public abstract class ImmutableMultiset extends ImmutableCollection
    implements dl
{

    private static final ImmutableMultiset a = new RegularImmutableMultiset(ImmutableMap.of(), 0);
    private transient ImmutableSet b;

    ImmutableMultiset()
    {
    }

    private static ImmutableMultiset a(dl dl1)
    {
        return copyFromEntries(dl1.entrySet());
    }

    public static bf builder()
    {
        return new bf();
    }

    static ImmutableMultiset copyFromEntries(Collection collection)
    {
        aw aw1 = ImmutableMap.builder();
        collection = collection.iterator();
        long l = 0L;
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            dm dm1 = (dm)collection.next();
            int i = dm1.getCount();
            if (i > 0)
            {
                aw1.a(dm1.getElement(), Integer.valueOf(i));
                l = (long)i + l;
            }
        } while (true);
        if (l == 0L)
        {
            return of();
        } else
        {
            return new RegularImmutableMultiset(aw1.a(), com.google.common.c.a.a(l));
        }
    }

    public static ImmutableMultiset copyOf(Iterable iterable)
    {
        if (iterable instanceof ImmutableMultiset)
        {
            ImmutableMultiset immutablemultiset = (ImmutableMultiset)iterable;
            if (!immutablemultiset.isPartialView())
            {
                return immutablemultiset;
            }
        }
        if (iterable instanceof dl)
        {
            iterable = Multisets.b(iterable);
        } else
        {
            iterable = LinkedHashMultiset.create(iterable);
        }
        return a(iterable);
    }

    public static ImmutableMultiset copyOf(Iterator iterator1)
    {
        LinkedHashMultiset linkedhashmultiset = LinkedHashMultiset.create();
        com.google.common.collect.bl.a(linkedhashmultiset, iterator1);
        return a(linkedhashmultiset);
    }

    public static ImmutableMultiset copyOf(Object aobj[])
    {
        return copyOf(((Iterable) (Arrays.asList(aobj))));
    }

    public static ImmutableMultiset of()
    {
        return a;
    }

    public static ImmutableMultiset of(Object obj)
    {
        return copyOf(Arrays.asList(new Object[] {
            obj
        }));
    }

    public static ImmutableMultiset of(Object obj, Object obj1)
    {
        return copyOf(Arrays.asList(new Object[] {
            obj, obj1
        }));
    }

    public static ImmutableMultiset of(Object obj, Object obj1, Object obj2)
    {
        return copyOf(Arrays.asList(new Object[] {
            obj, obj1, obj2
        }));
    }

    public static ImmutableMultiset of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return copyOf(Arrays.asList(new Object[] {
            obj, obj1, obj2, obj3
        }));
    }

    public static ImmutableMultiset of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return copyOf(Arrays.asList(new Object[] {
            obj, obj1, obj2, obj3, obj4
        }));
    }

    public static transient ImmutableMultiset of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object aobj[])
    {
        return copyOf((new bf()).a(obj).a(obj1).a(obj2).a(obj3).a(obj4).a(obj5).b(aobj).a);
    }

    public final int add(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return count(obj) > 0;
    }

    public boolean containsAll(Collection collection)
    {
        return elementSet().containsAll(collection);
    }

    int copyIntoArray(Object aobj[], int i)
    {
        for (Iterator iterator1 = entrySet().iterator(); iterator1.hasNext();)
        {
            dm dm1 = (dm)iterator1.next();
            Arrays.fill(aobj, i, dm1.getCount() + i, dm1.getElement());
            i += dm1.getCount();
        }

        return i;
    }

    public ImmutableSet entrySet()
    {
        ImmutableSet immutableset = b;
        Object obj = immutableset;
        if (immutableset == null)
        {
            if (isEmpty())
            {
                obj = ImmutableSet.of();
            } else
            {
                obj = new EntrySet(null);
            }
            b = ((ImmutableSet) (obj));
        }
        return ((ImmutableSet) (obj));
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        return com.google.common.collect.Multisets.a(this, obj);
    }

    abstract dm getEntry(int i);

    public int hashCode()
    {
        return com.google.common.collect.ed.a(entrySet());
    }

    public ej iterator()
    {
        return new be(this, entrySet().iterator());
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public final int remove(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public final int setCount(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean setCount(Object obj, int i, int j)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return entrySet().toString();
    }

    Object writeReplace()
    {
        return new SerializedForm(this);
    }


    private class EntrySet extends ImmutableSet
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMultiset this$0;

        public final boolean contains(Object obj)
        {
            if (obj instanceof dm)
            {
                obj = (dm)obj;
                break MISSING_BLOCK_LABEL_12;
            }
            do
            {
                return false;
            } while (((dm) (obj)).getCount() <= 0 || count(((dm) (obj)).getElement()) != ((dm) (obj)).getCount());
            return true;
        }

        final ImmutableList createAsList()
        {
            class _cls1 extends ImmutableAsList
            {

                final EntrySet this$1;

                ImmutableCollection delegateCollection()
                {
                    return EntrySet.this;
                }

                public dm get(int i)
                {
                    return getEntry(i);
                }

                public volatile Object get(int i)
                {
                    return get(i);
                }

                _cls1()
                {
                    this$1 = EntrySet.this;
                    super();
                }
            }

            return new _cls1();
        }

        public final int hashCode()
        {
            return ImmutableMultiset.this.hashCode();
        }

        final boolean isPartialView()
        {
            return ImmutableMultiset.this.isPartialView();
        }

        public final ej iterator()
        {
            return asList().iterator();
        }

        public final volatile Iterator iterator()
        {
            return iterator();
        }

        public final int size()
        {
            return elementSet().size();
        }

        final Object writeReplace()
        {
            return new EntrySetSerializedForm();
        }

        private EntrySet()
        {
            this$0 = ImmutableMultiset.this;
            super();
        }

        EntrySet(be be1)
        {
            this();
        }

        private class EntrySetSerializedForm
            implements Serializable
        {

            final ImmutableMultiset multiset;

            Object readResolve()
            {
                return multiset.entrySet();
            }

            EntrySetSerializedForm()
            {
                multiset = ImmutableMultiset.this;
            }
        }

    }


    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final int counts[];
        final Object elements[];

        Object readResolve()
        {
            LinkedHashMultiset linkedhashmultiset = LinkedHashMultiset.create(elements.length);
            for (int i = 0; i < elements.length; i++)
            {
                linkedhashmultiset.add(elements[i], counts[i]);
            }

            return ImmutableMultiset.copyOf(linkedhashmultiset);
        }

        SerializedForm(dl dl1)
        {
            int i = dl1.entrySet().size();
            elements = new Object[i];
            counts = new int[i];
            dl1 = dl1.entrySet().iterator();
            for (int j = 0; dl1.hasNext(); j++)
            {
                dm dm1 = (dm)dl1.next();
                elements[j] = dm1.getElement();
                counts[j] = dm1.getCount();
            }

        }
    }

}
