// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.userscope;


public class CurrentUserModule
{

    private final String accountName;

    public CurrentUserModule(String s)
    {
        accountName = s;
    }

    final String getUserId()
    {
        return accountName;
    }
}
