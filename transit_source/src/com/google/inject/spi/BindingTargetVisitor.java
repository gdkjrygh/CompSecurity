// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;


// Referenced classes of package com.google.inject.spi:
//            ConstructorBinding, ConvertedConstantBinding, ExposedBinding, InstanceBinding, 
//            LinkedKeyBinding, ProviderBinding, ProviderInstanceBinding, ProviderKeyBinding, 
//            UntargettedBinding

public interface BindingTargetVisitor
{

    public abstract Object visit(ConstructorBinding constructorbinding);

    public abstract Object visit(ConvertedConstantBinding convertedconstantbinding);

    public abstract Object visit(ExposedBinding exposedbinding);

    public abstract Object visit(InstanceBinding instancebinding);

    public abstract Object visit(LinkedKeyBinding linkedkeybinding);

    public abstract Object visit(ProviderBinding providerbinding);

    public abstract Object visit(ProviderInstanceBinding providerinstancebinding);

    public abstract Object visit(ProviderKeyBinding providerkeybinding);

    public abstract Object visit(UntargettedBinding untargettedbinding);
}
