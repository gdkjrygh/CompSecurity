// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Stage;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Preconditions;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.inject.internal:
//            Initializable, Initializer, ErrorsException, Errors, 
//            InjectorImpl, MembersInjectorImpl, MembersInjectorStore

private class 
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
        if (Initializer.access$000(Initializer.this).getCount() == 0L)
        {
            return instance;
        }
        if (Thread.currentThread() != Initializer.access$100(Initializer.this))
        {
            try
            {
                Initializer.access$000(Initializer.this).await();
                errors = ((Errors) (instance));
            }
            // Misplaced declaration of an exception variable
            catch (Errors errors)
            {
                throw new RuntimeException(errors);
            }
            return errors;
        }
        if (Initializer.access$200(Initializer.this).remove(instance) != null)
        {
            MembersInjectorImpl membersinjectorimpl = membersInjector;
            Object obj = instance;
            errors = errors.withSource(source);
            boolean flag;
            if (injector.options.ge == Stage.TOOL)
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

    public (InjectorImpl injectorimpl, Object obj, Object obj1)
    {
        this$0 = Initializer.this;
        super();
        injector = injectorimpl;
        instance = $Preconditions.checkNotNull(obj, "instance");
        source = $Preconditions.checkNotNull(obj1, "source");
    }
}
