// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.strategy;


class Loader
{

    Loader()
    {
    }

    private static ClassLoader getCallerClassLoader()
        throws Exception
    {
        return fs/org/simpleframework/xml/strategy/Loader.getClassLoader();
    }

    private static ClassLoader getClassLoader()
        throws Exception
    {
        return Thread.currentThread().getContextClassLoader();
    }

    public Class load(String s)
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
}
