// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            AppEventsLogger

private static final class  extends Enum
{

    public static final EAGER_FLUSHING_EVENT EAGER_FLUSHING_EVENT;
    private static final EAGER_FLUSHING_EVENT ENUM$VALUES[];
    public static final EAGER_FLUSHING_EVENT EVENT_THRESHOLD;
    public static final EAGER_FLUSHING_EVENT EXPLICIT;
    public static final EAGER_FLUSHING_EVENT PERSISTED_EVENTS;
    public static final EAGER_FLUSHING_EVENT SESSION_CHANGE;
    public static final EAGER_FLUSHING_EVENT TIMER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/AppEventsLogger$FlushReason, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        EXPLICIT = new <init>("EXPLICIT", 0);
        TIMER = new <init>("TIMER", 1);
        SESSION_CHANGE = new <init>("SESSION_CHANGE", 2);
        PERSISTED_EVENTS = new <init>("PERSISTED_EVENTS", 3);
        EVENT_THRESHOLD = new <init>("EVENT_THRESHOLD", 4);
        EAGER_FLUSHING_EVENT = new <init>("EAGER_FLUSHING_EVENT", 5);
        ENUM$VALUES = (new ENUM.VALUES[] {
            EXPLICIT, TIMER, SESSION_CHANGE, PERSISTED_EVENTS, EVENT_THRESHOLD, EAGER_FLUSHING_EVENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
