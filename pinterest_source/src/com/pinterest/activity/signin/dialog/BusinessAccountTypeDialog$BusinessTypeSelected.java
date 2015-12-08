// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.api.model.BusinessType;

public class name
{

    public String key;
    public String name;

    public Y(BusinessType businesstype)
    {
        key = businesstype.getKey();
        name = businesstype.getName();
    }
}
