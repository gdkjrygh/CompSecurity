// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Lists;
import com.google.inject.spi.PrivateElements;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            AbstractProcessor, Errors

final class PrivateElementProcessor extends AbstractProcessor
{

    private final List injectorShellBuilders = $Lists.newArrayList();

    PrivateElementProcessor(Errors errors)
    {
        super(errors);
    }

    public List getInjectorShellBuilders()
    {
        return injectorShellBuilders;
    }

    public Boolean visit(PrivateElements privateelements)
    {
        privateelements = (new InjectorShell.Builder()).parent(injector).privateElements(privateelements);
        injectorShellBuilders.add(privateelements);
        return Boolean.valueOf(true);
    }

    public volatile Object visit(PrivateElements privateelements)
    {
        return visit(privateelements);
    }
}
