// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.model;

import com.pinterest.schemas.invites.InviteObject;

public class SendableObject
{

    public static final int TYPE_BOARD = 1;
    public static final int TYPE_PIN = 0;
    public static final int TYPE_USER = 2;
    private int type;
    private String uid;

    public SendableObject(String s, int i)
    {
        uid = s;
        type = i;
    }

    public InviteObject getInviteObject()
    {
        switch (type)
        {
        default:
            return InviteObject.NONE;

        case 0: // '\0'
            return InviteObject.PIN;

        case 1: // '\001'
            return InviteObject.BOARD;

        case 2: // '\002'
            return InviteObject.PINNER;
        }
    }

    public int getType()
    {
        return type;
    }

    public String getUid()
    {
        return uid;
    }

    public boolean isBoard()
    {
        return type == 1;
    }

    public boolean isPin()
    {
        return type == 0;
    }

    public boolean isUser()
    {
        return type == 2;
    }
}
