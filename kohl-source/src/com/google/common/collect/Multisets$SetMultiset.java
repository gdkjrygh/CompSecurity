// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, Multiset, Multisets, ForwardingSet

private static class l extends ForwardingCollection
    implements Multiset, Serializable
{
    class ElementSet extends ForwardingSet
    {

        final Multisets.SetMultiset this$0;

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

        ElementSet()
        {
            this$0 = Multisets.SetMultiset.this;
            super();
        }
    }

    class EntrySet extends AbstractSet
    {

        final Multisets.SetMultiset this$0;

        public Iterator iterator()
        {
            return new Iterator() {

                final Iterator elements;
                final EntrySet this$1;

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
                this$1 = EntrySet.this;
                super();
                elements = _flddelegate.iterator();
            }
            };
        }

        public int size()
        {
            return _flddelegate.size();
        }

        EntrySet()
        {
            this$0 = Multisets.SetMultiset.this;
            super();
        }
    }


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

    EntrySet.this._cls0(Set set)
    {
        _flddelegate = (Set)Preconditions.checkNotNull(set);
    }
}
