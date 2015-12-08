// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.controller.iface;

import com.kohls.mcommerce.opal.common.util.RegistryObject;

public interface IAddToBagController
{

    public abstract void updateBag(String s, int i, String s1, RegistryObject registryobject, String s2, boolean flag, boolean flag1, 
            String s3, String s4, boolean flag2);
}
