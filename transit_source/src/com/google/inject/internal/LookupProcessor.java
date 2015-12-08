// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.MembersInjectorLookup;
import com.google.inject.spi.ProviderLookup;

// Referenced classes of package com.google.inject.internal:
//            AbstractProcessor, ErrorsException, InjectorImpl, MembersInjectorStore, 
//            Errors

final class LookupProcessor extends AbstractProcessor
{

    LookupProcessor(Errors errors)
    {
        super(errors);
    }

    public Boolean visit(MembersInjectorLookup membersinjectorlookup)
    {
        try
        {
            membersinjectorlookup.initializeDelegate(injector.membersInjectorStore.get(membersinjectorlookup.getType(), errors));
        }
        // Misplaced declaration of an exception variable
        catch (MembersInjectorLookup membersinjectorlookup)
        {
            errors.merge(membersinjectorlookup.getErrors());
        }
        return Boolean.valueOf(true);
    }

    public Boolean visit(ProviderLookup providerlookup)
    {
        try
        {
            providerlookup.initializeDelegate(injector.getProviderOrThrow(providerlookup.getKey(), errors));
        }
        // Misplaced declaration of an exception variable
        catch (ProviderLookup providerlookup)
        {
            errors.merge(providerlookup.getErrors());
        }
        return Boolean.valueOf(true);
    }

    public volatile Object visit(MembersInjectorLookup membersinjectorlookup)
    {
        return visit(membersinjectorlookup);
    }

    public volatile Object visit(ProviderLookup providerlookup)
    {
        return visit(providerlookup);
    }
}
