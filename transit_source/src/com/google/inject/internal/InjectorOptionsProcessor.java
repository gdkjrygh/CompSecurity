// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Stage;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.spi.DisableCircularProxiesOption;
import com.google.inject.spi.RequireExplicitBindingsOption;

// Referenced classes of package com.google.inject.internal:
//            AbstractProcessor, Errors

class InjectorOptionsProcessor extends AbstractProcessor
{

    private boolean disableCircularProxies;
    private boolean jitDisabled;

    InjectorOptionsProcessor(Errors errors)
    {
        super(errors);
        disableCircularProxies = false;
        jitDisabled = false;
    }

    InjectorImpl.InjectorOptions getOptions(Stage stage, InjectorImpl.InjectorOptions injectoroptions)
    {
        boolean flag1 = false;
        $Preconditions.checkNotNull(stage, "stage must be set");
        if (injectoroptions == null)
        {
            return new InjectorImpl.InjectorOptions(stage, jitDisabled, disableCircularProxies);
        }
        boolean flag;
        if (stage == injectoroptions.stage)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "child & parent stage don't match");
        if (jitDisabled || injectoroptions.jitDisabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (disableCircularProxies || injectoroptions.disableCircularProxies)
        {
            flag1 = true;
        }
        return new InjectorImpl.InjectorOptions(stage, flag, flag1);
    }

    public Boolean visit(DisableCircularProxiesOption disablecircularproxiesoption)
    {
        disableCircularProxies = true;
        return Boolean.valueOf(true);
    }

    public Boolean visit(RequireExplicitBindingsOption requireexplicitbindingsoption)
    {
        jitDisabled = true;
        return Boolean.valueOf(true);
    }

    public volatile Object visit(DisableCircularProxiesOption disablecircularproxiesoption)
    {
        return visit(disablecircularproxiesoption);
    }

    public volatile Object visit(RequireExplicitBindingsOption requireexplicitbindingsoption)
    {
        return visit(requireexplicitbindingsoption);
    }
}
