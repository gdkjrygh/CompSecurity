// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Listener;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class ListenerListener
    implements com.skype.Listener.ListenerIIListener
{
    public static class OnChange
    {

        private String _key;
        private Listener _sender;

        public String getKey()
        {
            return _key;
        }

        public Listener getSender()
        {
            return _sender;
        }

        public OnChange(Listener listener, String s)
        {
            _sender = listener;
            _key = s;
        }
    }


    EventBus eventBus;

    public ListenerListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onChange(Listener listener, String s)
    {
        listener = new OnChange(listener, s);
        eventBus.a(listener);
    }
}
