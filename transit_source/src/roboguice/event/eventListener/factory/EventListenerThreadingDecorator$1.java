// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event.eventListener.factory;

import roboguice.event.EventThread;

// Referenced classes of package roboguice.event.eventListener.factory:
//            EventListenerThreadingDecorator

static class 
{

    static final int $SwitchMap$roboguice$event$EventThread[];

    static 
    {
        $SwitchMap$roboguice$event$EventThread = new int[EventThread.values().length];
        try
        {
            $SwitchMap$roboguice$event$EventThread[EventThread.UI.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$roboguice$event$EventThread[EventThread.BACKGROUND.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
