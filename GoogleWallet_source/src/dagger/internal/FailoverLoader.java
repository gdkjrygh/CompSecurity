// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.internal.loaders.ReflectiveAtInjectBinding;
import dagger.internal.loaders.ReflectiveStaticInjection;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package dagger.internal:
//            Loader, Memoizer, Binding, ModuleAdapter, 
//            StaticInjection

public final class FailoverLoader extends Loader
{
    static final class AtInjectBindingInfo
    {

        private final Constructor adapterConstructor;
        private final dagger.internal.loaders.ReflectiveAtInjectBinding.Factory reflectiveBindingFactory;



        AtInjectBindingInfo(Constructor constructor, dagger.internal.loaders.ReflectiveAtInjectBinding.Factory factory)
        {
            adapterConstructor = constructor;
            reflectiveBindingFactory = factory;
        }
    }

    static final class AtInjectBindingKey
    {

        private final ClassLoader classLoader;
        private final String className;

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof AtInjectBindingKey)
                {
                    if (classLoader != ((AtInjectBindingKey) (obj = (AtInjectBindingKey)obj)).classLoader || !className.equals(((AtInjectBindingKey) (obj)).className))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return className.hashCode();
        }



        AtInjectBindingKey(ClassLoader classloader, String s)
        {
            classLoader = classloader;
            className = s;
        }
    }


    private final Memoizer atInjectBindings = new Memoizer() {

        final FailoverLoader this$0;

        private AtInjectBindingInfo create(AtInjectBindingKey atinjectbindingkey)
        {
            return getAtInjectBindingInfo(atinjectbindingkey.classLoader, atinjectbindingkey.className);
        }

        protected final volatile Object create(Object obj)
        {
            return create((AtInjectBindingKey)obj);
        }

            
            {
                this$0 = FailoverLoader.this;
                super();
            }
    };
    private final Memoizer loadedAdapters = new Memoizer() {

        final FailoverLoader this$0;

        private ModuleAdapter create(Class class1)
        {
            ModuleAdapter moduleadapter = (ModuleAdapter)instantiate(class1.getName().concat("$$ModuleAdapter"), class1.getClassLoader());
            if (moduleadapter == null)
            {
                class1 = String.valueOf(class1);
                throw new IllegalStateException((new StringBuilder(String.valueOf(class1).length() + 100)).append("Module adapter for ").append(class1).append(" could not be loaded. Please ensure that code generation was run for this module.").toString());
            } else
            {
                return moduleadapter;
            }
        }

        protected final volatile Object create(Object obj)
        {
            return create((Class)obj);
        }

            
            {
                this$0 = FailoverLoader.this;
                super();
            }
    };

    public FailoverLoader()
    {
    }

    private AtInjectBindingInfo getAtInjectBindingInfo(ClassLoader classloader, String s)
    {
        Class class1 = loadClass(classloader, s.concat("$$InjectAdapter"));
        if (!class1.equals(java/lang/Void))
        {
            try
            {
                classloader = new AtInjectBindingInfo(class1.getConstructor(new Class[0]), null);
            }
            // Misplaced declaration of an exception variable
            catch (ClassLoader classloader)
            {
                classloader = String.valueOf(s);
                if (classloader.length() != 0)
                {
                    classloader = "Couldn't find default constructor in the generated inject adapter for class ".concat(classloader);
                } else
                {
                    classloader = new String("Couldn't find default constructor in the generated inject adapter for class ");
                }
                throw new IllegalStateException(classloader);
            }
            return classloader;
        }
        classloader = loadClass(classloader, s);
        if (classloader.equals(java/lang/Void))
        {
            classloader = String.valueOf(s);
            if (classloader.length() != 0)
            {
                classloader = "Could not load class ".concat(classloader);
            } else
            {
                classloader = new String("Could not load class ");
            }
            throw new IllegalStateException(classloader);
        }
        if (classloader.isInterface())
        {
            return new AtInjectBindingInfo(null, null);
        } else
        {
            return new AtInjectBindingInfo(null, ReflectiveAtInjectBinding.createFactory(classloader));
        }
    }

    public final Binding getAtInjectBinding(String s, String s1, ClassLoader classloader, boolean flag)
    {
        s = (AtInjectBindingInfo)atInjectBindings.get(new AtInjectBindingKey(classloader, s1));
        if (((AtInjectBindingInfo) (s)).adapterConstructor != null)
        {
            try
            {
                s = (Binding)((AtInjectBindingInfo) (s)).adapterConstructor.newInstance(new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ClassLoader classloader)
            {
                s = String.valueOf(s1);
                if (s.length() != 0)
                {
                    s = "Could not create an instance of the inject adapter for class ".concat(s);
                } else
                {
                    s = new String("Could not create an instance of the inject adapter for class ");
                }
                throw new IllegalStateException(s, classloader);
            }
            // Misplaced declaration of an exception variable
            catch (ClassLoader classloader)
            {
                s = String.valueOf(s1);
                if (s.length() != 0)
                {
                    s = "Could not create an instance of the inject adapter for class ".concat(s);
                } else
                {
                    s = new String("Could not create an instance of the inject adapter for class ");
                }
                throw new IllegalStateException(s, classloader);
            }
            // Misplaced declaration of an exception variable
            catch (ClassLoader classloader)
            {
                s = String.valueOf(s1);
                if (s.length() != 0)
                {
                    s = "Could not create an instance of the inject adapter for class ".concat(s);
                } else
                {
                    s = new String("Could not create an instance of the inject adapter for class ");
                }
                throw new IllegalStateException(s, classloader);
            }
            // Misplaced declaration of an exception variable
            catch (ClassLoader classloader)
            {
                s = String.valueOf(s1);
                if (s.length() != 0)
                {
                    s = "Could not create an instance of the inject adapter for class ".concat(s);
                } else
                {
                    s = new String("Could not create an instance of the inject adapter for class ");
                }
                throw new IllegalStateException(s, classloader);
            }
            return s;
        }
        if (((AtInjectBindingInfo) (s)).reflectiveBindingFactory != null)
        {
            return ((AtInjectBindingInfo) (s)).reflectiveBindingFactory.create(flag);
        } else
        {
            return null;
        }
    }

    public final ModuleAdapter getModuleAdapter(Class class1)
    {
        return (ModuleAdapter)loadedAdapters.get(class1);
    }

    public final StaticInjection getStaticInjection(Class class1)
    {
        StaticInjection staticinjection = (StaticInjection)instantiate(class1.getName().concat("$$StaticInjection"), class1.getClassLoader());
        if (staticinjection != null)
        {
            return staticinjection;
        } else
        {
            return ReflectiveStaticInjection.create(class1);
        }
    }

}
