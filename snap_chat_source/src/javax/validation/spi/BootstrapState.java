// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.spi;

import javax.validation.ValidationProviderResolver;

public interface BootstrapState
{

    public abstract ValidationProviderResolver getDefaultValidationProviderResolver();

    public abstract ValidationProviderResolver getValidationProviderResolver();
}
