// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.provider;

import android.accounts.Account;

public interface IdentityProvider
{

    public abstract Account getAccount();

    public abstract String getAuthenticationIntentURI();
}
