// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            PrimitiveArrayBuilder

public final class ArrayBuilders
{
    public static final class BooleanBuilder extends PrimitiveArrayBuilder
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

    public static final class ByteBuilder extends PrimitiveArrayBuilder
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

    public static final class DoubleBuilder extends PrimitiveArrayBuilder
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

    public static final class FloatBuilder extends PrimitiveArrayBuilder
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

    public static final class IntBuilder extends PrimitiveArrayBuilder
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

    public static final class LongBuilder extends PrimitiveArrayBuilder
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

    public static final class ShortBuilder extends PrimitiveArrayBuilder
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


    private BooleanBuilder _booleanBuilder;
    private ByteBuilder _byteBuilder;
    private DoubleBuilder _doubleBuilder;
    private FloatBuilder _floatBuilder;
    private IntBuilder _intBuilder;
    private LongBuilder _longBuilder;
    private ShortBuilder _shortBuilder;

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

    public static Object getArrayComparator(Object obj)
    {
        int i = Array.getLength(obj);
        return new Object(obj.getClass(), i, obj) {

            final Object val$defaultValue;
            final Class val$defaultValueType;
            final int val$length;

            public boolean equals(Object obj1)
            {
                if (obj1 != this)
                {
                    if (obj1 == null || obj1.getClass() != defaultValueType)
                    {
                        return false;
                    }
                    if (Array.getLength(obj1) != length)
                    {
                        return false;
                    }
                    int j = 0;
                    while (j < length) 
                    {
                        Object obj2 = Array.get(defaultValue, j);
                        Object obj3 = Array.get(obj1, j);
                        if (obj2 == obj3 || obj2 == null || obj2.equals(obj3))
                        {
                            j++;
                        } else
                        {
                            return false;
                        }
                    }
                }
                return true;
            }

            
            {
                defaultValueType = class1;
                length = i;
                defaultValue = obj;
                super();
            }
        };
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
}
