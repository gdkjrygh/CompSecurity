// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;


// Referenced classes of package com.snapchat.android.discover.ui:
//            DiscoverLoadingStatePresenter

static final class adingState
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.snapchat.android.discover.util.network.ility.values().length];
        try
        {
            b[com.snapchat.android.discover.util.network.ility.REGION_NOT_SUPPORTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[com.snapchat.android.discover.util.network.ility.DEVICE_NOT_SUPPORTED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[com.snapchat.android.discover.util.network.ility.NOT_SUPPORTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        a = new int[adingState.values().length];
        try
        {
            a[adingState.LOADED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[adingState.LOADING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[adingState.NETWORK_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[adingState.EXTERNAL_STORAGE_UNAVAILABLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[adingState.GENERIC_ERROR.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
