// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.client;


public final class mValue extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    private static e e;
    private static final e f[];
    String mValue;

    public static mValue valueOf(String s)
    {
        return (mValue)Enum.valueOf(com/spotify/mobile/android/spotlets/share/client/ShareViewClient$Path, s);
    }

    public static mValue[] values()
    {
        return (mValue[])f.clone();
    }

    static 
    {
        a = new <init>("AUTHORIZE", 0, "network/%s/authorize?callback=%s");
        b = new <init>("BROADCAST", 1, "broadcast");
        c = new <init>("CONNECT", 2, "network/%s");
        d = new <init>("INFO", 3, "info?decorate=false&uri=%s");
        e = new <init>("MESSAGE", 4, "message");
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mValue = s1;
    }
}
