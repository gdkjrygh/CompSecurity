// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binding;

// Referenced classes of package com.google.inject.spi:
//            BindingTargetVisitor, ConstructorBinding, ConvertedConstantBinding, ExposedBinding, 
//            InstanceBinding, LinkedKeyBinding, ProviderBinding, ProviderInstanceBinding, 
//            ProviderKeyBinding, UntargettedBinding

public abstract class DefaultBindingTargetVisitor
    implements BindingTargetVisitor
{

    public DefaultBindingTargetVisitor()
    {
    }

    public Object visit(ConstructorBinding constructorbinding)
    {
        return visitOther(constructorbinding);
    }

    public Object visit(ConvertedConstantBinding convertedconstantbinding)
    {
        return visitOther(convertedconstantbinding);
    }

    public Object visit(ExposedBinding exposedbinding)
    {
        return visitOther(exposedbinding);
    }

    public Object visit(InstanceBinding instancebinding)
    {
        return visitOther(instancebinding);
    }

    public Object visit(LinkedKeyBinding linkedkeybinding)
    {
        return visitOther(linkedkeybinding);
    }

    public Object visit(ProviderBinding providerbinding)
    {
        return visitOther(providerbinding);
    }

    public Object visit(ProviderInstanceBinding providerinstancebinding)
    {
        return visitOther(providerinstancebinding);
    }

    public Object visit(ProviderKeyBinding providerkeybinding)
    {
        return visitOther(providerkeybinding);
    }

    public Object visit(UntargettedBinding untargettedbinding)
    {
        return visitOther(untargettedbinding);
    }

    protected Object visitOther(Binding binding)
    {
        return null;
    }
}
