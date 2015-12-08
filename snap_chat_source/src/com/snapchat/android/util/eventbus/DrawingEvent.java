// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


public final class DrawingEvent
{
    public static final class DrawingEventType extends Enum
    {

        private static final DrawingEventType $VALUES[];
        public static final DrawingEventType COMPLETED_STROKE;
        public static final DrawingEventType STARTED_STROKE;

        public static DrawingEventType valueOf(String s)
        {
            return (DrawingEventType)Enum.valueOf(com/snapchat/android/util/eventbus/DrawingEvent$DrawingEventType, s);
        }

        public static DrawingEventType[] values()
        {
            return (DrawingEventType[])$VALUES.clone();
        }

        static 
        {
            COMPLETED_STROKE = new DrawingEventType("COMPLETED_STROKE", 0);
            STARTED_STROKE = new DrawingEventType("STARTED_STROKE", 1);
            $VALUES = (new DrawingEventType[] {
                COMPLETED_STROKE, STARTED_STROKE
            });
        }

        private DrawingEventType(String s, int i)
        {
            super(s, i);
        }
    }


    public final DrawingEventType mDrawingEventType;

    public DrawingEvent(DrawingEventType drawingeventtype)
    {
        mDrawingEventType = drawingeventtype;
    }
}
