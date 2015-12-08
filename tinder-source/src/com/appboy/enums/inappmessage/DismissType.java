// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums.inappmessage;


public final class DismissType extends Enum
{

    public static final DismissType AUTO_DISMISS;
    public static final DismissType MANUAL;
    public static final DismissType SWIPE;
    private static final DismissType a[];

    private DismissType(String s, int i)
    {
        super(s, i);
    }

    public static DismissType valueOf(String s)
    {
        return (DismissType)Enum.valueOf(com/appboy/enums/inappmessage/DismissType, s);
    }

    public static DismissType[] values()
    {
        return (DismissType[])a.clone();
    }

    static 
    {
        AUTO_DISMISS = new DismissType("AUTO_DISMISS", 0);
        SWIPE = new DismissType("SWIPE", 1);
        MANUAL = new DismissType("MANUAL", 2);
        a = (new DismissType[] {
            AUTO_DISMISS, SWIPE, MANUAL
        });
    }
}
