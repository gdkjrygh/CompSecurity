// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.gesture;


public interface SwipeListener
{
    public static final class Direction extends Enum
    {

        private static final Direction $VALUES[];
        public static final Direction DOWN;
        public static final Direction LEFT;
        public static final Direction RIGHT;
        public static final Direction TOP;

        public static Direction valueOf(String s)
        {
            return (Direction)Enum.valueOf(com/snapchat/android/gesture/SwipeListener$Direction, s);
        }

        public static Direction[] values()
        {
            return (Direction[])$VALUES.clone();
        }

        static 
        {
            LEFT = new Direction("LEFT", 0);
            RIGHT = new Direction("RIGHT", 1);
            TOP = new Direction("TOP", 2);
            DOWN = new Direction("DOWN", 3);
            $VALUES = (new Direction[] {
                LEFT, RIGHT, TOP, DOWN
            });
        }

        private Direction(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a(Direction direction);
}
