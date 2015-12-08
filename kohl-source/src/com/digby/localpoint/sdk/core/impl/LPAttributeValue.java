// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.profile.ILPAttributeValue;

public class LPAttributeValue
    implements ILPAttributeValue
{

    private Object value;

    public LPAttributeValue(Object obj)
    {
        value = obj;
    }

    public Object getValue()
    {
        return value;
    }
}
