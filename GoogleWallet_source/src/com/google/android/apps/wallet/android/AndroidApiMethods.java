// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.android;


public final class AndroidApiMethods extends Enum
{

    private static final AndroidApiMethods $VALUES[];
    public static final AndroidApiMethods VIEW_ANNOUNCE_FOR_ACCESSIBILITY;
    public static final AndroidApiMethods VIEW_SET_BACKGROUND;
    private final int mApiVersion;

    private AndroidApiMethods(String s, int i, int j)
    {
        super(s, i);
        mApiVersion = j;
    }

    public static AndroidApiMethods valueOf(String s)
    {
        return (AndroidApiMethods)Enum.valueOf(com/google/android/apps/wallet/android/AndroidApiMethods, s);
    }

    public static AndroidApiMethods[] values()
    {
        return (AndroidApiMethods[])$VALUES.clone();
    }

    public final boolean isAvailable()
    {
        return android.os.Build.VERSION.SDK_INT >= mApiVersion;
    }

    static 
    {
        VIEW_ANNOUNCE_FOR_ACCESSIBILITY = new AndroidApiMethods("VIEW_ANNOUNCE_FOR_ACCESSIBILITY", 0, 16);
        VIEW_SET_BACKGROUND = new AndroidApiMethods("VIEW_SET_BACKGROUND", 1, 16);
        $VALUES = (new AndroidApiMethods[] {
            VIEW_ANNOUNCE_FOR_ACCESSIBILITY, VIEW_SET_BACKGROUND
        });
    }
}
