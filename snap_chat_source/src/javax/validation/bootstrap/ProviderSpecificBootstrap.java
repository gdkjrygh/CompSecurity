// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.bootstrap;

import javax.validation.Configuration;
import javax.validation.ValidationProviderResolver;

public interface ProviderSpecificBootstrap
{

    public abstract Configuration configure();

    public abstract ProviderSpecificBootstrap providerResolver(ValidationProviderResolver validationproviderresolver);
}
