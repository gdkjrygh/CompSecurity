// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.provider;


public final class I extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/spotify/mobile/android/provider/Metadata$OfflineSync$WaitReason, s);
    }

    public static I[] values()
    {
        return (I[])f.clone();
    }

    static 
    {
        a = new <init>("UNKNOWN", 0);
        b = new <init>("WAITING", 1);
        c = new <init>("NO_INTERNET", 2);
        d = new <init>("IN_OFFLINE_MODE", 3);
        e = new <init>("SYNC_NOT_ALLOWED", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
