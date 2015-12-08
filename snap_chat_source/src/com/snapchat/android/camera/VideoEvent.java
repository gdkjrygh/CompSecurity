// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;


public final class VideoEvent
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type MAX_DURATION_REACHED;
        public static final Type MAX_FILE_SIZE_REACHED;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/snapchat/android/camera/VideoEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            MAX_FILE_SIZE_REACHED = new Type("MAX_FILE_SIZE_REACHED", 0);
            MAX_DURATION_REACHED = new Type("MAX_DURATION_REACHED", 1);
            $VALUES = (new Type[] {
                MAX_FILE_SIZE_REACHED, MAX_DURATION_REACHED
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
