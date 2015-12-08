// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;


// Referenced classes of package com.snapchat.android.discover.ui:
//            DiscoverLoadingStatePresenter

public static final class Q extends Enum
{

    private static final GENERIC_ERROR $VALUES[];
    public static final GENERIC_ERROR EXTERNAL_STORAGE_UNAVAILABLE;
    public static final GENERIC_ERROR GENERIC_ERROR;
    public static final GENERIC_ERROR LOADED;
    public static final GENERIC_ERROR LOADING;
    public static final GENERIC_ERROR NETWORK_ERROR;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/snapchat/android/discover/ui/DiscoverLoadingStatePresenter$LoadingState, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    static 
    {
        LOADING = new <init>("LOADING", 0);
        LOADED = new <init>("LOADED", 1);
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 2);
        EXTERNAL_STORAGE_UNAVAILABLE = new <init>("EXTERNAL_STORAGE_UNAVAILABLE", 3);
        GENERIC_ERROR = new <init>("GENERIC_ERROR", 4);
        $VALUES = (new .VALUES[] {
            LOADING, LOADED, NETWORK_ERROR, EXTERNAL_STORAGE_UNAVAILABLE, GENERIC_ERROR
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
