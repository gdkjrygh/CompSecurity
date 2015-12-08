// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.utils.PStringUtils;

public final class  extends Enum
{

    private static final ARRAY $VALUES[];
    public static final ARRAY ARRAY;
    public static final ARRAY BOARD;
    public static final ARRAY COMMENT;
    public static final ARRAY PIN;
    public static final ARRAY USER;

    public static  parse(String s)
    {
        try
        {
            s = valueOf(PStringUtils.toEnumUpperCase(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/pinterest/api/model/NotificationTemplate$SubjectType, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    static 
    {
        PIN = new <init>("PIN", 0);
        USER = new <init>("USER", 1);
        BOARD = new <init>("BOARD", 2);
        COMMENT = new <init>("COMMENT", 3);
        ARRAY = new <init>("ARRAY", 4);
        $VALUES = (new .VALUES[] {
            PIN, USER, BOARD, COMMENT, ARRAY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
