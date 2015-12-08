// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.google.api.client.util:
//            Data, Preconditions, Value, NullValue, 
//            Key, ClassInfo

public class FieldInfo
{

    private static final Map CACHE = new WeakHashMap();
    private final Field field;
    private final boolean isPrimitive = Data.isPrimitive(getType());
    private final String name;

    FieldInfo(Field field1, String s)
    {
        field = field1;
        if (s == null)
        {
            field1 = null;
        } else
        {
            field1 = s.intern();
        }
        name = field1;
    }

    public static Object getFieldValue(Field field1, Object obj)
    {
        try
        {
            field1 = ((Field) (field1.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Field field1)
        {
            throw new IllegalArgumentException(field1);
        }
        return field1;
    }

    public static FieldInfo of(Enum enum)
    {
        boolean flag = true;
        FieldInfo fieldinfo;
        try
        {
            fieldinfo = of(enum.getClass().getField(enum.name()));
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            throw new RuntimeException(enum);
        }
        if (fieldinfo == null)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "enum constant missing @Value or @NullValue annotation: %s", new Object[] {
            enum
        });
        return fieldinfo;
    }

    public static FieldInfo of(Field field1)
    {
        if (field1 == null)
        {
            return null;
        }
        Map map = CACHE;
        map;
        JVM INSTR monitorenter ;
        Object obj1;
        boolean flag;
        obj1 = (FieldInfo)CACHE.get(field1);
        flag = field1.isEnumConstant();
        Object obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (flag) goto _L4; else goto _L3
_L3:
        obj = obj1;
        if (Modifier.isStatic(field1.getModifiers())) goto _L2; else goto _L4
_L4:
        if (!flag) goto _L6; else goto _L5
_L5:
        obj = (Value)field1.getAnnotation(com/google/api/client/util/Value);
        if (obj == null) goto _L8; else goto _L7
_L7:
        obj = ((Value) (obj)).value();
_L9:
        obj1 = obj;
        if ("##default".equals(obj))
        {
            obj1 = field1.getName();
        }
        obj = new FieldInfo(field1, ((String) (obj1)));
        CACHE.put(field1, obj);
_L2:
        map;
        JVM INSTR monitorexit ;
        return ((FieldInfo) (obj));
        field1;
        map;
        JVM INSTR monitorexit ;
        throw field1;
_L8:
        if ((NullValue)field1.getAnnotation(com/google/api/client/util/NullValue) == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        obj = null;
          goto _L9
        map;
        JVM INSTR monitorexit ;
        return null;
_L6:
        obj = (Key)field1.getAnnotation(com/google/api/client/util/Key);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        map;
        JVM INSTR monitorexit ;
        return null;
        obj = ((Key) (obj)).value();
        field1.setAccessible(true);
          goto _L9
    }

    public static void setFieldValue(Field field1, Object obj, Object obj1)
    {
        if (Modifier.isFinal(field1.getModifiers()))
        {
            Object obj2 = getFieldValue(field1, obj);
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("expected final value <").append(obj2).append("> but was <").append(obj1).append("> on ").append(field1.getName()).append(" field in ").append(obj.getClass().getName()).toString());
            } else
            {
                return;
            }
        }
        try
        {
            field1.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Field field1)
        {
            throw new IllegalArgumentException(field1);
        }
        // Misplaced declaration of an exception variable
        catch (Field field1)
        {
            throw new IllegalArgumentException(field1);
        }
    }

    public Enum enumValue()
    {
        return Enum.valueOf(field.getDeclaringClass(), field.getName());
    }

    public ClassInfo getClassInfo()
    {
        return ClassInfo.of(field.getDeclaringClass());
    }

    public Field getField()
    {
        return field;
    }

    public Type getGenericType()
    {
        return field.getGenericType();
    }

    public String getName()
    {
        return name;
    }

    public Class getType()
    {
        return field.getType();
    }

    public Object getValue(Object obj)
    {
        return getFieldValue(field, obj);
    }

    public boolean isFinal()
    {
        return Modifier.isFinal(field.getModifiers());
    }

    public boolean isPrimitive()
    {
        return isPrimitive;
    }

    public void setValue(Object obj, Object obj1)
    {
        setFieldValue(field, obj, obj1);
    }

}
