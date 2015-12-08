// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Finalizer extends Thread
{
    private static class ShutDown extends Exception
    {

        private ShutDown()
        {
        }

    }


    private static final String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";
    private static final Field inheritableThreadLocals = getInheritableThreadLocalsField();
    private static final Logger logger = Logger.getLogger(com/google/common/base/internal/Finalizer.getName());
    private final WeakReference finalizableReferenceClassReference;
    private final PhantomReference frqReference;
    private final ReferenceQueue queue = new ReferenceQueue();

    private Finalizer(Class class1, Object obj)
    {
        super(com/google/common/base/internal/Finalizer.getName());
        finalizableReferenceClassReference = new WeakReference(class1);
        frqReference = new PhantomReference(obj, queue);
        setDaemon(true);
        try
        {
            if (inheritableThreadLocals != null)
            {
                inheritableThreadLocals.set(this, null);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            logger.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", class1);
        }
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

    public static Field getInheritableThreadLocalsField()
    {
        Field field;
        try
        {
            field = java/lang/Thread.getDeclaredField("inheritableThreadLocals");
            field.setAccessible(true);
        }
        catch (Throwable throwable)
        {
            logger.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
        return field;
    }

    public static ReferenceQueue startFinalizer(Class class1, Object obj)
    {
        if (!class1.getName().equals("com.google.common.base.FinalizableReference"))
        {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        } else
        {
            class1 = new Finalizer(class1, obj);
            class1.start();
            return ((Finalizer) (class1)).queue;
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
