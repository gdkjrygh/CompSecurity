// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


final class f extends Enum
{

    public static final f LOADED;
    public static final f LOADING;
    public static final f PLAYED;
    private static final f a[];

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/mopub/mobileads/f, s);
    }

    public static f[] values()
    {
        return (f[])a.clone();
    }

    static 
    {
        LOADING = new f("LOADING", 0);
        LOADED = new f("LOADED", 1);
        PLAYED = new f("PLAYED", 2);
        a = (new f[] {
            LOADING, LOADED, PLAYED
        });
    }
}
