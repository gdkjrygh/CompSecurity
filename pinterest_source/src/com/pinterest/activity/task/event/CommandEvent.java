// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.event;


public class CommandEvent
{

    public static final int CONFIRM_EMAIL = 1;
    public static final int CONNECT_FACEBOOK = 4;
    public static final int NO_OP = 0;
    public static final int RESET_PASSWORD = 2;
    public static final int START_NUX = 5;
    public static final int TYPE_COMMAND = 0;
    public static final int TYPE_HOME_CONTROL = 2;
    public static final int TYPE_NAVIGATION = 1;
    public static final int UNDO_REBUILD_FEED = 6;
    public static final int UPLOAD_CONTACTS = 3;
    private int _id;
    private int _type;

    public CommandEvent(int i, int j)
    {
        _type = 0;
        _id = 0;
        _type = i;
        _id = j;
    }

    public int getId()
    {
        return _id;
    }

    public int getType()
    {
        return _type;
    }
}
