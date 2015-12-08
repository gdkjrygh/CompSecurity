// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public final class ArrayBuilders
{

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
        return new Object() {

            final Object val$defaultValue;
            final Class val$defaultValueType;
            final int val$length;

            public final boolean equals(Object obj1)
            {
                boolean flag1 = false;
                if (obj1 != this) goto _L2; else goto _L1
_L1:
                boolean flag = true;
_L4:
                return flag;
_L2:
                flag = flag1;
                if (obj1 == null) goto _L4; else goto _L3
_L3:
                flag = flag1;
                if (obj1.getClass() != defaultValueType) goto _L4; else goto _L5
_L5:
                flag = flag1;
                if (Array.getLength(obj1) != length) goto _L4; else goto _L6
_L6:
                int j = 0;
_L10:
                if (j >= length) goto _L8; else goto _L7
_L7:
                Object obj2;
                Object obj3;
                obj2 = Array.get(defaultValue, j);
                obj3 = Array.get(obj1, j);
                if (obj2 == obj3 || obj2 == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                flag = flag1;
                if (!obj2.equals(obj3)) goto _L4; else goto _L9
_L9:
                j++;
                  goto _L10
_L8:
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

    private class BooleanBuilder extends PrimitiveArrayBuilder
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


    private class ByteBuilder extends PrimitiveArrayBuilder
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


    private class DoubleBuilder extends PrimitiveArrayBuilder
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


    private class FloatBuilder extends PrimitiveArrayBuilder
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


    private class IntBuilder extends PrimitiveArrayBuilder
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


    private class LongBuilder extends PrimitiveArrayBuilder
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


    private class ShortBuilder extends PrimitiveArrayBuilder
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

}
