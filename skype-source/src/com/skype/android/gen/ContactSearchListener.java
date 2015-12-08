// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.ContactSearch;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class ContactSearchListener
    implements com.skype.ContactSearch.ContactSearchIListener, com.skype.ObjectInterface.ObjectInterfaceIListener
{
    public static class OnNewResult
    {

        private int _contactObjectID;
        private int _rankValue;
        private ContactSearch _sender;

        public int getContactObjectID()
        {
            return _contactObjectID;
        }

        public int getRankValue()
        {
            return _rankValue;
        }

        public ContactSearch getSender()
        {
            return _sender;
        }

        public OnNewResult(ContactSearch contactsearch, int i, int j)
        {
            _sender = contactsearch;
            _contactObjectID = i;
            _rankValue = j;
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

    public ContactSearchListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onNewResult(ContactSearch contactsearch, int i, int j)
    {
        contactsearch = new OnNewResult(contactsearch, i, j);
        eventBus.a(contactsearch);
    }

    public void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        objectinterface = new OnPropertyChange(objectinterface, propkey);
        eventBus.a(objectinterface);
    }
}
