// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.listener;

import com.kohls.mcommerce.opal.helper.error.Error;

public interface CartListener
{

    public abstract void onCartFailure(Error error);

    public abstract void onCartSuccessful();

    public abstract void onOCBDisabled();
}
