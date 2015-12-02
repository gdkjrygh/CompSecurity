// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;


public final class y extends Enum
{

    private static final y $VALUES[];
    public static final y ADD_MEMBERS;
    public static final y CREATE_THREAD;

    private y(String s, int i)
    {
        super(s, i);
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(com/facebook/orca/contacts/picker/y, s);
    }

    public static y[] values()
    {
        return (y[])$VALUES.clone();
    }

    static 
    {
        CREATE_THREAD = new y("CREATE_THREAD", 0);
        ADD_MEMBERS = new y("ADD_MEMBERS", 1);
        $VALUES = (new y[] {
            CREATE_THREAD, ADD_MEMBERS
        });
    }
}
