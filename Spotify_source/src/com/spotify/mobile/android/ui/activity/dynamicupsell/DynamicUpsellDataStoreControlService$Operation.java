// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dynamicupsell;


public final class i extends Enum
{

    public static final a a;
    private static final a b[];

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellDataStoreControlService$Operation, s);
    }

    public static i[] values()
    {
        return (i[])b.clone();
    }

    static 
    {
        a = new <init>("REFRESH");
        b = (new b[] {
            a
        });
    }

    private i(String s)
    {
        super(s, 0);
    }
}
