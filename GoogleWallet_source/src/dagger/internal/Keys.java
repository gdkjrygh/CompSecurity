// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.Lazy;
import dagger.MembersInjector;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;
import javax.inject.Provider;
import javax.inject.Qualifier;

// Referenced classes of package dagger.internal:
//            Memoizer

public final class Keys
{

    private static final Memoizer IS_QUALIFIER_ANNOTATION = new Memoizer() {

        private static Boolean create(Class class1)
        {
            return Boolean.valueOf(class1.isAnnotationPresent(javax/inject/Qualifier));
        }

        protected final volatile Object create(Object obj)
        {
            return create((Class)obj);
        }

    };
    private static final String LAZY_PREFIX = String.valueOf(dagger/Lazy.getCanonicalName()).concat("<");
    private static final String MEMBERS_INJECTOR_PREFIX = String.valueOf(dagger/MembersInjector.getCanonicalName()).concat("<");
    private static final String PROVIDER_PREFIX = String.valueOf(javax/inject/Provider.getCanonicalName()).concat("<");
    private static final String SET_PREFIX = String.valueOf(java/util/Set.getCanonicalName()).concat("<");

    Keys()
    {
    }

    private static Type boxIfPrimitive(Type type)
    {
        Type type1;
        if (type == Byte.TYPE)
        {
            type1 = java/lang/Byte;
        } else
        {
            if (type == Short.TYPE)
            {
                return java/lang/Short;
            }
            if (type == Integer.TYPE)
            {
                return java/lang/Integer;
            }
            if (type == Long.TYPE)
            {
                return java/lang/Long;
            }
            if (type == Character.TYPE)
            {
                return java/lang/Character;
            }
            if (type == Boolean.TYPE)
            {
                return java/lang/Boolean;
            }
            if (type == Float.TYPE)
            {
                return java/lang/Float;
            }
            if (type == Double.TYPE)
            {
                return java/lang/Double;
            }
            type1 = type;
            if (type == Void.TYPE)
            {
                return java/lang/Void;
            }
        }
        return type1;
    }

    private static String extractKey(String s, int i, String s1, String s2)
    {
        s1 = String.valueOf(s1);
        s = String.valueOf(s.substring(s2.length() + i, s.length() - 1));
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    private static Annotation extractQualifier(Annotation aannotation[], Object obj)
    {
        Annotation annotation = null;
        int j = aannotation.length;
        for (int i = 0; i < j;)
        {
            Annotation annotation2 = aannotation[i];
            Annotation annotation1 = annotation;
            if (((Boolean)IS_QUALIFIER_ANNOTATION.get(annotation2.annotationType())).booleanValue())
            {
                if (annotation != null)
                {
                    aannotation = String.valueOf(obj);
                    throw new IllegalArgumentException((new StringBuilder(String.valueOf(aannotation).length() + 34)).append("Too many qualifier annotations on ").append(aannotation).toString());
                }
                annotation1 = annotation2;
            }
            i++;
            annotation = annotation1;
        }

        return annotation;
    }

    public static String get(Type type)
    {
        return get(type, null);
    }

    private static String get(Type type, Annotation annotation)
    {
        type = boxIfPrimitive(type);
        if (annotation == null && (type instanceof Class) && !((Class)type).isArray())
        {
            return ((Class)type).getName();
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (annotation != null)
        {
            stringbuilder.append(annotation).append("/");
        }
        typeToString(type, stringbuilder, true);
        return stringbuilder.toString();
    }

    public static String get(Type type, Annotation aannotation[], Object obj)
    {
        return get(type, extractQualifier(aannotation, obj));
    }

    static String getBuiltInBindingsKey(String s)
    {
        int i = startOfType(s);
        if (substringStartsWith(s, i, PROVIDER_PREFIX))
        {
            return extractKey(s, i, s.substring(0, i), PROVIDER_PREFIX);
        }
        if (substringStartsWith(s, i, MEMBERS_INJECTOR_PREFIX))
        {
            return extractKey(s, i, "members/", MEMBERS_INJECTOR_PREFIX);
        } else
        {
            return null;
        }
    }

    public static String getClassName(String s)
    {
        int i = 0;
        if (s.startsWith("@") || s.startsWith("members/"))
        {
            i = s.lastIndexOf('/') + 1;
        }
        if (s.indexOf('<', i) == -1 && s.indexOf('[', i) == -1)
        {
            return s.substring(i);
        } else
        {
            return null;
        }
    }

    static String getLazyKey(String s)
    {
        int i = startOfType(s);
        if (substringStartsWith(s, i, LAZY_PREFIX))
        {
            return extractKey(s, i, s.substring(0, i), LAZY_PREFIX);
        } else
        {
            return null;
        }
    }

    public static String getMembersKey(Class class1)
    {
        return "members/".concat(class1.getName());
    }

    public static String getSetKey(Type type, Annotation aannotation[], Object obj)
    {
        aannotation = extractQualifier(aannotation, obj);
        type = boxIfPrimitive(type);
        obj = new StringBuilder();
        if (aannotation != null)
        {
            ((StringBuilder) (obj)).append(aannotation).append("/");
        }
        ((StringBuilder) (obj)).append(SET_PREFIX);
        typeToString(type, ((StringBuilder) (obj)), true);
        ((StringBuilder) (obj)).append(">");
        return ((StringBuilder) (obj)).toString();
    }

    public static boolean isAnnotated(String s)
    {
        return s.startsWith("@");
    }

    public static boolean isPlatformType(String s)
    {
        return s.startsWith("java.") || s.startsWith("javax.") || s.startsWith("android.");
    }

    private static int startOfType(String s)
    {
        if (s.startsWith("@"))
        {
            return s.lastIndexOf('/') + 1;
        } else
        {
            return 0;
        }
    }

    private static boolean substringStartsWith(String s, int i, String s1)
    {
        return s.regionMatches(i, s1, 0, s1.length());
    }

    private static void typeToString(Type type, StringBuilder stringbuilder, boolean flag)
    {
        if (type instanceof Class)
        {
            type = (Class)type;
            if (type.isArray())
            {
                typeToString(((Type) (type.getComponentType())), stringbuilder, false);
                stringbuilder.append("[]");
                return;
            }
            if (type.isPrimitive())
            {
                if (flag)
                {
                    type = String.valueOf(type.getName());
                    if (type.length() != 0)
                    {
                        type = "Uninjectable type ".concat(type);
                    } else
                    {
                        type = new String("Uninjectable type ");
                    }
                    throw new UnsupportedOperationException(type);
                } else
                {
                    stringbuilder.append(type.getName());
                    return;
                }
            } else
            {
                stringbuilder.append(type.getName());
                return;
            }
        }
        if (type instanceof ParameterizedType)
        {
            type = (ParameterizedType)type;
            typeToString(type.getRawType(), stringbuilder, true);
            type = type.getActualTypeArguments();
            stringbuilder.append("<");
            for (int i = 0; i < type.length; i++)
            {
                if (i != 0)
                {
                    stringbuilder.append(", ");
                }
                typeToString(type[i], stringbuilder, true);
            }

            stringbuilder.append(">");
            return;
        }
        if (type instanceof GenericArrayType)
        {
            typeToString(((GenericArrayType)type).getGenericComponentType(), stringbuilder, false);
            stringbuilder.append("[]");
            return;
        } else
        {
            type = String.valueOf(type);
            throw new UnsupportedOperationException((new StringBuilder(String.valueOf(type).length() + 18)).append("Uninjectable type ").append(type).toString());
        }
    }

}
