// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


public final class aj extends Enum
{

    private static final aj $VALUES[];
    public static final aj FAILED_TO_SEND;
    public static final aj FRIEND_INSTALL;
    public static final aj LOGGED_OUT;
    public static final aj NEW_BUILD;
    public static final aj NEW_MESSAGE;
    public static final aj READ_THREAD;

    private aj(String s, int i)
    {
        super(s, i);
    }

    public static aj valueOf(String s)
    {
        return (aj)Enum.valueOf(com/facebook/orca/notify/aj, s);
    }

    public static aj[] values()
    {
        return (aj[])$VALUES.clone();
    }

    static 
    {
        NEW_MESSAGE = new aj("NEW_MESSAGE", 0);
        LOGGED_OUT = new aj("LOGGED_OUT", 1);
        FRIEND_INSTALL = new aj("FRIEND_INSTALL", 2);
        FAILED_TO_SEND = new aj("FAILED_TO_SEND", 3);
        READ_THREAD = new aj("READ_THREAD", 4);
        NEW_BUILD = new aj("NEW_BUILD", 5);
        $VALUES = (new aj[] {
            NEW_MESSAGE, LOGGED_OUT, FRIEND_INSTALL, FAILED_TO_SEND, READ_THREAD, NEW_BUILD
        });
    }
}
