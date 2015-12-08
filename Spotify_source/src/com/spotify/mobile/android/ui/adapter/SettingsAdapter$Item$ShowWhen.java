// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;


public final class I extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item$ShowWhen, s);
    }

    public static I[] values()
    {
        return (I[])h.clone();
    }

    static 
    {
        a = new <init>("EVER", 0);
        b = new <init>("DEBUG_MENU_ENABLED", 1);
        c = new <init>("CONNECT_ICON_ENABLED", 2);
        d = new <init>("AUDIO_EFFECTS_CONTROL_AVAILABLE", 3);
        e = new <init>("HIGH_BITRATE_OFFLINE_ENABLED", 4);
        f = new <init>("OFFLINE_ENABLED", 5);
        g = new <init>("NIELSEN_OCR_ENABLED", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
