// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Stage;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Maps;
import com.google.inject.internal.util.$Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.inject.internal:
//            ErrorsException, Errors, InjectorImpl, MembersInjectorStore, 
//            Initializables, Initializable, MembersInjectorImpl

final class Initializer
{
    private class InjectableReference
        implements Initializable
    {

        private final InjectorImpl injector;
        private final Object instance;
        private MembersInjectorImpl membersInjector;
        private final Object source;
        final Initializer this$0;

        public Object get(Errors errors)
            throws ErrorsException
        {
            if (ready.getCount() == 0L)
            {
                return instance;
            }
            if (Thread.currentThread() != creatingThread)
            {
                try
                {
                    ready.await();
                    errors = ((Errors) (instance));
                }
                // Misplaced declaration of an exception variable
                catch (Errors errors)
                {
                    throw new RuntimeException(errors);
                }
                return errors;
            }
            if (pendingInjection.remove(instance) != null)
            {
                MembersInjectorImpl membersinjectorimpl = membersInjector;
                Object obj = instance;
                errors = errors.withSource(source);
                boolean flag;
                if (injector.options.stage == Stage.TOOL)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                membersinjectorimpl.injectAndNotify(obj, errors, flag);
            }
            return instance;
        }

        public String toString()
        {
            return instance.toString();
        }

        public void validate(Errors errors)
            throws ErrorsException
        {
            TypeLiteral typeliteral = TypeLiteral.get(instance.getClass());
            membersInjector = injector.membersInjectorStore.get(typeliteral, errors.withSource(source));
        }

        public InjectableReference(InjectorImpl injectorimpl, Object obj, Object obj1)
        {
            this$0 = Initializer.this;
            super();
            injector = injectorimpl;
            instance = $Preconditions.checkNotNull(obj, "instance");
            source = $Preconditions.checkNotNull(obj1, "source");
        }
    }


    private final Thread creatingThread = Thread.currentThread();
    private final Map pendingInjection = $Maps.newIdentityHashMap();
    private final CountDownLatch ready = new CountDownLatch(1);

    Initializer()
    {
    }

    void injectAll(Errors errors)
    {
        for (Iterator iterator = $Lists.newArrayList(pendingInjection.values()).iterator(); iterator.hasNext();)
        {
            InjectableReference injectablereference = (InjectableReference)iterator.next();
            try
            {
                injectablereference.get(errors);
            }
            catch (ErrorsException errorsexception)
            {
                errors.merge(errorsexception.getErrors());
            }
        }

        if (!pendingInjection.isEmpty())
        {
            throw new AssertionError((new StringBuilder()).append("Failed to satisfy ").append(pendingInjection).toString());
        } else
        {
            ready.countDown();
            return;
        }
    }

    Initializable requestInjection(InjectorImpl injectorimpl, Object obj, Object obj1, Set set)
    {
        $Preconditions.checkNotNull(obj1);
        if (obj == null || set.isEmpty() && !injectorimpl.membersInjectorStore.hasTypeListeners())
        {
            return Initializables.of(obj);
        } else
        {
            injectorimpl = new InjectableReference(injectorimpl, obj, obj1);
            pendingInjection.put(obj, injectorimpl);
            return injectorimpl;
        }
    }

    void validateOustandingInjections(Errors errors)
    {
        for (Iterator iterator = pendingInjection.values().iterator(); iterator.hasNext();)
        {
            InjectableReference injectablereference = (InjectableReference)iterator.next();
            try
            {
                injectablereference.validate(errors);
            }
            catch (ErrorsException errorsexception)
            {
                errors.merge(errorsexception.getErrors());
            }
        }

    }



}
