// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import gxi;

public final class value extends Enum
    implements gxi
{

    public static final e a;
    public static final e b;
    private static e c;
    private static e d;
    private static e e;
    private static final e f[];
    private final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/spotify/bouncer/proto/SocialStory$StoryType, s);
    }

    public static value[] values()
    {
        return (value[])f.clone();
    }

    public final int a()
    {
        return value;
    }

    static 
    {
        a = new <init>("FOLLOWED_PROFILE", 0, 0);
        c = new <init>("PUBLISHED_PLAYLIST", 1, 1);
        d = new <init>("FOLLOWED_PLAYLIST", 2, 2);
        b = new <init>("SHARED_URI", 3, 3);
        e = new <init>("LISTENED_TO_URI", 4, 4);
        f = (new f[] {
            a, c, d, b, e
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
