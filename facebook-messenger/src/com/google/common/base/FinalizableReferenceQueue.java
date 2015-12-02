// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.base:
//            FinalizableReference

public class FinalizableReferenceQueue
{

    private static final Logger logger = Logger.getLogger(com/google/common/base/FinalizableReferenceQueue.getName());
    private static final Method startFinalizer = getStartFinalizer(loadFinalizer(new FinalizerLoader[] {
        new SystemLoader(), new DecoupledLoader(), new DirectLoader()
    }));
    final ReferenceQueue queue;
    final boolean threadStarted;

    public FinalizableReferenceQueue()
    {
        ReferenceQueue referencequeue = (ReferenceQueue)startFinalizer.invoke(null, new Object[] {
            com/google/common/base/FinalizableReference, this
        });
        boolean flag = true;
_L2:
        queue = referencequeue;
        threadStarted = flag;
        return;
        Object obj;
        obj;
        throw new AssertionError(obj);
        obj;
        logger.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", ((Throwable) (obj)));
        obj = new ReferenceQueue();
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static Method getStartFinalizer(Class class1)
    {
        try
        {
            class1 = class1.getMethod("startFinalizer", new Class[] {
                java/lang/Class, java/lang/Object
            });
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError(class1);
        }
        return class1;
    }

    private static transient Class loadFinalizer(FinalizerLoader afinalizerloader[])
    {
        int j = afinalizerloader.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = afinalizerloader[i].loadFinalizer();
            if (class1 != null)
            {
                return class1;
            }
        }

        throw new AssertionError();
    }



    private class FinalizerLoader
    {

        public abstract Class loadFinalizer();
    }


    private class SystemLoader
        implements FinalizerLoader
    {

        public Class loadFinalizer()
        {
            Class class1 = null;
            ClassLoader classloader;
            try
            {
                classloader = ClassLoader.getSystemClassLoader();
            }
            catch (SecurityException securityexception)
            {
                FinalizableReferenceQueue.logger.info("Not allowed to access system class loader.");
                return null;
            }
            if (classloader != null)
            {
                try
                {
                    class1 = classloader.loadClass("com.google.common.base.internal.Finalizer");
                }
                catch (ClassNotFoundException classnotfoundexception)
                {
                    return null;
                }
            }
            return class1;
        }

        SystemLoader()
        {
        }
    }


    private class DecoupledLoader
        implements FinalizerLoader
    {

        URL getBaseUrl()
        {
            String s = (new StringBuilder()).append("com.google.common.base.internal.Finalizer".replace('.', '/')).append(".class").toString();
            URL url = getClass().getClassLoader().getResource(s);
            if (url == null)
            {
                throw new FileNotFoundException(s);
            }
            String s1 = url.toString();
            if (!s1.endsWith(s))
            {
                throw new IOException((new StringBuilder()).append("Unsupported path style: ").append(s1).toString());
            } else
            {
                return new URL(url, s1.substring(0, s1.length() - s.length()));
            }
        }

        public Class loadFinalizer()
        {
            Class class1;
            try
            {
                class1 = newLoader(getBaseUrl()).loadClass("com.google.common.base.internal.Finalizer");
            }
            catch (Exception exception)
            {
                FinalizableReferenceQueue.logger.log(Level.WARNING, "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.", exception);
                return null;
            }
            return class1;
        }

        URLClassLoader newLoader(URL url)
        {
            return new URLClassLoader(new URL[] {
                url
            });
        }

        DecoupledLoader()
        {
        }
    }


    private class DirectLoader
        implements FinalizerLoader
    {

        public Class loadFinalizer()
        {
            Class class1;
            try
            {
                class1 = Class.forName("com.google.common.base.internal.Finalizer");
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                throw new AssertionError(classnotfoundexception);
            }
            return class1;
        }

        DirectLoader()
        {
        }
    }

}
