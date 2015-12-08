// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.ConfigurationException;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$ImmutableList;
import com.google.inject.internal.util.$Lists;
import com.google.inject.matcher.Matcher;
import com.google.inject.spi.InjectionPoint;
import com.google.inject.spi.TypeListener;
import com.google.inject.spi.TypeListenerBinding;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            ErrorsException, Errors, EncounterImpl, InjectorImpl, 
//            MembersInjectorImpl, FailableCache, SingleFieldInjector, SingleMethodInjector

final class MembersInjectorStore
{

    private final FailableCache cache = new FailableCache() {

        final MembersInjectorStore this$0;

        protected MembersInjectorImpl create(TypeLiteral typeliteral, Errors errors)
            throws ErrorsException
        {
            return createWithListeners(typeliteral, errors);
        }

        protected volatile Object create(Object obj, Errors errors)
            throws ErrorsException
        {
            return create((TypeLiteral)obj, errors);
        }

            
            {
                this$0 = MembersInjectorStore.this;
                super();
            }
    };
    private final InjectorImpl injector;
    private final $ImmutableList typeListenerBindings;

    MembersInjectorStore(InjectorImpl injectorimpl, List list)
    {
        injector = injectorimpl;
        typeListenerBindings = $ImmutableList.copyOf(list);
    }

    private MembersInjectorImpl createWithListeners(TypeLiteral typeliteral, Errors errors)
        throws ErrorsException
    {
        int i = errors.size();
        Object obj;
        EncounterImpl encounterimpl;
        Iterator iterator;
        try
        {
            obj = InjectionPoint.forInstanceMethodsAndFields(typeliteral);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            errors.merge(((ConfigurationException) (obj)).getErrorMessages());
            obj = (Set)((ConfigurationException) (obj)).getPartialValue();
        }
        obj = getInjectors(((Set) (obj)), errors);
        errors.throwIfNewErrors(i);
        encounterimpl = new EncounterImpl(errors, injector.lookups);
        iterator = typeListenerBindings.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TypeListenerBinding typelistenerbinding = (TypeListenerBinding)iterator.next();
            if (typelistenerbinding.getTypeMatcher().matches(typeliteral))
            {
                try
                {
                    typelistenerbinding.getListener().hear(typeliteral, encounterimpl);
                }
                catch (RuntimeException runtimeexception)
                {
                    errors.errorNotifyingTypeListener(typelistenerbinding, typeliteral, runtimeexception);
                }
            }
        } while (true);
        encounterimpl.invalidate();
        errors.throwIfNewErrors(i);
        return new MembersInjectorImpl(injector, typeliteral, encounterimpl, (($ImmutableList) (obj)));
    }

    public MembersInjectorImpl get(TypeLiteral typeliteral, Errors errors)
        throws ErrorsException
    {
        return (MembersInjectorImpl)cache.get(typeliteral, errors);
    }

    $ImmutableList getInjectors(Set set, Errors errors)
    {
        java.util.ArrayList arraylist;
        Iterator iterator;
        arraylist = $Lists.newArrayList();
        iterator = set.iterator();
_L11:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        InjectionPoint injectionpoint = (InjectionPoint)iterator.next();
        if (!injectionpoint.isOptional()) goto _L4; else goto _L3
_L3:
        set = new Errors(injectionpoint);
_L9:
        if (!(injectionpoint.getMember() instanceof Field)) goto _L6; else goto _L5
_L5:
        set = new SingleFieldInjector(injector, injectionpoint, set);
_L7:
        arraylist.add(set);
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            set = errors.withSource(injectionpoint);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Set set) { }
        continue; /* Loop/switch isn't completed */
_L6:
        set = new SingleMethodInjector(injector, injectionpoint, set);
        if (true) goto _L7; else goto _L2
_L2:
        return $ImmutableList.copyOf(arraylist);
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }

    public boolean hasTypeListeners()
    {
        return !typeListenerBindings.isEmpty();
    }

    boolean remove(TypeLiteral typeliteral)
    {
        return cache.remove(typeliteral);
    }

}
