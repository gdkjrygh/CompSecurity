// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Provider;

// Referenced classes of package com.google.inject.spi:
//            BindingTargetVisitor, ProviderInstanceBinding

public interface ProviderWithExtensionVisitor
    extends Provider
{

    public abstract Object acceptExtensionVisitor(BindingTargetVisitor bindingtargetvisitor, ProviderInstanceBinding providerinstancebinding);
}
