// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.task;


public final class I extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/spotify/mobile/android/spotlets/common/task/TimeoutOrError$What, s);
    }

    public static I[] values()
    {
        return (I[])c.clone();
    }

    static 
    {
        a = new <init>("ERROR", 0);
        b = new <init>("TIMEOUT", 1);
        c = (new c[] {
            a, b
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
