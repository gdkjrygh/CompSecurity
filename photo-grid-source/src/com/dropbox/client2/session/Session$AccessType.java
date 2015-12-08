// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;


public final class urlPart extends Enum
{

    private static final AUTO $VALUES[];
    public static final AUTO APP_FOLDER;
    public static final AUTO AUTO;
    public static final AUTO DROPBOX;
    private final String urlPart;

    public static urlPart valueOf(String s)
    {
        return (urlPart)Enum.valueOf(com/dropbox/client2/session/Session$AccessType, s);
    }

    public static urlPart[] values()
    {
        return (urlPart[])$VALUES.clone();
    }

    public final String toString()
    {
        return urlPart;
    }

    static 
    {
        DROPBOX = new <init>("DROPBOX", 0, "dropbox");
        APP_FOLDER = new <init>("APP_FOLDER", 1, "sandbox");
        AUTO = new <init>("AUTO", 2, "auto");
        $VALUES = (new .VALUES[] {
            DROPBOX, APP_FOLDER, AUTO
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        urlPart = s1;
    }
}
