// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Iterators, ObjectArrays, UnmodifiableListIterator, 
//            AbstractIndexedListIterator

abstract class TransformedImmutableList extends ImmutableList
{
    private class TransformedView extends TransformedImmutableList
    {

        final TransformedImmutableList this$0;

        public volatile ListIterator listIterator(int i)
        {
            return listIterator(i);
        }

        public volatile List subList(int i, int j)
        {
            return subList(i, j);
        }

        Object transform(Object obj)
        {
            return TransformedImmutableList.this.transform(obj);
        }

        TransformedView(ImmutableList immutablelist)
        {
            this$0 = TransformedImmutableList.this;
            super(immutablelist);
        }
    }


    private final transient ImmutableList backingList;

    TransformedImmutableList(ImmutableList immutablelist)
    {
        backingList = (ImmutableList)Preconditions.checkNotNull(immutablelist);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof List)
            {
                if (size() != ((List) (obj = (List)obj)).size() || !Iterators.elementsEqual(iterator(), ((List) (obj)).iterator()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public Object get(int i)
    {
        return transform(backingList.get(i));
    }

    public int hashCode()
    {
        int i = 1;
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
            i = i * 31 + j;
        }
        return i;
    }

    public int indexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= size())
                {
                    break label1;
                }
                j = i;
                if (get(i).equals(obj))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    boolean isPartialView()
    {
        return true;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i = size() - 1;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (get(i).equals(obj))
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public UnmodifiableListIterator listIterator(int i)
    {
        return new AbstractIndexedListIterator(size(), i) {

            final TransformedImmutableList this$0;

            protected Object get(int j)
            {
                return TransformedImmutableList.this.get(j);
            }

            
            {
                this$0 = TransformedImmutableList.this;
                super(i, j);
            }
        };
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }

    public int size()
    {
        return backingList.size();
    }

    public ImmutableList subList(int i, int j)
    {
        return new TransformedView(backingList.subList(i, j));
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    public Object[] toArray()
    {
        return ObjectArrays.toArrayImpl(this);
    }

    public Object[] toArray(Object aobj[])
    {
        return ObjectArrays.toArrayImpl(this, aobj);
    }

    abstract Object transform(Object obj);
}
