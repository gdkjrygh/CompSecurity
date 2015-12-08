// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface;

import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO;

public interface ICreateOrUpdateRegistryController
{

    public abstract void createRegistry(RegistryPO registrypo);

    public abstract void updateRegistry(RegistryPO registrypo, long l);
}
