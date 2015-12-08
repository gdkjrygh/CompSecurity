// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.d;
import com.google.android.m4b.maps.y.f;
import com.google.android.m4b.maps.y.g;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.l;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            a

final class com.google.android.m4b.maps.ah.e
{
    static abstract class a extends Enum
    {

        static final a a;
        private static a b;
        private static a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/ah/e$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        abstract Class a(Class class1);

        static 
        {
            int i = 0;
            b = new a("OWNED_BY_ENCLOSING_CLASS") {

                final Class a(Class class1)
                {
                    return class1.getEnclosingClass();
                }

            };
            c = new a("LOCAL_CLASS_HAS_NO_OWNER") {

                final Class a(Class class1)
                {
                    if (class1.isLocalClass())
                    {
                        return null;
                    } else
                    {
                        return class1.getEnclosingClass();
                    }
                }

            };
            d = (new a[] {
                b, c
            });
            ParameterizedType parameterizedtype = (ParameterizedType)(new a.a() {

            }).getClass().getGenericSuperclass();
            a aa[] = values();
            for (int k = aa.length; i < k; i++)
            {
                a a1 = aa[i];
                if (a1.a(com/google/android/m4b/maps/ah/e$a$a) == parameterizedtype.getOwnerType())
                {
                    a = a1;
                    return;
                }
            }

            throw new AssertionError();
        }

        private a(String s, int i)
        {
            super(s, i);
        }

        a(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

    class a.a
    {

        a.a()
        {
        }
    }

    static final class b
        implements Serializable, GenericArrayType
    {

        private static final long serialVersionUID = 0L;
        private final Type a;

        public final boolean equals(Object obj)
        {
            if (obj instanceof GenericArrayType)
            {
                obj = (GenericArrayType)obj;
                return h.a(getGenericComponentType(), ((GenericArrayType) (obj)).getGenericComponentType());
            } else
            {
                return false;
            }
        }

        public final Type getGenericComponentType()
        {
            return a;
        }

        public final int hashCode()
        {
            return a.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder()).append(com.google.android.m4b.maps.ah.e.b(a)).append("[]").toString();
        }

        b(Type type)
        {
            a = c.a.b(type);
        }
    }

    static abstract class c extends Enum
    {

        static final c a;
        private static c b;
        private static c c;
        private static final c d[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/google/android/m4b/maps/ah/e$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        final ae a(Type atype[])
        {
            com.google.android.m4b.maps.aa.ae.a a1 = ae.g();
            int k = atype.length;
            for (int i = 0; i < k; i++)
            {
                a1.c(b(atype[i]));
            }

            return a1.a();
        }

        abstract Type a(Type type);

        abstract Type b(Type type);

        static 
        {
            b = new c("JAVA6") {

                final Type a(Type type)
                {
                    return new b(type);
                }

                final Type b(Type type)
                {
                    j.a(type);
                    Object obj = type;
                    if (type instanceof Class)
                    {
                        Class class1 = (Class)type;
                        obj = type;
                        if (class1.isArray())
                        {
                            obj = new b(class1.getComponentType());
                        }
                    }
                    return ((Type) (obj));
                }

            };
            c = new c("JAVA7") {

                final Type a(Type type)
                {
                    if (type instanceof Class)
                    {
                        return com.google.android.m4b.maps.ah.e.a((Class)type);
                    } else
                    {
                        return new b(type);
                    }
                }

                final Type b(Type type)
                {
                    return (Type)j.a(type);
                }

            };
            d = (new c[] {
                b, c
            });
            c c1;
            if ((new com.google.android.m4b.maps.ah.a() {

    }).a() instanceof Class)
            {
                c1 = c;
            } else
            {
                c1 = b;
            }
            a = c1;
        }

        private c(String s, int i)
        {
            super(s, i);
        }

        c(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

    static final class d
    {

        static final boolean a;

        static 
        {
            boolean flag = false;
            if (!com/google/android/m4b/maps/ah/e$d.getTypeParameters()[0].equals(com.google.android.m4b.maps.ah.e.a(com/google/android/m4b/maps/ah/e$d, "X", new Type[0])))
            {
                flag = true;
            }
            a = flag;
        }

        d()
        {
        }
    }

    static final class e
        implements Serializable, ParameterizedType
    {

        private static final long serialVersionUID = 0L;
        private final Type a;
        private final ae b;
        private final Class c;

        public final boolean equals(Object obj)
        {
            if (obj instanceof ParameterizedType)
            {
                if (getRawType().equals(((ParameterizedType) (obj = (ParameterizedType)obj)).getRawType()) && h.a(getOwnerType(), ((ParameterizedType) (obj)).getOwnerType()) && Arrays.equals(getActualTypeArguments(), ((ParameterizedType) (obj)).getActualTypeArguments()))
                {
                    return true;
                }
            }
            return false;
        }

        public final Type[] getActualTypeArguments()
        {
            return com.google.android.m4b.maps.ah.e.a(b);
        }

        public final Type getOwnerType()
        {
            return a;
        }

        public final Type getRawType()
        {
            return c;
        }

        public final int hashCode()
        {
            int i;
            if (a == null)
            {
                i = 0;
            } else
            {
                i = a.hashCode();
            }
            return i ^ b.hashCode() ^ c.hashCode();
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (a != null)
            {
                stringbuilder.append(com.google.android.m4b.maps.ah.e.b(a)).append('.');
            }
            stringbuilder.append(c.getName()).append('<').append(com.google.android.m4b.maps.ah.e.b().a(com.google.android.m4b.maps.aa.d.a(b, com.google.android.m4b.maps.ah.e.a()))).append('>');
            return stringbuilder.toString();
        }

        e(Type type, Class class1, Type atype[])
        {
            j.a(class1);
            boolean flag;
            if (atype.length == class1.getTypeParameters().length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j.a(flag);
            com.google.android.m4b.maps.ah.e.a(atype, "type parameter");
            a = type;
            c = class1;
            b = c.a.a(atype);
        }
    }

    static final class f
        implements TypeVariable
    {

        private final GenericDeclaration a;
        private final String b;
        private final ae c;

        public final boolean equals(Object obj)
        {
            if (!d.a) goto _L2; else goto _L1
_L1:
            if (!(obj instanceof f)) goto _L4; else goto _L3
_L3:
            obj = (f)obj;
            if (!b.equals(((f) (obj)).getName()) || !a.equals(((f) (obj)).getGenericDeclaration()) || !c.equals(((f) (obj)).c)) goto _L6; else goto _L5
_L5:
            return true;
_L6:
            return false;
_L4:
            return false;
_L2:
            if (obj instanceof TypeVariable)
            {
                obj = (TypeVariable)obj;
                if (!b.equals(((TypeVariable) (obj)).getName()) || !a.equals(((TypeVariable) (obj)).getGenericDeclaration()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
            if (true) goto _L5; else goto _L7
_L7:
        }

        public final Type[] getBounds()
        {
            return com.google.android.m4b.maps.ah.e.a(c);
        }

        public final GenericDeclaration getGenericDeclaration()
        {
            return a;
        }

        public final String getName()
        {
            return b;
        }

        public final int hashCode()
        {
            return a.hashCode() ^ b.hashCode();
        }

        public final String toString()
        {
            return b;
        }

        f(GenericDeclaration genericdeclaration, String s, Type atype[])
        {
            com.google.android.m4b.maps.ah.e.a(atype, "bound for type variable");
            a = (GenericDeclaration)j.a(genericdeclaration);
            b = (String)j.a(s);
            c = ae.a(atype);
        }
    }

    static final class g
        implements Serializable, WildcardType
    {

        private static final long serialVersionUID = 0L;
        private final ae a;
        private final ae b;

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof WildcardType)
            {
                obj = (WildcardType)obj;
                flag = flag1;
                if (a.equals(Arrays.asList(((WildcardType) (obj)).getLowerBounds())))
                {
                    flag = flag1;
                    if (b.equals(Arrays.asList(((WildcardType) (obj)).getUpperBounds())))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public final Type[] getLowerBounds()
        {
            return com.google.android.m4b.maps.ah.e.a(a);
        }

        public final Type[] getUpperBounds()
        {
            return com.google.android.m4b.maps.ah.e.a(b);
        }

        public final int hashCode()
        {
            return a.hashCode() ^ b.hashCode();
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder("?");
            Type type;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(" super ").append(com.google.android.m4b.maps.ah.e.b(type)))
            {
                type = (Type)iterator.next();
            }

            Type type1;
            for (Iterator iterator1 = com.google.android.m4b.maps.ah.e.a(b).iterator(); iterator1.hasNext(); stringbuilder.append(" extends ").append(com.google.android.m4b.maps.ah.e.b(type1)))
            {
                type1 = (Type)iterator1.next();
            }

            return stringbuilder.toString();
        }

        g(Type atype[], Type atype1[])
        {
            com.google.android.m4b.maps.ah.e.a(atype, "lower bound for wildcard");
            com.google.android.m4b.maps.ah.e.a(atype1, "upper bound for wildcard");
            a = c.a.a(atype);
            b = c.a.a(atype1);
        }
    }


    private static final com.google.android.m4b.maps.y.f a = new com.google.android.m4b.maps.y.f() {

        public final Object a(Object obj)
        {
            return com.google.android.m4b.maps.ah.e.b((Type)obj);
        }

    };
    private static final com.google.android.m4b.maps.y.g b = com.google.android.m4b.maps.y.g.a(", ").b("null");

    static com.google.android.m4b.maps.y.f a()
    {
        return a;
    }

    static Class a(Class class1)
    {
        return Array.newInstance(class1, 0).getClass();
    }

    static Iterable a(Iterable iterable)
    {
        return com.google.android.m4b.maps.aa.d.a(iterable, l.a(l.a(java/lang/Object)));
    }

    static transient ParameterizedType a(Type type, Class class1, Type atype[])
    {
        if (type == null)
        {
            return new e(a.a.a(class1), class1, atype);
        }
        j.a(atype);
        boolean flag;
        if (class1.getEnclosingClass() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "Owner type for unenclosed %s", new Object[] {
            class1
        });
        return new e(type, class1, atype);
    }

    static Type a(Type type)
    {
        if (type instanceof WildcardType)
        {
            type = (WildcardType)type;
            Type atype[] = type.getLowerBounds();
            boolean flag;
            if (atype.length <= 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j.a(flag, "Wildcard cannot have more than one lower bounds.");
            if (atype.length == 1)
            {
                return new g(new Type[] {
                    a(atype[0])
                }, new Type[] {
                    java/lang/Object
                });
            }
            type = type.getUpperBounds();
            if (type.length == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j.a(flag, "Wildcard should have only one upper bound.");
            type = a(type[0]);
            return new g(new Type[0], new Type[] {
                type
            });
        } else
        {
            return c.a.a(type);
        }
    }

    static transient TypeVariable a(GenericDeclaration genericdeclaration, String s, Type atype[])
    {
        Type atype1[] = atype;
        if (atype.length == 0)
        {
            atype1 = new Type[1];
            atype1[0] = java/lang/Object;
        }
        return new f(genericdeclaration, s, atype1);
    }

    static void a(Type atype[], String s)
    {
        int k = atype.length;
        int i = 0;
        while (i < k) 
        {
            Object obj = atype[i];
            if (obj instanceof Class)
            {
                obj = (Class)obj;
                boolean flag;
                if (!((Class) (obj)).isPrimitive())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j.a(flag, "Primitive type '%s' used as %s", new Object[] {
                    obj, s
                });
            }
            i++;
        }
    }

    static Type[] a(Collection collection)
    {
        return (Type[])collection.toArray(new Type[collection.size()]);
    }

    static com.google.android.m4b.maps.y.g b()
    {
        return b;
    }

    static String b(Type type)
    {
        if (type instanceof Class)
        {
            return ((Class)type).getName();
        } else
        {
            return type.toString();
        }
    }

}
