// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal.loaders;

import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Keys;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import dagger.internal.SetBinding;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Set;
import javax.inject.Provider;
import javax.inject.Singleton;

public class ReflectiveModuleAdapter extends ModuleAdapter
{
    static final class ReflectiveProvidesBinding extends ProvidesBinding
    {

        private final Object instance;
        private final Method method;
        private Binding parameters[];

        public final void attach(Linker linker)
        {
            java.lang.reflect.Type atype[] = method.getGenericParameterTypes();
            java.lang.annotation.Annotation aannotation[][] = method.getParameterAnnotations();
            parameters = new Binding[atype.length];
            for (int i = 0; i < parameters.length; i++)
            {
                Object obj = atype[i];
                java.lang.annotation.Annotation aannotation1[] = aannotation[i];
                String s = String.valueOf(method);
                obj = Keys.get(((java.lang.reflect.Type) (obj)), aannotation1, (new StringBuilder(String.valueOf(s).length() + 22)).append(s).append(" parameter ").append(i).toString());
                parameters[i] = linker.requestBinding(((String) (obj)), method, instance.getClass().getClassLoader());
            }

        }

        public final Object get()
        {
            Object aobj[] = new Object[parameters.length];
            for (int i = 0; i < parameters.length; i++)
            {
                aobj[i] = parameters[i].get();
            }

            Object obj;
            try
            {
                obj = method.invoke(instance, aobj);
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
                throw new RuntimeException(illegalaccessexception);
            }
            return obj;
        }

        public final void getDependencies(Set set, Set set1)
        {
            set1 = parameters;
            int j = set1.length;
            for (int i = 0; i < j; i++)
            {
                set.add(set1[i]);
            }

        }

        public final void injectMembers(Object obj)
        {
            throw new AssertionError("Provides method bindings are not MembersInjectors");
        }

        public ReflectiveProvidesBinding(Method method1, String s, String s1, Object obj, boolean flag)
        {
            super(s, method1.isAnnotationPresent(javax/inject/Singleton), s1, method1.getName());
            method = method1;
            instance = obj;
            method1.setAccessible(true);
            setLibrary(flag);
        }
    }


    public ReflectiveModuleAdapter(Class class1, Module module)
    {
        super(class1, injectableTypesToKeys(module.injects()), module.staticInjections(), module.overrides(), module.includes(), module.complete(), module.library());
    }

    public static ModuleAdapter create(Class class1)
    {
        Module module = (Module)class1.getAnnotation(dagger/Module);
        if (module == null)
        {
            class1 = String.valueOf(class1.getName());
            if (class1.length() != 0)
            {
                class1 = "No @Module on ".concat(class1);
            } else
            {
                class1 = new String("No @Module on ");
            }
            throw new IllegalArgumentException(class1);
        }
        if (!class1.getSuperclass().equals(java/lang/Object))
        {
            class1 = String.valueOf(class1.getName());
            if (class1.length() != 0)
            {
                class1 = "Modules must not extend from other classes: ".concat(class1);
            } else
            {
                class1 = new String("Modules must not extend from other classes: ");
            }
            throw new IllegalArgumentException(class1);
        } else
        {
            return new ReflectiveModuleAdapter(class1, module);
        }
    }

    private void handleBindings(BindingsGroup bindingsgroup, Object obj, Method method, String s, boolean flag)
    {
        bindingsgroup.contributeProvidesBinding(s, new ReflectiveProvidesBinding(method, s, moduleClass.getName(), obj, flag));
    }

    private void handleSetBindings(BindingsGroup bindingsgroup, Object obj, Method method, String s, String s1, boolean flag)
    {
        SetBinding.add(bindingsgroup, s, new ReflectiveProvidesBinding(method, s1, moduleClass.getName(), obj, flag));
    }

    private static String[] injectableTypesToKeys(Class aclass[])
    {
        String as[] = new String[aclass.length];
        int i = 0;
        while (i < aclass.length) 
        {
            Object obj = aclass[i];
            if (((Class) (obj)).isInterface())
            {
                obj = Keys.get(((java.lang.reflect.Type) (obj)));
            } else
            {
                obj = Keys.getMembersKey(((Class) (obj)));
            }
            as[i] = ((String) (obj));
            i++;
        }
        return as;
    }

    public void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        Class class1 = moduleClass;
_L5:
        Method amethod[];
        int i;
        int j;
        if (class1.equals(java/lang/Object))
        {
            break; /* Loop/switch isn't completed */
        }
        amethod = class1.getDeclaredMethods();
        j = amethod.length;
        i = 0;
_L2:
        Object obj1;
        Method method;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_430;
        }
        method = amethod[i];
        Provides provides = (Provides)method.getAnnotation(dagger/Provides);
        if (provides != null)
        {
            java.lang.reflect.Type type = method.getGenericReturnType();
            obj1 = type;
            if (type instanceof ParameterizedType)
            {
                obj1 = ((ParameterizedType)type).getRawType();
            }
            if (javax/inject/Provider.equals(obj1))
            {
                bindingsgroup = String.valueOf(class1.getName());
                obj = String.valueOf(method.getName());
                throw new IllegalStateException((new StringBuilder(String.valueOf(bindingsgroup).length() + 53 + String.valueOf(obj).length())).append("@Provides method must not return Provider directly: ").append(bindingsgroup).append(".").append(((String) (obj))).toString());
            }
            if (dagger/Lazy.equals(obj1))
            {
                bindingsgroup = String.valueOf(class1.getName());
                obj = String.valueOf(method.getName());
                throw new IllegalStateException((new StringBuilder(String.valueOf(bindingsgroup).length() + 49 + String.valueOf(obj).length())).append("@Provides method must not return Lazy directly: ").append(bindingsgroup).append(".").append(((String) (obj))).toString());
            }
            obj1 = Keys.get(type, method.getAnnotations(), method);
            static class _cls1
            {

                static final int $SwitchMap$dagger$Provides$Type[];

                static 
                {
                    $SwitchMap$dagger$Provides$Type = new int[dagger.Provides.Type.values().length];
                    try
                    {
                        $SwitchMap$dagger$Provides$Type[dagger.Provides.Type.UNIQUE.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$dagger$Provides$Type[dagger.Provides.Type.SET.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$dagger$Provides$Type[dagger.Provides.Type.SET_VALUES.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.dagger.Provides.Type[provides.type().ordinal()])
            {
            default:
                bindingsgroup = String.valueOf(provides.type());
                throw new AssertionError((new StringBuilder(String.valueOf(bindingsgroup).length() + 23)).append("Unknown @Provides type ").append(bindingsgroup).toString());

            case 2: // '\002'
                break; /* Loop/switch isn't completed */

            case 3: // '\003'
                break MISSING_BLOCK_LABEL_411;

            case 1: // '\001'
                handleBindings(bindingsgroup, obj, method, ((String) (obj1)), library);
                break;
            }
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        handleSetBindings(bindingsgroup, obj, method, Keys.getSetKey(method.getGenericReturnType(), method.getAnnotations(), method), ((String) (obj1)), library);
          goto _L3
        handleSetBindings(bindingsgroup, obj, method, ((String) (obj1)), ((String) (obj1)), library);
          goto _L3
        class1 = class1.getSuperclass();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public Object newModule()
    {
        Object obj;
        try
        {
            obj = moduleClass.getDeclaredConstructor(new Class[0]);
            ((Constructor) (obj)).setAccessible(true);
            obj = ((Constructor) (obj)).newInstance(new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new IllegalArgumentException(invocationtargetexception.getCause());
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            String s1 = String.valueOf(moduleClass.getName());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s1).length() + 165)).append("Could not construct ").append(s1).append(" as it lacks an accessible no-args constructor. This module must be passed in as an instance, or an accessible no-args constructor must be added.").toString(), nosuchmethodexception);
        }
        catch (InstantiationException instantiationexception)
        {
            String s = String.valueOf(moduleClass.getName());
            if (s.length() != 0)
            {
                s = "Failed to construct ".concat(s);
            } else
            {
                s = new String("Failed to construct ");
            }
            throw new IllegalArgumentException(s, instantiationexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new AssertionError();
        }
        return obj;
    }

    public String toString()
    {
        String s = String.valueOf(moduleClass.getName());
        return (new StringBuilder(String.valueOf(s).length() + 25)).append("ReflectiveModuleAdapter[").append(s).append("]").toString();
    }
}
