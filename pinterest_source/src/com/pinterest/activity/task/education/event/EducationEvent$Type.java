// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.event;


public final class  extends Enum
{

    private static final SUSPEND $VALUES[];
    public static final SUSPEND DISMISS;
    public static final SUSPEND DISMISS_UI;
    public static final SUSPEND NEXT;
    public static final SUSPEND START;
    public static final SUSPEND SUSPEND;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/task/education/event/EducationEvent$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        START = new <init>("START", 0);
        NEXT = new <init>("NEXT", 1);
        DISMISS = new <init>("DISMISS", 2);
        DISMISS_UI = new <init>("DISMISS_UI", 3);
        SUSPEND = new <init>("SUSPEND", 4);
        $VALUES = (new .VALUES[] {
            START, NEXT, DISMISS, DISMISS_UI, SUSPEND
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
