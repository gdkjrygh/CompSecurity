// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;


public final class x extends Enum
{

    private static final x $VALUES[];
    public static final x ALL;
    public static final x FAVORITE_FRIENDS;
    public static final x TOP_FRIENDS;

    private x(String s, int i)
    {
        super(s, i);
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(com/facebook/contacts/server/x, s);
    }

    public static x[] values()
    {
        return (x[])$VALUES.clone();
    }

    static 
    {
        TOP_FRIENDS = new x("TOP_FRIENDS", 0);
        FAVORITE_FRIENDS = new x("FAVORITE_FRIENDS", 1);
        ALL = new x("ALL", 2);
        $VALUES = (new x[] {
            TOP_FRIENDS, FAVORITE_FRIENDS, ALL
        });
    }
}
