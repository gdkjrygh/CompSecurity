// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap

private class ancestorDelegate extends AbstractCollection
{
    class WrappedIterator
        implements Iterator
    {

        final Iterator delegateIterator;
        final Collection originalDelegate;
        final AbstractMultimap.WrappedCollection this$1;

        Iterator getDelegateIterator()
        {
            validateIterator();
            return delegateIterator;
        }

        public boolean hasNext()
        {
            validateIterator();
            return delegateIterator.hasNext();
        }

        public Object next()
        {
            validateIterator();
            return delegateIterator.next();
        }

        public void remove()
        {
            delegateIterator.remove();
            int _tmp = AbstractMultimap.access$210(this$0);
            removeIfEmpty();
        }

        void validateIterator()
        {
            refreshIfEmpty();
            if (_flddelegate != originalDelegate)
            {
                throw new ConcurrentModificationException();
            } else
            {
                return;
            }
        }

        WrappedIterator()
        {
            this$1 = AbstractMultimap.WrappedCollection.this;
            super();
            originalDelegate = _flddelegate;
            delegateIterator = AbstractMultimap.access$100(this$0, _flddelegate);
        }

        WrappedIterator(Iterator iterator1)
        {
            this$1 = AbstractMultimap.WrappedCollection.this;
            super();
            originalDelegate = _flddelegate;
            delegateIterator = iterator1;
        }
    }


    final delegate ancestor;
    final Collection ancestorDelegate;
    Collection _flddelegate;
    final Object key;
    final AbstractMultimap this$0;

    public boolean add(Object obj)
    {
        refreshIfEmpty();
        boolean flag = _flddelegate.isEmpty();
        boolean flag1 = _flddelegate.add(obj);
        if (flag1)
        {
            int _tmp = AbstractMultimap.access$208(AbstractMultimap.this);
            if (flag)
            {
                addToMap();
            }
        }
        return flag1;
    }

    public boolean addAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = _flddelegate.addAll(collection);
            flag = flag1;
            if (flag1)
            {
                int j = _flddelegate.size();
                AbstractMultimap.access$212(AbstractMultimap.this, j - i);
                flag = flag1;
                if (i == 0)
                {
                    addToMap();
                    return flag1;
                }
            }
        }
        return flag;
    }

    void addToMap()
    {
        if (ancestor != null)
        {
            ancestor.addToMap();
            return;
        } else
        {
            AbstractMultimap.access$000(AbstractMultimap.this).put(key, _flddelegate);
            return;
        }
    }

    public void clear()
    {
        int i = size();
        if (i == 0)
        {
            return;
        } else
        {
            _flddelegate.clear();
            AbstractMultimap.access$220(AbstractMultimap.this, i);
            removeIfEmpty();
            return;
        }
    }

    public boolean contains(Object obj)
    {
        refreshIfEmpty();
        return _flddelegate.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        refreshIfEmpty();
        return _flddelegate.containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        } else
        {
            refreshIfEmpty();
            return _flddelegate.equals(obj);
        }
    }

    delegate getAncestor()
    {
        return ancestor;
    }

    Collection getDelegate()
    {
        return _flddelegate;
    }

    Object getKey()
    {
        return key;
    }

    public int hashCode()
    {
        refreshIfEmpty();
        return _flddelegate.hashCode();
    }

    public Iterator iterator()
    {
        refreshIfEmpty();
        return new WrappedIterator();
    }

    void refreshIfEmpty()
    {
        if (ancestor != null)
        {
            ancestor.refreshIfEmpty();
            if (ancestor.getDelegate() != ancestorDelegate)
            {
                throw new ConcurrentModificationException();
            }
        } else
        if (_flddelegate.isEmpty())
        {
            Collection collection = (Collection)AbstractMultimap.access$000(AbstractMultimap.this).get(key);
            if (collection != null)
            {
                _flddelegate = collection;
            }
        }
    }

    public boolean remove(Object obj)
    {
        refreshIfEmpty();
        boolean flag = _flddelegate.remove(obj);
        if (flag)
        {
            int _tmp = AbstractMultimap.access$210(AbstractMultimap.this);
            removeIfEmpty();
        }
        return flag;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = _flddelegate.removeAll(collection);
            flag = flag1;
            if (flag1)
            {
                int j = _flddelegate.size();
                AbstractMultimap.access$212(AbstractMultimap.this, j - i);
                removeIfEmpty();
                return flag1;
            }
        }
        return flag;
    }

    void removeIfEmpty()
    {
        if (ancestor != null)
        {
            ancestor.removeIfEmpty();
        } else
        if (_flddelegate.isEmpty())
        {
            AbstractMultimap.access$000(AbstractMultimap.this).remove(key);
            return;
        }
    }

    public boolean retainAll(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        int i = size();
        boolean flag = _flddelegate.retainAll(collection);
        if (flag)
        {
            int j = _flddelegate.size();
            AbstractMultimap.access$212(AbstractMultimap.this, j - i);
            removeIfEmpty();
        }
        return flag;
    }

    public int size()
    {
        refreshIfEmpty();
        return _flddelegate.size();
    }

    public String toString()
    {
        refreshIfEmpty();
        return _flddelegate.toString();
    }

    WrappedIterator.delegateIterator(Object obj, Collection collection, WrappedIterator.delegateIterator delegateiterator)
    {
        this$0 = AbstractMultimap.this;
        super();
        key = obj;
        _flddelegate = collection;
        ancestor = delegateiterator;
        if (delegateiterator == null)
        {
            abstractmultimap = null;
        } else
        {
            abstractmultimap = delegateiterator.getDelegate();
        }
        ancestorDelegate = AbstractMultimap.this;
    }
}
