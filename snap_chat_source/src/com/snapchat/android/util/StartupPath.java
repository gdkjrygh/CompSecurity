// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


public final class StartupPath extends Enum
{

    private static final StartupPath $VALUES[];
    public static final StartupPath FROM_BACKGROUNDED_STATE;
    public static final StartupPath FROM_DESTROYED_STATE;
    public static final StartupPath FROM_KILLED_STATE;
    public static final StartupPath UNKNOWN;

    private StartupPath(String s, int i)
    {
        super(s, i);
    }

    public static StartupPath valueOf(String s)
    {
        return (StartupPath)Enum.valueOf(com/snapchat/android/util/StartupPath, s);
    }

    public static StartupPath[] values()
    {
        return (StartupPath[])$VALUES.clone();
    }

    static 
    {
        FROM_KILLED_STATE = new StartupPath("FROM_KILLED_STATE", 0);
        FROM_DESTROYED_STATE = new StartupPath("FROM_DESTROYED_STATE", 1);
        FROM_BACKGROUNDED_STATE = new StartupPath("FROM_BACKGROUNDED_STATE", 2);
        UNKNOWN = new StartupPath("UNKNOWN", 3);
        $VALUES = (new StartupPath[] {
            FROM_KILLED_STATE, FROM_DESTROYED_STATE, FROM_BACKGROUNDED_STATE, UNKNOWN
        });
    }
}
