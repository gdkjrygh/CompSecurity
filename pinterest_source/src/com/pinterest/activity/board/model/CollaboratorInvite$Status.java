// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.model;

import com.pinterest.kit.utils.PStringUtils;

public final class  extends Enum
{

    private static final PENDING_APPROVAL $VALUES[];
    public static final PENDING_APPROVAL ACCEPTED;
    public static final PENDING_APPROVAL DENIED;
    public static final PENDING_APPROVAL NEW;
    public static final PENDING_APPROVAL OWNER;
    public static final PENDING_APPROVAL PENDING_APPROVAL;

    public static  parseString(String s,  )
    {
        try
        {
            s = valueOf(PStringUtils.toEnumUpperCase(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ;
        }
        return s;
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/pinterest/activity/board/model/CollaboratorInvite$Status, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    static 
    {
        ACCEPTED = new <init>("ACCEPTED", 0);
        NEW = new <init>("NEW", 1);
        DENIED = new <init>("DENIED", 2);
        OWNER = new <init>("OWNER", 3);
        PENDING_APPROVAL = new <init>("PENDING_APPROVAL", 4);
        $VALUES = (new .VALUES[] {
            ACCEPTED, NEW, DENIED, OWNER, PENDING_APPROVAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
