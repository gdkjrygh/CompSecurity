// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookSdk;

public final class offset extends Enum
{

    private static final AppInvite $VALUES[];
    public static final AppInvite AppGroupCreate;
    public static final AppInvite AppGroupJoin;
    public static final AppInvite AppInvite;
    public static final AppInvite GameRequest;
    public static final AppInvite Like;
    public static final AppInvite Login;
    public static final AppInvite Message;
    public static final AppInvite Share;
    private final int offset;

    public static offset valueOf(String s)
    {
        return (offset)Enum.valueOf(com/facebook/internal/CallbackManagerImpl$RequestCodeOffset, s);
    }

    public static offset[] values()
    {
        return (offset[])$VALUES.clone();
    }

    public int toRequestCode()
    {
        return FacebookSdk.getCallbackRequestCodeOffset() + offset;
    }

    static 
    {
        Login = new <init>("Login", 0, 0);
        Share = new <init>("Share", 1, 1);
        Message = new <init>("Message", 2, 2);
        Like = new <init>("Like", 3, 3);
        GameRequest = new <init>("GameRequest", 4, 4);
        AppGroupCreate = new <init>("AppGroupCreate", 5, 5);
        AppGroupJoin = new <init>("AppGroupJoin", 6, 6);
        AppInvite = new <init>("AppInvite", 7, 7);
        $VALUES = (new .VALUES[] {
            Login, Share, Message, Like, GameRequest, AppGroupCreate, AppGroupJoin, AppInvite
        });
    }

    private A(String s, int i, int j)
    {
        super(s, i);
        offset = j;
    }
}
