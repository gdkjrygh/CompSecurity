// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.datasource;


public final class CosmosError
{

    private Throwable a;

    public CosmosError(Throwable throwable)
    {
        a = throwable;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).toString();
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/common/datasource/CosmosError$1

/* anonymous class */
    final class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause.values().length];
            try
            {
                a[com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause.RESOLVING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause.PARSING.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause.UNKNOWN.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
