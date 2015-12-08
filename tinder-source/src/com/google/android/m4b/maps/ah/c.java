// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.bd;
import com.google.android.m4b.maps.aa.bw;
import com.google.android.m4b.maps.aa.q;
import com.google.android.m4b.maps.aa.x;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.k;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            a, b, e, d

public class com.google.android.m4b.maps.ah.c extends com.google.android.m4b.maps.ah.a
    implements Serializable
{
    static final class a extends com.google.android.m4b.maps.ah.c
    {

        private static final long serialVersionUID = 0L;

        a(Type type)
        {
            super(type, (byte)0);
        }
    }

    public static abstract class b
    {

        static final b a = new b() {

            final Class a(Object obj)
            {
                return com.google.android.m4b.maps.ah.c.c(((com.google.android.m4b.maps.ah.c)obj).a);
            }

            final Iterable b(Object obj)
            {
                obj = (com.google.android.m4b.maps.ah.c)obj;
                if (((com.google.android.m4b.maps.ah.c) (obj)).a instanceof TypeVariable)
                {
                    return com.google.android.m4b.maps.ah.c.a(((TypeVariable)((com.google.android.m4b.maps.ah.c) (obj)).a).getBounds());
                }
                if (((com.google.android.m4b.maps.ah.c) (obj)).a instanceof WildcardType)
                {
                    return com.google.android.m4b.maps.ah.c.a(((WildcardType)((com.google.android.m4b.maps.ah.c) (obj)).a).getUpperBounds());
                }
                com.google.android.m4b.maps.aa.ae.a a1 = ae.g();
                Type atype[] = com.google.android.m4b.maps.ah.c.c(((com.google.android.m4b.maps.ah.c) (obj)).a).getGenericInterfaces();
                int k = atype.length;
                for (int i = 0; i < k; i++)
                {
                    a1.c(((com.google.android.m4b.maps.ah.c) (obj)).a(atype[i]));
                }

                return a1.a();
            }

            final Object c(Object obj)
            {
                obj = (com.google.android.m4b.maps.ah.c)obj;
                if (((com.google.android.m4b.maps.ah.c) (obj)).a instanceof TypeVariable)
                {
                    return com.google.android.m4b.maps.ah.c.b(((TypeVariable)((com.google.android.m4b.maps.ah.c) (obj)).a).getBounds()[0]);
                }
                if (((com.google.android.m4b.maps.ah.c) (obj)).a instanceof WildcardType)
                {
                    return com.google.android.m4b.maps.ah.c.b(((WildcardType)((com.google.android.m4b.maps.ah.c) (obj)).a).getUpperBounds()[0]);
                }
                Type type = com.google.android.m4b.maps.ah.c.c(((com.google.android.m4b.maps.ah.c) (obj)).a).getGenericSuperclass();
                if (type == null)
                {
                    return null;
                } else
                {
                    return ((com.google.android.m4b.maps.ah.c) (obj)).a(type);
                }
            }

        };
        public static final b b = new b() {

            final Class a(Object obj)
            {
                return (Class)obj;
            }

            final Iterable b(Object obj)
            {
                return Arrays.asList(((Class)obj).getInterfaces());
            }

            final Object c(Object obj)
            {
                return ((Class)obj).getSuperclass();
            }

        };

        private int a(Object obj, Map map)
        {
            Object obj1 = (Integer)map.get(this);
            if (obj1 != null)
            {
                return ((Integer) (obj1)).intValue();
            }
            int i;
            if (a(obj).isInterface())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            for (obj1 = b(obj).iterator(); ((Iterator) (obj1)).hasNext();)
            {
                i = Math.max(i, a(((Iterator) (obj1)).next(), map));
            }

            obj1 = c(obj);
            int k = i;
            if (obj1 != null)
            {
                k = Math.max(i, a(obj1, map));
            }
            map.put(obj, Integer.valueOf(k + 1));
            return k + 1;
        }

        public final ae a(Iterable iterable)
        {
            java.util.HashMap hashmap = ax.b();
            for (iterable = iterable.iterator(); iterable.hasNext(); a(iterable.next(), ((Map) (hashmap)))) { }
            iterable = new q(q.b().a(), hashmap) {

                private Comparator a;
                private Map b;

                public final int compare(Object obj, Object obj1)
                {
                    return a.compare(b.get(obj), b.get(obj1));
                }

            
            {
                a = comparator;
                b = map;
                super();
            }
            };
            Object aobj[] = (Object[])com.google.android.m4b.maps.aa.d.b(hashmap.keySet());
            int k = aobj.length;
            for (int i = 0; i < k; i++)
            {
                j.a(aobj[i]);
            }

            Arrays.sort(aobj, iterable);
            return ae.b(aobj);
        }

        abstract Class a(Object obj);

        abstract Iterable b(Object obj);

        abstract Object c(Object obj);


        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    static abstract class c extends Enum
        implements k
    {

        public static final c a;
        private static c b;
        private static final c c[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/google/android/m4b/maps/ah/c$c, s);
        }

        public static c[] values()
        {
            return (c[])c.clone();
        }

        static 
        {
            a = new c("IGNORE_TYPE_VARIABLE_OR_WILDCARD") {

                public final boolean a(Object obj)
                {
                    obj = (com.google.android.m4b.maps.ah.c)obj;
                    return !(com.google.android.m4b.maps.ah.c.b(((com.google.android.m4b.maps.ah.c) (obj))) instanceof TypeVariable) && !(com.google.android.m4b.maps.ah.c.b(((com.google.android.m4b.maps.ah.c) (obj))) instanceof WildcardType);
                }

            };
            b = new c("INTERFACE_ONLY") {

                public final boolean a(Object obj)
                {
                    return com.google.android.m4b.maps.ah.c.c(((com.google.android.m4b.maps.ah.c)obj).a).isInterface();
                }

            };
            c = (new c[] {
                a, b
            });
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

    public final class d extends bw
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        public com.google.android.m4b.maps.ah.c a;
        private transient al b;

        protected final Collection a()
        {
            return b();
        }

        protected final Set b()
        {
            al al1 = b;
            Object obj = al1;
            if (al1 == null)
            {
                obj = bd.a(b.a.a(ae.a(a)));
                c c1 = c.a;
                obj = al.a(bd.a(com.google.android.m4b.maps.aa.d.a(((bd) (obj)).a, c1)).a);
                b = ((al) (obj));
            }
            return ((Set) (obj));
        }

        protected final Object c()
        {
            return b();
        }

        public d()
        {
            a = com.google.android.m4b.maps.ah.c.this;
            super();
        }
    }


    final Type a;
    private transient com.google.android.m4b.maps.ah.b b;

    protected com.google.android.m4b.maps.ah.c()
    {
        a = a();
        boolean flag;
        if (!(a instanceof TypeVariable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", new Object[] {
            a
        });
    }

    private com.google.android.m4b.maps.ah.c(Type type)
    {
        a = (Type)j.a(type);
    }

    com.google.android.m4b.maps.ah.c(Type type, byte byte0)
    {
        this(type);
    }

    static ae a(Type atype[])
    {
        com.google.android.m4b.maps.aa.ae.a a1 = ae.g();
        int k = atype.length;
        for (int i = 0; i < k; i++)
        {
            com.google.android.m4b.maps.ah.c c1 = d(atype[i]);
            if (c(c1.a).isInterface())
            {
                a1.c(c1);
            }
        }

        return a1.a();
    }

    public static al a(com.google.android.m4b.maps.ah.c c1)
    {
        return e(c1.a);
    }

    public static com.google.android.m4b.maps.ah.c a(Class class1)
    {
        return new a(class1);
    }

    static com.google.android.m4b.maps.ah.c b(Type type)
    {
        com.google.android.m4b.maps.ah.c c1 = d(type);
        type = c1;
        if (c(c1.a).isInterface())
        {
            type = null;
        }
        return type;
    }

    static Type b(com.google.android.m4b.maps.ah.c c1)
    {
        return c1.a;
    }

    static Class c(Type type)
    {
        return (Class)e(type).a().next();
    }

    private static com.google.android.m4b.maps.ah.c d(Type type)
    {
        return new a(type);
    }

    private static al e(Type type)
    {
        j.a(type);
        com.google.android.m4b.maps.aa.al.a a1 = al.h();
        (new com.google.android.m4b.maps.ah.d(a1) {

            private com.google.android.m4b.maps.aa.al.a a;

            final void a(Class class1)
            {
                a.c(class1);
            }

            final void a(GenericArrayType genericarraytype)
            {
                a.c(com.google.android.m4b.maps.ah.e.a(com.google.android.m4b.maps.ah.c.c(genericarraytype.getGenericComponentType())));
            }

            final void a(ParameterizedType parameterizedtype)
            {
                a.c((Class)parameterizedtype.getRawType());
            }

            final void a(TypeVariable typevariable)
            {
                a(typevariable.getBounds());
            }

            final void a(WildcardType wildcardtype)
            {
                a(wildcardtype.getUpperBounds());
            }

            
            {
                a = a1;
                super();
            }
        }).a(new Type[] {
            type
        });
        return a1.a();
    }

    final com.google.android.m4b.maps.ah.c a(Type type)
    {
        j.a(type);
        com.google.android.m4b.maps.ah.b b2 = b;
        com.google.android.m4b.maps.ah.b b1 = b2;
        if (b2 == null)
        {
            Object obj = a;
            b1 = new com.google.android.m4b.maps.ah.b();
            obj = com.google.android.m4b.maps.ah.b.a.a(((Type) (obj)));
            b1 = new com.google.android.m4b.maps.ah.b(b1.a.a(((Map) (obj))));
            b = b1;
        }
        type = d(b1.a(type));
        type.b = b;
        return type;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof com.google.android.m4b.maps.ah.c)
        {
            obj = (com.google.android.m4b.maps.ah.c)obj;
            return a.equals(((com.google.android.m4b.maps.ah.c) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return com.google.android.m4b.maps.ah.e.b(a);
    }

    protected Object writeReplace()
    {
        return d((new com.google.android.m4b.maps.ah.b()).a(a));
    }
}
