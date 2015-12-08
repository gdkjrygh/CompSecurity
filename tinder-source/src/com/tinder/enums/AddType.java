// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class AddType extends Enum
{

    private static final AddType $VALUES[];
    public static final AddType NEW;
    public static final AddType NEWER;
    public static final AddType OLD;

    private AddType(String s, int i)
    {
        super(s, i);
    }

    public static AddType valueOf(String s)
    {
        return (AddType)Enum.valueOf(com/tinder/enums/AddType, s);
    }

    public static AddType[] values()
    {
        return (AddType[])$VALUES.clone();
    }

    static 
    {
        OLD = new AddType("OLD", 0);
        NEW = new AddType("NEW", 1);
        NEWER = new AddType("NEWER", 2);
        $VALUES = (new AddType[] {
            OLD, NEW, NEWER
        });
    }
}
