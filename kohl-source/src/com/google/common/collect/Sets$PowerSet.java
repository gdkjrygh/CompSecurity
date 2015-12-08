// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Sets, ImmutableSet, ImmutableList, UnmodifiableIterator, 
//            AbstractIndexedListIterator

private static final class ize extends AbstractSet
{
    private static final class BitFilteredSetIterator extends UnmodifiableIterator
    {

        final ImmutableList input;
        int remainingSetBits;

        public boolean hasNext()
        {
            return remainingSetBits != 0;
        }

        public Object next()
        {
            int i = Integer.numberOfTrailingZeros(remainingSetBits);
            if (i == 32)
            {
                throw new NoSuchElementException();
            } else
            {
                remainingSetBits = remainingSetBits & ~(1 << i);
                return input.get(i);
            }
        }

        BitFilteredSetIterator(ImmutableList immutablelist, int i)
        {
            input = immutablelist;
            remainingSetBits = i;
        }
    }


    final ImmutableList inputList;
    final ImmutableSet inputSet;
    final int powerSetSize;

    public boolean contains(Object obj)
    {
        if (obj instanceof Set)
        {
            obj = (Set)obj;
            return inputSet.containsAll(((java.util.Collection) (obj)));
        } else
        {
            return false;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ontainsAll)
        {
            obj = (ontainsAll)obj;
            return inputSet.equals(((quals) (obj)).inputSet);
        } else
        {
            return super.equals(obj);
        }
    }

    public int hashCode()
    {
        return inputSet.hashCode() << inputSet.size() - 1;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return new AbstractIndexedListIterator(powerSetSize) {

            final Sets.PowerSet this$0;

            protected volatile Object get(int i)
            {
                return get(i);
            }

            protected Set get(int i)
            {
                return i. new AbstractSet() {

                    final _cls1 this$1;
                    final int val$setBits;

                    public Iterator iterator()
                    {
                        return new BitFilteredSetIterator(inputList, setBits);
                    }

                    public int size()
                    {
                        return Integer.bitCount(setBits);
                    }

            
            {
                this$1 = final__pcls1;
                setBits = I.this;
                super();
            }
                };
            }

            
            {
                this$0 = Sets.PowerSet.this;
                super(i);
            }
        };
    }

    public int size()
    {
        return powerSetSize;
    }

    public String toString()
    {
        return (new StringBuilder()).append("powerSet(").append(inputSet).append(")").toString();
    }

    dListIterator(ImmutableSet immutableset)
    {
        inputSet = immutableset;
        inputList = immutableset.asList();
        powerSetSize = 1 << immutableset.size();
    }
}
