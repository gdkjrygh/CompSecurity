// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import com.dominos.android.sdk.common.BaseCallback;

public abstract class pe extends BaseCallback
{

    public abstract void onCreditCardSaved(String s);

    public abstract void onCreditCardSavingError(pe pe);

    public abstract void onUserNotAuthorized();

    public pe()
    {
    }
}
