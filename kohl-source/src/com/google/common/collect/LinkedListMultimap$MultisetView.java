// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multiset, LinkedListMultimap, Iterators, Multisets

private class <init> extends AbstractCollection
    implements Multiset
{

    final LinkedListMultimap this$0;

    public int add(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public int count(Object obj)
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).count(obj);
    }

    public Set elementSet()
    {
        return keySet();
    }

    public Set entrySet()
    {
        return new AbstractSet() {

            final LinkedListMultimap.MultisetView this$1;

            public Iterator iterator()
            {
                return (new LinkedListMultimap.DistinctKeyIterator(this$0, null)). new Iterator() {

                    final _cls2 this$2;
                    final Iterator val$keyIterator;

                    public boolean hasNext()
                    {
                        return keyIterator.hasNext();
                    }

                    public Multiset.Entry next()
                    {
                        return ((_cls1) (keyIterator.next())). new Multisets.AbstractEntry() {

                            final _cls1 this$3;
                            final Object val$key;

                            public int getCount()
                            {
                                return LinkedListMultimap.access$500(this$0).count(key);
                            }

                            public Object getElement()
                            {
                                return key;
                            }

            
            {
                this$3 = final__pcls1;
                key = Object.this;
                super();
            }
                        };
                    }

                    public volatile Object next()
                    {
                        return next();
                    }

                    public void remove()
                    {
                        keyIterator.remove();
                    }

            
            {
                this$2 = final__pcls2;
                keyIterator = Iterator.this;
                super();
            }
                };
            }

            public int size()
            {
                return LinkedListMultimap.access$500(this$0).elementSet().size();
            }

            
            {
                this$1 = LinkedListMultimap.MultisetView.this;
                super();
            }
        };
    }

    public boolean equals(Object obj)
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).equals(obj);
    }

    public int hashCode()
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).hashCode();
    }

    public Iterator iterator()
    {
        return new Iterator() {

            final LinkedListMultimap.MultisetView this$1;
            final Iterator val$nodes;

            public boolean hasNext()
            {
                return nodes.hasNext();
            }

            public Object next()
            {
                return ((LinkedListMultimap.Node)nodes.next()).key;
            }

            public void remove()
            {
                nodes.remove();
            }

            
            {
                this$1 = LinkedListMultimap.MultisetView.this;
                nodes = iterator1;
                super();
            }
        };
    }

    public int remove(Object obj, int i)
    {
        int j;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        j = count(obj);
        for (obj = new erator(LinkedListMultimap.this, obj); i > 0 && ((Iterator) (obj)).hasNext(); i--)
        {
            ((Iterator) (obj)).next();
            ((Iterator) (obj)).remove();
        }

        return j;
    }

    public boolean removeAll(Collection collection)
    {
        return Iterators.removeAll(iterator(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return Iterators.retainAll(iterator(), collection);
    }

    public int setCount(Object obj, int i)
    {
        return Multisets.setCountImpl(this, obj, i);
    }

    public boolean setCount(Object obj, int i, int j)
    {
        return Multisets.setCountImpl(this, obj, i, j);
    }

    public int size()
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).size();
    }

    public String toString()
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).toString();
    }

    private _cls2.this._cls1()
    {
        this$0 = LinkedListMultimap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
