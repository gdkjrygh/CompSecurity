// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.ContactGroup;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class ContactGroupListener
    implements com.skype.ContactGroup.ContactGroupIListener, com.skype.ObjectInterface.ObjectInterfaceIListener
{
    public static class OnChange
    {

        private int _contactObjectID;
        private ContactGroup _sender;

        public int getContactObjectID()
        {
            return _contactObjectID;
        }

        public ContactGroup getSender()
        {
            return _sender;
        }

        public OnChange(ContactGroup contactgroup, int i)
        {
            _sender = contactgroup;
            _contactObjectID = i;
        }
    }

    public static class OnChangeConversation
    {

        private int _conversationObjectID;
        private ContactGroup _sender;

        public int getConversationObjectID()
        {
            return _conversationObjectID;
        }

        public ContactGroup getSender()
        {
            return _sender;
        }

        public OnChangeConversation(ContactGroup contactgroup, int i)
        {
            _sender = contactgroup;
            _conversationObjectID = i;
        }
    }

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

    public ContactGroupListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onChange(ContactGroup contactgroup, int i)
    {
        contactgroup = new OnChange(contactgroup, i);
        eventBus.a(contactgroup);
    }

    public void onChangeConversation(ContactGroup contactgroup, int i)
    {
        contactgroup = new OnChangeConversation(contactgroup, i);
        eventBus.a(contactgroup);
    }

    public void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        objectinterface = new OnPropertyChange(objectinterface, propkey);
        eventBus.a(objectinterface);
    }
}
