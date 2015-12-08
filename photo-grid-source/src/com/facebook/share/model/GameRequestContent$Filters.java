// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;


public final class _cls9 extends Enum
{

    private static final APP_NON_USERS $VALUES[];
    public static final APP_NON_USERS APP_NON_USERS;
    public static final APP_NON_USERS APP_USERS;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/facebook/share/model/GameRequestContent$Filters, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        APP_USERS = new <init>("APP_USERS", 0);
        APP_NON_USERS = new <init>("APP_NON_USERS", 1);
        $VALUES = (new .VALUES[] {
            APP_USERS, APP_NON_USERS
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
