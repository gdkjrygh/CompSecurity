// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.common.base.Preconditions;

public class UserSettingsEvent
{

    private final com.google.wallet.proto.NanoWalletError.CallError callError;
    private final com.google.wallet.proto.api.NanoWalletSettings.Settings settings;
    private final Throwable throwable;

    public UserSettingsEvent(com.google.wallet.proto.NanoWalletError.CallError callerror)
    {
        Preconditions.checkNotNull(callerror);
        settings = null;
        callError = callerror;
        throwable = null;
    }

    public UserSettingsEvent(com.google.wallet.proto.api.NanoWalletSettings.Settings settings1)
    {
        Preconditions.checkNotNull(settings1.enableNotifications);
        Preconditions.checkNotNull(settings1.marketingEmail);
        settings = settings1;
        callError = null;
        throwable = null;
    }

    public UserSettingsEvent(Throwable throwable1)
    {
        Preconditions.checkNotNull(throwable1);
        settings = null;
        callError = null;
        throwable = throwable1;
    }

    public final com.google.wallet.proto.NanoWalletError.CallError getError()
    {
        return callError;
    }

    public final com.google.wallet.proto.api.NanoWalletSettings.Settings getSettings()
    {
        return settings;
    }

    public final Throwable getThrowable()
    {
        return throwable;
    }
}
