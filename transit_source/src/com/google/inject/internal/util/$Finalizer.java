// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class $Finalizer extends Thread
{
    private static class ShutDown extends Exception
    {

        private ShutDown()
        {
        }

    }


    private static final String FINALIZABLE_REFERENCE = "com.google.inject.internal.util.$FinalizableReference";
    private static final Logger logger = Logger.getLogger(com/google/inject/internal/util/$Finalizer.getName());
    private final WeakReference finalizableReferenceClassReference;
    private final PhantomReference frqReference;
    private final ReferenceQueue queue = new ReferenceQueue();

    private $Finalizer(Class class1, Object obj)
    {
        super(com/google/inject/internal/util/$Finalizer.getName());
        finalizableReferenceClassReference = new WeakReference(class1);
        frqReference = new PhantomReference(obj, queue);
        setDaemon(true);
    }

    private void cleanUp(Reference reference)
        throws ShutDown
    {
        Method method = getFinalizeReferentMethod();
        do
        {
            reference.clear();
            if (reference == frqReference)
            {
                throw new ShutDown();
            }
            Reference reference1;
            try
            {
                method.invoke(reference, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Reference reference)
            {
                logger.log(Level.SEVERE, "Error cleaning up after reference.", reference);
            }
            reference1 = queue.poll();
            reference = reference1;
        } while (reference1 != null);
    }

    private Method getFinalizeReferentMethod()
        throws ShutDown
    {
        Object obj = (Class)finalizableReferenceClassReference.get();
        if (obj == null)
        {
            throw new ShutDown();
        }
        try
        {
            obj = ((Class) (obj)).getMethod("finalizeReferent", new Class[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new AssertionError(nosuchmethodexception);
        }
        return ((Method) (obj));
    }

    public static ReferenceQueue startFinalizer(Class class1, Object obj)
    {
        if (!class1.getName().equals("com.google.inject.internal.util.$FinalizableReference"))
        {
            throw new IllegalArgumentException("Expected com.google.inject.internal.util.FinalizableReference.");
        } else
        {
            class1 = new $Finalizer(class1, obj);
            class1.start();
            return (($Finalizer) (class1)).queue;
        }
    }

    public void run()
    {
        do
        {
            try
            {
                cleanUp(queue.remove());
            }
            catch (InterruptedException interruptedexception) { }
            catch (ShutDown shutdown)
            {
                return;
            }
        } while (true);
    }

}
