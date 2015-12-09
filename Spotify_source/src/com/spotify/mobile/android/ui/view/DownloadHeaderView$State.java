// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;


public final class A extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i j[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/spotify/mobile/android/ui/view/DownloadHeaderView$State, s);
    }

    public static A[] values()
    {
        return (A[])j.clone();
    }

    static 
    {
        a = new <init>("INIT", 0);
        b = new <init>("HIDDEN", 1);
        c = new <init>("DOWNLOADABLE", 2);
        d = new <init>("DOWNLOADING", 3);
        e = new <init>("DOWNLOADED", 4);
        f = new <init>("WAITING", 5);
        g = new <init>("NO_INTERNET", 6);
        h = new <init>("OFFLINE_MODE", 7);
        i = new <init>("SYNC_NOT_ALLOWED", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private A(String s, int k)
    {
        super(s, k);
    }
}
