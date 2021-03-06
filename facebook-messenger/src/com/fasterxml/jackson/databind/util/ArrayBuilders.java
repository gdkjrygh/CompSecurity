// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ArrayBuilders
{

    BooleanBuilder _booleanBuilder;
    ByteBuilder _byteBuilder;
    DoubleBuilder _doubleBuilder;
    FloatBuilder _floatBuilder;
    IntBuilder _intBuilder;
    LongBuilder _longBuilder;
    ShortBuilder _shortBuilder;

    public ArrayBuilders()
    {
        _booleanBuilder = null;
        _byteBuilder = null;
        _shortBuilder = null;
        _intBuilder = null;
        _longBuilder = null;
        _floatBuilder = null;
        _doubleBuilder = null;
    }

    public static List addToList(List list, Object obj)
    {
        Object obj1 = list;
        if (list == null)
        {
            obj1 = new ArrayList();
        }
        ((List) (obj1)).add(obj);
        return ((List) (obj1));
    }

    public static Iterable arrayAsIterable(Object aobj[])
    {
        return new ArrayIterator(aobj);
    }

    public static Iterator arrayAsIterator(Object aobj[])
    {
        return new ArrayIterator(aobj);
    }

    public static ArrayList arrayToList(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        if (aobj != null)
        {
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(aobj[i]);
            }

        }
        return arraylist;
    }

    public static HashSet arrayToSet(Object aobj[])
    {
        HashSet hashset = new HashSet();
        if (aobj != null)
        {
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                hashset.add(aobj[i]);
            }

        }
        return hashset;
    }

    public static Object[] insertInList(Object aobj[], Object obj)
    {
        int i = aobj.length;
        Object aobj1[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i + 1);
        if (i > 0)
        {
            System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 1, i);
        }
        aobj1[0] = obj;
        return aobj1;
    }

    public static Object[] insertInListNoDup(Object aobj[], Object obj)
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            if (aobj[i] == obj)
            {
                if (i == 0)
                {
                    return aobj;
                } else
                {
                    Object aobj1[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j);
                    System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 1, i);
                    aobj[0] = obj;
                    return aobj1;
                }
            }
        }

        Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j + 1);
        if (j > 0)
        {
            System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 1, j);
        }
        aobj2[0] = obj;
        return aobj2;
    }

    public static HashSet setAndArray(Set set, Object aobj[])
    {
        HashSet hashset = new HashSet();
        if (set != null)
        {
            hashset.addAll(set);
        }
        if (aobj != null)
        {
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                hashset.add(aobj[i]);
            }

        }
        return hashset;
    }

    public BooleanBuilder getBooleanBuilder()
    {
        if (_booleanBuilder == null)
        {
            _booleanBuilder = new BooleanBuilder();
        }
        return _booleanBuilder;
    }

    public ByteBuilder getByteBuilder()
    {
        if (_byteBuilder == null)
        {
            _byteBuilder = new ByteBuilder();
        }
        return _byteBuilder;
    }

    public DoubleBuilder getDoubleBuilder()
    {
        if (_doubleBuilder == null)
        {
            _doubleBuilder = new DoubleBuilder();
        }
        return _doubleBuilder;
    }

    public FloatBuilder getFloatBuilder()
    {
        if (_floatBuilder == null)
        {
            _floatBuilder = new FloatBuilder();
        }
        return _floatBuilder;
    }

    public IntBuilder getIntBuilder()
    {
        if (_intBuilder == null)
        {
            _intBuilder = new IntBuilder();
        }
        return _intBuilder;
    }

    public LongBuilder getLongBuilder()
    {
        if (_longBuilder == null)
        {
            _longBuilder = new LongBuilder();
        }
        return _longBuilder;
    }

    public ShortBuilder getShortBuilder()
    {
        if (_shortBuilder == null)
        {
            _shortBuilder = new ShortBuilder();
        }
        return _shortBuilder;
    }

    private class ArrayIterator
        implements Iterable, Iterator
    {

        private final Object _array[];
        private int _index;

        public boolean hasNext()
        {
            return _index < _array.length;
        }

        public Iterator iterator()
        {
            return this;
        }

        public Object next()
        {
            if (_index >= _array.length)
            {
                throw new NoSuchElementException();
            } else
            {
                Object aobj[] = _array;
                int i = _index;
                _index = i + 1;
                return aobj[i];
            }
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public ArrayIterator(Object aobj[])
        {
            _array = aobj;
            _index = 0;
        }
    }


    private class BooleanBuilder extends PrimitiveArrayBuilder
    {

        public volatile Object _constructArray(int i)
        {
            return _constructArray(i);
        }

        public final boolean[] _constructArray(int i)
        {
            return new boolean[i];
        }

        public BooleanBuilder()
        {
        }
    }


    private class ByteBuilder extends PrimitiveArrayBuilder
    {

        public volatile Object _constructArray(int i)
        {
            return _constructArray(i);
        }

        public final byte[] _constructArray(int i)
        {
            return new byte[i];
        }

        public ByteBuilder()
        {
        }
    }


    private class DoubleBuilder extends PrimitiveArrayBuilder
    {

        public volatile Object _constructArray(int i)
        {
            return _constructArray(i);
        }

        public final double[] _constructArray(int i)
        {
            return new double[i];
        }

        public DoubleBuilder()
        {
        }
    }


    private class FloatBuilder extends PrimitiveArrayBuilder
    {

        public volatile Object _constructArray(int i)
        {
            return _constructArray(i);
        }

        public final float[] _constructArray(int i)
        {
            return new float[i];
        }

        public FloatBuilder()
        {
        }
    }


    private class IntBuilder extends PrimitiveArrayBuilder
    {

        public volatile Object _constructArray(int i)
        {
            return _constructArray(i);
        }

        public final int[] _constructArray(int i)
        {
            return new int[i];
        }

        public IntBuilder()
        {
        }
    }


    private class LongBuilder extends PrimitiveArrayBuilder
    {

        public volatile Object _constructArray(int i)
        {
            return _constructArray(i);
        }

        public final long[] _constructArray(int i)
        {
            return new long[i];
        }

        public LongBuilder()
        {
        }
    }


    private class ShortBuilder extends PrimitiveArrayBuilder
    {

        public volatile Object _constructArray(int i)
        {
            return _constructArray(i);
        }

        public final short[] _constructArray(int i)
        {
            return new short[i];
        }

        public ShortBuilder()
        {
        }
    }

}
