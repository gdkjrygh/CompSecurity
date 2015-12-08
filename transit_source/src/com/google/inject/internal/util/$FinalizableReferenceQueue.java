// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.inject.internal.util:
//            $FinalizableReference

public class $FinalizableReferenceQueue
{
    static class DecoupledLoader
        implements FinalizerLoader
    {

        private static final String LOADING_ERROR = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Google Collections to your system class path.";

        URL getBaseUrl()
            throws IOException
        {
            String s = (new StringBuilder()).append("com.google.inject.internal.util.$Finalizer".replace('.', '/')).append(".class").toString();
            Object obj = getClass().getClassLoader().getResource(s);
            if (obj == null)
            {
                throw new FileNotFoundException(s);
            }
            obj = ((URL) (obj)).toString();
            if (!((String) (obj)).endsWith(s))
            {
                throw new IOException((new StringBuilder()).append("Unsupported path style: ").append(((String) (obj))).toString());
            } else
            {
                return new URL(((String) (obj)).substring(0, ((String) (obj)).length() - s.length()));
            }
        }

        public Class loadFinalizer()
        {
            Class class1;
            try
            {
                class1 = newLoader(getBaseUrl()).loadClass("com.google.inject.internal.util.$Finalizer");
            }
            catch (Exception exception)
            {
                $FinalizableReferenceQueue.logger.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Google Collections to your system class path.", exception);
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

    static class DirectLoader
        implements FinalizerLoader
    {

        public Class loadFinalizer()
        {
            Class class1;
            try
            {
                class1 = Class.forName("com.google.inject.internal.util.$Finalizer");
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

    static interface FinalizerLoader
    {

        public abstract Class loadFinalizer();
    }

    static class SystemLoader
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
                $FinalizableReferenceQueue.logger.info("Not allowed to access system class loader.");
                return null;
            }
            if (classloader != null)
            {
                try
                {
                    class1 = classloader.loadClass("com.google.inject.internal.util.$Finalizer");
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


    private static final String FINALIZER_CLASS_NAME = "com.google.inject.internal.util.$Finalizer";
    private static final Logger logger = Logger.getLogger(com/google/inject/internal/util/$FinalizableReferenceQueue.getName());
    private static final Method startFinalizer = getStartFinalizer(loadFinalizer(new FinalizerLoader[] {
        new SystemLoader(), new DecoupledLoader(), new DirectLoader()
    }));
    final ReferenceQueue queue;
    final boolean threadStarted;

    public $FinalizableReferenceQueue()
    {
        boolean flag;
        flag = false;
        ReferenceQueue referencequeue = (ReferenceQueue)startFinalizer.invoke(null, new Object[] {
            com/google/inject/internal/util/$FinalizableReference, this
        });
        flag = true;
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

    void cleanUp()
    {
        Reference reference;
        if (!threadStarted)
        {
            while ((reference = queue.poll()) != null) 
            {
                reference.clear();
                try
                {
                    (($FinalizableReference)reference).finalizeReferent();
                }
                catch (Throwable throwable)
                {
                    logger.log(Level.SEVERE, "Error cleaning up after reference.", throwable);
                }
            }
        }
    }


}
