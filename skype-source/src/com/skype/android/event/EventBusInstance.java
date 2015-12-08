// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.event;


// Referenced classes of package com.skype.android.event:
//            EventBus

public class EventBusInstance
{

    private static EventBus a = new EventBus();

    private EventBusInstance()
    {
    }

    public static EventBus a()
    {
        return a;
    }

}
