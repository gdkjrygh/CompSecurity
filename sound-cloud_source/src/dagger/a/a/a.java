// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a.a;

import dagger.a.b;
import dagger.a.h;
import dagger.a.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.inject.c;

public final class a extends b
{

    private final Field a[];
    private final ClassLoader b;
    private final Constructor c;
    private final Class d;
    private final String e[];
    private final b f[];
    private final b g[];
    private b h;

    private a(String s, String s1, boolean flag, Class class1, Field afield[], Constructor constructor, int i, 
            Class class2, String as[])
    {
        super(s, s1, flag, class1);
        c = constructor;
        a = afield;
        d = class2;
        e = as;
        g = new b[i];
        f = new b[afield.length];
        b = class1.getClassLoader();
    }

    public static b a(Class class1, boolean flag)
    {
        Constructor constructor;
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag1;
        flag1 = class1.isAnnotationPresent(javax/inject/c);
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        for (Class class2 = class1; class2 != java/lang/Object; class2 = class2.getSuperclass())
        {
            Field afield[] = class2.getDeclaredFields();
            int i1 = afield.length;
            for (int i = 0; i < i1; i++)
            {
                Field field = afield[i];
                if (!field.isAnnotationPresent(javax/inject/a) || Modifier.isStatic(field.getModifiers()))
                {
                    continue;
                }
                if ((field.getModifiers() & 2) != 0)
                {
                    throw new IllegalStateException((new StringBuilder("Can't inject private field: ")).append(field).toString());
                }
                field.setAccessible(true);
                arraylist1.add(field);
                arraylist.add(dagger.a.h.a(field.getGenericType(), field.getAnnotations(), field));
            }

        }

        Constructor aconstructor[] = (Constructor[])class1.getDeclaredConstructors();
        int j1 = aconstructor.length;
        int j = 0;
        Constructor constructor1;
        for (constructor = null; j < j1; constructor = constructor1)
        {
            constructor1 = aconstructor[j];
            if (constructor1.isAnnotationPresent(javax/inject/a))
            {
                if (constructor != null)
                {
                    throw new dagger.a.b.a(class1.getName(), "has too many injectable constructors");
                }
            } else
            {
                constructor1 = constructor;
            }
            j++;
        }

        if (constructor != null) goto _L2; else goto _L1
_L1:
        if (arraylist1.isEmpty()) goto _L4; else goto _L3
_L3:
        Constructor constructor2;
        try
        {
            constructor2 = class1.getDeclaredConstructor(new Class[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            continue; /* Loop/switch isn't completed */
        }
        constructor = constructor2;
_L2:
        if (constructor == null)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        if ((constructor.getModifiers() & 2) != 0)
        {
            throw new IllegalStateException((new StringBuilder("Can't inject private constructor: ")).append(constructor).toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            throw new dagger.a.b.a(class1.getName(), "has no injectable members. Do you want to add an injectable constructor?");
        }
        if (true) goto _L2; else goto _L5
_L5:
        String s;
        int k1;
        String s1 = dagger.a.h.a(class1);
        constructor.setAccessible(true);
        java.lang.reflect.Type atype[] = constructor.getGenericParameterTypes();
        int l1 = atype.length;
        s = s1;
        k1 = l1;
        if (l1 != 0)
        {
            java.lang.annotation.Annotation aannotation[][] = constructor.getParameterAnnotations();
            int k = 0;
            do
            {
                s = s1;
                k1 = l1;
                if (k >= atype.length)
                {
                    break;
                }
                arraylist.add(dagger.a.h.a(atype[k], aannotation[k], constructor));
                k++;
            } while (true);
        }
        break MISSING_BLOCK_LABEL_453;
        if (flag1)
        {
            throw new IllegalArgumentException((new StringBuilder("No injectable constructor on @Singleton ")).append(class1.getName()).toString());
        }
        s = null;
        k1 = 0;
        Class class4 = class1.getSuperclass();
        Class class3 = class4;
        if (class4 != null)
        {
            if (dagger.a.h.e(class4.getName()))
            {
                class3 = null;
            } else
            {
                arraylist.add(dagger.a.h.a(class4));
                class3 = class4;
            }
        }
        return new a(s, dagger.a.h.a(class1), flag1, class1, (Field[])arraylist1.toArray(new Field[arraylist1.size()]), constructor, k1, class3, (String[])arraylist.toArray(new String[arraylist.size()]));
    }

    public final void attach(l l1)
    {
        int j = 0;
        int i = 0;
        for (; j < a.length; j++)
        {
            if (f[j] == null)
            {
                f[j] = l1.a(e[i], a[j], b);
            }
            i++;
        }

        int i1 = i;
        if (c != null)
        {
            int k = 0;
            do
            {
                i1 = i;
                if (k >= g.length)
                {
                    break;
                }
                if (g[k] == null)
                {
                    g[k] = l1.a(e[i], c, b);
                }
                i++;
                k++;
            } while (true);
        }
        if (d != null && h == null)
        {
            h = l1.a(e[i1], membersKey, b, false);
        }
    }

    public final Object get()
    {
        if (c == null)
        {
            throw new UnsupportedOperationException();
        }
        Object aobj[] = new Object[g.length];
        for (int i = 0; i < g.length; i++)
        {
            aobj[i] = g[i].get();
        }

        Object obj;
        try
        {
            obj = c.newInstance(aobj);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            Object obj1 = invocationtargetexception.getCause();
            if (obj1 instanceof RuntimeException)
            {
                obj1 = (RuntimeException)obj1;
            } else
            {
                obj1 = new RuntimeException(((Throwable) (obj1)));
            }
            throw obj1;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new AssertionError(illegalaccessexception);
        }
        catch (InstantiationException instantiationexception)
        {
            throw new RuntimeException(instantiationexception);
        }
        injectMembers(obj);
        return obj;
    }

    public final void getDependencies(Set set, Set set1)
    {
        if (g != null)
        {
            Collections.addAll(set, g);
        }
        Collections.addAll(set1, f);
        if (h != null)
        {
            set1.add(h);
        }
    }

    public final void injectMembers(Object obj)
    {
        int i = 0;
        do
        {
            try
            {
                if (i >= a.length)
                {
                    break;
                }
                a[i].set(obj, f[i].get());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new AssertionError(obj);
            }
            i++;
        } while (true);
        if (h != null)
        {
            h.injectMembers(obj);
        }
        return;
    }

    public final String toString()
    {
        if (provideKey != null)
        {
            return provideKey;
        } else
        {
            return membersKey;
        }
    }
}
