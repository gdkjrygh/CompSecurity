// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ClassUtil
{

    private static void _addSuperTypes(Class class1, Class class2, Collection collection, boolean flag)
    {
_L5:
        if (class1 != class2 && class1 != null && class1 != java/lang/Object) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (collection.contains(class1))
        {
            continue; /* Loop/switch isn't completed */
        }
        collection.add(class1);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        Class aclass[] = class1.getInterfaces();
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            _addSuperTypes(aclass[i], class2, collection, true);
        }

        class1 = class1.getSuperclass();
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String canBeABeanType(Class class1)
    {
        if (class1.isAnnotation())
        {
            return "annotation";
        }
        if (class1.isArray())
        {
            return "array";
        }
        if (class1.isEnum())
        {
            return "enum";
        }
        if (class1.isPrimitive())
        {
            return "primitive";
        } else
        {
            return null;
        }
    }

    public static void checkAndFixAccess(Member member)
    {
        AccessibleObject accessibleobject = (AccessibleObject)member;
        accessibleobject.setAccessible(true);
_L1:
        return;
        SecurityException securityexception;
        securityexception;
        if (!accessibleobject.isAccessible())
        {
            Class class1 = member.getDeclaringClass();
            throw new IllegalArgumentException((new StringBuilder("Can not access ")).append(member).append(" (from class ").append(class1.getName()).append("; failed to set access: ").append(securityexception.getMessage()).toString());
        }
          goto _L1
    }

    public static Object createInstance(Class class1, boolean flag)
    {
        Object obj = findConstructor(class1, flag);
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Class ")).append(class1.getName()).append(" has no default (no arg) constructor").toString());
        }
        try
        {
            obj = ((Constructor) (obj)).newInstance(new Object[0]);
        }
        catch (Exception exception)
        {
            unwrapAndThrowAsIAE(exception, (new StringBuilder("Failed to instantiate class ")).append(class1.getName()).append(", problem: ").append(exception.getMessage()).toString());
            return null;
        }
        return obj;
    }

    public static Object defaultValue(Class class1)
    {
        if (class1 == Integer.TYPE)
        {
            return Integer.valueOf(0);
        }
        if (class1 == Long.TYPE)
        {
            return Long.valueOf(0L);
        }
        if (class1 == Boolean.TYPE)
        {
            return Boolean.FALSE;
        }
        if (class1 == Double.TYPE)
        {
            return Double.valueOf(0.0D);
        }
        if (class1 == Float.TYPE)
        {
            return Float.valueOf(0.0F);
        }
        if (class1 == Byte.TYPE)
        {
            return Byte.valueOf((byte)0);
        }
        if (class1 == Short.TYPE)
        {
            return Short.valueOf((short)0);
        }
        if (class1 == Character.TYPE)
        {
            return Character.valueOf('\0');
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Class ")).append(class1.getName()).append(" is not a primitive type").toString());
        }
    }

    public static Class findClass(String s)
    {
        Object obj;
        ClassLoader classloader;
        if (s.indexOf('.') < 0)
        {
            if ("int".equals(s))
            {
                return Integer.TYPE;
            }
            if ("long".equals(s))
            {
                return Long.TYPE;
            }
            if ("float".equals(s))
            {
                return Float.TYPE;
            }
            if ("double".equals(s))
            {
                return Double.TYPE;
            }
            if ("boolean".equals(s))
            {
                return Boolean.TYPE;
            }
            if ("byte".equals(s))
            {
                return Byte.TYPE;
            }
            if ("char".equals(s))
            {
                return Character.TYPE;
            }
            if ("short".equals(s))
            {
                return Short.TYPE;
            }
            if ("void".equals(s))
            {
                return Void.TYPE;
            }
        }
        obj = null;
        classloader = Thread.currentThread().getContextClassLoader();
        if (classloader == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj = Class.forName(s, true, classloader);
        return ((Class) (obj));
        obj;
        obj = getRootCause(((Throwable) (obj)));
        try
        {
            s = Class.forName(s);
        }
        catch (Exception exception)
        {
            s = ((String) (obj));
            if (obj == null)
            {
                s = getRootCause(exception);
            }
            if (s instanceof RuntimeException)
            {
                throw (RuntimeException)s;
            } else
            {
                throw new ClassNotFoundException(s.getMessage(), s);
            }
        }
        return s;
    }

    public static Constructor findConstructor(Class class1, boolean flag)
    {
        Object obj = class1.getDeclaredConstructor(new Class[0]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        checkAndFixAccess(((Member) (obj)));
        return ((Constructor) (obj));
        if (!Modifier.isPublic(((Constructor) (obj)).getModifiers()))
        {
            throw new IllegalArgumentException((new StringBuilder("Default constructor for ")).append(class1.getName()).append(" is not accessible (non-public?): not allowed to try modify access via Reflection: can not instantiate type").toString());
        }
          goto _L1
        class1;
_L2:
        return null;
        obj;
        unwrapAndThrowAsIAE(((Throwable) (obj)), (new StringBuilder("Failed to find default constructor of class ")).append(class1.getName()).append(", problem: ").append(((Exception) (obj)).getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
        return ((Constructor) (obj));
    }

    public static Class findEnumType(Class class1)
    {
        Class class2 = class1;
        if (class1.getSuperclass() != java/lang/Enum)
        {
            class2 = class1.getSuperclass();
        }
        return class2;
    }

    public static Class findEnumType(Enum enum)
    {
        Class class1 = enum.getClass();
        enum = class1;
        if (class1.getSuperclass() != java/lang/Enum)
        {
            enum = class1.getSuperclass();
        }
        return enum;
    }

    public static Class findEnumType(EnumMap enummap)
    {
        if (!enummap.isEmpty())
        {
            return findEnumType((Enum)enummap.keySet().iterator().next());
        } else
        {
            return EnumTypeLocator.instance.enumTypeFor(enummap);
        }
    }

    public static Class findEnumType(EnumSet enumset)
    {
        if (!enumset.isEmpty())
        {
            return findEnumType((Enum)enumset.iterator().next());
        } else
        {
            return EnumTypeLocator.instance.enumTypeFor(enumset);
        }
    }

    public static List findSuperTypes(Class class1, Class class2)
    {
        return findSuperTypes(class1, class2, ((List) (new ArrayList(8))));
    }

    public static List findSuperTypes(Class class1, Class class2, List list)
    {
        _addSuperTypes(class1, class2, list, false);
        return list;
    }

    public static Class getOuterClass(Class class1)
    {
        if (class1.getEnclosingMethod() != null)
        {
            return null;
        }
        if (Modifier.isStatic(class1.getModifiers()))
        {
            break MISSING_BLOCK_LABEL_30;
        }
        class1 = class1.getEnclosingClass();
        return class1;
        class1;
        return null;
        class1;
        return null;
    }

    public static Throwable getRootCause(Throwable throwable)
    {
        for (; throwable.getCause() != null; throwable = throwable.getCause()) { }
        return throwable;
    }

    public static final boolean isBogusClass(Class class1)
    {
        return class1 == java/lang/Void || class1 == Void.TYPE || class1 == com/fasterxml/jackson/databind/annotation/NoClass;
    }

    public static boolean isCollectionMapOrArray(Class class1)
    {
        while (class1.isArray() || java/util/Collection.isAssignableFrom(class1) || java/util/Map.isAssignableFrom(class1)) 
        {
            return true;
        }
        return false;
    }

    public static boolean isConcrete(Class class1)
    {
        return (class1.getModifiers() & 0x600) == 0;
    }

    public static boolean isJacksonStdImpl(Class class1)
    {
        return class1.getAnnotation(com/fasterxml/jackson/databind/annotation/JacksonStdImpl) != null;
    }

    public static boolean isJacksonStdImpl(Object obj)
    {
        return obj != null && isJacksonStdImpl(obj.getClass());
    }

    public static String isLocalType(Class class1, boolean flag)
    {
        if (class1.getEnclosingMethod() != null)
        {
            return "local/anonymous";
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        if (class1.getEnclosingClass() != null && !Modifier.isStatic(class1.getModifiers()))
        {
            return "non-static member class";
        }
        break MISSING_BLOCK_LABEL_37;
        class1;
_L2:
        return null;
        class1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean isProxyType(Class class1)
    {
        class1 = class1.getName();
        return class1.startsWith("net.sf.cglib.proxy.") || class1.startsWith("org.hibernate.proxy.");
    }

    public static void throwAsIAE(Throwable throwable)
    {
        throwAsIAE(throwable, throwable.getMessage());
    }

    public static void throwAsIAE(Throwable throwable, String s)
    {
        if (throwable instanceof RuntimeException)
        {
            throw (RuntimeException)throwable;
        }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        } else
        {
            throw new IllegalArgumentException(s, throwable);
        }
    }

    public static void unwrapAndThrowAsIAE(Throwable throwable)
    {
        throwAsIAE(getRootCause(throwable));
    }

    public static void unwrapAndThrowAsIAE(Throwable throwable, String s)
    {
        throwAsIAE(getRootCause(throwable), s);
    }

    public static Class wrapperType(Class class1)
    {
        if (class1 == Integer.TYPE)
        {
            return java/lang/Integer;
        }
        if (class1 == Long.TYPE)
        {
            return java/lang/Long;
        }
        if (class1 == Boolean.TYPE)
        {
            return java/lang/Boolean;
        }
        if (class1 == Double.TYPE)
        {
            return java/lang/Double;
        }
        if (class1 == Float.TYPE)
        {
            return java/lang/Float;
        }
        if (class1 == Byte.TYPE)
        {
            return java/lang/Byte;
        }
        if (class1 == Short.TYPE)
        {
            return java/lang/Short;
        }
        if (class1 == Character.TYPE)
        {
            return java/lang/Character;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Class ")).append(class1.getName()).append(" is not a primitive type").toString());
        }
    }

    private class EnumTypeLocator
    {

        static final EnumTypeLocator instance = new EnumTypeLocator();
        private final Field enumMapTypeField = locateField(java/util/EnumMap, "elementType", java/lang/Class);
        private final Field enumSetTypeField = locateField(java/util/EnumSet, "elementType", java/lang/Class);

        private Object get(Object obj, Field field)
        {
            try
            {
                obj = field.get(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException(((Throwable) (obj)));
            }
            return obj;
        }

        private static Field locateField(Class class1, String s, Class class2)
        {
            Field afield[];
            int i;
            int j;
            afield = class1.getDeclaredFields();
            j = afield.length;
            i = 0;
_L11:
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_124;
            }
            class1 = afield[i];
            if (!s.equals(class1.getName()) || class1.getType() != class2) goto _L2; else goto _L1
_L1:
            s = class1;
            if (class1 != null) goto _L4; else goto _L3
_L3:
            j = afield.length;
            i = 0;
_L12:
            if (i >= j) goto _L6; else goto _L5
_L5:
            s = afield[i];
            if (s.getType() != class2) goto _L8; else goto _L7
_L7:
            if (class1 == null) goto _L10; else goto _L9
_L9:
            class1 = null;
_L14:
            return class1;
_L2:
            i++;
              goto _L11
_L8:
            s = class1;
_L10:
            i++;
            class1 = s;
              goto _L12
_L6:
            s = class1;
_L4:
            class1 = s;
            if (s == null) goto _L14; else goto _L13
_L13:
            try
            {
                s.setAccessible(true);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return s;
            }
            return s;
            class1 = null;
              goto _L1
        }

        public Class enumTypeFor(EnumMap enummap)
        {
            if (enumMapTypeField != null)
            {
                return (Class)get(enummap, enumMapTypeField);
            } else
            {
                throw new IllegalStateException("Can not figure out type for EnumMap (odd JDK platform?)");
            }
        }

        public Class enumTypeFor(EnumSet enumset)
        {
            if (enumSetTypeField != null)
            {
                return (Class)get(enumset, enumSetTypeField);
            } else
            {
                throw new IllegalStateException("Can not figure out type for EnumSet (odd JDK platform?)");
            }
        }


        private EnumTypeLocator()
        {
        }
    }

}
