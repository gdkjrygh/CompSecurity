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

    public static Binding create(Class class1, boolean flag)
    {
        Constructor constructor1;
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag1;
        flag1 = class1.isAnnotationPresent(javax/inject/Singleton);
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        for (Class class2 = class1; class2 != java/lang/Object; class2 = class2.getSuperclass())
        {
            Field afield[] = class2.getDeclaredFields();
            int l = afield.length;
            int i = 0;
            while (i < l) 
            {
                Field field = afield[i];
                if (field.isAnnotationPresent(javax/inject/Inject) && !Modifier.isStatic(field.getModifiers()))
                {
                    if ((field.getModifiers() & 2) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Can't inject private field: ").append(field).toString());
                    }
                    field.setAccessible(true);
                    arraylist1.add(field);
                    arraylist.add(Keys.get(field.getGenericType(), field.getAnnotations(), field));
                }
                i++;
            }
        }

        Constructor aconstructor[] = getConstructorsForType(class1);
        int i1 = aconstructor.length;
        int j = 0;
        constructor1 = null;
        while (j < i1) 
        {
            Constructor constructor2 = aconstructor[j];
            if (constructor2.isAnnotationPresent(javax/inject/Inject))
            {
                if (constructor1 != null)
                {
                    throw new dagger.internal.Binding.InvalidBindingException(class1.getName(), "has too many injectable constructors");
                }
                constructor1 = constructor2;
            }
            j++;
        }
        if (constructor1 != null) goto _L2; else goto _L1
_L1:
        if (arraylist1.isEmpty()) goto _L4; else goto _L3
_L3:
        Constructor constructor3;
        try
        {
            constructor3 = class1.getDeclaredConstructor(new Class[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            continue; /* Loop/switch isn't completed */
        }
        constructor1 = constructor3;
_L2:
        if (constructor1 == null)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        if ((constructor1.getModifiers() & 2) != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("Can't inject private constructor: ").append(constructor1).toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            throw new dagger.internal.Binding.InvalidBindingException(class1.getName(), "has no injectable members. Do you want to add an injectable constructor?");
        }
        if (true) goto _L2; else goto _L5
_L5:
        String s;
        int j1;
        String s1 = Keys.get(class1);
        constructor1.setAccessible(true);
        java.lang.reflect.Type atype[] = constructor1.getGenericParameterTypes();
        int k1 = atype.length;
        s = s1;
        j1 = k1;
        if (k1 != 0)
        {
            java.lang.annotation.Annotation aannotation[][] = constructor1.getParameterAnnotations();
            int k = 0;
            do
            {
                s = s1;
                j1 = k1;
                if (k >= atype.length)
                {
                    break;
                }
                arraylist.add(Keys.get(atype[k], aannotation[k], constructor1));
                k++;
            } while (true);
        }
        break MISSING_BLOCK_LABEL_463;
        if (flag1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No injectable constructor on @Singleton ").append(class1.getName()).toString());
        }
        s = null;
        j1 = 0;
        Class class4 = class1.getSuperclass();
        Class class3 = class4;
        if (class4 != null)
        {
            if (Keys.isPlatformType(class4.getName()))
            {
                class3 = null;
            } else
            {
                arraylist.add(Keys.getMembersKey(class4));
                class3 = class4;
            }
        }
        return new ReflectiveAtInjectBinding(s, Keys.getMembersKey(class1), flag1, class1, (Field[])arraylist1.toArray(new Field[arraylist1.size()]), constructor1, j1, class3, (String[])arraylist.toArray(new String[arraylist.size()]));
    }

    private static Constructor[] getConstructorsForType(Class class1)
    {
        return (Constructor[])class1.getDeclaredConstructors();
    }

    public void attach(Linker linker)
    {
        int j = 0;
        int i = 0;
        for (; j < fields.length; j++)
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

    public Object get()
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

    public void getDependencies(Set set, Set set1)
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

    public void injectMembers(Object obj)
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

    public String toString()
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
