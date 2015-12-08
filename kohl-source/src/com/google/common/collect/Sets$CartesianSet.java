// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Sets, ImmutableList, UnmodifiableIterator, ImmutableSet

private static class t extends AbstractSet
{
    private class Axis
    {

        final ImmutableSet choices;
        final ImmutableList choicesList;
        final int dividend;
        final Sets.CartesianSet this$0;

        boolean contains(Object obj)
        {
            return choices.contains(obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof Axis)
            {
                obj = (Axis)obj;
                return choices.equals(((Axis) (obj)).choices);
            } else
            {
                return false;
            }
        }

        Object getForIndex(int i)
        {
            return choicesList.get((i / dividend) % size());
        }

        public int hashCode()
        {
            return (Sets.CartesianSet.this.size / choices.size()) * choices.hashCode();
        }

        int size()
        {
            return choices.size();
        }

        Axis(Set set, int i)
        {
            this$0 = Sets.CartesianSet.this;
            super();
            choices = ImmutableSet.copyOf(set);
            choicesList = choices.asList();
            dividend = i;
        }
    }


    final ImmutableList axes;
    final int size;

    public boolean contains(Object obj)
    {
        if (!(obj instanceof List))
        {
            return false;
        }
        obj = (List)obj;
        int j = axes.size();
        if (((List) (obj)).size() != j)
        {
            return false;
        }
        for (int i = 0; i < j; i++)
        {
            if (!((Axis)axes.get(i)).contains(((List) (obj)).get(i)))
            {
                return false;
            }
        }

        return true;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Axis.contains)
        {
            obj = (Axis.contains)obj;
            return axes.equals(((ls) (obj)).axes);
        } else
        {
            return super.equals(obj);
        }
    }

    public int hashCode()
    {
        int j = size - 1;
        for (int i = 0; i < axes.size(); i++)
        {
            j *= 31;
        }

        return axes.hashCode() + j;
    }

    public UnmodifiableIterator iterator()
    {
        return new UnmodifiableIterator() {

            int index;
            final Sets.CartesianSet this$0;

            public boolean hasNext()
            {
                return index < size;
            }

            public volatile Object next()
            {
                return next();
            }

            public List next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                }
                Object aobj[] = new Object[axes.size()];
                for (int i = 0; i < aobj.length; i++)
                {
                    aobj[i] = ((Axis)axes.get(i)).getForIndex(index);
                }

                index = index + 1;
                return ImmutableList.copyOf(aobj);
            }

            
            {
                this$0 = Sets.CartesianSet.this;
                super();
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return size;
    }

    Axis(List list)
    {
        long l = 1L;
        der der = ImmutableList.builder();
        for (list = list.iterator(); list.hasNext();)
        {
            Axis axis = new Axis((Set)list.next(), (int)l);
            der.add(axis);
            l *= axis.size();
        }

        axes = der.build();
        size = Ints.checkedCast(l);
    }
}
