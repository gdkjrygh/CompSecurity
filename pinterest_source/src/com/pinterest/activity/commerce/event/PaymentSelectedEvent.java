// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.event;

import com.pinterest.model.commerce.UserCard;

public class PaymentSelectedEvent
{

    private boolean existingSelected;
    private UserCard userCard;

    public PaymentSelectedEvent(UserCard usercard)
    {
        userCard = usercard;
    }

    public PaymentSelectedEvent(UserCard usercard, boolean flag)
    {
        userCard = usercard;
        existingSelected = flag;
    }

    public UserCard getUserCard()
    {
        return userCard;
    }

    public boolean isExistingSelected()
    {
        return existingSelected;
    }
}
