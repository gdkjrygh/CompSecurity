// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookapi;


public final class FacebookApiEndpoints extends Enum
{

    private static final FacebookApiEndpoints $VALUES[];
    public static final FacebookApiEndpoints ME_FRIEND_PICTURES;
    private final String fields;
    private final String path;

    private FacebookApiEndpoints(String s, int i, String s1, String s2)
    {
        super(s, i);
        path = s1;
        fields = s2;
    }

    public static FacebookApiEndpoints valueOf(String s)
    {
        return (FacebookApiEndpoints)Enum.valueOf(com/soundcloud/android/facebookapi/FacebookApiEndpoints, s);
    }

    public static FacebookApiEndpoints[] values()
    {
        return (FacebookApiEndpoints[])$VALUES.clone();
    }

    public final String getFields()
    {
        return fields;
    }

    public final String getPath()
    {
        return path;
    }

    static 
    {
        ME_FRIEND_PICTURES = new FacebookApiEndpoints("ME_FRIEND_PICTURES", 0, "/me/friends", "picture.type(normal)");
        $VALUES = (new FacebookApiEndpoints[] {
            ME_FRIEND_PICTURES
        });
    }
}
