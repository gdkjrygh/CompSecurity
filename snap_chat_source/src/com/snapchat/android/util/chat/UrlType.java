// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;


public final class UrlType extends Enum
{

    private static final UrlType $VALUES[];
    public static final UrlType LINK;
    public static final UrlType MAP;
    public static final UrlType TEL;

    private UrlType(String s, int i)
    {
        super(s, i);
    }

    public static UrlType valueOf(String s)
    {
        return (UrlType)Enum.valueOf(com/snapchat/android/util/chat/UrlType, s);
    }

    public static UrlType[] values()
    {
        return (UrlType[])$VALUES.clone();
    }

    static 
    {
        MAP = new UrlType("MAP", 0);
        LINK = new UrlType("LINK", 1);
        TEL = new UrlType("TEL", 2);
        $VALUES = (new UrlType[] {
            MAP, LINK, TEL
        });
    }
}
