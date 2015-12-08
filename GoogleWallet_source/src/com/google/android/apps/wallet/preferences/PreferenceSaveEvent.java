// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.preferences;


public final class PreferenceSaveEvent
{

    private final Exception exception;

    public final Exception getException()
    {
        return exception;
    }

    public final boolean isSuccessful()
    {
        return exception == null;
    }
}
