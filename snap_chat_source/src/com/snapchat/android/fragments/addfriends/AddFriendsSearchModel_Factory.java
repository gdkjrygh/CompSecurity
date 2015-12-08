// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import afw;
import wQ;

public final class AddFriendsSearchModel_Factory extends Enum
    implements afw
{

    private static final AddFriendsSearchModel_Factory $VALUES[];
    public static final AddFriendsSearchModel_Factory INSTANCE;

    private AddFriendsSearchModel_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static AddFriendsSearchModel_Factory valueOf(String s)
    {
        return (AddFriendsSearchModel_Factory)Enum.valueOf(com/snapchat/android/fragments/addfriends/AddFriendsSearchModel_Factory, s);
    }

    public static AddFriendsSearchModel_Factory[] values()
    {
        return (AddFriendsSearchModel_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final wQ get()
    {
        return new wQ();
    }

    static 
    {
        INSTANCE = new AddFriendsSearchModel_Factory("INSTANCE");
        $VALUES = (new AddFriendsSearchModel_Factory[] {
            INSTANCE
        });
    }
}
