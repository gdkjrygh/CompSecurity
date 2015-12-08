// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.lang.reflect.Array;

public class ArrayUtils
{

    public static final boolean EMPTY_BOOLEAN_ARRAY[] = new boolean[0];
    public static final Boolean EMPTY_BOOLEAN_OBJECT_ARRAY[] = new Boolean[0];
    public static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    public static final Byte EMPTY_BYTE_OBJECT_ARRAY[] = new Byte[0];
    public static final Character EMPTY_CHARACTER_OBJECT_ARRAY[] = new Character[0];
    public static final char EMPTY_CHAR_ARRAY[] = new char[0];
    public static final Class EMPTY_CLASS_ARRAY[] = new Class[0];
    public static final double EMPTY_DOUBLE_ARRAY[] = new double[0];
    public static final Double EMPTY_DOUBLE_OBJECT_ARRAY[] = new Double[0];
    public static final float EMPTY_FLOAT_ARRAY[] = new float[0];
    public static final Float EMPTY_FLOAT_OBJECT_ARRAY[] = new Float[0];
    public static final Integer EMPTY_INTEGER_OBJECT_ARRAY[] = new Integer[0];
    public static final int EMPTY_INT_ARRAY[] = new int[0];
    public static final long EMPTY_LONG_ARRAY[] = new long[0];
    public static final Long EMPTY_LONG_OBJECT_ARRAY[] = new Long[0];
    public static final Object EMPTY_OBJECT_ARRAY[] = new Object[0];
    public static final short EMPTY_SHORT_ARRAY[] = new short[0];
    public static final Short EMPTY_SHORT_OBJECT_ARRAY[] = new Short[0];
    public static final String EMPTY_STRING_ARRAY[] = new String[0];

    private static Object add(Object obj, int i, Object obj1, Class class1)
    {
        if (obj == null)
        {
            if (i != 0)
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Index: ")).append(i).append(", Length: 0").toString());
            }
            obj = Array.newInstance(class1, 1);
            Array.set(obj, 0, obj1);
            obj1 = obj;
        } else
        {
            int j = Array.getLength(obj);
            if (i > j || i < 0)
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Index: ")).append(i).append(", Length: ").append(j).toString());
            }
            class1 = ((Class) (Array.newInstance(class1, j + 1)));
            System.arraycopy(obj, 0, class1, 0, i);
            Array.set(class1, i, obj1);
            obj1 = class1;
            if (i < j)
            {
                System.arraycopy(obj, i, class1, i + 1, j - i);
                return class1;
            }
        }
        return obj1;
    }

    public static Object[] add(Object aobj[], int i, Object obj)
    {
        Class class1;
        if (aobj != null)
        {
            class1 = ((Object) (aobj)).getClass().getComponentType();
        } else
        if (obj != null)
        {
            class1 = obj.getClass();
        } else
        {
            throw new IllegalArgumentException("Array and element cannot both be null");
        }
        return (Object[])add(((Object) (aobj)), i, obj, class1);
    }

}
