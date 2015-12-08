// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;


final class I extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/spotify/mobile/android/service/media/MediaServiceConsumer$State, s);
    }

    public static I[] values()
    {
        return (I[])e.clone();
    }

    static 
    {
        a = new <init>("INIT", 0);
        b = new <init>("WAITING_FOR_MEDIA_SERVICE", 1);
        c = new <init>("ACTIVE", 2);
        d = new <init>("STOPPED", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
