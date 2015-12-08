// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.datasource;


// Referenced classes of package com.spotify.mobile.android.spotlets.common.datasource:
//            CosmosError

final class 
{

    static final int a[];

    static 
    {
        a = new int[com.spotify.mobile.android.cosmos.kReceiver.ErrorCause.values().length];
        try
        {
            a[com.spotify.mobile.android.cosmos.kReceiver.ErrorCause.RESOLVING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.spotify.mobile.android.cosmos.kReceiver.ErrorCause.PARSING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.spotify.mobile.android.cosmos.kReceiver.ErrorCause.UNKNOWN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
