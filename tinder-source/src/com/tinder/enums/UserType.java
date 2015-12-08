// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class UserType extends Enum
{

    private static final UserType $VALUES[];
    public static final UserType MATCH;
    public static final UserType ME;
    public static final UserType REC;

    private UserType(String s, int i)
    {
        super(s, i);
    }

    public static UserType valueOf(String s)
    {
        return (UserType)Enum.valueOf(com/tinder/enums/UserType, s);
    }

    public static UserType[] values()
    {
        return (UserType[])$VALUES.clone();
    }

    static 
    {
        REC = new UserType("REC", 0);
        MATCH = new UserType("MATCH", 1);
        ME = new UserType("ME", 2);
        $VALUES = (new UserType[] {
            REC, MATCH, ME
        });
    }
}
