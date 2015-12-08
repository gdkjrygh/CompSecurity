// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;


// Referenced classes of package dagger.a:
//            o, q, b, r

public abstract class n
{

    private final q a = new o(this);

    public n()
    {
    }

    public abstract b a(String s, String s1, ClassLoader classloader, boolean flag);

    public abstract r a(Class class1);

    protected final Class a(ClassLoader classloader, String s)
    {
        if (classloader == null)
        {
            classloader = ClassLoader.getSystemClassLoader();
        }
        return (Class)((q)a.b(classloader)).b(s);
    }

    protected final Object a(String s, ClassLoader classloader)
    {
        try
        {
            classloader = a(classloader, s);
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new RuntimeException((new StringBuilder("Failed to initialize ")).append(s).toString(), classloader);
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new RuntimeException((new StringBuilder("Failed to initialize ")).append(s).toString(), classloader);
        }
        if (classloader == java/lang/Void)
        {
            return null;
        }
        classloader = ((ClassLoader) (classloader.newInstance()));
        return classloader;
    }
}
