// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binding;
import com.google.inject.Provider;
import java.util.Set;

// Referenced classes of package com.google.inject.spi:
//            HasDependencies

public interface ProviderInstanceBinding
    extends Binding, HasDependencies
{

    public abstract Set getInjectionPoints();

    public abstract Provider getProviderInstance();
}
