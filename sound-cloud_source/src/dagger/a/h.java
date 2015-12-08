// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import dagger.Lazy;
import dagger.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package dagger.a:
//            i, q

public final class h
{

    private static final String a = (new StringBuilder()).append(javax/inject/Provider.getCanonicalName()).append("<").toString();
    private static final String b = (new StringBuilder()).append(dagger/a.getCanonicalName()).append("<").toString();
    private static final String c = (new StringBuilder()).append(dagger/Lazy.getCanonicalName()).append("<").toString();
    private static final String d = (new StringBuilder()).append(java/util/Set.getCanonicalName()).append("<").toString();
    private static final q e = new i();

    public static String a(Class class1)
    {
        return "members/".concat(class1.getName());
    }

    static String a(String s)
    {
        int j = f(s);
        if (a(s, j, a))
        {
            return a(s, j, s.substring(0, j), a);
        }
        if (a(s, j, b))
        {
            return a(s, j, "members/", b);
        } else
        {
            return null;
        }
    }

    private static String a(String s, int j, String s1, String s2)
    {
        return (new StringBuilder()).append(s1).append(s.substring(s2.length() + j, s.length() - 1)).toString();
    }

    public static String a(Type type)
    {
        return a(type, null);
    }

    private static String a(Type type, Annotation annotation)
    {
        if (type != Byte.TYPE) goto _L2; else goto _L1
_L1:
        type = java/lang/Byte;
_L4:
        if (annotation == null && (type instanceof Class) && !((Class)type).isArray())
        {
            return ((Class)type).getName();
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (type == Short.TYPE)
        {
            type = java/lang/Short;
        } else
        if (type == Integer.TYPE)
        {
            type = java/lang/Integer;
        } else
        if (type == Long.TYPE)
        {
            type = java/lang/Long;
        } else
        if (type == Character.TYPE)
        {
            type = java/lang/Character;
        } else
        if (type == Boolean.TYPE)
        {
            type = java/lang/Boolean;
        } else
        if (type == Float.TYPE)
        {
            type = java/lang/Float;
        } else
        if (type == Double.TYPE)
        {
            type = java/lang/Double;
        } else
        if (type == Void.TYPE)
        {
            type = java/lang/Void;
        }
        if (true) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder = new StringBuilder();
        if (annotation != null)
        {
            stringbuilder.append(annotation).append("/");
        }
        a(type, stringbuilder, true);
        return stringbuilder.toString();
    }

    public static String a(Type type, Annotation aannotation[], Object obj)
    {
        Annotation annotation = null;
        int k = aannotation.length;
        for (int j = 0; j < k; j++)
        {
            Annotation annotation1 = aannotation[j];
            if (!((Boolean)e.b(annotation1.annotationType())).booleanValue())
            {
                continue;
            }
            if (annotation != null)
            {
                throw new IllegalArgumentException((new StringBuilder("Too many qualifier annotations on ")).append(obj).toString());
            }
            annotation = annotation1;
        }

        return a(type, annotation);
    }

    private static void a(Type type, StringBuilder stringbuilder, boolean flag)
    {
        int j = 0;
        if (type instanceof Class)
        {
            type = (Class)type;
            if (type.isArray())
            {
                a(((Type) (type.getComponentType())), stringbuilder, false);
                stringbuilder.append("[]");
                return;
            }
            if (type.isPrimitive())
            {
                if (flag)
                {
                    throw new UnsupportedOperationException((new StringBuilder("Uninjectable type ")).append(type.getName()).toString());
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
            a(type.getRawType(), stringbuilder, true);
            type = type.getActualTypeArguments();
            stringbuilder.append("<");
            for (; j < type.length; j++)
            {
                if (j != 0)
                {
                    stringbuilder.append(", ");
                }
                a(type[j], stringbuilder, true);
            }

            stringbuilder.append(">");
            return;
        }
        if (type instanceof GenericArrayType)
        {
            a(((GenericArrayType)type).getGenericComponentType(), stringbuilder, false);
            stringbuilder.append("[]");
            return;
        } else
        {
            throw new UnsupportedOperationException((new StringBuilder("Uninjectable type ")).append(type).toString());
        }
    }

    private static boolean a(String s, int j, String s1)
    {
        return s.regionMatches(j, s1, 0, s1.length());
    }

    static String b(String s)
    {
        int j = f(s);
        if (a(s, j, c))
        {
            return a(s, j, s.substring(0, j), c);
        } else
        {
            return null;
        }
    }

    public static boolean c(String s)
    {
        return s.startsWith("@");
    }

    public static String d(String s)
    {
        int j = 0;
        if (s.startsWith("@") || s.startsWith("members/"))
        {
            j = s.lastIndexOf('/') + 1;
        }
        if (s.indexOf('<', j) == -1 && s.indexOf('[', j) == -1)
        {
            return s.substring(j);
        } else
        {
            return null;
        }
    }

    public static boolean e(String s)
    {
        return s.startsWith("java.") || s.startsWith("javax.") || s.startsWith("android.");
    }

    private static int f(String s)
    {
        if (s.startsWith("@"))
        {
            return s.lastIndexOf('/') + 1;
        } else
        {
            return 0;
        }
    }

}
