// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.service;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class AccountSessionStore
{

    private static AccountSessionStore singleton = new AccountSessionStore();
    public final boolean mIsLogVerbose = Log.isLoggable("AccountSessionStore", 2);
    public final Map mResolvedAccountMap = Collections.synchronizedMap(new HashMap());

    AccountSessionStore()
    {
    }

    public static AccountSessionStore getInstance()
    {
        return singleton;
    }

}
