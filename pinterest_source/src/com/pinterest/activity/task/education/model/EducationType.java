// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.model;


public final class EducationType extends Enum
{

    private static final EducationType $VALUES[];
    public static final EducationType LIVE;
    public static final EducationType STATIC;

    private EducationType(String s, int i)
    {
        super(s, i);
    }

    public static EducationType valueOf(String s)
    {
        return (EducationType)Enum.valueOf(com/pinterest/activity/task/education/model/EducationType, s);
    }

    public static EducationType[] values()
    {
        return (EducationType[])$VALUES.clone();
    }

    static 
    {
        LIVE = new EducationType("LIVE", 0);
        STATIC = new EducationType("STATIC", 1);
        $VALUES = (new EducationType[] {
            LIVE, STATIC
        });
    }
}
