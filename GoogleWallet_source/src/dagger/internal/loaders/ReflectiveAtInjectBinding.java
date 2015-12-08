// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal.loaders;

import dagger.internal.Binding;
import dagger.internal.Keys;
import dagger.internal.Linker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

public final class ReflectiveAtInjectBinding extends Binding
{
    public static class Factory
    {

        private final Constructor constructor;
        private final Field fields[];
        private final String keys[];
        private final String membersKey;
        private final int parameterCount;
        private final String provideKey;
        private final boolean singleton;
        private final Class supertype;
        private final Class type;

        public final ReflectiveAtInjectBinding create(boolean flag)
        {
            if (flag && constructor == null && fields.length == 0)
            {
                throw new dagger.internal.Binding.InvalidBindingException(type.getName(), "has no injectable members. Do you want to add an injectable constructor?");
            } else
            {
                return new ReflectiveAtInjectBinding(provideKey, membersKey, singleton, type, fields, constructor, parameterCount, supertype, keys);
            }
        }

        private Factory(String s, String s1, boolean flag, Class class1, Field afield[], Constructor constructor1, int i, 
                Class class2, String as[])
        {
            provideKey = s;
            membersKey = s1;
            singleton = flag;
            type = class1;
            fields = afield;
            constructor = constructor1;
            parameterCount = i;
            supertype = class2;
            keys = as;
        }

    }


    private final Constructor constructor;
    private final Binding fieldBindings[];
    private final Field fields[];
    private final String keys[];
    private final ClassLoader loader;
    private final Binding parameterBindings[];
    private final Class supertype;
    private Binding supertypeBinding;

    private ReflectiveAtInjectBinding(String s, String s1, boolean flag, Class class1, Field afield[], Constructor constructor1, int i, 
            Class class2, String as[])
    {
        super(s, s1, flag, class1);
        constructor = constructor1;
        fields = afield;
        supertype = class2;
        keys = as;
        parameterBindings = new Binding[i];
        fieldBindings = new Binding[afield.length];
        loader = class1.getClassLoader();
    }


    public static Factory createFactory(Class class1)
    {
        boolean flag = class1.isAnnotationPresent(javax/inject/Singleton);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (Class class2 = class1; class2 != java/lang/Object; class2 = class2.getSuperclass())
        {
            Field afield[] = class2.getDeclaredFields();
            int l = afield.length;
            for (int i = 0; i < l; i++)
            {
                Field field = afield[i];
                if (!field.isAnnotationPresent(javax/inject/Inject) || Modifier.isStatic(field.getModifiers()))
                {
                    continue;
                }
                if ((field.getModifiers() & 2) != 0)
                {
                    class1 = String.valueOf(field);
                    throw new IllegalStateException((new StringBuilder(String.valueOf(class1).length() + 28)).append("Can't inject private field: ").append(class1).toString());
                }
                field.setAccessible(true);
                arraylist1.add(field);
                arraylist.add(Keys.get(field.getGenericType(), field.getAnnotations(), field));
            }

        }

        Object obj = null;
        Constructor aconstructor[] = getConstructorsForType(class1);
        int i1 = aconstructor.length;
        for (int j = 0; j < i1;)
        {
            Constructor constructor1 = aconstructor[j];
            Object obj1 = obj;
            if (constructor1.isAnnotationPresent(javax/inject/Inject))
            {
                if (obj != null)
                {
                    throw new dagger.internal.Binding.InvalidBindingException(class1.getName(), "has too many injectable constructors");
                }
                obj1 = constructor1;
            }
            j++;
            obj = obj1;
        }

        Object obj2 = obj;
        if (obj == null)
        {
            obj2 = obj;
            Object obj3;
            java.lang.reflect.Type atype[];
            Class class3;
            java.lang.annotation.Annotation aannotation[][];
            int k;
            int j1;
            int k1;
            if (!arraylist1.isEmpty())
            {
                try
                {
                    obj2 = class1.getDeclaredConstructor(new Class[0]);
                }
                catch (NoSuchMethodException nosuchmethodexception)
                {
                    nosuchmethodexception = ((NoSuchMethodException) (obj));
                }
            }
        }
        if (obj2 != null)
        {
            if ((((Constructor) (obj2)).getModifiers() & 2) != 0)
            {
                class1 = String.valueOf(obj2);
                throw new IllegalStateException((new StringBuilder(String.valueOf(class1).length() + 34)).append("Can't inject private constructor: ").append(class1).toString());
            }
            obj3 = Keys.get(class1);
            ((Constructor) (obj2)).setAccessible(true);
            atype = ((Constructor) (obj2)).getGenericParameterTypes();
            k1 = atype.length;
            obj = obj3;
            j1 = k1;
            if (k1 != 0)
            {
                aannotation = ((Constructor) (obj2)).getParameterAnnotations();
                k = 0;
                do
                {
                    obj = obj3;
                    j1 = k1;
                    if (k >= atype.length)
                    {
                        break;
                    }
                    arraylist.add(Keys.get(atype[k], aannotation[k], obj2));
                    k++;
                } while (true);
            }
        } else
        {
            obj = null;
            j1 = 0;
            if (flag)
            {
                class1 = String.valueOf(class1.getName());
                if (class1.length() != 0)
                {
                    class1 = "No injectable constructor on @Singleton ".concat(class1);
                } else
                {
                    class1 = new String("No injectable constructor on @Singleton ");
                }
                throw new IllegalArgumentException(class1);
            }
        }
        class3 = class1.getSuperclass();
        obj3 = class3;
        if (class3 != null)
        {
            if (Keys.isPlatformType(class3.getName()))
            {
                obj3 = null;
            } else
            {
                arraylist.add(Keys.getMembersKey(class3));
                obj3 = class3;
            }
        }
        return new Factory(((String) (obj)), Keys.getMembersKey(class1), flag, class1, (Field[])arraylist1.toArray(new Field[arraylist1.size()]), ((Constructor) (obj2)), j1, ((Class) (obj3)), (String[])arraylist.toArray(new String[arraylist.size()]));
    }

    private static Constructor[] getConstructorsForType(Class class1)
    {
        return class1.getDeclaredConstructors();
    }

    public final void attach(Linker linker)
    {
        int i = 0;
        for (int j = 0; j < fields.length; j++)
        {
            if (fieldBindings[j] == null)
            {
                fieldBindings[j] = linker.requestBinding(keys[i], fields[j], loader);
            }
            i++;
        }

        int l = i;
        if (constructor != null)
        {
            int k = 0;
            do
            {
                l = i;
                if (k >= parameterBindings.length)
                {
                    break;
                }
                if (parameterBindings[k] == null)
                {
                    parameterBindings[k] = linker.requestBinding(keys[i], constructor, loader);
                }
                i++;
                k++;
            } while (true);
        }
        if (supertype != null && supertypeBinding == null)
        {
            supertypeBinding = linker.requestBinding(keys[l], membersKey, loader, false, true);
        }
    }

    public final Object get()
    {
        if (constructor == null)
        {
            throw new UnsupportedOperationException();
        }
        Object aobj[] = new Object[parameterBindings.length];
        for (int i = 0; i < parameterBindings.length; i++)
        {
            aobj[i] = parameterBindings[i].get();
        }

        Object obj;
        try
        {
            obj = constructor.newInstance(aobj);
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
        if (parameterBindings != null)
        {
            Collections.addAll(set, parameterBindings);
        }
        Collections.addAll(set1, fieldBindings);
        if (supertypeBinding != null)
        {
            set1.add(supertypeBinding);
        }
    }

    public final void injectMembers(Object obj)
    {
        int i = 0;
        do
        {
            try
            {
                if (i >= fields.length)
                {
                    break;
                }
                fields[i].set(obj, fieldBindings[i].get());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new AssertionError(obj);
            }
            i++;
        } while (true);
        if (supertypeBinding != null)
        {
            supertypeBinding.injectMembers(obj);
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
