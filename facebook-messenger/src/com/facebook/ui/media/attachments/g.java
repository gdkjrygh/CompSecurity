// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.attachments;


public final class g extends Enum
{

    private static final g $VALUES[];
    public static final g AUDIO;
    public static final g PHOTO;
    public static final g TEXT;
    public static final g VIDEO;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/ui/media/attachments/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        PHOTO = new g("PHOTO", 0);
        VIDEO = new g("VIDEO", 1);
        AUDIO = new g("AUDIO", 2);
        TEXT = new g("TEXT", 3);
        $VALUES = (new g[] {
            PHOTO, VIDEO, AUDIO, TEXT
        });
    }
}
