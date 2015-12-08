// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.EnumMap;
import java.util.EnumSet;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//            TypeIdResolverBase

public class ClassNameIdResolver extends TypeIdResolverBase
{

    public ClassNameIdResolver(JavaType javatype, TypeFactory typefactory)
    {
        super(javatype, typefactory);
    }

    protected final String _idFrom(Object obj, Class class1)
    {
        Object obj1;
        obj1 = class1;
        if (java/lang/Enum.isAssignableFrom(class1))
        {
            obj1 = class1;
            if (!class1.isEnum())
            {
                obj1 = class1.getSuperclass();
            }
        }
        class1 = ((Class) (obj1)).getName();
        if (!class1.startsWith("java.util")) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof EnumSet)) goto _L4; else goto _L3
_L3:
        obj = ClassUtil.findEnumType((EnumSet)obj);
        obj = TypeFactory.defaultInstance().constructCollectionType(java/util/EnumSet, ((Class) (obj))).toCanonical();
_L6:
        return ((String) (obj));
_L4:
        if (obj instanceof EnumMap)
        {
            obj = ClassUtil.findEnumType((EnumMap)obj);
            return TypeFactory.defaultInstance().constructMapType(java/util/EnumMap, ((Class) (obj)), java/lang/Object).toCanonical();
        }
        obj1 = class1.substring(9);
        if (((String) (obj1)).startsWith(".Arrays$"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = class1;
        if (!((String) (obj1)).startsWith(".Collections$")) goto _L6; else goto _L5
_L5:
        obj = class1;
        if (class1.indexOf("List") >= 0)
        {
            return "java.util.ArrayList";
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj = class1;
        if (class1.indexOf('$') >= 0)
        {
            obj = class1;
            if (ClassUtil.getOuterClass(((Class) (obj1))) != null)
            {
                obj = class1;
                if (ClassUtil.getOuterClass(_baseType.getRawClass()) == null)
                {
                    return _baseType.getRawClass().getName();
                }
            }
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected JavaType _typeFromId(String s, TypeFactory typefactory)
    {
        if (s.indexOf('<') > 0)
        {
            return typefactory.constructFromCanonical(s);
        }
        try
        {
            Class class1 = ClassUtil.findClass(s);
            typefactory = typefactory.constructSpecializedType(_baseType, class1);
        }
        // Misplaced declaration of an exception variable
        catch (TypeFactory typefactory)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid type id '").append(s).append("' (for id type 'Id.class'): no such class found").toString());
        }
        // Misplaced declaration of an exception variable
        catch (TypeFactory typefactory)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid type id '").append(s).append("' (for id type 'Id.class'): ").append(typefactory.getMessage()).toString(), typefactory);
        }
        return typefactory;
    }

    public String getDescForKnownTypeIds()
    {
        return "class name used as type id";
    }

    public String idFromValue(Object obj)
    {
        return _idFrom(obj, obj.getClass());
    }

    public String idFromValueAndType(Object obj, Class class1)
    {
        return _idFrom(obj, class1);
    }

    public JavaType typeFromId(DatabindContext databindcontext, String s)
    {
        return _typeFromId(s, databindcontext.getTypeFactory());
    }

    public JavaType typeFromId(String s)
    {
        return _typeFromId(s, _typeFactory);
    }
}
