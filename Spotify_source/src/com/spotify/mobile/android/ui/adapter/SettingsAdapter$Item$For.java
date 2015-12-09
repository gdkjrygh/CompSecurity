// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;


public final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static c d;
    private static final c e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item$For, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("REGISTERED_USER", 0);
        d = new <init>("ANONYMOUS_USER", 1);
        b = new <init>("ANY_USER", 2);
        c = new <init>("ARSENAL_USER", 3);
        e = (new e[] {
            a, d, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
