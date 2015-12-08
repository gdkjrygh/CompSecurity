// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multiset, Iterators, ForwardingCollection, ForwardingSet, 
//            ForwardingMultiset, AbstractMultiset, Sets, AbstractIterator

public final class Multisets
{
    static abstract class AbstractEntry
        implements Multiset.Entry
    {

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                flag = flag1;
                if (getCount() == ((Multiset.Entry) (obj)).getCount())
                {
                    flag = flag1;
                    if (Objects.equal(getElement(), ((Multiset.Entry) (obj)).getElement()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            Object obj = getElement();
            int i;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = obj.hashCode();
            }
            return i ^ getCount();
        }

        public String toString()
        {
            String s = String.valueOf(getElement());
            int i = getCount();
            if (i == 1)
            {
                return s;
            } else
            {
                return (new StringBuilder()).append(s).append(" x ").append(i).toString();
            }
        }

        AbstractEntry()
        {
        }
    }

    private static final class ElementSetImpl extends AbstractSet
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Multiset multiset;

        public boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public void clear()
        {
            multiset.clear();
        }

        public boolean contains(Object obj)
        {
            return multiset.contains(obj);
        }

        public boolean containsAll(Collection collection)
        {
            return multiset.containsAll(collection);
        }

        public boolean isEmpty()
        {
            return multiset.isEmpty();
        }

        public Iterator iterator()
        {
            return multiset.entrySet().iterator(). new Iterator() {

                final ElementSetImpl this$0;
                final Iterator val$entryIterator;

                public boolean hasNext()
                {
                    return entryIterator.hasNext();
                }

                public Object next()
                {
                    return ((Multiset.Entry)entryIterator.next()).getElement();
                }

                public void remove()
                {
                    entryIterator.remove();
                }

            
            {
                this$0 = final_elementsetimpl;
                entryIterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            int i = multiset.count(obj);
            if (i > 0)
            {
                multiset.remove(obj, i);
                return true;
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return multiset.entrySet().size();
        }

        ElementSetImpl(Multiset multiset1)
        {
            multiset = multiset1;
        }
    }

    static final class MultisetIteratorImpl
        implements Iterator
    {

        private boolean canRemove;
        private Multiset.Entry currentEntry;
        private final Iterator entryIterator;
        private int laterCount;
        private final Multiset multiset;
        private int totalCount;

        public boolean hasNext()
        {
            return laterCount > 0 || entryIterator.hasNext();
        }

        public Object next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            }
            if (laterCount == 0)
            {
                currentEntry = (Multiset.Entry)entryIterator.next();
                int i = currentEntry.getCount();
                laterCount = i;
                totalCount = i;
            }
            laterCount = laterCount - 1;
            canRemove = true;
            return currentEntry.getElement();
        }

        public void remove()
        {
            Preconditions.checkState(canRemove, "no calls to next() since the last call to remove()");
            if (totalCount == 1)
            {
                entryIterator.remove();
            } else
            {
                multiset.remove(currentEntry.getElement());
            }
            totalCount = totalCount - 1;
            canRemove = false;
        }

        MultisetIteratorImpl(Multiset multiset1, Iterator iterator)
        {
            multiset = multiset1;
            entryIterator = iterator;
        }
    }

    private static class SetMultiset extends ForwardingCollection
        implements Multiset, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Set _flddelegate;
        transient Set elementSet;
        transient Set entrySet;

        public int add(Object obj, int i)
        {
            throw new UnsupportedOperationException();
        }

        public boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public int count(Object obj)
        {
            return !_flddelegate.contains(obj) ? 0 : 1;
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return _flddelegate;
        }

        public Set elementSet()
        {
            Set set = elementSet;
            Object obj = set;
            if (set == null)
            {
                obj = new ElementSet();
                elementSet = ((Set) (obj));
            }
            return ((Set) (obj));
        }

        public Set entrySet()
        {
            Set set = entrySet;
            Object obj = set;
            if (set == null)
            {
                obj = new EntrySet();
                entrySet = ((Set) (obj));
            }
            return ((Set) (obj));
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset)
            {
                obj = (Multiset)obj;
                flag = flag1;
                if (size() == ((Multiset) (obj)).size())
                {
                    flag = flag1;
                    if (_flddelegate.equals(((Multiset) (obj)).elementSet()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            int i = 0;
            Iterator iterator = iterator();
            while (iterator.hasNext()) 
            {
                Object obj = iterator.next();
                int j;
                if (obj == null)
                {
                    j = 0;
                } else
                {
                    j = obj.hashCode();
                }
                i += j ^ true;
            }
            return i;
        }

        public int remove(Object obj, int i)
        {
            boolean flag = true;
            if (i == 0)
            {
                i = count(obj);
            } else
            {
                boolean flag1;
                if (i > 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkArgument(flag1);
                i = ((flag) ? 1 : 0);
                if (!_flddelegate.remove(obj))
                {
                    return 0;
                }
            }
            return i;
        }

        public int setCount(Object obj, int i)
        {
            Multisets.checkNonnegative(i, "count");
            if (i == count(obj))
            {
                return i;
            }
            if (i == 0)
            {
                remove(obj);
                return 1;
            } else
            {
                throw new UnsupportedOperationException();
            }
        }

        public boolean setCount(Object obj, int i, int j)
        {
            return Multisets.setCountImpl(this, obj, i, j);
        }

        SetMultiset(Set set)
        {
            _flddelegate = (Set)Preconditions.checkNotNull(set);
        }
    }

    class SetMultiset.ElementSet extends ForwardingSet
    {

        final SetMultiset this$0;

        public boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return _flddelegate;
        }

        SetMultiset.ElementSet()
        {
            this$0 = SetMultiset.this;
            super();
        }
    }

    class SetMultiset.EntrySet extends AbstractSet
    {

        final SetMultiset this$0;

        public Iterator iterator()
        {
            return new Iterator() {

                final Iterator elements;
                final SetMultiset.EntrySet this$1;

                public boolean hasNext()
                {
                    return elements.hasNext();
                }

                public Multiset.Entry next()
                {
                    return Multisets.immutableEntry(elements.next(), 1);
                }

                public volatile Object next()
                {
                    return next();
                }

                public void remove()
                {
                    elements.remove();
                }

            
            {
                this$1 = SetMultiset.EntrySet.this;
                super();
                elements = _flddelegate.iterator();
            }
            };
        }

        public int size()
        {
            return _flddelegate.size();
        }

        SetMultiset.EntrySet()
        {
            this$0 = SetMultiset.this;
            super();
        }
    }

    private static class UnmodifiableMultiset extends ForwardingMultiset
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Multiset _flddelegate;
        transient Set elementSet;
        transient Set entrySet;

        public int add(Object obj, int i)
        {
            throw new UnsupportedOperationException();
        }

        public boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public void clear()
        {
            throw new UnsupportedOperationException();
        }

        protected Multiset _mthdelegate()
        {
            return _flddelegate;
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        public Set elementSet()
        {
            Set set1 = elementSet;
            Set set = set1;
            if (set1 == null)
            {
                set = Collections.unmodifiableSet(_flddelegate.elementSet());
                elementSet = set;
            }
            return set;
        }

        public Set entrySet()
        {
            Set set1 = entrySet;
            Set set = set1;
            if (set1 == null)
            {
                set = Collections.unmodifiableSet(_flddelegate.entrySet());
                entrySet = set;
            }
            return set;
        }

        public Iterator iterator()
        {
            return Iterators.unmodifiableIterator(_flddelegate.iterator());
        }

        public int remove(Object obj, int i)
        {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public int setCount(Object obj, int i)
        {
            throw new UnsupportedOperationException();
        }

        public boolean setCount(Object obj, int i, int j)
        {
            throw new UnsupportedOperationException();
        }

        UnmodifiableMultiset(Multiset multiset)
        {
            _flddelegate = multiset;
        }
    }


    private Multisets()
    {
    }

    static boolean addAllImpl(Multiset multiset, Collection collection)
    {
        if (collection.isEmpty())
        {
            return false;
        }
        if (collection instanceof Multiset)
        {
            Multiset.Entry entry;
            for (collection = cast(collection).entrySet().iterator(); collection.hasNext(); multiset.add(entry.getElement(), entry.getCount()))
            {
                entry = (Multiset.Entry)collection.next();
            }

        } else
        {
            Iterators.addAll(multiset, collection.iterator());
        }
        return true;
    }

    static Multiset cast(Iterable iterable)
    {
        return (Multiset)iterable;
    }

    static void checkNonnegative(int i, String s)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "%s cannot be negative: %s", new Object[] {
            s, Integer.valueOf(i)
        });
    }

    static Set elementSetImpl(Multiset multiset)
    {
        return new ElementSetImpl(multiset);
    }

    static boolean equalsImpl(Multiset multiset, Object obj)
    {
        if (obj != multiset) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj instanceof Multiset)
        {
            obj = (Multiset)obj;
            if (multiset.size() != ((Multiset) (obj)).size() || multiset.entrySet().size() != ((Multiset) (obj)).entrySet().size())
            {
                return false;
            }
            obj = ((Multiset) (obj)).entrySet().iterator();
            Multiset.Entry entry;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                entry = (Multiset.Entry)((Iterator) (obj)).next();
            } while (multiset.count(entry.getElement()) == entry.getCount());
            break; /* Loop/switch isn't completed */
        } else
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    static Multiset forSet(Set set)
    {
        return new SetMultiset(set);
    }

    public static Multiset.Entry immutableEntry(Object obj, int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new AbstractEntry(obj, i) {

            final Object val$e;
            final int val$n;

            public int getCount()
            {
                return n;
            }

            public Object getElement()
            {
                return e;
            }

            
            {
                e = obj;
                n = i;
                super();
            }
        };
    }

    static int inferDistinctElements(Iterable iterable)
    {
        if (iterable instanceof Multiset)
        {
            return ((Multiset)iterable).elementSet().size();
        } else
        {
            return 11;
        }
    }

    public static Multiset intersection(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        return new AbstractMultiset(multiset, multiset1) {

            final Set entrySet = new _cls1();
            final Multiset val$multiset1;
            final Multiset val$multiset2;

            public int count(Object obj)
            {
                int i = multiset1.count(obj);
                if (i == 0)
                {
                    return 0;
                } else
                {
                    return Math.min(i, multiset2.count(obj));
                }
            }

            Set createElementSet()
            {
                return Sets.intersection(multiset1.elementSet(), multiset2.elementSet());
            }

            public Set entrySet()
            {
                return entrySet;
            }

            
            {
                multiset1 = multiset;
                multiset2 = multiset3;
                super();
            }
        };
    }

    static Iterator iteratorImpl(Multiset multiset)
    {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static boolean removeAllImpl(Multiset multiset, Collection collection)
    {
        if (collection instanceof Multiset)
        {
            collection = ((Multiset)collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    static boolean retainAllImpl(Multiset multiset, Collection collection)
    {
        if (collection instanceof Multiset)
        {
            collection = ((Multiset)collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    static int setCountImpl(Multiset multiset, Object obj, int i)
    {
        checkNonnegative(i, "count");
        int j = multiset.count(obj);
        i -= j;
        if (i > 0)
        {
            multiset.add(obj, i);
        } else
        if (i < 0)
        {
            multiset.remove(obj, -i);
            return j;
        }
        return j;
    }

    static boolean setCountImpl(Multiset multiset, Object obj, int i, int j)
    {
        checkNonnegative(i, "oldCount");
        checkNonnegative(j, "newCount");
        if (multiset.count(obj) == i)
        {
            multiset.setCount(obj, j);
            return true;
        } else
        {
            return false;
        }
    }

    static int sizeImpl(Multiset multiset)
    {
        long l = 0L;
        for (multiset = multiset.entrySet().iterator(); multiset.hasNext();)
        {
            l += ((Multiset.Entry)multiset.next()).getCount();
        }

        return Ints.saturatedCast(l);
    }

    public static Multiset unmodifiableMultiset(Multiset multiset)
    {
        return new UnmodifiableMultiset((Multiset)Preconditions.checkNotNull(multiset));
    }

    // Unreferenced inner class com/google/common/collect/Multisets$2$1

/* anonymous class */
    class _cls1 extends AbstractSet
    {

        final _cls2 this$0;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                int i = ((Multiset.Entry) (obj)).getCount();
                flag = flag1;
                if (i > 0)
                {
                    flag = flag1;
                    if (count(((Multiset.Entry) (obj)).getElement()) == i)
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public boolean isEmpty()
        {
            return elementSet().isEmpty();
        }

        public Iterator iterator()
        {
            return multiset1.entrySet().iterator(). new AbstractIterator() {

                final _cls1 this$1;
                final Iterator val$iterator1;

                protected Multiset.Entry computeNext()
                {
                    while (iterator1.hasNext()) 
                    {
                        Multiset.Entry entry = (Multiset.Entry)iterator1.next();
                        Object obj = entry.getElement();
    class _cls1 extends AbstractSet
    {
                        int i = Math.min(entry.getCount(), multiset2.count(obj));
                        if (i > 0)
                        {
                            return Multisets.immutableEntry(obj, i);
                        }
                    }
                    return (Multiset.Entry)endOfData();
                }

                protected volatile Object computeNext()
                {
                    return computeNext();
                }

            
            {
                this$1 = final__pcls1;
                iterator1 = Iterator.this;
                super();
            }
            };
        }

        public int size()
        {
            return elementSet().size();
        }

            
            {
                this$0 = _cls2.this;
                super();
            }
    }

}
