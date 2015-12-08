// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;


public final class PlacementInformation
{
    public static final class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode DELETE;
        public static final Mode INSERT;
        public static final Mode MARK;
        public static final Mode REPLACE;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/adobe/mediacore/timeline/advertising/PlacementInformation$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            INSERT = new Mode("INSERT", 0);
            DELETE = new Mode("DELETE", 1);
            REPLACE = new Mode("REPLACE", 2);
            MARK = new Mode("MARK", 3);
            $VALUES = (new Mode[] {
                INSERT, DELETE, REPLACE, MARK
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type CUSTOM_TIME_RANGES;
        public static final Type MID_ROLL;
        public static final Type POST_ROLL;
        public static final Type PRE_ROLL;
        public static final Type SERVER_MAP;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/adobe/mediacore/timeline/advertising/PlacementInformation$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            PRE_ROLL = new Type("PRE_ROLL", 0);
            MID_ROLL = new Type("MID_ROLL", 1);
            POST_ROLL = new Type("POST_ROLL", 2);
            SERVER_MAP = new Type("SERVER_MAP", 3);
            CUSTOM_TIME_RANGES = new Type("CUSTOM_TIME_RANGES", 4);
            $VALUES = (new Type[] {
                PRE_ROLL, MID_ROLL, POST_ROLL, SERVER_MAP, CUSTOM_TIME_RANGES
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int UNKNOWN_DURATION = -1;
    private final long _duration;
    private final Mode _mode;
    private final long _time;
    private final Type _type;

    public PlacementInformation(Type type, long l, long l1)
    {
        _type = type;
        _mode = Mode.INSERT;
        _time = l;
        _duration = l1;
    }

    public PlacementInformation(Type type, Mode mode, long l, long l1)
    {
        _type = type;
        _mode = mode;
        _time = l;
        _duration = l1;
    }

    public long getDuration()
    {
        return _duration;
    }

    public Mode getMode()
    {
        return _mode;
    }

    public long getTime()
    {
        return _time;
    }

    public Type getType()
    {
        return _type;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append(" Object {");
        stringbuilder.append(" type=").append(_type);
        stringbuilder.append(" ,time=").append(_time);
        stringbuilder.append(" ,duration=").append(_duration);
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
