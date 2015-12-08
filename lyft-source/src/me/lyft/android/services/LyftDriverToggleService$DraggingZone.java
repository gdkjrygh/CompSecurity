// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;


final class  extends Enum
{

    private static final DRAG_TO_REMOVE $VALUES[];
    public static final DRAG_TO_REMOVE DRAG_STARTED;
    public static final DRAG_TO_REMOVE DRAG_TO_REMOVE;
    public static final DRAG_TO_REMOVE DRAG_TO_SWITCH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/services/LyftDriverToggleService$DraggingZone, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DRAG_STARTED = new <init>("DRAG_STARTED", 0);
        DRAG_TO_SWITCH = new <init>("DRAG_TO_SWITCH", 1);
        DRAG_TO_REMOVE = new <init>("DRAG_TO_REMOVE", 2);
        $VALUES = (new .VALUES[] {
            DRAG_STARTED, DRAG_TO_SWITCH, DRAG_TO_REMOVE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
