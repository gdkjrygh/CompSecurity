// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.event;

import com.pinterest.activity.task.education.model.Education;

public class EducationEvent
{

    private Education _education;
    private Type _type;

    public EducationEvent(Type type)
    {
        _type = type;
    }

    public EducationEvent(Education education)
    {
        _type = Type.START;
        _education = education;
    }

    public Education getEducation()
    {
        return _education;
    }

    public Type getType()
    {
        return _type;
    }

    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type DISMISS;
        public static final Type DISMISS_UI;
        public static final Type NEXT;
        public static final Type START;
        public static final Type SUSPEND;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/pinterest/activity/task/education/event/EducationEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            START = new Type("START", 0);
            NEXT = new Type("NEXT", 1);
            DISMISS = new Type("DISMISS", 2);
            DISMISS_UI = new Type("DISMISS_UI", 3);
            SUSPEND = new Type("SUSPEND", 4);
            $VALUES = (new Type[] {
                START, NEXT, DISMISS, DISMISS_UI, SUSPEND
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
