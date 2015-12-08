// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            PrimitiveArrayBuilder

public final class ArrayBuilders
{
    private static final class ArrayIterator
        implements Iterable, Iterator
    {

        private final Object _array[];
        private int _index;

        public final boolean hasNext()
        {
            return _index < _array.length;
        }

        public final Iterator iterator()
        {
            return this;
        }

        public final Object next()
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

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        public ArrayIterator(Object aobj[])
        {
            _array = aobj;
            _index = 0;
        }
    }

    public static final class BooleanBuilder extends PrimitiveArrayBuilder
    {

        public final volatile Object _constructArray(int i)
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

    public static final class ByteBuilder extends PrimitiveArrayBuilder
    {

        public final volatile Object _constructArray(int i)
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

    public static final class DoubleBuilder extends PrimitiveArrayBuilder
    {

        public final volatile Object _constructArray(int i)
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

    public static final class FloatBuilder extends PrimitiveArrayBuilder
    {

        public final volatile Object _constructArray(int i)
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

    public static final class IntBuilder extends PrimitiveArrayBuilder
    {

        public final volatile Object _constructArray(int i)
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

    public static final class LongBuilder extends PrimitiveArrayBuilder
    {

        public final volatile Object _constructArray(int i)
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

    public static final class ShortBuilder extends PrimitiveArrayBuilder
    {

        public final volatile Object _constructArray(int i)
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

    public static Iterable arrayAsIterable(Object aobj[])
    {
        return new ArrayIterator(aobj);
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

    public final BooleanBuilder getBooleanBuilder()
    {
        if (_booleanBuilder == null)
        {
            _booleanBuilder = new BooleanBuilder();
        }
        return _booleanBuilder;
    }

    public final ByteBuilder getByteBuilder()
    {
        if (_byteBuilder == null)
        {
            _byteBuilder = new ByteBuilder();
        }
        return _byteBuilder;
    }

    public final DoubleBuilder getDoubleBuilder()
    {
        if (_doubleBuilder == null)
        {
            _doubleBuilder = new DoubleBuilder();
        }
        return _doubleBuilder;
    }

    public final FloatBuilder getFloatBuilder()
    {
        if (_floatBuilder == null)
        {
            _floatBuilder = new FloatBuilder();
        }
        return _floatBuilder;
    }

    public final IntBuilder getIntBuilder()
    {
        if (_intBuilder == null)
        {
            _intBuilder = new IntBuilder();
        }
        return _intBuilder;
    }

    public final LongBuilder getLongBuilder()
    {
        if (_longBuilder == null)
        {
            _longBuilder = new LongBuilder();
        }
        return _longBuilder;
    }

    public final ShortBuilder getShortBuilder()
    {
        if (_shortBuilder == null)
        {
            _shortBuilder = new ShortBuilder();
        }
        return _shortBuilder;
    }
}
