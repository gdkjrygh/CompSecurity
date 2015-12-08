// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.esn;

import com.netflix.mediaclient.repository.SecurityRepository;

public interface EsnProvider
{

    public static final int CRYPTO_FACTORY_TYPE_CDM_WIDEVINE = 2;
    public static final int CRYPTO_FACTORY_TYPE_LEGACY = 1;
    public static final String ESN_PREFIX = SecurityRepository.getEsnPrefix();

    public abstract void destroy();

    public abstract int getCryptoFactoryType();

    public abstract String getDeviceId();

    public abstract String getDeviceModel();

    public abstract String getESNPrefix();

    public abstract String getEsn();

    public abstract String getFesn();

    public abstract String getFesnModelId();

    public abstract String getManufacturer();

    public abstract String getModelId();

}
