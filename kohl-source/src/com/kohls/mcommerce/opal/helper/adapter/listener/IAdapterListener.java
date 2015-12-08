// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.adapter.listener;

import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.helper.error.Error;

public interface IAdapterListener
{

    public abstract Error getPayloadError(IValueObject ivalueobject);

    public abstract void onFailure(Error error);

    public abstract void onSuccess(IValueObject ivalueobject);
}
