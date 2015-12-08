// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event;


public final class EventThread extends Enum
{

    private static final EventThread $VALUES[];
    public static final EventThread BACKGROUND;
    public static final EventThread CURRENT;
    public static final EventThread UI;

    private EventThread(String s, int i)
    {
        super(s, i);
    }

    public static EventThread valueOf(String s)
    {
        return (EventThread)Enum.valueOf(roboguice/event/EventThread, s);
    }

    public static EventThread[] values()
    {
        return (EventThread[])$VALUES.clone();
    }

    static 
    {
        CURRENT = new EventThread("CURRENT", 0);
        UI = new EventThread("UI", 1);
        BACKGROUND = new EventThread("BACKGROUND", 2);
        $VALUES = (new EventThread[] {
            CURRENT, UI, BACKGROUND
        });
    }
}
