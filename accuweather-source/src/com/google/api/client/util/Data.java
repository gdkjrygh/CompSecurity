// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.api.client.util:
//            DateTime, GenericData, ArrayMap, Types, 
//            Preconditions, ClassInfo, FieldInfo, DataMap

public class Data
{

    public static final BigDecimal NULL_BIG_DECIMAL;
    public static final BigInteger NULL_BIG_INTEGER;
    public static final Boolean NULL_BOOLEAN;
    public static final Byte NULL_BYTE;
    private static final ConcurrentHashMap NULL_CACHE;
    public static final Character NULL_CHARACTER;
    public static final DateTime NULL_DATE_TIME;
    public static final Double NULL_DOUBLE;
    public static final Float NULL_FLOAT;
    public static final Integer NULL_INTEGER;
    public static final Long NULL_LONG;
    public static final Short NULL_SHORT;
    public static final String NULL_STRING = new String();

    public Data()
    {
    }

    public static Object clone(Object obj)
    {
        if (obj == null || isPrimitive(obj.getClass()))
        {
            return obj;
        }
        if (obj instanceof GenericData)
        {
            return ((GenericData)obj).clone();
        }
        Object obj1 = obj.getClass();
        if (((Class) (obj1)).isArray())
        {
            obj1 = Array.newInstance(((Class) (obj1)).getComponentType(), Array.getLength(obj));
        } else
        if (obj instanceof ArrayMap)
        {
            obj1 = ((ArrayMap)obj).clone();
        } else
        {
            obj1 = Types.newInstance(((Class) (obj1)));
        }
        deepCopy(obj, obj1);
        return obj1;
    }

    public static void deepCopy(Object obj, Object obj1)
    {
        Object obj2 = obj.getClass();
        boolean flag;
        if (obj2 == obj1.getClass())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (((Class) (obj2)).isArray())
        {
            int i;
            if (Array.getLength(obj) == Array.getLength(obj1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            i = 0;
            for (obj = Types.iterableOf(obj).iterator(); ((Iterator) (obj)).hasNext();)
            {
                Array.set(obj1, i, clone(((Iterator) (obj)).next()));
                i++;
            }

        } else
        if (java/util/Collection.isAssignableFrom(((Class) (obj2))))
        {
            obj = (Collection)obj;
            if (java/util/ArrayList.isAssignableFrom(((Class) (obj2))))
            {
                ((ArrayList)obj1).ensureCapacity(((Collection) (obj)).size());
            }
            obj1 = (Collection)obj1;
            for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Collection) (obj1)).add(clone(((Iterator) (obj)).next()))) { }
        } else
        {
            boolean flag1 = com/google/api/client/util/GenericData.isAssignableFrom(((Class) (obj2)));
            if (flag1 || !java/util/Map.isAssignableFrom(((Class) (obj2))))
            {
                Iterator iterator;
                if (flag1)
                {
                    obj2 = ((GenericData)obj).classInfo;
                } else
                {
                    obj2 = ClassInfo.of(((Class) (obj2)));
                }
                iterator = ((ClassInfo) (obj2)).names.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    FieldInfo fieldinfo = ((ClassInfo) (obj2)).getFieldInfo((String)iterator.next());
                    if (!fieldinfo.isFinal() && (!flag1 || !fieldinfo.isPrimitive()))
                    {
                        Object obj3 = fieldinfo.getValue(obj);
                        if (obj3 != null)
                        {
                            fieldinfo.setValue(obj1, clone(obj3));
                        }
                    }
                } while (true);
            } else
            if (com/google/api/client/util/ArrayMap.isAssignableFrom(((Class) (obj2))))
            {
                obj1 = (ArrayMap)obj1;
                obj = (ArrayMap)obj;
                int k = ((ArrayMap) (obj)).size();
                for (int j = 0; j < k; j++)
                {
                    ((ArrayMap) (obj1)).set(j, clone(((ArrayMap) (obj)).getValue(j)));
                }

            } else
            {
                obj1 = (Map)obj1;
                java.util.Map.Entry entry;
                for (obj = ((Map)obj).entrySet().iterator(); ((Iterator) (obj)).hasNext(); ((Map) (obj1)).put(entry.getKey(), clone(entry.getValue())))
                {
                    entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                }

            }
        }
    }

    public static boolean isNull(Object obj)
    {
        return obj != null && obj == NULL_CACHE.get(obj.getClass());
    }

    public static boolean isPrimitive(Type type)
    {
        Type type1 = type;
        if (type instanceof WildcardType)
        {
            type1 = Types.getBound((WildcardType)type);
        }
        if (type1 instanceof Class)
        {
            if ((type = (Class)type1).isPrimitive() || type == java/lang/Character || type == java/lang/String || type == java/lang/Integer || type == java/lang/Long || type == java/lang/Short || type == java/lang/Byte || type == java/lang/Float || type == java/lang/Double || type == java/math/BigInteger || type == java/math/BigDecimal || type == com/google/api/client/util/DateTime || type == java/lang/Boolean)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isValueOfPrimitiveType(Object obj)
    {
        return obj == null || isPrimitive(obj.getClass());
    }

    public static Map mapOf(Object obj)
    {
        if (obj == null || isNull(obj))
        {
            return Collections.emptyMap();
        }
        if (obj instanceof Map)
        {
            return (Map)obj;
        } else
        {
            return new DataMap(obj, false);
        }
    }

    public static Collection newCollectionInstance(Type type)
    {
        Object obj = type;
        if (type instanceof WildcardType)
        {
            obj = Types.getBound((WildcardType)type);
        }
        type = ((Type) (obj));
        if (obj instanceof ParameterizedType)
        {
            type = ((ParameterizedType)obj).getRawType();
        }
        if (type instanceof Class)
        {
            obj = (Class)type;
        } else
        {
            obj = null;
        }
        if (type == null || (type instanceof GenericArrayType) || obj != null && (((Class) (obj)).isArray() || ((Class) (obj)).isAssignableFrom(java/util/ArrayList)))
        {
            return new ArrayList();
        }
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unable to create new instance of type: ").append(type).toString());
        }
        if (((Class) (obj)).isAssignableFrom(java/util/HashSet))
        {
            return new HashSet();
        }
        if (((Class) (obj)).isAssignableFrom(java/util/TreeSet))
        {
            return new TreeSet();
        } else
        {
            return (Collection)Types.newInstance(((Class) (obj)));
        }
    }

    public static Map newMapInstance(Class class1)
    {
        if (class1 == null || class1.isAssignableFrom(com/google/api/client/util/ArrayMap))
        {
            return ArrayMap.create();
        }
        if (class1.isAssignableFrom(java/util/TreeMap))
        {
            return new TreeMap();
        } else
        {
            return (Map)Types.newInstance(class1);
        }
    }

    public static Object nullOf(Class class1)
    {
        Object obj;
        obj = NULL_CACHE.get(class1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        ConcurrentHashMap concurrenthashmap = NULL_CACHE;
        concurrenthashmap;
        JVM INSTR monitorenter ;
        obj = NULL_CACHE.get(class1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (!class1.isArray()) goto _L4; else goto _L3
_L3:
        int i;
        i = 0;
        obj = class1;
_L6:
        Class class2 = ((Class) (obj)).getComponentType();
        int j;
        j = i + 1;
        obj = class2;
        i = j;
        if (class2.isArray()) goto _L6; else goto _L5
_L5:
        obj = Array.newInstance(class2, new int[j]);
_L7:
        NULL_CACHE.put(class1, obj);
_L2:
        concurrenthashmap;
        JVM INSTR monitorexit ;
        return obj;
_L4:
label0:
        {
            if (!class1.isEnum())
            {
                break label0;
            }
            obj = ClassInfo.of(class1).getFieldInfo(null);
            Preconditions.checkNotNull(obj, "enum missing constant with @NullValue annotation: %s", new Object[] {
                class1
            });
            obj = ((FieldInfo) (obj)).enumValue();
        }
          goto _L7
        obj = Types.newInstance(class1);
          goto _L7
        class1;
        concurrenthashmap;
        JVM INSTR monitorexit ;
        throw class1;
        return obj;
    }

    public static Object parsePrimitiveValue(Type type, String s)
    {
        Class class1;
        if (type instanceof Class)
        {
            class1 = (Class)type;
        } else
        {
            class1 = null;
        }
        if (type == null || class1 != null)
        {
            if (class1 == java/lang/Void)
            {
                return null;
            }
            if (s == null || class1 == null || class1.isAssignableFrom(java/lang/String))
            {
                return s;
            }
            if (class1 == java/lang/Character || class1 == Character.TYPE)
            {
                if (s.length() != 1)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("expected type Character/char but got ").append(class1).toString());
                } else
                {
                    return Character.valueOf(s.charAt(0));
                }
            }
            if (class1 == java/lang/Boolean || class1 == Boolean.TYPE)
            {
                return Boolean.valueOf(s);
            }
            if (class1 == java/lang/Byte || class1 == Byte.TYPE)
            {
                return Byte.valueOf(s);
            }
            if (class1 == java/lang/Short || class1 == Short.TYPE)
            {
                return Short.valueOf(s);
            }
            if (class1 == java/lang/Integer || class1 == Integer.TYPE)
            {
                return Integer.valueOf(s);
            }
            if (class1 == java/lang/Long || class1 == Long.TYPE)
            {
                return Long.valueOf(s);
            }
            if (class1 == java/lang/Float || class1 == Float.TYPE)
            {
                return Float.valueOf(s);
            }
            if (class1 == java/lang/Double || class1 == Double.TYPE)
            {
                return Double.valueOf(s);
            }
            if (class1 == com/google/api/client/util/DateTime)
            {
                return DateTime.parseRfc3339(s);
            }
            if (class1 == java/math/BigInteger)
            {
                return new BigInteger(s);
            }
            if (class1 == java/math/BigDecimal)
            {
                return new BigDecimal(s);
            }
            if (class1.isEnum())
            {
                return ClassInfo.of(class1).getFieldInfo(s).enumValue();
            }
        }
        throw new IllegalArgumentException((new StringBuilder()).append("expected primitive class, but got: ").append(type).toString());
    }

    public static Type resolveWildcardTypeOrTypeVariable(List list, Type type)
    {
        Type type1 = type;
        if (type instanceof WildcardType)
        {
            type1 = Types.getBound((WildcardType)type);
        }
        do
        {
            if (!(type1 instanceof TypeVariable))
            {
                break;
            }
            Type type2 = Types.resolveTypeVariable(list, (TypeVariable)type1);
            type = type1;
            if (type2 != null)
            {
                type = type2;
            }
            type1 = type;
            if (type instanceof TypeVariable)
            {
                type1 = ((TypeVariable)type).getBounds()[0];
            }
        } while (true);
        return type1;
    }

    static 
    {
        NULL_BOOLEAN = new Boolean(true);
        NULL_CHARACTER = new Character('\0');
        NULL_BYTE = new Byte((byte)0);
        NULL_SHORT = new Short((short)0);
        NULL_INTEGER = new Integer(0);
        NULL_FLOAT = new Float(0.0F);
        NULL_LONG = new Long(0L);
        NULL_DOUBLE = new Double(0.0D);
        NULL_BIG_INTEGER = new BigInteger("0");
        NULL_BIG_DECIMAL = new BigDecimal("0");
        NULL_DATE_TIME = new DateTime(0L);
        NULL_CACHE = new ConcurrentHashMap();
        NULL_CACHE.put(java/lang/Boolean, NULL_BOOLEAN);
        NULL_CACHE.put(java/lang/String, NULL_STRING);
        NULL_CACHE.put(java/lang/Character, NULL_CHARACTER);
        NULL_CACHE.put(java/lang/Byte, NULL_BYTE);
        NULL_CACHE.put(java/lang/Short, NULL_SHORT);
        NULL_CACHE.put(java/lang/Integer, NULL_INTEGER);
        NULL_CACHE.put(java/lang/Float, NULL_FLOAT);
        NULL_CACHE.put(java/lang/Long, NULL_LONG);
        NULL_CACHE.put(java/lang/Double, NULL_DOUBLE);
        NULL_CACHE.put(java/math/BigInteger, NULL_BIG_INTEGER);
        NULL_CACHE.put(java/math/BigDecimal, NULL_BIG_DECIMAL);
        NULL_CACHE.put(com/google/api/client/util/DateTime, NULL_DATE_TIME);
    }
}
