// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class ContactListener
    implements com.skype.Contact.ContactIListener, com.skype.ObjectInterface.ObjectInterfaceIListener
{
    public static class OnPropertyChange
    {

        private PROPKEY _propKey;
        private ObjectInterface _sender;

        public PROPKEY getPropKey()
        {
            return _propKey;
        }

        public ObjectInterface getSender()
        {
            return _sender;
        }

        public OnPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
        {
            _sender = objectinterface;
            _propKey = propkey;
        }
    }


    EventBus eventBus;

    public ContactListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        objectinterface = new OnPropertyChange(objectinterface, propkey);
        eventBus.a(objectinterface);
    }
}
