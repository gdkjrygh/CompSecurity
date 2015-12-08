// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;


// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class ClassTransform
    implements Transform
{

    ClassTransform()
    {
    }

    private ClassLoader getCallerClassLoader()
    {
        return getClass().getClassLoader();
    }

    private static ClassLoader getClassLoader()
    {
        return Thread.currentThread().getContextClassLoader();
    }

    public Class read(String s)
        throws Exception
    {
        ClassLoader classloader1 = getClassLoader();
        ClassLoader classloader = classloader1;
        if (classloader1 == null)
        {
            classloader = getCallerClassLoader();
        }
        return classloader.loadClass(s);
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public String write(Class class1)
        throws Exception
    {
        return class1.getName();
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((Class)obj);
    }
}
