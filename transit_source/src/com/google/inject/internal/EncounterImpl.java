// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$ImmutableList;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.spi.InjectionListener;
import com.google.inject.spi.Message;
import com.google.inject.spi.TypeEncounter;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            Errors, Lookups

final class EncounterImpl
    implements TypeEncounter
{

    private final Errors errors;
    private List injectionListeners;
    private final Lookups lookups;
    private List membersInjectors;
    private boolean valid;

    EncounterImpl(Errors errors1, Lookups lookups1)
    {
        valid = true;
        errors = errors1;
        lookups = lookups1;
    }

    public void addError(Message message)
    {
        $Preconditions.checkState(valid, "Encounters may not be used after hear() returns.");
        errors.addMessage(message);
    }

    public transient void addError(String s, Object aobj[])
    {
        $Preconditions.checkState(valid, "Encounters may not be used after hear() returns.");
        errors.addMessage(s, aobj);
    }

    public void addError(Throwable throwable)
    {
        $Preconditions.checkState(valid, "Encounters may not be used after hear() returns.");
        errors.errorInUserCode(throwable, "An exception was caught and reported. Message: %s", new Object[] {
            throwable.getMessage()
        });
    }

    $ImmutableList getInjectionListeners()
    {
        if (injectionListeners == null)
        {
            return $ImmutableList.of();
        } else
        {
            return $ImmutableList.copyOf(injectionListeners);
        }
    }

    public MembersInjector getMembersInjector(TypeLiteral typeliteral)
    {
        $Preconditions.checkState(valid, "Encounters may not be used after hear() returns.");
        return lookups.getMembersInjector(typeliteral);
    }

    public MembersInjector getMembersInjector(Class class1)
    {
        return getMembersInjector(TypeLiteral.get(class1));
    }

    $ImmutableList getMembersInjectors()
    {
        if (membersInjectors == null)
        {
            return $ImmutableList.of();
        } else
        {
            return $ImmutableList.copyOf(membersInjectors);
        }
    }

    public Provider getProvider(Key key)
    {
        $Preconditions.checkState(valid, "Encounters may not be used after hear() returns.");
        return lookups.getProvider(key);
    }

    public Provider getProvider(Class class1)
    {
        return getProvider(Key.get(class1));
    }

    void invalidate()
    {
        valid = false;
    }

    public void register(MembersInjector membersinjector)
    {
        $Preconditions.checkState(valid, "Encounters may not be used after hear() returns.");
        if (membersInjectors == null)
        {
            membersInjectors = $Lists.newArrayList();
        }
        membersInjectors.add(membersinjector);
    }

    public void register(InjectionListener injectionlistener)
    {
        $Preconditions.checkState(valid, "Encounters may not be used after hear() returns.");
        if (injectionListeners == null)
        {
            injectionListeners = $Lists.newArrayList();
        }
        injectionListeners.add(injectionlistener);
    }
}
