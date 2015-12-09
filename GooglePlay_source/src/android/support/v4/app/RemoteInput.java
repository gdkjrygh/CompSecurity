// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

public final class RemoteInput extends RemoteInputCompatBase.RemoteInput
{
    static interface Impl
    {
    }

    static final class ImplApi20
        implements Impl
    {

        ImplApi20()
        {
        }
    }

    static final class ImplBase
        implements Impl
    {

        ImplBase()
        {
        }
    }

    static final class ImplJellybean
        implements Impl
    {

        ImplJellybean()
        {
        }
    }


    public static final RemoteInputCompatBase.RemoteInput.Factory FACTORY = new RemoteInputCompatBase.RemoteInput.Factory() {

    };
    private static final Impl IMPL;
    private final boolean mAllowFreeFormInput;
    private final CharSequence mChoices[];
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    public final boolean getAllowFreeFormInput()
    {
        return mAllowFreeFormInput;
    }

    public final CharSequence[] getChoices()
    {
        return mChoices;
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }

    public final CharSequence getLabel()
    {
        return mLabel;
    }

    public final String getResultKey()
    {
        return mResultKey;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            IMPL = new ImplApi20();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new ImplJellybean();
        } else
        {
            IMPL = new ImplBase();
        }
    }
}
