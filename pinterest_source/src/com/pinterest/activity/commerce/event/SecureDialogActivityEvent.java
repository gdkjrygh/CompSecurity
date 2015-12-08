// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.event;


public class SecureDialogActivityEvent
{

    private Type type;

    public SecureDialogActivityEvent(Type type1)
    {
        type = type1;
    }

    public Type getType()
    {
        return type;
    }
}
