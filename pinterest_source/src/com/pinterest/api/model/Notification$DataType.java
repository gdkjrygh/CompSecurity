// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.utils.PStringUtils;

public final class  extends Enum
{

    private static final PIN_COMMENT $VALUES[];
    public static final PIN_COMMENT BOARD;
    public static final PIN_COMMENT DATE;
    public static final PIN_COMMENT PIN;
    public static final PIN_COMMENT PIN_COMMENT;
    public static final PIN_COMMENT TEMPLATE;
    public static final PIN_COMMENT USER;

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

    public static erCase valueOf(String s)
    {
        return (erCase)Enum.valueOf(com/pinterest/api/model/Notification$DataType, s);
    }

    public static erCase[] values()
    {
        return (erCase[])$VALUES.clone();
    }

    static 
    {
        PIN = new <init>("PIN", 0);
        BOARD = new <init>("BOARD", 1);
        USER = new <init>("USER", 2);
        TEMPLATE = new <init>("TEMPLATE", 3);
        DATE = new <init>("DATE", 4);
        PIN_COMMENT = new <init>("PIN_COMMENT", 5);
        $VALUES = (new .VALUES[] {
            PIN, BOARD, USER, TEMPLATE, DATE, PIN_COMMENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
