// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event;

import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.spi.InjectionListener;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import roboguice.event.eventListener.ObserverMethodListener;
import roboguice.event.eventListener.factory.EventListenerThreadingDecorator;

// Referenced classes of package roboguice.event:
//            Observes, EventThread, EventManager

public class ObservesTypeListener
    implements TypeListener
{
    public static class ContextObserverMethodInjector
        implements InjectionListener
    {

        protected Class event;
        protected Provider eventManagerProvider;
        protected Method method;
        protected EventListenerThreadingDecorator observerThreadingDecorator;
        protected EventThread threadType;

        public void afterInjection(Object obj)
        {
            ((EventManager)eventManagerProvider.get()).registerObserver(event, observerThreadingDecorator.decorate(threadType, new ObserverMethodListener(obj, method)));
        }

        public ContextObserverMethodInjector(Provider provider, EventListenerThreadingDecorator eventlistenerthreadingdecorator, Method method1, Class class1, EventThread eventthread)
        {
            observerThreadingDecorator = eventlistenerthreadingdecorator;
            eventManagerProvider = provider;
            method = method1;
            event = class1;
            threadType = eventthread;
        }
    }


    protected Provider eventManagerProvider;
    protected EventListenerThreadingDecorator observerThreadingDecorator;

    public ObservesTypeListener(Provider provider, EventListenerThreadingDecorator eventlistenerthreadingdecorator)
    {
        eventManagerProvider = provider;
        observerThreadingDecorator = eventlistenerthreadingdecorator;
    }

    protected void checkMethodParameters(Method method)
    {
        if (method.getParameterTypes().length > 1)
        {
            throw new RuntimeException("Annotation @Observes must only annotate one parameter, which must be the only parameter in the listener method.");
        } else
        {
            return;
        }
    }

    protected void findContextObserver(Method method, TypeEncounter typeencounter)
    {
        Annotation aannotation[][] = method.getParameterAnnotations();
        for (int i = 0; i < aannotation.length; i++)
        {
            Annotation aannotation1[] = aannotation[i];
            Class class1 = method.getParameterTypes()[i];
            int k = aannotation1.length;
            for (int j = 0; j < k; j++)
            {
                Annotation annotation = aannotation1[j];
                if (annotation.annotationType().equals(roboguice/event/Observes))
                {
                    registerContextObserver(typeencounter, method, class1, ((Observes)annotation).value());
                }
            }

        }

    }

    public void hear(TypeLiteral typeliteral, TypeEncounter typeencounter)
    {
        for (typeliteral = typeliteral.getRawType(); typeliteral != java/lang/Object; typeliteral = typeliteral.getSuperclass())
        {
            Object aobj[] = typeliteral.getDeclaredMethods();
            int k = aobj.length;
            for (int i = 0; i < k; i++)
            {
                findContextObserver(aobj[i], typeencounter);
            }

            aobj = typeliteral.getInterfaces();
            int i1 = aobj.length;
            for (int j = 0; j < i1; j++)
            {
                Method amethod[] = aobj[j].getDeclaredMethods();
                int j1 = amethod.length;
                for (int l = 0; l < j1; l++)
                {
                    findContextObserver(amethod[l], typeencounter);
                }

            }

        }

    }

    protected void registerContextObserver(TypeEncounter typeencounter, Method method, Class class1, EventThread eventthread)
    {
        checkMethodParameters(method);
        typeencounter.register(new ContextObserverMethodInjector(eventManagerProvider, observerThreadingDecorator, method, class1, eventthread));
    }
}
