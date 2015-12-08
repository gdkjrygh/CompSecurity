// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.af;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.y.g;
import com.google.android.m4b.maps.y.j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            e, d

public final class com.google.android.m4b.maps.ah.b
{
    static final class a extends com.google.android.m4b.maps.ah.d
    {

        private static final d a = new d((byte)0);
        private final Map b = ax.b();

        static af a(Type type)
        {
            a a1 = new a();
            a1.a(new Type[] {
                a.a(type)
            });
            return af.a(a1.b);
        }

        final void a(Class class1)
        {
            a(new Type[] {
                class1.getGenericSuperclass()
            });
            a(class1.getGenericInterfaces());
        }

        final void a(ParameterizedType parameterizedtype)
        {
            Class class1 = (Class)parameterizedtype.getRawType();
            TypeVariable atypevariable[] = class1.getTypeParameters();
            Type atype[] = parameterizedtype.getActualTypeArguments();
            boolean flag;
            if (atypevariable.length == atype.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j.b(flag);
label0:
            for (int i = 0; i < atypevariable.length; i++)
            {
                c c1 = new c(atypevariable[i]);
                Type type = atype[i];
                if (b.containsKey(c1))
                {
                    continue;
                }
                for (Type type1 = type; type1 != null; type1 = (Type)b.get(c.a(type1)))
                {
                    if (c1.b(type1))
                    {
                        for (; type != null; type = (Type)b.remove(c.a(type))) { }
                        continue label0;
                    }
                }

                b.put(c1, type);
            }

            a(new Type[] {
                class1
            });
            a(new Type[] {
                parameterizedtype.getOwnerType()
            });
        }

        final void a(TypeVariable typevariable)
        {
            a(typevariable.getBounds());
        }

        final void a(WildcardType wildcardtype)
        {
            a(wildcardtype.getUpperBounds());
        }


        private a()
        {
        }
    }

    static class b
    {

        private final af a;

        final b a(Map map)
        {
            com.google.android.m4b.maps.aa.af.a a1 = af.e();
            a1.a(a);
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)map.next();
                c c1 = (c)((java.util.Map.Entry) (obj)).getKey();
                obj = (Type)((java.util.Map.Entry) (obj)).getValue();
                boolean flag;
                if (!c1.b(((Type) (obj))))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j.a(flag, "Type variable %s bound to itself", new Object[] {
                    c1
                });
                a1.a(c1, obj);
            }
            return new b(a1.a());
        }

        Type a(TypeVariable typevariable, b b1)
        {
            Type type;
            type = (Type)a.get(new c(typevariable));
            if (type != null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            type = typevariable.getBounds();
            if (type.length != 0) goto _L2; else goto _L1
_L1:
            return typevariable;
_L2:
            b1 = (new com.google.android.m4b.maps.ah.b(b1, (byte)0)).a(type);
            if (e.d.a && Arrays.equals(type, b1)) goto _L1; else goto _L3
_L3:
            return e.a(typevariable.getGenericDeclaration(), typevariable.getName(), b1);
            return (new com.google.android.m4b.maps.ah.b(b1, (byte)0)).a(type);
        }

        b()
        {
            a = af.d();
        }

        private b(af af1)
        {
            a = af1;
        }
    }

    static final class c
    {

        private final TypeVariable a;

        static Object a(Type type)
        {
            if (type instanceof TypeVariable)
            {
                return new c((TypeVariable)type);
            } else
            {
                return null;
            }
        }

        private boolean a(TypeVariable typevariable)
        {
            return a.getGenericDeclaration().equals(typevariable.getGenericDeclaration()) && a.getName().equals(typevariable.getName());
        }

        final boolean b(Type type)
        {
            if (type instanceof TypeVariable)
            {
                return a((TypeVariable)type);
            } else
            {
                return false;
            }
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof c)
            {
                return a(((c)obj).a);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                a.getGenericDeclaration(), a.getName()
            });
        }

        public final String toString()
        {
            return a.toString();
        }

        c(TypeVariable typevariable)
        {
            a = (TypeVariable)j.a(typevariable);
        }
    }

    static final class d
    {

        private final AtomicInteger a;

        final Type a(Type type)
        {
            j.a(type);
            break MISSING_BLOCK_LABEL_5;
            if (!(type instanceof Class) && !(type instanceof TypeVariable))
            {
                if (type instanceof GenericArrayType)
                {
                    return e.a(a(((GenericArrayType)type).getGenericComponentType()));
                }
                if (type instanceof ParameterizedType)
                {
                    ParameterizedType parameterizedtype = (ParameterizedType)type;
                    type = parameterizedtype.getOwnerType();
                    Type atype[];
                    Class class1;
                    Type atype1[];
                    if (type == null)
                    {
                        type = null;
                    } else
                    {
                        type = a(type);
                    }
                    class1 = (Class)parameterizedtype.getRawType();
                    atype = parameterizedtype.getActualTypeArguments();
                    atype1 = new Type[atype.length];
                    for (int i = 0; i < atype.length; i++)
                    {
                        atype1[i] = a(atype[i]);
                    }

                    return e.a(type, class1, atype1);
                }
                if (type instanceof WildcardType)
                {
                    WildcardType wildcardtype = (WildcardType)type;
                    if (wildcardtype.getLowerBounds().length == 0)
                    {
                        type = wildcardtype.getUpperBounds();
                        return e.a(com/google/android/m4b/maps/ah/b$d, (new StringBuilder("capture#")).append(a.incrementAndGet()).append("-of ? extends ").append(g.a('&').a(type)).toString(), wildcardtype.getUpperBounds());
                    }
                } else
                {
                    throw new AssertionError("must have been one of the known types");
                }
            }
            return type;
        }

        private d()
        {
            a = new AtomicInteger();
        }

        d(byte byte0)
        {
            this();
        }
    }


    final b a;

    public com.google.android.m4b.maps.ah.b()
    {
        a = new b();
    }

    com.google.android.m4b.maps.ah.b(b b1)
    {
        a = b1;
    }

    com.google.android.m4b.maps.ah.b(b b1, byte byte0)
    {
        this(b1);
    }

    public final Type a(Type type)
    {
        j.a(type);
        Object obj;
        if (type instanceof TypeVariable)
        {
            obj = a;
            type = (TypeVariable)type;
            obj = ((b) (obj)).a(type, new b(((b) (obj)), type, ((b) (obj))) {

                private TypeVariable a;
                private b b;
                private b c;

                public final Type a(TypeVariable typevariable, b b1)
                {
                    if (typevariable.getGenericDeclaration().equals(a.getGenericDeclaration()))
                    {
                        return typevariable;
                    } else
                    {
                        return b.a(typevariable, b1);
                    }
                }

            
            {
                c = b1;
                a = typevariable;
                b = b2;
                super();
            }
            });
        } else
        {
            if (type instanceof ParameterizedType)
            {
                obj = (ParameterizedType)type;
                type = ((ParameterizedType) (obj)).getOwnerType();
                Type type1;
                if (type == null)
                {
                    type = null;
                } else
                {
                    type = a(type);
                }
                type1 = a(((ParameterizedType) (obj)).getRawType());
                obj = a(((ParameterizedType) (obj)).getActualTypeArguments());
                return e.a(type, (Class)type1, ((Type []) (obj)));
            }
            if (type instanceof GenericArrayType)
            {
                return e.a(a(((GenericArrayType)type).getGenericComponentType()));
            }
            obj = type;
            if (type instanceof WildcardType)
            {
                WildcardType wildcardtype = (WildcardType)type;
                type = wildcardtype.getLowerBounds();
                Type atype[] = wildcardtype.getUpperBounds();
                return new e.g(a(((Type []) (type))), a(atype));
            }
        }
        return ((Type) (obj));
    }

    final Type[] a(Type atype[])
    {
        Type atype1[] = new Type[atype.length];
        for (int i = 0; i < atype.length; i++)
        {
            atype1[i] = a(atype[i]);
        }

        return atype1;
    }
}
