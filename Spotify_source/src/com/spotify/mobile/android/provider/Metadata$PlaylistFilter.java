// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.provider;


public final class A extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/spotify/mobile/android/provider/Metadata$PlaylistFilter, s);
    }

    public static A[] values()
    {
        return (A[])f.clone();
    }

    static 
    {
        a = new <init>("ALL", 0);
        b = new <init>("OFFLINE_ONLY", 1);
        c = new <init>("WRITABLE_ONLY", 2);
        d = new <init>("NOT_OFFLINE_ONLY", 3);
        e = new <init>("RECENTLY_CHANGED_AND_WRITABLE_ONLY", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
