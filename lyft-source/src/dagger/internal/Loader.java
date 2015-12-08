// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Memoizer, Binding, ModuleAdapter, StaticInjection

public abstract class Loader
{

    private final Memoizer caches = new Memoizer() {

        final Loader this$0;

        protected Memoizer create(ClassLoader classloader)
        {
            return classloader. new Memoizer() {

                final _cls1 this$1;
                final ClassLoader val$classLoader;

                protected Class create(String s)
                {
                    try
                    {
                        s = classLoader.loadClass(s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        return java/lang/Void;
                    }
                    return s;
                }

                protected volatile Object create(Object obj)
                {
                    return create((String)obj);
                }

            
            {
                this$1 = final__pcls1;
                classLoader = ClassLoader.this;
                super();
            }
            };
        }

        protected volatile Object create(Object obj)
        {
            return create((ClassLoader)obj);
        }

            
            {
                this$0 = Loader.this;
                super();
            }
    };

    public Loader()
    {
    }

    public abstract Binding getAtInjectBinding(String s, String s1, ClassLoader classloader, boolean flag);

    public abstract ModuleAdapter getModuleAdapter(Class class1);

    public abstract StaticInjection getStaticInjection(Class class1);

    protected Object instantiate(String s, ClassLoader classloader)
    {
        try
        {
            classloader = loadClass(classloader, s);
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to initialize ").append(s).toString(), classloader);
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to initialize ").append(s).toString(), classloader);
        }
        if (classloader == java/lang/Void)
        {
            return null;
        }
        classloader = ((ClassLoader) (classloader.newInstance()));
        return classloader;
    }

    protected Class loadClass(ClassLoader classloader, String s)
    {
        if (classloader == null)
        {
            classloader = ClassLoader.getSystemClassLoader();
        }
        return (Class)((Memoizer)caches.get(classloader)).get(s);
    }
}
