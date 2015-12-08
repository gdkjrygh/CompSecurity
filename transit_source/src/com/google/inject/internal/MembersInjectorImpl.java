// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.MembersInjector;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$ImmutableList;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.spi.InjectionListener;
import com.google.inject.spi.InjectionPoint;
import java.util.Iterator;

// Referenced classes of package com.google.inject.internal:
//            EncounterImpl, SingleMemberInjector, ErrorsException, InjectorImpl, 
//            Errors, InternalContext, ContextualCallable

final class MembersInjectorImpl
    implements MembersInjector
{

    private final $ImmutableList injectionListeners;
    private final InjectorImpl injector;
    private final $ImmutableList memberInjectors;
    private final TypeLiteral typeLiteral;
    private final $ImmutableList userMembersInjectors;

    MembersInjectorImpl(InjectorImpl injectorimpl, TypeLiteral typeliteral, EncounterImpl encounterimpl, $ImmutableList $immutablelist)
    {
        injector = injectorimpl;
        typeLiteral = typeliteral;
        memberInjectors = $immutablelist;
        userMembersInjectors = encounterimpl.getMembersInjectors();
        injectionListeners = encounterimpl.getInjectionListeners();
    }

    public $ImmutableSet getInjectionPoints()
    {
        com.google.inject.internal.util..ImmutableSet.Builder builder = $ImmutableSet.builder();
        for (Iterator iterator = memberInjectors.iterator(); iterator.hasNext(); builder.add(((SingleMemberInjector)iterator.next()).getInjectionPoint())) { }
        return builder.build();
    }

    public $ImmutableList getMemberInjectors()
    {
        return memberInjectors;
    }

    void injectAndNotify(final Object instance, final Errors errors, final boolean toolableOnly)
        throws ErrorsException
    {
        if (instance != null)
        {
            injector.callInContext(new ContextualCallable() {

                final MembersInjectorImpl this$0;
                final Errors val$errors;
                final Object val$instance;
                final boolean val$toolableOnly;

                public volatile Object call(InternalContext internalcontext)
                    throws ErrorsException
                {
                    return call(internalcontext);
                }

                public Void call(InternalContext internalcontext)
                    throws ErrorsException
                {
                    injectMembers(instance, errors, internalcontext, toolableOnly);
                    return null;
                }

            
            {
                this$0 = MembersInjectorImpl.this;
                instance = obj;
                errors = errors1;
                toolableOnly = flag;
                super();
            }
            });
            if (!toolableOnly)
            {
                notifyListeners(instance, errors);
                return;
            }
        }
    }

    public void injectMembers(Object obj)
    {
        Errors errors = new Errors(typeLiteral);
        try
        {
            injectAndNotify(obj, errors, false);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            errors.merge(((ErrorsException) (obj)).getErrors());
        }
        errors.throwProvisionExceptionIfErrorsExist();
    }

    void injectMembers(Object obj, Errors errors, InternalContext internalcontext, boolean flag)
    {
        int i = 0;
        for (int k = memberInjectors.size(); i < k; i++)
        {
            SingleMemberInjector singlememberinjector = (SingleMemberInjector)memberInjectors.get(i);
            if (!flag || singlememberinjector.getInjectionPoint().isToolable())
            {
                singlememberinjector.inject(errors, internalcontext, obj);
            }
        }

        if (!flag)
        {
            int j = 0;
            int l = userMembersInjectors.size();
            while (j < l) 
            {
                internalcontext = (MembersInjector)userMembersInjectors.get(j);
                try
                {
                    internalcontext.injectMembers(obj);
                }
                catch (RuntimeException runtimeexception)
                {
                    errors.errorInUserInjector(internalcontext, typeLiteral, runtimeexception);
                }
                j++;
            }
        }
    }

    void notifyListeners(Object obj, Errors errors)
        throws ErrorsException
    {
        int i = errors.size();
        for (Iterator iterator = injectionListeners.iterator(); iterator.hasNext();)
        {
            InjectionListener injectionlistener = (InjectionListener)iterator.next();
            try
            {
                injectionlistener.afterInjection(obj);
            }
            catch (RuntimeException runtimeexception)
            {
                errors.errorNotifyingInjectionListener(injectionlistener, typeLiteral, runtimeexception);
            }
        }

        errors.throwIfNewErrors(i);
    }

    public String toString()
    {
        return (new StringBuilder()).append("MembersInjector<").append(typeLiteral).append(">").toString();
    }
}
